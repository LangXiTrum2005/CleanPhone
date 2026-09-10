package ads_mobile_sdk;

import java.util.Collections;
import java.util.Map;
import saneness.hel;
import saneness.organist;
import saneness.prescient;
import saneness.sunbonnet;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class z02 extends xm0 {
    private static final z02 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 9;
    public static final int d = 1;
    public static final int e = 11;
    public static final int f = 12;
    public static final int g = 2;
    public static final int h = 3;
    public static final int i = 4;
    public static final int j = 13;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 7;
    public static final int n = 8;
    public static final int o = 10;
    public static final int p = 14;
    private boolean allowCompression_;
    private boolean allowCookies_;
    private int bitField0_;
    private int errorCode_;
    private pc1 pattern_;
    private cd1 include_ = cd1.a();
    private String ruleLabel_ = "";
    private prescient andRules_ = xm0.h();
    private prescient elseRules_ = xm0.h();
    private prescient includeSignals_ = xm0.h();
    private prescient blobUrlKeys_ = xm0.h();
    private prescient allowedKeys_ = xm0.h();
    private prescient consoleLogs_ = xm0.h();
    private String errorString_ = "";
    private String baseUrl_ = "";

    static {
        z02 z02Var = new z02();
        DEFAULT_INSTANCE = z02Var;
        xm0.a(z02.class, z02Var);
    }

    public final String A() {
        return this.ruleLabel_;
    }

    public final boolean B() {
        return (this.bitField0_ & 32) != 0;
    }

    public final boolean C() {
        return (this.bitField0_ & 16) != 0;
    }

    public final boolean D() {
        return (this.bitField0_ & 8) != 0;
    }

    public final boolean E() {
        return (this.bitField0_ & 4) != 0;
    }

    public final boolean F() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\u000e\u0000\u0001\u0001\u000e\u000e\u0001\u0006\u0000\u0001ဉ\u0001\u00022\u0003\u001b\u0004Ț\u0005Ț\u0006ለ\u0002\u0007င\u0003\bለ\u0004\tለ\u0000\nဇ\u0005\u000b\u001b\f\u001b\rȚ\u000eဇ\u0006", new Object[]{"bitField0_", "pattern_", "include_", sunbonnet.f37322attabal, "includeSignals_", qv0.class, "blobUrlKeys_", "consoleLogs_", "errorString_", "errorCode_", "baseUrl_", "ruleLabel_", "allowCookies_", "andRules_", z02.class, "elseRules_", z02.class, "allowedKeys_", "allowCompression_"});
        }
        if (iAttabal == 3) {
            return new z02();
        }
        if (iAttabal == 4) {
            return new organist();
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
        synchronized (z02.class) {
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

    public final boolean o() {
        return this.allowCookies_;
    }

    public final prescient p() {
        return this.allowedKeys_;
    }

    public final prescient q() {
        return this.andRules_;
    }

    public final String r() {
        return this.baseUrl_;
    }

    public final prescient s() {
        return this.blobUrlKeys_;
    }

    public final prescient t() {
        return this.consoleLogs_;
    }

    public final prescient u() {
        return this.elseRules_;
    }

    public final int v() {
        return this.errorCode_;
    }

    public final String w() {
        return this.errorString_;
    }

    public final Map x() {
        return Collections.unmodifiableMap(this.include_);
    }

    public final prescient y() {
        return this.includeSignals_;
    }

    public final pc1 z() {
        pc1 pc1Var = this.pattern_;
        return pc1Var == null ? pc1.p() : pc1Var;
    }
}
