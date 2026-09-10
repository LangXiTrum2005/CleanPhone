package com.p004ironsource.mediationsdk;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.Z;
import com.p004ironsource.ac;
import com.p004ironsource.b5;
import com.p004ironsource.environment.ContextProvider;
import com.p004ironsource.environment.thread.IronSourceThreadManager;
import com.p004ironsource.f5;
import com.p004ironsource.hk;
import com.p004ironsource.ko;
import com.p004ironsource.m5;
import com.p004ironsource.mediationsdk.demandOnly.p;
import com.p004ironsource.mediationsdk.logger.IronLog;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import com.p004ironsource.ne;
import com.p004ironsource.on;
import com.p004ironsource.q9;
import com.p004ironsource.tk;
import com.p004ironsource.u4;
import com.p004ironsource.v2;
import com.p004ironsource.vf;
import com.p004ironsource.zb;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final boolean f25766A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static d f25767B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f25768c = "auctionId";
    public static final String d = "armData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f25769e = "larmData";
    public static final String f = "isAdUnitCapped";
    public static final String g = "settings";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f25770h = "waterfall";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f25771i = "genericParams";
    public static final String j = "configurations";
    public static final String k = "instances";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f25772l = "${AUCTION_LOSS}";
    public static final String m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f25773n = "${AUCTION_PRICE}";
    public static final String o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f25774p = "${INSTANCE}";
    public static final String q = "${INSTANCE_TYPE}";
    public static final String r = "${PLACEMENT_NAME}";
    private static final String s = "adMarkup";
    private static final String t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f25775u = "params";
    public static final String v = "dlpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f25776w = "adUnit";
    public static final String x = "parallelLoad";
    public static final String y = "bidderExclusive";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f25777z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f25778a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vf f25779b = on.U().f();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<m5> f25781b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m5 f25782c;
        private JSONObject d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JSONObject f25783e;
        private int f;
        private String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private u4 f25784h;

        public a(String str) {
            this.f25780a = str;
        }

        public JSONObject b() {
            return this.f25783e;
        }

        public int c() {
            return this.f;
        }

        public String d() {
            return this.g;
        }

        public m5 e() {
            return this.f25782c;
        }

        public JSONObject f() {
            return this.d;
        }

        public u4 g() {
            return this.f25784h;
        }

        public List<m5> h() {
            return this.f25781b;
        }

        public p a(String str) {
            u4 u4Var = this.f25784h;
            return u4Var != null ? u4Var.a(str) : new p.b();
        }

        public String a() {
            return this.f25780a;
        }
    }

    public static class b implements Runnable {
        private static final int d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f25785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f25786b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f25787c;

        public b(String str, String str2, String str3) {
            this.f25785a = str;
            this.f25786b = str2;
            this.f25787c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f25785a + ";" + this.f25786b + ";" + this.f25787c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f25787c).openConnection();
                httpURLConnection.setRequestMethod(ko.f25534a);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                on.U().z().a(new zb(responseCode == 200 || responseCode == 204 ? ac.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : ac.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
            } catch (Exception e2) {
                q9.d().a(e2);
                StringBuilder sb = new StringBuilder("Send auction url failed with params - ");
                sb.append(str);
                sb.append(";");
                IronLog.INTERNAL.error(Z.m(e2, sb));
            }
        }
    }

    public enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return f25767B;
    }

    public a a(JSONObject jSONObject) throws JSONException {
        String strOptString = jSONObject.optString("auctionId");
        if (TextUtils.isEmpty(strOptString)) {
            throw new JSONException("Invalid auction response - auction id is missing");
        }
        a aVar = new a(strOptString);
        JSONObject jSONObjectOptJSONObject = null;
        if (jSONObject.has("settings")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.f25782c = new m5(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f25783e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(k)) {
                aVar.f25784h = new u4.a(jSONObject2.optJSONObject(k));
            }
        }
        aVar.f25781b = new ArrayList();
        if (jSONObject.has(f25770h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f25770h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                m5 m5Var = new m5(jSONArray.getJSONObject(i2), i2, jSONObjectOptJSONObject);
                if (!m5Var.m()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f25781b.add(m5Var);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && tk.a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("params")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                    IronLog ironLog = IronLog.INTERNAL;
                    ironLog.verbose("parameters = " + jSONObject2);
                    if (jSONObject2.has("dynamicDemandSource")) {
                        string = jSONObject2.getString("dynamicDemandSource");
                        ironLog.verbose("demand source = " + string);
                        return string;
                    }
                }
            }
            return "";
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
            return string;
        }
    }

    private c a() {
        c cVar = c.SECURE;
        if (Build.VERSION.SDK_INT >= 28) {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) {
                return cVar;
            }
        } else if ((ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) == 0) {
            return cVar;
        }
        return c.NOT_SECURE;
    }

    public Map<String, String> b(String str) {
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("params")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject2.get(next);
                    if (obj instanceof String) {
                        map.put(next, (String) obj);
                    }
                }
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return map;
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e2) {
            q9.d().a(e2);
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return str;
    }

    public String a(String str, int i2, m5 m5Var, String str2, String str3, String str4) {
        String strI = m5Var.i();
        return a(str, m5Var.c(), i2, b().c(m5Var.k()), strI, b().a(strI, str2), str3, str4);
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d2 = Double.parseDouble(str);
        double d3 = Double.parseDouble(str2);
        return d3 == 0.0d ? "" : String.valueOf(Math.round((d2 / d3) * 1000.0d) / 1000.0d);
    }

    public String a(String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7) {
        return str.replace("${AUCTION_PRICE}", str4).replace("${AUCTION_LOSS}", str6).replace(m, str5).replace(f25774p, str2).replace(q, Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0209  */
    public JSONObject a(i iVar) throws JSONException {
        IronSource.AD_UNIT ad_unit;
        boolean z2;
        List<String> list;
        Object objRemove;
        IronSource.AD_UNIT ad_unitC = iVar.c();
        boolean isEncryptedResponse = iVar.getIsEncryptedResponse();
        Map<String, Object> mapH = iVar.h();
        List<String> listL = iVar.l();
        h auctionHistory = iVar.getAuctionHistory();
        int sessionDepth = iVar.getSessionDepth();
        ISBannerSize iSBannerSize = iVar.getCom.ironsource.k6.u java.lang.String();
        IronSourceSegment ironSourceSegment = iVar.getCom.ironsource.a4.i java.lang.String();
        boolean testSuiteLaunched = iVar.getTestSuiteLaunched();
        boolean useTestAds = iVar.getUseTestAds();
        ArrayList<f5> arrayListK = iVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            ad_unit = ad_unitC;
            z2 = isEncryptedResponse;
            String strA = "";
            list = listL;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            ISBannerSize iSBannerSize2 = iSBannerSize;
            JSONObject jSONObject3 = new JSONObject();
            IronSourceSegment ironSourceSegment2 = ironSourceSegment;
            jSONObject3.put(ne.w0, 2);
            jSONObject3.put(ne.n0, new JSONObject((Map) mapH.get(next)));
            if (auctionHistory != null) {
                strA = auctionHistory.a(next);
            }
            jSONObject3.put(ne.z0, strA);
            jSONObject3.put("ts", useTestAds ? 1 : 0);
            jSONObject2.put(next, jSONObject3);
            ad_unitC = ad_unit;
            isEncryptedResponse = z2 ? 1 : 0;
            listL = list;
            iSBannerSize = iSBannerSize2;
            ironSourceSegment = ironSourceSegment2;
        }
        ISBannerSize iSBannerSize3 = iSBannerSize;
        IronSourceSegment ironSourceSegment3 = ironSourceSegment;
        int i2 = 2;
        for (String str : list) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(ne.w0, 1);
            jSONObject4.put(ne.z0, auctionHistory != null ? auctionHistory.a(str) : "");
            jSONObject2.put(str, jSONObject4);
        }
        for (f5 f5Var : arrayListK) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(ne.w0, f5Var.e() ? i2 : 1);
            Map<String, Object> mapF = f5Var.f();
            if (!mapF.isEmpty()) {
                jSONObject5.put(ne.n0, new JSONObject(mapF));
            }
            jSONObject5.put(ne.z0, auctionHistory != null ? auctionHistory.a(f5Var.g()) : "");
            jSONObject5.put("ts", useTestAds ? 1 : 0);
            if (!f5Var.getPlumbus().isEmpty()) {
                jSONObject5.put(v, f5Var.getPlumbus());
            }
            jSONObject2.put(f5Var.g(), jSONObject5);
            i2 = 2;
        }
        jSONObject.put(ne.v0, jSONObject2);
        if (iVar.getIsOneFlow()) {
            jSONObject.put(ne.v1, 1);
        }
        if (iVar.getCom.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DEMAND_ONLY java.lang.String()) {
            jSONObject.put("do", 1);
        }
        new hk().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new b5(v2.a(ad_unit)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(ne.x0, sessionDepth);
        jSONObjectA.put(ne.y0, a().ordinal());
        if (ironSourceSegment3 != null) {
            jSONObjectA.put(ne.h1, ironSourceSegment3.toJson());
        }
        jSONObject.put(ne.s0, jSONObjectA);
        if (iSBannerSize3 != null) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(ne.p0, iSBannerSize3.getDescription());
            jSONObject6.put(ne.r0, iSBannerSize3.getWidth());
            jSONObject6.put(ne.q0, iSBannerSize3.getHeight());
            jSONObject.put(ne.o0, jSONObject6);
        }
        jSONObject.put(ne.j0, ad_unit.toString());
        if (iVar.getAdFormat() != null) {
            jSONObject.put("adf", iVar.getAdFormat());
        }
        if (iVar.getAdUnitId() != null) {
            jSONObject.put("mediationAdUnitId", iVar.getAdUnitId());
        }
        if (iVar.getCom.ironsource.ne.m0 java.lang.String() != null) {
            jSONObject.put(ne.m0, iVar.getCom.ironsource.ne.m0 java.lang.String());
        }
        jSONObject.put(ne.t0, !z2 ? 1 : 0);
        if (iVar.getBidFloor() == null) {
            objRemove = jSONObjectA.remove(ne.r1);
            if (objRemove != null) {
            }
            if (testSuiteLaunched) {
                jSONObject.put(ne.p1, 1);
            }
            return jSONObject;
        }
        objRemove = new JSONObject().put(ne.s1, iVar.getBidFloor());
        jSONObject.put(ne.r1, objRemove);
        if (testSuiteLaunched) {
            jSONObject.put(ne.p1, 1);
        }
        return jSONObject;
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public void a(JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(ne.j1)) || !this.f25778a.compareAndSet(false, true)) {
            return;
        }
        on.U().z().a(new zb(ac.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.getMediationAdditionalData(z2, true, -1)));
    }
}
