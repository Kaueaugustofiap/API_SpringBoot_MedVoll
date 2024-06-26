package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Para dizer que é uma API Rest controller
@RequestMapping("/hello") //Para dizer qual é a URL que esse controller vai responder
public class HelloController {

        @GetMapping //Dizer que é do tipo GET
        public String olaMundo(){
            return "Hello World Spring!";
        }

}
