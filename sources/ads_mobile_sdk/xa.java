package ads_mobile_sdk;

import saneness.coshery;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class xa extends xm0 {
    private static final xa DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private kn data_;
    private kn hash_;
    private kn osVersion_;
    private kn timestamp_;

    static {
        xa xaVar = new xa();
        DEFAULT_INSTANCE = xaVar;
        xm0.a(xa.class, xaVar);
    }

    public xa() {
        in inVar = kn.b;
        this.data_ = inVar;
        this.hash_ = inVar;
        this.timestamp_ = inVar;
        this.osVersion_ = inVar;
    }

    public static coshery s() {
        return (coshery) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"bitField0_", "data_", "hash_", "timestamp_", "osVersion_"});
        }
        if (iAttabal == 3) {
            return new xa();
        }
        if (iAttabal == 4) {
            return new coshery();
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
        synchronized (xa.class) {
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

    public final kn o() {
        return this.data_;
    }

    public final kn p() {
        return this.hash_;
    }

    public final kn q() {
        return this.osVersion_;
    }

    public final kn r() {
        return this.timestamp_;
    }

    public static xa a(byte[] bArr, vf0 vf0Var) {
        return (xa) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0Var));
    }
}
