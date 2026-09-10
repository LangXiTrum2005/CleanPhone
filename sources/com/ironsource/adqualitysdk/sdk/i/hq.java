package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hq extends hi<MediaPlayer.OnSeekCompleteListener> implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2357 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2358 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2359 = 47709;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2360 = 17407;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f2361 = 6734;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f2362 = 9950;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private d f2363;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface d {
        /* JADX INFO: renamed from: ｋ */
        void mo1846(hq hqVar, MediaPlayer mediaPlayer);
    }

    public hq(MediaPlayer.OnSeekCompleteListener onSeekCompleteListener, d dVar) {
        super(onSeekCompleteListener);
        this.f2363 = dVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2288(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2362)) ^ ((c5 >>> 5) + f2360)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2359) ^ ((c10 + i12) ^ ((c10 << 4) + f2361))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        try {
            this.f2363.mo1846(this, mediaPlayer);
            f2358 = (f2357 + 97) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2288("튽窣塹㌷홍໗⋢晖礷宰ю芛텫腹犢䈧䖑唳팢\ud89c\ue8c6첩픙㳩⩙⚜\u128f\uf688凞᮴꽖\ud81d", 31 - (Process.myPid() >> 22)).intern(), m2288("뎏桱慔䫺꼌ꬰŃ좈Ｎ᧣雛㧫犢䈧䖑唳팢\ud89c\ue8c6첩蓑愀㳻粎ᮃ㺥秳\uf6df荍뒽䨧錜ꎵ鏷唄᳚", 35 - Color.green(0)).intern(), th2, false);
        }
        if (mo800() != null) {
            f2358 = (f2357 + 81) % 128;
            mo800().onSeekComplete(mediaPlayer);
        }
    }
}
