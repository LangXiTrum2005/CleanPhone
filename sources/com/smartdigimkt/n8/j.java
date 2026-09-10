package com.smartdigimkt.n8;

import com.smartdigimkt.sdk.api.SDMAdConst;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f37207a = "j";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static double f37208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static double f37209c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37210a;

        static {
            int[] iArr = new int[SDMAdConst.CURRENCY.values().length];
            f37210a = iArr;
            try {
                iArr[SDMAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37210a[SDMAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37210a[SDMAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double a() {
        return f37208b;
    }

    public static double b() {
        return f37209c;
    }

    public static void a(double d) {
        f37208b = d;
        if (d > 0.0d) {
            f37209c = 1.0d / d;
        }
    }

    public static SDMAdConst.CURRENCY a(String str) {
        if ("CNY".equalsIgnoreCase(str)) {
            return SDMAdConst.CURRENCY.RMB;
        }
        if ("USD".equalsIgnoreCase(str)) {
            return SDMAdConst.CURRENCY.USD;
        }
        return SDMAdConst.CURRENCY.RMB_CENT;
    }

    public static double a(double d, SDMAdConst.CURRENCY currency, SDMAdConst.CURRENCY currency2) {
        double d2;
        if (d > 0.0d && currency2 != null && currency != null) {
            try {
                int i2 = a.f37210a[currency.ordinal()];
                if (i2 == 1) {
                    if (currency2 == SDMAdConst.CURRENCY.USD) {
                        d2 = f37208b;
                        return d * d2;
                    }
                    if (currency2 == SDMAdConst.CURRENCY.RMB_CENT) {
                        return d * 100.0d;
                    }
                    return d * 1.0d;
                }
                if (i2 != 2) {
                    if (currency2 == SDMAdConst.CURRENCY.RMB) {
                        d2 = f37209c;
                        return d * d2;
                    }
                    if (currency2 == SDMAdConst.CURRENCY.RMB_CENT) {
                        return d * f37209c * 100.0d;
                    }
                    return d * 1.0d;
                }
                if (currency2 == SDMAdConst.CURRENCY.USD) {
                    d2 = f37208b;
                    d /= 100.0d;
                    return d * d2;
                }
                if (currency2 == SDMAdConst.CURRENCY.RMB) {
                    return d / 100.0d;
                }
                return d * 1.0d;
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return d;
    }
}
