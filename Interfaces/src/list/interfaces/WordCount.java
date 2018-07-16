package list.interfaces;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String s=sc.nextLine();
	char[] characters = s.toCharArray();
	int length = characters.length;
	System.out.println("String with duplicates : " +s);
for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
            if (characters[i] == characters[j]) {
                int temp = j;//set duplicate element index

                //delete the duplicate element by shifting the elements to left
                for (int k = temp; k < length - 1; k++) {
                	characters[k] = characters[k + 1];
                }
                j--;
                length--;//reduce char array length

            }
        }}}}
