package pl.ostrowski.acsafetycarreceiver.receive;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ReceiveMessageController {

  private final ReceiveMessageService receiveMessageService;

  @PostMapping
  public void handleSCRequest(@RequestBody String message) {
    receiveMessageService.receiveMessage(message);
  }
}
