package ads_mobile_sdk;

import saneness.hel;
import saneness.prescient;
import saneness.stonecrop;
import saneness.tdb;

/* JADX INFO: loaded from: classes.dex */
public final class w10 extends xm0 {
    public static final int A = 25;
    public static final int B = 26;
    public static final int C = 27;
    public static final int D = 28;
    private static final w10 DEFAULT_INSTANCE;
    public static final int E = 29;
    public static final int F = 30;
    public static final int G = 31;
    public static final int H = 32;
    public static final int I = 33;
    public static final int J = 34;
    public static final int K = 35;
    public static final int L = 36;
    public static final int M = 37;
    private static volatile hel PARSER = null;
    public static final int c = 10;
    public static final int d = 11;
    public static final int e = 1;
    public static final int f = 2;
    public static final int g = 3;
    public static final int h = 12;
    public static final int i = 4;
    public static final int j = 16;
    public static final int k = 13;
    public static final int l = 14;
    public static final int m = 5;
    public static final int n = 6;
    public static final int o = 7;
    public static final int p = 8;
    public static final int q = 9;
    public static final int r = 15;
    public static final int s = 17;
    public static final int t = 18;
    public static final int u = 19;
    public static final int v = 20;
    public static final int w = 21;
    public static final int x = 22;
    public static final int y = 23;
    public static final int z = 24;
    private int bitField0_;
    private f10 clientProperties_;
    private boolean complete_;
    private jz creativeProperties_;
    private boolean didProceed_;
    private nz downloadItemInfo_;
    private int downloadVerdict_;
    private j00 hashRealTimeExperimentDetails_;
    private p00 permissionPromptInfo_;
    private ez population_;
    private x00 renderedAd_;
    private boolean repeatVisit_;
    private boolean showDownloadInFolder_;
    private int type_;
    private n10 urlRealTimeAndHashRealTimeDiscrepancyInfo_;
    private int urlRequestDestination_;
    private r10 userInfo_;
    private v10 warningShownInfo_;
    private long warningShownTimestampMsec_;
    private byte memoizedIsInitialized = 2;
    private String url_ = "";
    private String pageUrl_ = "";
    private String referrerUrl_ = "";
    private prescient resources_ = xm0.h();
    private prescient dom_ = xm0.h();
    private String clickUrl_ = "";
    private prescient clientAsn_ = xm0.h();
    private String clientCountry_ = "";
    private kn token_ = kn.b;
    private String userAgent_ = "";
    private prescient disallowedPermissions_ = xm0.h();
    private prescient rejectedPermissions_ = xm0.h();
    private prescient referrerChain_ = xm0.h();
    private String safetyNetId_ = "";
    private prescient downloadWarningActions_ = xm0.h();
    private prescient interstitialInteractions_ = xm0.h();
    private prescient phishySiteInteractions_ = xm0.h();
    private String locale_ = "";
    private prescient serviceWorkerBehaviors_ = xm0.h();

    static {
        w10 w10Var = new w10();
        DEFAULT_INSTANCE = w10Var;
        xm0.a(w10.class, w10Var);
    }

    public static stonecrop o() {
        return (stonecrop) DEFAULT_INSTANCE.e();
    }

    @Override // ads_mobile_sdk.xm0
    public final Object a(int i2, xm0 xm0Var) {
        hel wm0Var;
        switch (tdb.attabal(i2)) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = (byte) (xm0Var == null ? 0 : 1);
                return null;
            case 2:
                return new mc2(DEFAULT_INSTANCE, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"bitField0_", "url_", "pageUrl_", "referrerUrl_", "resources_", d10.class, "complete_", "clientAsn_", "clientCountry_", "didProceed_", "repeatVisit_", "type_", y00.a, "downloadVerdict_", fz.a, "creativeProperties_", "clickUrl_", "renderedAd_", "token_", "dom_", a20.class, "clientProperties_", "showDownloadInFolder_", "userAgent_", "disallowedPermissions_", "rejectedPermissions_", "userInfo_", "referrerChain_", i20.class, "downloadItemInfo_", "safetyNetId_", "population_", "downloadWarningActions_", tz.class, "hashRealTimeExperimentDetails_", "urlRequestDestination_", o10.a, "interstitialInteractions_", n00.class, "phishySiteInteractions_", t00.class, "warningShownTimestampMsec_", "warningShownInfo_", "permissionPromptInfo_", "locale_", "urlRealTimeAndHashRealTimeDiscrepancyInfo_", "serviceWorkerBehaviors_", j10.class});
            case 3:
                return new w10();
            case 4:
                return new stonecrop();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hel helVar = PARSER;
                if (helVar != null) {
                    return helVar;
                }
                synchronized (w10.class) {
                    try {
                        wm0Var = PARSER;
                        if (wm0Var == null) {
                            wm0Var = new wm0(DEFAULT_INSTANCE);
                            PARSER = wm0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return wm0Var;
            default:
                throw null;
        }
    }
}
