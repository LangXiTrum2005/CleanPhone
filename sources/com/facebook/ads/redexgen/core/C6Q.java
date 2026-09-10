package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C6Q {
    public int A00;
    public C04875x A01;
    public C04875x A02;
    public static String[] A04 = {"3L5xTrYaZHGbjsCndSxeOQfzJoqaksAO", "yNuit7zcaXLgcR4Esus3jmJQTJqqE", "DjfkS9z5OPUyV9QdiCBZ1KUSwMFmGRPN", "lc54RdKLiwdhlc59ssIRjbGGERTX6o9W", "6o2d", "DSh0O66K0UoAsbtG5khJTMnGYv0IzoNn", "Wt9X6yajIBXU34hiGluB33HbNXSszdRF", "6wPar1yvZmOBSMEilq5oC74eJWuAafP4"};
    public static C4D<C6Q> A03 = new C1914lT(20);

    public static C6Q A00() {
        C6Q c6qA31 = A03.A31();
        if (A04[5].charAt(2) == 'q') {
            throw new RuntimeException();
        }
        A04[5] = "RnCaU2E938mENSzRzPrAuXo67ZnkzA8g";
        C6Q record = c6qA31;
        return record == null ? new C6Q() : record;
    }

    public static void A01() {
        while (A03.A31() != null) {
        }
    }

    public static void A02(C6Q c6q) {
        c6q.A00 = 0;
        c6q.A02 = null;
        c6q.A01 = null;
        A03.AGn(c6q);
    }
}
