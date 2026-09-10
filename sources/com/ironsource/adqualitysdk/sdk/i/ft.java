package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ft extends gc {

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2082 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2083 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2084 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2085 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2086 = 1855457386;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final gb[] f2087;

    public ft(List<gb> list, byte b10) {
        super(b10);
        gb[] gbVarArr = new gb[list.size()];
        this.f2087 = gbVarArr;
        list.toArray(gbVarArr);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2217(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2084) ^ ((long) f2086)) ^ ((long) f2083));
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
        if (this == obj) {
            f2085 = (f2082 + 81) % 128;
            return true;
        }
        if (obj == null || ft.class != obj.getClass()) {
            int i10 = f2085 + 11;
            f2082 = i10 % 128;
            if (i10 % 2 != 0) {
                return false;
            }
            throw null;
        }
        ft ftVar = (ft) obj;
        gb[] gbVarArr = this.f2087;
        if (gbVarArr == null) {
            if (ftVar.f2087 != null) {
                return false;
            }
            int i11 = f2085 + 83;
            f2082 = i11 % 128;
            if (i11 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i12 = f2085 + 35;
        f2082 = i12 % 128;
        int i13 = i12 % 2;
        gb[] gbVarArr2 = ftVar.f2087;
        if (i13 != 0) {
            return gbVarArr.equals(gbVarArr2);
        }
        gbVarArr.equals(gbVarArr2);
        throw null;
    }

    public final int hashCode() {
        int i10 = f2082;
        f2085 = (i10 + 15) % 128;
        gb[] gbVarArr = this.f2087;
        if (gbVarArr != null) {
            return gbVarArr.hashCode();
        }
        f2085 = (i10 + 125) % 128;
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2217((char) (10257 - (ViewConfiguration.getTouchSlop() >> 8)), "\u0000\u0000\u0000\u0000", "㨳\uf116ᄞጨ", "癸揀", ViewConfiguration.getMinimumFlingVelocity() >> 16).intern());
        gb[] gbVarArr = this.f2087;
        int length = gbVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            f2085 = (f2082 + 31) % 128;
            gb gbVar = gbVarArr[i10];
            m2235(sb2);
            sb2.append(gbVar.toString());
            sb2.append(m2217((char) ((ViewConfiguration.getTapTimeout() >> 16) + 63990), "\u0000\u0000\u0000\u0000", "\uf4dcⱛ\uf64c竹", "\ud832", 1277975540 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
            i10++;
            f2082 = (f2085 + 65) % 128;
        }
        m2236(sb2);
        return f2.m(sb2, m2217((char) (19365 - (KeyEvent.getMaxKeyCode() >> 16)), "\u0000\u0000\u0000\u0000", "릃檇ꕜか", "봦", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1550485432));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ea mo2220(ee eeVar, cl clVar) {
        ea eaVar = new ea(null);
        ee eeVar2 = new ee(eeVar);
        gb[] gbVarArr = this.f2087;
        int length = gbVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            eaVar = gbVarArr[i10].m2232(eeVar2, clVar);
            if (eaVar.m2122() || eaVar.m2126()) {
                break;
            }
            int i11 = f2085 + InterfaceC0435l1.d.b.f29112i;
            f2082 = i11 % 128;
            if (i11 % 2 == 0) {
                eaVar.m2120();
                throw null;
            }
            if (eaVar.m2120()) {
                return eaVar;
            }
            eeVar.m2149();
            i10++;
            f2085 = (f2082 + 107) % 128;
        }
        return eaVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int mo2219(ee eeVar) {
        f2082 = (f2085 + InterfaceC0435l1.d.b.f29112i) % 128;
        int iMo2218 = 0;
        for (int i10 = 0; i10 < eeVar.m2148(); i10++) {
            iMo2218 += this.f2087[i10].mo2218();
        }
        f2082 = (f2085 + 25) % 128;
        return iMo2218;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final int mo2218() {
        f2085 = (f2082 + 95) % 128;
        gb[] gbVarArr = this.f2087;
        int length = gbVarArr.length;
        int iMo2218 = 2;
        int i10 = 0;
        while (i10 < length) {
            f2085 = (f2082 + 55) % 128;
            iMo2218 += gbVarArr[i10].mo2218();
            i10++;
            f2082 = (f2085 + 29) % 128;
        }
        return iMo2218;
    }
}
