package emergon.service;

import java.time.LocalDateTime;
import org.springframework.stereotype.Service;

@Service
public class HomeService {
    
    public String getWelcomeMessage(){
        LocalDateTime time=LocalDateTime.now();
        String message="Welcome.The time is: "+time;
        return message;
    }
    
}
