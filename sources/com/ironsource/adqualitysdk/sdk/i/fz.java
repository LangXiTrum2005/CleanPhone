package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.internal.measurement.f2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class fz extends gb {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2119 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f2120 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2121 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2122 = {0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2123 = 98;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2124 = -1760077769;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2125 = 116114876;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final ef f2126;

    public fz(ef efVar) {
        this.f2126 = efVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2227(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2123;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2122;
                    i14 = bArr != null ? (byte) (bArr[f2124 + i12] + i13) : (short) (f2120[f2124 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2124 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2125);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2122;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2120;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:23:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    public boolean equals(Object obj) {
        fz fzVar;
        ef efVar;
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i11 = f2119 + 125;
            f2121 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 51 / 0;
                if (getClass() == obj.getClass()) {
                    fzVar = (fz) obj;
                    efVar = this.f2126;
                    if (efVar != null) {
                        return efVar.equals(fzVar.f2126);
                    }
                    if (fzVar.f2126 == null) {
                        int i13 = (f2119 + 1) % 128;
                        f2121 = i13;
                        i10 = i13 + 31;
                        f2119 = i10 % 128;
                        if (i10 % 2 == 0) {
                            return true;
                        }
                        throw null;
                    }
                }
            } else if (getClass() == obj.getClass()) {
                fzVar = (fz) obj;
                efVar = this.f2126;
                if (efVar != null) {
                    return efVar.equals(fzVar.f2126);
                }
                if (fzVar.f2126 == null) {
                    int i14 = (f2119 + 1) % 128;
                    f2121 = i14;
                    i10 = i14 + 31;
                    f2119 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return true;
                    }
                    throw null;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        ef efVar = this.f2126;
        if (efVar != null) {
            f2121 = (f2119 + 73) % 128;
            return efVar.hashCode();
        }
        int i10 = f2121 + 41;
        f2119 = i10 % 128;
        if (i10 % 2 == 0) {
            return 0;
        }
        throw null;
    }

    public String toString() {
        int i10 = f2119 + 69;
        f2121 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (this.f2126 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f2126);
            return f2.m(sb2, m2227((short) View.MeasureSpec.getSize(0), Color.alpha(0) - 116114817, (-97) - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 1760077769, (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 48)));
        }
        String strIntern = m2227((short) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0, 0) - 116114816, (-98) - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1760077770, (byte) (46 - TextUtils.lastIndexOf("", '0', 0, 0))).intern();
        int i11 = f2121 + 53;
        f2119 = i11 % 128;
        if (i11 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public ea mo2220(ee eeVar, cl clVar) {
        int i10 = f2119;
        f2121 = (i10 + 29) % 128;
        ef efVar = this.f2126;
        if (efVar == null) {
            return new ea(null);
        }
        int i11 = i10 + 73;
        f2121 = i11 % 128;
        if (i11 % 2 != 0) {
            return efVar.m2165(eeVar, clVar);
        }
        efVar.m2165(eeVar, clVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final ef m2228() {
        int i10 = f2119;
        ef efVar = this.f2126;
        int i11 = i10 + 83;
        f2121 = i11 % 128;
        if (i11 % 2 != 0) {
            return efVar;
        }
        throw null;
    }
}
