package ads_mobile_sdk;

import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class d00 extends xm0 {
    private static final d00 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private kn body_;
    private kn bodydigest_;
    private int bodylength_;
    private c00 firstline_;
    private kn remoteIp_;
    private byte memoizedIsInitialized = 2;
    private prescient headers_ = xm0.h();

    static {
        d00 d00Var = new d00();
        DEFAULT_INSTANCE = d00Var;
        xm0.a(d00.class, d00Var);
    }

    public d00() {
        in inVar = kn.b;
        this.body_ = inVar;
        this.bodydigest_ = inVar;
        this.remoteIp_ = inVar;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        switch (tdb.attabal(i)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (xm0Var == null ? 0 : 1);
                return null;
            case 2:
                return new mc2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"bitField0_", "firstline_", "headers_", vz.class, "body_", "bodydigest_", "bodylength_", "remoteIp_"});
            case 3:
                return new d00();
            case 4:
                return new saneness.attabal();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hel helVar = PARSER;
                if (helVar != null) {
                    return helVar;
                }
                synchronized (d00.class) {
                    try {
                        wm0Var = PARSER;
                        if (wm0Var == null) {
                            wm0Var = new wm0(DEFAULT_INSTANCE);
                            PARSER = wm0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wm0Var;
            default:
                throw null;
        }
    }
}
