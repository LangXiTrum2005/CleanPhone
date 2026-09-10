package sg.bigo.ads.controller.c;

import android.os.SystemClock;
import android.text.TextUtils;
import com.p004ironsource.d9;
import com.p004ironsource.ne;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b implements sg.bigo.ads.api.core.c {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    int f47942A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Map<String, String> f47943B;
    int C;
    private JSONObject D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final long f47944E;
    private final long G;
    private final sg.bigo.ads.api.core.h H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private long f47946I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f47947J;
    private int K;
    private boolean M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f47948N;
    private final String O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private String f47949P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f47950Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private boolean f47951R;
    private String S;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final double f47952U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private String f47953V;
    private final boolean W;
    private String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f47954Y;
    private String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    List<sg.bigo.ads.api.core.c> f47955a;
    private sg.bigo.ads.api.core.c.d aa;
    private String ab;
    private int ac;
    private int ad;
    private boolean ae;
    private int af;
    private boolean ag;
    private int ai;
    private int aj;
    private sg.bigo.ads.api.core.q ak;
    private String al;
    private int am;
    private int an;
    private int ao;
    private int ap;
    private String ar;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final sg.bigo.ads.api.a.l f47956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected String f47957c;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f47958e;
    protected String f;
    protected final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f47959h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f47960i;
    protected long j;
    protected String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected String f47961l;
    protected sg.bigo.ads.api.core.c.e m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected sg.bigo.ads.api.core.c.f[] f47962n;
    protected sg.bigo.ads.api.core.c.f[] o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected sg.bigo.ads.api.core.c.f[] f47963p;
    protected sg.bigo.ads.api.core.c.f[] q;
    protected List<sg.bigo.ads.api.core.c.InterfaceC0832c> r;
    protected String s;
    protected long t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected String f47964u;
    protected String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected sg.bigo.ads.api.core.c.b f47965w;
    protected sg.bigo.ads.api.core.c.a x;
    sg.bigo.ads.api.a.m y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f47966z;
    private int L = 0;
    private int T = 2;
    private int ah = 1;
    private sg.bigo.ads.api.core.j aq = new sg.bigo.ads.api.core.j();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final long f47945F = SystemClock.elapsedRealtime();

    public b(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        this.am = 1;
        this.an = 0;
        this.ao = 1;
        this.C = 0;
        this.ar = "";
        this.G = j;
        this.H = hVar;
        this.f47956b = lVar;
        this.f47957c = jSONObject.optString("ad_id", "");
        this.d = jSONObject.optString("title", "");
        this.f47958e = jSONObject.optString("description", "");
        this.f = jSONObject.optString("cta", "");
        String strOptString = jSONObject.optString("dsp_name", "");
        this.g = strOptString;
        this.W = "BigoDsp".equalsIgnoreCase(strOptString);
        this.f47959h = jSONObject.optInt("adx_type", 0);
        this.f47960i = jSONObject.optInt("ad_type", -1);
        this.j = jSONObject.optLong(ne.b1);
        this.k = jSONObject.optString("creative_id", "");
        this.f47961l = jSONObject.optString("series_id", "");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject != null) {
            this.m = new o(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("track_clicks_third");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new q(jSONObjectOptJSONObject2));
                }
            }
            sg.bigo.ads.api.core.c.f[] fVarArr = new sg.bigo.ads.api.core.c.f[arrayList.size()];
            this.o = fVarArr;
            this.o = (sg.bigo.ads.api.core.c.f[]) arrayList.toArray(fVarArr);
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("track_impls_third");
        if (jSONArrayOptJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                if (jSONObjectOptJSONObject3 != null) {
                    arrayList2.add(new q(jSONObjectOptJSONObject3));
                }
            }
            sg.bigo.ads.api.core.c.f[] fVarArr2 = new sg.bigo.ads.api.core.c.f[arrayList2.size()];
            this.f47962n = fVarArr2;
            this.f47962n = (sg.bigo.ads.api.core.c.f[]) arrayList2.toArray(fVarArr2);
        }
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("ad_nurls");
        if (jSONArrayOptJSONArray3 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (int i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray3.optJSONObject(i4);
                if (jSONObjectOptJSONObject4 != null) {
                    arrayList3.add(new q(jSONObjectOptJSONObject4));
                }
            }
            sg.bigo.ads.api.core.c.f[] fVarArr3 = new sg.bigo.ads.api.core.c.f[arrayList3.size()];
            this.f47963p = fVarArr3;
            this.f47963p = (sg.bigo.ads.api.core.c.f[]) arrayList3.toArray(fVarArr3);
        }
        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("ad_lurls");
        if (jSONArrayOptJSONArray4 != null) {
            ArrayList arrayList4 = new ArrayList();
            for (int i5 = 0; i5 < jSONArrayOptJSONArray4.length(); i5++) {
                JSONObject jSONObjectOptJSONObject5 = jSONArrayOptJSONArray4.optJSONObject(i5);
                if (jSONObjectOptJSONObject5 != null) {
                    arrayList4.add(new q(jSONObjectOptJSONObject5));
                }
            }
            sg.bigo.ads.api.core.c.f[] fVarArr4 = new sg.bigo.ads.api.core.c.f[arrayList4.size()];
            this.q = fVarArr4;
            this.q = (sg.bigo.ads.api.core.c.f[]) arrayList4.toArray(fVarArr4);
        }
        this.r = new ArrayList();
        JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray("om_data");
        if (jSONArrayOptJSONArray5 != null) {
            this.r = new ArrayList();
            for (int i6 = 0; i6 < jSONArrayOptJSONArray5.length(); i6++) {
                this.r.add(new m(jSONArrayOptJSONArray5.optJSONObject(i6)));
            }
        }
        this.s = jSONObject.optString("enc_price", "");
        this.f47965w = new k(jSONObject);
        this.x = new f(jSONObject);
        this.t = jSONObject.optLong("switch_bit_map", 0L);
        this.f47964u = jSONObject.optString("abflags", "");
        this.f47944E = jSONObject.optLong("expired_interval", 0L);
        this.v = jSONObject.optString("mapping_slot", "");
        this.f47946I = jSONObject.optLong("probe_interval");
        this.f47947J = jSONObject.optInt("playable_ad_switch", 0);
        this.f47966z = jSONObject.optString("req_slot");
        String strOptString2 = jSONObject.optString("interstitial_style_getad_config");
        if (!TextUtils.isEmpty(strOptString2)) {
            try {
                this.y = new sg.bigo.ads.controller.b.j(new JSONObject(strOptString2));
            } catch (JSONException unused) {
            }
        }
        this.aq.a(jSONObject.optString("ad_form"));
        this.f47949P = jSONObject.optString(d9.h.F0);
        this.O = jSONObject.optString("sdk_style_id");
        this.f47950Q = jSONObject.optInt("banner_show_ad", 0) == 1;
        this.f47951R = jSONObject.optInt("banner_show_domain", 0) == 1;
        this.S = jSONObject.optString("ru_ad_marker");
        this.f47952U = (jSONObject.optLong("bid_price", 0L) * 1.0d) / 1.0E8d;
        this.f47953V = jSONObject.optString("adx_country");
        this.aj = jSONObject.optInt("orientation", 0);
        if (sg.bigo.ads.api.core.b.d(this.f47960i)) {
            this.D = jSONObject;
        }
        this.X = jSONObject.optString("ad_bundle_id", "");
        this.f47954Y = jSONObject.optString("pop_h5");
        this.Z = jSONObject.optString("pop_img");
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("pop_page");
        if (jSONObjectOptJSONObject6 != null) {
            this.aa = new n(jSONObjectOptJSONObject6);
        }
        int iOptInt = jSONObject.optInt("ad_resp_type");
        this.f47942A = iOptInt;
        if (iOptInt == 1) {
            jSONObject2 = jSONObject;
            a(jSONObject2, j, hVar, lVar);
        } else {
            jSONObject2 = jSONObject;
        }
        this.f47943B = sg.bigo.ads.common.utils.l.a(jSONObject2.optString("pub_extra_info"));
        this.al = jSONObject2.optString("dsp_extra");
        this.am = jSONObject2.optInt("native_banner_fill_strategy", 1);
        this.an = jSONObject2.optInt("guide_type", 0);
        this.ao = jSONObject2.optInt("native_banner_click_type", 0);
        this.ap = jSONObject2.optInt("is_interactive", 0);
        this.C = jSONObject2.optInt("vpaid_imp_method", 0);
        this.ar = jSONObject2.optString("sponsored", "");
    }

    @Override // sg.bigo.ads.api.core.c
    public final String A() {
        return this.f47961l;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.e B() {
        return this.m;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.f[] C() {
        return this.f47962n;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.f[] D() {
        return this.o;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.f[] E() {
        return this.f47963p;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.f[] F() {
        return this.q;
    }

    @Override // sg.bigo.ads.api.core.c
    public final List<sg.bigo.ads.api.core.c.InterfaceC0832c> G() {
        return this.r;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String H() {
        return this.s;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String I() {
        return this.f47964u;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean J() {
        if (!this.M || this.f47948N <= 0) {
            return SystemClock.elapsedRealtime() - this.f47945F >= this.f47944E * 1000;
        }
        return System.currentTimeMillis() > this.f47948N;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    @Override // sg.bigo.ads.api.core.c
    public final long K() {
        long jElapsedRealtime;
        if (this.M) {
            long j = this.f47948N;
            if (j > 0) {
                long j2 = j - (this.f47944E * 1000);
                jElapsedRealtime = j2 > 0 ? System.currentTimeMillis() - j2 : 0L;
            } else {
                jElapsedRealtime = SystemClock.elapsedRealtime() - this.f47945F;
            }
        } else {
            jElapsedRealtime = SystemClock.elapsedRealtime() - this.f47945F;
        }
        if (jElapsedRealtime > 0) {
            return jElapsedRealtime;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long L() {
        return this.f47944E;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String M() {
        return this.v;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.b N() {
        return this.f47965w;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.a O() {
        return this.x;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int P() {
        return this.f47942A;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String Q() {
        return this.ab;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int R() {
        return this.ac;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void S() {
        this.ac = this.ad;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void T() {
        this.ae = true;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean U() {
        return this.ae;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int V() {
        return this.af;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int W() {
        return this.ah;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int X() {
        return this.ai;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.q Y() {
        return this.ak;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long Z() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long a() {
        return sg.bigo.ads.api.a.i.f46986a.i();
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.h aa() {
        return this.H;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String ab() {
        return !sg.bigo.ads.common.utils.q.a((CharSequence) this.O) ? this.O : this.f47956b.p();
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ac() {
        return this.f47947J == 1;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ad() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ae() {
        return this.L;
    }

    @Override // sg.bigo.ads.api.core.c
    public final JSONObject af() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void ag() {
        this.M = true;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ah() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.c
    public final double ai() {
        return this.f47952U;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int aj() {
        return this.f47956b.v();
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ak() {
        return this.f47956b.v() == 2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean al() {
        return this.W;
    }

    @Override // sg.bigo.ads.api.core.c
    public final List<sg.bigo.ads.api.core.c> am() {
        return this.f47955a;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String an() {
        return this.al;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ao() {
        return this.am;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int ap() {
        return this.an;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int aq() {
        return this.ao;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean ar() {
        return this.aj == 1;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int as() {
        return this.ap;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int at() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String au() {
        return this.ar;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String b() {
        return this.f47956b.l();
    }

    @Override // sg.bigo.ads.api.core.c
    public final String c() {
        return this.f47956b.n();
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.a.l d() {
        return this.f47956b;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.a.m e() {
        return this.y;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.a.e f() {
        return this.aq;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int g() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean h() {
        sg.bigo.ads.api.a.m mVar = this.y;
        return mVar != null && mVar.a("endpage.ad_component_layout") == 5;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String i() {
        return this.f47949P;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean j() {
        return this.f47950Q;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean k() {
        return this.f47951R;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String l() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String m() {
        return this.f47953V;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String n() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String o() {
        return this.f47954Y;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String p() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.c
    public final sg.bigo.ads.api.core.c.d q() {
        return this.aa;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String r() {
        return this.f47957c;
    }

    @Override // sg.bigo.ads.api.core.c
    public String s() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.d)) {
            return this.d;
        }
        sg.bigo.ads.api.core.c.d dVar = this.aa;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.b())) ? this.d : this.aa.b();
    }

    @Override // sg.bigo.ads.api.core.c
    public String t() {
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f47958e)) {
            return this.f47958e;
        }
        sg.bigo.ads.api.core.c.d dVar = this.aa;
        return (dVar == null || sg.bigo.ads.common.utils.q.a((CharSequence) dVar.c())) ? this.f47958e : this.aa.c();
    }

    @Override // sg.bigo.ads.api.core.c
    public final String u() {
        return this.f;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String v() {
        return this.g;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int w() {
        return this.f47959h;
    }

    @Override // sg.bigo.ads.api.core.c
    public final int x() {
        return this.f47960i;
    }

    @Override // sg.bigo.ads.api.core.c
    public final long y() {
        return this.j;
    }

    @Override // sg.bigo.ads.api.core.c
    public final String z() {
        return this.k;
    }

    public static b a(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, String str) {
        try {
            return a(j, hVar, lVar, new JSONObject(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // sg.bigo.ads.api.core.c
    public final String b(String str) {
        if (str == null) {
            return "";
        }
        Map<String, String> map = this.f47943B;
        String str2 = map != null ? map.get(str) : "";
        return str2 == null ? "" : str2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void c(int i2) {
        this.af = i2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void d(int i2) {
        this.K = i2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void e(int i2) {
        this.L = i2;
    }

    public static b a(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("adx_type", 0);
        if (iOptInt != 1 && iOptInt != 2) {
            if (iOptInt == 3) {
                return new d(j, hVar, lVar, jSONObject);
            }
            if (iOptInt != 5) {
                return null;
            }
        }
        return new l(j, hVar, lVar, jSONObject);
    }

    @Override // sg.bigo.ads.api.core.c
    public final void b(int i2) {
        this.ad = i2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(int i2, int i3, boolean z2) {
        if (!this.ag || z2) {
            this.ag = true;
            this.ah = i2;
            this.ai = i3;
        }
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(long j) {
        this.f47948N = j;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(String str) {
        this.ab = str;
    }

    private void a(JSONObject jSONObject, long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ads");
        ArrayList arrayList = null;
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject != null) {
                    b bVarA = a(j, hVar, lVar, jSONObjectOptJSONObject);
                    if (bVarA != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        bVarA.f47942A = this.f47942A;
                        arrayList.add(bVarA);
                    } else {
                        sg.bigo.ads.core.d.b.a(1005, 10205, "Error ad in ads");
                    }
                }
            }
        }
        this.f47955a = arrayList;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(sg.bigo.ads.api.core.q qVar) {
        this.ak = qVar;
    }

    @Override // sg.bigo.ads.api.core.c
    public final void a(boolean z2) {
        this.T = z2 ? 1 : 2;
    }

    @Override // sg.bigo.ads.api.core.c
    public final boolean a(int i2) {
        return (this.t & ((long) i2)) > 0;
    }
}
