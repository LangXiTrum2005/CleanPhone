package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.KeyEvent;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class eg extends ef {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1926 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1927 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1928 = -6687582292312828947L;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1929;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f1930;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ef[] f1931;

    public eg(List<ef> list) {
        ef[] efVarArr = new ef[list.size()];
        this.f1931 = efVarArr;
        list.toArray(efVarArr);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2166(char c4, String str, String str2, String str3, int i10) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (f.f2016) {
            try {
                char[] cArr4 = (char[]) cArr2.clone();
                char[] cArr5 = (char[]) cArr3.clone();
                cArr4[0] = (char) (c4 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i10));
                int length = cArr.length;
                char[] cArr6 = new char[length];
                f.f2015 = 0;
                while (true) {
                    int i11 = f.f2015;
                    if (i11 < length) {
                        int i12 = (i11 + 2) % 4;
                        int i13 = (i11 + 3) % 4;
                        int i14 = cArr4[i11 % 4] * 32718;
                        char c5 = cArr5[i12];
                        char c10 = (char) ((i14 + c5) % Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        f.f2017 = c10;
                        cArr5[i13] = (char) d5.u.d(cArr4[i13], 32718, c5, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        cArr4[i13] = c10;
                        int i15 = f.f2015;
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f1928) ^ ((long) f1929)) ^ ((long) f1930));
                        f.f2015 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str4;
    }

    public final boolean equals(Object obj) {
        int i10 = f1927 + 27;
        int i11 = i10 % 128;
        f1926 = i11;
        if (i10 % 2 == 0) {
            int i12 = 70 / 0;
            if (this == obj) {
                return true;
            }
        } else if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i13 = i11 + 121;
            f1927 = i13 % 128;
            if (i13 % 2 != 0) {
                obj.getClass();
                throw null;
            }
            if (eg.class == obj.getClass()) {
                return Arrays.equals(this.f1931, ((eg) obj).f1931);
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = f1926 + 63;
        f1927 = i10 % 128;
        int i11 = i10 % 2;
        ef[] efVarArr = this.f1931;
        if (i11 != 0) {
            Arrays.hashCode(efVarArr);
            throw null;
        }
        int iHashCode = Arrays.hashCode(efVarArr);
        int i12 = f1927 + 89;
        f1926 = i12 % 128;
        if (i12 % 2 != 0) {
            return iHashCode;
        }
        throw null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2166((char) (11240 - ((Process.getThreadPriority(0) + 20) >> 6)), "叭撀\uef56ꌰ", "ꥁ쟳\ue8ac怫", "䲏", (-1396182103) - KeyEvent.getDeadChar(0, 0)).intern());
        sb2.append(ef.m2163(this.f1931));
        String strM = f2.m(sb2, m2166((char) (KeyEvent.normalizeMetaState(0) + 46207), "叭撀\uef56ꌰ", "ꪁ桊罔쒴", "桭", 1416121002 - Drawable.resolveOpacity(0, 0)));
        int i10 = f1926 + 81;
        f1927 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 0 / 0;
        }
        return strM;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.ef
    /* JADX INFO: renamed from: ｋ */
    public final ea mo2164(ee eeVar, cl clVar) {
        ArrayList arrayList = new ArrayList();
        ef[] efVarArr = this.f1931;
        int length = efVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = f1927 + 71;
            f1926 = i11 % 128;
            if (i11 % 2 == 0) {
                arrayList.add(efVarArr[i10].m2165(eeVar, clVar).m2124());
                i10 += 23;
            } else {
                arrayList.add(efVarArr[i10].m2165(eeVar, clVar).m2124());
                i10++;
            }
            f1927 = (f1926 + 99) % 128;
        }
        return new ea(arrayList);
    }
}
