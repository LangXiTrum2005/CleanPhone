package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: loaded from: classes5.dex */
public final class fp extends fq {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2001 = -157868112;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f2002 = {-31, -102, 76, -113, -34, -34, -34, -31, -69, -48, -48};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2003 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f2004 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static short[] f2005 = null;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2006 = -523179864;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f2007 = 35;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fq f2008;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private fq f2009;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ee f2010;

    public fp(ee eeVar, fq fqVar, fq fqVar2) {
        this.f2010 = eeVar;
        this.f2009 = fqVar;
        this.f2008 = fqVar2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2130(byte b2, short s, int i2, int i3, int i4) {
        String string;
        synchronized (k.f2833) {
            try {
                StringBuilder sb = new StringBuilder();
                int i5 = f2007;
                int i6 = i2 + i5;
                int i7 = i6 == -1 ? 1 : 0;
                if (i7 != 0) {
                    byte[] bArr = f2002;
                    i6 = bArr != null ? (byte) (bArr[f2006 + i3] + i5) : (short) (f2005[f2006 + i3] + i5);
                }
                if (i6 > 0) {
                    k.f2836 = ((i3 + i6) - 2) + f2006 + i7;
                    k.f2834 = b2;
                    char c2 = (char) (i4 + f2001);
                    k.f2837 = c2;
                    sb.append(c2);
                    k.f2835 = k.f2837;
                    k.f2838 = 1;
                    while (k.f2838 < i6) {
                        byte[] bArr2 = f2002;
                        if (bArr2 != null) {
                            int i8 = k.f2836;
                            k.f2836 = i8 - 1;
                            k.f2837 = (char) (k.f2835 + (((byte) (bArr2[i8] + s)) ^ k.f2834));
                        } else {
                            short[] sArr = f2005;
                            int i9 = k.f2836;
                            k.f2836 = i9 - 1;
                            k.f2837 = (char) (k.f2835 + (((short) (sArr[i9] + s)) ^ k.f2834));
                        }
                        sb.append(k.f2837);
                        k.f2835 = k.f2837;
                        k.f2838++;
                    }
                }
                string = sb.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return string;
    }

    public final boolean equals(Object obj) {
        int i2 = f2003;
        f2004 = (i2 + 121) % 128;
        if (this == obj) {
            f2004 = (i2 + 33) % 128;
            return true;
        }
        if (obj != null) {
            f2004 = (i2 + 37) % 128;
            if (fp.class == obj.getClass()) {
                fp fpVar = (fp) obj;
                ee eeVar = this.f2010;
                if (eeVar == null ? fpVar.f2010 != null : !eeVar.equals(fpVar.f2010)) {
                    return false;
                }
                fq fqVar = this.f2009;
                if (fqVar == null ? fpVar.f2009 != null : !fqVar.equals(fpVar.f2009)) {
                    return false;
                }
                fq fqVar2 = this.f2008;
                if (fqVar2 != null) {
                    f2003 = (f2004 + 55) % 128;
                    return fqVar2.equals(fpVar.f2008);
                }
                if (fpVar.f2008 == null) {
                    int i3 = f2004 + 39;
                    f2003 = i3 % 128;
                    return i3 % 2 != 0;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i2;
        ee eeVar = this.f2010;
        int iHashCode2 = 0;
        if (eeVar != null) {
            f2003 = (f2004 + 5) % 128;
            iHashCode = eeVar.hashCode();
            f2003 = (f2004 + 51) % 128;
        } else {
            iHashCode = 0;
        }
        int i3 = iHashCode * 31;
        fq fqVar = this.f2009;
        int iHashCode3 = (i3 + (fqVar != null ? fqVar.hashCode() : 0)) * 31;
        fq fqVar2 = this.f2008;
        if (fqVar2 != null) {
            f2004 = (f2003 + 85) % 128;
            iHashCode2 = fqVar2.hashCode();
            i2 = f2003 + 53;
        } else {
            i2 = f2003 + 89;
        }
        f2004 = i2 % 128;
        return iHashCode3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(m2130((byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 109), ((Process.getThreadPriority(0) + 20) >> 6) - 36, 523179864 - (ViewConfiguration.getScrollBarSize() >> 8), 157868217 - KeyEvent.normalizeMetaState(0)).intern());
        sb.append(this.f2010);
        sb.append(m2130((byte) View.MeasureSpec.getMode(0), (short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 16), (-36) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 523179869, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 157868152).intern());
        if (this.f2009 instanceof fk) {
            sb.append(m2130((byte) (ViewConfiguration.getScrollBarSize() >> 8), (short) ((Process.myPid() >> 22) - 57), (-35) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 523179870, 157868143 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            f2004 = (f2003 + 125) % 128;
        } else {
            sb.append(m2130((byte) (ViewConfiguration.getTouchSlop() >> 8), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 29), View.resolveSizeAndState(0, 0, 0) - 36, TextUtils.indexOf("", "") + 523179870, 157868122 - View.resolveSizeAndState(0, 0, 0)).intern());
        }
        sb.append(this.f2009);
        fq fqVar = this.f2008;
        if (fqVar != null) {
            int i2 = f2004;
            int i3 = i2 + 117;
            f2003 = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z2 = fqVar instanceof fk;
                throw null;
            }
            if (fqVar instanceof fk) {
                f2003 = (i2 + 93) % 128;
                sb.append(m2130((byte) TextUtils.getTrimmedLength(""), (short) (ExpandableListView.getPackedPositionChild(0L) - 56), (-36) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 523179869 - (ViewConfiguration.getJumpTapTimeout() >> 16), 157868144 - KeyEvent.normalizeMetaState(0)).intern());
            } else {
                sb.append(m2130((byte) KeyEvent.keyCodeFromString(""), (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 30), (-16777252) - Color.rgb(0, 0, 0), 523179870 - TextUtils.getOffsetBefore("", 0), 157868122 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
            }
            sb.append(m2130((byte) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 55), (-35) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 523179871 - TextUtils.indexOf("", "", 0, 0), 157868212 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
            if (this.f2008 instanceof fk) {
                sb.append(m2130((byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 57), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 36, 523179869 - View.getDefaultSize(0, 0), 157868144 - View.combineMeasuredStates(0, 0)).intern());
            } else {
                sb.append(m2130((byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (short) ((-29) - (ViewConfiguration.getWindowTouchSlop() >> 8)), Color.blue(0) - 36, 523179871 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 157868122).intern());
            }
            sb.append(this.f2008);
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return r2.f2009.mo2122(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r0 = r2.f2008;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if (r0 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return r0.mo2122(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        r3 = new com.p004ironsource.adqualitysdk.sdk.i.du(java.lang.Boolean.FALSE);
        com.p004ironsource.adqualitysdk.sdk.i.fp.f2003 = (com.p004ironsource.adqualitysdk.sdk.i.fp.f2004 + 89) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (r2.f2010.m2086(r3, r4).m2047() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r2.f2010.m2086(r3, r4).m2047() != false) goto L9;
     */
    @Override // com.p004ironsource.adqualitysdk.sdk.i.fq
    /* JADX INFO: renamed from: ｋ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.p004ironsource.adqualitysdk.sdk.i.du mo2122(com.p004ironsource.adqualitysdk.sdk.i.dr r3, com.p004ironsource.adqualitysdk.sdk.i.cp r4) {
        /*
            r2 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.fp.f2003
            int r0 = r0 + 19
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fp.f2004 = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L1d
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r2.f2010
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m2086(r3, r4)
            boolean r0 = r0.m2047()
            r1 = 34
            int r1 = r1 / 0
            if (r0 == 0) goto L30
            goto L29
        L1d:
            com.ironsource.adqualitysdk.sdk.i.ee r0 = r2.f2010
            com.ironsource.adqualitysdk.sdk.i.du r0 = r0.m2086(r3, r4)
            boolean r0 = r0.m2047()
            if (r0 == 0) goto L30
        L29:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r2.f2009
            com.ironsource.adqualitysdk.sdk.i.du r3 = r0.mo2122(r3, r4)
            return r3
        L30:
            com.ironsource.adqualitysdk.sdk.i.fq r0 = r2.f2008
            if (r0 == 0) goto L39
            com.ironsource.adqualitysdk.sdk.i.du r3 = r0.mo2122(r3, r4)
            return r3
        L39:
            com.ironsource.adqualitysdk.sdk.i.du r3 = new com.ironsource.adqualitysdk.sdk.i.du
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.<init>(r4)
            int r4 = com.p004ironsource.adqualitysdk.sdk.i.fp.f2004
            int r4 = r4 + 89
            int r4 = r4 % 128
            com.p004ironsource.adqualitysdk.sdk.i.fp.f2003 = r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.fp.mo2122(com.ironsource.adqualitysdk.sdk.i.dr, com.ironsource.adqualitysdk.sdk.i.cp):com.ironsource.adqualitysdk.sdk.i.du");
    }
}
