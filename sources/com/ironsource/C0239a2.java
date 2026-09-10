package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.a2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0239a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0239a2 f28151a = new C0239a2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f28152b = "trials_fail";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f28153c = "parsing";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f28154d = "other";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f28155e = "disabled";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f28156f = "-1";

    private C0239a2() {
    }

    public final String a(boolean z10) {
        return !z10 ? f28156f : defpackage.e.i(System.currentTimeMillis(), "fallback_");
    }

    public static /* synthetic */ String a(C0239a2 c0239a2, boolean z10, Integer num, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        return c0239a2.a(z10, num);
    }

    public final String a(boolean z10, Integer num) {
        if (!z10) {
            return f28155e;
        }
        if (num != null && num.intValue() == 1003) {
            return f28153c;
        }
        if (num != null && num.intValue() == 1008) {
            return f28153c;
        }
        if (num != null && num.intValue() == 1002) {
            return f28153c;
        }
        if (num != null && num.intValue() == 1006) {
            return f28152b;
        }
        return (num != null && num.intValue() == 1001) ? f28152b : "other";
    }
}
