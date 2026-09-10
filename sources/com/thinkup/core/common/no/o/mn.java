package com.thinkup.core.common.no.o;

/* JADX INFO: loaded from: classes6.dex */
public final class mn {
    public static final int m = 1;
    public static final int m0 = 999;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f42097n = 1;
    public static final int o = 0;
    public static final int o0 = 2;
    public static final int om = 3;
    public static final int on = 3;
    public static final int oo = 2;
    public final int mn = 0;
    public final o n0;
    public static final mn mo = new mn(o.NO_NETWORK);
    public static final mn mm = new mn(o.WIFI);

    public enum o {
        NO_NETWORK,
        WIFI,
        MOBILE;

        private static /* synthetic */ o[] o() {
            return new o[]{NO_NETWORK, WIFI, MOBILE};
        }
    }

    private mn(o oVar) {
        this.n0 = oVar;
    }
}
