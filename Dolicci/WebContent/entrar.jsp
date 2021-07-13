<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alomos (Entrar)</title>
    <link rel="stylesheet" href="Estilo/estilo.css">
</head>
<body class="bodyconfig2" id="fundo" style="background-image: url(../Alomos/Imagens/fund3.png);">

    <!--Cabeçalho-->
    <header>
        <div id="box" class="cabecalho" style="z-index: 2;"> 
            <a href="index1.html"><img src="Fotos/Logo Dolicci.jpg" alt="" class="cabecalho-logo"></a>
            <nav>
                <span class="cabecalho-menu">
                    <a href="../Alomos/index.html" class="cabecalho-menu-opcoes"><span class="efeito-navbar">Home </span> </a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="../Alomos/fale_conosco_page.html" class="cabecalho-menu-opcoes"><span class="efeito-navbar">Produtos </span> </a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="../Alomos/sobre_nos_page.html" class="cabecalho-menu-opcoes"><span class="efeito-navbar">Sobre Nós </span> </a>&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="entrar.jsp" class="cabecalho-menu-opcoes" style="color: #DD9F32;"> <span class="efeito-navbar-entrar">Entrar <img src="../WebContent/Fotos/icon-cadeado.svg" width="10px" alt="" style="color: white;"></span> </a>&nbsp;&nbsp;&nbsp;&nbsp;
                </span>
            </nav>
        </div>
        <div class="cabecalho-linha-azul"></div>
    </header>

<!--Área do Login-->
    <div class="blocoesquerda">
        <span><img src="../Alomos/Imagens/gifpronnta.gif" width="100%" alt=""></span>
    </div>

    <div class="blocodireita">
        <div class="div-login" style="background-color: black;">
            <center><img class="div-login-logo" src="Fotos/Logo Dolicci.jpg"></center>
                <br>
         <form id="form1">
            <center><input type="text" name="cpf" id="cpf" onblur="verificar('nome')" placeholder="&nbsp;Seu CPF" value="<%= request.getAttribute("cpf")==null?"": request.getAttribute("cpf") %>"><span id="alerta1"></span></center> 
                <br>
            <center><input type="password" name="senha" id="senha" onblur="verificar('senha')" placeholder="&nbsp;Senha" value="<%= request.getAttribute("senha")==null?"": request.getAttribute("senha") %>"><span id="alerta2"></span></center>  
                <br>
            <center><input type="submit" value ="Entrar" formaction="SvLogin" formmethod="get"/></center>
                <br><center><div id="alerta3" name="tmensagem" value="<%= request.getAttribute("tmensagem")==null?"": request.getAttribute("tmensagem") %>">&nbsp;</div></center>
         </form>
            <div class="texto-ou">
                <hr class="barra-ou">OU
            </div>
                <br><br>
            <center><a class="link-facebook" href="https://pt-br.facebook.com/"><span class="texto-facebook"><span><img src="Fotos/icon-facebook.png" width="15px"> Entrar com o Facebook</span></center></a>
                <br>
            <div class="texto-esqueci"><a class="link-esqueci" href="../Alomos/esqueci_minha_senha.html">Esqueci a minha senha</a></div> 
        </div>

<!--Área Não tem uma conta-->
        <div class="div-nao-tem-conta">
            <h1 class="frase-naotem">Ainda não tem uma conta? <a class="bloco1-link" href="../Alomos/cadastro_page.html"><span class="efeito-underline">Cadastre-se</span></a></h1> 
        </div>
    </div>

<!--Pé da página-->
    <footer>
        <div class="pe"><br>
            <div class="pe-frase1">
                <a href="../Alomos/fale_conosco_page.html" class="link-pe"><span class="linha">Fale Conosco&nbsp;&nbsp;</span></a>
                <a href="" class="link-pe"><span class="linha">&nbsp;&nbsp;Política de Privacidade&nbsp;&nbsp;</span></a>
                <a href="../Alomos/trabalhe_conosco_page.html" class="link-pe"><span class="linha">&nbsp;&nbsp;Trabalhe Conosco&nbsp;&nbsp;</span></a>
                <a href="" class="link-pe"><span class="linha">&nbsp;&nbsp;Seja um Franqueado&nbsp;&nbsp;</span></a>
                <a href="" class="link-pe"><span class="linha">&nbsp;&nbsp;Dúvidas Frequentes&nbsp;&nbsp;</span></a>
                <span>&nbsp;&nbsp;Siga-Nos&nbsp; <sub><a href=""><img class="pe-img" src="Fotos/icon-face-white.png"></a>&nbsp;&nbsp;<a href=""><img class="pe-img" src="Fotos/icon-insta-white.png"></a></sub></span>
            </div>
                <hr class="pe-barra">
                <div class="pe-frase2">Rodovia Régis Bitencourt, Km 437, Ribeirão Vermelho, Registro, SP, CEP 11900-000 | CNPJ/MF 11.137.51/0406-41 IE 574.066.180.111</div>
        </div>
    </footer>
    <script>
        let temErro = 0; //Variavel que controla a existencia de erro nos campos

        function verificar(campo){
            switch(campo){
                case"nome":
                    let nome = document.getElementById("login").value;
                    let alertaNome = document.getElementById("alerta1");

                    //Verifica se o campo está vazio ou se tem menos de 5 caracteres
                    if(nome == "" || nome.length < 5){
                        document.getElementById("login").style.borderColor = "red";
                        document.getElementById("login").style.borderWidth = "2px";
                        temErro = 1;
                    }
                    else{
                        //Verifica se tem duplo espacos no nome
                        if(nome.includes(" ")){ //Torna o campo vermelho indicando erro
                            document.getElementById("login").style.borderColor = "red";
                            document.getElementById("login").style.borderWidth = "2px";
                            temErro = 1;
                        }
                        else{ //Deixa o campo normal
                            document.getElementById("login").style.borderColor = "";
                            document.getElementById("login").style.borderWidth = "1px";
                            temErro = 0;
                        }
                    }
                break;

                case"senha":
                    let senha = document.getElementById("senha").value;

                    //Confere se o campo senha está vazio ou se tem menos de 5 caracteres
                    if(senha == "" || senha.length < 5){
                        document.getElementById("senha").style.borderColor = "red";
                        document.getElementById("senha").style.borderWidth = "2px";
                        temErro = 1;
                    }
                    else{
                        document.getElementById("senha").style.borderColor = "";
                        document.getElementById("senha").style.borderWidth = "1px";
                        temErro = 0;
                    }
                break;
            }
        }

        function entrar(){
            //Confere se tem algum erro nos campos e mostra um alerta
            if(temErro == 1){
                document.getElementById("alerta3").style.color = "red";
                document.getElementById("alerta3").innerHTML = "Corrija o campo inválido para prosseguir";
            }
            else{
                document.getElementById("alerta3").style.color = "";
                document.getElementById("alerta3").innerHTML = "&nbsp";
            }
        }
        
    </script>
</body>
</html>