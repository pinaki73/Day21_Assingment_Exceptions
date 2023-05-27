public class MoodAnalyser_UC3 {
    public void moodAnalyserExceptionthrows(String n)  {
        try {
            if (n == null) {
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println("Happy");
    }

    public static void main(String[] args) {
        MoodAnalyser_UC3 m3 = new MoodAnalyser_UC3();
            m3.moodAnalyserExceptionthrows(null);
    }
}
