package lesson3.task2;

public class Main {

    private String sortLine(String target) {

        String[] s = target.split(" ");
        String[] helpArray = new String[s.length];

        if (target.equalsIgnoreCase("")) {
            return "";

        } else {

            for (int i = 0; i < s.length; i++) {
                char[] a = s[i].toCharArray();

                for (int j = 0; j < a.length; j++) {

                    if (Character.isDigit(a[j])) {
                        int b = Integer.parseInt(String.valueOf(a[j]));
                        helpArray[b - 1] = s[i];
                    }
                }
            }
        }

        String answer = "";

        for (String c : helpArray) {
            answer += c + " ";
        }

        return answer;
    }

    public static void main(String[] args) {
        String s = "is2 Thi1s T4est 3a";
        System.out.print(new Main().sortLine(s));
    }
}