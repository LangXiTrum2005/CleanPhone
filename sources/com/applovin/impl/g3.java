package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class g3 implements Comparable, AppLovinCommunicatorSubscriber {
    private final List A;
    private final List B;
    private final List C;
    private final List D;
    private final Map E;
    private final boolean F;
    private final d7 G;
    private final boolean H;
    private final String I;
    private final Map J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.l f7977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f7978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7982f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f7983g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7984h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f7985i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f7986j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f7987k;
    private final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f7988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f7989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f7990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f7991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f7992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f7993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f7994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f7995t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f7996u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final String f7997v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f7998w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f7999x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f8000y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final List f8001z;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum a {
        MISSING("MISSING"),
        INCOMPLETE_INTEGRATION("INCOMPLETE INTEGRATION"),
        INVALID_INTEGRATION("INVALID INTEGRATION"),
        COMPLETE("COMPLETE");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8007a;

        a(String str) {
            this.f8007a = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String b() {
            return this.f8007a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public enum b {
        NOT_SUPPORTED("Not Supported", -65536, "This network does not support test mode."),
        INVALID_INTEGRATION("Invalid Integration", -65536, "Please address all the integration issue(s) marked in red above."),
        NOT_INITIALIZED("Not Initialized", -65536, "Please configure this network in your MAX dashboard."),
        DISABLED("Enable", -16776961, "Please re-launch the app to enable test ads."),
        READY("", -16776961, "");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f8016c;

        b(String str, int i10, String str2) {
            this.f8014a = str;
            this.f8015b = i10;
            this.f8016c = str2;
        }

        public String b() {
            return this.f8016c;
        }

        public String c() {
            return this.f8014a;
        }

        public int d() {
            return this.f8015b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0252 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x0256  */
    /* JADX WARN: Code duplicated, block: B:78:0x0268  */
    /* JADX WARN: Code duplicated, block: B:79:0x0274  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:85:0x02bc  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public g3(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        String adapterVersion;
        String strA;
        String str;
        boolean zEquals;
        boolean z10;
        boolean z11;
        boolean z12;
        int iLastIndexOf;
        String lowerCase;
        Integer numA;
        JSONObject jSONObject2;
        String string;
        String string2;
        String str2;
        boolean zIsBeta;
        boolean z13;
        String str3;
        this.f7977a = lVar;
        String string3 = JsonUtils.getString(jSONObject, "name", "");
        this.f7991p = string3;
        this.f7992q = JsonUtils.getString(jSONObject, "display_name", "");
        this.f7993r = JsonUtils.getString(jSONObject, "adapter_class", "");
        this.f7996u = JsonUtils.getString(jSONObject, "latest_adapter_version", "");
        this.B = a(jSONObject);
        Boolean bool = Boolean.FALSE;
        this.f7987k = JsonUtils.getBoolean(jSONObject, "hide_if_missing", bool).booleanValue();
        JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONObject, "configuration", new JSONObject());
        this.f8001z = a(jSONObject3, lVar);
        this.f7990o = JsonUtils.getBoolean(jSONObject3, "java_8_required", bool).booleanValue();
        this.F = JsonUtils.getBoolean(jSONObject3, "hide_initialization_status", bool).booleanValue();
        this.f7989n = JsonUtils.getBoolean(jSONObject3, "check_sdk_adapter_version_mismatch", Boolean.TRUE).booleanValue();
        this.C = JsonUtils.getList(jSONObject3, "live_network_filtering_names", null);
        JSONObject jSONObject4 = JsonUtils.getJSONObject(jSONObject3, "test_mode", new JSONObject());
        JSONObject jSONObject5 = JsonUtils.getJSONObject(jSONObject4, "network_names", (JSONObject) null);
        if (jSONObject5 == null || jSONObject5.length() <= 0) {
            this.D = Arrays.asList(string3);
            this.E = null;
        } else {
            ArrayList arrayList = new ArrayList(Arrays.asList(string3));
            HashMap map = new HashMap(jSONObject5.length());
            Iterator<String> itKeys = jSONObject5.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                MaxAdFormat fromString = MaxAdFormat.formatFromString(next);
                String string4 = JsonUtils.getString(jSONObject5, next, null);
                if (fromString != null && !TextUtils.isEmpty(string4)) {
                    arrayList.add(string4);
                    map.put(fromString, string4);
                }
            }
            this.D = arrayList;
            this.E = map;
        }
        JSONObject jSONObject6 = JsonUtils.getJSONObject(jSONObject, "test_mode", new JSONObject());
        Boolean bool2 = Boolean.TRUE;
        this.f7985i = JsonUtils.getBoolean(jSONObject6, "supported", bool2).booleanValue();
        this.f7986j = JsonUtils.getBoolean(jSONObject, "test_mode_requires_init", Boolean.FALSE).booleanValue();
        this.f7997v = JsonUtils.getString(jSONObject6, "message", null);
        this.G = new d7(JsonUtils.getJSONObject(jSONObject3, "tcf_config"), this.f7992q);
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        if (list != null) {
            this.f7980d = q7.a(list);
        } else {
            this.f7980d = q7.a(JsonUtils.getString(jSONObject, "existence_class", ""));
        }
        List listA = Collections.EMPTY_LIST;
        String str4 = this.f7993r;
        String string5 = JsonUtils.getString(jSONObject3, "init_adapter_class", null);
        if (string5 != null) {
            this.f7993r = string5;
        }
        MaxAdapter maxAdapterA = y3.a(str4, lVar);
        if (maxAdapterA != null) {
            this.f7981e = true;
            try {
                adapterVersion = maxAdapterA.getAdapterVersion();
                try {
                    try {
                        strA = y3.a(maxAdapterA);
                        try {
                            try {
                                this.f7984h = y3.a(maxAdapterA, this.f7993r);
                                listA = a(maxAdapterA, JsonUtils.getBoolean(jSONObject4, "is_mrec_supported", bool2).booleanValue());
                                JSONObject jSONObject7 = JsonUtils.getJSONObject(jSONObject3, "native_ad_view_config", (JSONObject) null);
                                if (jSONObject7 != null) {
                                    String string6 = JsonUtils.getString(jSONObject7, "min_adapter_version", null);
                                    z11 = string6 == null || q7.a(adapterVersion, string6) >= 0;
                                    try {
                                        string2 = JsonUtils.getString(jSONObject7, "network_name", null);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        string2 = null;
                                        com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f7991p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                        str2 = string2;
                                        zIsBeta = false;
                                        Class<?> cls = Class.forName(this.f7993r);
                                        z13 = zIsBeta;
                                        str3 = str2;
                                        zEquals = cls.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls);
                                        z10 = z13;
                                        str = str3;
                                        this.f7995t = adapterVersion;
                                        this.f7994s = strA;
                                        this.f8000y = listA;
                                        this.l = zEquals;
                                        this.f7988m = z11;
                                        this.f7998w = str;
                                        this.A = a(jSONObject3, adapterVersion, lVar);
                                        this.f7983g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                        this.f7978b = a();
                                        if (adapterVersion.equals(this.f7996u)) {
                                            z12 = false;
                                        } else {
                                            z12 = false;
                                        }
                                        this.f7982f = z12;
                                        Context contextP = com.applovin.impl.sdk.l.p();
                                        iLastIndexOf = this.f7991p.lastIndexOf("_");
                                        if (iLastIndexOf != -1) {
                                            lowerCase = this.f7991p.toLowerCase().substring(0, iLastIndexOf);
                                        } else {
                                            lowerCase = this.f7991p.toLowerCase();
                                        }
                                        this.f7999x = contextP.getResources().getIdentifier(defpackage.e.n("applovin_ic_mediation_", lowerCase), "drawable", contextP.getPackageName());
                                        this.f7979c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                        AppLovinCommunicator.getInstance(contextP).subscribe(this, "adapter_initialization_status");
                                        numA = lVar.U().a(this.f7993r);
                                        if (numA != null) {
                                            this.f7979c = numA.intValue();
                                        }
                                        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                        if (jSONObject2 != null) {
                                        }
                                        this.H = false;
                                        this.I = null;
                                        this.J = null;
                                        return;
                                    }
                                } else {
                                    string2 = null;
                                    z11 = false;
                                }
                                try {
                                    str2 = string2;
                                    zIsBeta = maxAdapterA.isBeta();
                                } catch (Throwable th3) {
                                    th = th3;
                                    com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f7991p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                    str2 = string2;
                                    zIsBeta = false;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                string2 = null;
                                z11 = false;
                                com.applovin.impl.sdk.p.h("MediatedNetwork", "Failed to load adapter for network " + this.f7991p + ". Please check that you have a compatible network SDK integrated. Error: " + th);
                                str2 = string2;
                                zIsBeta = false;
                                Class<?> cls2 = Class.forName(this.f7993r);
                                z13 = zIsBeta;
                                str3 = str2;
                                zEquals = cls2.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                                z10 = z13;
                                str = str3;
                                this.f7995t = adapterVersion;
                                this.f7994s = strA;
                                this.f8000y = listA;
                                this.l = zEquals;
                                this.f7988m = z11;
                                this.f7998w = str;
                                this.A = a(jSONObject3, adapterVersion, lVar);
                                this.f7983g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
                                this.f7978b = a();
                                if (adapterVersion.equals(this.f7996u)) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                this.f7982f = z12;
                                Context contextP2 = com.applovin.impl.sdk.l.p();
                                iLastIndexOf = this.f7991p.lastIndexOf("_");
                                if (iLastIndexOf != -1) {
                                    lowerCase = this.f7991p.toLowerCase().substring(0, iLastIndexOf);
                                } else {
                                    lowerCase = this.f7991p.toLowerCase();
                                }
                                this.f7999x = contextP2.getResources().getIdentifier(defpackage.e.n("applovin_ic_mediation_", lowerCase), "drawable", contextP2.getPackageName());
                                this.f7979c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
                                AppLovinCommunicator.getInstance(contextP2).subscribe(this, "adapter_initialization_status");
                                numA = lVar.U().a(this.f7993r);
                                if (numA != null) {
                                    this.f7979c = numA.intValue();
                                }
                                jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
                                if (jSONObject2 != null) {
                                }
                                this.H = false;
                                this.I = null;
                                this.J = null;
                                return;
                            }
                            zEquals = cls2.getMethod("loadNativeAd", MaxAdapterResponseParameters.class, Activity.class, MaxNativeAdAdapterListener.class).getDeclaringClass().equals(cls2);
                            z10 = z13;
                            str = str3;
                        } catch (Throwable th5) {
                            th = th5;
                            lVar.Q();
                            if (com.applovin.impl.sdk.p.a()) {
                                lVar.Q().a("MediatedNetwork", "Failed to check if adapter overrides MaxNativeAdAdapter", th);
                            }
                            z10 = z13;
                            str = str3;
                            zEquals = false;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        strA = "";
                    }
                    Class<?> cls3 = Class.forName(this.f7993r);
                    z13 = zIsBeta;
                    str3 = str2;
                } catch (Throwable th7) {
                    th = th7;
                    z13 = zIsBeta;
                    str3 = str2;
                }
            } catch (Throwable th8) {
                th = th8;
                adapterVersion = "";
                strA = adapterVersion;
            }
        } else {
            this.f7981e = false;
            adapterVersion = "";
            strA = adapterVersion;
            str = null;
            zEquals = false;
            z10 = false;
            z11 = false;
        }
        this.f7995t = adapterVersion;
        this.f7994s = strA;
        this.f8000y = listA;
        this.l = zEquals;
        this.f7988m = z11;
        this.f7998w = str;
        this.A = a(jSONObject3, adapterVersion, lVar);
        this.f7983g = q7.a(JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "alternative_network", (JSONObject) null), "adapter_class", ""));
        this.f7978b = a();
        if (adapterVersion.equals(this.f7996u) || z10) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.f7982f = z12;
        Context contextP3 = com.applovin.impl.sdk.l.p();
        iLastIndexOf = this.f7991p.lastIndexOf("_");
        if (iLastIndexOf != -1) {
            lowerCase = this.f7991p.toLowerCase().substring(0, iLastIndexOf);
        } else {
            lowerCase = this.f7991p.toLowerCase();
        }
        this.f7999x = contextP3.getResources().getIdentifier(defpackage.e.n("applovin_ic_mediation_", lowerCase), "drawable", contextP3.getPackageName());
        this.f7979c = MaxAdapter.InitializationStatus.NOT_INITIALIZED.getCode();
        AppLovinCommunicator.getInstance(contextP3).subscribe(this, "adapter_initialization_status");
        numA = lVar.U().a(this.f7993r);
        if (numA != null) {
            this.f7979c = numA.intValue();
        }
        jSONObject2 = JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null);
        if (jSONObject2 != null || !this.f7980d) {
            this.H = false;
            this.I = null;
            this.J = null;
            return;
        }
        this.H = true;
        this.I = JsonUtils.getString(jSONObject2, "test_mode_app_id", null);
        JSONObject jSONObject8 = JsonUtils.getJSONObject(jSONObject2, "test_mode_slot_ids", new JSONObject());
        HashMap map2 = new HashMap(jSONObject8.length());
        Iterator<String> itKeys2 = jSONObject8.keys();
        while (itKeys2.hasNext()) {
            String next2 = itKeys2.next();
            MaxAdFormat fromString2 = MaxAdFormat.formatFromString(next2);
            JSONObject jSONObject9 = JsonUtils.getJSONObject(jSONObject8, next2, (JSONObject) null);
            if (fromString2 != null && jSONObject9 != null && (string = JsonUtils.getString(jSONObject9, "uuid", null)) != null) {
                map2.put(fromString2, new x(string, jSONObject9, fromString2));
            }
        }
        this.J = map2;
    }

    private a a() {
        a aVar;
        if (!this.f7980d) {
            aVar = this.f7981e ? a.INCOMPLETE_INTEGRATION : a.MISSING;
        } else if (this.f7981e) {
            aVar = a.COMPLETE;
        } else {
            aVar = this.f7983g ? a.MISSING : a.INCOMPLETE_INTEGRATION;
        }
        if (aVar != a.MISSING) {
            Iterator it = this.f8001z.iterator();
            while (it.hasNext()) {
                if (!((r4) it.next()).c()) {
                    return a.INVALID_INTEGRATION;
                }
            }
            Iterator it2 = this.A.iterator();
            while (it2.hasNext()) {
                if (!((l1) it2.next()).c()) {
                    return a.INVALID_INTEGRATION;
                }
            }
            if (this.f7990o && !com.applovin.impl.sdk.l.H0()) {
                return a.INVALID_INTEGRATION;
            }
            if (E()) {
                return a.INCOMPLETE_INTEGRATION;
            }
        }
        return aVar;
    }

    public boolean A() {
        return this.f7982f;
    }

    public boolean B() {
        return this.f7984h;
    }

    public boolean C() {
        return this.H;
    }

    public boolean D() {
        return this.f7990o;
    }

    public boolean E() {
        if (!this.f7989n || !StringUtils.isValidString(this.f7994s)) {
            return false;
        }
        return !q7.d(this.f7994s).equals(q7.a(this.f7995t, this.f7994s.split("\\.").length));
    }

    public boolean F() {
        return this.f7980d;
    }

    public boolean G() {
        return this.f7978b == a.MISSING && this.f7987k;
    }

    public boolean H() {
        return this.F;
    }

    public boolean I() {
        return this.l;
    }

    public boolean J() {
        return this.f7988m;
    }

    public String b() {
        return this.f7993r;
    }

    public String c() {
        return this.f7995t;
    }

    public Map d() {
        return this.J;
    }

    public String e() {
        return this.I;
    }

    public List f() {
        return this.A;
    }

    public String g() {
        return this.f7992q;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "MediatedNetwork";
    }

    public int h() {
        return this.f7999x;
    }

    public int i() {
        return this.f7979c;
    }

    public final String j() {
        StringBuilder sb2 = new StringBuilder("\n---------- ");
        sb2.append(this.f7991p);
        sb2.append(" ----------\nStatus  - ");
        sb2.append(this.f7978b.b());
        sb2.append("\nSDK     - ");
        String str = "UNAVAILABLE";
        sb2.append((!this.f7980d || TextUtils.isEmpty(this.f7994s)) ? "UNAVAILABLE" : this.f7994s);
        sb2.append("\nAdapter - ");
        if (this.f7981e && !TextUtils.isEmpty(this.f7995t)) {
            str = this.f7995t;
        }
        sb2.append(str);
        for (r4 r4Var : n()) {
            if (!r4Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(r4Var.b());
                sb2.append(": ");
                sb2.append(r4Var.a());
            }
        }
        for (l1 l1Var : f()) {
            if (!l1Var.c()) {
                sb2.append("\n* MISSING ");
                sb2.append(l1Var.b());
                sb2.append(": ");
                sb2.append(l1Var.a());
            }
        }
        return sb2.toString();
    }

    public String k() {
        return this.f7996u;
    }

    public List l() {
        return this.C;
    }

    public String m() {
        return this.f7991p;
    }

    public List n() {
        return this.f8001z;
    }

    public final com.applovin.impl.sdk.l o() {
        return this.f7977a;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        String string = appLovinCommunicatorMessage.getMessageData().getString("adapter_class", "");
        if (this.f7993r.equals(string)) {
            this.f7979c = appLovinCommunicatorMessage.getMessageData().getInt("init_status", 0);
            MaxAdapter maxAdapterA = y3.a(string, this.f7977a);
            if (maxAdapterA != null) {
                String strA = y3.a(maxAdapterA);
                if (this.f7994s.equals(strA)) {
                    return;
                }
                this.f7994s = strA;
                this.f7977a.u().a(this.f7994s, string);
            }
        }
    }

    public String p() {
        return this.f7994s;
    }

    public a q() {
        return this.f7978b;
    }

    public List r() {
        return this.f8000y;
    }

    public List s() {
        return this.B;
    }

    public d7 t() {
        return this.G;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MediatedNetwork{name=");
        sb2.append(this.f7991p);
        sb2.append(", displayName=");
        sb2.append(this.f7992q);
        sb2.append(", sdkAvailable=");
        sb2.append(this.f7980d);
        sb2.append(", sdkVersion=");
        sb2.append(this.f7994s);
        sb2.append(", adapterAvailable=");
        sb2.append(this.f7981e);
        sb2.append(", adapterVersion=");
        return defpackage.e.q(this.f7995t, "}", sb2);
    }

    public List u() {
        return this.D;
    }

    public String v() {
        return this.f7997v;
    }

    public String w() {
        return this.f7998w;
    }

    public Map x() {
        return this.E;
    }

    public b y() {
        if (!this.f7985i) {
            return b.NOT_SUPPORTED;
        }
        a aVar = this.f7978b;
        if (aVar != a.COMPLETE && (aVar != a.INCOMPLETE_INTEGRATION || !F() || !z())) {
            return b.INVALID_INTEGRATION;
        }
        if (this.f7977a.u0().c()) {
            return (this.f7986j && (this.f7979c == MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() || this.f7979c == MaxAdapter.InitializationStatus.INITIALIZING.getCode())) ? b.NOT_INITIALIZED : b.READY;
        }
        return b.DISABLED;
    }

    public boolean z() {
        return this.f7981e;
    }

    private List a(MaxAdapter maxAdapter, boolean z10) {
        ArrayList arrayList = new ArrayList(5);
        if (maxAdapter instanceof MaxInterstitialAdapter) {
            arrayList.add(MaxAdFormat.INTERSTITIAL);
        }
        if (maxAdapter instanceof MaxAppOpenAdapter) {
            arrayList.add(MaxAdFormat.APP_OPEN);
        }
        if (maxAdapter instanceof MaxRewardedAdapter) {
            arrayList.add(MaxAdFormat.REWARDED);
        }
        if (maxAdapter instanceof MaxAdViewAdapter) {
            arrayList.add(MaxAdFormat.BANNER);
            arrayList.add(MaxAdFormat.LEADER);
            if (z10) {
                arrayList.add(MaxAdFormat.MREC);
            }
        }
        if (maxAdapter instanceof MaxNativeAdAdapter) {
            arrayList.add(MaxAdFormat.NATIVE);
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject, com.applovin.impl.sdk.l lVar) {
        ArrayList arrayList = new ArrayList();
        if (this.f7993r.equals("com.applovin.mediation.adapters.AppLovinMediationAdapter")) {
            r4 r4Var = new r4("com.google.android.gms.permission.AD_ID", "Please add\n<uses-permission android:name=\"com.google.android.gms.permission.AD_ID\" />\nto your AndroidManifest.xml", com.applovin.impl.sdk.l.p());
            if (r4Var.c()) {
                arrayList.add(r4Var);
            }
        }
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "permissions", new JSONObject());
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                arrayList.add(new r4(next, jSONObject2.getString(next), com.applovin.impl.sdk.l.p()));
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    private List a(JSONObject jSONObject) {
        return JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "supported_regions", null), null);
    }

    private List a(JSONObject jSONObject, String str, com.applovin.impl.sdk.l lVar) {
        JSONArray jSONArrayX = defpackage.e.x("dependencies", jSONObject);
        JSONArray jSONArrayX2 = defpackage.e.x("dependencies_v2", jSONObject);
        ArrayList arrayList = new ArrayList(jSONArrayX2.length() + jSONArrayX.length());
        for (int i10 = 0; i10 < jSONArrayX.length(); i10++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArrayX, i10, (JSONObject) null);
            if (jSONObject2 != null) {
                arrayList.add(new l1(jSONObject2, lVar));
            }
        }
        for (int i11 = 0; i11 < jSONArrayX2.length(); i11++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArrayX2, i11, (JSONObject) null);
            if (jSONObject3 != null && l1.a(str, JsonUtils.getString(jSONObject3, "min_adapter_version", null), JsonUtils.getString(jSONObject3, "max_adapter_version", null))) {
                arrayList.add(new l1(jSONObject3, lVar));
            }
        }
        return arrayList;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(g3 g3Var) {
        return this.f7992q.compareToIgnoreCase(g3Var.f7992q);
    }
}
