public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        //as.sort();

        QuickSort qs = new QuickSort();
        BubbleSort bs = new BubbleSort();
        as.sort(qs);
        as.sort(bs);

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        System.out.println("=================");
        System.out.println("Lambda Sorting");

        Sorting quickSorting = () -> System.out.println("Quick sorting");
        as.sort(quickSorting);

        Sorting bubbleSorting = () -> System.out.println("Bubble sorting");
        as.sort(bubbleSorting);


    }
    private void sort(Sorting sorting){
    sorting.sort();
    }
}
