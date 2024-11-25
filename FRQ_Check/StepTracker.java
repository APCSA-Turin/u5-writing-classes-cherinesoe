public class StepTracker {
    private int minSteps;
    private int totalSteps;
    private int daysActive;
    private int days;
  
    public StepTracker(int minSteps) {
      this.minSteps = minSteps;
      totalSteps = 0;
      daysActive = 0;
      days = 0;
    }
  
    public void addDailySteps(int addSteps) {
      if (addSteps >= minSteps) {
        daysActive++;
        days++;
        totalSteps += addSteps;
      } else {
        days++;
        totalSteps += addSteps;
      }
    }
  
    public int activeDays() {
      return daysActive;
    }
  
    public double averageSteps() {
      if (days == 0) {
        return 0;
      } else {
        return (double) totalSteps / days;
      }
    }
  }
  