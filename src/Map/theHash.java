package Map;

public class theHash {
    public static int simpleHashMethod(String key){
        int sum = 0;
        for(char c : key.toCharArray()){
            sum += (int) c;
        }
        return sum % 10;
    }
    public static void main(String[] args) {
        System.out.println(simpleHashMethod("ABC"));
        System.out.println(simpleHashMethod("BAC"));
    }
}
