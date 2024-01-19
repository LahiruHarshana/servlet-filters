package ijse.lk.servletfilter.api.servletfilter.filter;


import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "corsFilter", value = "/cors-filter")
public class CORSFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException {
        System.out.println("CORS Filterm: incoming request");
        chain.doFilter(req, res);
        System.out.println("CORS Filterm: outgoing response");

    }
}
