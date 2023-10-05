package lesson1_Lambda;

import java.util.Comparator;

public class LambdaExample {
    public static void main(String[] args) {
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(1000, 2213));
    }

//    private static class IntegerComparator implements Comparator<Integer> {

//        @Override
//        public int compare(Integer o1, Integer o2) {
//            return Integer.compare(o1,o2);
//
//        }
//    }
}
