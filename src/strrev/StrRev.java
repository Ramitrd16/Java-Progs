package strrev;

import java.util.List;

public class StrRev {
    /*input - my name is Ramit
    outpur - timaR ym si eman*/

    public static void main(String[] args) {
        String str = "My name yo is Ramit";
        List<String> strArr = List.of(str.split(" "));
//        List<String> revString = strArr.stream().map(s -> new StringBuilder().append(s).reverse().toString()).toList();
//        int i = 0;
//        int j = revString.size() - 1;
//        StringBuilder build = new StringBuilder();
//        while (i <= j) {
//            if(i==j){
//                build.append(revString.get(j)).append(" ");
//            }else {
//                build.append(revString.get(j)).append(" ").append(revString.get(i)).append(" ");
//            }
//            j--;
//            i++;
//        }
//        System.out.println(build);

        int i = 0;
        int j = strArr.size() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        while(i<=j){
            StringBuilder build = new StringBuilder(strArr.get(j));
        }
    }
}
