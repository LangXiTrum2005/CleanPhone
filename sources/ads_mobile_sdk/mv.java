package ads_mobile_sdk;

import java.util.Collections;
import java.util.Map;
import saneness.hel;
import saneness.nurserymaid;
import saneness.tdb;
import saneness.uniterm;

/* JADX INFO: loaded from: classes.dex */
public final class mv extends xm0 {
    private static final mv DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    private int bitField0_;
    private gt consentAllowlist_;
    private b12 patternMatchingFlag_;
    private n32 preProcessingFlag_;
    private cd1 concatenatedSignalsMap_ = cd1.a();
    private String consentStringJson_ = "";
    private String consentStateJson_ = "";

    static {
        mv mvVar = new mv();
        DEFAULT_INSTANCE = mvVar;
        xm0.a(mv.class, mvVar);
    }

    public static mv s() {
        return DEFAULT_INSTANCE;
    }

    public static uniterm v() {
        return (uniterm) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0001\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u00052\u0006ဉ\u0004", new Object[]{"bitField0_", "consentStringJson_", "consentStateJson_", "patternMatchingFlag_", "preProcessingFlag_", "concatenatedSignalsMap_", nurserymaid.f37230attabal, "consentAllowlist_"});
        }
        if (iAttabal == 3) {
            return new mv();
        }
        if (iAttabal == 4) {
            return new uniterm();
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
        synchronized (mv.class) {
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
        return Collections.unmodifiableMap(this.concatenatedSignalsMap_);
    }

    public final gt p() {
        gt gtVar = this.consentAllowlist_;
        return gtVar == null ? gt.r() : gtVar;
    }

    public final String q() {
        return this.consentStateJson_;
    }

    public final String r() {
        return this.consentStringJson_;
    }

    public final b12 t() {
        b12 b12Var = this.patternMatchingFlag_;
        return b12Var == null ? b12.o() : b12Var;
    }

    public final n32 u() {
        n32 n32Var = this.preProcessingFlag_;
        return n32Var == null ? n32.o() : n32Var;
    }
}
