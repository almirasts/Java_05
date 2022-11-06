public class OddIndices {

    public int[] oddIndices() {
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] result = new int[3];
        int count = 0;

        for (int i = 0; i < array.length; i ++) {
            if (i % 2 != 0) {
                result[count] += array[i];
                count ++;
            }
            System.out.println(array[i]);
        }

        return result;

    }
}
