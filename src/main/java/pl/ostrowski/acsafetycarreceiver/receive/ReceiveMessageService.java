package pl.ostrowski.acsafetycarreceiver.receive;

import org.springframework.stereotype.Service;
import pl.ostrowski.acsafetycarreceiver.AcSafetyCarReceiverApplication;

@Service
public class ReceiveMessageService {

  void receiveMessage(String message) {
    int indexOfSpace = message.indexOf(' ');
    if (indexOfSpace > 0) {
      AcSafetyCarReceiverApplication.acMessages.put(
          message.substring(0, indexOfSpace), message.substring(indexOfSpace + 1));
    }
  }
}
