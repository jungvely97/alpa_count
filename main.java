import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String arr;
        char alpa[] = new char[26];
        int count[] = new int[26];
        char A = 'a';
        Scanner input = new Scanner(System.in);

        System.out.print("Write sentence : ");
        arr = input.nextLine();

        for(int i = 0; i < alpa.length; i++){
            alpa[i] = A++;
        }

        for(int i =0; i < arr.length(); i++){
            for (int j = 0; j < alpa.length; j++){
                if(arr.charAt(i) == alpa[j]) count[j]++;
            }
        }

        for(int i = 0; i < alpa.length; i++){
            System.out.println(alpa[i] + " : " + count[i]);
        }
    }
}

