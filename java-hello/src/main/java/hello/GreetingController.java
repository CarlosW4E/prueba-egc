package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    
@RequestMapping("/bye")
    public String bye(@RequestParam(value="name", required=false, defaultValue="Universe") String name, Model model) {
        model.addAttribute("name", name);
        return "bye";
    }



@RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="Universe") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
