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
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.InterfaceC0435l1;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class dx {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1836 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1837;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static long f1838;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f1839;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<gb, gb> f1840;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<ef, ef> f1841;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int f1844 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f1843 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private byte f1842 = 0;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface e<T> {
        /* JADX INFO: renamed from: ﻛ */
        T mo2100(List<ec> list);
    }

    static {
        m2097();
        f1841 = new HashMap();
        f1840 = new HashMap();
        f1837 = (f1836 + 65) % 128;
    }

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private boolean m2056(List<ec> list) {
        f1837 = (f1836 + 45) % 128;
        if (this.f1844 >= list.size()) {
            return false;
        }
        f1837 = (f1836 + 117) % 128;
        return true;
    }

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private ec m2057(List<ec> list) {
        int i10 = f1837 + 33;
        f1836 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                m2056(list);
                throw null;
            }
            if (!m2056(list)) {
                m2084(m2082((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1129 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), (Throwable) null);
                return null;
            }
            f1837 = (f1836 + 37) % 128;
            int i11 = this.f1844;
            this.f1844 = i11 + 1;
            return list.get(i11);
        } catch (Exception e10) {
            m2084(m2082((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 1152 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 33).intern(), e10);
        }
    }

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private ec m2058(List<ec> list) {
        try {
            if (m2056(list)) {
                int i10 = f1836 + 21;
                f1837 = i10 % 128;
                if (i10 % 2 == 0) {
                    return list.get(this.f1844);
                }
                int i11 = 23 / 0;
                return list.get(this.f1844);
            }
        } catch (Exception e10) {
            m2084(m2082((char) (ExpandableListView.getPackedPositionType(0L) + 13756), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1185, View.resolveSizeAndState(0, 0, 0) + 37).intern(), e10);
        }
        f1837 = (f1836 + InterfaceC0435l1.d.b.f29105b) % 128;
        return null;
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private Pair<String, ef> m2059(List<ec> list) {
        int i10 = f1837 + 79;
        f1836 = i10 % 128;
        if (i10 % 2 == 0) {
            m2057(list).m2139();
            throw null;
        }
        ec ecVarM2057 = m2057(list);
        if (!ecVarM2057.m2139()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2082((char) (44670 - TextUtils.getOffsetBefore("", 0)), (ViewConfiguration.getEdgeSlop() >> 16) + IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, (ViewConfiguration.getWindowTouchSlop() >> 8) + 24).intern());
            sb2.append(ecVarM2057);
            m2084(sb2.toString(), (Throwable) null);
        }
        String strM2138 = ecVarM2057.m2138();
        m2078(list, m2082((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 43112), 1055 - (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 1 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), strM2138, m2082((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, 48 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
        Pair<String, ef> pair = new Pair<>(strM2138, m2099(list));
        int i11 = f1837 + 123;
        f1836 = i11 % 128;
        if (i11 % 2 != 0) {
            return pair;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private List<ef> m2060(List<ec> list) {
        List<ef> listM2077 = m2077(list, m2082((char) (KeyEvent.getMaxKeyCode() >> 16), 775 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1 - (Process.myTid() >> 22)).intern(), new e<ef>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.5

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1851 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1852;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char[] f1853 = {'6', 143, 177, 186, 188, 180, 177, 177, 184, 150, 151, 193, 184, 142, 150, 182, 184, 159, 158, 192, 183, 179, 180, 142, 143, 177, 185, 184, 177, 183, 193, 171};

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
            
                if ((r5 instanceof com.ironsource.adqualitysdk.sdk.i.eq) != false) goto L11;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
            
                return r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
            
                r4 = r4.f1854;
                r0 = new java.lang.StringBuilder();
                r0.append(m2104("\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001", new int[]{0, 32, 77, 0}, true).intern());
                r0.append(r5);
                com.ironsource.adqualitysdk.sdk.i.dx.m2087(r4, r0.toString());
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                return null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
            
                if ((r5 instanceof com.ironsource.adqualitysdk.sdk.i.eq) != false) goto L11;
             */
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private com.ironsource.adqualitysdk.sdk.i.ef m2103(java.util.List<com.ironsource.adqualitysdk.sdk.i.ec> r5) {
                /*
                    r4 = this;
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass5.f1851
                    int r0 = r0 + 67
                    int r0 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass5.f1852 = r0
                    com.ironsource.adqualitysdk.sdk.i.dx r0 = com.ironsource.adqualitysdk.sdk.i.dx.this
                    com.ironsource.adqualitysdk.sdk.i.ef r5 = com.ironsource.adqualitysdk.sdk.i.dx.m2089(r0, r5)
                    boolean r0 = r5 instanceof com.ironsource.adqualitysdk.sdk.i.ei
                    if (r0 != 0) goto L55
                    int r0 = com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass5.f1851
                    int r0 = r0 + 111
                    int r1 = r0 % 128
                    com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass5.f1852 = r1
                    int r0 = r0 % 2
                    r1 = 0
                    if (r0 == 0) goto L27
                    boolean r0 = r5 instanceof com.ironsource.adqualitysdk.sdk.i.eq
                    r2 = 26
                    int r2 = r2 / r1
                    if (r0 == 0) goto L2c
                    goto L2b
                L27:
                    boolean r0 = r5 instanceof com.ironsource.adqualitysdk.sdk.i.eq
                    if (r0 == 0) goto L2c
                L2b:
                    return r5
                L2c:
                    com.ironsource.adqualitysdk.sdk.i.dx r4 = com.ironsource.adqualitysdk.sdk.i.dx.this
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    r2 = 32
                    r3 = 77
                    int[] r1 = new int[]{r1, r2, r3, r1}
                    r2 = 1
                    java.lang.String r3 = "\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001"
                    java.lang.String r1 = m2104(r3, r1, r2)
                    java.lang.String r1 = r1.intern()
                    r0.append(r1)
                    r0.append(r5)
                    java.lang.String r5 = r0.toString()
                    com.ironsource.adqualitysdk.sdk.i.dx.m2087(r4, r5)
                    r4 = 0
                    return r4
                L55:
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dx.AnonymousClass5.m2103(java.util.List):com.ironsource.adqualitysdk.sdk.i.ef");
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ ef mo2100(List list2) {
                f1851 = (f1852 + 81) % 128;
                ef efVarM2103 = m2103(list2);
                f1852 = (f1851 + 47) % 128;
                return efVarM2103;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2104(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
                String str2;
                Object bytes = str;
                if (str != null) {
                    bytes = str.getBytes("ISO-8859-1");
                }
                byte[] bArr = (byte[]) bytes;
                synchronized (h.f2261) {
                    try {
                        int i10 = iArr[0];
                        int i11 = iArr[1];
                        int i12 = iArr[2];
                        int i13 = iArr[3];
                        char[] cArr = new char[i11];
                        System.arraycopy(f1853, i10, cArr, 0, i11);
                        if (bArr != null) {
                            char[] cArr2 = new char[i11];
                            h.f2262 = 0;
                            char c4 = 0;
                            while (true) {
                                int i14 = h.f2262;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (bArr[i14] == 1) {
                                    cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                                } else {
                                    cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                                }
                                c4 = cArr2[i14];
                                h.f2262 = i14 + 1;
                            }
                            cArr = cArr2;
                        }
                        if (i13 > 0) {
                            char[] cArr3 = new char[i11];
                            System.arraycopy(cArr, 0, cArr3, 0, i11);
                            int i15 = i11 - i13;
                            System.arraycopy(cArr3, 0, cArr, i15, i13);
                            System.arraycopy(cArr3, i13, cArr, 0, i15);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i11];
                            h.f2262 = 0;
                            while (true) {
                                int i16 = h.f2262;
                                if (i16 >= i11) {
                                    break;
                                }
                                cArr4[i16] = cArr[(i11 - i16) - 1];
                                h.f2262 = i16 + 1;
                            }
                            cArr = cArr4;
                        }
                        if (i12 > 0) {
                            h.f2262 = 0;
                            while (true) {
                                int i17 = h.f2262;
                                if (i17 >= i11) {
                                    break;
                                }
                                cArr[i17] = (char) (cArr[i17] - iArr[2]);
                                h.f2262 = i17 + 1;
                            }
                        }
                        str2 = new String(cArr);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        });
        int i10 = f1837 + 23;
        f1836 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 89 / 0;
        }
        return listM2077;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private Map<String, ef> m2061(List<ec> list) {
        HashMap map = new HashMap();
        for (Pair pair : m2077(list, m2082((char) (View.resolveSize(0, 0) + 28391), 764 - View.resolveSizeAndState(0, 0, 0), 1 - View.MeasureSpec.getMode(0)).intern(), new e<Pair<String, ef>>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.1
            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final /* bridge */ /* synthetic */ Pair<String, ef> mo2100(List list2) {
                return dx.m2079(dx.this, list2);
            }
        })) {
            f1837 = (f1836 + InterfaceC0435l1.d.b.f29114k) % 128;
            map.put(pair.first, pair.second);
        }
        f1837 = (f1836 + 83) % 128;
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0214, code lost:
    
        if (r1.equals(m2082((char) android.text.TextUtils.getOffsetAfter("", 0), 110 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), -android.graphics.ImageFormat.getBitsPerPixel(0)).intern()) != false) goto L64;
     */
    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ef m2062(java.util.List<com.ironsource.adqualitysdk.sdk.i.ec> r13) {
        /*
            Method dump skipped, instruction units count: 775
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dx.m2062(java.util.List):com.ironsource.adqualitysdk.sdk.i.ef");
    }

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private ef m2063(List<ec> list) {
        f1837 = (f1836 + InterfaceC0435l1.d.b.f29110g) % 128;
        ef efVarM2062 = m2062(list);
        while (m2056(list)) {
            int i10 = f1836 + 69;
            f1837 = i10 % 128;
            if (i10 % 2 != 0) {
                m2057(list).m2138().hashCode();
                throw null;
            }
            String strM2138 = m2057(list).m2138();
            int iHashCode = strM2138.hashCode();
            byte b10 = -1;
            if (iHashCode != 46) {
                if (iHashCode == 91 && strM2138.equals(m2082((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 33952), ImageFormat.getBitsPerPixel(0) + 790, 1 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                    b10 = 1;
                }
            } else if (strM2138.equals(m2082((char) (45009 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 788, -TextUtils.indexOf((CharSequence) "", '0')).intern())) {
                b10 = 0;
            }
            if (b10 == 0) {
                efVarM2062 = m2090(efVarM2062, list);
            } else {
                if (b10 != 1) {
                    this.f1844--;
                    return efVarM2062;
                }
                efVarM2062 = m2075(efVarM2062, list);
            }
        }
        return efVarM2062;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private gb m2064(List<ec> list) {
        m2088(list, m2082((char) ((ViewConfiguration.getTapTimeout() >> 16) + 21354), 43 - (Process.myPid() >> 22), 1 - KeyEvent.getDeadChar(0, 0)).intern(), m2082((char) (59784 - (Process.myPid() >> 22)), (Process.myTid() >> 22) + 726, AndroidCharacter.getMirror('0') - '\n').intern());
        gb gbVarM2086 = m2086(new fw());
        int i10 = f1837 + 71;
        f1836 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 57 / 0;
        }
        return gbVarM2086;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ef m2065(List<ec> list) {
        ef efVarM2068;
        int i10 = f1836 + 89;
        f1837 = i10 % 128;
        if (i10 % 2 == 0) {
            efVarM2068 = m2068(list);
            if (m2056(list)) {
            }
            return efVarM2068;
        }
        efVarM2068 = m2068(list);
        int i11 = 90 / 0;
        if (!m2056(list)) {
            return efVarM2068;
        }
        String strM2138 = m2057(list).m2138();
        int iHashCode = strM2138.hashCode();
        if (iHashCode != 43) {
            if (iHashCode != 45) {
                if (iHashCode != 1376) {
                    if (iHashCode == 1440 && strM2138.equals(m2082((char) Color.green(0), TextUtils.lastIndexOf("", '0', 0, 0) + 784, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 2).intern())) {
                        return m2074(new ex((eq) efVarM2068));
                    }
                } else if (strM2138.equals(m2082((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 781 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionType(0L) + 2).intern())) {
                    return m2074(new ez((eq) efVarM2068));
                }
            } else if (strM2138.equals(m2082((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 780, ((Process.getThreadPriority(0) + 20) >> 6) + 1).intern())) {
                f1837 = (f1836 + InterfaceC0435l1.d.b.f29107d) % 128;
                return m2074(new ff(efVarM2068, m2065(list)));
            }
        } else if (strM2138.equals(m2082((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 779 - (KeyEvent.getMaxKeyCode() >> 16), 1 - (Process.myTid() >> 22)).intern())) {
            f1836 = (f1837 + 59) % 128;
            return m2074(new fj(efVarM2068, m2065(list)));
        }
        this.f1844--;
        return efVarM2068;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private ef m2066(List<ec> list) {
        f1837 = (f1836 + 89) % 128;
        ef efVarM2065 = m2065(list);
        if (m2056(list)) {
            String strM2138 = m2057(list).m2138();
            int iHashCode = strM2138.hashCode();
            if (iHashCode != 60) {
                if (iHashCode != 62) {
                    if (iHashCode != 1084) {
                        if (iHashCode != 1921) {
                            if (iHashCode != 1952) {
                                if (iHashCode == 1983 && strM2138.equals(m2082((char) View.MeasureSpec.getSize(0), TextUtils.getCapsMode("", 0, 0) + 777, 2 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern())) {
                                    return m2074(new fa(efVarM2065, m2066(list)));
                                }
                            } else if (strM2138.equals(m2082((char) Color.alpha(0), TextUtils.indexOf("", "", 0) + 769, Process.getGidForName("") + 3).intern())) {
                                f1837 = (f1836 + 47) % 128;
                                return m2074(new fb(efVarM2065, m2066(list)));
                            }
                        } else if (strM2138.equals(m2082((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 775 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1).intern())) {
                            f1837 = (f1836 + 97) % 128;
                            return m2074(new fe(efVarM2065, m2066(list)));
                        }
                    } else if (strM2138.equals(m2082((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 27620), View.resolveSize(0, 0) + 771, 2 - View.MeasureSpec.getSize(0)).intern())) {
                        return m2074(new fi(efVarM2065, m2066(list)));
                    }
                } else if (strM2138.equals(m2082((char) TextUtils.getOffsetAfter("", 0), 775 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern())) {
                    ef efVarM2074 = m2074(new fd(efVarM2065, m2066(list)));
                    int i10 = f1837 + 25;
                    f1836 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return efVarM2074;
                    }
                    throw null;
                }
            } else if (strM2138.equals(m2082((char) TextUtils.indexOf("", "", 0), 773 - View.resolveSizeAndState(0, 0, 0), -MotionEvent.axisFromString("")).intern())) {
                f1836 = (f1837 + 49) % 128;
                return m2074(new fc(efVarM2065, m2066(list)));
            }
            this.f1844--;
        }
        return efVarM2065;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private ft m2067(List<ec> list) {
        ArrayList arrayList = new ArrayList();
        byte b10 = (byte) (this.f1842 + 1);
        this.f1842 = b10;
        ec ecVarM2058 = m2058(list);
        f1836 = (f1837 + 65) % 128;
        while (!ecVarM2058.m2140(m2082((char) (TextUtils.lastIndexOf("", '0') + 28392), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 764, 1 - TextUtils.getCapsMode("", 0, 0)).intern())) {
            int i10 = f1837 + 13;
            f1836 = i10 % 128;
            this.f1843 = i10 % 2 == 0 ? this.f1843 - 1 : this.f1843 + 1;
            arrayList.add(m2092(list));
            ecVarM2058 = m2058(list);
        }
        this.f1844++;
        this.f1843++;
        this.f1842 = (byte) (this.f1842 - 1);
        return (ft) m2086(new ft(arrayList, b10));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a3, code lost:
    
        if (r2.equals(m2082((char) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 63100), 785 - android.graphics.Color.argb(0, 0, 0, 0), -android.text.TextUtils.lastIndexOf("", '0')).intern()) != false) goto L26;
     */
    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.adqualitysdk.sdk.i.ef m2068(java.util.List<com.ironsource.adqualitysdk.sdk.i.ec> r7) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.dx.m2068(java.util.List):com.ironsource.adqualitysdk.sdk.i.ef");
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private gb m2069(List<ec> list) {
        m2088(list, m2082((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + InterfaceC0435l1.d.b.f29111h, TextUtils.indexOf("", "", 0) + 1).intern(), m2082((char) (View.resolveSize(0, 0) + 24811), 309 - TextUtils.lastIndexOf("", '0', 0, 0), 43 - View.combineMeasuredStates(0, 0)).intern());
        ef efVarM2099 = m2099(list);
        m2088(list, m2082((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 152 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -MotionEvent.axisFromString("")).intern(), m2082((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0') + 354, 47 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)).intern());
        gb gbVarM2086 = m2086(new ge(efVarM2099, m2092(list)));
        f1837 = (f1836 + 37) % 128;
        return gbVarM2086;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private gb m2070(List<ec> list) {
        gb gbVarM2086;
        int i10 = f1836 + 63;
        f1837 = i10 % 128;
        if (i10 % 2 == 0 ? !m2058(list).m2140(m2082((char) (21354 - ExpandableListView.getPackedPositionGroup(0L)), 43 - ExpandableListView.getPackedPositionType(0L), -TextUtils.lastIndexOf("", '0')).intern()) : !m2058(list).m2140(m2082((char) (ExpandableListView.getPackedPositionGroup(1L) * 17165), 90 >> ExpandableListView.getPackedPositionType(0L), -TextUtils.lastIndexOf("", (char) 17)).intern())) {
            gbVarM2086 = m2086(new ga(m2099(list)));
            f1836 = (f1837 + 95) % 128;
        } else {
            gbVarM2086 = m2086(new ga(null));
        }
        m2078(list, m2082((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 21354), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43, 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), gbVarM2086, m2082((char) ((-16732197) - Color.rgb(0, 0, 0)), 655 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 36).intern());
        return gbVarM2086;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private gb m2071(List<ec> list) {
        m2088(list, m2082((char) (21354 - Drawable.resolveOpacity(0, 0)), 43 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1).intern(), m2082((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 61472), 690 - TextUtils.indexOf((CharSequence) "", '0', 0), 35 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        gb gbVarM2086 = m2086(new fv());
        int i10 = f1836 + 67;
        f1837 = i10 % 128;
        if (i10 % 2 == 0) {
            return gbVarM2086;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private gb m2072(List<ec> list) {
        gb gbVarM2086 = m2086(new gd(m2077(list, m2082((char) (21354 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), View.MeasureSpec.getMode(0) + 43, 1 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), new e<ef>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.4

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f1847 = 7;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f1848 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f1849 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m2101(int i10, boolean z10, int i11, String str, int i12) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (d.f1625) {
                    try {
                        char[] cArr2 = new char[i10];
                        d.f1622 = 0;
                        while (true) {
                            int i13 = d.f1622;
                            if (i13 >= i10) {
                                break;
                            }
                            d.f1624 = cArr[i13];
                            cArr2[d.f1622] = (char) (d.f1624 + i11);
                            int i14 = d.f1622;
                            cArr2[i14] = (char) (cArr2[i14] - f1847);
                            d.f1622 = i14 + 1;
                        }
                        if (i12 > 0) {
                            d.f1623 = i12;
                            char[] cArr3 = new char[i10];
                            System.arraycopy(cArr2, 0, cArr3, 0, i10);
                            int i15 = d.f1623;
                            System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                            int i16 = d.f1623;
                            System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                        }
                        if (z10) {
                            char[] cArr4 = new char[i10];
                            d.f1622 = 0;
                            while (true) {
                                int i17 = d.f1622;
                                if (i17 >= i10) {
                                    break;
                                }
                                cArr4[i17] = cArr2[(i10 - i17) - 1];
                                d.f1622 = i17 + 1;
                            }
                            cArr2 = cArr4;
                        }
                        str2 = new String(cArr2);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private ef m2102(List<ec> list2) {
                ef efVarM2099 = dx.this.m2099(list2);
                if ((efVarM2099 instanceof eq) || (efVarM2099 instanceof ej)) {
                    int i10 = f1848 + 91;
                    f1849 = i10 % 128;
                    if (i10 % 2 == 0) {
                        int i11 = 5 / 0;
                    }
                    return efVarM2099;
                }
                dx dxVar = dx.this;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2101(31 - (ViewConfiguration.getFadingEdgeLength() >> 16), true, 102 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), "\uffc1\u0005\u0006\u0017\n\u0006\u0004\u0006\u0013\uffc1\u0015\u0016\u0003\uffc1\u0006\r\u0003\u0002\n\u0013\u0002\u0017\uffc1\u0005\u0006\u0015\u0004\u0006\u0011\u0019￦", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 32).intern());
                sb2.append(efVarM2099);
                dx.m2087(dxVar, sb2.toString());
                f1848 = (f1849 + 93) % 128;
                return null;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ ef mo2100(List list2) {
                int i10 = f1849 + 115;
                f1848 = i10 % 128;
                if (i10 % 2 == 0) {
                    return m2102(list2);
                }
                m2102(list2);
                throw null;
            }
        })));
        f1836 = (f1837 + 81) % 128;
        return gbVarM2086;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private gb m2073(List<ec> list) {
        m2088(list, m2082((char) View.MeasureSpec.getSize(0), TextUtils.getTrimmedLength(""), Color.argb(0, 0, 0, 0) + 1).intern(), m2082((char) (((Process.getThreadPriority(0) + 20) >> 6) + 5203), 399 - MotionEvent.axisFromString(""), View.MeasureSpec.makeMeasureSpec(0, 0) + 44).intern());
        ft ftVarM2067 = m2067(list);
        m2088(list, m2082((char) (Gravity.getAbsoluteGravity(0, 0) + 43441), 444 - TextUtils.indexOf("", "", 0, 0), 5 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern(), m2082((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 450, 53 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern());
        m2088(list, m2082((char) ('0' - AndroidCharacter.getMirror('0')), 110 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) + 1).intern(), m2082((char) (31246 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 503 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 41).intern());
        ec ecVarM2057 = m2057(list);
        m2093(ecVarM2057, ec.d.f1905, ftVarM2067, m2082((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 543 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 27).intern());
        eq eqVar = (eq) m2074(new eq(ecVarM2057.m2138()));
        m2088(list, m2082((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 150, Gravity.getAbsoluteGravity(0, 0) + 1).intern(), m2082((char) (TextUtils.indexOf((CharSequence) "", '0') + 48339), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 570, (ViewConfiguration.getFadingEdgeLength() >> 16) + 39).intern());
        m2088(list, m2082((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1, TextUtils.getTrimmedLength("") + 1).intern(), m2082((char) (12055 - (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (ViewConfiguration.getTapTimeout() >> 16) + IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 46 - TextUtils.indexOf("", "")).intern());
        gb gbVarM2086 = m2086(new fy(ftVarM2067, m2067(list), eqVar));
        f1836 = (f1837 + 43) % 128;
        return gbVarM2086;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ef m2074(ef efVar) {
        f1836 = (f1837 + InterfaceC0435l1.d.b.f29114k) % 128;
        ef efVar2 = f1841.get(efVar);
        if (efVar2 != null) {
            return efVar2;
        }
        f1837 = (f1836 + 13) % 128;
        f1841.put(efVar, efVar);
        f1836 = (f1837 + 13) % 128;
        return efVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Pair m2079(dx dxVar, List list) {
        f1836 = (f1837 + 75) % 128;
        Pair<String, ef> pairM2059 = dxVar.m2059(list);
        int i10 = f1836 + 67;
        f1837 = i10 % 128;
        if (i10 % 2 == 0) {
            return pairM2059;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2087(dx dxVar, String str) {
        f1836 = (f1837 + 25) % 128;
        dxVar.m2083(str);
        f1836 = (f1837 + 63) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ef m2089(dx dxVar, List list) {
        f1836 = (f1837 + InterfaceC0435l1.d.b.f29109f) % 128;
        ef efVarM2062 = dxVar.m2062(list);
        f1837 = (f1836 + 79) % 128;
        return efVarM2062;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2097() {
        char[] cArr = new char[1256];
        f2.v("\u0000{\u0000m÷¡ïüç$ß\u007fÖ°Î¸Æ>¾Oµ\u0080\u00adÑ¥L\u009dC\u0094\u009c\u008c×\u0084\t|,t`kècî[5S4J¹B¼:\u00032K)\u0085!Ü\u0019\u001f\u0011A\b\u0096\u0000Øø ð7è|ß\u00ad×äÏ1Çu¾¹¶Î®\u0010SQðÛ\u0007\u0010:ÛÍ\u0016ÕG\u0089ý~&fknªVÿ¤ÐS\u0003K^C\u009b{Àr\u0018å¢\u0012v\n-\u0002í:»\u0000c÷«ïæç8ßyÖºÎíÆ9\u0000t÷¶ïñ\u0000v÷¥ïú\u0000m÷\u00adïûç?ßyÖºÎÿÆ|¾\u0007µß\u00ad\u008f¥L\u009dQ\u0094\u0080\u008c\u0098\u0084\u0019|.t`kècã[6S4J«Bè:\u00012P)\u008d!Á\u0019\u0015\u0011Z\b\u008c\u0000(\u0000i÷¢ï¨ç?ßdÖµÎìÆ9¾Mµ\u0081\u00adÆ¥\u0018\u009d\u0010\u0094\u0087\u008cÐ\u0084\u0013|5thk¬c¬[2SqJøBú:\u000f2H)\u0084!Ã\u0019\u0007\u0011Q\b\u009c\u0000\u009cøâð=è(ß\u00ad×°ÏsÇ0¾û\u0000)$\bÓÃËÉÃ^û\u0005òÔê\u008dâX\u009a,\u0091à\u0089§\u0081y¹q°ö¨¶ sXEP\fOÝG\u0084\u007f^w\u001bn\u0099f\u008e\u001ei\u0016*\rü\u0005¡=u5u,û$¸ÜÁÔLÌ\u0007ûÞó\u0098ëQã\u001c\u009a\u009d\u0092æ\u008a-\u0082`¹ª3\u0002ÄÏÜ\u009cÔN\u0000f÷«ïúçlßcÖ ÎùÆ(¾Eµ\u0089\u00adÍ¥\u0002\u009dD\u0094Ô\u008cË\u0084\u0014|/tqk¤cè[pSvJ½B¼:\u00062K)\u0084!À\u0019\u001f\u0011C\b\u009d\u0000Øø ð&èqßì×ñÏtÇ?¾ô¶\u0087Él>¡&ð.f\u0016y\u001f±\u0007ü\u000f2wC|\u009adËl\tTT]ÞEÁM\u001eµ%½{¢®ªâ\u0092z\u009a{\u0083¼\u008bòóJûYà\u008bèÒÐ\u0012Ø\u001eÁÕÉ\u008d1\u00adqL\u0086\u0097\u009eß\u0096\u0006®\\§\u0099¿Ú·\u0013Ï#Ä¢ÜóÔ?ìaå²ýèõ,\r\n\u0005H\u001a\u0085\u0012\u008f*\u0000\"_;\u00943ÊK/CcXëPêh=`syûqè\u0089Ê\u0081\u0013\u0099C®Ï`\u009c\u0097G\u008f\n\u0087Ë¿\u009e¶\u001f®\u0000¦ÃÞªÕ{Í&Åêý¾ôqì'ä·\u001cØ\u0014\u0087\u000bL\u0003\u0012;×3\u009b*\u0013\"\u0015ZîRïIeA(y÷q³h|` \u0098\u000e\u0090Ë\u0088Ã¿E·\u0002¯\u009f§\u0092Þ\u0017ÖlÎ§Æä\u0000w÷¬ïáç ßuÖôÎëÆ(¾Aµ\u0090\u00adÍ¥\u0001\u009dU\u0094\u009a\u008cÌ\u0084\\|#tkk¦cè[9S`J±Bó:\u000e2\u0004)\u009b!Ä\u0019\u001f\u0011A\b\u0094\u0000Øø ð&èmßì×ùÏ:Çk¾µ¶Ä®\u0001¦\b\u009dË\u0095\u0098\u008d]\u0085\u001f\u0014'ãåû¢ó?Ë0ÂóÚªÒ{ª\u0016¡Ú¹\u009e±Q\u0089\u0017\u0080\u0087\u0098\u0086\u0090Zh``#\u007f»w½OfGg^èV .^&\u0007=Ô5\u008a\rM\u0005\u0003\u001c\u008b\u0014Çìºäyü(ËöÃ§ÛbÓkª¨¢\u0088ºJ²\\\u0089\u0096©Ò^\u0014FMN\u009evÉ\u0000t÷¶ïñçlßcÖ ÎùÆ(¾Eµ\u0089\u00adÍ¥\u0002\u009dD\u0094Ô\u008cË\u0084\u0014|/tqk¤cè[pSvJ½B¼:\u00062K)\u0084!À\u0019\u001f\u0011C\b\u009d\u0000Øø ð&èqßì×ñÏtÇ{¾½¶Ô®\u0007¦@\u009dÌ\u0095Ã\u008d\u0000\u0085Y|\u0088t¥léd-\\bS¤zm\u008d«\u0095ò\u009d!¥v¬ú´ý¼7ÄWÏ\u009d×Éß\u0010çZîÚöÅþ\u001a\u0006!\u000e\u007f\u0011ª\u0019æ!~)x0³8²@\bHES\u008a[Îc\u0011kMr\u0093zÖ\u0082®\u008a(\u0092\u007f¥â\u00adÿµz½1ÄúÌ\u0089\u0000m÷\u00adïûç?ßyÖºÎÿÆ|¾Cµ\u0085\u00adÜ¥\u000f\u009dX\u0094Ô\u008cÎ\u0084\u001d|2tmk©cî[<SqJøBò:\u00012I)\u008d¼±KwS.[ýcªj&r:zï\u0002\u0080\tW\u0011\u0017\u0019\u009e!\u0091(N0\u00058ÛÀþÈ²×:ß<ççïæölþ!\u0086Þ\u008e\u009a\u0095U\u009d\t¥Ç\u00ad\u0082´\n¼\fD+L¶T»c>kes¯{í/uØ³ÀêÈ9ðnùâáýé>\u0091W\u009a\u0086\u0082Û\u008a\u0017²C»\u008c£Ú«JS;[gD\u00adLîtf|`e«mª\u0015\u0015\u001d]\u0006\u0093\u000eÊ6\t>W'\u0080/Î×¶ßzÇwð´øõà+èj\u0091¯\u0099\u0096\u0081U\u0089E²\u0087º\u0081¢K¯©Xz@'Hâp¹yaaciô\u0011\u008f\u001a^\u0002\u0007\nÒ2\u0086;J#\r+ÓÓ»Û¬Ä{Ì8ôþü£ågíg\u0095Þ\u009d\u0091\u0086W\u008eW¶Ü¾\u0086§W¯\u000fW{_¸Gèp0ð}\u0007©\u001fò\u00172/d&ë>ô67N^E\u008f]ÒU\u001emJd\u0085|ÓtC\u008c,\u0084s\u009b¸\u0093æ«#£oºç²æÊ\u0011Â_Ù×ÑÄé\u0006á_ø\u008fð\u0083\b¸\u0000`\u00180éë\u001e#\u0006n\u000e°6ñ?2'e/±W\u0088\\\u001fDTL\u0085tÌ}\u0019e]m\u0091\u0095¦\u009dø\u0082`\u008aw²°ºó£%«xÓ\u008cÛ\u008cÀ\u0005ÈJð\u009cø\u009cá\u0007é]\u0011|\u0019¤\u0001 6c>#&ûn\u009a\u008c,{è\u0017¶àr\u0000=÷ùkÅ\u009c\u001d\u0000<\u0000>\u0000<÷ù\u0000>÷ù\u0000+\u0000-\u0000+÷ï\u0000-÷éöVrÉçd¯þ\u0084ú\u0002\u0096\u0000!\u0000m÷\u00adïûç?ßyÖºÎÿÆ|¾Cµ\u0088\u00adÇ¥\u001f\u009dY\u0094\u009a\u008cß\u0084\\|gt-kïðºkÐ\u009c/\u0084h\u008c±´å½4¥~\u00ad\u00adÕÀÞ\u0005Æ\rÎ\u0086öÅÿ\u0014çOï\u0098\u0017±\u001fî\u0000?\b)\u0000U÷ªïíç4ß`Ö±ÎûÆ(¾Eµ\u0080\u00ad\u0088¥\u0018\u009d_\u0094\u009f\u008cÝ\u0084\u0012|`\u0000E÷¼ïøç)ßsÖ ÎýÆ8¾\u0000µ\u008d\u00adÌ¥\t\u009d^\u0094\u0080\u008cÑ\u0084\u001a|)takºc¬[2SaJ¬B¼:\u00072K)\u009c!\u008c)¿ÞlÆ#Îíö¸ÿzç!ïø\u0097\u0082\u009cG\u0084E\u008cÂ´\u0091½X¥\u0006\u00adÂU\u00ad]§BdJ,røzªc5k\"\u0013Å\u001b\u0086\u0000P\b\r0Ù8Ù!W)\u0014ÑmÙïÁªömþ1æöî¢\u0097t\u009f\t\u0087\u0089\u008f\u0087´X¼]¤Ð¬\u009bUG]bE*Mäuµztb6jû\u0012ñ\u001b\n\u0003A\u000b\u008b3Ï8\u0013 P(\u0092\u0000s÷±ïêç?ßsÖ¦ÎñÆ,¾TµÄ\u00adÛ¥\u0004\u009d_\u0094\u0081\u008cÔ\u0084\u0018|`tfk\u00adc¬[3SxJ·Bï:\u00052@)È!Û\u0019\u0019\u0011@\b\u0090\u0000\u009cø§ð\u0019è/è,\u001fó\u0007¦\u000fb>±ÉsÑ:Ùëá K1¼ó¤º¬k\u0094 \u009d¶\u0085©\u008dvõ\rþÓæ\u0086îJÖRßÔÇ\u009fÏ\u001e7d?) æ(¢\u0010}\u0018!\u0001ÿ\tºq\u0002y\u0004bÓjÎRSZVC×K\u009b³¶»n£%\u0094ê\u009cò\u0084\u007f\u008c4õèý\u008dåEí\u000bÖÚÞ\u009bÆYÎ\u0014®;YÂA\u0086IWq\rxÞ`\u0083hF\u0010~\u001bÉ\u0003¢\u000b`3':ä\"¡*\"Ò\\Ú\u000fÅÂÍÒõIý\u0005äÒìÂ¨S\u0000j÷·ïçç\"ß0Ö¿ÎýÆ%¾\u0000µ\u0097\u00adÀ¥\u0003\u009dE\u0094\u0098\u008cÜ\u0084\\|\"takècê[?SxJ´Bó:\u00172A)\u008c!\u008c\u0019\u0012\u0011M\bØ\u0000Ýø ð2èiß ×åÏ1Ç8¾½¶Æ®\u0010¦M\u009d\u009e\u0095\u0090\u008dS\u0085\u0002|Ûv\u0080\u0000l÷\u00adïûç8ß0Ö§ÎðÆ3¾Uµ\u0088\u00adÌ¥L\u009dU\u0094\u009a\u008cÜ\u0084\\|7tmk¼cä[pS3\u0086#\u0000U÷ªïíç4ß`Ö±ÎûÆ(¾Eµ\u0080\u00ad\u0088¥\t\u009d^\u0094\u0090\u008c\u0098\u0084\u0013|&t$k¼cã[;SqJ¶Bï\u0000E÷¼ïëç)ß`Ö ÎñÆ3¾NµÄ\u00adß¥\u0004\u009dY\u0094\u0098\u008cÝ\u0084\\|'tak¼cø[9SzJ¿B¼:\u000e2A)\u0090!Ø\u0019P\u0011@\b\u0097\u0000×øåð*5ùÂ\u0000ÚWÒ\u0095êÜã\u001cûMó\u008f\u008bò\u0080x\u0098c\u0090¸¨å¡$¹a±àI\u008cAÝ^\u0011V[n\u0085fÆ\u007f\u0003w\u0000\u000f½\u0007ì\u001ct\u0014~,©$ð=05 ÍHÅ\u0097Ýßê\u0015âB>\u000eÉ\u008bÑÀÙ\u0016á[è\u0088ð\u0096à\u0094\u0017m\u000f)\u0007ø?¢6q.,&é^Ñ\u0000 ÷¦ïýç8ß0Ö¦ÎýÆ?¾Eµ\u008d\u00adÞ¥\t\u009dT\u0094Ô\u0000 ÷éï¨", "ISO-8859-1", cArr, 0, 1256);
        f1839 = cArr;
        f1838 = -4308831352574707772L;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0107  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private gb m2081(List<ec> list) {
        gb gbVarM2092;
        m2088(list, m2082((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + InterfaceC0435l1.d.b.f29111h, 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern(), m2082((char) ExpandableListView.getPackedPositionGroup(0L), 110 - TextUtils.lastIndexOf("", '0', 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 39).intern());
        ef efVarM2099 = m2099(list);
        m2078(list, m2082((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 150 - TextUtils.indexOf((CharSequence) "", '0'), (-16777215) - Color.rgb(0, 0, 0)).intern(), efVarM2099, m2082((char) (9314 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 152 - TextUtils.getOffsetBefore("", 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43).intern());
        gb gbVarM2093 = m2092(list);
        if (m2056(list)) {
            int i10 = f1836 + 75;
            f1837 = i10 % 128;
            if (i10 % 2 == 0 ? !m2058(list).m2140(m2082((char) (13158 - ((byte) KeyEvent.getModifierMetaStateMask())), 196 - KeyEvent.getDeadChar(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4).intern()) : !m2058(list).m2140(m2082((char) (29160 % ((byte) KeyEvent.getModifierMetaStateMask())), 29074 - KeyEvent.getDeadChar(0, 1), (ExpandableListView.getPackedPositionForGroup(1) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 0L ? 0 : -1)) * 2).intern())) {
                gbVarM2092 = null;
            } else {
                this.f1844++;
                gbVarM2092 = m2092(list);
                f1837 = (f1836 + 9) % 128;
            }
        } else {
            gbVarM2092 = null;
        }
        return m2086(new fu(efVarM2099, gbVarM2093, gbVarM2092, this.f1842));
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static gb m2086(gb gbVar) {
        int i10 = f1837 + 73;
        f1836 = i10 % 128;
        if (i10 % 2 == 0) {
            f1840.get(gbVar);
            throw null;
        }
        gb gbVar2 = f1840.get(gbVar);
        if (gbVar2 != null) {
            return gbVar2;
        }
        int i11 = f1837 + 107;
        f1836 = i11 % 128;
        if (i11 % 2 != 0) {
            f1840.put(gbVar, gbVar);
            return gbVar;
        }
        f1840.put(gbVar, gbVar);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private gb m2092(List<ec> list) {
        String strM2138 = m2057(list).m2138();
        switch (strM2138.hashCode()) {
            case -934396624:
                if (strM2138.equals(m2082((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 42146), ExpandableListView.getPackedPositionType(0L) + 54, 6 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern())) {
                    return m2070(list);
                }
                this.f1844--;
                ef efVarM2099 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM2099, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM2099));
            case -567202649:
                if (strM2138.equals(m2082((char) (ViewConfiguration.getJumpTapTimeout() >> 16), View.MeasureSpec.getSize(0) + 65, Color.red(0) + 8).intern())) {
                    return m2064(list);
                }
                this.f1844--;
                ef efVarM20910 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20910, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20910));
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_REVENUE_SEND_STARTED_VALUE:
                if (strM2138.equals(m2082((char) (KeyEvent.getDeadChar(0, 0) + 21354), 44 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (Process.myPid() >> 22) + 1).intern())) {
                    int i10 = f1837 + 107;
                    f1836 = i10 % 128;
                    if (i10 % 2 != 0) {
                        return m2086(new fz(null));
                    }
                    return m2081(list);
                }
                this.f1844--;
                ef efVarM20911 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20911, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20911));
            case 123:
                if (strM2138.equals(m2082((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), TextUtils.indexOf("", "", 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern())) {
                    int i11 = (f1837 + 81) % 128;
                    f1836 = i11;
                    f1837 = (i11 + 95) % 128;
                    return m2067(list);
                }
                this.f1844--;
                ef efVarM20912 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20912, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20912));
            case 3357:
                if (strM2138.equals(m2082((char) (TextUtils.indexOf("", "", 0, 0) + 61618), 43 - ImageFormat.getBitsPerPixel(0), ((Process.getThreadPriority(0) + 20) >> 6) + 2).intern())) {
                    f1836 = (f1837 + 79) % 128;
                    return m2081(list);
                }
                this.f1844--;
                ef efVarM20913 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20913, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20913));
            case 101577:
                if (strM2138.equals(m2082((char) (15037 - View.MeasureSpec.getSize(0)), 46 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 3).intern())) {
                    return m2095(list);
                }
                this.f1844--;
                ef efVarM20914 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20914, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20914));
            case 115131:
                if (strM2138.equals(m2082((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 73 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3).intern())) {
                    int i12 = f1836 + 3;
                    f1837 = i12 % 128;
                    if (i12 % 2 == 0) {
                        return m2073(list);
                    }
                }
                this.f1844--;
                ef efVarM20915 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20915, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20915));
            case 116519:
                if (strM2138.equals(m2082((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 75 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 3).intern())) {
                    return m2072(list);
                }
                this.f1844--;
                ef efVarM20916 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20916, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20916));
            case 94001407:
                if (strM2138.equals(m2082((char) (58816 - TextUtils.getOffsetBefore("", 0)), Drawable.resolveOpacity(0, 0) + 60, KeyEvent.getDeadChar(0, 0) + 5).intern())) {
                    return m2071(list);
                }
                this.f1844--;
                ef efVarM20917 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20917, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20917));
            case 113101617:
                if (strM2138.equals(m2082((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 35211), 49 - KeyEvent.getDeadChar(0, 0), KeyEvent.keyCodeFromString("") + 5).intern())) {
                    return m2069(list);
                }
                this.f1844--;
                ef efVarM20918 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20918, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20918));
            default:
                this.f1844--;
                ef efVarM20919 = m2099(list);
                m2078(list, m2082((char) (21354 - ExpandableListView.getPackedPositionType(0L)), 43 - Color.red(0), 1 - View.getDefaultSize(0, 0)).intern(), efVarM20919, m2082((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), 80 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 30 - ExpandableListView.getPackedPositionChild(0L)).intern());
                return m2086(new fz(efVarM20919));
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final ft m2098(List<ec> list) {
        f1837 = (f1836 + 9) % 128;
        this.f1844 = 0;
        this.f1842 = (byte) 0;
        m2088(list, m2082((char) TextUtils.getOffsetBefore("", 0), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1).intern(), m2082((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1 - TextUtils.getTrimmedLength(""), 41 - MotionEvent.axisFromString("")).intern());
        ft ftVarM2067 = m2067(list);
        int i10 = f1836 + 17;
        f1837 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 22 / 0;
        }
        return ftVarM2067;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private gb m2095(List<ec> list) {
        m2088(list, m2082((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + InterfaceC0435l1.d.b.f29110g, 1 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern(), m2082((char) View.MeasureSpec.getMode(0), 199 - TextUtils.lastIndexOf("", '0', 0), ImageFormat.getBitsPerPixel(0) + 42).intern());
        ef efVarM2091 = m2091(list, m2082((char) (View.resolveSizeAndState(0, 0, 0) + 21354), Color.red(0) + 43, -ImageFormat.getBitsPerPixel(0)).intern());
        ef efVarM2099 = m2099(list);
        m2078(list, m2082((char) (21354 - TextUtils.indexOf("", "", 0, 0)), 42 - Process.getGidForName(""), -((byte) KeyEvent.getModifierMetaStateMask())).intern(), efVarM2099, m2082((char) (51466 - (ViewConfiguration.getTapTimeout() >> 16)), 241 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 33).intern());
        gb gbVarM2086 = m2086(new fx(efVarM2091, efVarM2099, m2091(list, m2082((char) TextUtils.getOffsetBefore("", 0), 151 - View.MeasureSpec.getSize(0), -ExpandableListView.getPackedPositionChild(0L)).intern()), m2092(list)));
        int i10 = f1836 + InterfaceC0435l1.d.b.f29105b;
        f1837 = i10 % 128;
        if (i10 % 2 == 0) {
            return gbVarM2086;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final ef m2099(List<ec> list) {
        ef efVarM2066 = m2066(list);
        if (!m2056(list)) {
            return efVarM2066;
        }
        int i10 = f1837 + 115;
        f1836 = i10 % 128;
        if (i10 % 2 != 0) {
            String strM2138 = m2057(list).m2138();
            int iHashCode = strM2138.hashCode();
            byte b10 = -1;
            if (iHashCode != 1216) {
                if (iHashCode == 3968 && strM2138.equals(m2082((char) (6090 - ((Process.getThreadPriority(0) + 20) >> 6)), 767 - KeyEvent.getDeadChar(0, 0), 1 - MotionEvent.axisFromString("")).intern())) {
                    b10 = 1;
                }
            } else if (strM2138.equals(m2082((char) (35850 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 766 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 2 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern())) {
                f1836 = (f1837 + 65) % 128;
                b10 = 0;
            }
            if (b10 == 0) {
                return m2074(new et(efVarM2066, m2099(list)));
            }
            if (b10 != 1) {
                this.f1844--;
                return efVarM2066;
            }
            return m2074(new fl(efVarM2066, m2099(list)));
        }
        m2057(list).m2138().hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ef m2075(ef efVar, List<ec> list) {
        f1836 = (f1837 + 75) % 128;
        ef efVarM2099 = m2099(list);
        m2078(list, m2082((char) (61671 - ExpandableListView.getPackedPositionType(0L)), 810 - TextUtils.lastIndexOf("", '0', 0, 0), 1 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), efVarM2099, m2082((char) (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFraction(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 940 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 34).intern());
        if (m2057(list).m2140(m2082((char) (View.resolveSize(0, 0) + 683), (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 789, 1 - TextUtils.getCapsMode("", 0, 0)).intern())) {
            ef efVarM2074 = m2074(new er(efVar, efVarM2099, m2099(list)));
            f1837 = (f1836 + 17) % 128;
            return efVarM2074;
        }
        this.f1844--;
        ef efVarM2075 = m2074(new es(efVar, efVarM2099));
        f1836 = (f1837 + 63) % 128;
        return efVarM2075;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private List<ef> m2096(List<ec> list, String str) {
        List<ef> listM2077 = m2077(list, str, new e<ef>() { // from class: com.ironsource.adqualitysdk.sdk.i.dx.2
            @Override // com.ironsource.adqualitysdk.sdk.i.dx.e
            /* JADX INFO: renamed from: ﻛ */
            public final /* synthetic */ ef mo2100(List list2) {
                return dx.this.m2099((List<ec>) list2);
            }
        });
        f1836 = (f1837 + 51) % 128;
        return listM2077;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034 A[PHI: r0
  0x0034: PHI (r0v20 java.lang.String) = (r0v3 java.lang.String), (r0v22 java.lang.String) binds: [B:10:0x0031, B:6:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[PHI: r0
  0x005b: PHI (r0v4 java.lang.String) = (r0v3 java.lang.String), (r0v22 java.lang.String) binds: [B:9:0x002f, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x0083  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ef m2080(ec ecVar, List<ec> list) {
        String strM2138;
        int i10 = f1837 + 95;
        f1836 = i10 % 128;
        byte b10 = -1;
        if (i10 % 2 == 0) {
            strM2138 = ecVar.m2138();
            int iHashCode = strM2138.hashCode();
            int i11 = 70 / 0;
            if (iHashCode != 3392903) {
                if (iHashCode == 109801339) {
                    if (strM2138.equals(m2082((char) (16066 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.alpha(0) + 979, TextUtils.indexOf("", "", 0) + 5).intern())) {
                        b10 = 1;
                    }
                }
            } else if (strM2138.equals(m2082((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59458), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 975, View.resolveSize(0, 0) + 4).intern())) {
                f1837 = (f1836 + 99) % 128;
                b10 = 0;
            }
        } else {
            strM2138 = ecVar.m2138();
            int iHashCode2 = strM2138.hashCode();
            if (iHashCode2 != 3392903) {
                if (iHashCode2 == 109801339) {
                    if (strM2138.equals(m2082((char) (16066 - ((Process.getThreadPriority(0) + 20) >> 6)), Color.alpha(0) + 979, TextUtils.indexOf("", "", 0) + 5).intern())) {
                        b10 = 1;
                    }
                }
            } else if (strM2138.equals(m2082((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59458), (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 975, View.resolveSize(0, 0) + 4).intern())) {
                f1837 = (f1836 + 99) % 128;
                b10 = 0;
            }
        }
        if (b10 == 0) {
            return fp.m2213();
        }
        if (b10 != 1) {
            return null;
        }
        m2078(list, m2082((char) (45008 - Color.argb(0, 0, 0, 0)), 788 - (KeyEvent.getMaxKeyCode() >> 16), 1 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern(), ecVar, m2082((char) (19266 - TextUtils.getOffsetAfter("", 0)), 984 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 47 - TextUtils.getCapsMode("", 0, 0)).intern());
        return m2090(m2074(new eq(m2082((char) (16066 - (ViewConfiguration.getScrollBarSize() >> 8)), View.resolveSize(0, 0) + 979, 4 - MotionEvent.axisFromString("")).intern())), list);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static ef m2085(ec ecVar) {
        int i10 = f1836 + InterfaceC0435l1.d.b.f29109f;
        f1837 = i10 % 128;
        if (i10 % 2 == 0) {
            if (ecVar.m2137()) {
                try {
                    try {
                        return m2074(new fo(Integer.valueOf(Integer.parseInt(ecVar.m2138()))));
                    } catch (Exception unused) {
                        return m2074(new fs(Long.valueOf(Long.parseLong(ecVar.m2138()))));
                    }
                } catch (Exception unused2) {
                }
            } else {
                if (ecVar.m2132()) {
                    ef efVarM2074 = m2074(new fr(Double.valueOf(Double.parseDouble(ecVar.m2138()))));
                    f1836 = (f1837 + 35) % 128;
                    return efVarM2074;
                }
                if (ecVar.m2133()) {
                    return m2074(new fk(Boolean.valueOf(Boolean.parseBoolean(ecVar.m2138()))));
                }
            }
            return m2074(new fq(ecVar.m2138()));
        }
        ecVar.m2137();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2083(String str) {
        f1836 = (f1837 + 81) % 128;
        m2084(str, (Throwable) null);
        int i10 = f1836 + InterfaceC0435l1.d.b.f29107d;
        f1837 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 25 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private <T> List<T> m2077(List<ec> list, String str, e<T> eVar) {
        ArrayList arrayList = new ArrayList();
        if (!m2057(list).m2140(str)) {
            this.f1844--;
            arrayList.add(eVar.mo2100(list));
            ec ecVarM2057 = m2057(list);
            while (ecVarM2057.m2140(m2082((char) (TextUtils.indexOf("", "", 0, 0) + 30380), 1104 - View.getDefaultSize(0, 0), 1 - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                f1837 = (f1836 + 87) % 128;
                arrayList.add(eVar.mo2100(list));
                ecVarM2057 = m2057(list);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2082((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 1105 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.resolveSizeAndState(0, 0, 0) + 22).intern());
            sb2.append(str);
            m2094(ecVarM2057, str, arrayList, f2.m(sb2, m2082((char) (TextUtils.lastIndexOf("", '0') + 34309), TextUtils.indexOf((CharSequence) "", '0') + 1128, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))));
            f1837 = (f1836 + 61) % 128;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2084(String str, Throwable th2) {
        throw new ed(this.f1843, str, th2);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2082(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1839[i10 + i12]) ^ (((long) i12) * f1838)) ^ ((long) c4));
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
    private void m2088(List<ec> list, String str, String str2) {
        int i10 = f1836 + 17;
        f1837 = i10 % 128;
        int i11 = i10 % 2;
        m2078(list, str, (Object) null, str2);
        if (i11 != 0) {
            int i12 = 32 / 0;
        }
        int i13 = f1837 + 85;
        f1836 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ef m2091(List<ec> list, String str) {
        int i10 = f1836 + 85;
        f1837 = i10 % 128;
        ef efVarM2099 = null;
        if (i10 % 2 != 0) {
            int i11 = 0 / 0;
            if (!m2058(list).m2140(str)) {
                efVarM2099 = m2099(list);
                m2078(list, str, efVarM2099, f2.k(m2082((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28963), (ViewConfiguration.getEdgeSlop() >> 16) + 274, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 35), str, new StringBuilder()));
            }
        } else if (!m2058(list).m2140(str)) {
            efVarM2099 = m2099(list);
            m2078(list, str, efVarM2099, f2.k(m2082((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 28963), (ViewConfiguration.getEdgeSlop() >> 16) + 274, (ViewConfiguration.getScrollFriction() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (ViewConfiguration.getScrollFriction() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 35), str, new StringBuilder()));
        }
        f1836 = (f1837 + 57) % 128;
        return efVarM2099;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2078(List<ec> list, String str, Object obj, String str2) {
        f1836 = (f1837 + 123) % 128;
        m2094(m2057(list), str, obj, str2);
        int i10 = f1836 + 69;
        f1837 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2076(String str, String str2, Object obj, String str3) {
        String string;
        int i10 = f1837 + 85;
        f1836 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
        String strK = "";
        if (obj != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2082((char) (15917 - Process.getGidForName("")), View.MeasureSpec.getMode(0) + 1223, 7 - Color.argb(0, 0, 0, 0)).intern());
            sb2.append(obj);
            string = sb2.toString();
        } else {
            string = "";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2082((char) (57552 - TextUtils.indexOf((CharSequence) "", '0')), 1229 - Process.getGidForName(""), Color.alpha(0) + 9).intern());
        sb3.append(str);
        sb3.append(string);
        sb3.append(m2082((char) View.MeasureSpec.makeMeasureSpec(0, 0), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1239, ((Process.getThreadPriority(0) + 20) >> 6) + 14).intern());
        sb3.append(str2);
        if (str3 != null) {
            strK = f2.k(m2082((char) View.combineMeasuredStates(0, 0), KeyEvent.getDeadChar(0, 0) + 1253, 3 - (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), str3, new StringBuilder());
        }
        sb3.append(strK);
        String string2 = sb3.toString();
        int i11 = f1836 + 61;
        f1837 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 47 / 0;
        }
        return string2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private ef m2090(ef efVar, List<ec> list) {
        f1836 = (f1837 + 15) % 128;
        ec ecVarM2057 = m2057(list);
        List<ef> listM2060 = null;
        if (!ecVarM2057.m2131()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2082((char) ((-1) - ImageFormat.getBitsPerPixel(0)), KeyEvent.normalizeMetaState(0) + 849, 28 - Color.argb(0, 0, 0, 0)).intern());
            sb2.append(ecVarM2057);
            m2084(sb2.toString(), (Throwable) null);
        }
        String strM2138 = ecVarM2057.m2138();
        ec ecVarM2058 = m2057(list);
        if (ecVarM2058.m2140(m2082((char) ((-1) - MotionEvent.axisFromString("")), (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (PointF.length(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 773, View.MeasureSpec.makeMeasureSpec(0, 0) + 1).intern())) {
            f1836 = (f1837 + 17) % 128;
            listM2060 = m2060(list);
            m2078(list, m2082((char) KeyEvent.normalizeMetaState(0), View.MeasureSpec.getMode(0) + InterfaceC0435l1.d.b.f29111h, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1).intern(), listM2060, m2082((char) (TextUtils.getCapsMode("", 0, 0) + 10701), 878 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 63 - TextUtils.getCapsMode("", 0, 0)).intern());
        } else if (!ecVarM2058.m2140(m2082((char) Drawable.resolveOpacity(0, 0), 110 - (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 1).intern())) {
            this.f1844--;
            return m2074(new ek(efVar, strM2138));
        }
        return m2074(new el(efVar, strM2138, listM2060, m2096(list, m2082((char) ((AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) - 1), 151 - View.MeasureSpec.getSize(0), TextUtils.indexOf("", "", 0) + 1).intern())));
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2094(ec ecVar, String str, Object obj, String str2) {
        f1837 = (f1836 + 45) % 128;
        if (ecVar.m2140(str)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2082((char) (Color.rgb(0, 0, 0) + 16811524), ImageFormat.getBitsPerPixel(0) + 1128, 1 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb2.append(str);
        String strM = f2.m(sb2, m2082((char) (((Process.getThreadPriority(0) + 20) >> 6) + 34308), View.getDefaultSize(0, 0) + 1127, ExpandableListView.getPackedPositionGroup(0L) + 1));
        StringBuilder sb3 = new StringBuilder();
        sb3.append(m2082((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 34308), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1126, -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
        sb3.append(ecVar.m2138());
        m2083(m2076(strM, f2.m(sb3, m2082((char) (34308 - Gravity.getAbsoluteGravity(0, 0)), MotionEvent.axisFromString("") + 1128, TextUtils.getOffsetAfter("", 0) + 1)), obj, str2));
        f1837 = (f1836 + 35) % 128;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m2093(ec ecVar, ec.d dVar, Object obj, String str) {
        f1837 = (f1836 + 27) % 128;
        if (ecVar.m2135().equals(dVar)) {
            return;
        }
        m2083(m2076(dVar.toString(), ecVar.m2135().toString(), obj, str));
        f1836 = (f1837 + 59) % 128;
    }
}
