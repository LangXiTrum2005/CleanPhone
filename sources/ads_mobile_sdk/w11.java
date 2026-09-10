package ads_mobile_sdk;

import saneness.hel;
import saneness.hypohepatia;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class w11 extends xm0 {
    private static final w11 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private boolean googlePlayInstant_;
    private long installBeginTimestampSeconds_;
    private long installBeginTimestampServerSeconds_;
    private int installReferrerErrorCode_;
    private String installReferrer_ = "";
    private String installVersion_ = "";
    private long referrerClickTimestampSeconds_;
    private long referrerClickTimestampServerSeconds_;

    static {
        w11 w11Var = new w11();
        DEFAULT_INSTANCE = w11Var;
        xm0.a(w11.class, w11Var);
    }

    public static hypohepatia o() {
        return (hypohepatia) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0002\u0004\u0007\u0005\u0002\u0006\u0002\u0007Ȉ\b\f", new Object[]{"installReferrer_", "referrerClickTimestampSeconds_", "installBeginTimestampSeconds_", "googlePlayInstant_", "referrerClickTimestampServerSeconds_", "installBeginTimestampServerSeconds_", "installVersion_", "installReferrerErrorCode_"});
        }
        if (iAttabal == 3) {
            return new w11();
        }
        if (iAttabal == 4) {
            return new hypohepatia();
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
        synchronized (w11.class) {
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
