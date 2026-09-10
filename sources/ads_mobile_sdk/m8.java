package ads_mobile_sdk;

import java.util.Collections;
import java.util.Map;
import saneness.buttstock;
import saneness.cosurveillance;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class m8 extends xm0 {
    private static final m8 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private cd1 extras_ = cd1.a();
    private String format_ = "";

    static {
        m8 m8Var = new m8();
        DEFAULT_INSTANCE = m8Var;
        xm0.a(m8.class, m8Var);
    }

    public static cosurveillance q() {
        return (cosurveillance) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ለ\u0000\u00022", new Object[]{"bitField0_", "format_", "extras_", buttstock.f37083attabal});
        }
        if (iAttabal == 3) {
            return new m8();
        }
        if (iAttabal == 4) {
            return new cosurveillance();
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
        synchronized (m8.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.extras_);
    }

    public final String p() {
        return this.format_;
    }
}
