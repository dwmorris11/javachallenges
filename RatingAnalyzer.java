import java.util.List;
import java.util.Collections;
import java.util.HashMap;

class RatingAnalyzer {
  private List<Integer> ratings;

  public double mean() {
    return sum(ratings)/ratings.size();
  }

  public double median() {
   Collections.sort(ratings);
   if(ratings.size()%2 == 0) {
    int leftCenter = ratings.size()/2;
    int rightCenter = leftCenter + 1;
    double median = (ratings.get(leftCenter) + ratings.get(rightCenter))/2 * 1.0;
    return median;
   }
   int medianIndex = (int) Math.ceil(ratings.size()/2);
   return ratings.get(medianIndex);

  }

  public int mode() {
    HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
    for(int rating : ratings) {

      int value = count.containsKey(rating) ? count.get(rating) : 0;
      count.put(rating, value + 1);
    }
    Integer max = 0;
    for(Integer key : count.keySet()) {
      if(count.get(key) > max) {
        max = count.get(key);
      }
    }
    return max;
  }

  private static int sum(List<Integer> ratings) {
    int sum = ratings.stream().reduce(0,
    (rating1, rating2) -> rating1 + rating2);
    return sum;
  }
}