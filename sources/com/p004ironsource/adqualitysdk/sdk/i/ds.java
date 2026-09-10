package com.p004ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.firebase.crashlytics.internal.model.a;
import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class ds {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1773 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1774 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1775;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static long f1776;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<ee, ee> f1777;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Map<fq, fq> f1778;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private String f1779;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1780 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f1781;

    public interface e<T> {
        /* JADX INFO: renamed from: ﾇ */
        T mo2030(List<dy> list);
    }

    static {
        m2022();
        f1777 = new HashMap();
        f1778 = new HashMap();
        f1774 = (f1773 + 61) % 128;
    }

    public ds(String str, String str2) {
        this.f1781 = str;
        this.f1779 = str2;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private boolean m1986(List<dy> list) {
        if (this.f1780 < list.size()) {
            int i2 = f1773 + 83;
            f1774 = i2 % 128;
            if (i2 % 2 != 0) {
                return true;
            }
            throw null;
        }
        int i3 = f1773 + 99;
        f1774 = i3 % 128;
        if (i3 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        if (m1986(r7) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0024, code lost:
    
        com.p004ironsource.adqualitysdk.sdk.i.ds.f1773 = (com.p004ironsource.adqualitysdk.sdk.i.ds.f1774 + 7) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        r7 = r7.get(r6.f1780);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0034, code lost:
    
        r0 = com.p004ironsource.adqualitysdk.sdk.i.ds.f1774 + 107;
        com.p004ironsource.adqualitysdk.sdk.i.ds.f1773 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        if ((r0 % 2) != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (m1986(r7) != true) goto L24;
     */
    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.p004ironsource.adqualitysdk.sdk.i.dy m1987(java.util.List<com.p004ironsource.adqualitysdk.sdk.i.dy> r7) {
        /*
            r6 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ds.f1774
            int r0 = r0 + 93
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ds.f1773 = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r6.m1986(r7)     // Catch: java.lang.Exception -> L1b
            r2 = 30
            int r2 = r2 / 0
            r2 = 1
            if (r0 == r2) goto L24
            goto L66
        L19:
            r7 = move-exception
            throw r7
        L1b:
            r7 = move-exception
            goto L42
        L1d:
            boolean r0 = r6.m1986(r7)     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L24
            goto L66
        L24:
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ds.f1774
            int r0 = r0 + 7
            int r0 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ds.f1773 = r0
            int r0 = r6.f1780     // Catch: java.lang.Exception -> L1b
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L1b
            com.ironsource.adqualitysdk.sdk.i.dy r7 = (com.p004ironsource.adqualitysdk.sdk.i.dy) r7     // Catch: java.lang.Exception -> L1b
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ds.f1774
            int r0 = r0 + 107
            int r2 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ds.f1773 = r2
            int r0 = r0 % 2
            if (r0 != 0) goto L41
            return r7
        L41:
            throw r1
        L42:
            java.lang.String r0 = ""
            int r2 = android.os.Process.getGidForName(r0)
            int r2 = r2 + 38
            r3 = 48
            int r4 = android.text.TextUtils.lastIndexOf(r0, r3)
            int r4 = 1201 - r4
            r5 = 40744(0x9f28, float:5.7095E-41)
            int r0 = android.text.TextUtils.lastIndexOf(r0, r3)
            int r0 = r0 + r5
            char r0 = (char) r0
            java.lang.String r0 = m2021(r2, r4, r0)
            java.lang.String r0 = r0.intern()
            r6.m2026(r0, r7)
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ds.m1987(java.util.List):com.ironsource.adqualitysdk.sdk.i.dy");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0021, code lost:
    
        if (m1986(r7) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        m2026(m2021(android.graphics.Color.rgb(0, 0, 0) + 16777240, 1145 - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), (char) (61735 - (android.view.KeyEvent.getMaxKeyCode() >> 16))).intern(), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        r0 = r6.f1780;
        r6.f1780 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        return r7.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
    
        if (m1986(r7) != false) goto L16;
     */
    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.p004ironsource.adqualitysdk.sdk.i.dy m1988(java.util.List<com.p004ironsource.adqualitysdk.sdk.i.dy> r7) {
        /*
            r6 = this;
            int r0 = com.p004ironsource.adqualitysdk.sdk.i.ds.f1774
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ds.f1773 = r1
            int r0 = r0 % 2
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r6.m1986(r7)     // Catch: java.lang.Exception -> L1a
            r3 = 50
            int r3 = r3 / r2
            if (r0 == 0) goto L23
            goto L4c
        L18:
            r7 = move-exception
            throw r7
        L1a:
            r7 = move-exception
            goto L59
        L1c:
            boolean r0 = r6.m1986(r7)     // Catch: java.lang.Exception -> L1a
            r3 = 1
            if (r0 == r3) goto L4c
        L23:
            int r7 = android.graphics.Color.rgb(r2, r2, r2)     // Catch: java.lang.Exception -> L1a
            r0 = 16777240(0x1000018, float:2.3509954E-38)
            int r7 = r7 + r0
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L1a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            int r0 = 1145 - r0
            int r2 = android.view.KeyEvent.getMaxKeyCode()     // Catch: java.lang.Exception -> L1a
            int r2 = r2 >> 16
            r3 = 61735(0xf127, float:8.6509E-41)
            int r3 = r3 - r2
            char r2 = (char) r3     // Catch: java.lang.Exception -> L1a
            java.lang.String r7 = m2021(r7, r0, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.String r7 = r7.intern()     // Catch: java.lang.Exception -> L1a
            r6.m2026(r7, r1)     // Catch: java.lang.Exception -> L1a
            goto L7e
        L4c:
            int r0 = r6.f1780     // Catch: java.lang.Exception -> L1a
            int r2 = r0 + 1
            r6.f1780 = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r7 = r7.get(r0)     // Catch: java.lang.Exception -> L1a
            com.ironsource.adqualitysdk.sdk.i.dy r7 = (com.p004ironsource.adqualitysdk.sdk.i.dy) r7     // Catch: java.lang.Exception -> L1a
            return r7
        L59:
            r0 = 0
            float r2 = android.graphics.PointF.length(r0, r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            int r2 = 34 - r2
            int r3 = android.view.ViewConfiguration.getJumpTapTimeout()
            int r3 = r3 >> 16
            int r3 = 1168 - r3
            float r4 = android.media.AudioTrack.getMaxVolume()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            int r0 = r0 + (-1)
            char r0 = (char) r0
            java.lang.String r0 = m2021(r2, r3, r0)
            java.lang.String r0 = r0.intern()
            r6.m2026(r0, r7)
        L7e:
            int r7 = com.p004ironsource.adqualitysdk.sdk.i.ds.f1773
            int r7 = r7 + 3
            int r0 = r7 % 128
            com.p004ironsource.adqualitysdk.sdk.i.ds.f1774 = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L8b
            return r1
        L8b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.adqualitysdk.sdk.i.ds.m1988(java.util.List):com.ironsource.adqualitysdk.sdk.i.dy");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x014d  */
    /* JADX WARN: Code duplicated, block: B:60:0x016c  */
    /* JADX WARN: Code duplicated, block: B:65:0x019d  */
    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private ee m1989(List<dy> list) {
        ee eeVar;
        byte b2;
        byte b3;
        try {
            dy dyVarM1988 = m1988(list);
            dm dmVarM1949 = dm.m1949(this.f1779, dyVarM1988.m2064());
            try {
                if (dyVarM1988.m2055()) {
                    String strM2067 = dyVarM1988.m2067();
                    String strM2068 = m1988(list).m2067();
                    int iHashCode = strM2068.hashCode();
                    if (iHashCode != 40) {
                        if (iHashCode == 61 && strM2068.equals(m2021((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 789 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (54635 - (ViewConfiguration.getLongPressTimeout() >> 16))).intern())) {
                            b3 = 0;
                        } else {
                            b3 = -1;
                        }
                    } else if (strM2068.equals(m2021(Drawable.resolveOpacity(0, 0) + 1, (ViewConfiguration.getWindowTouchSlop() >> 8) + 110, (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern())) {
                        b3 = 1;
                    } else {
                        b3 = -1;
                    }
                    if (b3 == 0) {
                        return m2005(new dx((el) m2005(new el(strM2067, dmVarM1949)), m2028(list), dmVarM1949));
                    }
                    if (b3 == 1) {
                        return m2005(new eb(strM2067, m2009(list, m2021(1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 151 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) (57091 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern()), dmVarM1949));
                    }
                    this.f1780--;
                    return m2005(new el(strM2067, dmVarM1949));
                }
                eeVar = null;
                if (dyVarM1988.m2066()) {
                    return m2019(dyVarM1988);
                }
                if (dyVarM1988.m2058()) {
                    return m2005(new dz(dyVarM1988.m2067(), dmVarM1949));
                }
                if (dyVarM1988.m2056()) {
                    return m2014(dyVarM1988, list);
                }
                if (!dyVarM1988.m2059()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(m2021(17 - (Process.myTid() >> 22), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 831, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 34816)).intern());
                    sb.append(dyVarM1988);
                    m2012(sb.toString());
                    return eeVar;
                }
                int i2 = f1773 + 119;
                f1774 = i2 % 128;
                if (i2 % 2 == 0) {
                    dyVarM1988.m2067().hashCode();
                    throw null;
                }
                String strM2069 = dyVarM1988.m2067();
                int iHashCode2 = strM2069.hashCode();
                if (iHashCode2 != 33) {
                    if (iHashCode2 != 40) {
                        if (iHashCode2 != 45) {
                            if (iHashCode2 != 91) {
                                if (iHashCode2 == 123 && strM2069.equals(m2021(View.MeasureSpec.getMode(0) + 1, ExpandableListView.getPackedPositionGroup(0L), (char) ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                                    b2 = 2;
                                }
                            } else if (strM2069.equals(m2021((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 788, (char) (24787 - TextUtils.getTrimmedLength(""))).intern())) {
                                int i3 = f1773 + 99;
                                f1774 = i3 % 128;
                                if (i3 % 2 == 0) {
                                    b2 = 0;
                                } else {
                                    b2 = 1;
                                }
                            }
                            b2 = -1;
                        } else if (strM2069.equals(m2021(TextUtils.indexOf("", "", 0) + 1, 781 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (char) (12675 - ((Process.getThreadPriority(0) + 20) >> 6))).intern())) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (!strM2069.equals(m2021(-TextUtils.lastIndexOf("", '0', 0, 0), 110 - TextUtils.getTrimmedLength(""), (char) KeyEvent.keyCodeFromString("")).intern())) {
                        b2 = -1;
                    } else {
                        b2 = 0;
                    }
                } else if (strM2069.equals(m2021(View.MeasureSpec.getMode(0) + 1, 791 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 25771)).intern())) {
                    int i4 = f1774 + 37;
                    f1773 = i4 % 128;
                    if (i4 % 2 != 0) {
                        b2 = 2;
                    } else {
                        b2 = 3;
                    }
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    ee eeVarM2005 = m2005(new ei(m2028(list), dmVarM1949));
                    m2027(list, m2021((ViewConfiguration.getScrollBarSize() >> 8) + 1, 152 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (57091 - (Process.myTid() >> 22))).intern(), eeVarM2005, m2021((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19, View.MeasureSpec.makeMeasureSpec(0, 0) + 792, (char) (16661 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern());
                    return eeVarM2005;
                }
                if (b2 == 1) {
                    return m2005(new dv(m2009(list, m2021(1 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 812 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 10415)).intern()), dmVarM1949));
                }
                if (b2 == 2) {
                    return m2005(new ec(m1993(list), dmVarM1949));
                }
                if (b2 == 3) {
                    return m2005(new fc(m1991(list), dmVarM1949));
                }
                if (b2 == 4) {
                    return m2005(new eu(m2005(new fg(0, dmVarM1949)), m1989(list), dmVarM1949));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2021(ExpandableListView.getPackedPositionChild(0L) + 21, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 812, (char) (KeyEvent.keyCodeFromString("") + 47819)).intern());
                sb2.append(dyVarM1988.m2067());
                m2012(sb2.toString());
                return null;
            } catch (Exception e2) {
                e = e2;
                m2026(m2021(16 - (ViewConfiguration.getTouchSlop() >> 8), 849 - (ViewConfiguration.getTouchSlop() >> 8), (char) (5909 - AndroidCharacter.getMirror('0'))).intern(), e);
            }
        } catch (Exception e3) {
            e = e3;
            eeVar = null;
        }
        m2026(m2021(16 - (ViewConfiguration.getTouchSlop() >> 8), 849 - (ViewConfiguration.getTouchSlop() >> 8), (char) (5909 - AndroidCharacter.getMirror('0'))).intern(), e);
        return eeVar;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private Pair<String, ee> m1990(List<dy> list) {
        f1773 = (f1774 + 19) % 128;
        dy dyVarM1988 = m1988(list);
        if (!dyVarM1988.m2062()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2021(24 - TextUtils.getTrimmedLength(""), 1095 - AndroidCharacter.getMirror('0'), (char) ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb.append(dyVarM1988);
            m2026(sb.toString(), null);
        }
        String strM2067 = dyVarM1988.m2067();
        m2027(list, m2021((ViewConfiguration.getTapTimeout() >> 16) + 1, 1071 - KeyEvent.normalizeMetaState(0), (char) (KeyEvent.getDeadChar(0, 0) + 43323)).intern(), strM2067, m2021(48 - ExpandableListView.getPackedPositionGroup(0L), Color.green(0) + 1072, (char) (55982 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern());
        Pair<String, ee> pair = new Pair<>(strM2067, m2028(list));
        f1773 = (f1774 + 87) % 128;
        return pair;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x008d  */
    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private ee m1991(List<dy> list) {
        f1774 = (f1773 + 25) % 128;
        ee eeVarM1989 = m1989(list);
        while (m1986(list)) {
            f1774 = (f1773 + 105) % 128;
            String strM2067 = m1988(list).m2067();
            int iHashCode = strM2067.hashCode();
            byte b2 = 0;
            if (iHashCode != 46) {
                if (iHashCode == 91 && strM2067.equals(m2021((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, 788 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (View.resolveSize(0, 0) + 24787)).intern())) {
                    int i2 = f1774 + 85;
                    f1773 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 1;
                    }
                } else {
                    b2 = -1;
                }
            } else if (!strM2067.equals(m2021(-MotionEvent.axisFromString(""), 788 - TextUtils.indexOf("", ""), (char) (50186 - AndroidCharacter.getMirror('0'))).intern())) {
                b2 = -1;
            }
            if (b2 == 0) {
                eeVarM1989 = m2015(eeVarM1989, list);
            } else {
                if (b2 != 1) {
                    this.f1780--;
                    return eeVarM1989;
                }
                eeVarM1989 = m2007(eeVarM1989, list);
            }
        }
        return eeVarM1989;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private List<ee> m1992(List<dy> list) {
        List<ee> listM2010 = m2010(list, m2021(-TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 774, (char) (ExpandableListView.getPackedPositionType(0L) + 17409)).intern(), new e<ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.5

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1791 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int[] f1792 = {-713207209, 403412497, -135770848, -1055493810, -66274607, 40927945, 650387516, -1526373789, -1830171084, -1548328009, -1298250336, 1894290000, -873957090, 1939164739, -1939738749, 428919924, -1519831712, 1784452603};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1793;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m2033(int[] iArr, int i2) {
                String str;
                synchronized (d.f1586) {
                    try {
                        char[] cArr = new char[4];
                        char[] cArr2 = new char[iArr.length << 1];
                        int[] iArr2 = (int[]) f1792.clone();
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

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private ee m2034(List<dy> list2) {
                ee eeVarM2004 = ds.m2004(ds.this, list2);
                if (!(eeVarM2004 instanceof dz)) {
                    f1793 = (f1791 + 87) % 128;
                    if (!(eeVarM2004 instanceof el)) {
                        ds dsVar = ds.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append(m2033(new int[]{-1786278312, 1777611502, -1049640754, -627381821, -290230035, 1671156136, -835390686, 2073806926, 1082719200, -456463951, -1366067718, -502191781, 1563471463, 116013824, 536230759, 722997805}, View.resolveSize(0, 0) + 32).intern());
                        sb.append(eeVarM2004);
                        ds.m2017(dsVar, sb.toString());
                        return null;
                    }
                }
                f1793 = (f1791 + 15) % 128;
                return eeVarM2004;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ds.e
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ ee mo2030(List list2) {
                f1793 = (f1791 + 27) % 128;
                ee eeVarM2034 = m2034(list2);
                f1791 = (f1793 + 119) % 128;
                return eeVarM2034;
            }
        });
        f1773 = (f1774 + 89) % 128;
        return listM2010;
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private Map<String, ee> m1993(List<dy> list) {
        HashMap map = new HashMap();
        Iterator it = m2010(list, m2021((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, (-16776452) - Color.rgb(0, 0, 0), (char) TextUtils.getOffsetBefore("", 0)).intern(), new e<Pair<String, ee>>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ds.e
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ Pair<String, ee> mo2030(List list2) {
                return ds.m2018(ds.this, list2);
            }
        }).iterator();
        while (it.hasNext()) {
            int i2 = f1774 + 15;
            f1773 = i2 % 128;
            if (i2 % 2 != 0) {
                Pair pair = (Pair) it.next();
                map.put(pair.first, pair.second);
                throw null;
            }
            Pair pair2 = (Pair) it.next();
            map.put(pair2.first, pair2.second);
        }
        int i3 = f1773 + 95;
        f1774 = i3 % 128;
        if (i3 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013b  */
    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private ee m1994(List<dy> list) {
        int i2 = f1773 + 117;
        f1774 = i2 % 128;
        if (i2 % 2 == 0) {
            m1995(list);
            m1986(list);
            throw null;
        }
        ee eeVarM1995 = m1995(list);
        if (!m1986(list)) {
            return eeVarM1995;
        }
        dm dmVarM1949 = dm.m1949(this.f1779, eeVarM1995.m2087());
        String strM2067 = m1988(list).m2067();
        int iHashCode = strM2067.hashCode();
        byte b2 = 0;
        if (iHashCode != 60) {
            if (iHashCode != 62) {
                if (iHashCode != 1084) {
                    if (iHashCode != 1921) {
                        if (iHashCode != 1952) {
                            if (iHashCode == 1983 && strM2067.equals(m2021((ViewConfiguration.getScrollBarSize() >> 8) + 2, 776 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 28476)).intern())) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (!strM2067.equals(m2021((ViewConfiguration.getJumpTapTimeout() >> 16) + 2, 769 - TextUtils.getCapsMode("", 0, 0), (char) (ExpandableListView.getPackedPositionType(0L) + 18)).intern())) {
                            b2 = -1;
                        }
                    } else if (strM2067.equals(m2021(Color.red(0) + 2, (ViewConfiguration.getLongPressTimeout() >> 16) + 775, (char) (View.resolveSizeAndState(0, 0, 0) + 21053)).intern())) {
                        b2 = 4;
                    } else {
                        b2 = -1;
                    }
                } else if (strM2067.equals(m2021(Color.alpha(0) + 2, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 771, (char) Gravity.getAbsoluteGravity(0, 0)).intern())) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (strM2067.equals(m2021(View.MeasureSpec.getSize(0) + 1, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 775, (char) (17409 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).intern())) {
                b2 = 3;
            } else {
                b2 = -1;
            }
        } else if (strM2067.equals(m2021(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 773 - Gravity.getAbsoluteGravity(0, 0), (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 18785)).intern())) {
            f1773 = (f1774 + 33) % 128;
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return m2005(new es(eeVarM1995, m1994(list), dmVarM1949));
        }
        if (b2 == 1) {
            return m2005(new ez(eeVarM1995, m1994(list), dmVarM1949));
        }
        if (b2 == 2) {
            return m2005(new ev(eeVarM1995, m1994(list), dmVarM1949));
        }
        if (b2 == 3) {
            return m2005(new ep(eeVarM1995, m1994(list), dmVarM1949));
        }
        if (b2 == 4) {
            return m2005(new ew(eeVarM1995, m1994(list), dmVarM1949));
        }
        if (b2 != 5) {
            this.f1780--;
            return eeVarM1995;
        }
        ee eeVarM2005 = m2005(new eq(eeVarM1995, m1994(list), dmVarM1949));
        int i3 = f1773 + 29;
        f1774 = i3 % 128;
        if (i3 % 2 != 0) {
            return eeVarM2005;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0062  */
    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ee m1995(List<dy> list) {
        ee eeVarM1997 = m1997(list);
        if (!m1986(list)) {
            return eeVarM1997;
        }
        dm dmVarM1949 = dm.m1949(this.f1779, eeVarM1997.m2087());
        String strM2067 = m1988(list).m2067();
        int iHashCode = strM2067.hashCode();
        byte b2 = 0;
        if (iHashCode != 43) {
            if (iHashCode != 45) {
                if (iHashCode != 1376) {
                    if (iHashCode == 1440 && strM2067.equals(m2021(3 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 784 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Process.myPid() >> 22)).intern())) {
                        b2 = 3;
                    }
                } else if (!(!strM2067.equals(m2021(2 - (ViewConfiguration.getJumpTapTimeout() >> 16), 781 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) ('0' - AndroidCharacter.getMirror('0'))).intern()))) {
                    int i2 = f1773 + 115;
                    f1774 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 3;
                    } else {
                        b2 = 2;
                    }
                }
            } else if (strM2067.equals(m2021(1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 780 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (12676 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern())) {
                f1773 = (f1774 + 47) % 128;
                b2 = 1;
            }
            b2 = -1;
        } else if (strM2067.equals(m2021(1 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 780, (char) (6439 - AndroidCharacter.getMirror('0'))).intern())) {
            int i3 = f1773 + 39;
            f1774 = i3 % 128;
            if (i3 % 2 == 0) {
                b2 = 1;
            }
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return m2005(new fd(eeVarM1997, m1995(list), dmVarM1949));
        }
        if (b2 == 1) {
            return m2005(new eu(eeVarM1997, m1995(list), dmVarM1949));
        }
        if (b2 != 2) {
            if (b2 == 3) {
                return m2005(new er((el) eeVarM1997, dmVarM1949));
            }
            this.f1780--;
            f1774 = (f1773 + 99) % 128;
            return eeVarM1997;
        }
        ee eeVarM2005 = m2005(new ey((el) eeVarM1997, dmVarM1949));
        int i4 = f1773 + 43;
        f1774 = i4 % 128;
        if (i4 % 2 != 0) {
            return eeVarM2005;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private fq m1996(List<dy> list) {
        m2013(list, m2021(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 42, (char) Color.green(0)).intern(), m2021(Color.argb(0, 0, 0, 0) + 38, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 726, (char) (61103 - TextUtils.lastIndexOf("", '0'))).intern());
        fq fqVarM2023 = m2023(new fj());
        int i2 = f1773 + 73;
        f1774 = i2 % 128;
        if (i2 % 2 != 0) {
            return fqVarM2023;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00b6  */
    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ee m1997(List<dy> list) {
        ee eeVarM1991 = m1991(list);
        if (!m1986(list)) {
            return eeVarM1991;
        }
        f1774 = (f1773 + 15) % 128;
        dm dmVarM1949 = dm.m1949(this.f1779, eeVarM1991.m2087());
        String strM2067 = m1988(list).m2067();
        int iHashCode = strM2067.hashCode();
        byte b2 = 0;
        if (iHashCode != 37) {
            if (iHashCode != 42) {
                if (iHashCode == 47 && strM2067.equals(m2021(TextUtils.getOffsetBefore("", 0) + 1, 786 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 64925)).intern())) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (!strM2067.equals(m2021(ExpandableListView.getPackedPositionGroup(0L) + 1, 785 - TextUtils.getOffsetBefore("", 0), (char) TextUtils.getTrimmedLength("")).intern())) {
                b2 = -1;
            }
        } else if (strM2067.equals(m2021((ViewConfiguration.getLongPressTimeout() >> 16) + 1, ((Process.getThreadPriority(0) + 20) >> 6) + 787, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern())) {
            f1774 = (f1773 + 23) % 128;
            b2 = 2;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return m2005(new fa(eeVarM1991, m1997(list), dmVarM1949));
        }
        if (b2 == 1) {
            return m2005(new et(eeVarM1991, m1997(list), dmVarM1949));
        }
        if (b2 == 2) {
            return m2005(new ex(eeVarM1991, m1997(list), dmVarM1949));
        }
        this.f1780--;
        return eeVarM1991;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private fk m1998(List<dy> list) {
        ArrayList arrayList = new ArrayList();
        dy dyVarM1987 = m1987(list);
        while (!dyVarM1987.m2063(m2021(1 - View.resolveSizeAndState(0, 0, 0), 764 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1)).intern())) {
            f1774 = (f1773 + 9) % 128;
            arrayList.add(m2024(list));
            dyVarM1987 = m1987(list);
            f1774 = (f1773 + 107) % 128;
        }
        this.f1780++;
        return (fk) m2023(new fk(arrayList));
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private fq m1999(List<dy> list) {
        m2013(list, m2021(1 - Color.green(0), 110 - (ViewConfiguration.getWindowTouchSlop() >> 8), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern(), m2021((ViewConfiguration.getDoubleTapTimeout() >> 16) + 43, 310 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern());
        ee eeVarM2028 = m2028(list);
        m2013(list, m2021(1 - (KeyEvent.getMaxKeyCode() >> 16), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 150, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 57091)).intern(), m2021(47 - TextUtils.indexOf("", ""), 353 - (KeyEvent.getMaxKeyCode() >> 16), (char) (TextUtils.indexOf("", "", 0) + 11368)).intern());
        fq fqVarM2023 = m2023(new fu(eeVarM2028, m2024(list)));
        int i2 = f1773 + 77;
        f1774 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 72 / 0;
        }
        return fqVarM2023;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private fq m2000(List<dy> list) {
        fq fqVarM2023;
        f1773 = (f1774 + 85) % 128;
        if (m1987(list).m2063(m2021((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1, 43 - (ViewConfiguration.getTapTimeout() >> 16), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern())) {
            fqVarM2023 = m2023(new fo(null));
            f1774 = (f1773 + 11) % 128;
        } else {
            fqVarM2023 = m2023(new fo(m2028(list)));
        }
        m2027(list, m2021((Process.myPid() >> 22) + 1, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 43, (char) Color.argb(0, 0, 0, 0)).intern(), fqVarM2023, m2021(36 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 655, (char) Color.alpha(0)).intern());
        return fqVarM2023;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private fq m2001(List<dy> list) {
        m2013(list, m2021((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44, (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m2021((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34, MotionEvent.axisFromString("") + 692, (char) (16767 - (ViewConfiguration.getTapTimeout() >> 16))).intern());
        fq fqVarM2023 = m2023(new fm());
        int i2 = f1774 + 123;
        f1773 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 22 / 0;
        }
        return fqVarM2023;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private fq m2002(List<dy> list) {
        m2013(list, m2021(1 - View.resolveSize(0, 0), (-1) - TextUtils.lastIndexOf("", '0'), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1)).intern(), m2021(Color.red(0) + 44, 401 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 38819)).intern());
        fk fkVarM1998 = m1998(list);
        m2013(list, m2021(5 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 444, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), m2021((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 53, 449 - (Process.myTid() >> 22), (char) ((-1) - Process.getGidForName(""))).intern());
        m2013(list, m2021(1 - KeyEvent.getDeadChar(0, 0), 111 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), m2021(41 - View.getDefaultSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 503, (char) (48436 - (ViewConfiguration.getTapTimeout() >> 16))).intern());
        dy dyVarM1988 = m1988(list);
        m2011(dyVarM1988, dy.e.f1836, fkVarM1998, m2021(27 - (ViewConfiguration.getFadingEdgeLength() >> 16), 543 - View.MeasureSpec.getSize(0), (char) (TextUtils.indexOf("", "") + 20739)).intern());
        el elVar = (el) m2005(new el(dyVarM1988.m2067(), dm.m1949(this.f1779, dyVarM1988.m2064())));
        m2013(list, m2021(-TextUtils.indexOf((CharSequence) "", '0', 0), 151 - Drawable.resolveOpacity(0, 0), (char) (Drawable.resolveOpacity(0, 0) + 57091)).intern(), m2021(39 - View.combineMeasuredStates(0, 0), 570 - ExpandableListView.getPackedPositionGroup(0L), (char) (TextUtils.indexOf((CharSequence) "", '0') + 49123)).intern());
        m2013(list, m2021(1 - TextUtils.getOffsetAfter("", 0), ViewConfiguration.getMaximumFlingVelocity() >> 16, (char) ((-1) - TextUtils.lastIndexOf("", '0', 0))).intern(), m2021(TextUtils.getOffsetBefore("", 0) + 46, 610 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (2036 - TextUtils.lastIndexOf("", '0', 0))).intern());
        fq fqVarM2023 = m2023(new fv(fkVarM1998, m1998(list), elVar));
        int i2 = f1773 + 47;
        f1774 = i2 % 128;
        if (i2 % 2 != 0) {
            return fqVarM2023;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private fq m2003(List<dy> list) {
        fq fqVarM2023 = m2023(new ft(m2010(list, m2021(1 - (ViewConfiguration.getPressedStateDuration() >> 16), View.combineMeasuredStates(0, 0) + 43, (char) View.MeasureSpec.getSize(0)).intern(), new e<ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.3

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f1784 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1785 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f1786 = true;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f1787 = 155;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f1788 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1789 = {224, 275, 267, 256, 254, 271, 255, 187, 273, 252, 269, 260, 253, 263, 272};

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private ee m2031(List<dy> list2) {
                int i2 = f1784 + 123;
                f1785 = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z2 = ds.this.m2028(list2) instanceof el;
                    throw null;
                }
                ee eeVarM2028 = ds.this.m2028(list2);
                if ((eeVarM2028 instanceof el) || (eeVarM2028 instanceof dx)) {
                    f1784 = (f1785 + 27) % 128;
                    return eeVarM2028;
                }
                ds dsVar = ds.this;
                StringBuilder sb = new StringBuilder();
                sb.append(m2032(null, null, TextUtils.getOffsetAfter("", 0) + 127, "\u0088\u0087\u0084\u0089\u008c\u0084\u0085\u0084\u008b\u0088\u0086\u008f\u008d\u0088\u0084\u008e\u008d\u008a\u008c\u008b\u008a\u0089\u0088\u0087\u0084\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                sb.append(eeVarM2028);
                ds.m2017(dsVar, sb.toString());
                return null;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2032(String str, int[] iArr, int i2, String str2) throws UnsupportedEncodingException {
                Object bytes = str2;
                if (str2 != null) {
                    bytes = str2.getBytes(CharEncoding.ISO_8859_1);
                }
                byte[] bArr = (byte[]) bytes;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (o.f2877) {
                    try {
                        char[] cArr2 = f1789;
                        int i3 = f1787;
                        if (f1786) {
                            int length = bArr.length;
                            o.f2878 = length;
                            char[] cArr3 = new char[length];
                            o.f2879 = 0;
                            while (o.f2879 < o.f2878) {
                                int i4 = o.f2879;
                                int i5 = o.f2878 - 1;
                                int i6 = o.f2879;
                                cArr3[i4] = (char) (cArr2[bArr[i5 - i6] + i2] - i3);
                                o.f2879 = i6 + 1;
                            }
                            return new String(cArr3);
                        }
                        if (f1788) {
                            int length2 = cArr.length;
                            o.f2878 = length2;
                            char[] cArr4 = new char[length2];
                            o.f2879 = 0;
                            while (o.f2879 < o.f2878) {
                                int i7 = o.f2879;
                                int i8 = o.f2878 - 1;
                                int i9 = o.f2879;
                                cArr4[i7] = (char) (cArr2[cArr[i8 - i9] - i2] - i3);
                                o.f2879 = i9 + 1;
                            }
                            return new String(cArr4);
                        }
                        int length3 = iArr.length;
                        o.f2878 = length3;
                        char[] cArr5 = new char[length3];
                        o.f2879 = 0;
                        while (o.f2879 < o.f2878) {
                            int i10 = o.f2879;
                            int i11 = o.f2878 - 1;
                            int i12 = o.f2879;
                            cArr5[i10] = (char) (cArr2[iArr[i11 - i12] - i2] - i3);
                            o.f2879 = i12 + 1;
                        }
                        return new String(cArr5);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ds.e
            /* JADX INFO: renamed from: ﾇ */
            public final /* synthetic */ ee mo2030(List list2) {
                f1784 = (f1785 + 89) % 128;
                ee eeVarM2031 = m2031(list2);
                int i2 = f1784 + 57;
                f1785 = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 69 / 0;
                }
                return eeVarM2031;
            }
        })));
        int i2 = f1773 + 23;
        f1774 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 70 / 0;
        }
        return fqVarM2023;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ ee m2004(ds dsVar, List list) {
        int i2 = f1774 + 9;
        f1773 = i2 % 128;
        if (i2 % 2 != 0) {
            dsVar.m1989(list);
            throw null;
        }
        ee eeVarM1989 = dsVar.m1989(list);
        f1773 = (f1774 + 57) % 128;
        return eeVarM1989;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0103  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private fq m2008(List<dy> list) {
        fq fqVarM2024;
        m2013(list, m2021(AndroidCharacter.getMirror('0') - '/', (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 110, (char) TextUtils.indexOf("", "")).intern(), m2021((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 40, TextUtils.getOffsetAfter("", 0) + 111, (char) (52479 - TextUtils.getCapsMode("", 0, 0))).intern());
        ee eeVarM2028 = m2028(list);
        m2027(list, m2021(1 - TextUtils.getTrimmedLength(""), 151 - KeyEvent.getDeadChar(0, 0), (char) (57090 - TextUtils.indexOf((CharSequence) "", '0'))).intern(), eeVarM2028, m2021(TextUtils.lastIndexOf("", '0', 0) + 45, TextUtils.indexOf("", "", 0, 0) + 152, (char) (TextUtils.lastIndexOf("", '0') + 50358)).intern());
        fq fqVarM2025 = m2024(list);
        if (m1986(list)) {
            int i2 = f1774 + 19;
            f1773 = i2 % 128;
            if (i2 % 2 == 0 ? !m1987(list).m2063(m2021(View.resolveSizeAndState(0, 0, 0) + 4, 195 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) (20275 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).intern()) : !m1987(list).m2063(m2021(5 % View.resolveSizeAndState(0, 1, 1), 31964 << (ExpandableListView.getPackedPositionForChild(1, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollDefaultDelay() % 0) + 12869)).intern())) {
                fqVarM2024 = null;
            } else {
                this.f1780++;
                fqVarM2024 = m2024(list);
                f1773 = (f1774 + 121) % 128;
            }
        } else {
            fqVarM2024 = null;
        }
        return m2023(new fp(eeVarM2028, fqVarM2025, fqVarM2024));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2017(ds dsVar, String str) {
        int i2 = f1773 + 27;
        f1774 = i2 % 128;
        int i3 = i2 % 2;
        dsVar.m2012(str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = f1774 + 81;
        f1773 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2022() {
        char[] cArr = new char[1307];
        ByteBuffer.wrap("\u0000{\u0000m\"«Eèh\u0002\u008bW®bÐôóÀ\u0016\u001f9Z\\u~ú¡ÛÄ\u001eç+\ng,\u008cOÊr\\\u0095(¸}ÚÆýÕ ¢C3fq\u0088\u0081«ÊÎçñ#\u0014J6\u0096Yà|ý\u009f(ÂKä\u008c\u0007£*ùM\u0007p^\u0092\u008a\u0000;\u0000i\"¨\u0000f\"¡EîB>`ï\u0007¼*OÉ\u0014\u009eV¼\u008fÛÌö;\u0015n0L\u0000b\"¼Eùh\u000b\u008bS\u0000c\"¡Eòh\u001e\u008bQ®hÐ¡óÇ\na(©Oðã\u0096ÁO¦\u000e¾´\u009c~û6ÖÀ5\u0088\u0010±njM[¨\u008e\u0087ÜâòÀ#\u001f\u0010zÛY½´®\u0092Wñ\u0013Ì\u0085+ü\u0006§d\u001fC\u001e\u009e/ýèØ³6P\u0015\u000ep4Oáª\u0089\u0000(Ì\u0096îW\u0089C¤æG³b\u0098\u001c_?8Úâõ¤\u0090\u009d²Qmw\bú+ÓÆ\u0082àj\u0083=¾çY\u0095t\u0085\u0016|1kì\u001b\u008fÀª\u008dD\u007fg*\u0002\u0000=ÌØ¿ú-\u0095]°\bS\u0083\u000e´('Ë\u001eæC\u0081ºß*ÄÜæ\u001d\u0081\t¬¬OùjÒ\u0014\u00157rÒ¨ýî\u0098×º\u001be=\u0000 #\u009eÎÉè1\u008br¶½Q\u0096|Â\u001e=9!äD\u0087\u008d¢ÄL,oc\nY5ÃÐóò\"\u009dU¸R[\u0087\u0006ì $Ã\u0017îD\u0089÷´¢VcqP\u001c\bOVm\u0091\nÜ'<\u0000f\"¡EîhJ\u008bK®rÐµóÖ\u0016\u00159S\\i~´¡ÜÄVç7\nz,\u008fOÛr\u0010\u0095.¸8Ú\u0084ýÑ ¢C6fq\u0088\u0080«ÖÎçñ!\u0014A6\u0096Yà|ì\u009f%Â\nä\u0099\u0007æ*³MJp\u0017\u0094Æ¶\u0001ÑNüê\u001fû:ÉD\u001agf\u0082¹\u00adêÈÅê\u00155fPös\u0097\u009eÚ¸/Û{æ°\u0001\u008e,\u0098N#iz´F×ÐòÉ\u001c%?nZ@eÖ\u0080£¢iÍGÇÂå\u0013\u0082E¯®LúiÅ\u0017\u00184cÑýþö\u009bÙ¹\u0007fw\u0003¾ \u009aÍÌë$\u0088lµ¿RÇ\u007fÆ\u001d#:vçZ\u0084\u0091¡×Oalr\tK6\u009fÓ©ñ(\u009e\u0004»WX\u0099\u0005§\u0000w\"¦Eõh\u0006\u008b]®&Ð§óÖ\u0016\u00119J\\i~·¡ÍÄ\u0018ç0\n2,\u0093OÆr\u0013\u0095?¸tÚ\u0082ý\u0094 àC5f>\u0088\u008a«ÕÎäñ:\u0014K6\u0085Y¥|ê\u009f|ÂHä\u0081\u0007æ*õMBp\u0017\u0092Öµë,\u001f\u000eÎi\u009dDn§5\u0082NüÏß¾:y\u0015\"p\u0001Rß\u008d¥èpËX&Z\u0000ëc©^z¹F\u0094\u0019öúÑµ\f\u0085oVJV¤÷\u0087ºâ\u008fÝK8 \u001aþu\u0088P\u0084³QîbÈù+À\u0006\u008fac\\<¾ó\u0099\u0084ôÕ×(2wmK\u0097×µ\u001fÒFÿé\u001cè9ÑG\u0016du\u0081¶®ðËÊé\u00176\u007fSõp\u008a\u009dÄ»0Øyåÿ\u0002\u008b/ÞMejt·NÔ\u009eñÍ\u001f <lYEf\u0091\u0083§¡yÎ\nëC\b\u008cUàs?\u0090\u0000½\u0017Úæçè\u0005 \"HO\u0010\u0000c\"¯Eèh\t\u008bP\u0000t\"¼EåhJ\u008bK®rÐµóÖ\u0016\u00159S\\i~´¡ÜÄVç7\nz,\u008fOÛr\u0010\u0095.¸8Ú\u0084ýÑ ¢C6fq\u0088\u0080«ÖÎçñ!\u0014A6\u0096Yà|ì\u009f%Â\nä\u0099\u0007æ*÷M\u0003pD\u0092\u009dµ¤Øºû\u001b\u001eBAec¦\u0086Å©\u0003ÌYïd\u0011¬½W\u009f\u009bøÜÕ=6d\u0013\u0012m\u008bNó«=\u0084}áWÃ\u009c\u001cøybZ\u0003·N\u0091»òïÏ$(\u001a\u0005\fg°@å\u009d\u0096þ\u0002ÛE5´\u0016âsÓL\u0015©u\u008b¢äÔÁØ\"\u0011\u007f>Y\u00adºÒ\u0097\u0087ð~Í#Qns¤\u0014ì9\u001aÚRÿk\u0081°¢\u0081G\u0010h\\\r{/ºðÃ\u0095U¶1[p}\u0091\u001eÄ#\u001eÄ+éw\u008b\u0080¬\u0097qï\u001227pÙ\u008a¿\u0081\u009dMú\n×ë4²\u0011ÄoFL!©à\u0086½ã\u0083Á\u0018\u001e9{üXÉµ\u0085\u0093nð(Í¾*Ê\u0007\u009fe$B0\u009f\u000füÞÙ\u00907a\u0014/q\u000fNÐ«æ\u0089ræ[ÃL ß}è[=¸\r\u0095Q\u0007\u0096%ZB\u001doü\u008c¥©Ó×Rô#\u0011ä>¿[\u009cyB¦8ÃíàÅ\rÇ+xH.uú\u0092Ë¿ÍÝqú$'WDÆa\u0084\u008ft¬?É\u0012öÖ\u0013¿1c^\u0015{S\u0098ÀÅ±ã~\u0000Z-\u0005Jòwå\u0095,²Bß\u0012üº\u0019ê\u0000r\"«Eèh\u001f\u008bJ®hÐôóÑ\u0016\u00049_\\x~¿¡ÅÄ\u0013ç*\nf,ÀOÝr\u0014\u0095%¸mÚ\u008aýÐ ¢C5fp\u0088\u0088«\u009aÎÿñ?\u0014P6\u009aYà|©\u009fgÂ\rA\u001dcÃ\u0004\u0086)tÊ,ïY\u0091Ø²©Wnx5\u001d\u0016?Èà²\u0085g¦OKMmì\u000e¹3lÔ@ù\u000b\u009bý¼ëa\u0098\u0002A'\u0005É³ê²\u008f\u009e°]U3w\u00ad\u0018\u0098=ÊÞ\u0004îÓÌ\u0011«B\u0086®eá@Ø>\u0011\u001dwøà×ý²È\u0090\u000bOl*£\t\u0099äÇÂ>¡j\u009cì{\u0089VÀ49\u0013qÎ^\u00ad\u0084\u0088\u008ef9Ed \\\u001fÆúãØ+·\u0004\u0092VqÌ,½\nséQ\u0000}\u0000&\"è\u0000|\"²\u0000/\"á\u0000!\"óI]D?R\u0001pÎo\u0002MÏ\u0018Ü1®\u0000+\"å\u0000-\"ã\u0000*ý³\u0000%Ãô`\u0088ÕVd\u008aAxc²\u0004ú)\fÊDï}\u0091¦²\u0097W\u0006xG\u001dv?¼àÔ\u0085\r¦6K'mÒ\u000e\u00923N(óº\u009e\u0098kÿ2ÒÙ1\u0083\u0014¨j|I\u001d¬Þ\u0083\u0091æçÄ~\u001b\u0013~Ø]ý°¸\u0096_õ\nÈÅ/¡\u0088Uª Íùà\u0012\u0003H&cX·{Ö\u009e\u0015±ZÔ,ö®)ÇL\u001do!\u0082|¤À\u0016¦4JS\f~è\u009dµ¸\u0097Æ\u0011å\"\u0000í/¸J\u008chO·9ÒúñÎ\u001c\u0099\u0000E\"¶Eìh\u000f\u008b[®rÐ±óÆ\u0016P9W\\h~¿¡ÆÄ\u0002ç-\nt,\u0089OËr\u000e\u0095j¸zÚ\u0093ýÀ ¢C7fq\u0088\u0098«\u009a\u0000r\"«Eúh\u0006\u008b]®eÐ óË\u0016\u001f9P\\,~¹¡ÄÄ\u0017ç7\na,ÀOÀr\u001d\u0095'¸}Ú\u0095ý\u0094 ñC8fq\u0088\u0099«ÖÎìñv\u0014F6\u0097Yà|è\u009f3ÂFä\u0094\u0007©*ãM\u0007pT\u0092Þµ®ØãûH\u001e_Ajc¤\u0086Ï©\rÌ]ï~\u0011±4ÉW\u001azb\u009d7¿öâ\u0082\u0005T(fK?mÃÅ\u008cçD\u0080\u0001\u00adæN¤k\u008b\u0015B6-Óûüá\u0099\u0080»Md8\u0001ü\"×Ï\u0089é?\u008a3·æP\u0095}\u0084\u001fu8$å\u000e\u0086Ê£\u0085M3n2\u000b\u001e4ÝÑ³ó-\u009c\u0018¹,Z\u0084\u0000n\"»Eðh\u0006Ã^á\u0096\u0086Á«\"Hg\u0000s\"»Eìh\u000f\u008bJ®&Ð§óÊ\u0016\u001f9K\\`~¾¡\u0088Ä\u0014ç!\n2,\u0086OÁr\u0010\u0095&¸wÚ\u0091ýÑ æCpf|\u0088\u0095«\u009aÎéñv\u0014I6\u0097Y´|æ\u009f3ÂNäØ\u0007¯*úM\u0014p_\u0092\u009dµ\u00adØîû\u0001\u001eYAj\u0000E\"¶Eìh\u000f\u008b[®rÐ±óÆ\u0016P9m\\x~¨¡ÁÄ\u0018ç#\n2,\u0082OÛr\b\u0095j¸\u007fÚ\u0089ýÀ ¢©\u0001ÚÄø\u0013\u009f]²ªQ¶tÃ\n\u001f)uÌþãã\u0086Ê¤\u001b{s\u001e´=\u008eÐ\u009cö,\u0095e¨òO\u0082bÙ\u0000$'vúC\u0099\u0089¼ÕR&q4\u0014D+\u0081Îªì=\u0083N¦VE\u0093\u0018è>#Ý\rð\u001a\u0097\u00adªøH$o\u0007\u0002F!æÄ¿\u009b\u0090¹[\u001f6C4aÿ\u0006·+FÈ@í-\u0093ä°\u0095U]z\n\u001f0=¢â\u0095\u0087@¤xIjoÏ\f\u009f1PÖzû`\u0099\u0099\u0000'ñrÓ\u0087´Þ\u00995zo_D!\u0090\u0002ñç2È}\u00ad\u000b\u008f\u0098Pá55\u0016CûZÝ¡¾©\u0083/d\u0002IT+¤\fýÑÖ\u0000E\"¶Eÿh\u000f\u008bH®rÐ½óÍ\u0016\u001e9\u001e\\{~²¡ÁÄ\u001aç!\n2,\u0087OËr\b\u0095>¸qÚ\u0088ýÓ ¢C>f{\u0088\u0094«ÎÎ¨ñ\"\u0014K6\u0099Y¥|à\u009fb½\u0091ÚØ÷(\u0014o1UO\u009alê\u00899¦9Ã\\á\u0095>æ[=x\u0006\u0095\u0015³·Ðìí>\n\u0006'VE¯bô¿\u0085Ü\u0016ùM\u0017ë4óQÊn\t\u008bw©õÆ\u0093ãÆ\u0000\u0010]h{±\u0097\u0013µ\u009cÒÉÿ-\u001cn9GGÇLmn\u009e\tÄ$'ÇsâZ\u009c\u0099¿îZx\u0000 \"¬Eéh\u001e\u008b\u0018®tÐ±óÁ\u0016\u00159W\\z~¿¡ÌÄV\u0000 \"ãE¼\u0000P\"¯Eîh\u0019\u008b]®tÐû=\u0001\u001fþx¿UH¶\u0000\u00939íâÎÓ+G\u0004\u000ea4Cç\u009c\u009cùCÚ57'\u0011Är\u009aO\r¨o\u0085&ç\u0097À\u0080\u001d¡~s[ µÏ\u0096\u0098".getBytes(CharEncoding.ISO_8859_1)).asCharBuffer().get(cArr, 0, 1307);
        f1775 = cArr;
        f1776 = -7701051313826553138L;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static fq m2023(fq fqVar) {
        f1773 = (f1774 + 51) % 128;
        fq fqVar2 = f1778.get(fqVar);
        if (fqVar2 == null) {
            int i2 = f1773 + 75;
            f1774 = i2 % 128;
            if (i2 % 2 == 0) {
                f1778.put(fqVar, fqVar);
                throw null;
            }
            f1778.put(fqVar, fqVar);
        } else {
            fqVar = fqVar2;
        }
        f1773 = (f1774 + 99) % 128;
        return fqVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[PHI: r0
  0x001b: PHI (r0v10 com.ironsource.adqualitysdk.sdk.i.ee) = (r0v5 com.ironsource.adqualitysdk.sdk.i.ee), (r0v13 com.ironsource.adqualitysdk.sdk.i.ee) binds: [B:9:0x0025, B:5:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ee m2005(ee eeVar) {
        ee eeVar2;
        int i2 = f1774 + 11;
        f1773 = i2 % 128;
        if (i2 % 2 != 0) {
            eeVar2 = f1777.get(eeVar);
            int i3 = 10 / 0;
            if (eeVar2 == null) {
                f1777.put(eeVar, eeVar);
            } else {
                eeVar = eeVar2;
            }
        } else {
            eeVar2 = f1777.get(eeVar);
            if (eeVar2 == null) {
                f1777.put(eeVar, eeVar);
            } else {
                eeVar = eeVar2;
            }
        }
        int i4 = f1774 + 119;
        f1773 = i4 % 128;
        if (i4 % 2 == 0) {
            return eeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ Pair m2018(ds dsVar, List list) {
        f1774 = (f1773 + 29) % 128;
        Pair<String, ee> pairM1990 = dsVar.m1990(list);
        int i2 = f1773 + 67;
        f1774 = i2 % 128;
        if (i2 % 2 != 0) {
            return pairM1990;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final fk m2029(List<dy> list) {
        f1774 = (f1773 + 31) % 128;
        this.f1780 = 0;
        m2013(list, m2021(View.resolveSizeAndState(0, 0, 0) + 1, '0' - AndroidCharacter.getMirror('0'), (char) (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), m2021(Drawable.resolveOpacity(0, 0) + 42, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        fk fkVarM1998 = m1998(list);
        int i2 = f1773 + 73;
        f1774 = i2 % 128;
        if (i2 % 2 != 0) {
            return fkVarM1998;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private fq m2020(List<dy> list) {
        m2013(list, m2021(1 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 110, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern(), m2021(41 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 200, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0'))).intern());
        ee eeVarM2016 = m2016(list, m2021(1 - (ViewConfiguration.getTapTimeout() >> 16), 43 - Color.alpha(0), (char) (Process.getGidForName("") + 1)).intern());
        ee eeVarM2028 = m2028(list);
        m2027(list, m2021(TextUtils.indexOf("", "") + 1, 43 - TextUtils.indexOf("", "", 0, 0), (char) (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), eeVarM2028, m2021(33 - (ViewConfiguration.getWindowTouchSlop() >> 8), 241 - (ViewConfiguration.getTapTimeout() >> 16), (char) (38048 - (ViewConfiguration.getFadingEdgeLength() >> 16))).intern());
        fq fqVarM2023 = m2023(new fr(eeVarM2016, eeVarM2028, m2016(list, m2021(TextUtils.getOffsetAfter("", 0) + 1, 151 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 57091)).intern()), m2024(list)));
        int i2 = f1773 + 119;
        f1774 = i2 % 128;
        if (i2 % 2 != 0) {
            return fqVarM2023;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private fq m2024(List<dy> list) {
        String strM2067 = m1988(list).m2067();
        byte b2 = 4;
        switch (strM2067.hashCode()) {
            case -934396624:
                if (!strM2067.equals(m2021(TextUtils.indexOf((CharSequence) "", '0') + 7, Process.getGidForName("") + 55, (char) (TextUtils.getOffsetBefore("", 0) + 40484)).intern())) {
                    b2 = -1;
                } else {
                    f1774 = (f1773 + 101) % 128;
                }
                break;
            case -567202649:
                b2 = !strM2067.equals(m2021(8 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 65 - Gravity.getAbsoluteGravity(0, 0), (char) Color.green(0)).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 59:
                if (!strM2067.equals(m2021((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 43 - KeyEvent.normalizeMetaState(0), (char) (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    b2 = -1;
                } else {
                    f1774 = (f1773 + 11) % 128;
                    b2 = 0;
                }
                break;
            case 123:
                b2 = !strM2067.equals(m2021(View.MeasureSpec.makeMeasureSpec(0, 0) + 1, View.MeasureSpec.getMode(0), (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1)).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 3357:
                if (!strM2067.equals(m2021(View.MeasureSpec.getMode(0) + 2, 44 - View.resolveSize(0, 0), (char) TextUtils.indexOf("", "")).intern())) {
                    b2 = -1;
                } else {
                    f1773 = (f1774 + 11) % 128;
                    b2 = 1;
                }
                break;
            case 101577:
                b2 = !strM2067.equals(m2021((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 2, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 46, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern()) ? (byte) -1 : (byte) 2;
                break;
            case 115131:
                b2 = !strM2067.equals(m2021(3 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 73, (char) (2581 - (ViewConfiguration.getDoubleTapTimeout() >> 16))).intern()) ? (byte) -1 : (byte) 8;
                break;
            case 116519:
                b2 = !strM2067.equals(m2021(3 - View.MeasureSpec.makeMeasureSpec(0, 0), 76 - View.resolveSizeAndState(0, 0, 0), (char) (58336 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern()) ? (byte) -1 : (byte) 9;
                break;
            case 94001407:
                if (!strM2067.equals(m2021(TextUtils.getOffsetBefore("", 0) + 5, 59 - TextUtils.lastIndexOf("", '0'), (char) ((-1) - MotionEvent.axisFromString(""))).intern())) {
                    b2 = -1;
                } else {
                    int i2 = f1774 + 79;
                    f1773 = i2 % 128;
                    if (i2 % 2 == 0) {
                        b2 = 5;
                    }
                }
                break;
            case 113101617:
                b2 = !strM2067.equals(m2021(Drawable.resolveOpacity(0, 0) + 5, KeyEvent.normalizeMetaState(0) + 49, (char) (View.getDefaultSize(0, 0) + 16969)).intern()) ? (byte) -1 : (byte) 3;
                break;
            default:
                b2 = -1;
                break;
        }
        switch (b2) {
            case 0:
                return m2023(new fs(null));
            case 1:
                return m2008(list);
            case 2:
                return m2020(list);
            case 3:
                return m1999(list);
            case 4:
                return m2000(list);
            case 5:
                return m2001(list);
            case 6:
                return m1996(list);
            case 7:
                return m1998(list);
            case 8:
                fq fqVarM2002 = m2002(list);
                int i3 = f1774 + 5;
                f1773 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 60 / 0;
                }
                return fqVarM2002;
            case 9:
                return m2003(list);
            default:
                this.f1780--;
                ee eeVarM2028 = m2028(list);
                m2027(list, m2021((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), 43 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), eeVarM2028, m2021(30 - TextUtils.lastIndexOf("", '0'), 79 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (48857 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))).intern());
                return m2023(new fs(eeVarM2028));
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0026  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ee m2016(List<dy> list, String str) {
        int i2 = f1774 + 23;
        f1773 = i2 % 128;
        ee eeVarM2028 = null;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
            if (!m1987(list).m2063(str)) {
                eeVarM2028 = m2028(list);
                m2027(list, str, eeVarM2028, a.n(new StringBuilder(), m2021((ViewConfiguration.getLongPressTimeout() >> 16) + 36, KeyEvent.normalizeMetaState(0) + 274, (char) (51117 - KeyEvent.keyCodeFromString(""))), str));
            }
        } else if (!m1987(list).m2063(str)) {
            eeVarM2028 = m2028(list);
            m2027(list, str, eeVarM2028, a.n(new StringBuilder(), m2021((ViewConfiguration.getLongPressTimeout() >> 16) + 36, KeyEvent.normalizeMetaState(0) + 274, (char) (51117 - KeyEvent.keyCodeFromString(""))), str));
        }
        f1774 = (f1773 + 105) % 128;
        return eeVarM2028;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005b A[PHI: r1 r9
  0x005b: PHI (r1v8 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v5 com.ironsource.adqualitysdk.sdk.i.dm), (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:12:0x0058, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x005b: PHI (r9v4 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:12:0x0058, B:8:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x007c  */
    /* JADX WARN: Code duplicated, block: B:17:0x0086 A[PHI: r1 r9
  0x0086: PHI (r1v6 com.ironsource.adqualitysdk.sdk.i.dm) = (r1v5 com.ironsource.adqualitysdk.sdk.i.dm), (r1v10 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:11:0x0056, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]
  0x0086: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v7 java.lang.String) binds: [B:11:0x0056, B:7:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x00aa  */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ee m2028(List<dy> list) {
        dm dmVarM1949;
        String strM2067;
        ee eeVarM1994 = m1994(list);
        if (!m1986(list)) {
            return eeVarM1994;
        }
        int i2 = f1773 + 35;
        f1774 = i2 % 128;
        byte b2 = -1;
        if (i2 % 2 == 0) {
            dmVarM1949 = dm.m1949(this.f1779, eeVarM1994.m2087());
            strM2067 = m1988(list).m2067();
            int iHashCode = strM2067.hashCode();
            int i3 = 37 / 0;
            if (iHashCode != 1216) {
                if (iHashCode == 3968) {
                    if (strM2067.equals(m2021(View.resolveSizeAndState(0, 0, 0) + 2, 766 - MotionEvent.axisFromString(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern())) {
                        f1773 = (f1774 + 63) % 128;
                        b2 = 1;
                    }
                }
            } else if (strM2067.equals(m2021(TextUtils.indexOf("", "", 0) + 2, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 765, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                f1774 = (f1773 + 77) % 128;
                b2 = 0;
            }
        } else {
            dmVarM1949 = dm.m1949(this.f1779, eeVarM1994.m2087());
            strM2067 = m1988(list).m2067();
            int iHashCode2 = strM2067.hashCode();
            if (iHashCode2 != 1216) {
                if (iHashCode2 == 3968) {
                    if (strM2067.equals(m2021(View.resolveSizeAndState(0, 0, 0) + 2, 766 - MotionEvent.axisFromString(""), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0))).intern())) {
                        f1773 = (f1774 + 63) % 128;
                        b2 = 1;
                    }
                }
            } else if (strM2067.equals(m2021(TextUtils.indexOf("", "", 0) + 2, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 765, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0))).intern())) {
                f1774 = (f1773 + 77) % 128;
                b2 = 0;
            }
        }
        if (b2 == 0) {
            return m2005(new em(eeVarM1994, m2028(list), dmVarM1949));
        }
        if (b2 != 1) {
            this.f1780--;
            return eeVarM1994;
        }
        return m2005(new fb(eeVarM1994, m2028(list), dmVarM1949));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d A[PHI: r0
  0x005d: PHI (r0v7 com.ironsource.adqualitysdk.sdk.i.dm) = (r0v4 com.ironsource.adqualitysdk.sdk.i.dm), (r0v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:17:0x0079  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0031 A[EXC_TOP_SPLITTER, PHI: r0
  0x0031: PHI (r0v5 com.ironsource.adqualitysdk.sdk.i.dm) = (r0v4 com.ironsource.adqualitysdk.sdk.i.dm), (r0v12 com.ironsource.adqualitysdk.sdk.i.dm) binds: [B:8:0x002f, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ee m2019(dy dyVar) {
        dm dmVarM1949;
        int i2 = f1773 + 75;
        f1774 = i2 % 128;
        if (i2 % 2 == 0) {
            dmVarM1949 = dm.m1949(this.f1779, dyVar.m2064());
            int i3 = 98 / 0;
            if (dyVar.m2057()) {
                try {
                    try {
                        return m2005(new fg(Integer.valueOf(Integer.parseInt(dyVar.m2067())), dmVarM1949));
                    } catch (Exception unused) {
                        return m2005(new fe(Long.valueOf(Long.parseLong(dyVar.m2067())), dmVarM1949));
                    }
                } catch (Exception unused2) {
                }
            } else {
                if (dyVar.m2061()) {
                    return m2005(new fh(Double.valueOf(Double.parseDouble(dyVar.m2067())), dmVarM1949));
                }
                if (dyVar.m2060()) {
                    ee eeVarM2005 = m2005(new fi(Boolean.valueOf(Boolean.parseBoolean(dyVar.m2067())), dmVarM1949));
                    f1774 = (f1773 + 5) % 128;
                    return eeVarM2005;
                }
            }
        } else {
            dmVarM1949 = dm.m1949(this.f1779, dyVar.m2064());
            if (dyVar.m2057()) {
                return m2005(new fg(Integer.valueOf(Integer.parseInt(dyVar.m2067())), dmVarM1949));
            }
            if (dyVar.m2061()) {
                return m2005(new fh(Double.valueOf(Double.parseDouble(dyVar.m2067())), dmVarM1949));
            }
            if (dyVar.m2060()) {
                ee eeVarM2006 = m2005(new fi(Boolean.valueOf(Boolean.parseBoolean(dyVar.m2067())), dmVarM1949));
                f1774 = (f1773 + 5) % 128;
                return eeVarM2006;
            }
        }
        return m2005(new fl(dyVar.m2067(), dmVarM1949));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ee m2007(ee eeVar, List<dy> list) {
        f1773 = (f1774 + 11) % 128;
        ee eeVarM2028 = m2028(list);
        m2027(list, m2021((ViewConfiguration.getJumpTapTimeout() >> 16) + 1, 811 - (ViewConfiguration.getEdgeSlop() >> 16), (char) (10414 - Gravity.getAbsoluteGravity(0, 0))).intern(), eeVarM2028, m2021(KeyEvent.getDeadChar(0, 0) + 35, 956 - View.MeasureSpec.getMode(0), (char) (50687 - View.MeasureSpec.getMode(0))).intern());
        dy dyVarM1988 = m1988(list);
        dm dmVarM1949 = dm.m1949(this.f1779, dyVarM1988.m2064());
        if (dyVarM1988.m2063(m2021(1 - Color.red(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 790, (char) (54635 - (KeyEvent.getMaxKeyCode() >> 16))).intern())) {
            ee eeVarM2005 = m2005(new eg(eeVar, eeVarM2028, m2028(list), dmVarM1949));
            f1773 = (f1774 + 35) % 128;
            return eeVarM2005;
        }
        this.f1780--;
        return m2005(new eh(eeVar, eeVarM2028, dmVarM1949));
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2006(String str, String str2, Object obj, String str3) {
        String string;
        f1773 = (f1774 + 89) % 128;
        String strN = "";
        if (obj != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2021(Color.argb(0, 0, 0, 0) + 7, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1239, (char) (View.combineMeasuredStates(0, 0) + 38707)).intern());
            sb.append(obj);
            string = sb.toString();
        } else {
            string = "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2021((ViewConfiguration.getEdgeSlop() >> 16) + 9, Color.red(0) + 1246, (char) (19495 - TextUtils.indexOf((CharSequence) "", '0', 0))).intern());
        sb2.append(str);
        sb2.append(string);
        sb2.append(m2021(TextUtils.indexOf("", "", 0) + 14, (Process.myPid() >> 22) + 1255, (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1)).intern());
        sb2.append(str2);
        if (str3 != null) {
            strN = a.n(new StringBuilder(), m2021(3 - View.getDefaultSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1269, (char) View.getDefaultSize(0, 0)), str3);
        } else {
            f1773 = (f1774 + 93) % 128;
        }
        sb2.append(strN);
        return sb2.toString();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ee m2015(ee eeVar, List<dy> list) {
        int i2 = f1773 + 69;
        f1774 = i2 % 128;
        List<ee> listM1992 = null;
        if (i2 % 2 != 0) {
            dy dyVarM1988 = m1988(list);
            if (!dyVarM1988.m2055()) {
                StringBuilder sb = new StringBuilder();
                sb.append(m2021(View.MeasureSpec.makeMeasureSpec(0, 0) + 28, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 865, (char) View.MeasureSpec.getSize(0)).intern());
                sb.append(dyVarM1988);
                m2026(sb.toString(), null);
            }
            String strM2067 = dyVarM1988.m2067();
            dy dyVarM1989 = m1988(list);
            if (!dyVarM1989.m2063(m2021(1 - TextUtils.getOffsetBefore("", 0), 773 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (TextUtils.getTrimmedLength("") + 18785)).intern())) {
                if (!dyVarM1989.m2063(m2021(1 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 110, (char) (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    this.f1780--;
                    return m2005(new ea(eeVar, strM2067, dm.m1949(strM2067, dyVarM1989.m2064())));
                }
            } else {
                f1774 = (f1773 + 9) % 128;
                listM1992 = m1992(list);
                m2027(list, m2021(1 - View.MeasureSpec.getSize(0), 110 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L)).intern(), listM1992, m2021(Drawable.resolveOpacity(0, 0) + 63, 893 - View.MeasureSpec.getSize(0), (char) View.resolveSizeAndState(0, 0, 0)).intern());
            }
            return m2005(new ed(eeVar, strM2067, listM1992, m2009(list, m2021(1 - (ViewConfiguration.getKeyRepeatDelay() >> 16), ExpandableListView.getPackedPositionType(0L) + 151, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 57091)).intern()), dm.m1949(strM2067, dyVarM1989.m2064())));
        }
        m1988(list).m2055();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2021(int i2, int i3, char c2) {
        String str;
        synchronized (a.f68) {
            try {
                char[] cArr = new char[i2];
                a.f69 = 0;
                while (true) {
                    int i4 = a.f69;
                    if (i4 < i2) {
                        cArr[i4] = (char) ((((long) f1775[i3 + i4]) ^ (((long) i4) * f1776)) ^ ((long) c2));
                        a.f69 = i4 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<ee> m2009(List<dy> list, String str) {
        List<ee> listM2010 = m2010(list, str, new e<ee>() { // from class: com.ironsource.adqualitysdk.sdk.i.ds.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ds.e
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final /* synthetic */ ee mo2030(List list2) {
                return ds.this.m2028((List<dy>) list2);
            }
        });
        f1773 = (f1774 + 103) % 128;
        return listM2010;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private <T> List<T> m2010(List<dy> list, String str, e<T> eVar) {
        ArrayList arrayList = new ArrayList();
        if (!m1988(list).m2063(str)) {
            f1774 = (f1773 + 69) % 128;
            this.f1780--;
            arrayList.add(eVar.mo2030(list));
            dy dyVarM1988 = m1988(list);
            while (dyVarM1988.m2063(m2021(View.getDefaultSize(0, 0) + 1, ImageFormat.getBitsPerPixel(0) + 1121, (char) (7962 - Color.red(0))).intern())) {
                int i2 = f1774 + 107;
                f1773 = i2 % 128;
                if (i2 % 2 == 0) {
                    arrayList.add(eVar.mo2030(list));
                    dyVarM1988 = m1988(list);
                } else {
                    arrayList.add(eVar.mo2030(list));
                    m1988(list);
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append(m2021(22 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 1121, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 17240)).intern());
            sb.append(str);
            m2025(dyVarM1988, str, arrayList, a.C(sb, m2021(1 - (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1142, (char) TextUtils.indexOf("", "", 0, 0))));
            f1774 = (f1773 + 121) % 128;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2027(List<dy> list, String str, Object obj, String str2) {
        f1774 = (f1773 + 47) % 128;
        m2025(m1988(list), str, obj, str2);
        int i2 = f1774 + 101;
        f1773 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2025(dy dyVar, String str, Object obj, String str2) {
        f1773 = (f1774 + 85) % 128;
        if (!dyVar.m2063(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(m2021((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1, 1143 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern());
            sb.append(str);
            String strC = a.C(sb, m2021(1 - View.MeasureSpec.makeMeasureSpec(0, 0), 1142 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) TextUtils.getCapsMode("", 0, 0)));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2021(1 - (ViewConfiguration.getLongPressTimeout() >> 16), 1143 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)))).intern());
            sb2.append(dyVar.m2067());
            m2012(m2006(strC, a.C(sb2, m2021(TextUtils.getOffsetBefore("", 0) + 1, TextUtils.indexOf("", "") + 1143, (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))), obj, str2));
        }
        f1774 = (f1773 + 119) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0073  */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private ee m2014(dy dyVar, List<dy> list) {
        byte b2;
        String strM2067 = dyVar.m2067();
        int iHashCode = strM2067.hashCode();
        if (iHashCode != 3392903) {
            if (iHashCode == 109801339 && !(!strM2067.equals(m2021(Gravity.getAbsoluteGravity(0, 0) + 5, View.MeasureSpec.getMode(0) + 995, (char) (49964 - TextUtils.lastIndexOf("", '0', 0, 0))).intern()))) {
                f1774 = (f1773 + 3) % 128;
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (!(!strM2067.equals(m2021(4 - (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.indexOf("", "", 0) + 991, (char) View.combineMeasuredStates(0, 0)).intern()))) {
            f1774 = (f1773 + 99) % 128;
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return fn.m2127();
        }
        if (b2 != 1) {
            return null;
        }
        m2027(list, m2021((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 788, (char) (TextUtils.indexOf((CharSequence) "", '0') + 50139)).intern(), dyVar, m2021(47 - View.getDefaultSize(0, 0), 1000 - (KeyEvent.getMaxKeyCode() >> 16), (char) TextUtils.indexOf("", "")).intern());
        return m2015(m2005(new el(m2021((ViewConfiguration.getJumpTapTimeout() >> 16) + 5, 995 - ExpandableListView.getPackedPositionGroup(0L), (char) (49965 - TextUtils.getTrimmedLength(""))).intern(), dm.m1949(this.f1779, dyVar.m2064()))), list);
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2026(String str, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(m2021((ViewConfiguration.getLongPressTimeout() >> 16) + 7, 1273 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (char) TextUtils.getTrimmedLength("")).intern());
        sb.append(this.f1781);
        sb.append(m2021((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 786, (char) (64924 - Color.alpha(0))).intern());
        sb.append(this.f1779);
        cq.m1676(sb.toString(), str, th);
        throw new RuntimeException(m2021(29 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (-16775937) - Color.rgb(0, 0, 0), (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 15697)).intern(), th);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2013(List<dy> list, String str, String str2) {
        f1774 = (f1773 + 101) % 128;
        m2027(list, str, (Object) null, str2);
        f1774 = (f1773 + 41) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2011(dy dyVar, dy.e eVar, Object obj, String str) {
        f1773 = (f1774 + 53) % 128;
        if (!dyVar.m2065().equals(eVar)) {
            int i2 = f1773 + 117;
            f1774 = i2 % 128;
            int i3 = i2 % 2;
            m2012(m2006(eVar.toString(), dyVar.m2065().toString(), obj, str));
            if (i3 == 0) {
                int i4 = 16 / 0;
            }
            f1773 = (f1774 + 73) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2012(String str) {
        int i2 = f1773 + 69;
        f1774 = i2 % 128;
        int i3 = i2 % 2;
        m2026(str, null);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }
}
