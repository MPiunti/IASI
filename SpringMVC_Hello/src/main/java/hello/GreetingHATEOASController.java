package hello;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingHATEOASController {

    private static final String TEMPLATE = "Hello, %s!";

    @RequestMapping("/hateoas/greeting")
    @ResponseBody
    public HttpEntity<GreetingRes> greeting(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {

        GreetingRes greeting = new GreetingRes(String.format(TEMPLATE, name));
        greeting.add(linkTo(methodOn(GreetingHATEOASController.class).greeting(name)).withSelfRel());

        return new ResponseEntity<GreetingRes>(greeting, HttpStatus.OK);
    }
}