package br.com.jotabank.servlet;

import br.com.jotabank.model.Banco;
import br.com.jotabank.model.Conta;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "novaConta", value = "/novaConta")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String telefone = request.getParameter("telefone");

        Conta c1 = new Conta();
        c1.setNomeDoTitular(nome);
        c1.setCpf(cpf);
        c1.setTelefone(telefone);

        Banco banco = new Banco();
        banco.adiciona(c1);

        RequestDispatcher rq = request.getRequestDispatcher("/novaConta.jsp");
        request.setAttribute("conta", c1);
        rq.forward(request, response);

    }
}