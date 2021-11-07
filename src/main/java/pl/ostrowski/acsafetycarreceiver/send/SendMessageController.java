package pl.ostrowski.acsafetycarreceiver.send;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SendMessageController {

  private final SendMessageService sendMessageService;

  @GetMapping
  public String sendMessage() {
    return sendMessageService.sendMessage();
  }
}
