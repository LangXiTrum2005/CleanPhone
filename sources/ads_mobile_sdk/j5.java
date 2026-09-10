package ads_mobile_sdk;

import com.ironsource.Ua;
import saneness.hel;
import saneness.swimathon;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class j5 extends xm0 {
    private static final j5 DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 22;
    public static final int e = 9;
    public static final int f = 23;
    public static final int g = 24;
    public static final int h = 3;
    public static final int i = 25;
    public static final int j = 4;
    public static final int k = 5;
    public static final int l = 6;
    public static final int m = 18;
    public static final int n = 7;
    public static final int o = 8;
    public static final int p = 10;
    public static final int q = 11;
    public static final int r = 12;
    public static final int s = 13;
    public static final int t = 14;
    public static final int u = 15;
    public static final int v = 16;
    public static final int w = 17;
    public static final int x = 19;
    public static final int y = 20;
    public static final int z = 21;
    private boolean allowFallbackToStaticProgram_;
    private int bitField0_;
    private boolean enableLazyScheduler_;
    private boolean enableViewstringBinding_;
    private boolean forceInitializeWithStaticProgram_;
    private int hostType_;
    private nc1 loggingOptions_;
    private t72 programUpdateOptions_;
    private int requestedAdshieldVersion_;
    private int fallbackAdshieldVersion_ = 1;
    private boolean allowFallback_ = true;
    private String hostVersion_ = "unknown_host";
    private boolean enableGassClient_ = true;
    private long appStartQuerySignalsTimeoutMs_ = 100;
    private long signalsTimeoutMs_ = 2000;
    private long gassSignalTimeoutMs_ = 10;
    private long localIntSignalTimeoutMs_ = 100;
    private long httpRequestTimeoutMs_ = 20000;
    private String prodInstallerCert_ = "";
    private String debugInstallerCert_ = "";
    private long methodTimeoutMs_ = 500;
    private long appStartWindowMs_ = Ua.C;
    private boolean enableMinimalAppStartQuerySignals_ = true;
    private boolean clearDgArgsAfterUse_ = true;
    private boolean enableDgProgramCache_ = true;

    static {
        j5 j5Var = new j5();
        DEFAULT_INSTANCE = j5Var;
        xm0.a(j5.class, j5Var);
    }

    public static swimathon M() {
        return (swimathon) DEFAULT_INSTANCE.e();
    }

    public final boolean A() {
        return this.forceInitializeWithStaticProgram_;
    }

    public final long B() {
        return this.gassSignalTimeoutMs_;
    }

    public final i5 C() {
        i5 i5Var;
        int i2 = this.hostType_;
        if (i2 == 0) {
            i5Var = i5.UNKNOWN_HOST_TYPE;
        } else if (i2 == 1) {
            i5Var = i5.GMA;
        } else if (i2 != 2) {
            i5Var = i2 != 3 ? null : i5.GPAY;
        } else {
            i5Var = i5.YOUTUBE;
        }
        return i5Var == null ? i5.UNRECOGNIZED : i5Var;
    }

    public final String D() {
        return this.hostVersion_;
    }

    public final long E() {
        return this.httpRequestTimeoutMs_;
    }

    public final long F() {
        return this.localIntSignalTimeoutMs_;
    }

    public final nc1 G() {
        nc1 nc1Var = this.loggingOptions_;
        return nc1Var == null ? nc1.o() : nc1Var;
    }

    public final long H() {
        return this.methodTimeoutMs_;
    }

    public final String I() {
        return this.prodInstallerCert_;
    }

    public final t72 J() {
        t72 t72Var = this.programUpdateOptions_;
        return t72Var == null ? t72.p() : t72Var;
    }

    public final y5 K() {
        y5 y5VarA = y5.a(this.requestedAdshieldVersion_);
        return y5VarA == null ? y5.ADSHIELD_VERSION_UNSPECIFIED : y5VarA;
    }

    public final long L() {
        return this.signalsTimeoutMs_;
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            x5 x5Var = x5.a;
            return new mc2(DEFAULT_INSTANCE, "\u0004\u0018\u0000\u0001\u0001\u0019\u0018\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0005\u0004ဇ\u0007\u0005ဉ\b\u0006ဇ\t\u0007ဂ\u000b\bဉ\f\tဇ\u0002\nဂ\r\u000bဂ\u000e\fဂ\u000f\rဈ\u0010\u000eဈ\u0011\u000fဂ\u0012\u0010ဂ\u0013\u0011ဇ\u0014\u0012ဂ\n\u0013ဇ\u0015\u0014ဇ\u0016\u0015ဇ\u0017\u0016᠌\u0001\u0017ဇ\u0003\u0018ဇ\u0004\u0019ဌ\u0006", new Object[]{"bitField0_", "requestedAdshieldVersion_", x5Var, "hostVersion_", "enableGassClient_", "loggingOptions_", "enableViewstringBinding_", "signalsTimeoutMs_", "programUpdateOptions_", "allowFallback_", "gassSignalTimeoutMs_", "localIntSignalTimeoutMs_", "httpRequestTimeoutMs_", "prodInstallerCert_", "debugInstallerCert_", "methodTimeoutMs_", "appStartWindowMs_", "enableMinimalAppStartQuerySignals_", "appStartQuerySignalsTimeoutMs_", "clearDgArgsAfterUse_", "enableDgProgramCache_", "enableLazyScheduler_", "fallbackAdshieldVersion_", x5Var, "allowFallbackToStaticProgram_", "forceInitializeWithStaticProgram_", "hostType_"});
        }
        if (iAttabal == 3) {
            return new j5();
        }
        if (iAttabal == 4) {
            return new swimathon();
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
        synchronized (j5.class) {
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
        return this.allowFallback_;
    }

    public final boolean p() {
        return this.allowFallbackToStaticProgram_;
    }

    public final long q() {
        return this.appStartQuerySignalsTimeoutMs_;
    }

    public final long r() {
        return this.appStartWindowMs_;
    }

    public final boolean s() {
        return this.clearDgArgsAfterUse_;
    }

    public final String t() {
        return this.debugInstallerCert_;
    }

    public final boolean u() {
        return this.enableDgProgramCache_;
    }

    public final boolean v() {
        return this.enableGassClient_;
    }

    public final boolean w() {
        return this.enableLazyScheduler_;
    }

    public final boolean x() {
        return this.enableMinimalAppStartQuerySignals_;
    }

    public final boolean y() {
        return this.enableViewstringBinding_;
    }

    public final y5 z() {
        y5 y5VarA = y5.a(this.fallbackAdshieldVersion_);
        return y5VarA == null ? y5.ADSHIELD_VERSION_1 : y5VarA;
    }
}
