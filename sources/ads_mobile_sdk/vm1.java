package ads_mobile_sdk;

import saneness.hel;
import saneness.incuse;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class vm1 extends xm0 {
    private static final vm1 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private int sccgDir_;
    private boolean sccgTap_;

    static {
        vm1 vm1Var = new vm1();
        DEFAULT_INSTANCE = vm1Var;
        xm0.a(vm1.class, vm1Var);
    }

    public static incuse o() {
        return (incuse) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"bitField0_", "sccgDir_", "sccgTap_"});
        }
        if (iAttabal == 3) {
            return new vm1();
        }
        if (iAttabal == 4) {
            return new incuse();
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
        synchronized (vm1.class) {
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
