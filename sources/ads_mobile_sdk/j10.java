package ads_mobile_sdk;

import saneness.acoelomate;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class j10 extends xm0 {
    private static final j10 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private String scopeUrl_ = "";
    private prescient requestedUrls_ = xm0.h();
    private prescient importScriptUrls_ = xm0.h();
    private String scriptUrl_ = "";

    static {
        j10 j10Var = new j10();
        DEFAULT_INSTANCE = j10Var;
        xm0.a(j10.class, j10Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001", new Object[]{"bitField0_", "scopeUrl_", "requestedUrls_", "importScriptUrls_", "scriptUrl_"});
        }
        if (iAttabal == 3) {
            return new j10();
        }
        if (iAttabal == 4) {
            return new acoelomate();
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
        synchronized (j10.class) {
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
