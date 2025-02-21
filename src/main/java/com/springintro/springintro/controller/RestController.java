/*Create a Rest Controller to demonstrate
the various HTTP Methods and respond
hello messages to the User. To begin
with show Hello from BridgeLabz
- Use GET Request Method
- Use CURL to demonstrate the REST API Call
- curl localhost:8080/hello -w "\n"*/
package com.springintro.springintro.controller;

import com.springintro.springintro.dto.User;
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

   // query for get methods
    @GetMapping("/hello/query")
        public String getQueryHello(@RequestParam String name) {
            return "Hello " + name + " from Bridgelabz";
        }

        // param for get method
        @GetMapping("/hello/param/{name}")
        public String getparamHello(@PathVariable String name){
            return "Hello "+ name + " from Bridgelabz ";
        }
        // Post method for UC4
        @PostMapping("/hello/post")
        public String getPostHello(@RequestBody User user){

            return "Hello "+user.getFirstName()+" "+user.getLastName()+" from BridgeLabz ";
        }

}
