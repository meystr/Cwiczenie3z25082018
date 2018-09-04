//3. Korzystając z funkcji split (podzielcie po pustym Stringu) wyświetlcie zdanie wspak
package pl.sda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj zdanie: ");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String[] cutSentence = sentence.split("");

        for (int i = cutSentence.length; i > 0; i--) {
        System.out.print(cutSentence[i-1]);
        }
    }
}

