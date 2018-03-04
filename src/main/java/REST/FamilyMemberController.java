package REST;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping("/familymember")
public class FamilyMemberController
{
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity FamilyMember()
    {
        try
        {
            byte[] file = Files.readAllBytes(Paths.get("src\\main\\resources\\default.html"));
            return ResponseEntity.status(HttpStatus.OK).body(new String(file, Charset.defaultCharset()));
        }
        catch (IOException e)
        {
            throw new RuntimeException(e.getClass().toString());
        }
    }
}
