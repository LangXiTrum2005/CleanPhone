package com.applovin.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f7 {
    public static boolean a(String str, int i10) {
        return str != null && i10 >= 0 && str.length() > i10 && str.charAt(i10) == '1';
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : str.split("\\.")) {
            if (!c(str2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("^[a-zA-Z\\d_-]*$");
    }

    public static boolean a(String str) {
        if (str != null && str.length() >= 2) {
            String[] strArrSplit = str.split("~", -1);
            if (strArrSplit.length == 2 && "1".equals(strArrSplit[0])) {
                return Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[1]);
            }
            if (strArrSplit.length == 3 && "2".equals(strArrSplit[0]) && Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[1]) && strArrSplit[2].length() >= 3 && strArrSplit[2].startsWith("dv.") && Pattern.matches("(\\d+(\\.\\d+)*)?", strArrSplit[2].substring(3))) {
                return true;
            }
        }
        return false;
    }

    public static Boolean a(int i10, String str) {
        if (!a(str)) {
            return null;
        }
        String[] strArrSplit = str.split("~", -1);
        List listAsList = Arrays.asList(strArrSplit[1].split("\\."));
        String strValueOf = String.valueOf(i10);
        boolean zContains = listAsList.contains(strValueOf);
        if (strArrSplit[0].equals("1")) {
            return Boolean.valueOf(zContains);
        }
        if (zContains) {
            return Boolean.TRUE;
        }
        if (Arrays.asList(strArrSplit[2].split("\\.")).contains(strValueOf)) {
            return Boolean.FALSE;
        }
        return null;
    }
}
