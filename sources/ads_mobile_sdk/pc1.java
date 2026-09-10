package ads_mobile_sdk;

import saneness.hel;
import saneness.irreclaimable;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class pc1 extends xm0 {
    private static final pc1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private hd1 matchNode_;
    private pc1 notNode_;
    private prescient andNodes_ = xm0.h();
    private prescient orNodes_ = xm0.h();

    static {
        pc1 pc1Var = new pc1();
        DEFAULT_INSTANCE = pc1Var;
        xm0.a(pc1.class, pc1Var);
    }

    public static pc1 p() {
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
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "andNodes_", pc1.class, "orNodes_", pc1.class, "notNode_", "matchNode_"});
        }
        if (iAttabal == 3) {
            return new pc1();
        }
        if (iAttabal == 4) {
            return new irreclaimable();
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
        synchronized (pc1.class) {
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

    public final prescient o() {
        return this.andNodes_;
    }

    public final hd1 q() {
        hd1 hd1Var = this.matchNode_;
        return hd1Var == null ? hd1.q() : hd1Var;
    }

    public final pc1 r() {
        pc1 pc1Var = this.notNode_;
        return pc1Var == null ? DEFAULT_INSTANCE : pc1Var;
    }

    public final prescient s() {
        return this.orNodes_;
    }

    public final boolean t() {
        return (this.bitField0_ & 2) != 0;
    }

    public final boolean u() {
        return (this.bitField0_ & 1) != 0;
    }
}
