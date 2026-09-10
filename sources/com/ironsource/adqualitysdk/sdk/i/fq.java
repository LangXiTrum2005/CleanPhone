package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class fq extends fm<String> {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2075 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2076 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2077 = 549531294;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static byte[] f2078 = {57, -96, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2079 = -1968038511;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2080 = null;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2081 = 45;

    public fq(String str) {
        super(eb.m2127(str));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2216(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2081;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2078;
                    i14 = bArr != null ? (byte) (bArr[f2079 + i12] + i13) : (short) (f2080[f2079 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2079 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2077);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2078;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2080;
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

    @Override // com.ironsource.adqualitysdk.sdk.i.fm
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2216((short) (Color.blue(0) - 116), (-549531260) - KeyEvent.getDeadChar(0, 0), (-44) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1968038510 - TextUtils.lastIndexOf("", '0', 0, 0), (byte) Gravity.getAbsoluteGravity(0, 0)).intern());
        sb2.append(super.toString().replace(m2216((short) ((-71) - TextUtils.indexOf((CharSequence) "", '0')), (-549531202) - View.MeasureSpec.getSize(0), (-44) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1968038511 - (Process.myPid() >> 22), (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern(), m2216((short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 57), (ViewConfiguration.getJumpTapTimeout() >> 16) - 549531202, (-44) - ((byte) KeyEvent.getModifierMetaStateMask()), 1968038511 - (Process.myTid() >> 22), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).intern()).replace(m2216((short) ((ViewConfiguration.getTapTimeout() >> 16) - 116), (-549531259) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 45, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1968038510, (byte) (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), m2216((short) (38 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), View.resolveSize(0, 0) - 549531202, (-43) - (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 1968038512, (byte) Color.alpha(0)).intern()));
        String strM = f2.m(sb2, m2216((short) ((-116) - View.MeasureSpec.getSize(0)), 53684 - AndroidCharacter.getMirror('0'), Process.getGidForName("") - 43, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1968038511, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)));
        int i10 = f2075 + 31;
        f2076 = i10 % 128;
        if (i10 % 2 == 0) {
            return strM;
        }
        throw null;
    }
}
