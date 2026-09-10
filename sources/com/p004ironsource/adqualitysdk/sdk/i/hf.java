package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.ImageFormat;
import android.media.MediaPlayer;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes5.dex */
public final class hf extends gy<MediaPlayer.OnPreparedListener> implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2213 = 6693895711888939753L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2214 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2215 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private c f2216;

    public interface c {
        /* JADX INFO: renamed from: ﾒ */
        void mo1774(hf hfVar, MediaPlayer mediaPlayer);
    }

    public hf(MediaPlayer.OnPreparedListener onPreparedListener, c cVar) {
        super(onPreparedListener);
        this.f2216 = cVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2185(String str, int i2) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2055) {
            try {
                g.f2056 = i2;
                char[] cArr2 = new char[cArr.length];
                g.f2054 = 0;
                while (true) {
                    int i3 = g.f2054;
                    if (i3 < cArr.length) {
                        cArr2[i3] = (char) (((long) (cArr[i3] ^ (g.f2056 * i3))) ^ f2213);
                        g.f2054++;
                    } else {
                        str2 = new String(cArr2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str2;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        f2215 = (f2214 + 59) % 128;
        try {
            this.f2216.mo1774(this, mediaPlayer);
        } catch (Throwable th) {
            kb.m2752(m2185("骦鸺鏃钬衸质蛦뮰뽤뀨뗇꺟ꉆ꜄\u46994템쨖쿧삋쑎龜\uf2a5\uf673\ueb25\uecf3\ue1a9", ImageFormat.getBitsPerPixel(0) + 1214).intern(), m2185("骬庨ዽ혟詗丶β쟢뭑罏㍃\uf4baꣁ気⁐\ue460\ud9bc鷤儚ᕒ줵芩䛥㨬\ufe53뉷瞷⯩\uef0fꍋ杷", 50227 - TextUtils.getTrimmedLength("")).intern(), th, false);
        }
        if (mo713() != null) {
            mo713().onPrepared(mediaPlayer);
            f2215 = (f2214 + 21) % 128;
        }
    }
}
