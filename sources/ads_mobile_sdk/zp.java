package ads_mobile_sdk;

import saneness.gurgoyle;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class zp extends xm0 {
    private static final zp DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private int densityDpi_;
    private int heightPixels_;
    private prescient supportedAbi_ = xm0.h();
    private int widthPixels_;

    static {
        zp zpVar = new zp();
        DEFAULT_INSTANCE = zpVar;
        xm0.a(zp.class, zpVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004\u001a", new Object[]{"bitField0_", "densityDpi_", "widthPixels_", "heightPixels_", "supportedAbi_"});
        }
        if (iAttabal == 3) {
            return new zp();
        }
        if (iAttabal == 4) {
            return new gurgoyle();
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
        synchronized (zp.class) {
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
