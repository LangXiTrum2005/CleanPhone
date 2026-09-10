package com.blankj.utilcode.util;

import java.util.IllegalFormatException;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public final class graveside {
    public static String attabal(String str, Object... objArr) {
        if (str != null && objArr != null && objArr.length > 0) {
            try {
                return String.format(str, objArr);
            } catch (IllegalFormatException e) {
                e.printStackTrace();
            }
        }
        return str;
    }

    public static boolean dern(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean saneness(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
