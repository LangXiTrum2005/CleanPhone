package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.util.TypedValue;
import android.view.KeyEvent;
import jp.maio.sdk.android.MaioAds;

/* JADX INFO: loaded from: classes5.dex */
public final class go extends gi {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2125 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2126 = 54;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2127 = 1;

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻐ */
    public final String mo2138() {
        f2127 = (f2125 + 39) % 128;
        String strIntern = m2163(13 - (Process.myTid() >> 22), 27 - KeyEvent.getDeadChar(0, 0), 148 - Color.alpha(0), "\u0006\u0014\u0011\u000b\u0006\uffd0\uffef\u0003\u000b\u0011￣\u0006\u0015\f\u0012\uffd0\u000f\u0003\u000b\u0011\uffd0\u0015\u0006\r\uffd0\u0003\u0010", false).intern();
        int i2 = f2127 + 11;
        f2125 = i2 % 128;
        if (i2 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﻛ */
    public final String mo2139() {
        int i2 = f2127 + 81;
        f2125 = i2 % 128;
        String strIntern = (i2 % 2 != 0 ? m2163(5 / (TypedValue.complexToFraction(1, 1.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(1, 1.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 2, 27548 >> (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0006\u0004\ufff8", false) : m2163(2 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 4, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 159, "\u0000\u0006\u0004\ufff8", false)).intern();
        f2125 = (f2127 + 21) % 128;
        return strIntern;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ｋ */
    public final Class mo2140() {
        Class<MaioAds> cls;
        int i2 = f2127;
        int i3 = i2 + 89;
        f2125 = i3 % 128;
        if (i3 % 2 != 0) {
            cls = MaioAds.class;
            int i4 = 33 / 0;
        } else {
            cls = MaioAds.class;
        }
        int i5 = i2 + 19;
        f2125 = i5 % 128;
        if (i5 % 2 == 0) {
            return cls;
        }
        throw null;
    }

    @Override // com.p004ironsource.adqualitysdk.sdk.i.gi
    /* JADX INFO: renamed from: ﾇ */
    public final bg mo2141() {
        bw bwVar = new bw(mo2139());
        f2127 = (f2125 + 45) % 128;
        return bwVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2163(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f2126);
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
