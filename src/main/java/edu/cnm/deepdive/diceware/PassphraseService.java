package edu.cnm.deepdive.diceware;

import java.security.NoSuchAlgorithmException;

public interface PassphraseService {

  String generate(int length, String delimiter, boolean duplicatesAllowed)
      throws NoSuchAlgorithmException;

  String[] generate(int length, boolean duplicatesAllowed)
      throws NoSuchAlgorithmException;

}
