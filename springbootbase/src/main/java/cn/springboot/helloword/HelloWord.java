package cn.springboot.helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {

   @GetMapping("/helloword")
   public String getHelloWord() {
      return "Hello Word";
   }
}
