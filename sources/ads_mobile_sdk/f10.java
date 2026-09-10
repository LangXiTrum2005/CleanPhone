package ads_mobile_sdk;

import saneness.hel;
import saneness.sulfarsenide;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class f10 extends xm0 {
    private static final f10 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private boolean appVerificationEnabled_;
    private int bitField0_;
    private long googlePlayServicesVersion_;
    private boolean isAsyncCheck_;
    private boolean isInstantApps_;
    private int urlApiType_;
    private String clientVersion_ = "";
    private String clientName_ = "";
    private String updateApiListVersion_ = "";

    static {
        f10 f10Var = new f10();
        DEFAULT_INSTANCE = f10Var;
        xm0.a(f10.class, f10Var);
    }

    public static sulfarsenide o() {
        return (sulfarsenide) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"bitField0_", "clientVersion_", "googlePlayServicesVersion_", "isInstantApps_", "urlApiType_", g10.a, "clientName_", "updateApiListVersion_", "isAsyncCheck_", "appVerificationEnabled_"});
        }
        if (iAttabal == 3) {
            return new f10();
        }
        if (iAttabal == 4) {
            return new sulfarsenide();
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
        synchronized (f10.class) {
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
