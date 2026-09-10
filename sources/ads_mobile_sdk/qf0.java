package ads_mobile_sdk;

import saneness.anadyr;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class qf0 extends xm0 {
    private static final qf0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 4;
    public static final int e = 2;
    public static final int f = 3;
    private int bitField0_;
    private boolean usersMatch_;
    private kn clearBlob_ = kn.b;
    private String clearBlobJs_ = "";
    private prescient encryptedBlob_ = xm0.h();

    static {
        qf0 qf0Var = new qf0();
        DEFAULT_INSTANCE = qf0Var;
        xm0.a(qf0.class, qf0Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002\u0004ဈ\u0001", new Object[]{"bitField0_", "clearBlob_", "encryptedBlob_", "usersMatch_", "clearBlobJs_"});
        }
        if (iAttabal == 3) {
            return new qf0();
        }
        if (iAttabal == 4) {
            return new anadyr();
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
        synchronized (qf0.class) {
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
