import java.util.HashMap;
public class hm {
    public static void main(String[] args){
        HashMap<String, Integer> examScores = new HashMap<String,Integer>();

        examScores.put("Maths",100);
        examScores.put("Java",90);
        examScores.put("English",85);

        examScores.putIfAbsent("Telugu",95);
        examScores.remove("Java");

        System.out.println(examScores.toString());
        System.out.println(examScores.get("Maths"));

    }
}
