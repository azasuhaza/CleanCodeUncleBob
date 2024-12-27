package clean.code.chapter02;

public class GuessStatsMessage {

  private String number;
  private String verb;
  private String pluralModifier;
  
  public String printGuessMessage(char candidate, int count) {
    createMsgPart(count);
    return String.format(
        "There %s %s %s %s", verb, number, candidate, pluralModifier);
  }
  
  private void createMsgPart(int count) {
    if(count==0)
      populateNoLetter();
    else if(count==1)
      populateOneLetter();
    else
      populateManyLetter(count);    
  }

  private void populateManyLetter(int count) {
    number= Integer.toString(count);
    verb= "are";
    pluralModifier="s";   
  }

  private void populateOneLetter() {
    number ="1";
    verb= "is";
    pluralModifier=""; 
  }

  private void populateNoLetter() {
    number ="no";
    verb= "are";
    pluralModifier="s";
  }
}
