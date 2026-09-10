package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class dk extends cw implements ch {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f1737 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f1738 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f1739;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1745;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f1746;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String f1749;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1743 = {'f', 60123, 54576, 49254, 43723, 38149, 32870, 27303, 21781, 16496, 48488, 22480, 26675, 32082, 6092, 10259, 15713, 55228, 59400, 64881, 38840, 43027, 48509, 22444, 26866, 32076, 's', 60107, 54568, 49227, 43740, 38196, 32881, 27316, 21781, 16496, 10937, 5407, 's', 60107, 54568, 49219, 43723, 38176, 32865, 27310, 21788, 16493, 10927, 5384, 'M', 60083, 54762, 49267, 43652, 45977, 22817, 26306, 29616, 6462, 9965, 13213, 55629, 59127, 62353, 39240, 42724, 45963, 22872, 's', 60107, 54568, 49219, 43723, 38181, 32865, 27313, 21764, 16497, 10913, 2275, 57935, 56748, 51404, 41550, 40333, 35057, 25122, 23959, 18683, 8763, 7562, 2281, 57892, 56677, 51416, 41488, 40260, 35033, 25091, 23929, 55965, 12292, 4086, 6845, 28690, 20382, 23227, 45170, 36801, 39594, 61553, 53122, 55957, 12406, 3897, 6793, 28749, 20258, 23181, 45148, 36647, 39614, 61537, 53023, 56044, 12367, 3861, 6902, 29113, 20225, 23250, 45454, 36729, 39618, 61861, 53042, 56014, 12703, 3960, 6707, 29086, 20323, 23156, 45455, 36693, 39482, 61940, 53061, 55836, 12726, 3843, '\''};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1741 = -2582761815048852818L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1740 = 1623520804;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1742 = 29;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f1736 = -1109589689;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static byte[] f1735 = {-23, 13, -9, 0, 13, -1, -19, -64, -1, 6, -11, 19, -8, 5, -1, -8, -28, -13, -8, 12, 19, -36, 3, -5, 17, -2, -9, 0, -1, 44, -49, 15, -2, -7, -8, 12, 19, -29, -7, 3, -8, 3, 15, 23, -22, -1, -15, 19, -8, 5, -1, 24, -39, 15, -14, -7, -8, 12, 19, -29, -7, 3, -8, 3, 15, 23, -22, -1, -15, 19, -8, 5, -1, 24, -39, 15, -2, -17, -16, 7, 9, -17, 17, 19, -18, 35, -51, 15, -2, -12, 35, -45, 9, 0, -13, 15, -16, 7, 0, -9, 47, -45, 42, -43, 15, -2, -15, 27, -43, 6, 9, -8, 8, 2, 2, -11, 28, -36, 15, -2, -18, -2, -5, 1, -2, 50, -48, 42, -43, 15, -2, -23, -1, -4, 41, -37, -5, -16, -19, 19, 29, -42, -1, 6, -11, 19, -8, 5, -1, 24};

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1748 = "";

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private double f1747 = -1.0d;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f1744 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private boolean m1998() {
        int i10 = f1737 + 75;
        f1738 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = this.f1745;
        if (i11 == 0) {
            int i12 = 27 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private String m1999() {
        String strIntern;
        if (m1998()) {
            int i10 = f1737 + 27;
            f1738 = i10 % 128;
            strIntern = (i10 % 2 == 0 ? m2001((char) (16777216 >> Color.rgb(1, 0, 1)), TextUtils.getOffsetBefore("", 1), InterfaceC0435l1.d.b.f29107d % (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1))) : m2001((char) (Color.rgb(0, 0, 0) + 16777216), TextUtils.getOffsetBefore("", 0), 10 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern();
        } else {
            strIntern = m2007((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), ExpandableListView.getPackedPositionType(0L) + 1109589787, (-31) - TextUtils.lastIndexOf("", '0'), (-1623520804) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2007((short) View.getDefaultSize(0, 0), Drawable.resolveOpacity(0, 0) + 1109589798, View.MeasureSpec.getSize(0) - 30, Color.rgb(0, 0, 0) - 1606743582, (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()))).intern());
        sb2.append(this.f1748);
        String strK = f2.k(m2007((short) TextUtils.getOffsetAfter("", 0), 1109589736 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (-30) - Color.alpha(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 1623520788, (byte) Color.argb(0, 0, 0, 0)), strIntern, sb2);
        int i11 = f1737 + 97;
        f1738 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 39 / 0;
        }
        return strK;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String m2000() {
        int i10 = f1738;
        int i11 = i10 + 61;
        f1737 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
        String str = this.f1746;
        int i12 = i10 + 7;
        f1737 = i12 % 128;
        if (i12 % 2 == 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2002(String str) {
        int i10 = f1738;
        this.f1748 = str;
        f1737 = (i10 + 23) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String m2006() {
        int i10 = (f1738 + 95) % 128;
        f1737 = i10;
        String str = this.f1749;
        int i11 = i10 + 21;
        f1738 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 65 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private String m2008() {
        int i10 = f1737;
        String str = this.f1748;
        int i11 = i10 + 91;
        f1738 = i11 % 128;
        if (i11 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m2010(String str) {
        int i10 = f1737;
        int i11 = i10 + 25;
        f1738 = i11 % 128;
        int i12 = i11 % 2;
        this.f1749 = str;
        if (i12 == 0) {
            throw null;
        }
        f1738 = (i10 + InterfaceC0435l1.d.b.f29109f) % 128;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2011(Double d10) {
        f1737 = (f1738 + InterfaceC0435l1.d.b.f29110g) % 128;
        this.f1747 = d10.doubleValue();
        f1737 = (f1738 + 57) % 128;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean m2003() {
        int i10 = (f1738 + 43) % 128;
        f1737 = i10;
        boolean z10 = this.f1744;
        int i11 = i10 + 61;
        f1738 = i11 % 128;
        if (i11 % 2 != 0) {
            return z10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Double m2004() {
        int i10 = f1737 + 49;
        f1738 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        Double dValueOf = Double.valueOf(this.f1747);
        int i11 = f1737 + 119;
        f1738 = i11 % 128;
        if (i11 % 2 != 0) {
            return dValueOf;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2007(short s10, int i10, int i11, int i12, byte b10) {
        String string;
        synchronized (n.f3070) {
            try {
                StringBuilder sb2 = new StringBuilder();
                int i13 = f1742;
                int i14 = i11 + i13;
                int i15 = i14 == -1 ? 1 : 0;
                if (i15 != 0) {
                    byte[] bArr = f1735;
                    i14 = bArr != null ? (byte) (bArr[f1740 + i12] + i13) : (short) (f1739[f1740 + i12] + i13);
                }
                if (i14 > 0) {
                    n.f3072 = ((i12 + i14) - 2) + f1740 + i15;
                    n.f3073 = b10;
                    char c4 = (char) (i10 + f1736);
                    n.f3074 = c4;
                    sb2.append(c4);
                    n.f3075 = n.f3074;
                    n.f3071 = 1;
                    while (n.f3071 < i14) {
                        byte[] bArr2 = f1735;
                        if (bArr2 != null) {
                            int i16 = n.f3072;
                            n.f3072 = i16 - 1;
                            n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                        } else {
                            short[] sArr = f1739;
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m2009() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put(is.f2610, this.f1749);
            double d10 = this.f1747;
            if (d10 > -1.0d) {
                f1737 = (f1738 + 61) % 128;
                jSONObject2.put(is.f2559, d10);
            }
            jSONObject2.put(is.f2560, this.f1746);
        } catch (JSONException unused) {
        }
        try {
            if (jSONObject2.length() > 0) {
                int i10 = f1738;
                int i11 = i10 + 43;
                f1737 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
                if (this.f1744) {
                    f1737 = (i10 + InterfaceC0435l1.d.b.f29110g) % 128;
                    jSONObject2.put(is.f2562, true);
                }
                jSONObject.put(is.f2558, jSONObject2);
            }
        } catch (JSONException unused2) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2013(boolean z10) {
        int i10 = f1738 + 89;
        f1737 = i10 % 128;
        int i11 = i10 % 2;
        this.f1744 = z10;
        if (i11 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2001(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1743[i10 + i12]) ^ (((long) i12) * f1741)) ^ ((long) c4));
                        c.f1154 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2005(boolean z10) {
        int i10 = (f1737 + 21) % 128;
        f1738 = i10;
        this.f1745 = z10;
        int i11 = i10 + 123;
        f1737 = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ironsource.adqualitysdk.sdk.i.ch
    /* JADX INFO: renamed from: ﾒ */
    public final Object mo821(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
        cl clVar2;
        try {
            switch (str.hashCode()) {
                case -2010356102:
                    if (str.equals(m2001((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 2181), 79 - TextUtils.indexOf((CharSequence) "", '0'), (Process.myTid() >> 22) + 21).intern())) {
                        return m1999();
                    }
                    clVar2 = clVar;
                    try {
                        new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                        return null;
                    } catch (Exception e10) {
                        e = e10;
                        String strM1643 = clVar2.m1643();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2001((char) (Process.getGidForName("") + 56025), 101 - ExpandableListView.getPackedPositionGroup(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 51).intern());
                        sb2.append(str);
                        sb2.append(m2001((char) (ViewConfiguration.getTapTimeout() >> 16), (Process.myPid() >> 22) + 152, 1 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                        cn.m1708(strM1643, sb2.toString(), e);
                        return null;
                    }
                case -1679773410:
                    if (str.equals(m2001((char) (Process.getGidForName("") + 46059), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 54, (KeyEvent.getMaxKeyCode() >> 16) + 14).intern())) {
                        m2012((String) cw.m1805(list, 0, String.class));
                        return null;
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case -1457409854:
                    if (str.equals(m2007((short) View.MeasureSpec.makeMeasureSpec(0, 0), 1109589792 - ((Process.getThreadPriority(0) + 20) >> 6), (-30) - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) - 1623520787, (byte) TextUtils.getCapsMode("", 0, 0)).intern())) {
                        return m2006();
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case -1033133001:
                    if (str.equals(m2001((char) View.MeasureSpec.makeMeasureSpec(0, 0), 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 12 - (Process.myTid() >> 22)).intern())) {
                        m2011((Double) cw.m1805(list, 0, Double.class));
                        return null;
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case -869156349:
                    if (str.equals(m2007((short) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1109589805 - (ViewConfiguration.getJumpTapTimeout() >> 16), (-30) - View.getDefaultSize(0, 0), Drawable.resolveOpacity(0, 0) - 1623520673, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern())) {
                        return m2009();
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case -303276684:
                    if (str.equals(m2007((short) View.combineMeasuredStates(0, 0), 1109589791 - TextUtils.lastIndexOf("", '0', 0), ExpandableListView.getPackedPositionType(0L) - 30, (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1623520749, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1)).intern())) {
                        f1737 = (f1738 + 35) % 128;
                        return m2008();
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 91962794:
                    if (str.equals(m2007((short) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 1109589791 - TextUtils.indexOf((CharSequence) "", '0'), (-30) - (ViewConfiguration.getPressedStateDuration() >> 16), (-1623520698) - KeyEvent.getDeadChar(0, 0), (byte) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1)).intern())) {
                        return m2000();
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 701278346:
                    if (str.equals(m2001((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 38 - KeyEvent.normalizeMetaState(0), 17 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                        int i10 = f1737 + 31;
                        f1738 = i10 % 128;
                        if (i10 % 2 != 0) {
                            m2005(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                            return null;
                        }
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 1006114614:
                    if (str.equals(m2001((char) (ImageFormat.getBitsPerPixel(0) + 48412), TextUtils.indexOf((CharSequence) "", '0') + 11, 15 - ((byte) KeyEvent.getModifierMetaStateMask())).intern())) {
                        m2010((String) cw.m1805(list, 0, String.class));
                        return null;
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 1009851624:
                    if (str.equals(m2007((short) (ViewConfiguration.getEdgeSlop() >> 16), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589804, (ViewConfiguration.getScrollBarSize() >> 8) - 30, (-1623520772) - ImageFormat.getBitsPerPixel(0), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern())) {
                        m2002((String) cw.m1805(list, 0, String.class));
                        return null;
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 1314266045:
                    if (str.equals(m2001((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.indexOf("", "", 0) + 69, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10).intern())) {
                        m2013(((Boolean) cw.m1805(list, 0, Boolean.class)).booleanValue());
                        return Boolean.valueOf(m2003());
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 1402845873:
                    if (str.equals(m2007((short) (KeyEvent.getMaxKeyCode() >> 16), 1109589792 - (ViewConfiguration.getTouchSlop() >> 8), Color.green(0) - 30, (-1623520685) - ExpandableListView.getPackedPositionChild(0L), (byte) ((-16777216) - Color.rgb(0, 0, 0))).intern())) {
                        return Boolean.valueOf(m2003());
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 1641431166:
                    if (str.equals(m2007((short) ('0' - AndroidCharacter.getMirror('0')), 1109589792 - Drawable.resolveOpacity(0, 0), TextUtils.indexOf("", "", 0, 0) - 30, (-1623520715) - (ViewConfiguration.getTouchSlop() >> 8), (byte) (1 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern())) {
                        return Boolean.valueOf(m1998());
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                case 1712841667:
                    if (str.equals(m2007((short) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1109589793, TextUtils.getTrimmedLength("") - 30, (-1623520728) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern())) {
                        return m2004();
                    }
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
                default:
                    clVar2 = clVar;
                    new ds(clVar2, eeVar, m2007((short) KeyEvent.normalizeMetaState(0), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1109589766, View.MeasureSpec.getMode(0) - 30, (-1623520667) - Color.alpha(0), (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern(), str).m2034(clVar2.m1643());
                    return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2012(String str) {
        int i10 = f1738;
        int i11 = i10 + 93;
        f1737 = i11 % 128;
        int i12 = i11 % 2;
        this.f1746 = str;
        if (i12 != 0) {
            int i13 = 4 / 0;
        }
        int i14 = i10 + 91;
        f1737 = i14 % 128;
        if (i14 % 2 != 0) {
            int i15 = 65 / 0;
        }
    }
}
