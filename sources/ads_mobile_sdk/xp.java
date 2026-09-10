package ads_mobile_sdk;

import saneness.hel;
import saneness.prescient;
import saneness.sherry;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class xp extends xm0 {
    private static final xp DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 5;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 8;
    public static final int h = 4;
    public static final int i = 10;
    public static final int j = 9;
    private int bitField0_;
    private z63 compatInfo_;
    private String appName_ = "";
    private String version_ = "";
    private prescient blob_ = xm0.h();
    private prescient blobSet_ = xm0.h();
    private prescient pluginSets_ = xm0.h();
    private int velourSdkInt_ = -1;
    private String debugOnlyVersion_ = "";

    static {
        xp xpVar = new xp();
        DEFAULT_INSTANCE = xpVar;
        xm0.a(xp.class, xpVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"bitField0_", "version_", "blob_", hp.class, "blobSet_", pp.class, "velourSdkInt_", "appName_", "pluginSets_", fq.class, "debugOnlyVersion_", "compatInfo_"});
        }
        if (iAttabal == 3) {
            return new xp();
        }
        if (iAttabal == 4) {
            return new sherry();
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
        synchronized (xp.class) {
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
