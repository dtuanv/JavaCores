package setMap;

import java.util.HashMap;

public class HashMappp {

    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();

        hashMap.put("Van", "Tuan");
        hashMap.put("Manh", "Dung");

      String check=  hashMap.get("Van");
        System.out.println(check);
    }
}
