package ads_mobile_sdk;

import saneness.hel;
import saneness.prescient;
import saneness.tdb;
import saneness.twas;

/* JADX INFO: loaded from: classes.dex */
public final class nb extends xm0 {
    private static final nb DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private prescient encryptedBlobs_ = xm0.h();
    private kn hash_ = kn.b;
    private int protoName_ = 1;
    private int encryptionMethod_ = 1;

    static {
        nb nbVar = new nb();
        DEFAULT_INSTANCE = nbVar;
        xm0.a(nb.class, nbVar);
    }

    public static twas o() {
        return (twas) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"bitField0_", "encryptedBlobs_", "hash_", "protoName_", gb.a, "encryptionMethod_", ab.a});
        }
        if (iAttabal == 3) {
            return new nb();
        }
        if (iAttabal == 4) {
            return new twas();
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
        synchronized (nb.class) {
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
