package info.leine.demo;

import javax.swing.text.html.parser.Entity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

  @RequestMapping("/helloWorld/{foo}")
  public String helloWorld(@PathVariable String foo){
    return "Hello " + foo;
  }

}
