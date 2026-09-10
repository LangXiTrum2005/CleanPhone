package ads_mobile_sdk;

import saneness.hel;
import saneness.sevenfold;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class h03 extends xm0 {
    private static final h03 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private long modelVersion_;
    private long taxonomyVersion_;
    private int topicId_;

    static {
        h03 h03Var = new h03();
        DEFAULT_INSTANCE = h03Var;
        xm0.a(h03.class, h03Var);
    }

    public static sevenfold o() {
        return (sevenfold) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"topicId_", "modelVersion_", "taxonomyVersion_"});
        }
        if (iAttabal == 3) {
            return new h03();
        }
        if (iAttabal == 4) {
            return new sevenfold();
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
        synchronized (h03.class) {
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
