import java.util.*;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Set<String> iceCreamFlavors = new HashSet<>();
        iceCreamFlavors.add("strawberry");
        iceCreamFlavors.add("mint chocolate chip");
        iceCreamFlavors.add("vanilla");
        iceCreamFlavors.add("chocolate");
        iceCreamFlavors.add("cookie dough");

        Map<String, Integer> iceCreamVotes = new LinkedHashMap<>();
        iceCreamVotes.put("strawberry", 0);
        iceCreamVotes.put("mint chocolate chip", 0);
        iceCreamVotes.put("vanilla", 0);
        iceCreamVotes.put("chocolate", 0);
        iceCreamVotes.put("cookie dough", 0);

        List<String> familyNames = new ArrayList<>();
        familyNames.add("Jessica");
        familyNames.add("Ashli");
        familyNames.add("Matthew");
        familyNames.add("Derek");
        familyNames.add("Howard");



        System.out.println("Lets vote on ice cream flavors. Here are your options: ");
        PrintSet(iceCreamFlavors);

        Scanner userInput = new Scanner(System.in);
        String vote = "";
        for(String name : familyNames){

            System.out.println("Which flavor do you want to vote for " + name);
            vote = userInput.nextLine();

            if(iceCreamVotes.containsKey(vote)){
                int currentValue = iceCreamVotes.get(vote);
                int newValue = currentValue + 1;
                iceCreamVotes.put(vote.toLowerCase(), newValue);
                continue;
            }else {
                System.out.println("That is not a valid flavor. Please try again.");
            }
        }

        MaxVotes(iceCreamVotes);




    }

    public static void PrintSet(Set<String> inputSet){
        for(String set : inputSet){
            System.out.println(set);
        }
    }

    public static void MaxVotes(Map<String, Integer> map){
        int maxValue = 0;
        for(Map.Entry<String, Integer> anEntry : map.entrySet()){
            if(maxValue == 0 || anEntry.getValue() > maxValue){
                maxValue = anEntry.getValue();
            }

            if(anEntry.getValue() == maxValue){
                System.out.println("The flavors with the most votes are " + anEntry.getKey());
            }
        }
    }
}