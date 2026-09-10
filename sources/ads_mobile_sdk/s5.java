package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.hel;
import saneness.substaintial;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class s5 extends xm0 {
    private static final s5 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private cyrtometer activeExperimentIds_ = xm0.f();
    private int bitField0_;
    private yy1 program_;

    static {
        s5 s5Var = new s5();
        DEFAULT_INSTANCE = s5Var;
        xm0.a(s5.class, s5Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002'", new Object[]{"bitField0_", "program_", "activeExperimentIds_"});
        }
        if (iAttabal == 3) {
            return new s5();
        }
        if (iAttabal == 4) {
            return new substaintial();
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
        synchronized (s5.class) {
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

    public final cyrtometer o() {
        return this.activeExperimentIds_;
    }

    public final yy1 p() {
        yy1 yy1Var = this.program_;
        return yy1Var == null ? yy1.o() : yy1Var;
    }

    public static s5 a(byte[] bArr, vf0 vf0Var) {
        return (s5) xm0.a(xm0.a(DEFAULT_INSTANCE, bArr, bArr.length, vf0Var));
    }
}
