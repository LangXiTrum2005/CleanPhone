package ads_mobile_sdk;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import saneness.hel;
import saneness.sayid;
import saneness.tdb;
import saneness.yemenite;

/* JADX INFO: loaded from: classes.dex */
public final class cc extends xm0 {
    private static final cc DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private cd1 logs_ = cd1.a();

    static {
        cc ccVar = new cc();
        DEFAULT_INSTANCE = ccVar;
        xm0.a(cc.class, ccVar);
    }

    public static cc o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"logs_", sayid.f37306attabal});
        }
        if (iAttabal == 3) {
            return new cc();
        }
        if (iAttabal == 4) {
            return new yemenite();
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
        synchronized (cc.class) {
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

    public final Map p() {
        return Collections.unmodifiableMap(this.logs_);
    }

    public final cd1 q() {
        cd1 cd1Var = this.logs_;
        if (!cd1Var.a) {
            this.logs_ = cd1Var.b();
        }
        return this.logs_;
    }

    public static cc a(InputStream inputStream) {
        return (cc) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
