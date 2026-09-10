package sg.bigo.ads.ad.interstitial.c;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.TextView;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a extends sg.bigo.ads.ad.interstitial.v {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f45875h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final sg.bigo.ads.ad.interstitial.f f45876i;
    protected ViewGroup j;
    protected ViewGroup k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected TextView f45877l;
    protected final sg.bigo.ads.ad.interstitial.e.c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final ValueCallback<Double> f45878n;

    /* JADX WARN: Type inference failed for: r2v1, types: [sg.bigo.ads.api.core.c] */
    public a(sg.bigo.ads.ad.b.c cVar, int i2, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.e.c cVar2) {
        super(cVar, mVar);
        this.f45878n = new ValueCallback<Double>() { // from class: sg.bigo.ads.ad.interstitial.c.a.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Double d) {
                Double d2 = d;
                if (d2 != null) {
                    a.this.a(d2.doubleValue());
                }
            }
        };
        this.f45875h = i2;
        ?? F2 = cVar.f();
        this.f45876i = new sg.bigo.ads.ad.interstitial.f(mVar.a("endpage.gp_element"), 0, F2 != 0 ? F2.n() : "");
        this.m = cVar2;
    }

    public static int a(sg.bigo.ads.api.a.m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.a(mVar, "endpage.webview_layout");
    }

    public static int b(sg.bigo.ads.api.a.m mVar) {
        return sg.bigo.ads.ad.interstitial.d.a.b(mVar, "endpage.webview_force_time");
    }

    public abstract void a(double d);

    public abstract void a(int i2, boolean z2, boolean z3);

    public abstract void d(sg.bigo.ads.ad.interstitial.r rVar);

    @Override // sg.bigo.ads.ad.interstitial.v
    public final int e() {
        sg.bigo.ads.api.a.m mVar = this.g;
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("endpage.mediaview_colour") : 3);
    }

    public final int f(sg.bigo.ads.ad.interstitial.r rVar) {
        int i2;
        sg.bigo.ads.api.a.m mVar = this.g;
        if (mVar == null) {
            return -16736769;
        }
        int iA = mVar.a("endpage.cta_color");
        return (iA == 3 && d() && (i2 = sg.bigo.ads.ad.interstitial.v.a(rVar).f46659i) != 0) ? i2 : sg.bigo.ads.ad.interstitial.s.a(this.f, iA, null);
    }

    public boolean g() {
        return false;
    }

    public abstract int h();

    public void i() {
        String strI = ((sg.bigo.ads.core.a.a) this.f.f()).i();
        TextView textView = (TextView) this.k.findViewById(R.id.inter_advertiser);
        TextView textView2 = (TextView) this.k.findViewById(R.id.inter_ad_label);
        if (TextUtils.isEmpty(strI)) {
            textView.setVisibility(8);
        } else if (textView2 != null) {
            textView.setText(strI);
            textView.setPadding(sg.bigo.ads.common.utils.e.a(this.k.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1), sg.bigo.ads.common.utils.e.a(textView.getContext(), 4), sg.bigo.ads.common.utils.e.a(textView.getContext(), 1));
            textView2.setText(R.string.bigo_ad_tag);
        }
    }

    public final boolean j() {
        sg.bigo.ads.api.a.m mVar = this.g;
        return mVar != null && mVar.c("endpage.is_cta_show_animation");
    }

    public final int k() {
        sg.bigo.ads.api.a.m mVar = this.g;
        return sg.bigo.ads.ad.interstitial.multi_img.e.a(mVar != null ? mVar.a("endpage.background_colour") : 1);
    }

    public final View a(sg.bigo.ads.ad.interstitial.r rVar, ViewGroup viewGroup, int i2) {
        boolean z2 = true;
        if (viewGroup == null) {
            return this.j;
        }
        this.j = viewGroup;
        if (this.k == null) {
            ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), h(), null, false);
            this.k = viewGroup2;
            this.j.addView(viewGroup2, new ViewGroup.LayoutParams(-1, -1));
        }
        this.f45877l = (TextView) this.k.findViewById(R.id.inter_warning);
        d(rVar);
        a(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.c.a.2
            @Override // java.lang.Runnable
            public final void run() {
                a aVar = a.this;
                sg.bigo.ads.ad.interstitial.e.c cVar = aVar.m;
                if (cVar != null) {
                    cVar.a(aVar.k, 1);
                }
            }
        });
        a(rVar, 1);
        ViewGroup viewGroup3 = this.j;
        ViewGroup viewGroup4 = this.k;
        sg.bigo.ads.api.a.m mVar = this.g;
        a(rVar, viewGroup3, viewGroup4, null, i2, 4, mVar == null ? 0 : mVar.a("endpage.click_type"), this.k);
        i();
        sg.bigo.ads.api.a.m mVar2 = this.g;
        int iA = mVar2 != null ? mVar2.a("endpage.click_type") : 0;
        sg.bigo.ads.api.a.m mVar3 = this.g;
        boolean z3 = mVar3 == null || mVar3.a("endpage.media_view_clickable_switch") == 1;
        sg.bigo.ads.api.a.m mVar4 = this.g;
        if (mVar4 != null && mVar4.a("endpage.other_space_clickable_switch") != 1) {
            z2 = false;
        }
        a(iA, z3, z2);
        sg.bigo.ads.ad.interstitial.v.a(rVar).e().a(this.f45878n);
        return this.k;
    }

    public final Pair<Integer, Boolean> e(sg.bigo.ads.ad.interstitial.r rVar) {
        return Pair.create(Integer.valueOf(f(rVar)), Boolean.valueOf(j()));
    }

    public static a a(sg.bigo.ads.ad.b.c cVar, sg.bigo.ads.api.a.m mVar, sg.bigo.ads.ad.interstitial.multi_img.b bVar, sg.bigo.ads.ad.interstitial.e.c cVar2, boolean z2) {
        if (mVar == null || z2) {
            return null;
        }
        int iA = mVar.a("endpage.ad_component_layout");
        switch (iA) {
            case 6:
                if (bVar == null) {
                    return null;
                }
                return new s(cVar, iA, mVar, bVar, cVar2);
            case 7:
                if (bVar == null) {
                    return null;
                }
                return new t(cVar, iA, mVar, bVar, cVar2);
            case 8:
                if (bVar == null) {
                    return null;
                }
                return new u(cVar, iA, mVar, bVar, cVar2);
            case 9:
                if (bVar == null) {
                    return null;
                }
                return new v(cVar, iA, mVar, bVar, cVar2);
            case 10:
                if (bVar == null) {
                    return null;
                }
                return new c(cVar, iA, mVar, bVar, cVar2);
            case 11:
                if (bVar == null) {
                    return null;
                }
                return new d(cVar, iA, mVar, bVar, cVar2);
            case 12:
                if (bVar == null) {
                    return null;
                }
                return new e(cVar, iA, mVar, bVar, cVar2);
            case 13:
                if (bVar == null) {
                    return null;
                }
                return new f(cVar, iA, mVar, bVar, cVar2);
            case 14:
                return new g(cVar, iA, mVar, cVar2);
            case 15:
                return new h(cVar, iA, mVar, cVar2);
            case 16:
                return new i(cVar, iA, mVar, cVar2);
            case 17:
                return new j(cVar, iA, mVar, cVar2);
            case 18:
                return new k(cVar, iA, mVar, cVar2);
            case 19:
                return new l(cVar, iA, mVar, cVar2);
            case 20:
                return new m(cVar, iA, mVar, cVar2);
            case 21:
                return new n(cVar, iA, mVar, cVar2);
            case 22:
                return new o(cVar, iA, mVar, cVar2);
            case 23:
                return new p(cVar, iA, mVar, cVar2);
            case 24:
                return new q(cVar, iA, mVar, cVar2);
            case 25:
                return new r(cVar, iA, mVar, cVar2);
            default:
                return null;
        }
    }

    public void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.c.a(this.k, this.j, runnable);
    }

    public void a(sg.bigo.ads.ad.interstitial.r rVar, int i2) {
    }

    public static boolean a(a aVar, sg.bigo.ads.api.a.m mVar) {
        if (aVar != null && aVar.d()) {
            return true;
        }
        if (mVar == null) {
            return false;
        }
        int iA = mVar.a("endpage.ad_component_layout");
        return iA == 3 || iA == 4;
    }
}
