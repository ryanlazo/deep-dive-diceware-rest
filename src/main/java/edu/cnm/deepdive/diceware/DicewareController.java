package edu.cnm.deepdive.diceware;


import java.security.NoSuchAlgorithmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DicewareController {

  @Autowired
  private PassphraseService service;

  @RequestMapping(value = "/diceware", method = RequestMethod.GET)
  public String generate(
      @RequestParam(value = "length", defaultValue = "6") int length,
      @RequestParam(value = "delimiter", defaultValue = " ") String delimiter,
      @RequestParam(value = "duplicates", defaultValue = "true") boolean duplicatesAllowed)
      throws NoSuchAlgorithmException {
    return service.generate(length, delimiter, duplicatesAllowed);
  }

  @RequestMapping(value = "/diceware/raw", method = RequestMethod.GET)
  public String[] generate(
      @RequestParam(value = "length", defaultValue = "6") int length,
      @RequestParam(value = "duplicates", defaultValue = "true") boolean duplicatesAllowed)
      throws NoSuchAlgorithmException {
    return service.generate(length, duplicatesAllowed);
  }

}
