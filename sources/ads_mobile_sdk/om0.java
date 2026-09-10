package ads_mobile_sdk;

import saneness.hel;
import saneness.manyplies;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class om0 extends xm0 {
    private static final om0 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int bitField0_;
    private kn bytecode_;
    private j72 metadata_;
    private kn vm_;

    static {
        om0 om0Var = new om0();
        DEFAULT_INSTANCE = om0Var;
        xm0.a(om0.class, om0Var);
    }

    public om0() {
        in inVar = kn.b;
        this.vm_ = inVar;
        this.bytecode_ = inVar;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"bitField0_", "metadata_", "vm_", "bytecode_"});
        }
        if (iAttabal == 3) {
            return new om0();
        }
        if (iAttabal == 4) {
            return new manyplies();
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
        synchronized (om0.class) {
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

    public final j72 p() {
        j72 j72Var = this.metadata_;
        return j72Var == null ? j72.p() : j72Var;
    }

    public final kn q() {
        return this.vm_;
    }

    public static om0 a(byte[] bArr, vf0 vf0Var) {
        return (om0) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0Var));
    }
}
