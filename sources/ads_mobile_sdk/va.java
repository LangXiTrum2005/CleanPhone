package ads_mobile_sdk;

import saneness.bigamies;
import saneness.dessertspoon;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class va extends xm0 {
    private static final va DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int labelsMemoizedSerializedSize = -1;
    private int reasonsMemoizedSerializedSize = -1;
    private dessertspoon labels_ = xm0.g();
    private dessertspoon reasons_ = xm0.g();

    static {
        va vaVar = new va();
        DEFAULT_INSTANCE = vaVar;
        xm0.a(va.class, vaVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"labels_", "reasons_"});
        }
        if (iAttabal == 3) {
            return new va();
        }
        if (iAttabal == 4) {
            return new bigamies();
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
        synchronized (va.class) {
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
