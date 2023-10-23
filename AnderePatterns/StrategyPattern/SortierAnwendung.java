package AnderePatterns.StrategyPattern;

import java.util.Arrays;

public class SortierAnwendung {
    public static void main(String[] args) {
        // Array gefüllt mit unsortierten Zahlen erstellen 
        int[] arr = { 5, 1, 4, 2, 8 };
        
        //Objekt der Klasse SortierKontext mit dem entsprechenden Sortieralgorythmus erstellen 
        Sortierkontext kontext = new Sortierkontext(new BubbleSort());

        //Sortieralgorythmus an dem Objekt während der Laufzeit 2 mal ändern.
        //vor jedem oder nach jedem Ändern des Sortieralgorythmus muss das Array sortiert und ausgegeben werden 
        kontext.sortiere(arr);
        System.out.println(Arrays.toString(arr));
        

        
        kontext.setStrategie(new MergeSort());
        int[] arr2 = { 5, 1, 4, 2, 8 };
        kontext.sortiere(arr2);
        System.out.println(Arrays.toString(arr2));

        kontext.setStrategie(new QuickSort());
        int[] arr3 = { 5, 1, 4, 2, 8 };
        kontext.sortiere(arr3);
        System.out.println(Arrays.toString(arr3));



    
    }
}