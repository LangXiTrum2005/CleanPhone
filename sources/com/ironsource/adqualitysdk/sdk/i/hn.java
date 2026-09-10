package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class hn extends hi<MediaPlayer.OnCompletionListener> implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2339 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2340 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f2341 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2342 = 1477946169;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2343 = -1112470941;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2344 = {-35, 109, -107, 125, -127, 109, 98, -112, 79, -68, 99, -103, 103, -97, 111, 100, 115, -80, -111, 104, -101, 97, -105, -110, 109, -112, 66, -69, 113, -31, 58, -61, 48, -54, 60, 57, -58, 59, -23, 16, 58, -118, 107, -56, 50, -52, 52, -60, -49, -40, 47, -53, 34, -120, 119, -64, -116, 107, -58, 56, -59, -24};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2345 = 64;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private a f2346;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface a {
        /* JADX INFO: renamed from: ｋ */
        void mo1847(hn hnVar, MediaPlayer mediaPlayer);
    }

    public hn(MediaPlayer.OnCompletionListener onCompletionListener, a aVar) {
        super(onCompletionListener);
        this.f2346 = aVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2285(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2345;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2344;
                    i14 = bArr != null ? (byte) (bArr[f2343 + i12] + i13) : (short) (f2341[f2343 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2343 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2342);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2344;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2341;
                            int i17 = n.f3072;
                            n.f3072 = i17 - 1;
                            n.f3074 = (char) (n.f3075 + (((short) (sArr[i17] + s10)) ^ n.f3073));
                        }
                        sb2.append(n.f3074);
                        n.f3075 = n.f3074;
                        n.f3071++;
                    }
                }
                string = sb2.toString();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return string;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        f2340 = (f2339 + 55) % 128;
        try {
            this.f2346.mo1847(this, mediaPlayer);
        } catch (Throwable th2) {
            kl.m2899(m2285((short) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (-1477946090) - View.MeasureSpec.getSize(0), (-65) - TextUtils.indexOf("", "", 0), 1112470941 - (ViewConfiguration.getTapTimeout() >> 16), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + InterfaceC0435l1.d.b.f29111h)).intern(), m2285((short) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 1477946100, TextUtils.indexOf("", "") - 65, 1112470970 - KeyEvent.normalizeMetaState(0), (byte) ((-60) - TextUtils.lastIndexOf("", '0', 0))).intern(), th2, false);
        }
        if (mo800() != null) {
            mo800().onCompletion(mediaPlayer);
        }
        int i10 = f2340 + 85;
        f2339 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 12 / 0;
        }
    }
}
