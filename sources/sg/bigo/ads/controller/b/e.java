package sg.bigo.ads.controller.b;

import android.content.Context;
import android.os.Parcel;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.n;
import sg.bigo.ads.api.a.o;
import sg.bigo.ads.api.core.l;
import sg.bigo.ads.api.core.m;
import sg.bigo.ads.api.core.s;
import sg.bigo.ads.api.core.t;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e extends sg.bigo.ads.common.e implements sg.bigo.ads.api.a.h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    protected int f47900A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    protected boolean f47901B;
    protected String C;
    protected String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected m f47902E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected sg.bigo.ads.api.a.g f47903F;
    protected n G;
    protected o H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @Deprecated
    protected String f47904I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected Map<String, sg.bigo.ads.api.a.c> f47905J;

    @Deprecated
    protected String K;
    protected String L;
    protected c M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    protected int f47906N;
    private int O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f47907P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f47908Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f47909R;
    private int S;
    private int T;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final sg.bigo.ads.api.a.b f47910a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47911e;
    private int f;
    private String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected sg.bigo.ads.common.a f47912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected sg.bigo.ads.common.a f47913i;
    protected sg.bigo.ads.common.s.a j;
    protected sg.bigo.ads.common.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f47914l;
    protected boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected long f47915n;
    protected int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected String f47916p;
    protected String q;
    protected int r;
    protected String s;
    protected String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f47917u;
    protected String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected String f47918w;
    protected String x;

    @Deprecated
    protected String y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected String f47919z;

    public e(Context context) {
        super(context);
        this.r = 1;
        this.f47902E = new m();
        this.f47903F = new l();
        this.G = new s();
        this.H = new t();
        this.f47905J = new HashMap();
        this.M = new c();
        this.f47910a = new b();
        this.S = 0;
        this.T = 0;
    }

    public static long E() {
        return r.f47535a.a(30);
    }

    @Override // sg.bigo.ads.api.a.h
    public final int A() {
        return this.f47909R;
    }

    public final void B() {
        L();
        K();
        M();
    }

    public final int C() {
        boolean z2 = Math.abs((r.b() / 1000) - this.f47914l) > ((long) this.o);
        if (this.r == 0) {
            return z2 ? 4 : 5;
        }
        return z2 ? 3 : 2;
    }

    public final int D() {
        return this.f47900A;
    }

    public final String F() {
        return this.f47919z;
    }

    public final String G() {
        return this.L;
    }

    public final boolean H() {
        return this.m;
    }

    public final String I() {
        return this.C;
    }

    public final n J() {
        return this.G;
    }

    public final sg.bigo.ads.common.a K() {
        if (this.f47912h == null) {
            this.f47912h = sg.bigo.ads.common.a.f47087a;
        }
        if (this.f47912h.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.1
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f47912h = sg.bigo.ads.common.o.c.a(eVar.f47131b);
                    e.this.a(0L);
                }
            });
        }
        return this.f47912h;
    }

    public final sg.bigo.ads.common.a L() {
        if (this.f47913i == null) {
            this.f47913i = sg.bigo.ads.common.a.f47087a;
        }
        if (this.f47913i.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.2
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.f47913i = sg.bigo.ads.common.l.b.a(eVar.f47131b);
                    e.this.a(0L);
                }
            });
        }
        return this.f47913i;
    }

    public final sg.bigo.ads.common.a M() {
        if (this.k == null) {
            this.k = sg.bigo.ads.common.a.f47087a;
        }
        if (this.k.a()) {
            sg.bigo.ads.common.n.d.a(0, new Runnable() { // from class: sg.bigo.ads.controller.b.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = e.this;
                    eVar.k = sg.bigo.ads.common.k.a.a(eVar.f47131b);
                    e.this.a(0L);
                }
            });
        }
        return this.k;
    }

    public final boolean N() {
        return this.f47914l != 0;
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_config.dat";
    }

    public abstract void a(JSONObject jSONObject);

    @Override // sg.bigo.ads.common.f
    public final void b(Parcel parcel) {
        this.f47912h = new sg.bigo.ads.common.a(parcel);
        this.f47913i = new sg.bigo.ads.common.a(parcel);
        this.j = new sg.bigo.ads.common.s.a(this.f47131b, parcel);
        this.m = parcel.readInt() != 0;
        this.f47915n = parcel.readLong();
        this.o = parcel.readInt();
        this.f47916p = parcel.readString();
        this.q = parcel.readString();
        this.r = parcel.readInt();
        this.s = parcel.readString();
        this.t = parcel.readString();
        this.f47917u = parcel.readString();
        this.v = parcel.readString();
        this.f47918w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readString();
        this.f47919z = parcel.readString();
        this.f47900A = parcel.readInt();
        this.f47901B = parcel.readInt() != 0;
        this.C = parcel.readString();
        this.f47914l = parcel.readLong();
        if (parcel.dataAvail() > 0) {
            this.f47902E.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.D = parcel.readString();
        }
        if (parcel.dataAvail() > 0) {
            this.f47903F.b(parcel);
        }
        this.f47904I = sg.bigo.ads.common.n.a(parcel, "");
        this.f47905J = sg.bigo.ads.common.n.a(parcel, sg.bigo.ads.api.a.c.f46976b, new HashMap());
        this.K = sg.bigo.ads.common.n.a(parcel, "");
        if (parcel.dataAvail() > 0) {
            this.G.b(parcel);
        }
        if (parcel.dataAvail() > 0) {
            this.H.b(parcel);
        }
        this.L = sg.bigo.ads.common.n.a(parcel, "");
        sg.bigo.ads.common.n.b(parcel, this.M);
        this.f47906N = sg.bigo.ads.common.n.a(parcel, 0);
        sg.bigo.ads.common.n.b(parcel, this.f47910a);
        this.f47911e = sg.bigo.ads.common.n.a(parcel, 0);
        this.f = sg.bigo.ads.common.n.a(parcel, 0);
        this.k = new sg.bigo.ads.common.a(parcel);
        this.S = sg.bigo.ads.common.n.a(parcel, 0);
        this.T = sg.bigo.ads.common.n.a(parcel, 0);
        String strA = sg.bigo.ads.common.n.a(parcel, "");
        this.g = strA;
        a(strA);
    }

    public abstract void b(JSONObject jSONObject);

    public abstract void c(JSONObject jSONObject);

    @Override // sg.bigo.ads.api.a.h
    public final boolean c() {
        return this.f47902E.a(6);
    }

    public abstract void d(JSONObject jSONObject);

    @Override // sg.bigo.ads.api.a.h
    public final boolean d() {
        return this.f47902E.a(7);
    }

    public final void e(JSONObject jSONObject) {
        this.m = jSONObject.optInt("state", 1) == 1;
        this.f47915n = jSONObject.optLong("config_id", 0L);
        this.o = jSONObject.optInt("conf_interval", com.smartdigimkt.o1.b.l2);
        this.f47916p = jSONObject.optString("token", "");
        this.q = jSONObject.optString("anti_ban", "");
        this.r = jSONObject.optInt("config_strategy", 1);
        this.s = jSONObject.optString("abflags", "");
        this.t = jSONObject.optString("country", "");
        this.L = jSONObject.optString("req_country", "");
        this.f47906N = jSONObject.optInt("app_flag", 0);
        this.f47911e = jSONObject.optInt("ad_net", 0);
        this.f = jSONObject.optInt("orientation", 0);
        this.S = jSONObject.optInt("token_v", 0);
        this.T = jSONObject.optInt("token_exp", 0);
        String strOptString = jSONObject.optString("host_retry_cfg", "");
        this.g = strOptString;
        a(strOptString);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("creatives");
        if (jSONObjectOptJSONObject != null) {
            this.f47917u = jSONObjectOptJSONObject.toString();
        } else {
            this.f47917u = "";
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("track");
        if (jSONObjectOptJSONObject2 != null) {
            this.v = jSONObjectOptJSONObject2.toString();
        } else {
            this.v = "";
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("cb");
        if (jSONObjectOptJSONObject3 != null) {
            this.f47918w = jSONObjectOptJSONObject3.toString();
        } else {
            this.f47918w = "";
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("report");
        if (jSONObjectOptJSONObject4 != null) {
            this.x = jSONObjectOptJSONObject4.toString();
        } else {
            this.x = "";
        }
        this.y = "";
        this.K = "";
        String strOptString2 = jSONObject.optString("uid", "");
        if (!TextUtils.isEmpty(strOptString2)) {
            this.f47919z = strOptString2;
        }
        int iOptInt = jSONObject.optInt("concurrent_req_num", 3);
        this.f47900A = iOptInt;
        if (iOptInt <= 0) {
            this.f47900A = Integer.MAX_VALUE;
        }
        this.f47901B = jSONObject.optInt("neg_feedback", 1) == 1;
        this.C = jSONObject.optString("om_js_url", "");
        this.D = jSONObject.optString("banner_js_url", "");
        this.f47903F.a(jSONObject.optJSONObject("free_material"));
        this.G.a(jSONObject.optJSONObject("u_running_conf"));
        this.H.a(jSONObject.optJSONObject("u_running_inf"));
        this.f47902E.f47053a = jSONObject.optLong("global_switch", 0L);
        this.f47904I = "";
        c cVar = this.M;
        String strOptString3 = jSONObject.optString("ad_fill_strategy");
        if (!TextUtils.isEmpty(strOptString3)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString3);
                cVar.f47887a = jSONObject2.optInt("video_resolution", 0);
                cVar.f47888b = jSONObject2.optString("white_dsp", "");
                cVar.f47889c = jSONObject2.optString("black_dsp", "");
                cVar.d = jSONObject2.optInt("int_time", 0);
                cVar.f47890e = jSONObject2.optInt("rew_time", 0);
                cVar.f = jSONObject2.optInt("spl_time", 0);
                cVar.g = jSONObject2.optInt("nat_time", 0);
                cVar.f47891h = jSONObject2.optInt("pop_time", 0);
                cVar.f47892i.a(jSONObject2);
                cVar.j.a(jSONObject2);
                cVar.k.a(jSONObject2);
                cVar.f47893l.a(jSONObject2);
                cVar.m.a(jSONObject2);
            } catch (JSONException unused) {
            }
        }
        this.f47910a.a(jSONObject.optString("ad_fill_cost_optimize_strategy"));
        String strOptString4 = jSONObject.optString("global_conf");
        JSONArray jSONArray = null;
        try {
            if (!q.a((CharSequence) strOptString4)) {
                jSONArray = new JSONArray(strOptString4);
            }
        } catch (JSONException unused2) {
        }
        HashMap map = new HashMap();
        for (int i2 = 0; jSONArray != null && i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject5 = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject5 != null) {
                String strOptString5 = jSONObjectOptJSONObject5.optString("key");
                if (!q.a((CharSequence) strOptString5)) {
                    map.put(strOptString5, new sg.bigo.ads.api.a.c(jSONObjectOptJSONObject5.optString("value", "")));
                }
            }
        }
        this.f47905J = map;
        a(jSONObjectOptJSONObject2);
        b(jSONObjectOptJSONObject);
        c(jSONObjectOptJSONObject4);
        d(jSONObjectOptJSONObject3);
        this.f47914l = r.b() / 1000;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean f() {
        return this.f47902E.a(5);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean g() {
        return this.f47902E.a(4);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean h() {
        return this.f47902E.a(22);
    }

    @Override // sg.bigo.ads.api.a.h
    public final long i() {
        return this.f47915n;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String j() {
        return this.s;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String k() {
        return this.t;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String l() {
        return this.f47916p;
    }

    @Override // sg.bigo.ads.api.a.h
    public final sg.bigo.ads.api.a.j n() {
        return this.f47902E;
    }

    @Override // sg.bigo.ads.api.a.h
    public final String o() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.a.h
    public final sg.bigo.ads.api.a.g p() {
        return this.f47903F;
    }

    @Override // sg.bigo.ads.api.a.h
    public final sg.bigo.ads.api.a.b q() {
        return this.f47910a;
    }

    @Override // sg.bigo.ads.api.a.h
    public final sg.bigo.ads.api.a.d r() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int s() {
        return this.f47906N;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean t() {
        return this.f47911e == 1;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int u() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int v() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int w() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean x() {
        return 1 == this.O;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int y() {
        return this.f47907P;
    }

    @Override // sg.bigo.ads.api.a.h
    public final int z() {
        return this.f47908Q;
    }

    @Override // sg.bigo.ads.common.f
    public final void a(Parcel parcel) {
        if (this.f47912h == null) {
            this.f47912h = sg.bigo.ads.common.a.f47087a;
        }
        this.f47912h.a(parcel);
        if (this.f47913i == null) {
            this.f47913i = sg.bigo.ads.common.a.f47087a;
        }
        this.f47913i.a(parcel);
        if (this.j == null) {
            this.j = new sg.bigo.ads.common.s.a(this.f47131b);
        }
        this.j.a(parcel);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeLong(this.f47915n);
        parcel.writeInt(this.o);
        parcel.writeString(this.f47916p);
        parcel.writeString(this.q);
        parcel.writeInt(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.f47917u);
        parcel.writeString(this.v);
        parcel.writeString(this.f47918w);
        parcel.writeString(this.x);
        parcel.writeString(this.y);
        parcel.writeString(this.f47919z);
        parcel.writeInt(this.f47900A);
        parcel.writeInt(this.f47901B ? 1 : 0);
        parcel.writeString(this.C);
        parcel.writeLong(this.f47914l);
        this.f47902E.a(parcel);
        parcel.writeString(this.D);
        this.f47903F.a(parcel);
        parcel.writeString(this.f47904I);
        Map<String, sg.bigo.ads.api.a.c> map = this.f47905J;
        int size = map == null ? 0 : map.size();
        parcel.writeInt(size);
        if (size != 0) {
            for (Map.Entry<String, sg.bigo.ads.api.a.c> entry : map.entrySet()) {
                String key = entry.getKey();
                sg.bigo.ads.api.a.c value = entry.getValue();
                if (key == null || value == null) {
                    parcel.writeInt(0);
                } else {
                    sg.bigo.ads.common.n.a(parcel, value);
                    parcel.writeString(key);
                }
            }
        }
        parcel.writeString(this.K);
        this.G.a(parcel);
        this.H.a(parcel);
        parcel.writeString(this.L);
        sg.bigo.ads.common.n.a(parcel, this.M);
        parcel.writeInt(this.f47906N);
        sg.bigo.ads.common.n.a(parcel, this.f47910a);
        parcel.writeInt(this.f47911e);
        parcel.writeInt(this.f);
        if (this.k == null) {
            this.k = sg.bigo.ads.common.a.f47087a;
        }
        this.k.a(parcel);
        parcel.writeInt(this.S);
        parcel.writeInt(this.T);
        parcel.writeString(this.g);
    }

    @Override // sg.bigo.ads.api.a.h
    public final boolean e() {
        return d();
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.O = jSONObject.optInt("host_retry", 0);
            this.f47907P = jSONObject.optInt("retry_times", 3);
            this.f47908Q = jSONObject.optInt("retry_interval", 60);
            this.f47909R = jSONObject.optInt("next_retry_interval", 7);
        } catch (JSONException unused) {
        }
    }
}
