package com.thinkup.core.common.ooo;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public final class m00 {
    private static boolean m(String str) {
        return str.matches("[\\u4e00-\\u9fa5]+");
    }

    private static String o(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return str;
        }
        int iAbs = Math.abs(length2 - length);
        StringBuilder sb = new StringBuilder(str);
        for (int i2 = 0; i2 < iAbs; i2++) {
            sb.append(" ");
        }
        return sb.toString();
    }

    public static boolean o(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isDigit(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static String o(String str) {
        byte[] bytes = str.getBytes();
        for (int i2 = 0; i2 < bytes.length; i2++) {
            bytes[i2] = (byte) (bytes[i2] - 3);
        }
        return new String(bytes);
    }

    private static String o() {
        String string = UUID.randomUUID().toString();
        try {
            return nm.o(string);
        } catch (Exception e2) {
            e2.printStackTrace();
            return string;
        }
    }
}
