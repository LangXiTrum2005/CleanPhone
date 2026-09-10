package ads_mobile_sdk;

import java.util.Collections;
import java.util.Map;
import saneness.anthomaniac;
import saneness.begone;
import saneness.hel;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class l32 extends xm0 {
    private static final l32 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    private int bitField0_;
    private cd1 includeSignals_ = cd1.a();
    private pc1 pattern_;

    static {
        l32 l32Var = new l32();
        DEFAULT_INSTANCE = l32Var;
        xm0.a(l32.class, l32Var);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"bitField0_", "pattern_", "includeSignals_", anthomaniac.f37055attabal});
        }
        if (iAttabal == 3) {
            return new l32();
        }
        if (iAttabal == 4) {
            return new begone();
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
        synchronized (l32.class) {
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

    public final Map o() {
        return Collections.unmodifiableMap(this.includeSignals_);
    }

    public final pc1 p() {
        pc1 pc1Var = this.pattern_;
        return pc1Var == null ? pc1.p() : pc1Var;
    }

    public final boolean q() {
        return (this.bitField0_ & 1) != 0;
    }
}
