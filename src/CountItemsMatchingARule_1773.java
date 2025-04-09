import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule_1773 {
    public static void main(String[] args) {
        String[][] arr = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey ="color";
        String ruleValue = "silver";
        List<List<String>> items = new ArrayList<>(10);
        for (String[] i: arr) {
                items.add(Arrays.asList(i));
            }
        System.out.println(countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue){
        int ans = 0;
        int key = switch (ruleKey.toLowerCase()) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };

        for(List<String> list :items){
            if((list.get(key)).equals(ruleValue)){
                ans++;
            }
        }

        return ans;
    }
}
