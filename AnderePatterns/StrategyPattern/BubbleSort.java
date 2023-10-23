package AnderePatterns.StrategyPattern;

// Konkrete Implementierung der Bubble-Sort-Strategie
class BubbleSort implements Sortierstrategie {
    @Override
    public void sortieren(int[] arr) {
        int n = arr.length;
        boolean getauscht;
        do {
            getauscht = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Tausche die Elemente
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    getauscht = true;
                }
            }
        } while (getauscht);
    }
}
