package pl.stepwise.versioning.controller;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping
    public void handleRootRequest(HttpServletResponse response) throws IOException {
        response.sendRedirect("/application/info");
    }
}
