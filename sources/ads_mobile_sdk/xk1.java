package ads_mobile_sdk;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import saneness.detour;
import saneness.hel;
import saneness.strokes;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class xk1 extends xm0 {
    private static final xk1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private cd1 adUnitToUseMediaView_ = cd1.a();
    private long appVersionCode_;

    static {
        xk1 xk1Var = new xk1();
        DEFAULT_INSTANCE = xk1Var;
        xm0.a(xk1.class, xk1Var);
    }

    public static xk1 q() {
        return DEFAULT_INSTANCE;
    }

    public static strokes r() {
        return (strokes) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002\u00022", new Object[]{"appVersionCode_", "adUnitToUseMediaView_", detour.f37122attabal});
        }
        if (iAttabal == 3) {
            return new xk1();
        }
        if (iAttabal == 4) {
            return new strokes();
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
        synchronized (xk1.class) {
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
        return Collections.unmodifiableMap(this.adUnitToUseMediaView_);
    }

    public final long p() {
        return this.appVersionCode_;
    }

    public static xk1 a(InputStream inputStream) {
        return (xk1) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
