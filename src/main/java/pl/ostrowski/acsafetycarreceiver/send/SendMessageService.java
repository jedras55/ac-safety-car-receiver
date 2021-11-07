package pl.ostrowski.acsafetycarreceiver.send;

import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import pl.ostrowski.acsafetycarreceiver.AcSafetyCarReceiverApplication;

@Service
public class SendMessageService {

  String sendMessage() {
    return AcSafetyCarReceiverApplication.acMessages.entrySet().stream()
        .map(entry -> entry.getKey() + " " + entry.getValue() + "\n")
        .collect(Collectors.joining());
  }
}
