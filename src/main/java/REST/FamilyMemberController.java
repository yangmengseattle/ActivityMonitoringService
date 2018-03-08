package REST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// FamilyMemberController:
//  Just display a default web page for now, it shows that there is
//  no view for this type of user
@Controller
@RequestMapping("/familymember")
public class FamilyMemberController
{
    @RequestMapping(method = RequestMethod.GET)
    public String FamilyMember()
    {
        return "default";
    }
}
