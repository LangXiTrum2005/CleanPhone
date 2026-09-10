package ads_mobile_sdk;

import saneness.artsy;
import saneness.cyrtometer;
import saneness.hel;
import saneness.plutarchy;
import saneness.prescient;
import saneness.rhexis;
import saneness.sunflower;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class ez extends xm0 {
    private static final ez DEFAULT_INSTANCE;
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
    public static final int o = 13;
    public static final int p = 14;
    public static final int q = 15;
    public static final int r = 16;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    private long aesbLastUpdateTimeWindowsEpochMicros_;
    private int bitField0_;
    private boolean isAesbEnabled_;
    private boolean isHighRiskUser_;
    private boolean isHistorySyncEnabled_;
    private boolean isIncognito_;
    private boolean isMbbEnabled_;
    private boolean isSignedIn_;
    private boolean isUnderAdvancedProtection_;
    private int numberOfLoadedProfiles_;
    private int numberOfOpenProfiles_;
    private int numberOfProfiles_;
    private int polarbearPopulationMemoizedSerializedSize;
    private int profileManagementStatus_;
    private int serverExperimentGroupsMemoizedSerializedSize;
    private int userPopulation_;
    private static final artsy polarbearPopulation_converter_ = new sunflower();
    private static final artsy serverExperimentGroups_converter_ = new rhexis();
    private String finchActiveGroup_ = "";
    private prescient finchActiveGroups_ = xm0.h();
    private String userAgent_ = "";
    private prescient pageLoadTokens_ = xm0.h();
    private cyrtometer polarbearPopulation_ = xm0.f();
    private cyrtometer serverExperimentGroups_ = xm0.f();

    static {
        ez ezVar = new ez();
        DEFAULT_INSTANCE = ezVar;
        xm0.a(ez.class, ezVar);
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        int iAttabal = tdb.attabal(i2);
        if (iAttabal == 0) {
            return (byte) 1;
        }
        if (iAttabal == 2) {
            return new mc2(DEFAULT_INSTANCE, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0004\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005᠌\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006\tဈ\u0007\nင\b\u000bင\t\fင\n\rဇ\u000b\u000e\u001b\u000fဇ\f\u0010ဂ\r\u0011ࠬ\u0012ဇ\u000e\u0013ࠬ", new Object[]{"bitField0_", "userPopulation_", cz.a, "isHistorySyncEnabled_", "finchActiveGroup_", "finchActiveGroups_", "profileManagementStatus_", yy.a, "isUnderAdvancedProtection_", "isIncognito_", "isMbbEnabled_", "userAgent_", "numberOfProfiles_", "numberOfLoadedProfiles_", "numberOfOpenProfiles_", "isHighRiskUser_", "pageLoadTokens_", xy.class, "isAesbEnabled_", "aesbLastUpdateTimeWindowsEpochMicros_", "polarbearPopulation_", n22.a, "isSignedIn_", "serverExperimentGroups_", az.a});
        }
        if (iAttabal == 3) {
            return new ez();
        }
        if (iAttabal == 4) {
            return new plutarchy();
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
        synchronized (ez.class) {
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
