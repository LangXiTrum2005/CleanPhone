package com.google.zxing.oned;

/* JADX INFO: loaded from: classes3.dex */
public final class CodaBarReader extends OneDReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f21366a = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21367b = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean a(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }
}
