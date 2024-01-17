package school;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import school.service.MethodService;


public class Main{
    @Autowired
    private MethodService methodService;

    public static void main(String[] args) {

    }
}
