package ads_mobile_sdk;

import saneness.apologetic;
import saneness.artsy;
import saneness.cyrtometer;
import saneness.ghoulish;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class gt extends xm0 {
    private static final gt DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    private static final artsy allowedApis_converter_ = new ghoulish();
    public static final int c = 1;
    private int allowedApisMemoizedSerializedSize;
    private cyrtometer allowedApis_ = xm0.f();

    static {
        gt gtVar = new gt();
        DEFAULT_INSTANCE = gtVar;
        xm0.a(gt.class, gtVar);
    }

    public static gt r() {
        return DEFAULT_INSTANCE;
    }

    public static apologetic s() {
        return (apologetic) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001,", new Object[]{"allowedApis_"});
        }
        if (iAttabal == 3) {
            return new gt();
        }
        if (iAttabal == 4) {
            return new apologetic();
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
        synchronized (gt.class) {
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

    public final int o() {
        return ((j21) this.allowedApis_).size();
    }

    public final o21 p() {
        return new o21(this.allowedApis_, allowedApis_converter_);
    }

    public final cyrtometer q() {
        return this.allowedApis_;
    }

    public static gt a(byte[] bArr) {
        return (gt) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0.a()));
    }
}
