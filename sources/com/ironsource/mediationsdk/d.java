package com.ironsource.mediationsdk;

import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.ironsource.C0257b2;
import com.ironsource.C0265ba;
import com.ironsource.C0329f2;
import com.ironsource.C0375hc;
import com.ironsource.C0391ia;
import com.ironsource.C0400j2;
import com.ironsource.C0474n4;
import com.ironsource.C0526q2;
import com.ironsource.C0654x5;
import com.ironsource.EnumC0672y5;
import com.ironsource.InterfaceC0674y7;
import com.ironsource.Kb;
import com.ironsource.O6;
import com.ironsource.U9;
import com.ironsource.W0;
import com.ironsource.X1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
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

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class d {
    public static final boolean A = false;
    private static d B = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f29332c = "auctionId";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f29333d = "armData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f29334e = "larmData";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f29335f = "isAdUnitCapped";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f29336g = "settings";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f29337h = "waterfall";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f29338i = "genericParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f29339j = "configurations";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f29340k = "instances";
    public static final String l = "${AUCTION_LOSS}";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f29341m = "${AUCTION_MBR}";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f29342n = "${AUCTION_PRICE}";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f29343o = "${DYNAMIC_DEMAND_SOURCE}";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f29344p = "${INSTANCE}";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f29345q = "${INSTANCE_TYPE}";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f29346r = "${PLACEMENT_NAME}";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final String f29347s = "adMarkup";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f29348t = "dynamicDemandSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f29349u = "params";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f29350v = "dlpl";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f29351w = "adUnit";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f29352x = "parallelLoad";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f29353y = "bidderExclusive";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f29354z = "showPriorityEnabled";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f29355a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0674y7 f29356b = Kb.Y().a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<C0526q2> f29358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private C0526q2 f29359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f29360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private JSONObject f29361e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f29362f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f29363g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private X1 f29364h;

        public a(String str) {
            this.f29357a = str;
        }

        public String a() {
            return this.f29357a;
        }

        public JSONObject b() {
            return this.f29361e;
        }

        public int c() {
            return this.f29362f;
        }

        public String d() {
            return this.f29363g;
        }

        public C0526q2 e() {
            return this.f29359c;
        }

        public JSONObject f() {
            return this.f29360d;
        }

        public X1 g() {
            return this.f29364h;
        }

        public List<C0526q2> h() {
            return this.f29358b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(String str) {
            X1 x10 = this.f29364h;
            if (x10 != null) {
                return x10.a(str);
            }
            return new com.ironsource.mediationsdk.demandOnly.p.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class b implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int f29365d = 15000;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f29366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f29367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f29368c;

        public b(String str, String str2, String str3) {
            this.f29366a = str;
            this.f29367b = str2;
            this.f29368c = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str = this.f29366a + ";" + this.f29367b + ";" + this.f29368c;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f29368c).openConnection();
                httpURLConnection.setRequestMethod(C0375hc.f28788a);
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                Kb.Y().q().a(new C0654x5(responseCode == 200 || responseCode == 204 ? EnumC0672y5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : EnumC0672y5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new JSONObject().put(IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(IronSourceConstants.EVENTS_EXT1, str).put(IronSourceConstants.EVENTS_ERROR_CODE, responseCode).put("reason", responseMessage)));
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum c {
        NOT_SECURE,
        SECURE
    }

    public static d b() {
        return B;
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
            aVar.f29359c = new C0526q2(jSONObject2);
            jSONObjectOptJSONObject = jSONObject2.has(f29333d) ? jSONObject2.optJSONObject(f29333d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.f29360d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.f29361e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(f29340k)) {
                aVar.f29364h = new X1.a(jSONObject2.optJSONObject(f29340k));
            }
        }
        aVar.f29358b = new ArrayList();
        if (jSONObject.has(f29337h)) {
            JSONArray jSONArray = jSONObject.getJSONArray(f29337h);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                C0526q2 c0526q2 = new C0526q2(jSONArray.getJSONObject(i10), i10, jSONObjectOptJSONObject);
                if (!c0526q2.n()) {
                    aVar.f29362f = 1002;
                    aVar.f29363g = "waterfall " + i10;
                    IronLog.INTERNAL.verbose("AuctionResponseItem " + i10 + " not valid - parsing error");
                    throw new JSONException("invalid response");
                }
                aVar.f29358b.add(c0526q2);
            }
        }
        return aVar;
    }

    public String c(String str) {
        String string = "";
        try {
            if (!TextUtils.isEmpty(str) && C0391ia.a(str)) {
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
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return string;
        }
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
            return map;
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
            return map;
        }
    }

    private c a() {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? c.NOT_SECURE : c.SECURE;
    }

    public JSONObject a(h hVar) throws JSONException {
        int i10;
        IronSource.a aVarC = hVar.c();
        boolean zU = hVar.u();
        Map<String, Object> mapH = hVar.h();
        List<String> listL = hVar.l();
        C0257b2 c0257b2E = hVar.e();
        int iP = hVar.p();
        ISBannerSize iSBannerSizeF = hVar.f();
        C0265ba c0265baO = hVar.o();
        boolean zQ = hVar.q();
        boolean zR = hVar.r();
        ArrayList<C0400j2> arrayListK = hVar.k();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        String strN = hVar.n();
        if (strN != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(O6.f26764y0, 1);
            jSONObject3.put(O6.B0, c0257b2E != null ? c0257b2E.a(strN) : "");
            jSONObject3.put(O6.C0, true);
            jSONObject2.put(strN, jSONObject3);
        }
        Iterator<String> it = mapH.keySet().iterator();
        while (true) {
            Iterator<String> it2 = it;
            if (!it.hasNext()) {
                break;
            }
            String next = it2.next();
            C0265ba c0265ba = c0265baO;
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(O6.f26764y0, 2);
            Map<String, Object> map = mapH;
            jSONObject4.put(O6.f26739p0, new JSONObject((Map) mapH.get(next)));
            jSONObject4.put(O6.B0, c0257b2E != null ? c0257b2E.a(next) : "");
            jSONObject4.put("ts", zR ? 1 : 0);
            jSONObject2.put(next, jSONObject4);
            it = it2;
            c0265baO = c0265ba;
            mapH = map;
        }
        C0265ba c0265ba2 = c0265baO;
        for (String str : listL) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put(O6.f26764y0, 1);
            jSONObject5.put(O6.B0, c0257b2E != null ? c0257b2E.a(str) : "");
            jSONObject2.put(str, jSONObject5);
        }
        for (C0400j2 c0400j2 : arrayListK) {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(O6.f26764y0, c0400j2.e() ? 2 : 1);
            Map<String, Object> mapF = c0400j2.f();
            if (!mapF.isEmpty()) {
                jSONObject6.put(O6.f26739p0, new JSONObject(mapF));
            }
            jSONObject6.put(O6.B0, c0257b2E != null ? c0257b2E.a(c0400j2.g()) : "");
            jSONObject6.put("ts", zR ? 1 : 0);
            if (!c0400j2.h().isEmpty()) {
                jSONObject6.put(f29350v, c0400j2.h());
            }
            jSONObject2.put(c0400j2.g(), jSONObject6);
        }
        jSONObject.put(O6.f26761x0, jSONObject2);
        if (hVar.w()) {
            i10 = 1;
            jSONObject.put(O6.f26762x1, 1);
        } else {
            i10 = 1;
        }
        if (hVar.t()) {
            jSONObject.put("do", i10);
        }
        new U9().b(ContextProvider.getInstance().getApplicationContext());
        JSONObject jSONObjectA = new C0329f2(W0.a(aVarC)).a();
        a(jSONObjectA, false);
        jSONObjectA.put(O6.f26767z0, iP);
        jSONObjectA.put(O6.A0, a().ordinal());
        if (c0265ba2 != null) {
            jSONObjectA.put(O6.f26723j1, c0265ba2.i());
        }
        jSONObject.put(O6.f26752u0, jSONObjectA);
        if (iSBannerSizeF != 0) {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(O6.r0, iSBannerSizeF.getDescription());
            jSONObject7.put(O6.t0, iSBannerSizeF.getWidth());
            jSONObject7.put(O6.f26747s0, iSBannerSizeF.getHeight());
            jSONObject.put(O6.f26742q0, jSONObject7);
        }
        jSONObject.put(O6.f26727l0, aVarC.toString());
        if (hVar.b() != null) {
            jSONObject.put("adf", hVar.b());
        }
        if (hVar.d() != null) {
            jSONObject.put("mediationAdUnitId", hVar.d());
        }
        if (hVar.v() != null) {
            jSONObject.put(O6.f26736o0, hVar.v());
        }
        jSONObject.put(O6.f26755v0, !zU ? 1 : 0);
        if (hVar.g() != null) {
            jSONObject.put(O6.f26750t1, new JSONObject().put(O6.f26753u1, hVar.g()));
        } else {
            Object objRemove = jSONObjectA.remove(O6.f26750t1);
            if (objRemove != null) {
                jSONObject.put(O6.f26750t1, objRemove);
            }
        }
        if (zQ) {
            jSONObject.put(O6.f26745r1, 1);
        }
        return jSONObject;
    }

    public String a(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7) {
        return str.replace(f29342n, str4).replace(l, str6).replace(f29341m, str5).replace(f29344p, str2).replace(f29345q, Integer.toString(i10)).replace(f29343o, str3).replace(f29346r, str7);
    }

    public String a(String str, int i10, C0526q2 c0526q2, String str2, String str3, String str4) {
        String strI = c0526q2.i();
        return a(str, c0526q2.c(), i10, b().c(c0526q2.k()), strI, b().a(strI, str2), str3, str4);
    }

    public void a(String str, String str2, String str3) {
        IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new b(str, str2, str3));
    }

    public String a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("adMarkup")) {
                    return jSONObject.getString("adMarkup");
                }
            }
        } catch (JSONException e10) {
            C0474n4.d().a(e10);
            IronLog.INTERNAL.error("exception " + e10.getMessage());
        }
        return str;
    }

    private String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        double d10 = Double.parseDouble(str);
        double d11 = Double.parseDouble(str2);
        return d11 == 0.0d ? "" : String.valueOf(Math.round((d10 / d11) * 1000.0d) / 1000.0d);
    }

    public void a(JSONObject jSONObject, boolean z10) {
        if (jSONObject == null || jSONObject.length() <= 0 || TextUtils.isEmpty(jSONObject.optString(O6.f26728l1)) || !this.f29355a.compareAndSet(false, true)) {
            return;
        }
        Kb.Y().q().a(new C0654x5(EnumC0672y5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, IronSourceUtils.a(z10, true, -1)));
    }
}
