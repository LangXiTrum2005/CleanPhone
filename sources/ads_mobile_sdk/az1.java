package ads_mobile_sdk;

import saneness.hel;
import saneness.introspectively;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class az1 extends xm0 {
    private static final az1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private long expirationTimestampMs_;
    private long generationTimestampMs_;
    private kn signature_ = kn.b;
    private v63 vmId_;

    static {
        az1 az1Var = new az1();
        DEFAULT_INSTANCE = az1Var;
        xm0.a(az1.class, az1Var);
    }

    public static az1 o() {
        return DEFAULT_INSTANCE;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "vmId_", "signature_", "generationTimestampMs_", "expirationTimestampMs_"});
        }
        if (iAttabal == 3) {
            return new az1();
        }
        if (iAttabal == 4) {
            return new introspectively();
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
        synchronized (az1.class) {
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

    public final long p() {
        return this.expirationTimestampMs_;
    }

    public final kn q() {
        return this.signature_;
    }

    public final v63 r() {
        v63 v63Var = this.vmId_;
        return v63Var == null ? v63.o() : v63Var;
    }
}
