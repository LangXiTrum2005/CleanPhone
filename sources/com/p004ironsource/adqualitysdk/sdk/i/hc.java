package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class hc extends gy<View.OnClickListener> implements View.OnClickListener {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2199 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2200 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2201 = -1214788315;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2202;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2203;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f2204;

    public interface d {
        /* JADX INFO: renamed from: ﻛ */
        void mo1775(hc hcVar, View view);
    }

    public hc(View.OnClickListener onClickListener, d dVar) {
        super(onClickListener);
        this.f2204 = dVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2182(int i2, char c2, String str, String str2, String str3) {
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
        synchronized (j.f2569) {
            try {
                char[] cArr4 = (char[]) cArr3.clone();
                char[] cArr5 = (char[]) cArr.clone();
                cArr4[0] = (char) (c2 ^ cArr4[0]);
                cArr5[2] = (char) (cArr5[2] + ((char) i2));
                int length = cArr2.length;
                char[] cArr6 = new char[length];
                j.f2567 = 0;
                while (true) {
                    int i3 = j.f2567;
                    if (i3 < length) {
                        int i4 = (i3 + 2) % 4;
                        int i5 = (i3 + 3) % 4;
                        int i6 = cArr4[i3 % 4] * 32718;
                        char c3 = cArr5[i4];
                        char c4 = (char) ((i6 + c3) % 65535);
                        j.f2568 = c4;
                        cArr5[i5] = (char) (((cArr4[i5] * 32718) + c3) / 65535);
                        cArr4[i5] = c4;
                        int i7 = j.f2567;
                        cArr6[i7] = (char) (((((long) (c4 ^ cArr2[i7])) ^ f2202) ^ ((long) f2201)) ^ ((long) f2200));
                        j.f2567 = i7 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i2 = f2199 + 103;
        f2203 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                this.f2204.mo1775(this, view);
                int i3 = 15 / 0;
            } else {
                this.f2204.mo1775(this, view);
            }
        } catch (Throwable th) {
            kb.m2752(m2182(ViewConfiguration.getScrollBarFadeDuration() >> 16, (char) (TextUtils.lastIndexOf("", '0') + 1), "\uda35\uf35d単酘", "菼璯舺訦类Χ솄鐈澳澂厤체緊\ud9a2㷌挩㨁鲱騕\ue589ル\udbd3貽十", "\u0000\u0000\u0000\u0000").intern(), m2182(TextUtils.getCapsMode("", 0, 0), (char) ((-16748787) - Color.rgb(0, 0, 0)), "횫\uf645൧\ud96f", "휣荑蠕⮳㴯旎レ湻苫ꀤବ음\ue468膉ࠫ㠟憜ꧭ竎㢻쥎ᕾ榦쩄懇卽잚㦎", "\u0000\u0000\u0000\u0000").intern(), th, false);
        }
        if (mo713() != null) {
            f2203 = (f2199 + 71) % 128;
            mo713().onClick(view);
            f2203 = (f2199 + 3) % 128;
        }
    }
}
