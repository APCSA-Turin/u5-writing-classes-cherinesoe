public class AdditionPattern {
    private int startingNum;
    private int difference;
    private int current;
    
    public AdditionPattern(int startingNum, int difference) {
      this.startingNum = startingNum;
      this.difference = difference;  
      current = startingNum;
    }
    
    public int currentNumber() {
      return current;
    }
  
    public void next() {
      current += difference;
    }
  
    public void prev() {
      if (current != startingNum) {
        current -= difference;
      } else {
        current = startingNum;
      }
    }
  }
  