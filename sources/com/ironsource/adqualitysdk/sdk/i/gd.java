package com.ironsource.adqualitysdk.sdk.i;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class gd extends gb {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static short[] f2150 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2151 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2152 = 0;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2153 = -1965536651;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static byte[] f2154 = {-45, 108, -106, 7, -119, 60, -125, 121, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f2155 = 95;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2156 = -1363000546;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final List<ef> f2157;

    public gd(List<ef> list) {
        this.f2157 = list;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m2237(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f2155;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f2154;
                    i14 = bArr != null ? (byte) (bArr[f2153 + i12] + i13) : (short) (f2150[f2153 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f2153 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f2156);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f2154;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f2150;
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

    /* JADX WARN: Code restructure failed: missing block: B:10:0x00d1, code lost:
    
        return r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0100, code lost:
    
        return m2237((short) (1 - (android.media.AudioTrack.getMaxVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMaxVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), android.widget.ExpandableListView.getPackedPositionGroup(0) + 1363000664, (android.media.AudioTrack.getMaxVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMaxVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 91, (android.os.SystemClock.currentThreadTimeMillis() > (-1) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1) ? 0 : -1)) + 1965536654, (byte) (android.os.Process.getGidForName("") - 109)).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
    
        if (r13.f2157 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r13.f2157 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r0 = new java.lang.StringBuilder();
        r0.append(m2237((short) android.text.TextUtils.indexOf("", "", 0), 1363000664 - (android.view.ViewConfiguration.getTapTimeout() >> 16), (-91) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1965536651, (byte) (android.graphics.Color.rgb(0, 0, 0) + 16777341)).intern());
        r0.append(android.text.TextUtils.join(m2237((short) (1 - (android.view.ViewConfiguration.getScrollFriction() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.view.ViewConfiguration.getScrollFriction() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1363000591, (-94) - android.text.TextUtils.lastIndexOf("", '0', 0), 1965536654 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) ((-13) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16))).intern(), r13.f2157));
        r13 = com.google.android.gms.internal.measurement.f2.m(r0, m2237((short) (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), 1363000605 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1)), android.graphics.drawable.Drawable.resolveOpacity(0, 0) - 94, ((android.os.Process.getThreadPriority(0) + 20) >> 6) + 1965536655, (byte) ((android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)) + 62)));
        com.ironsource.adqualitysdk.sdk.i.gd.f2151 = (com.ironsource.adqualitysdk.sdk.i.gd.f2152 + 87) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.gd.toString():java.lang.String");
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* JADX INFO: renamed from: ﻐ */
    public final ea mo2220(ee eeVar, cl clVar) {
        Iterator<ef> it = this.f2157.iterator();
        f2151 = (f2152 + 97) % 128;
        while (true) {
            eq eqVarM2170 = null;
            if (!it.hasNext()) {
                ea eaVar = new ea(null);
                f2151 = (f2152 + 121) % 128;
                return eaVar;
            }
            f2151 = (f2152 + 15) % 128;
            ef next = it.next();
            if (next instanceof eq) {
                eqVarM2170 = (eq) next;
            } else if (next instanceof ej) {
                f2151 = (f2152 + 79) % 128;
                eqVarM2170 = ((ej) next).m2170();
            }
            if (eqVarM2170 != null) {
                eeVar.m2156(Arrays.asList(eqVarM2170.m2189()));
            }
            next.mo2164(eeVar, clVar);
        }
    }
}
