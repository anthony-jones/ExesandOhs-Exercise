public static boolean getXO (String str) {
        int x = 0, o = 0;
        String[] splitString = str.split("");
        for (String s : splitString) {
            if (s.toLowerCase().equals("x")) {
                x++;
            } else if (s.toLowerCase().equals("o")) {
                o++;
            }
        }
        return (x == o);
    }