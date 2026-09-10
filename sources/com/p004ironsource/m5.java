package com.p004ironsource;

import com.p004ironsource.mediationsdk.d;
import com.p004ironsource.mediationsdk.impressionData.ImpressionData;
import com.p004ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class m5 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f25674A = "nurl";
    public static final String o = "adMarkup";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f25675p = "instance";
    public static final String q = "adData";
    public static final String r = "price";
    public static final String s = "serverData";
    public static final String t = "loadTimeout";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f25676u = "order";
    public static final String v = "show";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f25677w = "price";
    public static final String x = "notifications";
    public static final String y = "burl";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f25678z = "lurl";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f25680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f25681c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f25682e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f25683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List<String> f25684i;
    private final List<String> j;
    private final List<String> k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImpressionData f25685l;
    private cn m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25686n;

    public m5(String str) {
        this.f25679a = null;
        this.f25680b = "";
        this.f25681c = null;
        this.d = "";
        this.f25682e = null;
        this.f = -1;
        this.g = -1;
        this.f25683h = -1;
        this.f25684i = new ArrayList();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.f25685l = null;
        this.m = null;
        this.f25686n = true;
        this.f25679a = str;
    }

    public ImpressionData a(String str) {
        ImpressionData impressionData = this.f25685l;
        if (impressionData == null) {
            return null;
        }
        ImpressionData impressionData2 = new ImpressionData(impressionData);
        impressionData2.replaceMacroForPlacementWithValue(d.r, str);
        return impressionData2;
    }

    public List<String> b() {
        return this.f25684i;
    }

    public String c() {
        return this.f25679a;
    }

    public cn d() {
        return this.m;
    }

    public int e() {
        return this.f;
    }

    public Integer f() {
        return this.f25682e;
    }

    public List<String> g() {
        return this.j;
    }

    public List<String> h() {
        return this.k;
    }

    public String i() {
        return this.d;
    }

    public int j() {
        return this.f25683h;
    }

    public String k() {
        return this.f25680b;
    }

    public int l() {
        return this.g;
    }

    public boolean m() {
        return this.f25686n;
    }

    public m5(JSONObject jSONObject) {
        this(jSONObject, -1, null);
    }

    public JSONObject a() {
        return this.f25681c;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0082 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x003f, B:5:0x0045, B:8:0x004f, B:10:0x0055, B:14:0x0068, B:15:0x006a, B:17:0x0082, B:18:0x0095, B:20:0x00b0, B:22:0x00ba, B:24:0x00c2, B:25:0x00d1, B:11:0x005a, B:13:0x0060), top: B:29:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b0 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x003f, B:5:0x0045, B:8:0x004f, B:10:0x0055, B:14:0x0068, B:15:0x006a, B:17:0x0082, B:18:0x0095, B:20:0x00b0, B:22:0x00ba, B:24:0x00c2, B:25:0x00d1, B:11:0x005a, B:13:0x0060), top: B:29:0x003f }] */
    /* JADX WARN: Code duplicated, block: B:21:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c2 A[Catch: Exception -> 0x004c, TryCatch #0 {Exception -> 0x004c, blocks: (B:3:0x003f, B:5:0x0045, B:8:0x004f, B:10:0x0055, B:14:0x0068, B:15:0x006a, B:17:0x0082, B:18:0x0095, B:20:0x00b0, B:22:0x00ba, B:24:0x00c2, B:25:0x00d1, B:11:0x005a, B:13:0x0060), top: B:29:0x003f }] */
    public m5(JSONObject jSONObject, int i2, JSONObject jSONObject2) {
        cn cnVarA;
        String string;
        this.f25679a = null;
        this.f25680b = "";
        this.f25681c = null;
        this.d = "";
        this.f25682e = null;
        this.f = -1;
        this.g = -1;
        this.f25683h = -1;
        ArrayList arrayList = new ArrayList();
        this.f25684i = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.j = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.k = arrayList3;
        this.f25685l = null;
        this.m = null;
        this.f25686n = true;
        try {
            if (jSONObject.has(f25675p)) {
                this.f25679a = jSONObject.getString(f25675p);
            }
            if (!jSONObject.has("adMarkup")) {
                string = jSONObject.has(s) ? jSONObject.getJSONObject(s).toString() : string;
                this.f25681c = jSONObject.optJSONObject("adData");
                this.d = jSONObject.optString("price", "0");
                if (jSONObject.has(x)) {
                    JSONObject jSONObject3 = jSONObject.getJSONObject(x);
                    a(jSONObject3, y, arrayList);
                    a(jSONObject3, f25678z, arrayList2);
                    a(jSONObject3, f25674A, arrayList3);
                }
                this.f25685l = new ImpressionData(tk.a(jSONObject2, jSONObject.optJSONObject(d.d)));
                if (jSONObject.has(d.f25769e)) {
                    cnVarA = cn.a(jSONObject.getJSONObject(d.f25769e));
                } else {
                    cnVarA = null;
                }
                this.m = cnVarA;
                this.f25682e = jSONObject.has(t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(t))) : null;
                a(jSONObject.optJSONObject(f25676u), i2);
            }
            string = jSONObject.getString("adMarkup");
            this.f25680b = string;
            this.f25681c = jSONObject.optJSONObject("adData");
            this.d = jSONObject.optString("price", "0");
            if (jSONObject.has(x)) {
                JSONObject jSONObject4 = jSONObject.getJSONObject(x);
                a(jSONObject4, y, arrayList);
                a(jSONObject4, f25678z, arrayList2);
                a(jSONObject4, f25674A, arrayList3);
            }
            this.f25685l = new ImpressionData(tk.a(jSONObject2, jSONObject.optJSONObject(d.d)));
            if (jSONObject.has(d.f25769e)) {
                cnVarA = cn.a(jSONObject.getJSONObject(d.f25769e));
            } else {
                cnVarA = null;
            }
            this.m = cnVarA;
            this.f25682e = jSONObject.has(t) ? Integer.valueOf((int) TimeUnit.MILLISECONDS.toSeconds(jSONObject.getLong(t))) : null;
            a(jSONObject.optJSONObject(f25676u), i2);
        } catch (Exception e2) {
            q9.d().a(e2);
            this.f25686n = false;
            IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
    }

    private void a(JSONObject jSONObject, int i2) {
        this.f = i2;
        this.g = i2;
        this.f25683h = i2;
        if (jSONObject != null) {
            int iOptInt = jSONObject.optInt("show", i2);
            this.g = iOptInt;
            this.f25683h = jSONObject.optInt("price", iOptInt);
        }
    }

    private void a(JSONObject jSONObject, String str, List<String> list) throws JSONException {
        if (jSONObject.has(str)) {
            list.addAll(tk.b(jSONObject.getJSONArray(str)));
        }
    }
}
