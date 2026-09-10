package com.p004ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.p004ironsource.environment.StringUtils;
import com.p004ironsource.mediationsdk.IronSource;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.model.InterstitialPlacement;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.model.Placement;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class qt {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected static final boolean f26606A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected static final int f26607B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected static final int f26608E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected static final int f26609F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected static final int f26610I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected static final int f26611J = 0;
    protected static final String J0 = "server";
    protected static final String J1 = "timeToWaitBeforeAuction";
    protected static final int K = 2;
    protected static final String K0 = "publisher";
    protected static final String K1 = "timeToWaitBeforeLoad";
    protected static final int L = 15;
    protected static final String L0 = "console";
    protected static final String L1 = "auctionRetryInterval";
    protected static final long M = 10000;
    protected static final String M0 = "sendUltraEvents";
    protected static final String M1 = "isLoadWhileShow";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected static final long f26612N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    protected static final boolean f26613P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    protected static final int f26614Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    protected static final int f26615R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    protected static final boolean f26616U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    protected static final int f26617V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    protected static final String f26618Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";
    protected static final String a0 = "genericParams";
    protected static final String a1 = "pixel";
    protected static final String a2 = "tokenGenericParams";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected static final String f26619b0 = "adUnits";
    protected static final String b1 = "pixelEventsUrl";
    protected static final String b2 = "compressToken";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected static final String f26620c0 = "providerLoadName";
    protected static final String c1 = "pixelEventsEnabled";
    protected static final String c2 = "compressExternalToken";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected static final String f26621d0 = "application";
    protected static final String d1 = "placements";
    protected static final String d2 = "instanceType";
    protected static final String e0 = "rewardedVideo";
    protected static final String e1 = "placementId";
    protected static final String e2 = "maxAdsPerSession";
    protected static final String f0 = "interstitial";
    protected static final String f1 = "placementName";
    protected static final String f2 = "reward";
    protected static final String g0 = "banner";
    protected static final String g1 = "delivery";
    protected static final String g2 = "name";
    protected static final String h0 = "nativeAd";
    protected static final String h1 = "isDefault";
    protected static final String h2 = "amount";
    protected static final String i0 = "integration";
    protected static final String i1 = "capping";
    protected static final String i2 = "bannerRefreshRate";
    protected static final String j0 = "loggers";
    protected static final String j1 = "pacing";
    protected static final String j2 = "protocolVersion";
    protected static final String k0 = "segment";
    protected static final String k1 = "enabled";
    protected static final String k2 = "adFormats";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f26622l = "appKey";
    protected static final String l0 = "events";
    protected static final String l1 = "maxImpressions";
    protected static final String l2 = "adUnits";
    public static final String m = "userId";
    protected static final String m0 = "crashReporter";
    protected static final String m1 = "numOfSeconds";
    protected static final String m2 = "rewarded";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f26623n = "response";
    protected static final String n0 = "token";
    protected static final String n1 = "unit";
    protected static final String o = "error";
    protected static final String o0 = "external";
    protected static final String o1 = "virtualItemName";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final int f26624p = 3;
    protected static final String p0 = "mediationTypes";
    protected static final String p1 = "virtualItemCount";
    protected static final boolean q = false;
    protected static final String q0 = "providerDefaultInstance";
    protected static final String q1 = "uuidEnabled";
    protected static final boolean r = true;
    protected static final String r0 = "testSuite";
    protected static final String r1 = "abt";
    protected static final boolean s = true;
    protected static final String s0 = "controllerUrl";
    protected static final String s1 = "delayLoadFailure";
    protected static final int t = 2;
    protected static final String t0 = "AdQuality";
    protected static final String t1 = "keysToInclude";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final int f26625u = 2;
    protected static final String u0 = "initMode";
    protected static final String u1 = "reporterURL";
    protected static final int v = 1;
    protected static final String v0 = "adq_init_blob";
    protected static final String v1 = "reporterKeyword";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final int f26626w = 1;
    protected static final String w0 = "settings";
    protected static final String w1 = "includeANR";
    protected static final boolean x = true;
    protected static final String x0 = "collectBiddingDataTimeout";
    protected static final String x1 = "timeout";
    protected static final boolean y = false;
    protected static final String y0 = "providers";
    protected static final String y1 = "setIgnoreDebugger";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final boolean f26627z = false;
    protected static final String z0 = "parallelInit";
    protected static final String z1 = "adSourceName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private cr f26628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private er f26629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u8 f26630c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f26631e;
    private JSONObject f;
    private Context g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f26632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private jg.a f26633i;
    private boolean j;
    private nc k;

    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f26637a;

        a(String str) {
            this.f26637a = str;
        }

        public String a() {
            return this.f26637a;
        }
    }

    public qt(Context context, String str, String str2, String str3) {
        this.f26632h = a.NOT_SET;
        this.j = false;
        this.g = context;
        this.f26633i = on.O().m();
        try {
            this.f = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            this.j = n();
            s();
            q();
            r();
            this.d = TextUtils.isEmpty(str) ? "" : str;
            this.f26631e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f);
        } catch (JSONException e3) {
            q9.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
            a();
        }
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i3) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i3 : iOptInt;
    }

    public static jw b(qt qtVar) {
        return (qtVar == null || !qtVar.p()) ? jw.a() : qtVar.c().getApplicationConfigurations().k();
    }

    private com.p004ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.p004ironsource.mediationsdk.adquality.a aVar = new com.p004ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new hk().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    private Context d() {
        return this.g;
    }

    private InterstitialPlacement e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
        nq nqVarA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        InterstitialPlacement interstitialPlacement = new InterstitialPlacement(iOptInt, strOptString, zOptBoolean, nqVarA);
        if (nqVarA != null) {
            this.f26633i.c(this.g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
        }
        return interstitialPlacement;
    }

    private eo f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
        nq nqVarA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        eo eoVar = new eo(iOptInt, strOptString, zOptBoolean, nqVarA);
        if (nqVarA != null) {
            this.f26633i.c(this.g, eoVar, IronSource.AD_UNIT.NATIVE_AD);
        }
        return eoVar;
    }

    private Placement g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        nq nqVarA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        Placement placement = new Placement(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, nqVarA);
        if (nqVarA != null) {
            this.f26633i.c(this.g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        return placement;
    }

    private String l() {
        return this.j ? "rewarded" : "rewardedVideo";
    }

    private boolean m() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f, "configurations"), b());
        for (int i3 = 0; i3 < jSONArrayNames.length(); i3++) {
            String strOptString = jSONArrayNames.optString(i3);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean n() {
        int iOptInt;
        try {
            iOptInt = this.f.optInt(j2, 0);
        } catch (Exception e3) {
            q9.d().a(e3);
            IronLog.INTERNAL.error(e3.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00b8  */
    private void q() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        bs bsVar;
        String str13;
        String str14;
        String str15;
        String str16;
        JSONObject jSONObject;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        uj ujVar;
        String str22;
        String str23;
        JSONObject jSONObject2;
        String str24;
        String str25;
        JSONObject jSONObject3;
        String str26;
        String str27;
        JSONObject jSONObject4;
        String str28;
        u6 u6Var;
        String str29;
        JSONObject jSONObject5;
        String str30;
        u6 u6Var2;
        tn tnVar;
        boolean zOptBoolean;
        String str31;
        JSONObject jSONObjectC;
        o5 o5Var;
        o5 o5Var2;
        JSONObject jSONObjectC2;
        o5 o5Var3;
        o5 o5Var4;
        try {
            JSONObject jSONObjectC3 = c(this.f, "configurations");
            JSONObject jSONObjectC4 = c(jSONObjectC3, b());
            JSONObject jSONObjectC5 = c(jSONObjectC3, "application");
            JSONObject jSONObjectC6 = c(jSONObjectC4, l());
            JSONObject jSONObjectC7 = c(jSONObjectC4, "interstitial");
            JSONObject jSONObjectC8 = c(jSONObjectC4, "banner");
            JSONObject jSONObjectC9 = c(jSONObjectC4, "nativeAd");
            JSONObject jSONObjectC10 = c(jSONObjectC5, "events");
            JSONObject jSONObjectC11 = c(jSONObjectC5, "loggers");
            JSONObject jSONObjectC12 = c(jSONObjectC5, "token");
            JSONObject jSONObjectC13 = c(jSONObjectC5, "segment");
            JSONObject jSONObjectC14 = c(jSONObjectC5, "auction");
            JSONObject jSONObjectC15 = c(jSONObjectC5, "crashReporter");
            JSONObject jSONObjectC16 = c(jSONObjectC5, "settings");
            JSONObject jSONObjectC17 = c(jSONObjectC5, "external");
            JSONObject jSONObjectC18 = c(jSONObjectC10, a1);
            if (jSONObjectC5 != null) {
                IronSourceUtils.saveBooleanToSharedPrefs(this.g, "uuidEnabled", jSONObjectC5.optBoolean("uuidEnabled", true));
            }
            if (jSONObjectC10 != null) {
                String strOptString = jSONObjectC10.optString("abt");
                if (TextUtils.isEmpty(strOptString)) {
                    str = null;
                } else {
                    on.U().z().a(strOptString);
                    wj.i().a(strOptString);
                    ds.i().a(strOptString);
                    str = strOptString;
                }
            } else {
                str = null;
            }
            g4 g4VarA = a(jSONObjectC10, Boolean.valueOf(jSONObjectC10.optBoolean("sendUltraEvents", false)));
            String str32 = E0;
            String str33 = S1;
            String str34 = V1;
            String str35 = R1;
            String str36 = W1;
            String str37 = s1;
            String str38 = B0;
            String str39 = "auctionTrials";
            String str40 = A0;
            String str41 = G1;
            JSONObject jSONObject6 = jSONObjectC10;
            String str42 = F1;
            JSONObject jSONObject7 = jSONObjectC14;
            String str43 = E1;
            if (jSONObjectC6 != null) {
                str2 = "";
                JSONArray jSONArrayOptJSONArray = jSONObjectC6.optJSONArray("placements");
                str3 = "placements";
                JSONObject jSONObjectC19 = c(jSONObjectC6, "events");
                str4 = "events";
                JSONObject jSONObjectD = d(jSONObjectC6, y0);
                str5 = y0;
                long jOptLong = jSONObjectC6.optLong(x0, 3000L);
                boolean zOptBoolean2 = jSONObjectD.optBoolean(z0, false);
                boolean zOptBoolean3 = jSONObjectD.optBoolean(A0, false);
                boolean zOptBoolean4 = jSONObjectC6.optBoolean(B0, true);
                int iA = a(jSONObjectC6, jSONObjectC5, "parallelLoad", 2);
                str6 = "bidderExclusive";
                boolean zA = a(jSONObjectC6, jSONObjectC5, str6, true);
                int iA2 = a(jSONObjectC6, jSONObjectC5, E0, 60);
                int iA3 = a(jSONObjectC6, jSONObjectC5, "expiredDurationInMinutes", -1);
                int iA4 = a(jSONObjectC6, jSONObjectC5, s1, 3);
                str8 = "isOneFlow";
                boolean zA2 = a(jSONObjectC6, jSONObjectC5, str8, false);
                jSONObject6 = jSONObject6;
                JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectC19, jSONObject6);
                g4 g4VarA2 = a(jSONObjectMergeJsons, Boolean.valueOf(jSONObjectMergeJsons.optBoolean("sendUltraEvents", false)));
                if (jSONObject7 != null) {
                    JSONObject jSONObjectC20 = c(jSONObject7, l());
                    String strOptString2 = jSONObject7.optString(str43, str2);
                    String strOptString3 = jSONObject7.optString(str42, str2);
                    String strOptString4 = jSONObject7.optString(str41, str2);
                    int iOptInt = jSONObject7.optInt(str39, 2);
                    long jOptLong2 = jSONObject7.optLong(O1, 10000L);
                    int iOptInt2 = jSONObject7.optInt(P1, 15);
                    str12 = O1;
                    boolean zOptBoolean5 = jSONObject7.optBoolean(U1, false);
                    str11 = U1;
                    boolean zOptBoolean6 = jSONObject7.optBoolean(str34, false);
                    int iOptInt3 = jSONObject7.optInt(str36, 1);
                    boolean zOptBoolean7 = jSONObject7.optBoolean(str35, true);
                    boolean zOptBoolean8 = jSONObjectC20.optBoolean(str33, true);
                    str10 = P1;
                    int iOptInt4 = jSONObjectC20.optInt(I1, 2000);
                    str9 = I1;
                    int iOptInt5 = jSONObjectC20.optInt(L1, 30000);
                    str7 = L1;
                    o5 o5Var5 = new o5(strOptString2, strOptString3, strOptString4, iOptInt, iOptInt2, jOptLong2, iOptInt4, iOptInt5, jSONObjectC20.optInt(J1, 5000), jSONObjectC20.optInt(K1, 50), jSONObjectC20.optBoolean("isLoadWhileShow", true), jSONObjectC20.optInt(T1, 30000), zOptBoolean5, zOptBoolean6, jSONObjectC20.optBoolean(H1, false), iOptInt3, false, zOptBoolean7, zOptBoolean8);
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectC20.optJSONArray(Q1);
                    if (jSONArrayOptJSONArray2 != null) {
                        str43 = str43;
                        str42 = str42;
                        str2 = str2;
                        str41 = str41;
                        str39 = str39;
                        str34 = str34;
                        str36 = str36;
                        str35 = str35;
                        str33 = str33;
                        jSONObject7 = jSONObject7;
                        for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                            o5Var5.a(jSONArrayOptJSONArray2.optString(i3));
                        }
                    }
                    str43 = str43;
                    str42 = str42;
                    str2 = str2;
                    str41 = str41;
                    str39 = str39;
                    str34 = str34;
                    str36 = str36;
                    str35 = str35;
                    str33 = str33;
                    jSONObject7 = jSONObject7;
                    o5Var4 = o5Var5;
                } else {
                    str7 = L1;
                    str9 = I1;
                    str10 = P1;
                    str11 = U1;
                    str12 = O1;
                    o5Var4 = new o5();
                }
                bsVar = new bs(iA, zA, iA2, iA3, g4VarA2, o5Var4, iA4, zA2, jOptLong, zOptBoolean2, zOptBoolean3, zOptBoolean4);
                if (jSONArrayOptJSONArray != null) {
                    for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                        Placement placementG = g(jSONArrayOptJSONArray.optJSONObject(i4));
                        if (placementG != null) {
                            bsVar.a(placementG);
                        }
                    }
                }
            } else {
                str2 = "";
                str3 = "placements";
                str4 = "events";
                str37 = s1;
                str5 = y0;
                str6 = "bidderExclusive";
                str7 = L1;
                str8 = "isOneFlow";
                str9 = I1;
                str10 = P1;
                str11 = U1;
                str12 = O1;
                str32 = E0;
                bsVar = null;
            }
            if (jSONObjectC7 != null) {
                String str44 = str3;
                JSONArray jSONArrayOptJSONArray3 = jSONObjectC7.optJSONArray(str44);
                String str45 = str4;
                JSONObject jSONObjectC21 = c(jSONObjectC7, str45);
                str19 = str5;
                JSONObject jSONObjectD2 = d(jSONObjectC7, str19);
                str3 = str44;
                str4 = str45;
                long jOptLong3 = jSONObjectC7.optLong(x0, 3000L);
                boolean zOptBoolean9 = jSONObjectD2.optBoolean(z0, false);
                boolean zOptBoolean10 = jSONObjectD2.optBoolean(A0, false);
                boolean zOptBoolean11 = jSONObjectC7.optBoolean(B0, true);
                int iA5 = a(jSONObjectC7, jSONObjectC5, "parallelLoad", 2);
                boolean zA3 = a(jSONObjectC7, jSONObjectC5, str6, false);
                int iA6 = a(jSONObjectC7, jSONObjectC5, str32, 60);
                str21 = str37;
                int iA7 = a(jSONObjectC7, jSONObjectC5, str21, 3);
                str20 = str8;
                boolean zA4 = a(jSONObjectC7, jSONObjectC5, str20, false);
                jSONObject6 = jSONObject6;
                g4 g4VarA3 = a(IronSourceUtils.mergeJsons(jSONObjectC21, jSONObject6), Boolean.FALSE);
                if (jSONObject7 != null) {
                    jSONObject = jSONObject7;
                    JSONObject jSONObjectC22 = c(jSONObject, "interstitial");
                    str17 = str43;
                    str18 = str2;
                    String strOptString5 = jSONObject.optString(str17, str18);
                    String str46 = str42;
                    String strOptString6 = jSONObject.optString(str46, str18);
                    str42 = str46;
                    String str47 = str41;
                    String strOptString7 = jSONObject.optString(str47, str18);
                    String str48 = str39;
                    int iOptInt6 = jSONObject.optInt(str48, 2);
                    str41 = str47;
                    str13 = str10;
                    int iOptInt7 = jSONObject.optInt(str13, 15);
                    str39 = str48;
                    str14 = str12;
                    long jOptLong4 = jSONObject.optLong(str14, 10000L);
                    String str49 = str11;
                    boolean zOptBoolean12 = jSONObject.optBoolean(str49, false);
                    str15 = str49;
                    String str50 = str34;
                    boolean zOptBoolean13 = jSONObject.optBoolean(str50, false);
                    str34 = str50;
                    String str51 = str36;
                    int iOptInt8 = jSONObject.optInt(str51, 1);
                    str36 = str51;
                    String str52 = str35;
                    boolean zOptBoolean14 = jSONObject.optBoolean(str52, true);
                    str35 = str52;
                    String str53 = str33;
                    boolean zOptBoolean15 = jSONObjectC22.optBoolean(str53, true);
                    str33 = str53;
                    String str54 = str9;
                    str16 = str54;
                    o5Var3 = new o5(strOptString5, strOptString6, strOptString7, iOptInt6, iOptInt7, jOptLong4, jSONObjectC22.optInt(str54, 2000), 0L, 0L, 0L, true, 0, zOptBoolean12, zOptBoolean13, true, iOptInt8, false, zOptBoolean14, zOptBoolean15);
                } else {
                    str13 = str10;
                    str14 = str12;
                    str15 = str11;
                    str16 = str9;
                    jSONObject = jSONObject7;
                    str17 = str43;
                    str18 = str2;
                    o5Var3 = new o5();
                }
                uj ujVar2 = new uj(iA5, zA3, iA6, g4VarA3, o5Var3, iA7, zA4, jOptLong3, zOptBoolean9, zOptBoolean10, zOptBoolean11);
                if (jSONArrayOptJSONArray3 != null) {
                    for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                        InterstitialPlacement interstitialPlacementE = e(jSONArrayOptJSONArray3.optJSONObject(i5));
                        if (interstitialPlacementE != null) {
                            ujVar2.a(interstitialPlacementE);
                        }
                    }
                }
                ujVar = ujVar2;
            } else {
                str38 = B0;
                str40 = A0;
                jSONObjectC5 = jSONObjectC5;
                str13 = str10;
                str14 = str12;
                str15 = str11;
                str16 = str9;
                jSONObject = jSONObject7;
                str17 = str43;
                str18 = str2;
                str19 = str5;
                str20 = str8;
                str21 = str37;
                ujVar = null;
            }
            if (jSONObjectC8 != null) {
                String str55 = str3;
                JSONArray jSONArrayOptJSONArray4 = jSONObjectC8.optJSONArray(str55);
                str22 = str13;
                String str56 = str4;
                JSONObject jSONObjectC23 = c(jSONObjectC8, str56);
                str4 = str56;
                JSONObject jSONObjectD3 = d(jSONObjectC8, str19);
                String str57 = str14;
                str25 = str55;
                String str58 = str18;
                jSONObject2 = jSONObjectC5;
                str24 = str38;
                str26 = str17;
                str27 = str40;
                String str59 = str7;
                jSONObject3 = jSONObject;
                jSONObject4 = jSONObject6;
                long jA = a(jSONObjectC8, jSONObject2, F0, 10000L);
                int iA8 = a(jSONObjectC8, jSONObject2, str21, 3);
                int iOptInt9 = jSONObjectC8.optInt("bannerInterval", 60);
                long jOptLong5 = jSONObjectC8.optLong(Y1, MBInterstitialActivity.WEB_LOAD_TIME);
                boolean zA5 = a(jSONObjectC8, jSONObject2, str20, false);
                long jOptLong6 = jSONObjectC8.optLong(x0, 3000L);
                boolean zOptBoolean16 = jSONObjectD3.optBoolean(z0, false);
                boolean zOptBoolean17 = jSONObjectD3.optBoolean(str27, false);
                boolean zOptBoolean18 = jSONObjectC8.optBoolean(str24, true);
                g4 g4VarA4 = a(IronSourceUtils.mergeJsons(jSONObjectC23, jSONObject4), Boolean.FALSE);
                if (jSONObject3 == null || (jSONObjectC2 = c(jSONObject3, "banner")) == null) {
                    str28 = str57;
                    str23 = str58;
                    o5Var2 = new o5();
                } else {
                    str23 = str58;
                    String strOptString8 = jSONObject3.optString(str26, str23);
                    String str60 = str42;
                    String strOptString9 = jSONObject3.optString(str60, str23);
                    String str61 = str41;
                    String strOptString10 = jSONObject3.optString(str61, str23);
                    String str62 = str39;
                    int iOptInt10 = jSONObject3.optInt(str62, 2);
                    str41 = str61;
                    int iOptInt11 = jSONObject3.optInt(str22, 15);
                    str22 = str22;
                    str39 = str62;
                    str28 = str57;
                    long jOptLong7 = jSONObject3.optLong(str28, 10000L);
                    String str63 = str15;
                    boolean zOptBoolean19 = jSONObject3.optBoolean(str63, false);
                    str15 = str63;
                    String str64 = str34;
                    boolean zOptBoolean20 = jSONObject3.optBoolean(str64, false);
                    str34 = str64;
                    String str65 = str36;
                    int iOptInt12 = jSONObject3.optInt(str65, 1);
                    str36 = str65;
                    String str66 = str35;
                    boolean zOptBoolean21 = jSONObject3.optBoolean(str66, true);
                    str35 = str66;
                    String str67 = str33;
                    boolean zOptBoolean22 = jSONObjectC2.optBoolean(str67, true);
                    str33 = str67;
                    String str68 = str16;
                    str42 = str60;
                    str16 = str68;
                    o5Var2 = new o5(strOptString8, strOptString9, strOptString10, iOptInt10, iOptInt11, jOptLong7, jSONObjectC2.optInt(str68, 2000), jSONObjectC2.optInt(str59, 15000), jSONObjectC2.optInt(J1, 50), 0L, jSONObjectC2.optBoolean("isLoadWhileShow", false), 0, zOptBoolean19, zOptBoolean20, jSONObjectC2.optBoolean(H1, true), iOptInt12, jSONObjectC2.optBoolean(X1, true), zOptBoolean21, zOptBoolean22);
                }
                u6 u6Var3 = new u6(1, jA, false, g4VarA4, iOptInt9, o5Var2, iA8, zA5, jOptLong6, zOptBoolean16, zOptBoolean17, zOptBoolean18, jOptLong5);
                if (jSONArrayOptJSONArray4 != null) {
                    for (int i6 = 0; i6 < jSONArrayOptJSONArray4.length(); i6++) {
                        h7 h7VarD = d(jSONArrayOptJSONArray4.optJSONObject(i6));
                        if (h7VarD != null) {
                            u6Var3.a(h7VarD);
                        }
                    }
                }
                u6Var = u6Var3;
            } else {
                str22 = str13;
                str23 = str18;
                jSONObject2 = jSONObjectC5;
                str24 = str38;
                str25 = str3;
                jSONObject3 = jSONObject;
                str26 = str17;
                str27 = str40;
                jSONObject4 = jSONObject6;
                str28 = str14;
                u6Var = null;
            }
            if (jSONObjectC9 != null) {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectC9.optJSONArray(str25);
                String str69 = str4;
                JSONObject jSONObjectC24 = c(jSONObjectC9, str69);
                JSONObject jSONObjectD4 = d(jSONObjectC9, str19);
                String str70 = str28;
                String str71 = str26;
                jSONObject5 = jSONObject2;
                String str72 = str16;
                String str73 = str33;
                String str74 = str35;
                String str75 = str34;
                String str76 = str36;
                String str77 = str15;
                str30 = str69;
                u6Var2 = u6Var;
                long jA2 = a(jSONObjectC9, jSONObject5, F0, 10000L);
                int iA9 = a(jSONObjectC9, jSONObject5, str21, 0);
                long jOptLong8 = jSONObjectC9.optLong(x0, 3000L);
                boolean zOptBoolean23 = jSONObjectD4.optBoolean(z0, false);
                boolean zOptBoolean24 = jSONObjectD4.optBoolean(str27, false);
                boolean zOptBoolean25 = jSONObjectC9.optBoolean(str24, true);
                g4 g4VarA5 = a(IronSourceUtils.mergeJsons(jSONObjectC24, jSONObject4), Boolean.FALSE);
                if (jSONObject3 != null) {
                    JSONObject jSONObjectC25 = c(jSONObject3, "nativeAd");
                    str29 = str71;
                    o5Var = jSONObjectC25 != null ? new o5(jSONObject3.optString(str29, str23), jSONObject3.optString(str42, str23), jSONObject3.optString(str41, str23), jSONObject3.optInt(str39, 2), jSONObject3.optInt(str22, 15), jSONObject3.optLong(str70, 10000L), jSONObjectC25.optInt(str72, 2000), 0L, 0L, 0L, true, 0, jSONObject3.optBoolean(str77, false), jSONObject3.optBoolean(str75, false), true, jSONObject3.optInt(str76, 1), false, jSONObject3.optBoolean(str74, true), jSONObjectC25.optBoolean(str73, true)) : new o5();
                } else {
                    str29 = str71;
                    o5Var = new o5();
                }
                tnVar = new tn(1, jA2, false, g4VarA5, o5Var, iA9, jOptLong8, zOptBoolean23, zOptBoolean24, zOptBoolean25);
                if (jSONArrayOptJSONArray5 != null) {
                    for (int i7 = 0; i7 < jSONArrayOptJSONArray5.length(); i7++) {
                        eo eoVarF = f(jSONArrayOptJSONArray5.optJSONObject(i7));
                        if (eoVarF != null) {
                            tnVar.a(eoVarF);
                        }
                    }
                }
            } else {
                str29 = str26;
                jSONObject5 = jSONObject2;
                str30 = str4;
                u6Var2 = u6Var;
                tnVar = null;
            }
            jw jwVar = new jw();
            if (
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r16v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 2228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p004ironsource.qt.q():void");
        }

        private void r() {
            try {
                JSONObject jSONObjectC = c(this.f, "providerOrder");
                JSONArray jSONArrayB = b(jSONObjectC, l());
                JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
                JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
                JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
                this.f26628a = new cr();
                if (jSONArrayB != null && c() != null && c().getRewardedVideoConfigurations() != null) {
                    for (int i3 = 0; i3 < jSONArrayB.length(); i3++) {
                        String strOptString = jSONArrayB.optString(i3);
                        this.f26628a.d(strOptString);
                        NetworkSettings networkSettingsB = er.c().b(strOptString);
                        if (networkSettingsB != null) {
                            networkSettingsB.setRewardedVideoPriority(i3);
                        }
                    }
                }
                if (jSONArrayB2 != null && c() != null && c().getInterstitialConfigurations() != null) {
                    for (int i4 = 0; i4 < jSONArrayB2.length(); i4++) {
                        String strOptString2 = jSONArrayB2.optString(i4);
                        this.f26628a.b(strOptString2);
                        NetworkSettings networkSettingsB2 = er.c().b(strOptString2);
                        if (networkSettingsB2 != null) {
                            networkSettingsB2.setInterstitialPriority(i4);
                        }
                    }
                }
                if (jSONArrayB3 != null) {
                    for (int i5 = 0; i5 < jSONArrayB3.length(); i5++) {
                        String strOptString3 = jSONArrayB3.optString(i5);
                        this.f26628a.a(strOptString3);
                        NetworkSettings networkSettingsB3 = er.c().b(strOptString3);
                        if (networkSettingsB3 != null) {
                            networkSettingsB3.setBannerPriority(i5);
                        }
                    }
                }
                if (jSONArrayB4 != null) {
                    for (int i6 = 0; i6 < jSONArrayB4.length(); i6++) {
                        String strOptString4 = jSONArrayB4.optString(i6);
                        this.f26628a.c(strOptString4);
                        NetworkSettings networkSettingsB4 = er.c().b(strOptString4);
                        if (networkSettingsB4 != null) {
                            networkSettingsB4.setNativeAdPriority(i6);
                        }
                    }
                }
            } catch (Exception e3) {
                q9.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }

        private void s() {
            NetworkSettings networkSettings;
            try {
                this.f26629b = er.c();
                JSONObject jSONObjectC = c(this.f, "providerSettings");
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectOptJSONObject = jSONObjectC.optJSONObject(next);
                    if (jSONObjectOptJSONObject != null) {
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("mpis", false);
                        String strOptString = jSONObjectOptJSONObject.optString("spId", "0");
                        String strOptString2 = jSONObjectOptJSONObject.optString("adSourceName", null);
                        String strOptString3 = jSONObjectOptJSONObject.optString("providerNetworkKey", null);
                        String strOptString4 = jSONObjectOptJSONObject.optString("providerLoadName", next);
                        String strOptString5 = jSONObjectOptJSONObject.optString("providerDefaultInstance", strOptString4);
                        JSONObject jSONObjectC2 = c(jSONObjectOptJSONObject, b());
                        JSONObject jSONObjectC3 = c(jSONObjectOptJSONObject, "application");
                        JSONObject jSONObjectC4 = c(jSONObjectC2, l());
                        JSONObject jSONObjectC5 = c(jSONObjectC2, "interstitial");
                        JSONObject jSONObjectC6 = c(jSONObjectC2, "banner");
                        JSONObject jSONObjectC7 = c(jSONObjectC2, "nativeAd");
                        JSONObject jSONObjectMergeJsons = IronSourceUtils.mergeJsons(jSONObjectC4, jSONObjectC3);
                        JSONObject jSONObjectMergeJsons2 = IronSourceUtils.mergeJsons(jSONObjectC5, jSONObjectC3);
                        JSONObject jSONObjectMergeJsons3 = IronSourceUtils.mergeJsons(jSONObjectC6, jSONObjectC3);
                        JSONObject jSONObjectMergeJsons4 = IronSourceUtils.mergeJsons(jSONObjectC7, jSONObjectC3);
                        if (this.f26629b.a(next)) {
                            on.U().z().a(new zb(ac.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                            NetworkSettings networkSettingsB = this.f26629b.b(next);
                            JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                            JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                            JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                            JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                            networkSettingsB.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, jSONObjectMergeJsons));
                            networkSettingsB.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, jSONObjectMergeJsons2));
                            networkSettingsB.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, jSONObjectMergeJsons3));
                            networkSettingsB.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, jSONObjectMergeJsons4));
                            networkSettingsB.setIsMultipleInstances(zOptBoolean);
                            networkSettingsB.setSubProviderId(strOptString);
                            networkSettingsB.setAdSourceNameForEvents(strOptString2);
                            networkSettingsB.setProviderNetworkKey(strOptString3);
                        } else {
                            if (b(strOptString4)) {
                                NetworkSettings networkSettingsB2 = this.f26629b.b("Mediation");
                                JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                                JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                                JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                                JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                                networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.mergeJsons(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectMergeJsons), IronSourceUtils.mergeJsons(new JSONObject(interstitialSettings2.toString()), jSONObjectMergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), jSONObjectMergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), jSONObjectMergeJsons4));
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                            } else {
                                networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectMergeJsons, jSONObjectMergeJsons2, jSONObjectMergeJsons3, jSONObjectMergeJsons4);
                                networkSettings.setIsMultipleInstances(zOptBoolean);
                                networkSettings.setSubProviderId(strOptString);
                                networkSettings.setAdSourceNameForEvents(strOptString2);
                            }
                            this.f26629b.a(networkSettings);
                            jSONObjectC = jSONObjectC;
                            itKeys = itKeys;
                        }
                    }
                }
                this.f26629b.b();
            } catch (Exception e3) {
                q9.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
        }

        public a h() {
            return this.f26632h;
        }

        public JSONObject i() {
            return this.f;
        }

        public cr j() {
            return this.f26628a;
        }

        public er k() {
            return this.f26629b;
        }

        public boolean o() {
            return !TextUtils.isEmpty(c().getTestSuiteSettings().b());
        }

        public boolean p() {
            JSONObject jSONObject = this.f;
            return (jSONObject == null || jSONObject.has("error") || this.f26628a == null || this.f26629b == null || this.f26630c == null || !m()) ? false : true;
        }

        public String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("appKey", this.d);
                jSONObject.put("userId", this.f26631e);
                jSONObject.put(f26623n, this.f);
            } catch (JSONException e3) {
                q9.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
            }
            return jSONObject.toString();
        }

        public qt(qt qtVar) {
            this.f26632h = a.NOT_SET;
            this.j = false;
            try {
                this.g = qtVar.d();
                this.f = new JSONObject(qtVar.f.toString());
                this.d = qtVar.d;
                this.f26631e = qtVar.f26631e;
                this.j = qtVar.j;
                this.f26628a = qtVar.j();
                this.f26629b = qtVar.k();
                this.f26630c = qtVar.c();
                this.f26632h = qtVar.h();
                this.f26633i = on.O().m();
                b(this.f);
            } catch (Exception e3) {
                q9.d().a(e3);
                a();
            }
        }

        private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
            long jOptLong;
            if (jSONObject.has(str)) {
                jOptLong = jSONObject.optLong(str, 0L);
            } else {
                jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
            }
            return jOptLong == 0 ? j : jOptLong;
        }

        private String b() {
            return this.j ? "adFormats" : w2.f27560c;
        }

        private h7 d(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            int iOptInt = jSONObject.optInt("placementId", -1);
            String strOptString = jSONObject.optString("placementName", "");
            boolean zOptBoolean = jSONObject.optBoolean("isDefault", false);
            nq nqVarA = a(jSONObject);
            if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
                return null;
            }
            h7 h7Var = new h7(iOptInt, strOptString, zOptBoolean, nqVarA);
            if (nqVarA != null) {
                this.f26633i.c(this.g, h7Var, IronSource.AD_UNIT.BANNER);
            }
            return h7Var;
        }

        private uv h(JSONObject jSONObject) {
            uv uvVar = new uv();
            JSONObject jSONObjectC = c(jSONObject, "testSuite");
            if (jSONObjectC != null) {
                uvVar.b(jSONObjectC.optString("controllerUrl"));
            }
            return uvVar;
        }

        public u8 c() {
            return this.f26630c;
        }

        public nc e() {
            return this.k;
        }

        public ti f() {
            return new ti(this.d, this.f26631e);
        }

        public List<IronSource.AD_UNIT> g() {
            cr crVar;
            cr crVar2;
            cr crVar3;
            cr crVar4;
            if (this.f == null || this.f26630c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (this.f26630c.getRewardedVideoConfigurations() != null && (crVar4 = this.f26628a) != null && !crVar4.d().isEmpty()) {
                arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
            }
            if (this.f26630c.getInterstitialConfigurations() != null && (crVar3 = this.f26628a) != null && !crVar3.b().isEmpty()) {
                arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
            }
            if (this.f26630c.getBannerConfigurations() != null && (crVar2 = this.f26628a) != null && !crVar2.a().isEmpty()) {
                arrayList.add(IronSource.AD_UNIT.BANNER);
            }
            if (this.f26630c.getNativeAdConfigurations() != null && (crVar = this.f26628a) != null && !crVar.c().isEmpty()) {
                arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
            }
            return arrayList;
        }

        private g4 a(JSONObject jSONObject, Boolean bool) {
            int[] iArr;
            int[] iArr2;
            int[] iArr3;
            boolean zOptBoolean = jSONObject.optBoolean("sendEventsToggle", false);
            boolean zOptBoolean2 = jSONObject.optBoolean("eventsCompression", false);
            int iOptInt = jSONObject.optInt("eventsCompressionLevel", -1);
            String strOptString = jSONObject.optString("serverEventsURL", "");
            String strOptString2 = jSONObject.optString("serverEventsType", "");
            int iOptInt2 = jSONObject.optInt("backupThreshold", -1);
            int iOptInt3 = jSONObject.optInt("maxNumberOfEvents", -1);
            int iOptInt4 = jSONObject.optInt("maxEventsPerBatch", 5000);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("optOut");
            int[] iArr4 = null;
            if (jSONArrayOptJSONArray != null) {
                int[] iArr5 = new int[jSONArrayOptJSONArray.length()];
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    iArr5[i3] = jSONArrayOptJSONArray.optInt(i3);
                }
                iArr = iArr5;
            } else {
                iArr = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
            if (jSONArrayOptJSONArray2 != null) {
                int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
                for (int i4 = 0; i4 < jSONArrayOptJSONArray2.length(); i4++) {
                    iArr6[i4] = jSONArrayOptJSONArray2.optInt(i4);
                }
                iArr2 = iArr6;
            } else {
                iArr2 = null;
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
            if (jSONArrayOptJSONArray3 != null) {
                int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
                for (int i5 = 0; i5 < jSONArrayOptJSONArray3.length(); i5++) {
                    iArr7[i5] = jSONArrayOptJSONArray3.optInt(i5);
                }
                iArr3 = iArr7;
            } else {
                iArr3 = null;
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
            if (jSONArrayOptJSONArray4 != null) {
                iArr4 = new int[jSONArrayOptJSONArray4.length()];
                for (int i6 = 0; i6 < jSONArrayOptJSONArray4.length(); i6++) {
                    iArr4[i6] = jSONArrayOptJSONArray4.optInt(i6);
                }
            }
            return new g4(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
        }

        private JSONArray b(JSONObject jSONObject, String str) {
            if (jSONObject == null) {
                return null;
            }
            if (!this.j) {
                return jSONObject.optJSONArray(str);
            }
            JSONObject jSONObjectC = c(jSONObject, str);
            String strA = a(str);
            if (jSONObjectC == null || strA == null) {
                return null;
            }
            return jSONObjectC.optJSONArray(strA);
        }

        private JSONObject c(JSONObject jSONObject, String str) {
            if (jSONObject != null) {
                return jSONObject.optJSONObject(str);
            }
            return null;
        }

        private JSONObject d(JSONObject jSONObject, String str) {
            JSONObject jSONObjectC = c(jSONObject, str);
            return jSONObjectC != null ? jSONObjectC : new JSONObject();
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r7
  0x0036: PHI (r7v3 com.ironsource.rq) = (r7v1 com.ironsource.rq), (r7v2 com.ironsource.rq) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
        private nq a(JSONObject jSONObject) {
            rq rqVar = null;
            if (jSONObject == null) {
                return null;
            }
            nq.b bVar = new nq.b();
            bVar.a(jSONObject.optBoolean("delivery", true));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("capping");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString(n1);
                if (!TextUtils.isEmpty(strOptString)) {
                    rq rqVar2 = rq.PER_DAY;
                    if (rqVar2.toString().equals(strOptString)) {
                        rqVar = rqVar2;
                    } else {
                        rqVar2 = rq.PER_HOUR;
                        if (rqVar2.toString().equals(strOptString)) {
                            rqVar = rqVar2;
                        }
                    }
                }
                int iOptInt = jSONObjectOptJSONObject.optInt(l1, 0);
                bVar.a(jSONObjectOptJSONObject.optBoolean("enabled", false) && iOptInt > 0, rqVar, iOptInt);
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("pacing");
            if (jSONObjectOptJSONObject2 != null) {
                int iOptInt2 = jSONObjectOptJSONObject2.optInt(m1, 0);
                bVar.a(jSONObjectOptJSONObject2.optBoolean("enabled", false) && iOptInt2 > 0, iOptInt2);
            }
            return bVar.a();
        }

        private void b(JSONObject jSONObject) {
            this.k = new nc(jSONObject.optJSONObject(xs.d));
        }

        public static a a(qt qtVar) {
            return qtVar != null ? qtVar.h() : a.NOT_SET;
        }

        private boolean b(String str) {
            return this.f26629b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
        }

        private String a(String str) {
            try {
                JSONObject jSONObjectC = c(c(c(c(this.f, "configurations"), "adFormats"), str), w2.f27560c);
                if (jSONObjectC == null) {
                    return null;
                }
                Iterator<String> itKeys = jSONObjectC.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    JSONObject jSONObjectC2 = c(jSONObjectC, next);
                    if (jSONObjectC2 != null && jSONObjectC2.optBoolean("isDefault")) {
                        return next;
                    }
                }
                return null;
            } catch (Exception e3) {
                q9.d().a(e3);
                IronLog.INTERNAL.error(e3.toString());
                return null;
            }
        }

        private void a() {
            this.f = new JSONObject();
            this.d = "";
            this.f26631e = "";
            this.f26628a = new cr();
            this.f26629b = er.c();
            this.f26630c = new u8.a().a();
            this.f26633i = on.O().m();
            b(this.f);
        }

        public void a(a aVar) {
            this.f26632h = aVar;
        }

        private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z2) {
            if (jSONObject.has(str)) {
                return jSONObject.optBoolean(str, z2);
            }
            return jSONObject2.has(str) ? jSONObject2.optBoolean(str, z2) : z2;
        }

        private int[] a(JSONObject jSONObject, String str) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
            if (jSONArrayOptJSONArray == null) {
                return null;
            }
            int[] iArr = new int[jSONArrayOptJSONArray.length()];
            for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                iArr[i3] = jSONArrayOptJSONArray.optInt(i3);
            }
            return iArr;
        }
    }
