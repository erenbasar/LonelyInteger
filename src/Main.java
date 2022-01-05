import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
            HashMap<Integer,Integer> hm = new HashMap<>();

            for (int i=0;i<a.size();i++){
                if(!hm.containsKey(a.get(i)))
                    hm.put(a.get(i),1);
                else{
                    hm.put(a.get(i),hm.get(a.get(i))+1);
                }
            }

        List< Integer > keys = new ArrayList< Integer >();

        for ( Integer key : hm.keySet() ){
            if ( hm.get( key ).equals( 1 ) ){
                keys.add( key );
            }
        }

        return keys.get(0);

    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(5);
        arr.add(5);
        System.out.println(lonelyinteger(arr));
    }

}


