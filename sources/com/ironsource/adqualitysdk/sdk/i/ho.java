package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ho extends hi<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2347 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2348;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2349 = {'9', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', '[', 'k', 'i', 'i', 'l', 's', 'n', 'Z', 'X', 'd', 'k', 'i', 'h', 'j', 'k', 'a', '_', '^', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'F', '`', '[', 'W', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'I', 'G', 'n', '_', 'a', 'k', 'j', 'h', 'i', 'k', 'd'};

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private c f2350;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        /* JADX INFO: renamed from: ﾒ */
        void mo1848(ho hoVar, MediaPlayer mediaPlayer);
    }

    public ho(MediaPlayer.OnPreparedListener onPreparedListener, c cVar) {
        super(onPreparedListener);
        this.f2350 = cVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2286(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f2349, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        int i10 = f2347 + 59;
        f2348 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                this.f2350.mo1848(this, mediaPlayer);
                throw null;
            }
            this.f2350.mo1848(this, mediaPlayer);
            if (mo800() != null) {
                f2347 = (f2348 + 115) % 128;
                mo800().onPrepared(mediaPlayer);
            }
            f2348 = (f2347 + 95) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2286("\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001", new int[]{0, 27, 0, 0}, true).intern(), m2286("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001", new int[]{27, 31, 0, 0}, false).intern(), th2, false);
        }
    }
}
