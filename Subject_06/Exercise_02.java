package Subject_06;

public class Exercise_02 {
    char[] table;
    Exercise_02() {
        String writing = "Ala has cat";
        table = writing.toCharArray();
    }
    public static void main(String[] args) {
        Exercise_02 object = new Exercise_02();
        System.out.print(object.count('A'));
    }
    public int count(char letter) {
        int counter = 0;
        for (int i = 0; i < table.length ; i++) {
            if (table[i] == letter) {
                counter++;
            }
        }
        return counter;
    }

}
