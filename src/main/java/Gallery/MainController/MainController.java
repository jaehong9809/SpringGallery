package Gallery.MainController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {


    @GetMapping("jaehong")
    public String jaehong() {
        return "jaehong";
    }

    @GetMapping("hyunjin")
    public String hyunjin() {
        return "hyunjin";
    }
}
