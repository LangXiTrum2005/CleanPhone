package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public final class he extends gy<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2209 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f2210 = {AbstractJsonLexerKt.COLON, 'j', 'i', 'p', 'i', 'd', 'T', AbstractJsonLexerKt.BEGIN_LIST, 'k', 'i', 'i', 'l', 's', 'n', 'Z', AbstractJsonLexerKt.END_LIST, 'n', 'l', 'n', 'l', 'h', 'n', 'n', 'n', 'Y', 'X', '^', '`', 'p', AbstractJsonLexerKt.STRING, AbstractJsonLexerKt.BEGIN_LIST, 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'F', '`', AbstractJsonLexerKt.BEGIN_LIST, 'W', 'Z', 'n', 's', 'l', 'i', 'i', 'k', 'I', 'G', 'n', 'X', 'Y', 'n', 'n', 'n', 'h', 'l', 'n', 'l', 'n'};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2211;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private a f2212;

    public interface a {
        /* JADX INFO: renamed from: ﻛ */
        void mo1779(he heVar, MediaPlayer mediaPlayer);
    }

    public he(MediaPlayer.OnCompletionListener onCompletionListener, a aVar) {
        super(onCompletionListener);
        this.f2212 = aVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2184(boolean z2, int[] iArr, String str) throws UnsupportedEncodingException {
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
                System.arraycopy(f2210, i2, cArr, 0, i3);
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

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        try {
            this.f2212.mo1779(this, mediaPlayer);
            f2209 = (f2211 + 125) % 128;
        } catch (Throwable th) {
            kb.m2752(m2184(true, new int[]{0, 29, 0, 27}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001").intern(), m2184(false, new int[]{29, 33, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001").intern(), th, false);
        }
        if (mo713() != null) {
            f2209 = (f2211 + 37) % 128;
            mo713().onCompletion(mediaPlayer);
            f2209 = (f2211 + 33) % 128;
        }
    }
}
