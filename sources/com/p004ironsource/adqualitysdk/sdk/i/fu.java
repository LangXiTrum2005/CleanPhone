package com.p004ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.smartdigimkt.sdk.basead.ui.BaseATView;

/* JADX INFO: loaded from: classes5.dex */
public final class fu extends fq {

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2031 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2032 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2033 = 175;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private fq f2034;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee f2035;

    public fu(ee eeVar, fq fqVar) {
        this.f2035 = eeVar;
        this.f2034 = fqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            f2032 = (f2031 + 51) % 128;
            return true;
        }
        if (obj != null) {
            f2032 = (f2031 + 27) % 128;
            if (fu.class == obj.getClass()) {
                fu fuVar = (fu) obj;
                ee eeVar = this.f2035;
                if (eeVar == null ? fuVar.f2035 != null : !eeVar.equals(fuVar.f2035)) {
                    return false;
                }
                fq fqVar = this.f2034;
                if (fqVar != null) {
                    int i2 = f2032 + 15;
                    f2031 = i2 % 128;
                    int i3 = i2 % 2;
                    fq fqVar2 = fuVar.f2034;
                    if (i3 != 0) {
                        return fqVar.equals(fqVar2);
                    }
                    fqVar.equals(fqVar2);
                    throw null;
                }
                if (fuVar.f2034 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        ee eeVar = this.f2035;
        if (eeVar != null) {
            f2032 = (f2031 + 61) % 128;
            iHashCode = eeVar.hashCode();
            f2032 = (f2031 + 119) % 128;
        } else {
            iHashCode = 0;
        }
        int i2 = iHashCode * 31;
        fq fqVar = this.f2034;
        return i2 + (fqVar != null ? fqVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2136((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 262, "\u0012\u0011 \uffd1\uffc9\u000e\u0015", true).intern());
        sb.append(this.f2035);
        sb.append(m2136((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 2 - TextUtils.indexOf("", "", 0), KeyEvent.getDeadChar(0, 0) + BaseATView.g.f38289J, "\u0005￼", true).intern());
        sb.append(this.f2034);
        String string = sb.toString();
        int i2 = f2031 + 83;
        f2032 = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    public final du mo2122(dr drVar, cp cpVar) {
        while (this.f2035.m2086(drVar, cpVar).m2047()) {
            f2031 = (f2032 + 85) % 128;
            du duVarMo2122 = this.f2034.mo2122(drVar, cpVar);
            if (!(!duVarMo2122.m2044())) {
                break;
            }
            f2031 = (f2032 + 111) % 128;
            if (duVarMo2122.m2046()) {
                return duVarMo2122;
            }
        }
        return new du(null);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2136(int i2, int i3, int i4, String str, boolean z2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f672) {
            try {
                char[] cArr2 = new char[i3];
                b.f673 = 0;
                while (true) {
                    int i5 = b.f673;
                    if (i5 >= i3) {
                        break;
                    }
                    b.f671 = cArr[i5];
                    cArr2[b.f673] = (char) (b.f671 + i4);
                    int i6 = b.f673;
                    cArr2[i6] = (char) (cArr2[i6] - f2033);
                    b.f673 = i6 + 1;
                }
                if (i2 > 0) {
                    b.f674 = i2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr2, 0, cArr3, 0, i3);
                    int i7 = b.f674;
                    System.arraycopy(cArr3, 0, cArr2, i3 - i7, i7);
                    int i8 = b.f674;
                    System.arraycopy(cArr3, i8, cArr2, 0, i3 - i8);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    b.f673 = 0;
                    while (true) {
                        int i9 = b.f673;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr4[i9] = cArr2[(i3 - i9) - 1];
                        b.f673 = i9 + 1;
                    }
                    cArr2 = cArr4;
                }
                str2 = new String(cArr2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }
}
