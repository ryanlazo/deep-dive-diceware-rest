package edu.cnm.deepdive.diceware;




public interface PassphraseService {

  String generate(int length, String delimiter, boolean duplicatesAllowed);


  String[] generate(int length, boolean duplicatesAllowed);

}