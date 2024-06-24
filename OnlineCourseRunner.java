 public class OnlineCourseRunner{
 public static void main(String[] args) {
    double gstAmount = (OnlineCourse.courseCost * OnlineCourse.gstPercentage) / 100;
    double totalFee = OnlineCourse.courseCost + gstAmount;
    
    System.out.println("Course Cost: Rs." + OnlineCourse.courseCost);
    System.out.println("GST at " + OnlineCourse.gstPercentage + "%: Rs." + gstAmount);
    System.out.println("Total Fee (including GST): Rs." + totalFee);
  }
}