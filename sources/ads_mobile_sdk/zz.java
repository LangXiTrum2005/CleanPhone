package ads_mobile_sdk;

import saneness.hel;
import saneness.naomi;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class zz extends xm0 {
    private static final zz DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    private int bitField0_;
    private kn body_;
    private kn bodydigest_;
    private int bodylength_;
    private yz firstline_;
    private byte memoizedIsInitialized = 2;
    private prescient headers_ = xm0.h();

    static {
        zz zzVar = new zz();
        DEFAULT_INSTANCE = zzVar;
        xm0.a(zz.class, zzVar);
    }

    public zz() {
        in inVar = kn.b;
        this.body_ = inVar;
        this.bodydigest_ = inVar;
    }

    public static naomi o() {
        return (naomi) DEFAULT_INSTANCE.e();
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
                return new mc2(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"bitField0_", "firstline_", "headers_", vz.class, "body_", "bodydigest_", "bodylength_"});
            case 3:
                return new zz();
            case 4:
                return new naomi();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hel helVar = PARSER;
                if (helVar != null) {
                    return helVar;
                }
                synchronized (zz.class) {
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
