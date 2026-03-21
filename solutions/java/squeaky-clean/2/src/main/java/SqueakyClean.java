class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean kebabFlag = false;
        
        for (char c: identifier.toCharArray()) {
            if (Character.isWhitespace(c)) builder.append('_');
            else if (c == '-') kebabFlag = true;
            else if (kebabFlag) {
                builder.append(Character.isLowerCase(c) ? Character.toUpperCase(c) : c);
                kebabFlag = false;
            }
            else if (Character.isDigit(c)) builder.append(convertLeetspeakToLetter(c));
            else if (Character.isLetter(c)) builder.append(c);
            // ignore others
        }
        
        return builder.toString();
    }

    private static char convertLeetspeakToLetter(char c) {
        return switch (Character.getNumericValue(c)) {
            case 0 -> 'o';
            case 1 -> 'l';
            case 3 -> 'e';
            case 4 -> 'a';
            case 7 -> 't';
            default -> c;
        };
    }
}
