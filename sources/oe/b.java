package oe;

import com.google.android.gms.internal.play_billing.q1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f47389b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f47390c = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f47391d = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f47392e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f47389b = cArr;
        f47392e = cArr[0];
    }

    @Override // com.google.android.gms.internal.play_billing.q1
    public final boolean[] l(String str) {
        int i10;
        int length = str.length();
        char c4 = f47392e;
        if (length < 2) {
            str = c4 + str + c4;
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f47389b;
            boolean zF = a.F(cArr, upperCase);
            boolean zF2 = a.F(cArr, upperCase2);
            char[] cArr2 = f47390c;
            boolean zF3 = a.F(cArr2, upperCase);
            boolean zF4 = a.F(cArr2, upperCase2);
            if (zF) {
                if (!zF2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zF3) {
                if (zF2 || zF4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                str = c4 + str + c4;
            } else if (!zF4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else {
                if (!a.F(f47391d, str.charAt(i12))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
                }
                i11 += 10;
            }
        }
        boolean[] zArr = new boolean[(str.length() - 1) + i11];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = a.f47387e;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i15]) {
                    i10 = a.f47388f[i15];
                    break;
                }
                i15++;
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                } else {
                    i17++;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }
}
