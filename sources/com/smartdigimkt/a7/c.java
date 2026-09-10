package com.smartdigimkt.a7;

import android.text.TextUtils;
import com.thinkup.core.oo.n0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c extends e {
    public static final String a0 = "send_count";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final int f33751b0 = 5;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public String f33752A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public String f33753B;
    public String C;
    public String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public String f33754E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public String f33755F;
    public String G;
    public String H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public String f33756I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public String f33757J;
    public String K;
    public String L;
    public String M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public String f33758N;
    public String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f33759P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public String f33760Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public JSONObject f33761R;
    public String S;
    public JSONObject W;
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f33764Y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f33766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f33767c;
    public String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f33768e;
    public String f;
    public String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f33769h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f33770i;
    public String j;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f33772n;
    public String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f33773p;
    public String q;
    public String r;
    public String s;
    public String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f33774u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f33775w;
    public String x;
    public String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f33776z;
    public int k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33771l = -1;
    public int T = -1;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f33762U = -1;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f33763V = -1;
    public int Z = com.smartdigimkt.m6.b.p().j();

    private c() {
    }

    public void a(a aVar) {
        if (aVar != null) {
            this.f33766b = aVar.Z();
            this.f33767c = aVar.Y();
            this.f33758N = aVar.I();
            this.j = String.valueOf(aVar.u());
            this.f33770i = aVar.i();
            this.X = aVar.F();
            this.f33764Y = aVar.w();
        }
    }

    public c(String str, String str2) {
        this.f33758N = str;
        this.O = str2;
    }

    public void a(com.smartdigimkt.v6.a aVar) {
        if (aVar != null) {
            this.f33766b = aVar.f;
            this.f33767c = aVar.f39163a;
            this.f = String.valueOf(aVar.d);
            this.m = String.valueOf(aVar.f39165c);
            this.X = aVar.f39167h;
            this.f33764Y = aVar.g;
            this.Z = aVar.m;
        }
    }

    @Override // com.smartdigimkt.a7.e
    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.f33765a);
            jSONObject.put("requestid", this.f33766b);
            jSONObject.put("unitid", this.f33767c);
            jSONObject.put("psid", this.d);
            jSONObject.put("sessionid", this.f33768e);
            jSONObject.put("groupid", this.f);
            jSONObject.put("unitgroupid", this.g);
            jSONObject.put("timestamp", this.f33769h);
            jSONObject.put("asid", this.f33770i);
            jSONObject.put("refresh", this.j);
            int i2 = this.k;
            if (i2 != -1) {
                jSONObject.put("refresh_v2", i2);
            }
            int i3 = this.f33771l;
            if (i3 != -1) {
                jSONObject.put("load_mode", i3);
            }
            int i4 = this.f33763V;
            if (i4 != -1) {
                jSONObject.put("is_s", i4);
            }
            jSONObject.put("traffic_group_id", this.m);
            jSONObject.put("msg", this.f33772n);
            jSONObject.put("msg1", this.o);
            jSONObject.put("msg2", this.f33773p);
            jSONObject.put("msg3", this.q);
            jSONObject.put("msg4", this.r);
            jSONObject.put("msg5", this.s);
            jSONObject.put("msg6", this.t);
            jSONObject.put("msg7", this.f33774u);
            jSONObject.put("msg8", this.v);
            jSONObject.put("msg9", this.f33775w);
            jSONObject.put("msg10", this.x);
            jSONObject.put("msg11", this.y);
            jSONObject.put("msg12", this.f33776z);
            jSONObject.put("msg13", this.f33752A);
            jSONObject.put("msg14", this.f33753B);
            jSONObject.put("msg15", this.C);
            jSONObject.put("msg16", this.D);
            jSONObject.put("msg17", this.f33754E);
            jSONObject.put("msg18", this.f33755F);
            jSONObject.put("msg19", this.G);
            jSONObject.put("msg20", this.H);
            jSONObject.put("msg21", this.f33756I);
            jSONObject.put("msg22", this.f33757J);
            jSONObject.put("msg23", this.K);
            jSONObject.put("msg24", this.L);
            jSONObject.put("msg25", this.M);
            jSONObject.put(n0.o.mnm, this.f33759P);
            jSONObject.put("cp_pl_id", this.f33760Q);
            JSONObject jSONObject2 = this.f33761R;
            if (jSONObject2 != null) {
                jSONObject.put("p_c", jSONObject2);
            }
            jSONObject.put("real_p", this.S);
            int i5 = this.T;
            if (i5 != -1) {
                jSONObject.put("real_g", i5);
            }
            int i6 = this.f33762U;
            if (i6 != -1) {
                jSONObject.put("real_t", i6);
            }
            JSONObject jSONObject3 = this.W;
            if (jSONObject3 != null) {
                jSONObject.put(com.smartdigimkt.w7.a.p0, jSONObject3);
            }
            if (!TextUtils.isEmpty(this.X)) {
                jSONObject.put("x_c", new JSONArray(this.X));
            }
            if (!TextUtils.isEmpty(this.f33764Y)) {
                jSONObject.put("o_r", this.f33764Y);
            }
            jSONObject.put("channel_from", this.Z);
            return jSONObject;
        } catch (Exception e2) {
            e2.printStackTrace();
            return jSONObject;
        }
    }

    public static c a(String str) {
        c cVar = new c();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("key")) {
                    cVar.f33765a = jSONObject.optString("key", "");
                }
                if (jSONObject.has("requestid")) {
                    cVar.f33766b = jSONObject.optString("requestid", "");
                }
                if (jSONObject.has("unitid")) {
                    cVar.f33767c = jSONObject.optString("unitid", "");
                }
                if (jSONObject.has("psid")) {
                    cVar.d = jSONObject.optString("psid", "");
                }
                if (jSONObject.has("sessionid")) {
                    cVar.f33768e = jSONObject.optString("sessionid", "");
                }
                if (jSONObject.has("groupid")) {
                    cVar.f = jSONObject.optString("groupid", "");
                }
                if (jSONObject.has("unitgroupid")) {
                    cVar.g = jSONObject.optString("unitgroupid", "");
                }
                if (jSONObject.has("timestamp")) {
                    cVar.f33769h = jSONObject.optString("timestamp", "");
                }
                if (jSONObject.has("asid")) {
                    cVar.f33770i = jSONObject.optString("asid", "");
                }
                if (jSONObject.has("refresh")) {
                    cVar.j = jSONObject.optString("refresh", "");
                }
                if (jSONObject.has("is_s")) {
                    cVar.f33763V = jSONObject.optInt("is_s", 0);
                }
                if (jSONObject.has("traffic_group_id")) {
                    cVar.m = jSONObject.optString("traffic_group_id", "");
                }
                if (jSONObject.has("msg")) {
                    cVar.f33772n = jSONObject.optString("msg", "");
                }
                if (jSONObject.has("msg1")) {
                    cVar.o = jSONObject.optString("msg1", "");
                }
                if (jSONObject.has("msg2")) {
                    cVar.f33773p = jSONObject.optString("msg2", "");
                }
                if (jSONObject.has("msg3")) {
                    cVar.q = jSONObject.optString("msg3", "");
                }
                if (jSONObject.has("msg4")) {
                    cVar.r = jSONObject.optString("msg4", "");
                }
                if (jSONObject.has("msg5")) {
                    cVar.s = jSONObject.optString("msg5", "");
                }
                if (jSONObject.has("msg6")) {
                    cVar.t = jSONObject.optString("msg6", "");
                }
                if (jSONObject.has("msg7")) {
                    cVar.f33774u = jSONObject.optString("msg7", "");
                }
                if (jSONObject.has("msg8")) {
                    cVar.v = jSONObject.optString("msg8", "");
                }
                if (jSONObject.has("msg9")) {
                    cVar.f33775w = jSONObject.optString("msg9", "");
                }
                if (jSONObject.has("msg10")) {
                    cVar.x = jSONObject.optString("msg10", "");
                }
                if (jSONObject.has("msg11")) {
                    cVar.y = jSONObject.optString("msg11", "");
                }
                if (jSONObject.has("msg12")) {
                    cVar.f33776z = jSONObject.optString("msg12", "");
                }
                if (jSONObject.has("msg13")) {
                    cVar.f33752A = jSONObject.optString("msg13", "");
                }
                if (jSONObject.has("msg14")) {
                    cVar.f33753B = jSONObject.optString("msg14", "");
                }
                if (jSONObject.has("msg15")) {
                    cVar.C = jSONObject.optString("msg15", "");
                }
                if (jSONObject.has(n0.o.mnm)) {
                    cVar.f33759P = jSONObject.optString(n0.o.mnm, "");
                }
                if (jSONObject.has("cp_pl_id")) {
                    cVar.f33760Q = jSONObject.optString("cp_pl_id", "");
                }
                if (jSONObject.has("p_c")) {
                    cVar.f33761R = jSONObject.optJSONObject("p_c");
                }
                if (jSONObject.has(com.smartdigimkt.w7.a.p0)) {
                    cVar.W = jSONObject.optJSONObject(com.smartdigimkt.w7.a.p0);
                }
                cVar.S = jSONObject.optString("real_p", "");
                cVar.T = jSONObject.optInt("real_g", -1);
                cVar.f33762U = jSONObject.optInt("real_t", -1);
                if (jSONObject.has("x_c")) {
                    cVar.X = jSONObject.optString("x_c");
                    return cVar;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return cVar;
    }
}
