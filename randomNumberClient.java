import java.util.HashMap;
class randomNumberClient {
    public static void main(String[] args) {
        HashMap<Integer, Integer> list = getRandomNumberList();
        for(int key : list.keySet()){
            System.out.println(key + ": " + list.get(key) + " times.");
        }
    }

    private static HashMap<Integer, Integer> getRandomNumberList() {
        HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
        int number = randomNumber.between1and20();
        int value = numbers.getOrDefault(number, 0);
        int count = 1;
        while(count < 1000){
            number = randomNumber.between1and20();
            value = numbers.getOrDefault(number, 0);
            numbers.put(number, value + 1);
            count++;
        }
        return numbers;
    }
}
