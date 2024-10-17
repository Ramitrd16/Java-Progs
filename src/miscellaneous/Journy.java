package miscellaneous;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*[
"Chennai->Banglore" ,
"Bombay->Delhi",
"Goa->Chennai",
"Delhi->Goa"
]

Output:
Bombay->Delhi->Goa->Chennai->Banglore*/
public class Journy {


    public static void main(String[] args){

        findJourny(List.of("Chennai->Banglore", "Bombay->Delhi",
                "Goa->Chennai", "Delhi->Goa"));
    }

    private static void findJourny(List<String> strings) {

        Map<String, String> mapOfJournies =
                strings.stream().collect(Collectors.toMap(str->str.split("->")[0],
                        str->str.split("->")[1]));
//        System.out.println(mapOfJournies);

        // finding start of journy
        String startOfJourny = mapOfJournies.keySet().stream().filter(start->!mapOfJournies.values().contains(start)).findFirst().orElseThrow();
        String endOfJourny = mapOfJournies.values().stream().filter(end->!mapOfJournies.keySet().contains(end)).findFirst().orElseThrow();
        System.out.print(startOfJourny+"->");
//        for(String journy: mapOfJournies.keySet()){
//            System.out.print(mapOfJournies.get(journy)+"->");
//        }
        String key = startOfJourny;
        for(int i=0; i<mapOfJournies.size();i++){

            System.out.print(mapOfJournies.get(key)+"->");
            key = mapOfJournies.get(key);
        }

    }
}






















