package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3414a2 {
    public static final C3414a2 a = new C3414a2();
    public static final String b = "trials_fail";
    public static final String c = "parsing";
    public static final String d = "other";
    public static final String e = "disabled";
    public static final String f = "-1";

    private C3414a2() {
    }

    public final String a(boolean z) {
        if (!z) {
            return f;
        }
        return "fallback_" + System.currentTimeMillis();
    }

    public static /* synthetic */ String a(C3414a2 c3414a2, boolean z, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c3414a2.a(z, num);
    }

    public final String a(boolean z, Integer num) {
        if (!z) {
            return e;
        }
        if (num != null && num.intValue() == 1003) {
            return c;
        }
        if (num != null && num.intValue() == 1008) {
            return c;
        }
        if (num != null && num.intValue() == 1002) {
            return c;
        }
        if (num != null && num.intValue() == 1006) {
            return b;
        }
        return (num != null && num.intValue() == 1001) ? b : d;
    }
}
