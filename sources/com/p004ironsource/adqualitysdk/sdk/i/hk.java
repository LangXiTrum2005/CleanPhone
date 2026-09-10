package com.p004ironsource.adqualitysdk.sdk.i;

import android.view.MotionEvent;
import android.view.View;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class hk extends gy<View.OnTouchListener> implements View.OnTouchListener {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2241 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2242 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2243 = {'w', 254, 257, 257, 274, 268, 261, 250, 250, 270, 275, 268, 265, 265, 267, 251, 244, 260, 265, 272, 265, 266, 273, 272, 'I', 'l', 'k', 133, 128, '|', 127, 147, 152, 145, 142, 142, 144, 'n', 'l', 147, 134, 134, 151, 145, 138, AbstractJsonLexerKt.BEGIN_OBJ, 128, 151, 149, 149, 'n', 'i'};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f2244;

    public interface d {
        /* JADX INFO: renamed from: ﾒ */
        boolean mo1777(hk hkVar, View view, MotionEvent motionEvent);
    }

    public hk(View.OnTouchListener onTouchListener, d dVar) {
        super(onTouchListener);
        this.f2244 = dVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2197(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(CharEncoding.ISO_8859_1);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2186) {
            try {
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = new char[i3];
                System.arraycopy(f2243, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    h.f2185 = 0;
                    char c2 = 0;
                    while (true) {
                        int i6 = h.f2185;
                        if (i6 >= i3) {
                            break;
                        }
                        if (bArr[i6] == 1) {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c2);
                        } else {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c2);
                        }
                        c2 = cArr2[i6];
                        h.f2185 = i6 + 1;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i7 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i7, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i7);
                }
                if (z2) {
                    char[] cArr4 = new char[i3];
                    h.f2185 = 0;
                    while (true) {
                        int i8 = h.f2185;
                        if (i8 >= i3) {
                            break;
                        }
                        cArr4[i8] = cArr[(i3 - i8) - 1];
                        h.f2185 = i8 + 1;
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    h.f2185 = 0;
                    while (true) {
                        int i9 = h.f2185;
                        if (i9 >= i3) {
                            break;
                        }
                        cArr[i9] = (char) (cArr[i9] - iArr[2]);
                        h.f2185 = i9 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i2 = f2241 + 29;
        f2242 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                this.f2244.mo1777(this, view, motionEvent);
                throw null;
            }
            this.f2244.mo1777(this, view, motionEvent);
            if (mo713() != null) {
                return mo713().onTouch(view, motionEvent);
            }
            f2241 = (f2242 + 13) % 128;
            return false;
        } catch (Throwable th) {
            kb.m2752(m2197(false, new int[]{0, 24, 160, 0}, "\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001").intern(), m2197(false, new int[]{24, 28, 37, 21}, "\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001").intern(), th, false);
        }
    }
}
