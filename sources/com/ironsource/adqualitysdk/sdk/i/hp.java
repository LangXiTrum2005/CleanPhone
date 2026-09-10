package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import com.ironsource.InterfaceC0435l1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hp extends hi<View.OnClickListener> implements View.OnClickListener {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2351 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2352 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2353 = 65028;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2354;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f2355;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private b f2356;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface b {
        /* JADX INFO: renamed from: ﻐ */
        void mo1849(hp hpVar, View view);
    }

    public hp(View.OnClickListener onClickListener, b bVar) {
        super(onClickListener);
        this.f2356 = bVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2287(char c4, String str, String str2, String str3, int i10) {
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
                        cArr6[i15] = (char) (((((long) (c10 ^ cArr[i15])) ^ f2355) ^ ((long) f2352)) ^ ((long) f2353));
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

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        f2354 = (f2351 + 25) % 128;
        try {
            this.f2356.mo1849(this, view);
        } catch (Throwable th2) {
            kl.m2899(m2287((char) Color.red(0), "\u0000\u0000\u0000\u0000", "촘婢븴⺒", "\ua9ff夤慶秘שּׂᷗ\ue88b뗑썧毳귷쎒싰覯\u2e6a辠ૡỉ좂\ude80㥬ꖈ\ueefe\ue170", ViewConfiguration.getPressedStateDuration() >> 16).intern(), m2287((char) (4142 - Color.red(0)), "\u0000\u0000\u0000\u0000", "擊♶⸶Ḑ", "鮒慟뒗Ჹ⻳왡跃귨\uf1ff\uf7b6࠴嚂㽘鴉ꋁ\ud835\ue209赵딡乑꺢罔垦淟⑁굍䣢寂", (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1).intern(), th2, false);
        }
        if (mo800() != null) {
            f2354 = (f2351 + 29) % 128;
            mo800().onClick(view);
        }
        f2354 = (f2351 + InterfaceC0435l1.d.b.f29114k) % 128;
    }
}
