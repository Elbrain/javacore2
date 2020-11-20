package lesson2;

public class Main {
    static String[][] strings = {{"1", "4", "a", "3"}, {"3", "4", "12", "3"}, {"0", "4", "-1", "3"}, {"43", "4", "a", "3"}};

    public static void main(String[] args) throws MyArrayDataException {
        checkArray(strings);
    }

    public static void checkArray(String[][] strings) throws MyArrayDataException {
        try {
            if (strings.length != 4 || strings[0].length != 4 || strings[1].length != 4 || strings[2].length != 4 || strings[3].length != 4) {
                throw new MyArraySizeException("массив не равен 4х4");
            }
            fillArray(strings);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка инциализации");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка заполнения");
            e.printStackTrace();
            throw new MyArrayDataException();
        }
    }

    public static void fillArray(String[][] strings) throws MyArrayDataException {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum += Integer.parseInt(strings[i][j]);
            }
        }
    }
}
