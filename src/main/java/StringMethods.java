public class StringMethods {

    public String removeSpaces(String phrase) {
        if (!phrase.isEmpty()) {
            String newPhrase = phrase.trim();
            if (newPhrase.length() < phrase.length()) {

                return "Лишние пробелы удалены";
            } else {

                return "Пробелов не было";
            }
        } else {
            return "Строка пустая";
        }
    }

    public String removeAllAs(String phrase) {
        if (!phrase.isEmpty()) {

            return phrase.replace("a","").trim();
        } else {

            return "Строка пустая";
        }
    }

    public String removeAllZeros(String phrase) {
        String newPhrase = phrase.replace("0","");
        if (newPhrase.equals(phrase)) {

            return "This is a valid string";
        } else {

            return newPhrase.trim();
        }
    }

    public String removeAllSpaces(String phrase) {
        if (!phrase.isEmpty()) {

            return phrase.replace(" ", "");
        }

        return "String is empty";
    }

    public String countAs(String phrase) {
        int count = 0;
        for (int i = 0; i < phrase.length(); i ++) {
            if (phrase.toLowerCase().charAt(i) == 'a') {
                count ++;
            }
        }
        int otherSymbols = phrase.length() - count;

        return "" + count + ", " + otherSymbols;
    }

    public boolean countJava(String phrase) {
        if (phrase.contains("Java")) {

            return true;
        } else {

            return false;
        }
    }

    public String insertQuotes(String phrase) {

        return "\"" + phrase + "\"";
    }

    public String fixCityName(String phrase) {

        return  phrase.toUpperCase().substring(0,1).concat(phrase.toLowerCase().substring(1));
    }
}
