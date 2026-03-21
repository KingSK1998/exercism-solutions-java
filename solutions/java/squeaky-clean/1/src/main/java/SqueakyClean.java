class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        boolean charAsKebabCase = false;
        for (char c: identifier.toCharArray()) {
            if (Character.isWhitespace(c)) {
                builder.append('_');
                continue;
            }
            
            if (c == '-') {
                charAsKebabCase = true;
                continue;
            } 
            if (charAsKebabCase) {
                if (Character.isLowerCase(c)) builder.append(Character.toUpperCase(c));
                else builder.append(c);
                charAsKebabCase = false;
                continue;
            }

            if (Character.isDigit(c)) {
                char convertedChar = switch (Character.getNumericValue(c)) {
                    case 0 -> 'o';
                    case 1 -> 'l';
                    case 3 -> 'e';
                    case 4 -> 'a';
                    case 7 -> 't';
                    default -> c;
                };
                builder.append(convertedChar);
                continue;
            }

            if (!Character.isLetter(c)) continue;
            builder.append(c);
        }
        return builder.toString();
    }
}
