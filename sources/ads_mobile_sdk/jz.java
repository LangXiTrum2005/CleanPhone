package ads_mobile_sdk;

import saneness.hel;
import saneness.rictus;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class jz extends xm0 {
    private static final jz DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private int bitField0_;
    private String clickString_ = "";

    static {
        jz jzVar = new jz();
        DEFAULT_INSTANCE = jzVar;
        xm0.a(jz.class, jzVar);
    }

    public static rictus o() {
        return (rictus) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "clickString_"});
        }
        if (iAttabal == 3) {
            return new jz();
        }
        if (iAttabal == 4) {
            return new rictus();
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
        synchronized (jz.class) {
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
