package ads_mobile_sdk;

import saneness.gibeonite;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class q5 extends xm0 {
    private static final q5 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int hostType_;
    private int osType_;
    private kn vmVersion_ = kn.b;
    private String model_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";

    static {
        q5 q5Var = new q5();
        DEFAULT_INSTANCE = q5Var;
        xm0.a(q5.class, q5Var);
    }

    public static gibeonite o() {
        return (gibeonite) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"bitField0_", "vmVersion_", "apiLevel_", "model_", "appId_", "appVersionCode_", "hostVersion_", "osType_", "hostType_"});
        }
        if (iAttabal == 3) {
            return new q5();
        }
        if (iAttabal == 4) {
            return new gibeonite();
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
        synchronized (q5.class) {
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
