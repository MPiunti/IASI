package UnicreditIASI.SpringMVC_JPA_REST.filters;


import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.filter.OncePerRequestFilter;

/**
 * Enabling CORS support  - Access-Control-Allow-Origin
 * @author zeroows@gmail.com
 * 
 * <code>
 	<!-- Add this to your web.xml to enable "CORS" -->
	<filter>
	  <filter-name>cors</filter-name>
	  <filter-class>com.elm.mb.rest.filters.CORSFilter</filter-class>
	</filter>
	  
	<filter-mapping>
	  <filter-name>cors</filter-name>
	  <url-pattern>/*</url-pattern>
	</filter-mapping>
 * </code>
 */
public class SimpleCORSFilter extends OncePerRequestFilter {
	private static final Log LOG = LogFactory.getLog(SimpleCORSFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		if (request.getHeader("Access-Control-Request-Method") != null && "OPTIONS".equals(request.getMethod())) {
			
			// CORS "pre-flight" request
			response.addHeader("Access-Control-Allow-Methods", "GET, POST, OPTIONS, PUT, DELETE");
			//response.addHeader("Access-Control-Allow-Credentials" ,"true");			
			//response.addHeader("Access-Control-Allow-Headers", "Authorization");			
            response.addHeader("Access-Control-Allow-Headers", "Content-Type");
			response.addHeader("Access-Control-Max-Age", "1");
			
			LOG.trace("Sending Headers with names: " + response.getHeaderNames() ) ;
		}
		
		filterChain.doFilter(request, response);
	}

}

//import java.io.IOException;
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.stereotype.Component;

//@Component
//public class SimpleCORSFilter implements Filter {
	

//	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) res;
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
//		response.setHeader("Access-Control-Max-Age", "3600");
//		response.setHeader("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
//		chain.doFilter(req, res);
//	}
//
//	public void init(FilterConfig filterConfig) {}
//
//	public void destroy() {}

//}