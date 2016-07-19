package controler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class IndexController {
@RequestMapping(path={"/{id}","index/{id}"})
@ResponseBody	
public String index(@PathVariable("id") Integer id,
		@RequestParam("key") String key){
	
	return String.format("id:{%d},%s", id,key);
}
public static void main(String[] args) throws Exception {
SpringApplication.run(IndexController.class, args);
}
}
