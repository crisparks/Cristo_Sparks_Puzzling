import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class PuzzleJava {
    public static int[] greaterThanY(int[] a, int b){
        int[] c = new int[3];
        int d = 0;
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            d += a[i];
            if (a[i] > b) {
                c[e] = a[i];
                e++;
            }
        }
        System.out.println(d);
        return c;
    }

    public static ArrayList<String> shuffleNPrint() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Nancy");
        names.add("Jinichi");
        names.add("Fujibayashi");
        names.add("Momochi");
        names.add("Ishikawa");
        Collections.shuffle(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
            if (names.get(i).length() <= 5) {
                names.remove(i);                
            }
        }
        return names;
    }

    public static void alphaShuffle() {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Collections.shuffle(Arrays.asList(alphabet));
        char a = alphabet[0];
        System.out.println("The first letter is "+a);
        System.out.println("The last letter is "+alphabet[25]);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            System.out.print("VOWEL HAS BEEN DETECTED IN FIRST ARRAY ELEMENT.");
        }
    }

    public static int[] randoArray(){
        int[] a = new int[10];
        Random b = new Random();
        for(int i=0; i<10; i++){
            a[i] = b.nextInt(46)+55;
        }
        return a;
    }

    public static int[] sortedRandoArray(){
        int[] a = randoArray();
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println("Min: "+a[0]);
        System.out.println("Max: "+a[9]);
        return a;
    }
    public static String randomString(){
        Random c = new Random();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        String a = "";
        for(int i = 0; i<5; i++){
            int b = c.nextInt(26);
            a += alphabet[b];
        }
        return a;
    }

    public static String[] arrOfStrings(){
        String[] a = new String[10];
        for(int i = 0; i<10; i++){
            a[i] = randomString();
        }
        return a;
    }

    public static void main(String[] args){
        int[] test1 = greaterThanY(new int[] {3,5,1,2,7,9,8,13,25,32}, 10);
        for (int i = 0; i < test1.length; i++) {
            System.out.println(test1[i]);
        }
        System.out.println("End of Test One");

        ArrayList<String> test2 = shuffleNPrint();
        for (int i = 0; i < test2.size(); i++) {
            System.out.println(test2.get(i));
        }
        System.out.println("End of Test Two");

        alphaShuffle();
        System.out.println("End of Test Three");

        System.out.println(Arrays.toString(randoArray()));
        System.out.println("End of Test Four");

        System.out.println(sortedRandoArray());
        System.out.println("End of Test Five");

        System.out.println(randomString());
        System.out.println("End of Test Six");

        System.out.println(Arrays.toString(arrOfStrings()));
        System.out.println("End of Test Seven");
    } 
}

