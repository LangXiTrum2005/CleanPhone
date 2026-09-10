package ads_mobile_sdk;

import java.io.InputStream;
import saneness.hel;
import saneness.notornis;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class fl2 extends xm0 {
    private static final fl2 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private String cachedSdkCore_ = "";
    private long lastUpdateTimeMs_;

    static {
        fl2 fl2Var = new fl2();
        DEFAULT_INSTANCE = fl2Var;
        xm0.a(fl2.class, fl2Var);
    }

    public static fl2 p() {
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
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "cachedSdkCore_", "lastUpdateTimeMs_"});
        }
        if (iAttabal == 3) {
            return new fl2();
        }
        if (iAttabal == 4) {
            return new notornis();
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
        synchronized (fl2.class) {
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
        return this.cachedSdkCore_;
    }

    public final long q() {
        return this.lastUpdateTimeMs_;
    }

    public static fl2 a(InputStream inputStream) {
        return (fl2) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
