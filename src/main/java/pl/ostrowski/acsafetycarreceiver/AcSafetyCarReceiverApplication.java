package pl.ostrowski.acsafetycarreceiver;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class AcSafetyCarReceiverApplication {

  public static Map<String, String> acMessages = new HashMap<>();

  public static void main(String[] args) throws IOException {
    SpringApplication.run(AcSafetyCarReceiverApplication.class, args);
  }
}
