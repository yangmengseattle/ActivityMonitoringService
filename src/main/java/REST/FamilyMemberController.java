package REST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
