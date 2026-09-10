package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class hj extends gy<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2237 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2238 = 18;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2239 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private a f2240;

    public interface a {
        /* JADX INFO: renamed from: ﾒ */
        void mo1778(hj hjVar, MediaPlayer mediaPlayer);
    }

    public hj(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, a aVar) {
        super(onSeekCompleteListener);
        this.f2240 = aVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2196(int i2, int i3, int i4, String str, boolean z2) {
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
                    cArr2[i6] = (char) (cArr2[i6] - f2238);
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

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        f2239 = (f2237 + 123) % 128;
        try {
            this.f2240.mo1778(this, mediaPlayer);
        } catch (Throwable th) {
            kb.m2752(m2196(10 - (ViewConfiguration.getScrollBarSize() >> 8), 30 - TextUtils.lastIndexOf("", '0'), KeyEvent.keyCodeFromString("") + 120, "\n\u0007\t\uffdd\u0005\uffff\uffff￭\b￩\f\t\u000e\ufffb\f\t�\uffff\uffde\f\uffff\b\uffff\u000e\r\u0003￦\uffff\u000e\uffff\u0006", true).intern(), m2196(AndroidCharacter.getMirror('0') - 26, KeyEvent.keyCodeFromString("") + 35, 115 - Color.alpha(0), "\u000e\uffbf\u0011\u0004\r\u0004\u0013\u0012\b￫\u0001\ufff3\f\uffbf\r\b\uffbf\u0011\u000e\u0011\u0011￤\u0004\u0013\u0004\u000b\u000f\f\u000e￢\n\u0004\u0004\ufff2\r", true).intern(), th, false);
        }
        if (mo713() != null) {
            f2239 = (f2237 + 11) % 128;
            mo713().onSeekComplete(mediaPlayer);
        }
        int i2 = f2237 + 107;
        f2239 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 51 / 0;
        }
    }
}
