package com.thinkup.core.common.ooo;

import com.thinkup.core.api.TUAdConst;

/* JADX INFO: loaded from: classes6.dex */
public class o0n {
    private static double m = 0.0d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static double f42345n = 0.0d;
    private static final String o = "o0n";

    /* JADX INFO: renamed from: com.thinkup.core.common.ooo.o0n$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] o;

        static {
            int[] iArr = new int[TUAdConst.CURRENCY.values().length];
            o = iArr;
            try {
                iArr[TUAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                o[TUAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                o[TUAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double m() {
        return m;
    }

    public static double o() {
        return f42345n;
    }

    public static void o(double d) {
        m = d;
        if (d > 0.0d) {
            f42345n = 1.0d / d;
        }
    }

    public static TUAdConst.CURRENCY o(String str) {
        if ("CNY".equalsIgnoreCase(str)) {
            return TUAdConst.CURRENCY.RMB;
        }
        if ("USD".equalsIgnoreCase(str)) {
            return TUAdConst.CURRENCY.USD;
        }
        return TUAdConst.CURRENCY.RMB_CENT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004b, code lost:
    
        if (r8 == com.thinkup.core.api.TUAdConst.CURRENCY.RMB_CENT) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static double o(double r5, com.thinkup.core.api.TUAdConst.CURRENCY r7, com.thinkup.core.api.TUAdConst.CURRENCY r8) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L51
            if (r8 == 0) goto L51
            if (r7 != 0) goto Lb
            goto L51
        Lb:
            int[] r0 = com.thinkup.core.common.ooo.o0n.AnonymousClass1.o     // Catch: java.lang.Throwable -> L25
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L25
            r7 = r0[r7]     // Catch: java.lang.Throwable -> L25
            r0 = 1
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r3 = 4636737291354636288(0x4059000000000000, double:100.0)
            if (r7 == r0) goto L42
            r0 = 2
            if (r7 == r0) goto L32
            com.thinkup.core.api.TUAdConst$CURRENCY r7 = com.thinkup.core.api.TUAdConst.CURRENCY.RMB     // Catch: java.lang.Throwable -> L25
            if (r8 != r7) goto L27
            double r7 = com.thinkup.core.common.ooo.o0n.f42345n     // Catch: java.lang.Throwable -> L25
        L23:
            double r5 = r5 * r7
            goto L51
        L25:
            r7 = move-exception
            goto L4e
        L27:
            com.thinkup.core.api.TUAdConst$CURRENCY r7 = com.thinkup.core.api.TUAdConst.CURRENCY.RMB_CENT     // Catch: java.lang.Throwable -> L25
            if (r8 != r7) goto L30
            double r7 = com.thinkup.core.common.ooo.o0n.f42345n     // Catch: java.lang.Throwable -> L25
            double r5 = r5 * r7
        L2e:
            double r5 = r5 * r3
            goto L51
        L30:
            double r5 = r5 * r1
            goto L51
        L32:
            com.thinkup.core.api.TUAdConst$CURRENCY r7 = com.thinkup.core.api.TUAdConst.CURRENCY.USD     // Catch: java.lang.Throwable -> L25
            if (r8 != r7) goto L3c
            double r7 = r5 / r3
            double r5 = com.thinkup.core.common.ooo.o0n.m     // Catch: java.lang.Throwable -> L25
            double r5 = r5 * r7
            goto L51
        L3c:
            com.thinkup.core.api.TUAdConst$CURRENCY r7 = com.thinkup.core.api.TUAdConst.CURRENCY.RMB     // Catch: java.lang.Throwable -> L25
            if (r8 != r7) goto L30
            double r5 = r5 / r3
            goto L51
        L42:
            com.thinkup.core.api.TUAdConst$CURRENCY r7 = com.thinkup.core.api.TUAdConst.CURRENCY.USD     // Catch: java.lang.Throwable -> L25
            if (r8 != r7) goto L49
            double r7 = com.thinkup.core.common.ooo.o0n.m     // Catch: java.lang.Throwable -> L25
            goto L23
        L49:
            com.thinkup.core.api.TUAdConst$CURRENCY r7 = com.thinkup.core.api.TUAdConst.CURRENCY.RMB_CENT     // Catch: java.lang.Throwable -> L25
            if (r8 != r7) goto L30
            goto L2e
        L4e:
            r7.getMessage()
        L51:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thinkup.core.common.ooo.o0n.o(double, com.thinkup.core.api.TUAdConst$CURRENCY, com.thinkup.core.api.TUAdConst$CURRENCY):double");
    }
}
