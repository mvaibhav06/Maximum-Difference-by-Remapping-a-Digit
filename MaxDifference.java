import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxDifference {
    public static int minMaxDifference(int num) {
        int temp = num;
        List<Integer> list = new ArrayList<>();

        while(temp > 0){
            list.add(temp%10);
            temp /= 10;
        }
        Collections.reverse(list);

        int i = 0;
        int j = 0;
        while(i<list.size() && list.get(i)==9){
            i++;
        }
        if (i == list.size()){
            i = 0;
        }
        int replace = list.get(i);
        i = 0;

        int max = 0;
        int min = 0;

        while(i < list.size()){
            if(list.get(i) != replace){
                max = (max*10) + list.get(i);

            }else{
                max = (max*10) + 9;

            }
            i++;
        }

        replace = list.get(j);

        while(j < list.size()){
            if(list.get(j) != replace){
                min = (min*10) + list.get(j);

            }else{
                min = (min*10) ;

            }
            j++;
        }
        return max-min;
    }

    public static void main(String[] args) {
        System.out.println(minMaxDifference(99999));
    }
}
