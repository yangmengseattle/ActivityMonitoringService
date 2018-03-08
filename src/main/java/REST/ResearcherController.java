package REST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// ResearcherController:
//  Just display a default web page for now, it shows that there is
//  no view for this type of user
@Controller
@RequestMapping("/researcher")
public class ResearcherController
{
    @RequestMapping(method = RequestMethod.GET)
    public String Researcher()
    {
        return "default";
    }
}
