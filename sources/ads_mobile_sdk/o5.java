package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.hel;
import saneness.prescient;
import saneness.tdb;
import saneness.tower;

/* JADX INFO: loaded from: classes.dex */
public final class o5 extends xm0 {
    private static final o5 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 8;
    public static final int d = 21;
    public static final int e = 22;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 25;
    public static final int i = 40;
    public static final int j = 41;
    public static final int k = 60;
    public static final int l = 61;
    public static final int m = 62;
    public static final int n = 63;
    public static final int o = 64;
    private long apiLevel_;
    private long appVersionCode_;
    private int bitField0_;
    private int deviceType_;
    private long requestedAdshieldVersion_;
    private long samplingDenominator_;
    private int experimentIdsMemoizedSerializedSize = -1;
    private prescient logEvents_ = xm0.h();
    private String model_ = "";
    private String locale_ = "";
    private String country_ = "";
    private String appId_ = "";
    private String hostVersion_ = "";
    private String adshieldVersion_ = "";
    private cyrtometer experimentIds_ = xm0.f();

    static {
        o5 o5Var = new o5();
        DEFAULT_INSTANCE = o5Var;
        xm0.a(o5.class, o5Var);
    }

    public static tower o() {
        return (tower) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\r\u0000\u0001\b@\r\u0000\u0002\u0000\b\u001b\u0015ဂ\u0000\u0016ဈ\u0001\u0017ဈ\u0002\u0018ဈ\u0003\u0019᠌\u0004(ဈ\u0005)ဂ\u0006<ဈ\u0007=ဈ\b>ဂ\t?ဂ\n@'", new Object[]{"bitField0_", "logEvents_", zb1.class, "apiLevel_", "model_", "locale_", "country_", "deviceType_", uc0.a, "appId_", "appVersionCode_", "hostVersion_", "adshieldVersion_", "samplingDenominator_", "requestedAdshieldVersion_", "experimentIds_"});
        }
        if (iAttabal == 3) {
            return new o5();
        }
        if (iAttabal == 4) {
            return new tower();
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
        synchronized (o5.class) {
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
