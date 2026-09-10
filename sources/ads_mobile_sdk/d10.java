package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.hel;
import saneness.libyan;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class d10 extends xm0 {
    private static final d10 DEFAULT_INSTANCE;
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
    private int adResourceType_;
    private int bitField0_;
    private int id_;
    private int parentId_;
    private zz request_;
    private d00 response_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private cyrtometer childIds_ = xm0.f();
    private String tagName_ = "";
    private prescient matchedBlacklist_ = xm0.h();

    static {
        d10 d10Var = new d10();
        DEFAULT_INSTANCE = d10Var;
        xm0.a(d10.class, d10Var);
    }

    public static libyan o() {
        return (libyan) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        switch (tdb.attabal(i2)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (xm0Var == null ? 0 : 1);
                return null;
            case 2:
                return new mc2(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"bitField0_", "id_", "url_", "request_", "response_", "parentId_", "childIds_", "tagName_", "adResourceType_", a10.a, "matchedBlacklist_"});
            case 3:
                return new d10();
            case 4:
                return new libyan();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hel helVar = PARSER;
                if (helVar != null) {
                    return helVar;
                }
                synchronized (d10.class) {
                    try {
                        wm0Var = PARSER;
                        if (wm0Var == null) {
                            wm0Var = new wm0(DEFAULT_INSTANCE);
                            PARSER = wm0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wm0Var;
            default:
                throw null;
        }
    }
}
