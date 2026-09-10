package oe;

import com.google.android.gms.internal.auth.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f47387e = "0123456789-$:/.+ABCD".toCharArray();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f47388f = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};

    public static boolean F(char[] cArr, char c4) {
        for (char c5 : cArr) {
            if (c5 == c4) {
                return true;
            }
        }
        return false;
    }
}
