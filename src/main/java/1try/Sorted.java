public class Sorted {
        public static boolean isSorted(int[] array) {
            for (int i = 0; i < array.length; i++) {
                i=i+1;
                if (array[i] < array[i + 1]) {
                    return true;
                } else return false;
            }
            return false;
        }
}



