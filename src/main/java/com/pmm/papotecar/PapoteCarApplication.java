package com.pmm.papotecar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.pmm.papotecar.controller", "com.pmm.papotecar.service" })
public class PapoteCarApplication {

    public static void main(String[] args) {
	SpringApplication.run(PapoteCarApplication.class, args);
    }

    // CORS

    // @Bean
    // FilterRegistrationBean<Filter>
    // corsFilter(@Value("${tagit.origin:http://localhost:9000}") String origin) {
    // return new FilterRegistrationBean<Filter>(new Filter() {
    // public void doFilter(ServletRequest req, ServletResponse res, FilterChain
    // chain)
    // throws IOException, ServletException {
    // HttpServletRequest request = (HttpServletRequest) req;
    // HttpServletResponse response = (HttpServletResponse) res;
    // String method = request.getMethod(); // this
    // // origin value could just as easily have come from a database
    // response.setHeader("Access-Control-Allow-Origin", origin);
    // response.setHeader("Access-Control-Allow-Methods",
    // "POST,GET,OPTIONS,DELETE");
    // response.setHeader("Access-Control-Max-Age", Long.toString(60 * 60));
    // response.setHeader("Access-Control-Allow-Credentials", "true");
    // response.setHeader("Access-Control-Allow-Headers",
    // "Origin,Accept,X-Requested-With,Content-Type,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
    // if ("OPTIONS".equals(method)) {
    // response.setStatus(HttpStatus.OK.value());
    // } else {
    // chain.doFilter(req, res);
    // }
    // }
    //
    // public void init(FilterConfig filterConfig) {
    // }
    //
    // public void destroy() {
    // }
    // });
    // }

}
