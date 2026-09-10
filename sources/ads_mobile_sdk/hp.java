package ads_mobile_sdk;

import saneness.hel;
import saneness.http;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class hp extends xm0 {
    private static final hp DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    private int bitField0_;
    private int compression_;
    private int downloadPriority_;
    private gp fallbackInstruction_;
    private boolean meteredAllowed_;
    private np postProcess_;
    private boolean roamingAllowed_;
    private int type_;
    private String name_ = "";
    private String id_ = "";
    private int state_ = 1;
    private String downloadPath_ = "";
    private String fallbackDownloadPath_ = "";

    static {
        hp hpVar = new hp();
        DEFAULT_INSTANCE = hpVar;
        xm0.a(hp.class, hpVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\t᠌\b\nဉ\t\u000bဈ\n\fဉ\u000b", new Object[]{"bitField0_", "name_", "id_", "type_", sp.a, "state_", qp.a, "meteredAllowed_", "downloadPath_", "roamingAllowed_", "downloadPriority_", "compression_", ip.a, "postProcess_", "fallbackDownloadPath_", "fallbackInstruction_"});
        }
        if (iAttabal == 3) {
            return new hp();
        }
        if (iAttabal == 4) {
            return new http();
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
        synchronized (hp.class) {
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
