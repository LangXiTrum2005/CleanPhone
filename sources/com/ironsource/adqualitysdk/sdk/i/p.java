package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f3078 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3079 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3080 = 1;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3081;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static final Handler f3082;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static final ScheduledExecutorService f3083;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f3084;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static final Handler f3085;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char f3086;

    static {
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        m2993();
        f3082 = new Handler(Looper.getMainLooper());
        Handler handlerM2990 = m2990();
        f3085 = handlerM2990;
        if (handlerM2990 == null) {
            scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            f3080 = (f3081 + 29) % 128;
        } else {
            f3081 = (f3080 + 17) % 128;
            scheduledExecutorServiceNewSingleThreadScheduledExecutor = null;
        }
        f3083 = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2991(je jeVar, long j10) {
        int i10 = f3080 + 39;
        f3081 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                m3000().postDelayed(jeVar, j10);
                throw null;
            }
            m3000().postDelayed(jeVar, j10);
            int i11 = f3081 + 33;
            f3080 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
        } catch (Throwable unused) {
            m.m2978(m2992("阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱", 13 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), m2992("\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20䜺澶㻃⑨焽롥឴ꋥ遟悝밻ᶩ欁企䷎㘟ᒉ華ꧦ\uf816䄽鲒\u242b緻", ((Process.getThreadPriority(0) + 20) >> 6) + 37).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2993() {
        f3078 = (char) 56036;
        f3084 = (char) 3934;
        f3079 = (char) 29167;
        f3086 = (char) 23061;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m2996(com.ironsource.adqualitysdk.sdk.i.je r7) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.p.f3080
            int r0 = r0 + 33
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.p.f3081 = r1
            int r0 = r0 % 2
            java.lang.String r1 = "阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱"
            r2 = 0
            if (r0 == 0) goto L19
            android.os.Handler r0 = m2995()     // Catch: java.lang.Throwable -> L61
            r3 = 79
            int r3 = r3 / r2
            if (r0 == 0) goto L23
            goto L1f
        L19:
            android.os.Handler r0 = m2995()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L23
        L1f:
            r0.post(r7)     // Catch: java.lang.Throwable -> L61
            return
        L23:
            java.util.concurrent.ScheduledExecutorService r0 = com.ironsource.adqualitysdk.sdk.i.p.f3083     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L39
            r0.execute(r7)     // Catch: java.lang.Throwable -> L61
            int r7 = com.ironsource.adqualitysdk.sdk.i.p.f3081
            int r7 = r7 + 113
            int r0 = r7 % 128
            com.ironsource.adqualitysdk.sdk.i.p.f3080 = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L37
            return
        L37:
            r7 = 0
            throw r7
        L39:
            long r3 = android.os.SystemClock.currentThreadTimeMillis()     // Catch: java.lang.Throwable -> L61
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            int r7 = r7 + 11
            java.lang.String r7 = m2992(r1, r7)     // Catch: java.lang.Throwable -> L61
            java.lang.String r7 = r7.intern()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = "稐៴炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷屨–丹╤眥든憤\u2d74뷥唚糷뇆ᙨ\uf716吼縔\uedf7ᑙ榷℘丹╤딘䅖︎萱蔂V婥鴈罰谷"
            java.lang.String r3 = ""
            int r3 = android.view.KeyEvent.keyCodeFromString(r3)     // Catch: java.lang.Throwable -> L61
            int r3 = r3 + 52
            java.lang.String r0 = m2992(r0, r3)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r0.intern()     // Catch: java.lang.Throwable -> L61
            com.ironsource.adqualitysdk.sdk.i.m.m2978(r7, r0, r2)     // Catch: java.lang.Throwable -> L61
            return
        L61:
            float r7 = android.view.ViewConfiguration.getScrollFriction()
            r0 = 0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            int r7 = 13 - r7
            java.lang.String r7 = m2992(r1, r7)
            java.lang.String r7 = r7.intern()
            int r0 = android.view.ViewConfiguration.getMinimumFlingVelocity()
            int r0 = r0 >> 16
            int r0 = r0 + 36
            java.lang.String r1 = "\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20遟悝밻ᶩ䚽ﴮ퐋ڴ귢벳\u0dcb蕞ৄ掞㙭ྖ\ue70e\udfc7ោ틩玑䀩"
            java.lang.String r0 = m2992(r1, r0)
            java.lang.String r0 = r0.intern()
            com.ironsource.adqualitysdk.sdk.i.m.m2978(r7, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.p.m2996(com.ironsource.adqualitysdk.sdk.i.je):void");
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2998(je jeVar) {
        int i10 = f3081 + 61;
        f3080 = i10 % 128;
        if (i10 % 2 == 0) {
            m2999();
            throw null;
        }
        if (!m2999()) {
            m2994(jeVar);
            int i11 = f3081 + 63;
            f3080 = i11 % 128;
            if (i11 % 2 == 0) {
                throw null;
            }
            return;
        }
        jeVar.run();
        int i12 = f3081 + 11;
        f3080 = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 43 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Handler m3000() {
        int i10 = f3080;
        Handler handler = f3082;
        int i11 = i10 + 67;
        f3081 = i11 % 128;
        if (i11 % 2 == 0) {
            return handler;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2994(je jeVar) {
        f3080 = (f3081 + 39) % 128;
        try {
            m3000().post(jeVar);
            f3081 = (f3080 + 123) % 128;
        } catch (Throwable unused) {
            m.m2978(m2992("阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱", View.MeasureSpec.makeMeasureSpec(0, 0) + 12).intern(), m2992("\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20遟悝밻ᶩ欁企䷎㘟ᒉ華ꧦ\uf816䄽鲒\u242b緻", 28 - TextUtils.lastIndexOf("", '0')).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m3001(je jeVar) {
        f3080 = (f3081 + 73) % 128;
        if (m2999()) {
            m2996(jeVar);
        } else {
            jeVar.run();
            f3081 = (f3080 + 53) % 128;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2992(String str, int i10) {
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
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f3078)) ^ ((c5 >>> 5) + f3079)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f3084) ^ ((c10 + i12) ^ ((c10 << 4) + f3086))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Handler m2990() {
        HandlerThread handlerThread;
        int i10 = f3080 + InterfaceC0435l1.d.b.f29107d;
        f3081 = i10 % 128;
        for (int i11 = i10 % 2 != 0 ? 1 : 0; i11 < 3; i11++) {
            try {
                handlerThread = new HandlerThread(m2992("\ue948\uf4d0䭏톇ᝈ❱\uf7f1뤏눿綁", 10 - (AudioTrack.getMinVolume() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (AudioTrack.getMinVolume() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1))).intern());
                try {
                    handlerThread.start();
                    return new Handler(handlerThread.getLooper());
                } catch (Throwable unused) {
                    if (handlerThread != null) {
                        try {
                            handlerThread.quitSafely();
                        } catch (Throwable unused2) {
                            m.m2978(m2992("阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12).intern(), m2992("\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f\uee0c민䄽鲒⍀臲炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷ꄐ빇", 35 - TextUtils.indexOf("", "")).intern(), true);
                        }
                    }
                    m.m2978(m2992("阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱", 11 - TextUtils.indexOf((CharSequence) "", '0')).intern(), m2992("\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f\uee0c민䄽鲒⍀臲炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷ࠝೋ웧䆒찹臩⍞嬨䷎㘟ྼ眚\udd2a㧞", (ViewConfiguration.getScrollBarSize() >> 8) + 48).intern(), true);
                }
            } catch (Throwable unused3) {
                handlerThread = null;
            }
        }
        f3081 = (f3080 + 121) % 128;
        return null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2999() {
        int i10 = f3081 + 97;
        f3080 = i10 % 128;
        if (i10 % 2 == 0) {
            Looper.myLooper();
            Looper.getMainLooper();
            throw null;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            f3081 = (f3080 + 79) % 128;
            return false;
        }
        int i11 = f3081 + 49;
        f3080 = i11 % 128;
        return i11 % 2 != 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2997(je jeVar, long j10) {
        int i10 = f3081 + 49;
        f3080 = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Handler handlerM2995 = m2995();
                if (handlerM2995 != null) {
                    handlerM2995.postDelayed(jeVar, j10);
                    return;
                }
                ScheduledExecutorService scheduledExecutorService = f3083;
                if (scheduledExecutorService != null) {
                    int i11 = f3081 + 61;
                    f3080 = i11 % 128;
                    if (i11 % 2 != 0) {
                        scheduledExecutorService.schedule(jeVar, j10, TimeUnit.MILLISECONDS);
                        return;
                    } else {
                        scheduledExecutorService.schedule(jeVar, j10, TimeUnit.MILLISECONDS);
                        throw null;
                    }
                }
                m.m2978(m2992("阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱", Color.alpha(0) + 12).intern(), m2992("稐៴炾檕糷뇆嚏☶忎䈃ꮠ쫝せ㛺儵\uf7c6ৄ掞罰谷屨–丹╤眥든憤\u2d74뷥唚糷뇆ᙨ\uf716吼縔\uedf7ᑙ榷℘丹╤딘䅖︎萱蔂V婥鴈罰谷", 52 - (KeyEvent.getMaxKeyCode() >> 16)).intern(), false);
                int i12 = f3081 + 61;
                f3080 = i12 % 128;
                if (i12 % 2 == 0) {
                    throw null;
                }
                return;
            }
            m2995();
            throw null;
        } catch (Throwable unused) {
            m.m2978(m2992("阇黀\uee7f訸憤\u2d74쀬鯧蟺蜪퉑遱", 13 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2992("\uf1a5ꩡ蔂V឴ꋥᒉ華舽\ud87f╨飣污\ude20䜺澶㻃⑨焽롥឴ꋥ遟悝밻ᶩ䚽ﴮ퐋ڴ귢벳\u0dcb蕞ৄ掞㙭ྖ\ue70e\udfc7ោ틩玑䀩", 44 - (Process.myPid() >> 22)).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Handler m2995() {
        int i10 = f3081;
        int i11 = i10 + 61;
        f3080 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        Handler handler = f3085;
        int i12 = i10 + 85;
        f3080 = i12 % 128;
        if (i12 % 2 != 0) {
            return handler;
        }
        throw null;
    }
}
