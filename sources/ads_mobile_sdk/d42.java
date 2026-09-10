package ads_mobile_sdk;

import saneness.hel;
import saneness.prefect;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class d42 extends xm0 {
    private static final d42 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private boolean cacheHit_;
    private int maxBufferSize_;
    private int numPreloadedAds_;
    private boolean preloadInFlight_;
    private String preloadId_ = "";
    private String evictedAdId_ = "";

    static {
        d42 d42Var = new d42();
        DEFAULT_INSTANCE = d42Var;
        xm0.a(d42.class, d42Var);
    }

    public static prefect o() {
        return (prefect) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"preloadId_", "maxBufferSize_", "numPreloadedAds_", "cacheHit_", "evictedAdId_", "preloadInFlight_"});
        }
        if (iAttabal == 3) {
            return new d42();
        }
        if (iAttabal == 4) {
            return new prefect();
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
        synchronized (d42.class) {
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
