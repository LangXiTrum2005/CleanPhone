package ads_mobile_sdk;

import saneness.hel;
import saneness.obelia;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class yy1 extends xm0 {
    private static final yy1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private kn encryptedProgram_ = kn.b;
    private az1 metadata_;

    static {
        yy1 yy1Var = new yy1();
        DEFAULT_INSTANCE = yy1Var;
        xm0.a(yy1.class, yy1Var);
    }

    public static yy1 o() {
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
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"bitField0_", "metadata_", "encryptedProgram_"});
        }
        if (iAttabal == 3) {
            return new yy1();
        }
        if (iAttabal == 4) {
            return new obelia();
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
        synchronized (yy1.class) {
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

    public final kn p() {
        return this.encryptedProgram_;
    }

    public final az1 q() {
        az1 az1Var = this.metadata_;
        return az1Var == null ? az1.o() : az1Var;
    }

    public final boolean r() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean s() {
        return (this.bitField0_ & 1) != 0;
    }
}
