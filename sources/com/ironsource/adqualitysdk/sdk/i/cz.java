package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.media.MediaPlayer;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class cz extends cw {

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1516 = 0;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1517 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f1514 = {'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15181, 33593, 52192, 5069, 23456, 42058, 60442, 13538, 31914, 50331, 3398, 21806, 40446, 58815, 11893, 30291, 48645, 1733, 20135, 39763, 54097, 2830, 17382, 48048, 62015, 10827, 25111, 56027, 4778, 18800, 33080, 63748, 12736, 27088, 41051, 6191, 20726, 35035, 49334, 16220, 30491, 45047, 59296, 24461, 38483, 52792, 1768, 32425, 46435, 60741, 9491, 40403, 54705, 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15190, 33589, 52193, 5075, 23438, 42100, 60469, 13551, 31930, 50333, 3423, 21805, 40441, 58757, 11887, 30288, 48644, 1772, 20156, 38777, 57163, 10001, 28615, 47035, 'a', 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15190, 33589, 52193, 5075, 23438, 42100, 60469, 13551, 31930, 50333, 3423, 21805, 40441, 58767, 11886, 30299, 48667, 1740, 20144, 38782, 57174, 10011, 28615, 46994, 'z', 18491, 36873, 55511, 8329, 27001, 45347, 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15188, 33598, 52169, 5083, 23446, 42059, 60460, 13562, 31872, 50320, 3404, 21772, 40432, 58793, 11853, 30303, 48664, 1748, 20144, 38756, 57178, 9990, 'E', 18503, 36888, 55536, 8358, 26921, 45405, 63745, 16845, 35260, 53862, 6702, 25106, 43734, 62150, 15193, 33570, 52202, 5083, 23435, 42055, 60472, 13565, 31927, 50346, 3400, 21761, 40434, 58789, 11895, 30291, 48665};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static long f1513 = 8163304008932804661L;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static long f1515 = -3112093523340093020L;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static WebChromeClient m1813(List<Object> list) {
        f1517 = (f1516 + 35) % 128;
        WebChromeClient webChromeClientM2939 = ko.m2939((WebView) cw.m1805(list, 0, WebView.class));
        f1517 = (f1516 + 29) % 128;
        return webChromeClientM2939;
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static WebViewClient m1814(List<Object> list) {
        int i10 = f1517 + 35;
        f1516 = i10 % 128;
        return ko.m2933((WebView) cw.m1805(list, i10 % 2 != 0 ? 1 : 0, WebView.class));
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static Object m1815(List<Object> list) {
        f1516 = (f1517 + 41) % 128;
        ((kd) cw.m1805(list, 0, kd.class)).m2793();
        f1516 = (f1517 + 93) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static kd m1816(List<Object> list) {
        WebView webView;
        String strM1824;
        int i10 = f1516 + 79;
        f1517 = i10 % 128;
        if (i10 % 2 == 0) {
            webView = (WebView) cw.m1805(list, 1, WebView.class);
            strM1824 = m1824("聍\ude86耬唰㍃읆昛翃\ue6bf廙쳒耐䵂", 1 - ImageFormat.getBitsPerPixel(1));
        } else {
            webView = (WebView) cw.m1805(list, 0, WebView.class);
            strM1824 = m1824("聍\ude86耬唰㍃읆昛翃\ue6bf廙쳒耐䵂", ImageFormat.getBitsPerPixel(0) + 1);
        }
        kd kdVarM2787 = kd.m2787(webView, strM1824.intern());
        int i11 = f1517 + 5;
        f1516 = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 71 / 0;
        }
        return kdVarM2787;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static Object m1817(List<Object> list) {
        int i10 = f1516 + 117;
        f1517 = i10 % 128;
        ((kd) cw.m1805(list, i10 % 2 == 0 ? 1 : 0, kd.class)).m2790();
        return null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static Object m1818(List<Object> list) {
        hj hjVar = (hj) cw.m1805(list, 0, hj.class);
        if (hjVar != null) {
            f1517 = (f1516 + 59) % 128;
            return hjVar.mo800();
        }
        int i10 = f1516 + 91;
        f1517 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 75 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m1819(List<Object> list) {
        int i10 = f1517 + 107;
        f1516 = i10 % 128;
        int i11 = i10 % 2;
        return km.m2904(cw.m1805(list, 0, Object.class));
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static View.OnTouchListener m1820(List<Object> list) {
        int i10 = f1516 + 63;
        f1517 = i10 % 128;
        return ki.m2850((View) cw.m1805(list, i10 % 2 == 0 ? 1 : 0, View.class));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Object m1823(List<Object> list) {
        f1516 = (f1517 + 83) % 128;
        jo.m2696().m2700((iw) cw.m1805(list, 0, iw.class));
        int i10 = f1516 + 45;
        f1517 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 56 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ List m1828(List list, Object[] objArr) {
        int i10 = f1517 + 65;
        f1516 = i10 % 128;
        if (i10 % 2 != 0) {
            m1822(list, objArr);
            throw null;
        }
        List<Object> listM1822 = m1822(list, objArr);
        f1517 = (f1516 + 83) % 128;
        return listM1822;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1829(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            final boolean zM1825 = m1825(list, 2);
            clVar2 = clVar;
            try {
                View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.5

                    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                    private static long f1581 = -6191082541804156940L;

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f1582 = 1;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f1583;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static String m1855(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (i.f2435) {
                            try {
                                i.f2436 = i10;
                                char[] cArr2 = new char[cArr.length];
                                i.f2434 = 0;
                                while (true) {
                                    int i11 = i.f2434;
                                    if (i11 < cArr.length) {
                                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (i.f2436 * i11))) ^ f1581);
                                        i.f2434++;
                                    } else {
                                        str2 = new String(cArr2);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str2;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        try {
                            final List<Object> listM1828 = cz.m1828(listM1803, new Object[]{this, view, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17)});
                            if (!zM1825) {
                                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.5.3
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* JADX INFO: renamed from: ｋ */
                                    public final void mo254() {
                                        AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                        dzVar.m2113(eeVar, clVar2, listM1828);
                                    }
                                });
                                return;
                            }
                            int i18 = f1582 + 79;
                            f1583 = i18 % 128;
                            if (i18 % 2 != 0) {
                                dzVar.m2113(eeVar, clVar2, listM1828);
                                throw null;
                            }
                            dzVar.m2113(eeVar, clVar2, listM1828);
                            int i19 = f1582 + 77;
                            f1583 = i19 % 128;
                            if (i19 % 2 != 0) {
                                throw null;
                            }
                        } catch (Throwable th2) {
                            String strM1643 = clVar2.m1643();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m1855("ޱ䱛逼\ue40c⣲粅삳ᒑ夼굾\uf138䗇觉\uddb4\u218d癲멐บ刖꛲\ueade㺲药흣ᬥ漒돲ߞ䮶龘\ue460⠗簽샧ᓝ墪겄\uf160䔚", Process.getGidForName("") + 19422).intern());
                            sb2.append(dzVar.m2114());
                            cn.m1708(strM1643, sb2.toString(), th2);
                        }
                    }
                };
                f1516 = (f1517 + 75) % 128;
                return onLayoutChangeListener;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1827((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 153, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ki.m2846(r5, new com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass1());
        com.ironsource.adqualitysdk.sdk.i.cz.f1516 = (com.ironsource.adqualitysdk.sdk.i.cz.f1517 + 119) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (m1825(r6, 5) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (m1825(r6, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ki.m2846(r5, r0);
     */
    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1832(java.util.List<java.lang.Object> r6) {
        /*
            r5 = this;
            int r5 = com.ironsource.adqualitysdk.sdk.i.cz.f1516
            int r5 = r5 + 85
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1517 = r0
            r0 = 2
            int r5 = r5 % r0
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hq$d> r1 = com.ironsource.adqualitysdk.sdk.i.hq.d.class
            r2 = 0
            java.lang.Class<android.media.MediaPlayer> r3 = android.media.MediaPlayer.class
            r4 = 1
            if (r5 != 0) goto L26
            java.lang.Object r5 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r4, r3)
            android.media.MediaPlayer r5 = (android.media.MediaPlayer) r5
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r2, r1)
            com.ironsource.adqualitysdk.sdk.i.hq$d r0 = (com.ironsource.adqualitysdk.sdk.i.hq.d) r0
            r1 = 5
            boolean r6 = m1825(r6, r1)
            if (r6 == 0) goto L3d
            goto L39
        L26:
            java.lang.Object r5 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r2, r3)
            android.media.MediaPlayer r5 = (android.media.MediaPlayer) r5
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r4, r1)
            com.ironsource.adqualitysdk.sdk.i.hq$d r1 = (com.ironsource.adqualitysdk.sdk.i.hq.d) r1
            boolean r6 = m1825(r6, r0)
            r0 = r1
            if (r6 == 0) goto L3d
        L39:
            com.ironsource.adqualitysdk.sdk.i.ki.m2846(r5, r0)
            goto L4d
        L3d:
            com.ironsource.adqualitysdk.sdk.i.cz$1 r6 = new com.ironsource.adqualitysdk.sdk.i.cz$1
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.i.ki.m2846(r5, r6)
            int r5 = com.ironsource.adqualitysdk.sdk.i.cz.f1517
            int r5 = r5 + 119
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1516 = r5
        L4d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.m1832(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final Object m1833(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            clVar2 = clVar;
            try {
                hq.d dVar = new hq.d() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.17
                    @Override // com.ironsource.adqualitysdk.sdk.i.hq.d
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo1846(hq hqVar, MediaPlayer mediaPlayer) {
                        dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, hqVar, mediaPlayer}));
                    }
                };
                int i10 = f1516 + 89;
                f1517 = i10 % 128;
                if (i10 % 2 != 0) {
                    return dVar;
                }
                throw null;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1824("➛闷⟞\ue8ff锢谡\udbc5\ud9a1䅹ᗣ煄☬\ueade獒\ue8e3轇ᑅ\ud8c4踧ᗳ붾♷┞牯✛迯\udc86\ud8e7䂞ᒁ爘℀\uea38爆\ue9a2辕ፘ\udbbc轚ᐾ볧Ω⛓犻♷軚\udc64\udbda俎ᑍ珢⁌", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1835(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final dz dzVar2 = (dz) cw.m1805(list, 1, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 2);
            final boolean zM1825 = m1825(list, 3);
            clVar2 = clVar;
            try {
                View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f1568 = 0;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static long f1569 = 4614578234725826372L;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f1570 = 1;

                    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
                    
                        if (r5 != false) goto L11;
                     */
                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    private void m1853(final com.ironsource.adqualitysdk.sdk.i.dz r5, android.view.View r6) {
                        /*
                            r4 = this;
                            int r0 = com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass4.f1570
                            int r0 = r0 + 49
                            int r1 = r0 % 128
                            com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass4.f1568 = r1
                            int r0 = r0 % 2
                            if (r0 == 0) goto L21
                            java.util.List r0 = r4     // Catch: java.lang.Throwable -> L1f
                            r1 = 3
                            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1f
                            r2 = 1
                            r1[r2] = r4     // Catch: java.lang.Throwable -> L1f
                            r1[r2] = r6     // Catch: java.lang.Throwable -> L1f
                            java.util.List r6 = com.ironsource.adqualitysdk.sdk.i.cz.m1828(r0, r1)     // Catch: java.lang.Throwable -> L1f
                            boolean r0 = r5     // Catch: java.lang.Throwable -> L1f
                            if (r0 == 0) goto L37
                            goto L2f
                        L1f:
                            r6 = move-exception
                            goto L48
                        L21:
                            java.util.List r0 = r4     // Catch: java.lang.Throwable -> L1f
                            java.lang.Object[] r6 = new java.lang.Object[]{r4, r6}     // Catch: java.lang.Throwable -> L1f
                            java.util.List r6 = com.ironsource.adqualitysdk.sdk.i.cz.m1828(r0, r6)     // Catch: java.lang.Throwable -> L1f
                            boolean r0 = r5     // Catch: java.lang.Throwable -> L1f
                            if (r0 == 0) goto L37
                        L2f:
                            com.ironsource.adqualitysdk.sdk.i.ee r0 = r6     // Catch: java.lang.Throwable -> L1f
                            com.ironsource.adqualitysdk.sdk.i.cl r1 = r7     // Catch: java.lang.Throwable -> L1f
                            r5.m2113(r0, r1, r6)     // Catch: java.lang.Throwable -> L1f
                            return
                        L37:
                            com.ironsource.adqualitysdk.sdk.i.cz$4$3 r0 = new com.ironsource.adqualitysdk.sdk.i.cz$4$3     // Catch: java.lang.Throwable -> L1f
                            r0.<init>()     // Catch: java.lang.Throwable -> L1f
                            com.ironsource.adqualitysdk.sdk.i.p.m3001(r0)     // Catch: java.lang.Throwable -> L1f
                            int r4 = com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass4.f1570
                            int r4 = r4 + 85
                            int r4 = r4 % 128
                            com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass4.f1568 = r4
                            return
                        L48:
                            com.ironsource.adqualitysdk.sdk.i.cl r4 = r7
                            java.lang.String r4 = r4.m1643()
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "\uf38c꘥\uf3c9萆潩夓竼鋊\u0eee婑翷闛ঌ弎糀飄ӈ倥營鯶ޤ嗲皺鴄ʨ囔殝耝ᶍ䯯梉茠ᢰ䳸涍蘡᭩䆏捫襗ᘼ䊘恰豆ᅅ䞥敋輥"
                            java.lang.String r2 = ""
                            r3 = 0
                            int r2 = android.text.TextUtils.indexOf(r2, r2, r3, r3)
                            java.lang.String r1 = m1854(r1, r2)
                            java.lang.String r1 = r1.intern()
                            r0.append(r1)
                            java.lang.String r5 = r5.m2114()
                            r0.append(r5)
                            java.lang.String r5 = r0.toString()
                            com.ironsource.adqualitysdk.sdk.i.cn.m1708(r4, r5, r6)
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass4.m1853(com.ironsource.adqualitysdk.sdk.i.dz, android.view.View):void");
                    }

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static String m1854(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (g.f2127) {
                            try {
                                char[] cArrM2229 = g.m2229(f1569, cArr, i10);
                                g.f2129 = 4;
                                while (true) {
                                    int i11 = g.f2129;
                                    if (i11 < cArrM2229.length) {
                                        int i12 = i11 - 4;
                                        g.f2128 = i12;
                                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1569));
                                        g.f2129 = i11 + 1;
                                    } else {
                                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        return str2;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        f1568 = (f1570 + 21) % 128;
                        m1853(dzVar, view);
                        f1568 = (f1570 + 79) % 128;
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                        int i10 = f1568 + 31;
                        f1570 = i10 % 128;
                        if (i10 % 2 != 0) {
                            m1853(dzVar2, view);
                        } else {
                            m1853(dzVar2, view);
                            throw null;
                        }
                    }
                };
                f1516 = (f1517 + 27) % 128;
                return onAttachStateChangeListener;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1824("᱑펣ᰔ\ue76d鹨쩵푗틫窳厷绖ⵦ턔㔆\ue771萍⾏麐膵ẻ虿怆⪑礰᳠즴팝펇筅勆綱⩁퇢㑟\ue634蓚⢶鷢胩Ὥ蜲杣⥐秺ᶔ좕", View.resolveSize(0, 0)).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final iw m1838(final cl clVar, List<Object> list, final ee eeVar) {
        final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
        final ArrayList arrayList = new ArrayList();
        if (list.size() > 1) {
            int i10 = f1516 + 119;
            f1517 = i10 % 128;
            int i11 = i10 % 2;
            arrayList.addAll((Collection) cw.m1805(list, 1, List.class));
        }
        if (dzVar == null) {
            return null;
        }
        iw iwVar = new iw() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.3
            @Override // com.ironsource.adqualitysdk.sdk.i.iw
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo1852() {
                arrayList.add(0, this);
                dzVar.m2113(eeVar, clVar, arrayList);
                arrayList.remove(0);
            }
        };
        int i12 = f1517 + 59;
        f1516 = i12 % 128;
        if (i12 % 2 == 0) {
            return iwVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1842(List<Object> list) {
        f1516 = (f1517 + 41) % 128;
        View view = (View) cw.m1805(list, 0, View.class);
        final ht.e eVar = (ht.e) cw.m1805(list, 1, ht.e.class);
        if (m1825(list, 2)) {
            int i10 = f1516 + InterfaceC0435l1.d.b.f29114k;
            f1517 = i10 % 128;
            if (i10 % 2 == 0) {
                ki.m2841(view, eVar);
                int i11 = 95 / 0;
            } else {
                ki.m2841(view, eVar);
            }
        } else {
            ki.m2841(view, new ht.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ht.e
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final boolean mo1851(final ht htVar, final View view2, final MotionEvent motionEvent) {
                    p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.14.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            eVar.mo1851(htVar, view2, motionEvent);
                        }
                    });
                    return false;
                }
            });
        }
        int i12 = f1516 + 35;
        f1517 = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1844(List<Object> list) {
        f1517 = (f1516 + 49) % 128;
        View view = (View) cw.m1805(list, 0, View.class);
        final hp.b bVar = (hp.b) cw.m1805(list, 1, hp.b.class);
        if (!m1825(list, 2)) {
            ki.m2840(view, new hp.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.12
                @Override // com.ironsource.adqualitysdk.sdk.i.hp.b
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo1849(final hp hpVar, final View view2) {
                    p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.12.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            bVar.mo1849(hpVar, view2);
                        }
                    });
                }
            });
            f1517 = (f1516 + 107) % 128;
            return null;
        }
        f1516 = (f1517 + 11) % 128;
        ki.m2840(view, bVar);
        f1516 = (f1517 + 17) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1826(List<Object> list) {
        f1516 = (f1517 + 59) % 128;
        jo.m2696().m2699((iw) cw.m1805(list, 0, iw.class));
        int i10 = f1516 + 63;
        f1517 = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final Object m1837(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            clVar2 = clVar;
            try {
                hn.a aVar = new hn.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.16
                    @Override // com.ironsource.adqualitysdk.sdk.i.hn.a
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo1847(hn hnVar, MediaPlayer mediaPlayer) {
                        dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, hnVar, mediaPlayer}));
                    }
                };
                int i10 = f1517 + 121;
                f1516 = i10 % 128;
                if (i10 % 2 == 0) {
                    return aVar;
                }
                throw null;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1827((char) (1 - (AudioTrack.getMaxVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMaxVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 107, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 47).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1839(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            clVar2 = clVar;
            try {
                hp.b bVar = new hp.b() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.6
                    @Override // com.ironsource.adqualitysdk.sdk.i.hp.b
                    /* JADX INFO: renamed from: ﻐ */
                    public final void mo1849(hp hpVar, View view) {
                        dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, hpVar, view}));
                    }
                };
                f1516 = (f1517 + 23) % 128;
                return bVar;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1827((char) View.MeasureSpec.getSize(0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, View.MeasureSpec.getSize(0) + 34).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ki.m2849(r5, new com.ironsource.adqualitysdk.sdk.i.cz.AnonymousClass7());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0023, code lost:
    
        if (m1825(r6, 4) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0037, code lost:
    
        if (m1825(r6, 2) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.ki.m2849(r5, r0);
        com.ironsource.adqualitysdk.sdk.i.cz.f1516 = (com.ironsource.adqualitysdk.sdk.i.cz.f1517 + 107) % 128;
     */
    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m1834(java.util.List<java.lang.Object> r6) {
        /*
            r5 = this;
            int r5 = com.ironsource.adqualitysdk.sdk.i.cz.f1517
            int r5 = r5 + 13
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1516 = r0
            r0 = 2
            int r5 = r5 % r0
            java.lang.Class<com.ironsource.adqualitysdk.sdk.i.hm$e> r1 = com.ironsource.adqualitysdk.sdk.i.hm.e.class
            r2 = 1
            java.lang.Class<android.media.MediaPlayer> r3 = android.media.MediaPlayer.class
            r4 = 0
            if (r5 == 0) goto L26
            java.lang.Object r5 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r4, r3)
            android.media.MediaPlayer r5 = (android.media.MediaPlayer) r5
            java.lang.Object r0 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r2, r1)
            com.ironsource.adqualitysdk.sdk.i.hm$e r0 = (com.ironsource.adqualitysdk.sdk.i.hm.e) r0
            r1 = 4
            boolean r6 = m1825(r6, r1)
            if (r6 == 0) goto L45
            goto L39
        L26:
            java.lang.Object r5 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r4, r3)
            android.media.MediaPlayer r5 = (android.media.MediaPlayer) r5
            java.lang.Object r1 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r6, r2, r1)
            com.ironsource.adqualitysdk.sdk.i.hm$e r1 = (com.ironsource.adqualitysdk.sdk.i.hm.e) r1
            boolean r6 = m1825(r6, r0)
            r0 = r1
            if (r6 == 0) goto L45
        L39:
            com.ironsource.adqualitysdk.sdk.i.ki.m2849(r5, r0)
            int r5 = com.ironsource.adqualitysdk.sdk.i.cz.f1517
            int r5 = r5 + 107
            int r5 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1516 = r5
            goto L4d
        L45:
            com.ironsource.adqualitysdk.sdk.i.cz$7 r6 = new com.ironsource.adqualitysdk.sdk.i.cz$7
            r6.<init>()
            com.ironsource.adqualitysdk.sdk.i.ki.m2849(r5, r6)
        L4d:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.m1834(java.util.List):java.lang.Object");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1845(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            clVar2 = clVar;
            try {
                ht.e eVar = new ht.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.15
                    @Override // com.ironsource.adqualitysdk.sdk.i.ht.e
                    /* JADX INFO: renamed from: ﻐ */
                    public final boolean mo1851(ht htVar, View view, MotionEvent motionEvent) {
                        return dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, htVar, view, motionEvent})).m2125();
                    }
                };
                f1517 = (f1516 + 3) % 128;
                return eVar;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1827((char) (39702 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 35 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 35).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final Object m1830(List<Object> list) {
        f1517 = (f1516 + 9) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) cw.m1805(list, 0, MediaPlayer.class);
        final ho.c cVar = (ho.c) cw.m1805(list, 1, ho.c.class);
        if (m1825(list, 2)) {
            ki.m2851(mediaPlayer, cVar);
            f1516 = (f1517 + 27) % 128;
            return null;
        }
        ki.m2851(mediaPlayer, new ho.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ho.c
            /* JADX INFO: renamed from: ﾒ */
            public final void mo1848(final ho hoVar, final MediaPlayer mediaPlayer2) {
                p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.2.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo254() {
                        cVar.mo1848(hoVar, mediaPlayer2);
                    }
                });
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnClickListener m1821(List<Object> list) {
        int i10 = f1516 + InterfaceC0435l1.d.b.f29112i;
        f1517 = i10 % 128;
        View.OnClickListener onClickListenerM2837 = ki.m2837((View) cw.m1805(list, i10 % 2 == 0 ? 1 : 0, View.class));
        int i11 = f1517 + 95;
        f1516 = i11 % 128;
        if (i11 % 2 == 0) {
            return onClickListenerM2837;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final Object m1836(List<Object> list) {
        f1516 = (f1517 + InterfaceC0435l1.d.b.f29114k) % 128;
        MediaPlayer mediaPlayer = (MediaPlayer) cw.m1805(list, 0, MediaPlayer.class);
        final hn.a aVar = (hn.a) cw.m1805(list, 1, hn.a.class);
        if (m1825(list, 2)) {
            int i10 = f1516 + 81;
            f1517 = i10 % 128;
            if (i10 % 2 == 0) {
                ki.m2845(mediaPlayer, aVar);
                throw null;
            }
            ki.m2845(mediaPlayer, aVar);
        } else {
            ki.m2845(mediaPlayer, new hn.a() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.10
                @Override // com.ironsource.adqualitysdk.sdk.i.hn.a
                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                public final void mo1847(final hn hnVar, final MediaPlayer mediaPlayer2) {
                    p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.10.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.je
                        /* JADX INFO: renamed from: ｋ */
                        public final void mo254() {
                            aVar.mo1847(hnVar, mediaPlayer2);
                        }
                    });
                }
            });
            f1517 = (f1516 + 19) % 128;
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1841(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            clVar2 = clVar;
            try {
                ho.c cVar = new ho.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.11
                    @Override // com.ironsource.adqualitysdk.sdk.i.ho.c
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public final void mo1848(ho hoVar, MediaPlayer mediaPlayer) {
                        dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, hoVar, mediaPlayer}));
                    }
                };
                f1517 = (f1516 + 29) % 128;
                return cVar;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1824("톙▨퇜닐葆㱾自죅띻ꖼ⭫㝈᳜쌍닌鸣\ue247梛퐈җ䮼阨缱挋턙㾰蚩즃뚜ꓞ⠷つ\u1c39쉎뎍黪\ue578毾핽Վ䫅酵系揎큜㺂虝쪸", (-1) - TextUtils.lastIndexOf("", '0', 0)).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1824(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2127) {
            try {
                char[] cArrM2229 = g.m2229(f1515, cArr, i10);
                g.f2129 = 4;
                while (true) {
                    int i11 = g.f2129;
                    if (i11 < cArrM2229.length) {
                        int i12 = i11 - 4;
                        g.f2128 = i12;
                        cArrM2229[i11] = (char) (((long) (cArrM2229[i11] ^ cArrM2229[i11 % 4])) ^ (((long) i12) * f1515));
                        g.f2129 = i11 + 1;
                    } else {
                        str2 = new String(cArrM2229, 4, cArrM2229.length - 4);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1843(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            clVar2 = clVar;
            try {
                hm.e eVar = new hm.e() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.13
                    @Override // com.ironsource.adqualitysdk.sdk.i.hm.e
                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    public final boolean mo1850(hm hmVar, MediaPlayer mediaPlayer, int i10, int i11) {
                        return dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, hmVar, mediaPlayer, Integer.valueOf(i10), Integer.valueOf(i11)})).m2125();
                    }
                };
                int i10 = f1516 + 71;
                f1517 = i10 % 128;
                if (i10 % 2 != 0) {
                    return eVar;
                }
                throw null;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1827((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), Process.getGidForName("") + 69, 39 - TextUtils.lastIndexOf("", '0', 0)).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static List<Object> m1822(List<Object> list, Object... objArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
        if (list != null) {
            f1517 = (f1516 + 93) % 128;
            arrayList.addAll(list);
            f1516 = (f1517 + 11) % 128;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1827(char c4, int i10, int i11) {
        String str;
        synchronized (c.f1153) {
            try {
                char[] cArr = new char[i11];
                c.f1154 = 0;
                while (true) {
                    int i12 = c.f1154;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f1514[i10 + i12]) ^ (((long) i12) * f1513)) ^ ((long) c4));
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

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final Object m1831(cl clVar, List<Object> list, final ee eeVar) {
        final cl clVar2;
        try {
            final dz dzVar = (dz) cw.m1805(list, 0, dz.class);
            final List<Object> listM1803 = cw.m1803(list, 1);
            final boolean zM1825 = m1825(list, 2);
            clVar2 = clVar;
            try {
                BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9
                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    public static /* synthetic */ void m1858(AnonymousClass9 anonymousClass9, dz dzVar2, ee eeVar2, cl clVar3, List list2, Context context, Intent intent) {
                        dzVar2.m2113(eeVar2, clVar3, cz.m1828(list2, new Object[]{anonymousClass9, context, intent}));
                    }

                    @Override // android.content.BroadcastReceiver
                    public final void onReceive(final Context context, final Intent intent) {
                        if (zM1825) {
                            dzVar.m2113(eeVar, clVar2, cz.m1828(listM1803, new Object[]{this, context, intent}));
                        } else {
                            p.m3001(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.9.2
                                @Override // com.ironsource.adqualitysdk.sdk.i.je
                                /* JADX INFO: renamed from: ｋ */
                                public final void mo254() {
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    AnonymousClass9.m1858(anonymousClass9, dzVar, eeVar, clVar2, listM1803, context, intent);
                                }
                            });
                        }
                    }
                };
                f1516 = (f1517 + 95) % 128;
                return broadcastReceiver;
            } catch (Exception e10) {
                e = e10;
                cn.m1708(clVar2.m1643(), m1827((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), TextUtils.lastIndexOf("", '0', 0) + PsExtractor.AUDIO_STREAM, (ViewConfiguration.getFadingEdgeLength() >> 16) + 32).intern(), e);
                return null;
            }
        } catch (Exception e11) {
            e = e11;
            clVar2 = clVar;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final Object m1840(final cl clVar, List<Object> list) {
        f1516 = (f1517 + 59) % 128;
        final boolean zBooleanValue = false;
        Class cls = (Class) cw.m1805(list, 0, Class.class);
        Object objM1805 = cw.m1805(list, 1, Object.class);
        if (list.size() > 2) {
            int i10 = f1516 + 23;
            f1517 = i10 % 128;
            zBooleanValue = i10 % 2 == 0 ? ((Boolean) cw.m1805(list, 2, Boolean.class)).booleanValue() : ((Boolean) cw.m1805(list, 2, Boolean.class)).booleanValue();
        }
        final String simpleName = list.size() > 3 ? (String) cw.m1805(list, 3, String.class) : cls.getSimpleName();
        return km.m2905((Class<?>) cls, objM1805, new km.c() { // from class: com.ironsource.adqualitysdk.sdk.i.cz.8

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f1603 = 47206;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f1604 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char f1605 = 47778;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static char f1606 = 37820;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f1607 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f1608 = 31985;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m1856(String str, int i11) {
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
                            int i12 = o.f3077;
                            if (i12 < cArr.length) {
                                cArr3[0] = cArr[i12];
                                cArr3[1] = cArr[i12 + 1];
                                int i13 = 58224;
                                for (int i14 = 0; i14 < 16; i14++) {
                                    char c4 = cArr3[1];
                                    char c5 = cArr3[0];
                                    char c10 = (char) (c4 - (((c5 + i13) ^ ((c5 << 4) + f1605)) ^ ((c5 >>> 5) + f1603)));
                                    cArr3[1] = c10;
                                    cArr3[0] = (char) (c5 - (((c10 >>> 5) + f1606) ^ ((c10 + i13) ^ ((c10 << 4) + f1608))));
                                    i13 -= 40503;
                                }
                                int i15 = o.f3077;
                                cArr2[i15] = cArr3[0];
                                cArr2[i15 + 1] = cArr3[1];
                                o.f3077 = i15 + 2;
                            } else {
                                str2 = new String(cArr2, 0, i11);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.km.c
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo1857(Object obj, Method method, Object[] objArr) {
                int i11 = f1607 + 35;
                f1604 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        try {
                            throw null;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (method != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(simpleName);
                        sb2.append(m1856("\uf2c7㚠", 1 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                        sb2.append(method.getName());
                        String string = sb2.toString();
                        List<Object> listM1828 = cz.m1828(objArr != null ? Arrays.asList(objArr) : new ArrayList(), new Object[]{(hj) obj});
                        ArrayList arrayList = new ArrayList();
                        if (zBooleanValue) {
                            arrayList.add(listM1828);
                            listM1828 = arrayList;
                        }
                        clVar.m1639().mo1592(string, listM1828);
                    }
                    int i12 = f1604 + 53;
                    f1607 = i12 % 128;
                    if (i12 % 2 != 0) {
                        int i13 = 19 / 0;
                    }
                } catch (Exception e10) {
                    String strM1643 = clVar.m1643();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m1856("䗢탺즶쩍ᒔ÷흝䛞\u0c5c䱟⁴믑芵輮题㲵", 15 - ExpandableListView.getPackedPositionType(0L)).intern());
                    sb3.append(method.getName());
                    sb3.append(m1856("䦳운\ue651磁\u0ee4¹ꡭΒࢤ熐题㲵", 10 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                    sb3.append(simpleName);
                    sb3.append(m1856("닇㟜ᠵ댬ꭈ笢䜧奛匳꽔", 9 - TextUtils.getTrimmedLength("")).intern());
                    cn.m1708(strM1643, sb3.toString(), e10);
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        com.ironsource.adqualitysdk.sdk.i.cz.f1517 = (com.ironsource.adqualitysdk.sdk.i.cz.f1516 + 83) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r3 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r3 != false) goto L10;
     */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean m1825(java.util.List<java.lang.Object> r3, int r4) {
        /*
            int r0 = r3.size()
            r1 = 0
            if (r0 <= r4) goto L31
            int r0 = com.ironsource.adqualitysdk.sdk.i.cz.f1516
            int r0 = r0 + 3
            int r2 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1517 = r2
            int r0 = r0 % 2
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            java.lang.Object r3 = com.ironsource.adqualitysdk.sdk.i.cw.m1805(r3, r4, r2)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r0 != 0) goto L25
            r4 = 12
            int r4 = r4 / r1
            if (r3 == 0) goto L31
            goto L27
        L25:
            if (r3 == 0) goto L31
        L27:
            int r3 = com.ironsource.adqualitysdk.sdk.i.cz.f1516
            int r3 = r3 + 83
            int r3 = r3 % 128
            com.ironsource.adqualitysdk.sdk.i.cz.f1517 = r3
            r3 = 1
            return r3
        L31:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.cz.m1825(java.util.List, int):boolean");
    }
}
