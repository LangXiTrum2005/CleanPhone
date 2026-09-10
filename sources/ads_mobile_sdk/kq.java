package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.hel;
import saneness.supersedeas;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class kq extends xm0 {
    private static final kq DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private int binaryName_;
    private int selectedExperimentIdsMemoizedSerializedSize = -1;
    private String versionNumber_ = "";
    private cyrtometer selectedExperimentIds_ = xm0.f();

    static {
        kq kqVar = new kq();
        DEFAULT_INSTANCE = kqVar;
        xm0.a(kq.class, kqVar);
    }

    public static supersedeas o() {
        return (supersedeas) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003'", new Object[]{"binaryName_", "versionNumber_", "selectedExperimentIds_"});
        }
        if (iAttabal == 3) {
            return new kq();
        }
        if (iAttabal == 4) {
            return new supersedeas();
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
        synchronized (kq.class) {
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
