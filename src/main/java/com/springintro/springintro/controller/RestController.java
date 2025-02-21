/*Create a Rest Controller to demonstrate
the various HTTP Methods and respond
hello messages to the User. To begin
with show Hello from BridgeLabz
- Use GET Request Method
- Use CURL to demonstrate the REST API Call
- curl localhost:8080/hello -w "\n"*/
package com.springintro.springintro.controller;

import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping("/hello")
    public String getHello(){
        return "Hello from BridgeLabz";
    }

    @PostMapping("/hello")
    public String postHello(){
        return "Hello from BridgeLabz- Post";
    }
    @PutMapping("/hello")
    public String putHello(){
        return " Hello from BridgeLabz - Put";
    }

    @DeleteMapping("/hello")
    public String deleteHello() {
        return "Hello from BridgeLabz - Delete";
    }
}
