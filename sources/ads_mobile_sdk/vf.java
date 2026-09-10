package ads_mobile_sdk;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import saneness.chaucerian;
import saneness.defendable;
import saneness.dessertspoon;
import saneness.discontentedness;
import saneness.egalitarian;
import saneness.hel;
import saneness.hued;
import saneness.ongoing;
import saneness.physiographer;
import saneness.tdb;
import saneness.untying;

/* JADX INFO: loaded from: classes.dex */
public final class vf extends xm0 {
    private static final vf DEFAULT_INSTANCE;
    private static volatile hel PARSER = null;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    private int bitField0_;
    private long lastUpdateTimeMs_;
    private long serverCacheTtlSecs_;
    private int loggingOnlyExperimentIdsMemoizedSerializedSize = -1;
    private cd1 adUnitAndFormatToMediationConfigs_ = cd1.a();
    private cd1 adUnitAndFormatToRequestSignals_ = cd1.a();
    private cd1 adapterInitializationConfigs_ = cd1.a();
    private cd1 adUnitPatterns_ = cd1.a();
    private cd1 signalAdapterConfigs_ = cd1.a();
    private cd1 admobSignalAdapterConfigs_ = cd1.a();
    private cd1 adManagerSignalAdapterConfigs_ = cd1.a();
    private String appSettingsJson_ = "";
    private dessertspoon loggingOnlyExperimentIds_ = xm0.g();
    private String commonSettingsJson_ = "";

    static {
        vf vfVar = new vf();
        DEFAULT_INSTANCE = vfVar;
        xm0.a(vf.class, vfVar);
    }

    public static vf w() {
        return DEFAULT_INSTANCE;
    }

    public static untying z() {
        return (untying) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0004\f\u0000\u0001\u0001\f\f\u0007\u0001\u0000\u0001ለ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004%\u00052\u0006ለ\u0003\u00072\b2\t2\n2\u000b2\f2", new Object[]{"bitField0_", "appSettingsJson_", "lastUpdateTimeMs_", "serverCacheTtlSecs_", "loggingOnlyExperimentIds_", "adUnitAndFormatToMediationConfigs_", hued.f37168attabal, "commonSettingsJson_", "adUnitAndFormatToRequestSignals_", discontentedness.f37127attabal, "adapterInitializationConfigs_", physiographer.f37249attabal, "adUnitPatterns_", defendable.f37121attabal, "signalAdapterConfigs_", chaucerian.f37091attabal, "admobSignalAdapterConfigs_", egalitarian.f37135attabal, "adManagerSignalAdapterConfigs_", ongoing.f37235attabal});
        }
        if (iAttabal == 3) {
            return new vf();
        }
        if (iAttabal == 4) {
            return new untying();
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
        synchronized (vf.class) {
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
        return Collections.unmodifiableMap(this.adManagerSignalAdapterConfigs_);
    }

    public final Map p() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToMediationConfigs_);
    }

    public final Map q() {
        return Collections.unmodifiableMap(this.adUnitAndFormatToRequestSignals_);
    }

    public final Map r() {
        return Collections.unmodifiableMap(this.adUnitPatterns_);
    }

    public final Map s() {
        return Collections.unmodifiableMap(this.adapterInitializationConfigs_);
    }

    public final Map t() {
        return Collections.unmodifiableMap(this.admobSignalAdapterConfigs_);
    }

    public final String u() {
        return this.appSettingsJson_;
    }

    public final String v() {
        return this.commonSettingsJson_;
    }

    public final long x() {
        return this.lastUpdateTimeMs_;
    }

    public final long y() {
        return this.serverCacheTtlSecs_;
    }

    public static vf a(InputStream inputStream) {
        return (vf) xm0.a(xm0.a(DEFAULT_INSTANCE, hr.a(inputStream), vf0.a()));
    }
}
