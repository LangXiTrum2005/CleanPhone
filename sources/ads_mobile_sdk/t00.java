package ads_mobile_sdk;

import saneness.hel;
import saneness.iaido;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class t00 extends xm0 {
    private static final t00 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long firstInteractionTimestampMsec_;
    private long lastInteractionTimestampMsec_;
    private int occurrenceCount_;
    private int phishySiteInteractionType_;

    static {
        t00 t00Var = new t00();
        DEFAULT_INSTANCE = t00Var;
        xm0.a(t00.class, t00Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "phishySiteInteractionType_", r00.a, "occurrenceCount_", "firstInteractionTimestampMsec_", "lastInteractionTimestampMsec_"});
        }
        if (iAttabal == 3) {
            return new t00();
        }
        if (iAttabal == 4) {
            return new iaido();
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
        synchronized (t00.class) {
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
