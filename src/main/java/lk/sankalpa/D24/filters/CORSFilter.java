package lk.sankalpa.D24.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class CORSFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        System.out.println("CrossFilter");
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        // Allow requests from any origin
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");

        // Allow specific HTTP methods (e.g., GET, POST, OPTIONS, etc.)
        httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, OPTIONS");

        // Allow specific HTTP headers
        httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        httpResponse.setHeader("Access-Control-Expose-Headers", "Content-Type");
        // Enable CORS credentials (if required, set to "true")
        httpResponse.setHeader("Access-Control-Allow-Credentials", "false");

        // Set the max age for preflight requests (cache the options response)
        httpResponse.setHeader("Access-Control-Max-Age", "3600");

        // Continue the filter chain
        chain.doFilter(request, httpResponse);
    }

    @Override
    public void destroy(){}
}

