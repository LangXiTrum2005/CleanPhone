package com.adjust.sdk.flutter;

import java.text.NumberFormat;
import java.text.ParsePosition;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdjustUtils {
    private static NumberFormat numberFormat = NumberFormat.getInstance();

    public static boolean isNumber(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        numberFormat.parse(str, parsePosition);
        return str.length() == parsePosition.getIndex();
    }
}
