import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class RatingAnalyzerClient {
    public static void main(String[] args) {
        List<Integer> weekendRatings = Collections.EMPTY_LIST;
        Collections.addAll(weekendRatings = new ArrayList<>(),
                3,3,5,3,4,5,5,5,3,5,4,5,3,4,3,4,4,4,3,3,4);
        RatingAnalyzer ra = new RatingAnalyzer(weekendRatings);
        System.out.println("mean: " + ra.mean());
        System.out.println("median: " + ra.median());
        System.out.println("mode: " + ra.mode());
    }
}
