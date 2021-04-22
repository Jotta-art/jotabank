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
import java.util.List;

@WebServlet("/listaContas")
public class ListaContasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Banco banco = new Banco();
        List<Conta> contas = banco.getContas();

        request.setAttribute("contas", contas);

        RequestDispatcher rd = request.getRequestDispatcher("/listaContas.jsp");
        rd.forward(request, response);

    }
}
