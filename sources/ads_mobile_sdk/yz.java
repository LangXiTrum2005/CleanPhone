package ads_mobile_sdk;

import saneness.hel;
import saneness.interferometer;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class yz extends xm0 {
    private static final yz DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private kn uri_;
    private kn verb_;
    private kn version_;

    static {
        yz yzVar = new yz();
        DEFAULT_INSTANCE = yzVar;
        xm0.a(yz.class, yzVar);
    }

    public yz() {
        in inVar = kn.b;
        this.verb_ = inVar;
        this.uri_ = inVar;
        this.version_ = inVar;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "verb_", "uri_", "version_"});
        }
        if (iAttabal == 3) {
            return new yz();
        }
        if (iAttabal == 4) {
            return new interferometer();
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
        synchronized (yz.class) {
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
