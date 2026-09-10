package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class Ve {
    protected static final boolean A = false;
    protected static final String A0 = "waitUntilAllProvidersFinishInit";
    protected static final String A1 = "providerNetworkKey";
    protected static final int B = 60;
    protected static final String B0 = "sharedManagersThread";
    protected static final String B1 = "spId";
    protected static final int C = 10000;
    protected static final String C0 = "parallelLoad";
    protected static final String C1 = "mpis";
    protected static final int D = 10000;
    protected static final String D0 = "bidderExclusive";
    protected static final String D1 = "auction";
    protected static final int E = -1;
    protected static final String E0 = "adapterTimeOutInSeconds";
    protected static final String E1 = "auctionData";
    protected static final int F = 5000;
    protected static final String F0 = "atim";
    protected static final String F1 = "auctioneerURL";
    protected static final int G = 3;
    protected static final String G0 = "bannerInterval";
    protected static final String G1 = "extAuctioneerURL";
    protected static final int H = 3;
    protected static final String H0 = "isOneFlow";
    protected static final String H1 = "objectPerWaterfall";
    protected static final int I = 3;
    protected static final String I0 = "expiredDurationInMinutes";
    protected static final String I1 = "minTimeBeforeFirstAuction";
    protected static final int J = 0;
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
    protected static final long N = 3000;
    protected static final String N0 = "sendEventsToggle";
    protected static final String N1 = "auctionTrials";
    protected static final boolean O = false;
    protected static final String O0 = "eventsCompression";
    protected static final String O1 = "auctionTimeout";
    protected static final boolean P = false;
    protected static final String P0 = "eventsCompressionLevel";
    protected static final String P1 = "auctionSavedHistory";
    protected static final int Q = 30000;
    protected static final String Q0 = "serverEventsURL";
    protected static final String Q1 = "disableLoadWhileShowSupportFor";
    protected static final int R = -1;
    protected static final String R0 = "serverEventsType";
    protected static final String R1 = "tokenPerAdapter";
    protected static final int S = 5000;
    protected static final String S0 = "backupThreshold";
    protected static final String S1 = "enableAuctionFallback";
    protected static final int T = 1;
    protected static final String T0 = "maxNumberOfEvents";
    protected static final String T1 = "timeToDeleteOldWaterfallAfterAuction";
    protected static final boolean U = false;
    protected static final String U0 = "maxEventsPerBatch";
    protected static final String U1 = "compressAuctionRequest";
    protected static final int V = 15000;
    protected static final String V0 = "optOut";
    protected static final String V1 = "compressAuctionResponse";
    protected static final int W = 15000;
    protected static final String W0 = "optIn";
    protected static final String W1 = "encryptionVersion";
    protected static final String X = "providerOrder";
    protected static final String X0 = "triggerEvents";
    protected static final String X1 = "shouldSendBannerBURLFromImpression";
    protected static final String Y = "providerSettings";
    protected static final String Y0 = "nonConnectivityEvents";
    protected static final String Y1 = "impressionTimeout";
    protected static final String Z = "configurations";
    protected static final String Z0 = "shouldSendPublisherLogsOnUIThread";
    protected static final String Z1 = "optInKeys";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    protected static final String f27404a0 = "genericParams";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    protected static final String f27405a1 = "pixel";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    protected static final String f27406a2 = "tokenGenericParams";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    protected static final String f27407b0 = "adUnits";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    protected static final String f27408b1 = "pixelEventsUrl";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    protected static final String f27409b2 = "compressToken";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    protected static final String f27410c0 = "providerLoadName";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    protected static final String f27411c1 = "pixelEventsEnabled";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    protected static final String f27412c2 = "compressExternalToken";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected static final String f27413d0 = "application";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    protected static final String f27414d1 = "placements";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    protected static final String f27415d2 = "instanceType";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    protected static final String f27416e0 = "rewardedVideo";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    protected static final String f27417e1 = "placementId";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    protected static final String f27418e2 = "maxAdsPerSession";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    protected static final String f27419f0 = "interstitial";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    protected static final String f27420f1 = "placementName";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    protected static final String f27421f2 = "reward";
    protected static final String g0 = "banner";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    protected static final String f27422g1 = "delivery";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    protected static final String f27423g2 = "name";

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected static final String f27424h0 = "nativeAd";
    protected static final String h1 = "isDefault";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    protected static final String f27425h2 = "amount";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected static final String f27426i0 = "integration";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    protected static final String f27427i1 = "capping";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    protected static final String f27428i2 = "bannerRefreshRate";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    protected static final String f27429j0 = "loggers";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    protected static final String f27430j1 = "pacing";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    protected static final String f27431j2 = "protocolVersion";

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    protected static final String f27432k0 = "segment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    protected static final String f27433k1 = "enabled";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    protected static final String f27434k2 = "adFormats";
    public static final String l = "appKey";

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected static final String f27435l0 = "events";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    protected static final String f27436l1 = "maxImpressions";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    protected static final String f27437l2 = "adUnits";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f27438m = "userId";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected static final String f27439m0 = "crashReporter";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    protected static final String f27440m1 = "numOfSeconds";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    protected static final String f27441m2 = "rewarded";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f27442n = "response";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    protected static final String f27443n0 = "token";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    protected static final String f27444n1 = "unit";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final String f27445n2 = "preload";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected static final String f27446o = "error";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected static final String f27447o0 = "external";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    protected static final String f27448o1 = "virtualItemName";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected static final int f27449p = 3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected static final String f27450p0 = "mediationTypes";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    protected static final String f27451p1 = "virtualItemCount";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected static final boolean f27452q = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    protected static final String f27453q0 = "providerDefaultInstance";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    protected static final String f27454q1 = "uuidEnabled";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final boolean f27455r = true;
    protected static final String r0 = "testSuite";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    protected static final String f27456r1 = "abt";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final boolean f27457s = true;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    protected static final String f27458s0 = "controllerUrl";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    protected static final String f27459s1 = "delayLoadFailure";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final int f27460t = 2;
    protected static final String t0 = "AdQuality";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    protected static final String f27461t1 = "keysToInclude";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final int f27462u = 2;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    protected static final String f27463u0 = "initMode";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    protected static final String f27464u1 = "reporterURL";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected static final int f27465v = 1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    protected static final String f27466v0 = "adq_init_blob";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    protected static final String f27467v1 = "reporterKeyword";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected static final int f27468w = 1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    protected static final String f27469w0 = "settings";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    protected static final String f27470w1 = "includeANR";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected static final boolean f27471x = true;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    protected static final String f27472x0 = "collectBiddingDataTimeout";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    protected static final String f27473x1 = "timeout";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected static final boolean f27474y = false;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    protected static final String f27475y0 = "providers";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    protected static final String f27476y1 = "setIgnoreDebugger";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final boolean f27477z = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    protected static final String f27478z0 = "parallelInit";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    protected static final String f27479z1 = "adSourceName";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Id f27480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Ld f27481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private N3 f27482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f27483d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f27484e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f27485f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f27486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private a f27487h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private M7.a f27488i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f27489j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private N5 f27490k;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27495a;

        a(String str) {
            this.f27495a = str;
        }

        public String b() {
            return this.f27495a;
        }
    }

    public Ve(Context context, String str, String str2, String str3) {
        this.f27487h = a.NOT_SET;
        this.f27489j = false;
        this.f27486g = context;
        this.f27488i = Kb.Q().x();
        try {
            if (TextUtils.isEmpty(str3)) {
                this.f27485f = new JSONObject();
            } else {
                this.f27485f = new JSONObject(str3);
            }
            this.f27489j = o();
            t();
            r();
            s();
            this.f27483d = TextUtils.isEmpty(str) ? "" : str;
            this.f27484e = TextUtils.isEmpty(str2) ? "" : str2;
            b(this.f27485f);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            a();
        }
    }

    public static a a(Ve ve) {
        return ve != null ? ve.i() : a.NOT_SET;
    }

    private void b(JSONObject jSONObject) {
        this.f27490k = new N5(jSONObject.optJSONObject(C0663xe.f31076d));
    }

    private JSONObject c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    private C0312e3 d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        C0376hd c0376hdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C0312e3 c0312e3 = new C0312e3(iOptInt, strOptString, zOptBoolean, c0376hdA);
        if (c0376hdA != null) {
            this.f27488i.b(this.f27486g, c0312e3, IronSource.a.BANNER);
        }
        return c0312e3;
    }

    private C0267bc f(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        C0376hd c0376hdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        C0267bc c0267bc = new C0267bc(iOptInt, strOptString, zOptBoolean, c0376hdA);
        if (c0376hdA != null) {
            this.f27488i.b(this.f27486g, c0267bc, IronSource.a.NATIVE_AD);
        }
        return c0267bc;
    }

    private String m() {
        return this.f27489j ? "rewarded" : "rewardedVideo";
    }

    private boolean n() {
        JSONObject jSONObjectC;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectC2 = c(this.f27485f, "providerOrder");
        JSONArray jSONArrayNames = jSONObjectC2.names();
        if (jSONArrayNames == null) {
            return true;
        }
        JSONObject jSONObjectC3 = c(c(this.f27485f, "configurations"), b());
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10);
            JSONArray jSONArrayOptJSONArray2 = jSONObjectC2.optJSONArray(strOptString);
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() != 0 && (jSONObjectC = c(jSONObjectC3, strOptString)) != null && ((jSONArrayOptJSONArray = jSONObjectC.optJSONArray("placements")) == null || jSONArrayOptJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    private boolean o() {
        int iOptInt;
        try {
            iOptInt = this.f27485f.optInt(f27431j2, 0);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            iOptInt = 0;
        }
        return iOptInt == 1;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x00b5  */
    private void r() {
        String str;
        String str2;
        JSONObject jSONObject;
        String str3;
        String str4;
        JSONObject jSONObject2;
        C0323ee c0323ee;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        E9 e10;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        JSONObject jSONObject6;
        String str23;
        String str24;
        String str25;
        String str26;
        JSONObject jSONObject7;
        String str27;
        U2 u6;
        String str28;
        JSONObject jSONObject8;
        U2 u10;
        String str29;
        Qb qb2;
        boolean zOptBoolean;
        String str30;
        JSONObject jSONObjectC;
        C0561s2 c0561s2;
        JSONObject jSONObjectC2;
        C0561s2 c0561s3;
        String str31;
        C0561s2 c0561s4;
        C0561s2 c0561s5;
        try {
            JSONObject jSONObjectC3 = c(this.f27485f, "configurations");
            JSONObject jSONObjectC4 = c(jSONObjectC3, b());
            JSONObject jSONObjectC5 = c(jSONObjectC3, "application");
            JSONObject jSONObjectC6 = c(jSONObjectC4, m());
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
            JSONObject jSONObjectC18 = c(jSONObjectC10, f27405a1);
            if (jSONObjectC5 != null) {
                IronSourceUtils.b(this.f27486g, "uuidEnabled", jSONObjectC5.optBoolean("uuidEnabled", true));
            }
            if (jSONObjectC10 != null) {
                String strOptString = jSONObjectC10.optString("abt");
                if (TextUtils.isEmpty(strOptString)) {
                    str = null;
                } else {
                    Kb.Y().q().a(strOptString);
                    G9.i().a(strOptString);
                    C0359ge.i().a(strOptString);
                    str = strOptString;
                }
            } else {
                str = null;
            }
            J1 j1A = a(jSONObjectC10, Boolean.valueOf(jSONObjectC10.optBoolean("sendUltraEvents", false)));
            String str32 = "bidderExclusive";
            String str33 = "isOneFlow";
            String str34 = I1;
            String str35 = S1;
            String str36 = R1;
            String str37 = U1;
            String str38 = W1;
            String str39 = V1;
            String str40 = P1;
            String str41 = O1;
            String str42 = "auctionTrials";
            String str43 = G1;
            String str44 = f27478z0;
            String str45 = f27459s1;
            String str46 = f27472x0;
            String str47 = F1;
            String str48 = E1;
            if (jSONObjectC6 != null) {
                str2 = "";
                JSONArray jSONArrayOptJSONArray = jSONObjectC6.optJSONArray("placements");
                JSONObject jSONObjectC19 = c(jSONObjectC6, "events");
                JSONObject jSONObjectD = d(jSONObjectC6, f27475y0);
                long jOptLong = jSONObjectC6.optLong(f27472x0, 3000L);
                boolean zOptBoolean2 = jSONObjectD.optBoolean(f27478z0, false);
                boolean zOptBoolean3 = jSONObjectD.optBoolean(A0, false);
                boolean zOptBoolean4 = jSONObjectC6.optBoolean(B0, true);
                int iA = a(jSONObjectC6, jSONObjectC5, "parallelLoad", 2);
                boolean zA = a(jSONObjectC6, jSONObjectC5, "bidderExclusive", true);
                str3 = E0;
                int iA2 = a(jSONObjectC6, jSONObjectC5, str3, 60);
                int iA3 = a(jSONObjectC6, jSONObjectC5, "expiredDurationInMinutes", -1);
                str45 = str45;
                int iA4 = a(jSONObjectC6, jSONObjectC5, str45, 3);
                boolean zA2 = a(jSONObjectC6, jSONObjectC5, "isOneFlow", false);
                JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC19, jSONObjectC10);
                jSONObject = jSONObjectC10;
                J1 j1A2 = a(jSONObjectB, Boolean.valueOf(jSONObjectB.optBoolean("sendUltraEvents", false)));
                if (jSONObjectC14 != null) {
                    JSONObject jSONObjectC20 = c(jSONObjectC14, m());
                    String strOptString2 = jSONObjectC14.optString(str48, str2);
                    String strOptString3 = jSONObjectC14.optString(str47, str2);
                    String strOptString4 = jSONObjectC14.optString(str43, str2);
                    int iOptInt = jSONObjectC14.optInt(str42, 2);
                    long jOptLong2 = jSONObjectC14.optLong(str41, 10000L);
                    int iOptInt2 = jSONObjectC14.optInt(str40, 15);
                    boolean zOptBoolean5 = jSONObjectC14.optBoolean(str37, false);
                    boolean zOptBoolean6 = jSONObjectC14.optBoolean(str39, false);
                    int iOptInt3 = jSONObjectC14.optInt(str38, 1);
                    boolean zOptBoolean7 = jSONObjectC14.optBoolean(str36, true);
                    boolean zOptBoolean8 = jSONObjectC20.optBoolean(str35, true);
                    int iOptInt4 = jSONObjectC20.optInt(str34, 2000);
                    jSONObject2 = jSONObjectC14;
                    int iOptInt5 = jSONObjectC20.optInt(L1, 30000);
                    str4 = L1;
                    C0561s2 c0561s6 = new C0561s2(strOptString2, strOptString3, strOptString4, iOptInt, iOptInt2, jOptLong2, iOptInt4, iOptInt5, jSONObjectC20.optInt(J1, 5000), jSONObjectC20.optInt(K1, 50), jSONObjectC20.optBoolean("isLoadWhileShow", true), jSONObjectC20.optInt(T1, 30000), zOptBoolean5, zOptBoolean6, jSONObjectC20.optBoolean(H1, false), iOptInt3, false, zOptBoolean7, zOptBoolean8);
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectC20.optJSONArray(Q1);
                    if (jSONArrayOptJSONArray2 != null) {
                        str48 = str48;
                        str47 = str47;
                        str2 = str2;
                        str43 = str43;
                        str42 = str42;
                        str41 = str41;
                        str37 = str37;
                        str39 = str39;
                        str38 = str38;
                        str36 = str36;
                        str35 = str35;
                        str40 = str40;
                        str34 = str34;
                        for (int i10 = 0; i10 < jSONArrayOptJSONArray2.length(); i10++) {
                            c0561s6.a(jSONArrayOptJSONArray2.optString(i10));
                        }
                    }
                    str48 = str48;
                    str47 = str47;
                    str2 = str2;
                    str43 = str43;
                    str42 = str42;
                    str41 = str41;
                    str37 = str37;
                    str39 = str39;
                    str38 = str38;
                    str36 = str36;
                    str35 = str35;
                    str40 = str40;
                    str34 = str34;
                    c0561s5 = c0561s6;
                } else {
                    str4 = L1;
                    jSONObject2 = jSONObjectC14;
                    c0561s5 = new C0561s2();
                }
                C0323ee c0323ee2 = new C0323ee(iA, zA, iA2, iA3, j1A2, c0561s5, iA4, zA2, jOptLong, zOptBoolean2, zOptBoolean3, zOptBoolean4);
                if (jSONArrayOptJSONArray != null) {
                    for (int i11 = 0; i11 < jSONArrayOptJSONArray.length(); i11++) {
                        C0358gd c0358gdG = g(jSONArrayOptJSONArray.optJSONObject(i11));
                        if (c0358gdG != null) {
                            c0323ee2.a(c0358gdG);
                        }
                    }
                }
                c0323ee = c0323ee2;
            } else {
                str2 = "";
                str32 = "bidderExclusive";
                jSONObject = jSONObjectC10;
                str3 = E0;
                str4 = L1;
                jSONObject2 = jSONObjectC14;
                jSONObjectC5 = jSONObjectC5;
                str33 = "isOneFlow";
                c0323ee = null;
            }
            if (jSONObjectC7 != null) {
                str13 = "placements";
                JSONArray jSONArrayOptJSONArray3 = jSONObjectC7.optJSONArray(str13);
                JSONObject jSONObjectC21 = c(jSONObjectC7, "events");
                JSONObject jSONObjectD2 = d(jSONObjectC7, f27475y0);
                jSONObject4 = jSONObjectC5;
                str14 = "events";
                long jOptLong3 = jSONObjectC7.optLong(f27472x0, 3000L);
                boolean zOptBoolean9 = jSONObjectD2.optBoolean(f27478z0, false);
                boolean zOptBoolean10 = jSONObjectD2.optBoolean(A0, false);
                boolean zOptBoolean11 = jSONObjectC7.optBoolean(B0, true);
                int iA5 = a(jSONObjectC7, jSONObject4, "parallelLoad", 2);
                boolean zA3 = a(jSONObjectC7, jSONObject4, str32, false);
                int iA6 = a(jSONObjectC7, jSONObject4, str3, 60);
                str45 = str45;
                int iA7 = a(jSONObjectC7, jSONObject4, str45, 3);
                str11 = str33;
                boolean zA4 = a(jSONObjectC7, jSONObject4, str11, false);
                jSONObject5 = jSONObject;
                J1 j1A3 = a(IronSourceUtils.b(jSONObjectC21, jSONObject5), Boolean.FALSE);
                if (jSONObject2 != null) {
                    JSONObject jSONObject9 = jSONObject2;
                    JSONObject jSONObjectC22 = c(jSONObject9, "interstitial");
                    String str49 = str48;
                    String str50 = str2;
                    String strOptString5 = jSONObject9.optString(str49, str50);
                    str48 = str49;
                    str12 = str47;
                    String str51 = str43;
                    str2 = str50;
                    str10 = str42;
                    str43 = str51;
                    String str52 = str40;
                    str40 = str52;
                    str9 = str41;
                    String str53 = str37;
                    String str54 = str39;
                    String str55 = str38;
                    str7 = str53;
                    str39 = str54;
                    str5 = str36;
                    str6 = str55;
                    str31 = str35;
                    jSONObject3 = jSONObject9;
                    str8 = str34;
                    c0561s4 = new C0561s2(strOptString5, jSONObject9.optString(str12, str50), jSONObject9.optString(str51, str50), jSONObject9.optInt(str10, 2), jSONObject9.optInt(str52, 15), jSONObject9.optLong(str9, 10000L), jSONObjectC22.optInt(str8, 2000), 0L, 0L, 0L, true, 0, jSONObject9.optBoolean(str53, false), jSONObject9.optBoolean(str54, false), true, jSONObject9.optInt(str55, 1), false, jSONObject9.optBoolean(str5, true), jSONObjectC22.optBoolean(str31, true));
                } else {
                    str5 = str36;
                    str6 = str38;
                    str7 = str37;
                    jSONObject3 = jSONObject2;
                    str8 = str34;
                    str31 = str35;
                    str10 = str42;
                    str12 = str47;
                    str9 = str41;
                    c0561s4 = new C0561s2();
                }
                E9 e11 = new E9(iA5, zA3, iA6, j1A3, c0561s4, iA7, zA4, jOptLong3, zOptBoolean9, zOptBoolean10, zOptBoolean11);
                str35 = str31;
                if (jSONArrayOptJSONArray3 != null) {
                    for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                        I9 i9E = e(jSONArrayOptJSONArray3.optJSONObject(i12));
                        if (i9E != null) {
                            e11.a(i9E);
                        }
                    }
                }
                e10 = e11;
            } else {
                String str56 = str37;
                c0323ee = c0323ee;
                str5 = str36;
                str6 = str38;
                str7 = str56;
                str44 = f27478z0;
                str46 = f27472x0;
                str8 = str34;
                str9 = str41;
                str10 = str42;
                str11 = str33;
                str12 = str47;
                str13 = r9;
                jSONObject3 = jSONObject2;
                jSONObject4 = jSONObjectC5;
                jSONObject5 = jSONObject;
                e10 = null;
            }
            if (jSONObjectC8 != null) {
                JSONArray jSONArrayOptJSONArray4 = jSONObjectC8.optJSONArray(str13);
                String str57 = str14;
                JSONObject jSONObjectC23 = c(jSONObjectC8, str57);
                JSONObject jSONObjectD3 = d(jSONObjectC8, f27475y0);
                JSONObject jSONObject10 = jSONObject5;
                str16 = str12;
                str18 = str10;
                str21 = str46;
                jSONObject4 = jSONObject4;
                String str58 = str35;
                str22 = str6;
                String str59 = str7;
                String str60 = str40;
                str15 = f27475y0;
                str23 = str45;
                String str61 = str48;
                str27 = str2;
                str25 = str57;
                str26 = str5;
                String str62 = str9;
                str20 = str44;
                str17 = str8;
                long jA = a(jSONObjectC8, jSONObject4, F0, 10000L);
                int iA8 = a(jSONObjectC8, jSONObject4, str23, 3);
                int iOptInt6 = jSONObjectC8.optInt(G0, 60);
                long jOptLong4 = jSONObjectC8.optLong(Y1, 15000L);
                boolean zA5 = a(jSONObjectC8, jSONObject4, str11, false);
                long jOptLong5 = jSONObjectC8.optLong(str21, 3000L);
                boolean zOptBoolean12 = jSONObjectD3.optBoolean(str20, false);
                boolean zOptBoolean13 = jSONObjectD3.optBoolean(A0, false);
                boolean zOptBoolean14 = jSONObjectC8.optBoolean(B0, true);
                jSONObject7 = jSONObject10;
                J1 j1A4 = a(IronSourceUtils.b(jSONObjectC23, jSONObject7), Boolean.FALSE);
                if (jSONObject3 != null) {
                    jSONObject6 = jSONObject3;
                    JSONObject jSONObjectC24 = c(jSONObject6, "banner");
                    if (jSONObjectC24 != null) {
                        str24 = str61;
                        String strOptString6 = jSONObject6.optString(str24, str27);
                        String strOptString7 = jSONObject6.optString(str16, str27);
                        String str63 = str43;
                        String strOptString8 = jSONObject6.optString(str63, str27);
                        int iOptInt7 = jSONObject6.optInt(str18, 2);
                        str43 = str63;
                        int iOptInt8 = jSONObject6.optInt(str60, 15);
                        str16 = str16;
                        str19 = str62;
                        long jOptLong6 = jSONObject6.optLong(str19, 10000L);
                        boolean zOptBoolean15 = jSONObject6.optBoolean(str59, false);
                        str40 = str60;
                        String str64 = str39;
                        boolean zOptBoolean16 = jSONObject6.optBoolean(str64, false);
                        str7 = str59;
                        int iOptInt9 = jSONObject6.optInt(str22, 1);
                        str39 = str64;
                        boolean zOptBoolean17 = jSONObject6.optBoolean(str26, true);
                        str26 = str26;
                        boolean zOptBoolean18 = jSONObjectC24.optBoolean(str58, true);
                        str22 = str22;
                        boolean zOptBoolean19 = jSONObjectC24.optBoolean(H1, true);
                        str35 = str58;
                        int iOptInt10 = jSONObjectC24.optInt(str17, 2000);
                        str17 = str17;
                        str18 = str18;
                        c0561s3 = new C0561s2(strOptString6, strOptString7, strOptString8, iOptInt7, iOptInt8, jOptLong6, iOptInt10, jSONObjectC24.optInt(str4, 15000), jSONObjectC24.optInt(J1, 50), 0L, jSONObjectC24.optBoolean("isLoadWhileShow", false), 0, zOptBoolean15, zOptBoolean16, zOptBoolean19, iOptInt9, jSONObjectC24.optBoolean(X1, true), zOptBoolean17, zOptBoolean18);
                    } else {
                        str19 = str62;
                        str35 = str58;
                        str7 = str59;
                        str40 = str60;
                        str24 = str61;
                        c0561s3 = new C0561s2();
                    }
                } else {
                    str19 = str62;
                    jSONObject6 = jSONObject3;
                    str35 = str58;
                    str7 = str59;
                    str40 = str60;
                    str24 = str61;
                    c0561s3 = new C0561s2();
                }
                U2 u11 = new U2(1, jA, false, j1A4, iOptInt6, c0561s3, iA8, zA5, jOptLong5, zOptBoolean12, zOptBoolean13, zOptBoolean14, jOptLong4);
                if (jSONArrayOptJSONArray4 != null) {
                    for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                        C0312e3 c0312e3D = d(jSONArrayOptJSONArray4.optJSONObject(i13));
                        if (c0312e3D != null) {
                            u11.a(c0312e3D);
                        }
                    }
                }
                u6 = u11;
            } else {
                str15 = f27475y0;
                str16 = str12;
                str17 = str8;
                str18 = str10;
                str19 = str9;
                str20 = str44;
                str21 = str46;
                str22 = str6;
                jSONObject6 = jSONObject3;
                str23 = str45;
                str24 = str48;
                str25 = str14;
                str26 = str5;
                jSONObject7 = jSONObject5;
                str27 = str2;
                u6 = null;
            }
            if (jSONObjectC9 != null) {
                JSONArray jSONArrayOptJSONArray5 = jSONObjectC9.optJSONArray(str13);
                String str65 = str25;
                JSONObject jSONObjectC25 = c(jSONObjectC9, str65);
                JSONObject jSONObjectD4 = d(jSONObjectC9, str15);
                String str66 = str19;
                String str67 = str27;
                jSONObject8 = jSONObject4;
                String str68 = str17;
                String str69 = str35;
                String str70 = str26;
                String str71 = str7;
                String str72 = str39;
                String str73 = str40;
                String str74 = str18;
                String str75 = str43;
                String str76 = str16;
                str29 = str65;
                u10 = u6;
                String str77 = str22;
                long jA2 = a(jSONObjectC9, jSONObject8, F0, 10000L);
                int iA9 = a(jSONObjectC9, jSONObject8, str23, 0);
                long jOptLong7 = jSONObjectC9.optLong(str21, 3000L);
                boolean zOptBoolean20 = jSONObjectD4.optBoolean(str20, false);
                boolean zOptBoolean21 = jSONObjectD4.optBoolean(A0, false);
                boolean zOptBoolean22 = jSONObjectC9.optBoolean(B0, true);
                J1 j1A5 = a(IronSourceUtils.b(jSONObjectC25, jSONObject7), Boolean.FALSE);
                if (jSONObject6 == null || (jSONObjectC2 = c(jSONObject6, "nativeAd")) == null) {
                    str28 = str67;
                    c0561s2 = new C0561s2();
                } else {
                    str28 = str67;
                    c0561s2 = new C0561s2(jSONObject6.optString(str24, str28), jSONObject6.optString(str76, str28), jSONObject6.optString(str75, str28), jSONObject6.optInt(str74, 2), jSONObject6.optInt(str73, 15), jSONObject6.optLong(str66, 10000L), jSONObjectC2.optInt(str68, 2000), 0L, 0L, 0L, true, 0, jSONObject6.optBoolean(str71, false), jSONObject6.optBoolean(str72, false), true, jSONObject6.optInt(str77, 1), false, jSONObject6.optBoolean(str70, true), jSONObjectC2.optBoolean(str69, true));
                }
                qb2 = new Qb(1, jA2, false, j1A5, c0561s2, iA9, jOptLong7, zOptBoolean20, zOptBoolean21, zOptBoolean22);
                if (jSONArrayOptJSONArray5 != null) {
                    for (int i14 = 0; i14 < jSONArrayOptJSONArray5.length(); i14++) {
                        C0267bc c0267bcF = f(jSONArrayOptJSONArray5.optJSONObject(i14));
                        if (c0267bcF != null) {
                            qb2.a(c0267bcF);
                        }
                    }
                }
            } else {
                str28 = str27;
                jSONObject8 = jSONObject4;
                u10 = u6;
                str29 = str25;
                qb2 = null;
            }
            C0522pg c0522pg = new C0522pg();
            if (jSONObjectC12 != null) {
                JSONArray jSONArrayOptJSONArray6 = jSONObjectC12.optJSONArray(Z1);
                if (jSONArrayOptJSONArray6 != null) {
                    for (int i15 = 0; i15 < jSONArrayOptJSONArray6.length(); i15++) {
                        c0522pg.a(jSONArrayOptJSONArray6.optString(i15));
                    }
                }
                JSONObject jSONObjectOptJSONObject = jSONObjectC12.optJSONObject(f27406a2);
                if (jSONObjectOptJSONObject != null) {
                    c0522pg.a(jSONObjectOptJSONObject);
                }
                c0522pg.a(jSONObjectC12.optBoolean(f27409b2, true));
            }
            C0322ed c0322ed = new C0322ed();
            if (jSONObjectC18 != 0) {
                String strOptString9 = jSONObjectC18.optString(f27408b1, C0340fd.f28675a);
                zOptBoolean = jSONObjectC18.optBoolean(f27411c1, true);
                c0322ed.a(strOptString9);
            } else {
                zOptBoolean = true;
            }
            c0322ed.b(zOptBoolean);
            if (zOptBoolean) {
                c0322ed.b(a(jSONObject7, "optOut"));
                c0322ed.a(a(jSONObject7, "optIn"));
                c0322ed.a(jSONObject7.optBoolean("eventsCompression", false));
                c0322ed.a(jSONObject7.optInt("eventsCompressionLevel", -1));
            }
            Q1 q6 = new Q1(jSONObjectC11.optInt("server", 3), jSONObjectC11.optInt("publisher", 3), jSONObjectC11.optInt("console", 3), jSONObjectC11.optBoolean("shouldSendPublisherLogsOnUIThread", false));
            G1 g10 = new G1();
            if (jSONObjectC15 != null) {
                g10.a(jSONObjectC15.optBoolean("enabled", false));
                g10.c(jSONObjectC15.optString("reporterURL", str28));
                g10.b(jSONObjectC15.optString("reporterKeyword", str28));
                g10.c(jSONObjectC15.optBoolean("includeANR", false));
                g10.a(jSONObjectC15.optInt("timeout", 5000));
                g10.b(jSONObjectC15.optBoolean("setIgnoreDebugger", false));
                JSONArray jSONArrayOptJSONArray7 = jSONObjectC15.optJSONArray("keysToInclude");
                if (jSONArrayOptJSONArray7 != null) {
                    for (int i16 = 0; i16 < jSONArrayOptJSONArray7.length(); i16++) {
                        g10.a(jSONArrayOptJSONArray7.optString(i16));
                    }
                }
            }
            We we2 = jSONObjectC13 != null ? new We(jSONObjectC13.optString("name", str28), jSONObjectC13.optString("id", C0239a2.f28156f), jSONObjectC13.optJSONObject("custom")) : null;
            M1 m7 = new M1(jSONObjectC16 != null ? jSONObjectC16 : new JSONObject());
            L1 l10 = new L1();
            if (jSONObjectC17 != null) {
                JSONObject jSONObjectOptJSONObject2 = jSONObjectC17.optJSONObject(f27450p0);
                Map map = new HashMap();
                if (jSONObjectOptJSONObject2 != null) {
                    map = IronSourceUtils.b(jSONObjectOptJSONObject2);
                }
                l10 = new L1(map);
            }
            A1 a8 = new A1();
            if (jSONObject6 != null) {
                a8 = new A1(jSONObject6.optString(str24));
            }
            C1 c4 = new C1(q6, we2, c0522pg, jSONObject8.optBoolean("integration", false), g10, m7, l10, c0322ed, a8, str, j1A);
            C0253ag c0253agH = h(jSONObjectC3);
            com.ironsource.mediationsdk.adquality.a aVarC = c(jSONObjectC3);
            N3.a aVar = new N3.a();
            aVar.a(c0323ee);
            aVar.a(e10);
            aVar.a(u10);
            aVar.a(qb2);
            aVar.a(c4);
            aVar.b(c0253agH);
            aVar.a(aVarC);
            N3 n3A = aVar.a();
            this.f27482c = n3A;
            IronLog.INTERNAL.verbose(n3A.toString());
            JSONObject jSONObjectC26 = c(jSONObject7, "genericParams");
            if (jSONObjectC26 != null && (jSONObjectC = c(jSONObjectC26, (str30 = str29))) != null) {
                jSONObjectC26.remove(str30);
                Map<String, String> mapB = IronSourceUtils.b(jSONObjectC);
                Kb.Y().q().b(mapB);
                C0359ge.i().b(mapB);
                G9.i().b(mapB);
            }
            if (jSONObjectC26 != null) {
                Map<String, String> mapB2 = IronSourceUtils.b(jSONObjectC26);
                Kb.Y().q().a(mapB2);
                C0359ge.i().a(mapB2);
                G9.i().a(mapB2);
            }
        } catch (Exception e12) {
            C0474n4.d().a(e12);
            IronLog.INTERNAL.error(e12.toString());
        }
    }

    private void s() {
        try {
            JSONObject jSONObjectC = c(this.f27485f, "providerOrder");
            JSONArray jSONArrayB = b(jSONObjectC, m());
            JSONArray jSONArrayB2 = b(jSONObjectC, "interstitial");
            JSONArray jSONArrayB3 = b(jSONObjectC, "banner");
            JSONArray jSONArrayB4 = b(jSONObjectC, "nativeAd");
            this.f27480a = new Id();
            if (jSONArrayB != null && c() != null && c().f() != null) {
                for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
                    String strOptString = jSONArrayB.optString(i10);
                    this.f27480a.d(strOptString);
                    NetworkSettings networkSettingsB = Ld.c().b(strOptString);
                    if (networkSettingsB != null) {
                        networkSettingsB.setRewardedVideoPriority(i10);
                    }
                }
            }
            if (jSONArrayB2 != null && c() != null && c().d() != null) {
                for (int i11 = 0; i11 < jSONArrayB2.length(); i11++) {
                    String strOptString2 = jSONArrayB2.optString(i11);
                    this.f27480a.b(strOptString2);
                    NetworkSettings networkSettingsB2 = Ld.c().b(strOptString2);
                    if (networkSettingsB2 != null) {
                        networkSettingsB2.setInterstitialPriority(i11);
                    }
                }
            }
            if (jSONArrayB3 != null) {
                for (int i12 = 0; i12 < jSONArrayB3.length(); i12++) {
                    String strOptString3 = jSONArrayB3.optString(i12);
                    this.f27480a.a(strOptString3);
                    NetworkSettings networkSettingsB3 = Ld.c().b(strOptString3);
                    if (networkSettingsB3 != null) {
                        networkSettingsB3.setBannerPriority(i12);
                    }
                }
            }
            if (jSONArrayB4 != null) {
                for (int i13 = 0; i13 < jSONArrayB4.length(); i13++) {
                    String strOptString4 = jSONArrayB4.optString(i13);
                    this.f27480a.c(strOptString4);
                    NetworkSettings networkSettingsB4 = Ld.c().b(strOptString4);
                    if (networkSettingsB4 != null) {
                        networkSettingsB4.setNativeAdPriority(i13);
                    }
                }
            }
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private void t() {
        try {
            this.f27481b = Ld.c();
            JSONObject jSONObjectC = c(this.f27485f, "providerSettings");
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
                    JSONObject jSONObjectC4 = c(jSONObjectC2, m());
                    JSONObject jSONObjectC5 = c(jSONObjectC2, "interstitial");
                    JSONObject jSONObjectC6 = c(jSONObjectC2, "banner");
                    JSONObject jSONObjectC7 = c(jSONObjectC2, "nativeAd");
                    JSONObject jSONObjectB = IronSourceUtils.b(jSONObjectC4, jSONObjectC3);
                    JSONObject jSONObjectB2 = IronSourceUtils.b(jSONObjectC5, jSONObjectC3);
                    JSONObject jSONObjectB3 = IronSourceUtils.b(jSONObjectC6, jSONObjectC3);
                    JSONObject jSONObjectB4 = IronSourceUtils.b(jSONObjectC7, jSONObjectC3);
                    if (this.f27481b.a(next)) {
                        Kb.Y().q().a(new C0654x5(EnumC0672y5.TROUBLESHOOTING_MERGE_LOCAL_SETTINGS, (JSONObject) null));
                        NetworkSettings networkSettingsB = this.f27481b.b(next);
                        JSONObject rewardedVideoSettings = networkSettingsB.getRewardedVideoSettings();
                        JSONObject interstitialSettings = networkSettingsB.getInterstitialSettings();
                        JSONObject bannerSettings = networkSettingsB.getBannerSettings();
                        JSONObject nativeAdSettings = networkSettingsB.getNativeAdSettings();
                        networkSettingsB.setRewardedVideoSettings(IronSourceUtils.b(rewardedVideoSettings, jSONObjectB));
                        networkSettingsB.setInterstitialSettings(IronSourceUtils.b(interstitialSettings, jSONObjectB2));
                        networkSettingsB.setBannerSettings(IronSourceUtils.b(bannerSettings, jSONObjectB3));
                        networkSettingsB.setNativeAdSettings(IronSourceUtils.b(nativeAdSettings, jSONObjectB4));
                        networkSettingsB.setIsMultipleInstances(zOptBoolean);
                        networkSettingsB.setSubProviderId(strOptString);
                        networkSettingsB.setAdSourceNameForEvents(strOptString2);
                        networkSettingsB.setProviderNetworkKey(strOptString3);
                    } else {
                        if (b(strOptString4)) {
                            NetworkSettings networkSettingsB2 = this.f27481b.b("Mediation");
                            JSONObject rewardedVideoSettings2 = networkSettingsB2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = networkSettingsB2.getInterstitialSettings();
                            JSONObject bannerSettings2 = networkSettingsB2.getBannerSettings();
                            JSONObject nativeAdSettings2 = networkSettingsB2.getNativeAdSettings();
                            NetworkSettings networkSettings = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, IronSourceUtils.b(new JSONObject(rewardedVideoSettings2.toString()), jSONObjectB), IronSourceUtils.b(new JSONObject(interstitialSettings2.toString()), jSONObjectB2), IronSourceUtils.b(new JSONObject(bannerSettings2.toString()), jSONObjectB3), IronSourceUtils.b(new JSONObject(nativeAdSettings2.toString()), jSONObjectB4));
                            networkSettings.setIsMultipleInstances(zOptBoolean);
                            networkSettings.setSubProviderId(strOptString);
                            networkSettings.setAdSourceNameForEvents(strOptString2);
                            this.f27481b.a(networkSettings);
                        } else {
                            NetworkSettings networkSettings2 = new NetworkSettings(next, strOptString4, strOptString5, strOptString3, jSONObjectC3, jSONObjectB, jSONObjectB2, jSONObjectB3, jSONObjectB4);
                            networkSettings2.setIsMultipleInstances(zOptBoolean);
                            networkSettings2.setSubProviderId(strOptString);
                            networkSettings2.setAdSourceNameForEvents(strOptString2);
                            this.f27481b.a(networkSettings2);
                        }
                        jSONObjectC = jSONObjectC;
                        itKeys = itKeys;
                    }
                }
            }
            this.f27481b.b();
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public String e() {
        JSONObject jSONObject = this.f27485f;
        if (jSONObject == null || !jSONObject.has("error")) {
            return null;
        }
        return this.f27485f.optString("error");
    }

    public Y8 g() {
        return new Y8(this.f27483d, this.f27484e);
    }

    public List<IronSource.a> h() {
        Id id2;
        Id id3;
        Id id4;
        Id id5;
        if (this.f27485f == null || this.f27482c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f27482c.f() != null && (id5 = this.f27480a) != null && !id5.d().isEmpty()) {
            arrayList.add(IronSource.a.REWARDED_VIDEO);
        }
        if (this.f27482c.d() != null && (id4 = this.f27480a) != null && !id4.b().isEmpty()) {
            arrayList.add(IronSource.a.INTERSTITIAL);
        }
        if (this.f27482c.c() != null && (id3 = this.f27480a) != null && !id3.a().isEmpty()) {
            arrayList.add(IronSource.a.BANNER);
        }
        if (this.f27482c.e() != null && (id2 = this.f27480a) != null && !id2.c().isEmpty()) {
            arrayList.add(IronSource.a.NATIVE_AD);
        }
        return arrayList;
    }

    public a i() {
        return this.f27487h;
    }

    public JSONObject j() {
        return this.f27485f;
    }

    public Id k() {
        return this.f27480a;
    }

    public Ld l() {
        return this.f27481b;
    }

    public boolean p() {
        return !TextUtils.isEmpty(c().g().b());
    }

    public boolean q() {
        JSONObject jSONObject = this.f27485f;
        return (jSONObject == null || jSONObject.has("error") || this.f27480a == null || this.f27481b == null || this.f27482c == null || !n()) ? false : true;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f27483d);
            jSONObject.put("userId", this.f27484e);
            jSONObject.put(f27442n, this.f27485f);
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }

    private String b() {
        return this.f27489j ? "adFormats" : C0238a1.f28149c;
    }

    private C0358gd g(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        String strOptString2 = jSONObject.optString("virtualItemName", "");
        int iOptInt2 = jSONObject.optInt("virtualItemCount", -1);
        C0376hd c0376hdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2) || iOptInt2 <= 0) {
            return null;
        }
        C0358gd c0358gd = new C0358gd(iOptInt, strOptString, zOptBoolean, strOptString2, iOptInt2, c0376hdA);
        if (c0376hdA != null) {
            this.f27488i.b(this.f27486g, c0358gd, IronSource.a.REWARDED_VIDEO);
        }
        return c0358gd;
    }

    public N3 c() {
        return this.f27482c;
    }

    private JSONArray b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (!this.f27489j) {
            return jSONObject.optJSONArray(str);
        }
        JSONObject jSONObjectC = c(jSONObject, str);
        String strA = a(str);
        if (jSONObjectC == null || strA == null) {
            return null;
        }
        return jSONObjectC.optJSONArray(strA);
    }

    private com.ironsource.mediationsdk.adquality.a c(JSONObject jSONObject) {
        com.ironsource.mediationsdk.adquality.a aVar = new com.ironsource.mediationsdk.adquality.a();
        JSONObject jSONObjectC = c(jSONObject, "AdQuality");
        if (jSONObjectC != null) {
            aVar.a(jSONObjectC.optInt("initMode", 0));
            new U9().b(jSONObjectC.optString("adq_init_blob"));
        }
        return aVar;
    }

    private I9 e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int iOptInt = jSONObject.optInt("placementId", -1);
        String strOptString = jSONObject.optString("placementName", "");
        boolean zOptBoolean = jSONObject.optBoolean(h1, false);
        C0376hd c0376hdA = a(jSONObject);
        if (iOptInt < 0 || TextUtils.isEmpty(strOptString)) {
            return null;
        }
        I9 i10 = new I9(iOptInt, strOptString, zOptBoolean, c0376hdA);
        if (c0376hdA != null) {
            this.f27488i.b(this.f27486g, i10, IronSource.a.INTERSTITIAL);
        }
        return i10;
    }

    public void a(a aVar) {
        this.f27487h = aVar;
    }

    private void a() {
        this.f27485f = new JSONObject();
        this.f27483d = "";
        this.f27484e = "";
        this.f27480a = new Id();
        this.f27481b = Ld.c();
        this.f27482c = new N3.a().a();
        this.f27488i = Kb.Q().x();
        b(this.f27485f);
    }

    private boolean b(String str) {
        return this.f27481b.a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    private JSONObject d(JSONObject jSONObject, String str) {
        JSONObject jSONObjectC = c(jSONObject, str);
        return jSONObjectC != null ? jSONObjectC : new JSONObject();
    }

    public N5 f() {
        return this.f27490k;
    }

    private Context d() {
        return this.f27486g;
    }

    private String a(String str) {
        try {
            JSONObject jSONObjectC = c(c(c(c(this.f27485f, "configurations"), "adFormats"), str), C0238a1.f28149c);
            if (jSONObjectC == null) {
                return null;
            }
            Iterator<String> itKeys = jSONObjectC.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectC2 = c(jSONObjectC, next);
                if (jSONObjectC2 != null && jSONObjectC2.optBoolean(h1)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return null;
        }
    }

    public static C0522pg b(Ve ve) {
        if (ve != null && ve.q()) {
            return ve.c().b().k();
        }
        return C0522pg.a();
    }

    private C0253ag h(JSONObject jSONObject) {
        C0253ag c0253ag = new C0253ag();
        JSONObject jSONObjectC = c(jSONObject, "testSuite");
        if (jSONObjectC != null) {
            c0253ag.b(jSONObjectC.optString("controllerUrl"));
        }
        return c0253ag;
    }

    public Ve(Ve ve) {
        this.f27487h = a.NOT_SET;
        this.f27489j = false;
        try {
            this.f27486g = ve.d();
            this.f27485f = new JSONObject(ve.f27485f.toString());
            this.f27483d = ve.f27483d;
            this.f27484e = ve.f27484e;
            this.f27489j = ve.f27489j;
            this.f27480a = ve.k();
            this.f27481b = ve.l();
            this.f27482c = ve.c();
            this.f27487h = ve.i();
            this.f27488i = Kb.Q().x();
            b(this.f27485f);
        } catch (Exception e10) {
            C0474n4.d().a(e10);
            a();
        }
    }

    private J1 a(JSONObject jSONObject, Boolean bool) {
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
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                iArr5[i10] = jSONArrayOptJSONArray.optInt(i10);
            }
            iArr = iArr5;
        } else {
            iArr = null;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("optIn");
        if (jSONArrayOptJSONArray2 != null) {
            int[] iArr6 = new int[jSONArrayOptJSONArray2.length()];
            for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                iArr6[i11] = jSONArrayOptJSONArray2.optInt(i11);
            }
            iArr2 = iArr6;
        } else {
            iArr2 = null;
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("triggerEvents");
        if (jSONArrayOptJSONArray3 != null) {
            int[] iArr7 = new int[jSONArrayOptJSONArray3.length()];
            for (int i12 = 0; i12 < jSONArrayOptJSONArray3.length(); i12++) {
                iArr7[i12] = jSONArrayOptJSONArray3.optInt(i12);
            }
            iArr3 = iArr7;
        } else {
            iArr3 = null;
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("nonConnectivityEvents");
        if (jSONArrayOptJSONArray4 != null) {
            iArr4 = new int[jSONArrayOptJSONArray4.length()];
            for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                iArr4[i13] = jSONArrayOptJSONArray4.optInt(i13);
            }
        }
        return new J1(bool.booleanValue(), zOptBoolean, zOptBoolean2, iOptInt, strOptString, strOptString2, iOptInt2, iOptInt3, iOptInt4, iArr, iArr2, iArr3, iArr4);
    }

    private int[] a(JSONObject jSONObject, String str) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArrayOptJSONArray.length()];
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            iArr[i10] = jSONArrayOptJSONArray.optInt(i10);
        }
        return iArr;
    }

    private boolean a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z10) {
        if (jSONObject.has(str)) {
            return jSONObject.optBoolean(str, z10);
        }
        return jSONObject2.has(str) ? jSONObject2.optBoolean(str, z10) : z10;
    }

    private int a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i10) {
        int iOptInt = 0;
        if (jSONObject.has(str)) {
            iOptInt = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            iOptInt = jSONObject2.optInt(str, 0);
        }
        return iOptInt == 0 ? i10 : iOptInt;
    }

    private long a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j10) {
        long jOptLong;
        if (jSONObject.has(str)) {
            jOptLong = jSONObject.optLong(str, 0L);
        } else {
            jOptLong = jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        }
        return jOptLong == 0 ? j10 : jOptLong;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r6
  0x0036: PHI (r6v3 com.ironsource.ld) = (r6v1 com.ironsource.ld), (r6v2 com.ironsource.ld) binds: [B:10:0x0034, B:13:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    private C0376hd a(JSONObject jSONObject) {
        EnumC0447ld enumC0447ld = null;
        if (jSONObject == null) {
            return null;
        }
        C0376hd.a aVar = new C0376hd.a();
        aVar.a(jSONObject.optBoolean("delivery", true));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("capping");
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(f27444n1);
            if (!TextUtils.isEmpty(strOptString)) {
                EnumC0447ld enumC0447ld2 = EnumC0447ld.PER_DAY;
                if (enumC0447ld2.toString().equals(strOptString)) {
                    enumC0447ld = enumC0447ld2;
                } else {
                    enumC0447ld2 = EnumC0447ld.PER_HOUR;
                    if (enumC0447ld2.toString().equals(strOptString)) {
                        enumC0447ld = enumC0447ld2;
                    }
                }
            }
            int iOptInt = jSONObjectOptJSONObject.optInt(f27436l1, 0);
            aVar.a(jSONObjectOptJSONObject.optBoolean("enabled", false) && iOptInt > 0, enumC0447ld, iOptInt);
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("pacing");
        if (jSONObjectOptJSONObject2 != null) {
            int iOptInt2 = jSONObjectOptJSONObject2.optInt(f27440m1, 0);
            aVar.a(jSONObjectOptJSONObject2.optBoolean("enabled", false) && iOptInt2 > 0, iOptInt2);
        }
        return aVar.a();
    }
}
