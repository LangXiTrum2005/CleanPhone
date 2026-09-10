package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.hel;
import saneness.regius;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class i72 extends xm0 {
    private static final i72 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    private int architecture_;
    private int bitField0_;
    private Object metadata_;
    private int metadataCase_ = 0;
    private int activeExperimentIdsMemoizedSerializedSize = -1;
    private cyrtometer activeExperimentIds_ = xm0.f();

    static {
        i72 i72Var = new i72();
        DEFAULT_INSTANCE = i72Var;
        xm0.a(i72.class, i72Var);
    }

    public static i72 q() {
        return DEFAULT_INSTANCE;
    }

    public static regius t() {
        return (regius) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000\u0004'", new Object[]{"metadata_", "metadataCase_", "bitField0_", j72.class, az1.class, "architecture_", ch.a, "activeExperimentIds_"});
        }
        if (iAttabal == 3) {
            return new i72();
        }
        if (iAttabal == 4) {
            return new regius();
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
        synchronized (i72.class) {
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

    public final dh p() {
        dh dhVarA = dh.a(this.architecture_);
        return dhVarA == null ? dh.UNSUPPORTED : dhVarA;
    }

    public final j72 r() {
        return this.metadataCase_ == 1 ? (j72) this.metadata_ : j72.p();
    }

    public final az1 s() {
        return this.metadataCase_ == 2 ? (az1) this.metadata_ : az1.o();
    }

    public static i72 a(in inVar) {
        i72 i72Var = DEFAULT_INSTANCE;
        vf0 vf0VarA = vf0.a();
        hr hrVarE = inVar.e();
        xm0 xm0VarA = xm0.a(i72Var, hrVarE, vf0VarA);
        hrVarE.a(0);
        return (i72) xm0.a(xm0.a(xm0VarA));
    }
}
