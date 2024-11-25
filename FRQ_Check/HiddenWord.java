public class HiddenWord {
    private String secret;
  
    public HiddenWord(String secret) {
      this.secret = secret;
    }
  
    public String getHint(String guess) {
      String hint = "";
      for (int i = 0; i < secret.length(); i++) {
        if (secret.substring(i, i + 1).equals(guess.substring(i, i + 1))) {
          hint += secret.substring(i, i + 1);
        } else if (secret.indexOf(guess.substring(i, i + 1)) != -1) {
          hint += "+";
        } else {
          hint += "*";
        }
      }
      return hint;
    }
  }
  