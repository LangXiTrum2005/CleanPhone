package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z71 extends y71 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f22547a;

    public z71(char c4) {
        this.f22547a = c4;
    }

    @Override // com.google.android.gms.internal.ads.y71
    public final boolean a(char c4) {
        return c4 == this.f22547a;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i10 = this.f22547a;
        for (int i11 = 0; i11 < 4; i11++) {
            cArr[5 - i11] = "0123456789ABCDEF".charAt(i10 & 15);
            i10 >>= 4;
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        return q4.a.j(new StringBuilder(String.valueOf(strCopyValueOf).length() + 18), "CharMatcher.is('", strCopyValueOf, "')");
    }
}
