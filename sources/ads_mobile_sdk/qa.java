package ads_mobile_sdk;

import saneness.dispatchbox;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class qa extends xm0 {
    private static final qa DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private int bitField0_;
    private long percentAdOnScreen_ = -1;
    private long percentScreenCoveredByAd_ = -1;
    private long minAlphaSignal_ = -1;
    private long viewHeight_ = -1;
    private long viewWidth_ = -1;
    private long displayDensity_ = -1;
    private long estimatedOccludedSurface_ = -1;
    private long scaleFactor_ = -1;

    static {
        qa qaVar = new qa();
        DEFAULT_INSTANCE = qaVar;
        xm0.a(qa.class, qaVar);
    }

    public static dispatchbox o() {
        return (dispatchbox) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"bitField0_", "percentAdOnScreen_", "percentScreenCoveredByAd_", "minAlphaSignal_", "viewHeight_", "viewWidth_", "displayDensity_", "estimatedOccludedSurface_", "scaleFactor_"});
        }
        if (iAttabal == 3) {
            return new qa();
        }
        if (iAttabal == 4) {
            return new dispatchbox();
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
        synchronized (qa.class) {
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
