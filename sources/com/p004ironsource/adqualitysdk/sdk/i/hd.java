package com.p004ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class hd extends gy<MediaPlayer.OnInfoListener> implements MediaPlayer.OnInfoListener {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int[] f2205 = {1260408040, 1699075126, 1632814538, 2069126387, -544002379, -755987528, -1610226379, -1252824617, 1498879879, 1126469655, 1688257541, 739692328, 167538209, -764167520, -634473638, -495941216, -1708373931, 1000449791};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2206 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2207 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private e f2208;

    public interface e {
        /* JADX INFO: renamed from: ﻛ */
        boolean mo1776(hd hdVar, MediaPlayer mediaPlayer, int i2, int i3);
    }

    public hd(MediaPlayer.OnInfoListener onInfoListener, e eVar) {
        super(onInfoListener);
        this.f2208 = eVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2183(int[] iArr, int i2) {
        String str;
        synchronized (d.f1586) {
            try {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2205.clone();
                d.f1584 = 0;
                while (true) {
                    int i3 = d.f1584;
                    if (i3 < iArr.length) {
                        int i4 = iArr[i3];
                        char c2 = (char) (i4 >> 16);
                        cArr[0] = c2;
                        char c3 = (char) i4;
                        cArr[1] = c3;
                        char c4 = (char) (iArr[i3 + 1] >> 16);
                        cArr[2] = c4;
                        char c5 = (char) iArr[i3 + 1];
                        cArr[3] = c5;
                        d.f1587 = (c2 << 16) + c3;
                        d.f1585 = (c4 << 16) + c5;
                        d.m1788(iArr2);
                        for (int i5 = 0; i5 < 16; i5++) {
                            int i6 = d.f1587 ^ iArr2[i5];
                            d.f1587 = i6;
                            int iM1787 = d.m1787(i6) ^ d.f1585;
                            int i7 = d.f1587;
                            d.f1587 = iM1787;
                            d.f1585 = i7;
                        }
                        int i8 = d.f1587;
                        int i9 = d.f1585;
                        d.f1587 = i9;
                        d.f1585 = i8;
                        int i10 = i8 ^ iArr2[16];
                        d.f1585 = i10;
                        int i11 = i9 ^ iArr2[17];
                        d.f1587 = i11;
                        cArr[0] = (char) (i11 >>> 16);
                        cArr[1] = (char) i11;
                        cArr[2] = (char) (i10 >>> 16);
                        cArr[3] = (char) i10;
                        d.m1788(iArr2);
                        int i12 = d.f1584;
                        cArr2[i12 << 1] = cArr[0];
                        cArr2[(i12 << 1) + 1] = cArr[1];
                        cArr2[(i12 << 1) + 2] = cArr[2];
                        cArr2[(i12 << 1) + 3] = cArr[3];
                        d.f1584 = i12 + 2;
                    } else {
                        str = new String(cArr2, 0, i2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        try {
            this.f2208.mo1776(this, mediaPlayer, i2, i3);
            f2207 = (f2206 + 79) % 128;
        } catch (Throwable th) {
            kb.m2752(m2183(new int[]{80066108, 207298318, -1549697645, 1463085415, 1600108361, 1088065656, -859895970, -1615364345, 381713224, -1800873089, 1548957156, -1093168547}, 23 - TextUtils.indexOf("", "", 0)).intern(), m2183(new int[]{-681051340, 1754331367, -448412854, -337925248, 1062563970, 1504136524, 1569156958, -594432613, 1990793783, 2125621103, 134399651, 2066719541, -550159074, 727555531}, 28 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), th, false);
        }
        if (mo713() == null) {
            return false;
        }
        int i4 = f2206 + 63;
        f2207 = i4 % 128;
        if (i4 % 2 != 0) {
            return mo713().onInfo(mediaPlayer, i2, i3);
        }
        boolean zOnInfo = mo713().onInfo(mediaPlayer, i2, i3);
        int i5 = 75 / 0;
        return zOnInfo;
    }
}
