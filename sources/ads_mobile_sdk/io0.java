package ads_mobile_sdk;

import saneness.beclomethasone;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class io0 extends xm0 {
    private static final io0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private kq clientPingMetadata_;
    private prescient payloads_ = xm0.h();

    static {
        io0 io0Var = new io0();
        DEFAULT_INSTANCE = io0Var;
        xm0.a(io0.class, io0Var);
    }

    public static beclomethasone o() {
        return (beclomethasone) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "payloads_", ho0.class, "clientPingMetadata_"});
        }
        if (iAttabal == 3) {
            return new io0();
        }
        if (iAttabal == 4) {
            return new beclomethasone();
        }
        if (iAttabal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iAttabal != 6) {
            throw null;
        }
        hel helVar = PARSER;
        if (helVar != null) {
            return helVar;
        }
        synchronized (io0.class) {
            try {
                wm0Var = PARSER;
                if (wm0Var == null) {
                    wm0Var = new wm0(DEFAULT_INSTANCE);
                    PARSER = wm0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wm0Var;
    }
}
