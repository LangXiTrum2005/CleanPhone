package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1792Wh {
    public static String[] A01 = {"0TBfSTrFZZIPTbjcv3YvZ5KQe5wh6M4Z", "Y", "skEIHJjGP8F0E9LHs3c03M6jOmkdnZrb", "lNiM6G1VkMzjPhI0VWbHd", "xoZoqEy9j11lJxTnOEXOmkmQN9dBXrj3", "0lNV7cA9G3CxYQK", "ZSiJ5Be21P36sCEypxWEkyax05PjjigP", "3dFveWP5h629GmfNhsyVO5v38YfKmNKK"};
    public static final ThreadLocal<C1792Wh> A02 = new ThreadLocal<>();
    public final WQ A00 = new WQ();

    public static WQ A00() {
        return A02().A00;
    }

    public static WQ A01(C1791Wg c1791Wg) {
        WQ currentStackTraces = new WQ(A00());
        currentStackTraces.add(c1791Wg);
        return currentStackTraces;
    }

    public static C1792Wh A02() {
        C1792Wh c1792Wh = A02.get();
        if (c1792Wh == null) {
            C1792Wh c1792Wh2 = new C1792Wh();
            A02.set(c1792Wh2);
            return c1792Wh2;
        }
        return c1792Wh;
    }

    public static void A03(AbstractRunnableC1787Wc abstractRunnableC1787Wc) {
        WQ wqA06 = abstractRunnableC1787Wc.A06();
        if (wqA06 != null) {
            WQ createRunnableAsyncStackTrace = A02().A00;
            createRunnableAsyncStackTrace.addAll(wqA06);
        }
    }

    public static void A04(AbstractRunnableC1787Wc abstractRunnableC1787Wc) {
        WQ wqA06 = abstractRunnableC1787Wc.A06();
        if (wqA06 != null) {
            WQ wq = A02().A00;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[0] = "6tfOksRsBjIBNQljvPHCCYkD1Hr87lb7";
            wq.removeAll(wqA06);
        }
    }
}
