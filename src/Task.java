public class Task {
    public static void main(String[] args) {
        int[] numbers = {6, 2, 4, 91, 5, 10, 11};
        int[] result = getArrayMiddle(numbers);
        if (result.length == 1) {
            System.out.println("[" + result[0] + "]");
        } else {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }

    public static int[] getArrayMiddle(int[] numbers) {
        int lengthOfMassive = numbers.length;
        int lengthOfNewMassive = 2;
        if (lengthOfMassive % 2 == 1) {
            lengthOfNewMassive = 1;
        }
        int[] result = new int[lengthOfNewMassive];
        if (lengthOfNewMassive == 1) {
            result[0] = numbers[(lengthOfMassive - 1) / 2];
        } else {
            result[0] = numbers[(lengthOfMassive / 2) - 1];
            result[1] = numbers[(lengthOfMassive / 2)];
        }
        return result;
    }
}
