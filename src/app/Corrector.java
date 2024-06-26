package app;

public class Corrector {
    public String handleData(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();// add object type
        int count = 0;
        for (String str : strs) {
            if (str.contains("b")) {
                str = str.replace("b", "o");// fix typo (replace)
            }
            count++; //++
            stringBuilder.append(count).append(") ").append(str).append("\n");//fix typo (replace)
        }
        return stringBuilder.toString();
    }
}
