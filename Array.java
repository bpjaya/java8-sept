public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int n : arr) {
            if (!set.add(n)) { // false → already exists
                duplicates.add(n);
            }
        }

        System.out.println("Duplicates in array: " + duplicates);
    }
}
