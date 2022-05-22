package Sort;

public class QuickSort implements Sort{
    @Override
    public void ascendning(int[] num) {
        System.out.println("QuickSort ascending");
    }

    @Override
    public void descending(int[] num) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort입니다");
    }
}
