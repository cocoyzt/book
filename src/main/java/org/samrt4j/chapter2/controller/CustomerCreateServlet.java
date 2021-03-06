package org.samrt4j.chapter2.controller;

import org.samrt4j.chapter2.model.Customer;
import org.samrt4j.chapter2.service.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/customer")
public class CustomerCreateServlet extends HttpServlet {

    private CustomerService customerService;

    @Override
    public void init() throws ServletException {
        customerService = new CustomerService();
    }

    /**
     * 进入 创建客户 界面
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.getCustomerList();
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("/WEB-INF/view/customer.jsp").forward(req, resp);
    }


    /**
     * 处理 创建客户 请求
     *
     * @param var1
     * @param var2
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest var1, HttpServletResponse var2) throws ServletException, IOException {
        //TODO
    }
}
