package com.example.authserver.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/authserver")
public class ClientIdResource {
    @GetMapping("")
    public String getClientIdResource(HttpServletRequest request) {
        //int clientCode = (Integer) request.getAttribute("userId");
        //List<Category> categories = categoryService.fetchAllCategories(userId);
        //return new ResponseEntity<>(categories, HttpStatus.OK);
        System.out.println("Hiiii");
        return "ClientID";
    }
}
