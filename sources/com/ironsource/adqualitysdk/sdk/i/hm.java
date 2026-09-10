package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.text.TextUtils;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hm extends hi<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2332 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2333 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2334 = 136;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f2335 = true;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f2336 = true;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2337 = {215, 246, 209, 238, 247, 212, 241, 251, 252, 237, 250, 204, 235, 233, 205, 168, 245, 220, 234};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private e f2338;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e {
        /* JADX INFO: renamed from: ｋ */
        boolean mo1850(hm hmVar, MediaPlayer mediaPlayer, int i10, int i11);
    }

    public hm(MediaPlayer.OnInfoListener onInfoListener, e eVar) {
        super(onInfoListener);
        this.f2338 = eVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2284(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (k.f2932) {
            try {
                char[] cArr2 = f2337;
                int i11 = f2334;
                if (f2335) {
                    int length = bArr.length;
                    k.f2931 = length;
                    char[] cArr3 = new char[length];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i12 = k.f2933;
                        int i13 = k.f2931 - 1;
                        int i14 = k.f2933;
                        cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                        k.f2933 = i14 + 1;
                    }
                    return new String(cArr3);
                }
                if (f2336) {
                    int length2 = cArr.length;
                    k.f2931 = length2;
                    char[] cArr4 = new char[length2];
                    k.f2933 = 0;
                    while (k.f2933 < k.f2931) {
                        int i15 = k.f2933;
                        int i16 = k.f2931 - 1;
                        int i17 = k.f2933;
                        cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                        k.f2933 = i17 + 1;
                    }
                    return new String(cArr4);
                }
                int length3 = iArr.length;
                k.f2931 = length3;
                char[] cArr5 = new char[length3];
                k.f2933 = 0;
                while (k.f2933 < k.f2931) {
                    int i18 = k.f2933;
                    int i19 = k.f2931 - 1;
                    int i20 = k.f2933;
                    cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                    k.f2933 = i20 + 1;
                }
                return new String(cArr5);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        int i12 = f2333 + 119;
        f2332 = i12 % 128;
        try {
            if (i12 % 2 != 0) {
                this.f2338.mo1850(this, mediaPlayer, i10, i11);
                int i13 = 92 / 0;
            } else {
                this.f2338.mo1850(this, mediaPlayer, i10, i11);
            }
        } catch (Throwable th2) {
            kl.m2899(m2284(null, TextUtils.lastIndexOf("", '0', 0) + 128, null, "\u008b\u0085\u0089\u008e\u008b\u0085\u008d\u008a\u008c\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0082\u0083\u0082\u0081").intern(), m2284(null, (-16777089) - Color.rgb(0, 0, 0), null, "\u0085\u0084\u0082\u0083\u0082\u0085\u0090\u008b\u008a\u0082\u008a\u0089\u0088\u0087\u0086\u0093\u0092\u0091\u0090\u0082\u0087\u0090\u008b\u0085\u008b\u008b\u008f").intern(), th2, false);
        }
        if (mo800() == null) {
            return false;
        }
        f2332 = (f2333 + 119) % 128;
        return mo800().onInfo(mediaPlayer, i10, i11);
    }
}
