package com.google.common.base;

/* JADX INFO: compiled from: Ascii.java */
/* JADX INFO: loaded from: classes3.dex */
public final class attabal {
    public static boolean attabal(CharSequence charSequence, CharSequence charSequence2) {
        int iSaneness;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = charSequence.charAt(i);
            char cCharAt2 = charSequence2.charAt(i);
            if (cCharAt != cCharAt2 && ((iSaneness = saneness(cCharAt)) >= 26 || iSaneness != saneness(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static String beachfront(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (wireman(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (wireman(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static String competently(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (dern(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (dern(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    public static boolean dern(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static char marial(char c) {
        return wireman(c) ? (char) (c ^ ' ') : c;
    }

    public static int saneness(char c) {
        return (char) ((c | ' ') - 97);
    }

    public static boolean wireman(char c) {
        return c >= 'A' && c <= 'Z';
    }
}
