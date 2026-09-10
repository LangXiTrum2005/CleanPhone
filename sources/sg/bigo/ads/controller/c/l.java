package sg.bigo.ads.controller.c;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.MimeTypeMap;
import com.p004ironsource.d9;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.core.u;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends b implements sg.bigo.ads.core.a.a {

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final AtomicInteger f47991N = new AtomicInteger();
    protected String D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    protected sg.bigo.ads.api.core.o.a f47992E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    protected sg.bigo.ads.api.core.o.a[] f47993F;
    protected sg.bigo.ads.api.core.o.c G;
    protected int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    protected int f47994I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected sg.bigo.ads.api.core.o.b f47995J;
    protected sg.bigo.ads.api.core.o.d K;
    public int L;
    protected sg.bigo.ads.api.core.i.b M;
    private sg.bigo.ads.core.f.a.p O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private sg.bigo.ads.api.core.n f47996P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private boolean f47997Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private String f47998R;
    private int S;
    private int T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f47999U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private sg.bigo.ads.core.f.a.a.C0869a f48000V;
    private sg.bigo.ads.core.f.a.a.C0869a W;
    private boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f48001Y;
    private int Z;
    private int aa;
    private int ab;
    private int ac;
    private Pair<Bitmap, String> ad;
    private boolean ae;
    private final String af;
    private String ag;
    private boolean ah;
    private u ai;

    public l(long j, sg.bigo.ads.api.core.h hVar, sg.bigo.ads.api.a.l lVar, JSONObject jSONObject) {
        super(j, hVar, lVar, jSONObject);
        this.f47994I = 0;
        this.L = 0;
        this.f47997Q = false;
        this.S = 0;
        this.T = 0;
        this.X = false;
        this.f48001Y = false;
        this.Z = 4;
        this.aa = 6;
        this.ab = 4;
        this.ac = 0;
        this.ae = false;
        this.D = jSONObject.optString("iurl");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("icon");
        if (jSONObjectOptJSONObject != null) {
            this.f47992E = new i(jSONObjectOptJSONObject);
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("images");
        if (jSONArrayOptJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject2 != null) {
                    arrayList.add(new i(jSONObjectOptJSONObject2));
                }
            }
            i[] iVarArr = new i[arrayList.size()];
            this.f47993F = iVarArr;
            this.f47993F = (sg.bigo.ads.api.core.o.a[]) arrayList.toArray(iVarArr);
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("video");
        if (jSONObjectOptJSONObject3 != null) {
            this.G = new r(jSONObjectOptJSONObject3);
        }
        this.f47995J = new j(jSONObject);
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_play_cfg");
        if (jSONObjectOptJSONObject4 != null) {
            this.K = new s(jSONObjectOptJSONObject4);
        }
        this.H = jSONObject.optInt("immersive_ad_type", 0);
        try {
            if (1 == this.f47942A) {
                List<sg.bigo.ads.api.core.c> list = this.f47955a;
                if (!sg.bigo.ads.common.utils.k.a((Collection) list)) {
                    sg.bigo.ads.api.a.m mVar = this.y;
                    if (mVar == null || mVar.a("multi_ads.multi_ads_type") != 1) {
                        this.f47994I = 1;
                    } else {
                        this.f47994I = 2;
                    }
                    for (sg.bigo.ads.api.core.c cVar : list) {
                        if (cVar instanceof l) {
                            ((l) cVar).f47994I = this.f47994I;
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject(d9.h.d);
        if (jSONObjectOptJSONObject5 != null) {
            this.M = new h(jSONObjectOptJSONObject5);
        }
        this.af = this.f47961l + "_" + this.f47957c + "_" + f47991N.addAndGet(1);
    }

    private sg.bigo.ads.core.f.a.b bq() {
        sg.bigo.ads.core.f.a.p pVar = this.O;
        if (pVar != null) {
            return pVar.f48535n;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String a(Context context) {
        return aS() ? sg.bigo.ads.common.o.c(context) : sg.bigo.ads.common.o.b(context);
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.o.b aA() {
        return this.f47995J;
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.o.d aB() {
        return this.K;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aC() {
        return this.S;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aD() {
        return this.T;
    }

    @Override // sg.bigo.ads.api.core.o
    public final long aE() {
        return this.f47999U;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aF() {
        sg.bigo.ads.core.f.a.a.C0869a c0869a = this.W;
        return c0869a != null && c0869a.a();
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aG() {
        sg.bigo.ads.core.f.a.a.C0869a c0869a = this.f48000V;
        return c0869a != null && c0869a.a();
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aH() {
        return this.f47994I;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aI() {
        return this.ag;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aJ() {
        return !TextUtils.isEmpty(this.af) ? this.af : String.valueOf(this.j);
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aK() {
        sg.bigo.ads.core.f.a.b bVarBq = bq();
        if (bVarBq != null) {
            return bVarBq.f48495c;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final long aL() {
        sg.bigo.ads.api.core.o.d dVar = this.K;
        if (dVar != null) {
            return dVar.a();
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int aM() {
        return this.L;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aN() {
        sg.bigo.ads.core.f.a.b bVarBq = bq();
        String str = bVarBq != null ? bVarBq.f48496e : null;
        if (sg.bigo.ads.common.utils.q.b((CharSequence) str)) {
            return str;
        }
        sg.bigo.ads.core.f.a.p pVar = this.O;
        if (pVar != null) {
            return pVar.o;
        }
        return null;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aO() {
        sg.bigo.ads.api.core.o.d dVar;
        if (!aS() && (dVar = this.K) != null && dVar.b() && dVar.c() < 100) {
            sg.bigo.ads.core.f.a.b bVarBq = bq();
            if (bVarBq != null ? "video/mp4".equals(bVarBq.d) : false) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aP() {
        return aK();
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aQ() {
        String strAN = aN();
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) strAN)) {
            return strAN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode());
        return sb.toString();
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aR() {
        return this.f47959h == 2;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aS() {
        sg.bigo.ads.core.f.a.b bVarBq = bq();
        return bVarBq != null && bVarBq.a();
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aT() {
        sg.bigo.ads.api.core.o.a aVar;
        sg.bigo.ads.api.core.o.a[] aVarArr = this.f47993F;
        if (aVarArr == null || aVarArr.length <= 0 || (aVar = aVarArr[0]) == null) {
            return null;
        }
        return aVar.c();
    }

    @Override // sg.bigo.ads.api.core.o
    public final long aU() {
        sg.bigo.ads.core.f.a.p pVar = this.O;
        if (pVar != null) {
            return pVar.s;
        }
        return 0L;
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.n aV() {
        return this.f47996P;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aW() {
        return this.f47997Q;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void aX() {
        this.f47997Q = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String aY() {
        String strAT;
        if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f47998R)) {
            return this.f47998R;
        }
        if (aR()) {
            sg.bigo.ads.core.f.a.b bVarBq = bq();
            if (bVarBq != null) {
                this.f47998R = bVarBq.d;
            }
            if (!sg.bigo.ads.common.utils.q.a((CharSequence) this.f47998R)) {
                return this.f47998R;
            }
            strAT = aK();
        } else {
            strAT = aT();
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(strAT));
        this.f47998R = mimeTypeFromExtension;
        return mimeTypeFromExtension;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean aZ() {
        return this.ae;
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.o.a av() {
        return this.f47992E;
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.i.b aw() {
        return this.M;
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.o.a[] ax() {
        return this.f47993F;
    }

    @Override // sg.bigo.ads.api.core.o
    public final sg.bigo.ads.api.core.o.c ay() {
        return this.G;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String az() {
        return this.D;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String b(Context context) {
        return a(context) + File.separator + aQ();
    }

    @Override // sg.bigo.ads.api.core.o
    public final void ba() {
        this.ae = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bb() {
        return this.X;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bc() {
        this.X = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bd() {
        return this.Z;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int be() {
        return this.aa;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bf() {
        return this.ab;
    }

    @Override // sg.bigo.ads.api.core.o
    public final int bg() {
        return this.ac;
    }

    @Override // sg.bigo.ads.api.core.o
    public final Pair<Bitmap, String> bh() {
        return this.ad;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bi() {
        return this.f48001Y;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bj() {
        this.f48001Y = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void bk() {
        this.ah = true;
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean bl() {
        return this.ah;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.a.C0869a bm() {
        return this.f48000V;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.a.C0869a bn() {
        return this.W;
    }

    @Override // sg.bigo.ads.core.a.a
    public final u bo() {
        if (this.ai == null) {
            this.ai = new u(this.C);
        }
        return this.ai;
    }

    @Override // sg.bigo.ads.core.a.a
    public final sg.bigo.ads.core.f.a.p bp() {
        return this.O;
    }

    @Override // sg.bigo.ads.api.core.o
    public final String c(Context context) {
        Pair pair;
        if (!aO()) {
            this.L = 0;
            return b(context);
        }
        sg.bigo.ads.core.player.a.d dVarB = sg.bigo.ads.core.player.b.a().b();
        String strAK = aK();
        String strA = a(context);
        String strAQ = aQ();
        File file = new File(strA, strAQ);
        if (file.exists()) {
            pair = new Pair(Uri.fromFile(file).toString(), 1);
        } else if (dVarB.a()) {
            StringBuilder sb = new StringBuilder(strAK);
            if (strAK.contains("?")) {
                sb.append(d9.i.f24749c);
            } else {
                sb.append("?");
            }
            androidx.media3.extractor.text.ttml.a.C(sb, "path=", strA, "&name=", strAQ);
            Locale locale = Locale.US;
            pair = new Pair("http://127.0.0.1:" + dVarB.f48749c + "/" + sg.bigo.ads.common.utils.q.e(sb.toString()), 2);
        } else {
            pair = new Pair(strAK, 3);
        }
        this.L = ((Integer) pair.second).intValue();
        return (String) pair.first;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void d(String str) {
        if ("video/mp4".equals(this.f47998R) || sg.bigo.ads.common.utils.q.a((CharSequence) str)) {
            return;
        }
        this.f47998R = str;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void f(int i2) {
        this.S = i2;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void g(int i2) {
        this.T = i2;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void h(int i2) {
        this.Z = i2;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void i(int i2) {
        this.aa = i2;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void j(int i2) {
        this.ab = i2;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void k(int i2) {
        this.ac = i2;
    }

    @Override // sg.bigo.ads.controller.c.b, sg.bigo.ads.api.core.c
    public final String s() {
        sg.bigo.ads.core.f.a.p pVar = this.O;
        return (pVar == null || !sg.bigo.ads.common.utils.q.b((CharSequence) pVar.f48536p)) ? super.s() : this.O.f48536p;
    }

    @Override // sg.bigo.ads.controller.c.b, sg.bigo.ads.api.core.c
    public final String t() {
        sg.bigo.ads.core.f.a.p pVar = this.O;
        return (pVar == null || !sg.bigo.ads.common.utils.q.b((CharSequence) pVar.q)) ? super.t() : this.O.q;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void a(Pair<Bitmap, String> pair) {
        this.ad = pair;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void b(long j) {
        this.f47999U = j;
    }

    @Override // sg.bigo.ads.api.core.o
    public final void a(sg.bigo.ads.api.core.n nVar) {
        sg.bigo.ads.api.core.n nVar2 = this.f47996P;
        if (nVar2 == null || nVar2.f47056c <= 0 || nVar.f47056c != 0) {
            this.f47996P = nVar;
        }
    }

    @Override // sg.bigo.ads.core.a.a
    public final void b(sg.bigo.ads.core.f.a.a.C0869a c0869a) {
        this.W = c0869a;
    }

    @Override // sg.bigo.ads.core.a.a
    public final void a(sg.bigo.ads.core.f.a.a.C0869a c0869a) {
        this.f48000V = c0869a;
    }

    @Override // sg.bigo.ads.core.a.a
    public final void a(sg.bigo.ads.core.f.a.p pVar) {
        this.O = pVar;
        if (pVar != null && sg.bigo.ads.common.utils.q.b((CharSequence) pVar.m)) {
            N().a(this.O.m);
        }
        sg.bigo.ads.api.core.o.d dVar = this.K;
        if (dVar != null) {
            dVar.a(aU());
        }
    }

    @Override // sg.bigo.ads.api.core.o
    public final void c(String str) {
        if (this.f47994I == 2) {
            this.f47994I = 3;
            List<sg.bigo.ads.api.core.c> list = this.f47955a;
            if (!sg.bigo.ads.common.utils.k.a((Collection) list)) {
                for (sg.bigo.ads.api.core.c cVar : list) {
                    if (cVar instanceof l) {
                        ((l) cVar).f47994I = this.f47994I;
                    }
                }
            }
        }
        if (this.ag == null) {
            this.ag = str;
        } else {
            this.ag = android.support.v4.media.a.s(new StringBuilder(), this.ag, ",", str);
        }
    }

    @Override // sg.bigo.ads.api.core.o
    public final boolean c(long j) {
        sg.bigo.ads.api.core.o.d dVar = this.K;
        return j >= ((long) (dVar != null ? dVar.c() : 50));
    }
}
