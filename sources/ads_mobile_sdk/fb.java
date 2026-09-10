package ads_mobile_sdk;

import saneness.hel;
import saneness.montera;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class fb extends xm0 {
    private static final fb DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private String adshieldVersion_ = "";
    private String afmaVersion_ = "";
    private String appIdSignal_ = "D";
    private int bitField0_;
    private long evtTime_;
    private long uptSignal_;
    private long vcdSignal_;

    static {
        fb fbVar = new fb();
        DEFAULT_INSTANCE = fbVar;
        xm0.a(fb.class, fbVar);
    }

    public static montera o() {
        return (montera) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"bitField0_", "adshieldVersion_", "afmaVersion_", "evtTime_", "appIdSignal_", "vcdSignal_", "uptSignal_"});
        }
        if (iAttabal == 3) {
            return new fb();
        }
        if (iAttabal == 4) {
            return new montera();
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
        synchronized (fb.class) {
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
