package control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entidade.Clientes;
import model.entidade.Donos;
import model.entidade.Funcionarios;

@WebServlet("/SvLogin")
public class SvLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String senha = request.getParameter("tsenha");
		String cpf = request.getParameter("tcpf");
		Donos d = new Donos();
		Funcionarios f = new Funcionarios();
		Clientes c = new Clientes();
		
		if(d.logar(cpf, senha)) {
			request.setAttribute("tipo", "d");
			request.getRequestDispatcher("indexLogado.html").forward(request, response);
		} else {
			if(f.logar(cpf, senha)) {
				request.setAttribute("tipo", "f");
				request.getRequestDispatcher("indexLogado.html").forward(request, response);
			} else {
				if(c.logar(cpf, senha)) {
					request.setAttribute("tipo", "c");
					request.getRequestDispatcher("indexLogado.html").forward(request, response);
				} else {
					request.setAttribute("tmensagem", "Erro, cheque seus dados.");
					request.setAttribute("cpf", cpf);
					request.setAttribute("senha", senha);
					request.getRequestDispatcher("entrar.jsp").forward(request, response);
				}
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
