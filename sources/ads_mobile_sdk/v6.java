package ads_mobile_sdk;

import java.util.List;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;
import saneness.yorkshire;

/* JADX INFO: loaded from: classes.dex */
public final class v6 extends xm0 {
    private static final v6 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private prescient includingRegexes_ = xm0.h();
    private prescient excludingRegexes_ = xm0.h();
    private String effectiveAdUnitId_ = "";

    static {
        v6 v6Var = new v6();
        DEFAULT_INSTANCE = v6Var;
        xm0.a(v6.class, v6Var);
    }

    public static yorkshire r() {
        return (yorkshire) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001Ț\u0002Ț\u0003ለ\u0000", new Object[]{"bitField0_", "includingRegexes_", "excludingRegexes_", "effectiveAdUnitId_"});
        }
        if (iAttabal == 3) {
            return new v6();
        }
        if (iAttabal == 4) {
            return new yorkshire();
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
        synchronized (v6.class) {
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

    public final String o() {
        return this.effectiveAdUnitId_;
    }

    public final List p() {
        return this.excludingRegexes_;
    }

    public final List q() {
        return this.includingRegexes_;
    }
}
