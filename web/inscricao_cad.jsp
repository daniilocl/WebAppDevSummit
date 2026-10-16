<%-- 
    Document   : inscricao_cad
    Created on : 15 de out. de 2026, 22:24:35
    Author     : daniilocl
--%>

<%@page import="model.Inscricao"%>
<%@page import="model.DAO.InscricaoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>DEV SUMMIT - Web App</title>
    </head>
    <body>
        <h2>Controle de Inscrição (CTRL)</h2>
        <%
            request.setCharacterEncoding("UTF-8");

            Inscricao inscricao = new Inscricao(
                    0,
                    request.getParameter("nome"),
                    request.getParameter("sobrenome"),
                    request.getParameter("email"),
                    request.getParameter("telefone"),
                    request.getParameter("empresa"),
                    request.getParameter("cargo"),
                    request.getParameter("setor"),
                    request.getParameter("nacionalidade"),
                    request.getParameter("cidade"),
                    request.getParameter("tipo_documento"),
                    request.getParameter("numero_documento"),
                    request.getParameter("como_conheceu")
            );

            InscricaoDAO inscricaoDAO = new InscricaoDAO();

            if (inscricaoDAO.cadastrar(inscricao)) {
                System.out.println("Inscrição inserida com sucesso!!!");
            } else {
                System.out.println("Inscrição NÃO cadastrada");
            }

            out.println("<br> Nome......: " + inscricao.getNome());
            out.println("<br> Sobrenome......: " + inscricao.getSobrenome());
            out.println("<br> E-mail......: " + inscricao.getEmailCorporativo());
            out.println("<br> Telefone......: " + inscricao.getTelefoneCelular());
            out.println("<br> Empresa......: " + inscricao.getNomeEmpresa());
            out.println("<br> Cargo......: " + inscricao.getCargo());
            out.println("<br> Setor......: " + inscricao.getSetor());
            out.println("<br> Nacionalidade......: " + inscricao.getNacionalidade());
            out.println("<br> Cidade......: " + inscricao.getCidade());
            out.println("<br> Tipo Documento......: " + inscricao.getTipoDocumento());
            out.println("<br> Número Documento......: " + inscricao.getNumeroDocumento());
            out.println("<br> Como Conheceu......: " + inscricao.getComoConheceu());
        %>
    </body>
</html>
