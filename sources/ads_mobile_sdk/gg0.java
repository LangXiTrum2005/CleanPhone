package ads_mobile_sdk;

import saneness.hel;
import saneness.slumberous;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class gg0 extends xm0 {
    private static final gg0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int bitField0_;
    private kn bytecode_;
    private i72 metadata_;
    private int status_;
    private kn vm_;

    static {
        gg0 gg0Var = new gg0();
        DEFAULT_INSTANCE = gg0Var;
        xm0.a(gg0.class, gg0Var);
    }

    public gg0() {
        in inVar = kn.b;
        this.bytecode_ = inVar;
        this.vm_ = inVar;
    }

    public static slumberous s() {
        return (slumberous) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "metadata_", "bytecode_", "vm_", "status_", kv2.a});
        }
        if (iAttabal == 3) {
            return new gg0();
        }
        if (iAttabal == 4) {
            return new slumberous();
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
        synchronized (gg0.class) {
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
        return this.bytecode_;
    }

    public final i72 p() {
        i72 i72Var = this.metadata_;
        return i72Var == null ? i72.q() : i72Var;
    }

    public final mv2 q() {
        mv2 mv2VarA = mv2.a(this.status_);
        return mv2VarA == null ? mv2.STATUS_UNKNOWN : mv2VarA;
    }

    public final kn r() {
        return this.vm_;
    }
}
