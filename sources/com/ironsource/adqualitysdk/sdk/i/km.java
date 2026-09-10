package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class km {

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char[] f3034 = {'L', 169, 184, 187, 192, 175, 172, 182, 178, 183, 141, 281, 281, 242, 237, 276, 240, 234, 275, 276, 268, 275, 277, 259, 266, 281, 284, 289, 263, 253, 269, 274, 281, 274, 275, 282, 281, 242, 244, 281, 279, 279, 237, 236, 271, 277, 260, 258, 279, 282, 277, 279, 287, 260, 256, 271, 275, 284, 264, 262, 273, 267, 269, 276, 260, 260, '9', 'k', 'd', 'b', 'h', ']', '_', 's', 'j', 'f', 'W', '[', 'l', 'f', 'C', 'D', 'n', 'n', 'p', 'K', 'I', 'p', 'q', 'j', 'i', 'p', 'i', 'd', 'T', '^', 'x', 's', 'p', 'a', 'Z', 'l', 'j', 'c', 'k', 'j', 'A', 'G', 'k', 'D', 'I', 'p', 'p', 'r', '['};

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f3035 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3036;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public interface c {
        /* JADX INFO: renamed from: ﻛ */
        void mo1857(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m2904(Object obj) {
        int i10 = f3035 + InterfaceC0435l1.d.b.f29112i;
        f3036 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        if (obj != null && Proxy.isProxyClass(obj.getClass()) && (obj instanceof hj)) {
            return true;
        }
        int i11 = f3035 + 93;
        f3036 = i11 % 128;
        if (i11 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2905(Class<?> cls, Object obj, c cVar) {
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hj.class}, new b(obj, cVar));
            int i10 = f3036 + 45;
            f3035 = i10 % 128;
            if (i10 % 2 != 0) {
                return objNewProxyInstance;
            }
            throw null;
        } catch (Throwable th2) {
            kl.m2899(m2906("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 10, 72, 0}, false).intern(), m2906("\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001", new int[]{10, 56, 169, 54}, false).intern(), th2, true);
            try {
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, hj.class}, new b(obj, cVar));
            } catch (Throwable th3) {
                kl.m2899(m2906("\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001", new int[]{0, 10, 72, 0}, false).intern(), m2906("\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{66, 49, 0, 0}, true).intern(), th3, true);
                return obj;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2906(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
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
                System.arraycopy(f3034, i10, cArr, 0, i11);
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

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements InvocationHandler {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f3037 = 1;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static short[] f3038 = null;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static byte[] f3039 = {-37, -41, -55, -13, -80, -43, -35, -47, -10, 24, 81, 99, 80, 107, 84, -87, 3, 97, 103, 89, 103, 72, -128, 73, 95, -99, 23, 86, 88, 85, 100, 97, -91, 10, 95, 89, 92, -119, 0, -30, 39, 17, 35, 11, 27, 36, 23, 102, -43, 20, 22, 19, 34, 31, 99, -56, 29, 23, 26, 71, -93, -102, -86, 46, 77, 95, 76, 103, 80, -91, -4, -27, 1, 49, -94, -17, -10, -27, 3, -18, -28, -23, -8, -11, 57, -87, -23, -11, -27, -16, -1, -18, 55, -98, -13, -19, -16, 29, -22, -28, -31, -40, -30, -19, 0, -63, -31, -45, -11, -47, -27, -18, -32, 3, -78, -15, -32, 0, 0, 0, 0, 0, 0, 0};

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f3040 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static int f3041 = 115;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f3042 = -1697386562;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static int f3043 = 636854869;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private Object f3044;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c f3045;

        public b(Object obj, c cVar) {
            this.f3044 = obj;
            this.f3045 = cVar;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Object m2907() {
            int i10 = (f3037 + 7) % 128;
            f3040 = i10;
            Object obj = this.f3044;
            int i11 = i10 + 63;
            f3037 = i11 % 128;
            if (i11 % 2 != 0) {
                return obj;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean m2908(Method method) {
            String name = method.getName();
            if (name.hashCode() == 1622498214 && name.equals(m2911((short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31), (-636854766) - TextUtils.getOffsetBefore("", 0), (-94) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1697386661 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) TextUtils.getTrimmedLength("")).intern())) {
                f3040 = (f3037 + 121) % 128;
                return true;
            }
            int i10 = f3037 + 27;
            f3040 = i10 % 128;
            if (i10 % 2 == 0) {
                return false;
            }
            throw null;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001e A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:8:0x0015, B:10:0x001e, B:12:0x002a, B:16:0x003c, B:19:0x004a), top: B:23:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:12:0x002a A[Catch: all -> 0x003a, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:8:0x0015, B:10:0x001e, B:12:0x002a, B:16:0x003c, B:19:0x004a), top: B:23:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:16:0x003c A[Catch: all -> 0x003a, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x003a, blocks: (B:8:0x0015, B:10:0x001e, B:12:0x002a, B:16:0x003c, B:19:0x004a), top: B:23:0x0015 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0015 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static Object[] m2910(Object[] objArr) {
            ArrayList arrayList;
            int i10;
            int i11 = f3040 + 29;
            f3037 = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 71 / 0;
                if (objArr != null) {
                    try {
                        arrayList = new ArrayList();
                        for (Object obj : objArr) {
                            if (Proxy.isProxyClass(obj.getClass())) {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                                f3037 = (f3040 + InterfaceC0435l1.d.b.f29112i) % 128;
                            } else {
                                arrayList.add(obj);
                                f3040 = (f3037 + 71) % 128;
                            }
                        }
                        return arrayList.toArray();
                    } catch (Throwable th2) {
                        kl.m2899(m2911((short) (44 - (Process.myTid() >> 22)), TextUtils.lastIndexOf("", '0', 0) - 636854788, (ViewConfiguration.getJumpTapTimeout() >> 16) - 105, 1697386562 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1)).intern(), m2911((short) (Color.alpha(0) + 16), (-636854801) - TextUtils.lastIndexOf("", '0', 0), (-87) - MotionEvent.axisFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1697386632, (byte) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern(), th2, true);
                    }
                }
            } else if (objArr != null) {
                arrayList = new ArrayList();
                while (i10 < r2) {
                    if (Proxy.isProxyClass(obj.getClass())) {
                        arrayList.add(Proxy.getInvocationHandler(obj));
                        f3037 = (f3040 + InterfaceC0435l1.d.b.f29112i) % 128;
                    } else {
                        arrayList.add(obj);
                        f3040 = (f3037 + 71) % 128;
                    }
                }
                return arrayList.toArray();
            }
            return objArr;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2911(short s10, int i10, int i11, int i12, byte b10) {
            String string;
            synchronized (n.f3070) {
                try {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f3041;
                    int i14 = i11 + i13;
                    int i15 = i14 == -1 ? 1 : 0;
                    if (i15 != 0) {
                        byte[] bArr = f3039;
                        i14 = bArr != null ? (byte) (bArr[f3042 + i12] + i13) : (short) (f3038[f3042 + i12] + i13);
                    }
                    if (i14 > 0) {
                        n.f3072 = ((i12 + i14) - 2) + f3042 + i15;
                        n.f3073 = b10;
                        char c4 = (char) (i10 + f3043);
                        n.f3074 = c4;
                        sb2.append(c4);
                        n.f3075 = n.f3074;
                        n.f3071 = 1;
                        while (n.f3071 < i14) {
                            byte[] bArr2 = f3039;
                            if (bArr2 != null) {
                                int i16 = n.f3072;
                                n.f3072 = i16 - 1;
                                n.f3074 = (char) (n.f3075 + (((byte) (bArr2[i16] + s10)) ^ n.f3073));
                            } else {
                                short[] sArr = f3038;
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

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
        
            return m2909(r22);
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        
            r1 = m2911((short) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 44), (-636854789) - (android.graphics.PointF.length(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.graphics.PointF.length(com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (-105) - (android.media.AudioTrack.getMinVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMinVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), 1697386562 - (android.util.TypedValue.complexToFloat(0) > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.util.TypedValue.complexToFloat(0) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)), (byte) (android.text.AndroidCharacter.getMirror('0') - '0')).intern();
            r3 = new java.lang.StringBuilder();
            r3.append(m2911((short) ((android.os.Process.myTid() >> 22) - 92), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) - 636854801, (-84) - (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)), 1697386571 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) android.view.KeyEvent.keyCodeFromString("")).intern());
            r3.append(r22.getName());
            com.ironsource.adqualitysdk.sdk.i.kl.m2899(r1, r3.toString(), r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x00ae, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x00af, code lost:
        
            r20.f3045.mo1857(r21, r22, r23);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x00ba, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x00bb, code lost:
        
            r4 = m2911((short) (44 - android.view.KeyEvent.keyCodeFromString("")), (-636854789) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (-106) - android.text.TextUtils.lastIndexOf("", '0'), 1697386562 - android.view.View.combineMeasuredStates(0, 0), (byte) ((-1) - android.text.TextUtils.lastIndexOf("", '0', 0))).intern();
            r5 = new java.lang.StringBuilder();
            r5.append(m2911((short) (android.text.TextUtils.indexOf("", "") - 26), (-636854801) - android.widget.ExpandableListView.getPackedPositionChild(0), (-92) - android.graphics.drawable.Drawable.resolveOpacity(0, 0), 1697386599 - android.text.TextUtils.lastIndexOf("", '0', 0), (byte) (1 - (android.media.AudioTrack.getMaxVolume() > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.media.AudioTrack.getMaxVolume() == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)))).intern());
            r6 = r20.f3044;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0122, code lost:
        
            if (r6 != null) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0124, code lost:
        
            r6 = r6.toString();
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0129, code lost:
        
            r6 = m2911((short) ((android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 93), android.graphics.Color.red(0) - 636854759, android.graphics.Color.red(0) - 111, android.view.View.combineMeasuredStates(0, 0) + 1697386622, (byte) android.text.TextUtils.indexOf("", "")).intern();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0155, code lost:
        
            r5.append(r6);
            r5.append(m2911((short) ((-16777304) - android.graphics.Color.rgb(0, 0, 0)), android.widget.ExpandableListView.getPackedPositionGroup(0) - 636854837, (android.os.SystemClock.elapsedRealtime() > 0 ? 1 : (android.os.SystemClock.elapsedRealtime() == 0 ? 0 : -1)) - 108, (android.util.TypedValue.complexToFraction(0, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) > com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (android.util.TypedValue.complexToFraction(0, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 1697386625, (byte) android.text.TextUtils.getTrimmedLength("")).intern());
            r5.append(r22.getName());
            com.ironsource.adqualitysdk.sdk.i.kl.m2899(r4, r5.toString(), r0, true);
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x002c, code lost:
        
            if (m2908(r22) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        
            if (m2908(r22) != false) goto L31;
         */
        @Override // java.lang.reflect.InvocationHandler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invoke(java.lang.Object r21, java.lang.reflect.Method r22, java.lang.Object[] r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.km.b.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private Object m2909(Method method) {
            int i10 = f3040 + 61;
            f3037 = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            if (method != null) {
                String name = method.getName();
                if (name.hashCode() == 1622498214 && name.equals(m2911((short) (29 - TextUtils.indexOf((CharSequence) "", '0', 0)), (-636854766) - TextUtils.indexOf("", ""), (-96) - TextUtils.lastIndexOf("", '0', 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1697386661, (byte) (ViewConfiguration.getTapTimeout() >> 16)).intern())) {
                    return m2907();
                }
            }
            int i11 = f3040 + 27;
            f3037 = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
    }
}
