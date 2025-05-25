package service;
//Ive imported all the important packages here and also called the function for raising an emergency thorugh the console
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class EmergencyService {
    public void raiseEmergency(String username) {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println("[EMERGENCY] Alert from " + username + " at " + time);
    }
}
