package ads_mobile_sdk;

import java.io.InputStream;
import saneness.dibatag;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class on2 extends xm0 {
    private static final on2 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    private int bitField0_;
    private boolean isInstallReferrerReported_;

    static {
        on2 on2Var = new on2();
        DEFAULT_INSTANCE = on2Var;
        xm0.a(on2.class, on2Var);
    }

    public static on2 o() {
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
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "isInstallReferrerReported_"});
        }
        if (iAttabal == 3) {
            return new on2();
        }
        if (iAttabal == 4) {
            return new dibatag();
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
        synchronized (on2.class) {
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

    public final boolean p() {
        return this.isInstallReferrerReported_;
    }

    public static on2 a(InputStream inputStream) {
        return (on2) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
