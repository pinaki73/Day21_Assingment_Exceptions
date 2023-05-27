public class MoodAnalyser {
    public String moodAnalyser(String message) {
        if (message.contains("happy")){
            System.out.println("happy");
            return "happy";
        } else {
            System.out.println("sad");
            return "sad";
        }
    }

    public static void main(String[] args) {
        MoodAnalyser m1 = new MoodAnalyser();
        m1.moodAnalyser("happy");
    }

}
