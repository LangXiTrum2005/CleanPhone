package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ht extends hi<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int[] f2384 = {643679466, 1990603446, 937392882, -1435497678, -1206316122, -632523459, -128684757, 713104310, -1948639527, -551486796, -575105425, 279257216, -1987243815, -798791434, -796104397, 1659390285, -660380882, -1052543145};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2385 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2386;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private e f2387;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
        /* JADX INFO: renamed from: ﻐ */
        boolean mo1851(ht htVar, View view, MotionEvent motionEvent);
    }

    public ht(View.OnTouchListener onTouchListener, e eVar) {
        super(onTouchListener);
        this.f2387 = eVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2299(int[] iArr, int i10) {
        String str;
        synchronized (a.f61) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2384.clone();
                a.f58 = 0;
                while (true) {
                    int i11 = a.f58;
                    if (i11 < iArr.length) {
                        int i12 = iArr[i11];
                        char c4 = (char) (i12 >> 16);
                        cArr[0] = c4;
                        char c5 = (char) i12;
                        cArr[1] = c5;
                        char c10 = (char) (iArr[i11 + 1] >> 16);
                        cArr[2] = c10;
                        char c11 = (char) iArr[i11 + 1];
                        cArr[3] = c11;
                        a.f59 = (c4 << 16) + c5;
                        a.f60 = (c10 << 16) + c11;
                        a.m199(iArr2);
                        for (int i13 = 0; i13 < 16; i13++) {
                            int i14 = a.f59 ^ iArr2[i13];
                            a.f59 = i14;
                            int iM200 = a.m200(i14) ^ a.f60;
                            int i15 = a.f59;
                            a.f59 = iM200;
                            a.f60 = i15;
                        }
                        int i16 = a.f59;
                        int i17 = a.f60;
                        a.f59 = i17;
                        a.f60 = i16;
                        int i18 = i16 ^ iArr2[16];
                        a.f60 = i18;
                        int i19 = i17 ^ iArr2[17];
                        a.f59 = i19;
                        cArr[0] = (char) (i19 >>> 16);
                        cArr[1] = (char) i19;
                        cArr[2] = (char) (i18 >>> 16);
                        cArr[3] = (char) i18;
                        a.m199(iArr2);
                        int i20 = a.f58;
                        cArr2[i20 << 1] = cArr[0];
                        cArr2[(i20 << 1) + 1] = cArr[1];
                        cArr2[(i20 << 1) + 2] = cArr[2];
                        cArr2[(i20 << 1) + 3] = cArr[3];
                        a.f58 = i20 + 2;
                    } else {
                        str = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i10 = f2385 + 115;
        f2386 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2387.mo1851(this, view, motionEvent);
                throw null;
            }
            this.f2387.mo1851(this, view, motionEvent);
            if (mo800() == null) {
                f2385 = (f2386 + 29) % 128;
                return false;
            }
            boolean zOnTouch = mo800().onTouch(view, motionEvent);
            int i11 = f2386 + 17;
            f2385 = i11 % 128;
            if (i11 % 2 != 0) {
                return zOnTouch;
            }
            throw null;
        } catch (Throwable th2) {
            kl.m2899(m2299(new int[]{-619674477, 492407912, 715865185, 159038804, 581064256, 466261788, -244048829, 2054315667, -242700521, -843233620, -463594287, 402181104}, TextUtils.lastIndexOf("", '0') + 25).intern(), m2299(new int[]{-1017879121, -659549536, -924672409, 1064925788, -645111218, 1974626373, 1595602134, 695721593, -896341047, 1845836084, -891248376, 2049497812, -980645303, -737813008}, 28 - View.MeasureSpec.getMode(0)).intern(), th2, false);
        }
    }
}
