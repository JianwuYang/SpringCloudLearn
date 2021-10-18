package top.yangjianwu.eurekaclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    @Value("${message}")
    private String message;


    @GetMapping("/greeting")
    public String greeting(String name){
        return message + name;
    }
}
