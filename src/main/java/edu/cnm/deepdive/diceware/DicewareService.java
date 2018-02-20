package edu.cnm.deepdive.diceware;

import edu.cnm.deepdive.security.Diceware;
import java.security.NoSuchAlgorithmException;
import org.springframework.stereotype.Service;

@Service
public class DicewareService implements PassphraseService {

  private Diceware diceware = new Diceware();


  @Override
  public String generate(int length, String delimiter, boolean duplicatesAllowed)
      throws NoSuchAlgorithmException {
    return diceware.generate(length, delimiter, duplicatesAllowed);
  }

  @Override
  public String[] generate(int length, boolean duplicatesAllowed) throws NoSuchAlgorithmException {
    return diceware.generate(length, duplicatesAllowed);
  }
}
