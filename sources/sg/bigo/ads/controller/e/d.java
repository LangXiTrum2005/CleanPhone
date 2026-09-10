package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p004ironsource.z8;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements sg.bigo.ads.common.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdConfig f48092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Context f48093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final sg.bigo.ads.controller.b.d f48094c;
    String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f48095e;
    int f;
    String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f48096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f48097i;
    String j;
    String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f48098l;
    public String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f48099n;
    String o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f48100p;
    long q;
    long r;
    int s;
    String t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f48101u = 0;
    private long v = 0;

    public d(Context context, AdConfig adConfig, sg.bigo.ads.controller.b.d dVar) {
        this.f48093b = context;
        this.f48092a = adConfig;
        this.f48094c = dVar;
    }

    @Override // sg.bigo.ads.common.g
    public final String A() {
        sg.bigo.ads.common.a aVarL = this.f48094c.L();
        return aVarL != null ? aVarL.f47088b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String B() {
        return sg.bigo.ads.common.b.a.a(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final String C() {
        return this.f48094c.F();
    }

    @Override // sg.bigo.ads.common.g
    public final int D() {
        return (int) (r.b() / 1000);
    }

    @Override // sg.bigo.ads.common.g
    public final String E() {
        return this.f48094c.j();
    }

    @Override // sg.bigo.ads.common.g
    public final boolean F() {
        sg.bigo.ads.common.a aVarK = this.f48094c.K();
        if (aVarK != null) {
            return aVarK.f47089c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String G() {
        sg.bigo.ads.common.a aVarK = this.f48094c.K();
        return aVarK != null ? aVarK.f47088b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String H() {
        return this.f48099n;
    }

    @Override // sg.bigo.ads.common.g
    public final String I() {
        return this.o;
    }

    @Override // sg.bigo.ads.common.g
    public final int J() {
        return this.f48100p;
    }

    @Override // sg.bigo.ads.common.g
    public final long K() {
        return this.q;
    }

    @Override // sg.bigo.ads.common.g
    public final long L() {
        return this.r;
    }

    @Override // sg.bigo.ads.common.g
    public final long M() {
        return p.a(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final long N() {
        return p.c();
    }

    @Override // sg.bigo.ads.common.g
    public final long O() {
        return p.a();
    }

    @Override // sg.bigo.ads.common.g
    public final String P() {
        return this.f48094c.l();
    }

    @Override // sg.bigo.ads.common.g
    public final String Q() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String R() {
        return q.d(sg.bigo.ads.common.aa.b.e(this.f48093b));
    }

    @Override // sg.bigo.ads.common.g
    public final String S() {
        return q.d(sg.bigo.ads.common.aa.b.c(this.f48093b));
    }

    @Override // sg.bigo.ads.common.g
    public final String T() {
        return this.t;
    }

    @Override // sg.bigo.ads.common.g
    public final String U() {
        sg.bigo.ads.controller.b.d dVar = this.f48094c;
        return dVar != null ? dVar.G() : "";
    }

    @Override // sg.bigo.ads.common.g
    public final long V() {
        return h.a().f48133e.f48136a;
    }

    @Override // sg.bigo.ads.common.g
    public final long W() {
        return h.a().f48133e.f48137b;
    }

    @Override // sg.bigo.ads.common.g
    public final String X() {
        return sg.bigo.ads.common.x.a.r();
    }

    @Override // sg.bigo.ads.common.g
    public final long Y() {
        if (this.f48101u == 0) {
            try {
                Context context = this.f48093b;
                this.f48101u = sg.bigo.ads.common.utils.c.c(context, context.getPackageName());
            } catch (Exception unused) {
                this.f48101u = -1L;
            }
        }
        return this.f48101u;
    }

    @Override // sg.bigo.ads.common.g
    public final long Z() {
        if (this.v == 0) {
            try {
                Context context = this.f48093b;
                this.v = sg.bigo.ads.common.utils.c.d(context, context.getPackageName());
            } catch (Exception unused) {
                this.v = -1L;
            }
        }
        return this.v;
    }

    @Override // sg.bigo.ads.common.g
    public final String a() {
        return this.f48092a.getAppKey();
    }

    @Override // sg.bigo.ads.common.g
    public final String aa() {
        return "official";
    }

    @Override // sg.bigo.ads.common.g
    public final int ab() {
        return this.s;
    }

    @Override // sg.bigo.ads.common.g
    public final sg.bigo.ads.common.b ac() {
        if (this.f48094c.n().a(15)) {
            return sg.bigo.ads.common.aa.b.h(this.f48093b);
        }
        sg.bigo.ads.common.aa.b.j(this.f48093b);
        return null;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ad() {
        sg.bigo.ads.common.a aVarM = this.f48094c.M();
        if (aVarM != null) {
            return aVarM.f47089c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String ae() {
        sg.bigo.ads.common.a aVarM = this.f48094c.M();
        return aVarM != null ? aVarM.f47088b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final Context af() {
        return this.f48093b;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ag() {
        return sg.bigo.ads.common.aa.b.k(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ah() {
        return sg.bigo.ads.common.aa.b.l(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ai() {
        return sg.bigo.ads.common.aa.b.c();
    }

    @Override // sg.bigo.ads.common.g
    public final float aj() {
        return sg.bigo.ads.common.aa.b.m(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ak() {
        return sg.bigo.ads.common.aa.b.o(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final float al() {
        return sg.bigo.ads.common.aa.b.p(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final int am() {
        return sg.bigo.ads.common.aa.b.q(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final int an() {
        return sg.bigo.ads.common.aa.b.r(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ao() {
        return sg.bigo.ads.common.aa.b.u(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ap() {
        return sg.bigo.ads.common.aa.b.s(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final int aq() {
        return sg.bigo.ads.common.aa.b.t(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final long ar() {
        return sg.bigo.ads.common.aa.b.v(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean as() {
        return sg.bigo.ads.common.aa.b.w(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean at() {
        return sg.bigo.ads.common.aa.b.n(this.f48093b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean au() {
        return sg.bigo.ads.common.aa.b.d();
    }

    @Override // sg.bigo.ads.common.g
    public final String b() {
        return this.d;
    }

    @Override // sg.bigo.ads.common.g
    public final String c() {
        return this.f48095e;
    }

    @Override // sg.bigo.ads.common.g
    public final int d() {
        return this.f;
    }

    @Override // sg.bigo.ads.common.g
    public final String e() {
        return this.f48092a.getChannel();
    }

    @Override // sg.bigo.ads.common.g
    public final int f() {
        return this.f48092a.getAge();
    }

    @Override // sg.bigo.ads.common.g
    public final int g() {
        return this.f48092a.getGender();
    }

    @Override // sg.bigo.ads.common.g
    public final long h() {
        return this.f48092a.getActivatedTime();
    }

    @Override // sg.bigo.ads.common.g
    public final String i() {
        return "android";
    }

    @Override // sg.bigo.ads.common.g
    public final String j() {
        return Build.VERSION.RELEASE;
    }

    @Override // sg.bigo.ads.common.g
    public final String k() {
        return this.g;
    }

    @Override // sg.bigo.ads.common.g
    public final String l() {
        return this.f48096h;
    }

    @Override // sg.bigo.ads.common.g
    public final String m() {
        return this.f48097i;
    }

    @Override // sg.bigo.ads.common.g
    public final String n() {
        return this.j;
    }

    @Override // sg.bigo.ads.common.g
    public final String o() {
        return this.k;
    }

    @Override // sg.bigo.ads.common.g
    public final int p() {
        return this.f48098l;
    }

    @Override // sg.bigo.ads.common.g
    public final String q() {
        return this.m;
    }

    @Override // sg.bigo.ads.common.g
    public final String r() {
        int iA = sg.bigo.ads.common.aa.c.a(this.f48093b);
        if (iA == 1) {
            return "2g";
        }
        if (iA == 2) {
            return z8.f27868a;
        }
        if (iA == 3) {
            return z8.f27869b;
        }
        if (iA != 4) {
            return iA != 5 ? "unknown" : "5g";
        }
        return "4g";
    }

    @Override // sg.bigo.ads.common.g
    public final String s() {
        return q.d(sg.bigo.ads.common.utils.c.a());
    }

    @Override // sg.bigo.ads.common.g
    public final String t() {
        String strK = this.f48094c.k();
        return !TextUtils.isEmpty(strK) ? strK : v();
    }

    @Override // sg.bigo.ads.common.g
    public final String u() {
        return this.f48094c.k();
    }

    @Override // sg.bigo.ads.common.g
    public final String v() {
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String strR = R();
        return !TextUtils.isEmpty(strR) ? strR : S();
    }

    @Override // sg.bigo.ads.common.g
    public final String w() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String x() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String y() {
        return "5.5.1";
    }

    @Override // sg.bigo.ads.common.g
    public final boolean z() {
        sg.bigo.ads.common.a aVarL = this.f48094c.L();
        if (aVarL != null) {
            return aVarL.f47089c;
        }
        return true;
    }
}
