package itStep.yandr.javaStages.stage13.mainTask.model.logic;

import itStep.yandr.javaStages.stage13.exception.InvalidSizeOfArray;

public class ArrayManager {
    private static boolean checkSequenceOfNumbersForAscending(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkSequenceOfNumbersForDescending(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkEqualityOfTheArrayElements(double[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[0]!= array[i]) {
                return false;
            }
        }
        return true;
    }
    private static boolean checkDifferenceOfTheArrayElements(double[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i]== array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int checkOrderOfSequenceOfNumbers(double[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        int i = 0;
        int result = 0;
        if (array[i] < array[i + 1]) {
            result = checkSequenceOfNumbersForAscending(array) ? 2 : 0;
        } else if (array[i] > array[i + 1]) {
            result = checkSequenceOfNumbersForDescending(array) ? 1 : 0;
        }
        return result;
    }

    public static boolean checkMirroredArrangementOfElements(double[] array) throws InvalidSizeOfArray {
        if (array == null || array.length < 2) {
            throw new InvalidSizeOfArray();
        }
        for (int i = 0, half = array.length / 2; i < half; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public static int checkEqualityOrDifferenceNumbersOfSequence(double[] array) {
        if (array == null || array.length < 2) {
            return -1;
        }
        int i = 0;
        int result;
        if (array[i] == array[i + 1]) {
            result = checkEqualityOfTheArrayElements(array) ? 1 : 0;
        } else {
            result = checkDifferenceOfTheArrayElements(array) ? 2 : 0;
        }
        return result;
    }

}
