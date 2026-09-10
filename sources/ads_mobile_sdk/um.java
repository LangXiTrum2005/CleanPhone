package ads_mobile_sdk;

import saneness.artsy;
import saneness.cyrtometer;
import saneness.hel;
import saneness.methylmercury;
import saneness.tdb;
import saneness.zohar;

/* JADX INFO: loaded from: classes.dex */
public final class um extends xm0 {
    private static final um DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 5;
    public static final int d = 4;
    private static final artsy dEPRECATEDAdapterBehavior_converter_ = new zohar();
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    private int adapterBehaviorBitmap_;
    private tm adapterVersion_;
    private int bitField0_;
    private int dEPRECATEDAdapterBehaviorMemoizedSerializedSize;
    private rm error_;
    private boolean isPublisherCreated_;
    private long latencyMs_;
    private tm sdkVersion_;
    private String adapterClassName_ = "";
    private String buyerGeneratedRequestData_ = "";
    private cyrtometer dEPRECATEDAdapterBehavior_ = xm0.f();

    static {
        um umVar = new um();
        DEFAULT_INSTANCE = umVar;
        xm0.a(um.class, umVar);
    }

    public static methylmercury o() {
        return (methylmercury) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0002\n\t\u0000\u0001\u0000\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဈ\u0001\u0005ဈ\u0000\u0006ဇ\u0004\u0007ဉ\u0005\bဂ\u0006\tࠬ\nဋ\u0007", new Object[]{"bitField0_", "sdkVersion_", "adapterVersion_", "buyerGeneratedRequestData_", "adapterClassName_", "isPublisherCreated_", "error_", "latencyMs_", "dEPRECATEDAdapterBehavior_", nm.a, "adapterBehaviorBitmap_"});
        }
        if (iAttabal == 3) {
            return new um();
        }
        if (iAttabal == 4) {
            return new methylmercury();
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
        synchronized (um.class) {
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
