package azure.practice.com.demo.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/")
public class RestController {

    @RequestMapping(value = "/")
    public ResponseEntity<String> helloOshione(){
        return ResponseEntity.ok().body("Hello is is oshione");
    }

}
