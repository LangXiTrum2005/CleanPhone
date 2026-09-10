package ads_mobile_sdk;

import saneness.cyrtometer;
import saneness.dessertspoon;
import saneness.hel;
import saneness.highwayman;
import saneness.prescient;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends xm0 {
    private static final ta DEFAULT_INSTANCE;
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
    private va automationVerdict_;
    private int bitField0_;
    private long deviceTrustworthinessDecisionLabel_;
    private long deviceTrustworthinessLevel_;
    private long humannessLevel_;
    private boolean isBattlestarEmulator_;
    private long pairId_;
    private int responseType_;
    private boolean suspicious_;
    private long timestampMs_;
    private cyrtometer reasons_ = xm0.f();
    private prescient crowdValidationOutcomes_ = xm0.h();
    private dessertspoon malwareClassifications_ = xm0.g();

    static {
        ta taVar = new ta();
        DEFAULT_INSTANCE = taVar;
        xm0.a(ta.class, taVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003\u0006ဇ\u0004\u0007\u001b\bဂ\u0005\tဂ\u0006\nဂ\u0007\u000bဉ\b\f\u0014", new Object[]{"bitField0_", "timestampMs_", "responseType_", "suspicious_", "reasons_", "pairId_", "isBattlestarEmulator_", "crowdValidationOutcomes_", za.class, "deviceTrustworthinessLevel_", "deviceTrustworthinessDecisionLabel_", "humannessLevel_", "automationVerdict_", "malwareClassifications_"});
        }
        if (iAttabal == 3) {
            return new ta();
        }
        if (iAttabal == 4) {
            return new highwayman();
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
        synchronized (ta.class) {
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
