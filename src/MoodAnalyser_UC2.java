
class MoodException extends Exception{
    public MoodException(String s){
        super(s);
    }
}

public class MoodAnalyser_UC2 {
    public void invalidMoodException(String n) throws Exception {
        if (n == null || n == " ") {
            throw new MoodException("Invalid mood entered, Mood can be either happy or sad");

        }else{
            System.out.println(n);
        }

        }




    public static void main(String[] args)  {
        MoodAnalyser_UC2 m = new MoodAnalyser_UC2();
        try{
            m.invalidMoodException("null");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
