package com.smartdigimkt.q5;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.smartdigimkt.i7.d;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.p6.o;
import com.smartdigimkt.p6.p;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.sdk.basead.ui.RoundCornerRelativeLayout;
import com.smartdigimkt.sdk.basead.ui.animplayerview.AlbumScaleAnimPlayerView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.EmptyAnimPlayer;
import com.smartdigimkt.sdk.basead.ui.animplayerview.GuideToClickAnimPlayerView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.RedPacketAnimPlayerView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.ViewPagerAnimPlayerView;
import com.smartdigimkt.sdk.basead.ui.animplayerview.WebLandpagePlayerView;
import com.smartdigimkt.sdk.basead.webtemplet.WTWebContainerView;
import com.smartdigimkt.v3.l;
import com.smartdigimkt.v3.m;
import com.smartdigimkt.w5.g;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.n;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f37926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    com.smartdigimkt.v6.a f37927c;
    f d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f37928e;
    boolean f;
    com.smartdigimkt.w5.a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    BasePlayerView f37929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    BasePlayerView.a f37930i;
    c j;
    long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f37931l;
    BasePlayerView.a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.smartdigimkt.l3.a f37932n;
    private boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private View f37933p;
    private WTWebContainerView q;
    private boolean r;
    ConcurrentHashMap<Integer, Boolean> s;

    public class b implements Runnable {
        final /* synthetic */ int X;

        public b(int i2) {
            this.X = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j;
            long jD;
            o oVarB;
            long jE = a.this.e();
            long jF = a.this.f();
            if (a.this.d == null || (oVarB = p.c().b(a.this.d.k0())) == null) {
                j = 0;
                jD = 0;
            } else {
                long jA = oVarB.a();
                jD = oVarB.d();
                j = jA;
            }
            a aVar = a.this;
            d.b(aVar.f37927c, aVar.d, this.X, jE, j, jF, jD);
        }
    }

    public interface c {
        l a();

        com.smartdigimkt.v3.a b();
    }

    public a(View view, com.smartdigimkt.v6.a aVar, f fVar) {
        this(view, aVar, fVar, com.smartdigimkt.n8.c.K(view.getContext()));
    }

    private void m() {
        com.smartdigimkt.l3.a aVar = this.f37932n;
        if (aVar != null) {
            aVar.a();
            this.f37932n = null;
        }
    }

    private void o() {
        if (this.o) {
            if (this.f37932n == null) {
                com.smartdigimkt.l3.a aVar = new com.smartdigimkt.l3.a();
                this.f37932n = aVar;
                aVar.a(this.f37926b);
            }
            this.f37932n.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        c cVar = this.j;
        if (cVar != null) {
            l lVarA = cVar.a();
            com.smartdigimkt.m3.f.a(5, this.d, lVarA);
            com.smartdigimkt.m3.f.a(31, this.d, lVarA);
        }
    }

    private void s() {
        c cVar = this.j;
        if (cVar != null) {
            com.smartdigimkt.m3.f.a(11, this.d, cVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        c cVar = this.j;
        if (cVar != null) {
            com.smartdigimkt.m3.f.a(1, this.d, cVar.a());
        }
    }

    private void u() {
        if (this.j != null) {
            this.k = System.currentTimeMillis();
            long currentPosition = this.f37929h.getCurrentPosition();
            this.f37931l = currentPosition;
            if (currentPosition != 0) {
                com.smartdigimkt.m3.f.a(15, this.d, this.j.a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        c cVar = this.j;
        if (cVar != null) {
            l lVarA = cVar.a();
            lVarA.j = a(false);
            com.smartdigimkt.m3.f.a(17, this.d, lVarA);
        }
    }

    private void w() {
        c cVar = this.j;
        if (cVar != null) {
            l lVarA = cVar.a();
            lVarA.f39137i = this.j.b();
            com.smartdigimkt.m3.f.a(16, this.d, lVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        c cVar = this.j;
        if (cVar != null) {
            l lVarA = cVar.a();
            lVarA.f39137i = this.j.b();
            com.smartdigimkt.m3.f.a(14, this.d, lVarA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        c cVar = this.j;
        if (cVar != null) {
            com.smartdigimkt.m3.f.a(35, this.d, cVar.a());
        }
    }

    public void f(int i2) {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            basePlayerView.setVisibility(i2);
        }
    }

    public boolean g() {
        BasePlayerView basePlayerView = this.f37929h;
        return basePlayerView != null && (basePlayerView instanceof WebLandpagePlayerView);
    }

    public boolean h() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            return basePlayerView.isMute();
        }
        return false;
    }

    public boolean i() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            return basePlayerView.isPlayCompletion();
        }
        return false;
    }

    public boolean j() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            return basePlayerView.isPlaying();
        }
        return false;
    }

    public void k() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            if (basePlayerView.isPlaying()) {
                s();
            }
            this.f37929h.pause();
        }
    }

    public void l() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            this.j = null;
            this.g = null;
            basePlayerView.setListener(this.m);
            this.f37929h.rePlayVideo();
        }
    }

    public void n() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView == null || basePlayerView.getParent() == null) {
            return;
        }
        ((ViewGroup) this.f37929h.getParent()).removeView(this.f37929h);
        this.f37929h = null;
    }

    public void p() {
        BasePlayerView basePlayerView;
        if (this.r && (basePlayerView = this.f37929h) != null && basePlayerView.hasVideo()) {
            if (!this.f37929h.isPlaying()) {
                u();
            }
            this.f37929h.start();
            if (this.f) {
                return;
            }
            o();
        }
    }

    public void q() {
        a(124);
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView == null || !basePlayerView.isPlaying()) {
            return;
        }
        this.f37929h.stop();
        this.f37929h.removeAllViews();
        w();
    }

    public a(View view, com.smartdigimkt.v6.a aVar, f fVar, int i2) {
        this.f37925a = "a";
        this.r = true;
        Context context = view.getContext();
        this.f37926b = context;
        this.f37927c = aVar;
        this.d = fVar;
        this.f37928e = i2;
        this.f37929h = (BasePlayerView) view.findViewById(h.a(context, "myoffer_player_view_id", "id"));
        this.o = i.d(this.d, this.f37927c);
        View viewFindViewById = view.findViewById(h.a(this.f37926b, "myoffer_player_view_container_id", "id"));
        this.f37933p = viewFindViewById;
        if (viewFindViewById != null && (viewFindViewById instanceof RoundCornerRelativeLayout)) {
            ((RoundCornerRelativeLayout) viewFindViewById).setRadius(0);
        }
        this.r = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i2) {
        c cVar = this.j;
        if (cVar != null) {
            l lVarA = cVar.a();
            if (i2 == 25) {
                com.smartdigimkt.m3.f.a(2, this.d, lVarA);
            } else if (i2 == 50) {
                com.smartdigimkt.m3.f.a(3, this.d, lVarA);
            } else {
                if (i2 != 75) {
                    return;
                }
                com.smartdigimkt.m3.f.a(4, this.d, lVarA);
            }
        }
    }

    public void b(boolean z2) {
        this.r = z2;
        k();
    }

    public void c(boolean z2) {
        if (z2) {
            this.r = z2;
        }
        p();
    }

    public void d(boolean z2) {
        if (!z2) {
            o();
        }
        this.f = z2;
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            basePlayerView.setMute(z2);
        }
    }

    public void e(int i2) {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            basePlayerView.setViewType(i2);
        }
    }

    public long f() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            return basePlayerView.getVideoLength();
        }
        return 0L;
    }

    public void b(int i2) {
        boolean zJ = j();
        k();
        if (zJ) {
            com.smartdigimkt.l7.b.a().b((Runnable) new b(i2), 8);
        }
    }

    public BasePlayerView c() {
        return this.f37929h;
    }

    public long e() {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            return basePlayerView.getCurrentPosition();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(boolean z2) {
        c cVar = this.j;
        if (cVar != null) {
            if (z2) {
                l lVarA = cVar.a();
                lVarA.f39137i = this.j.b();
                com.smartdigimkt.m3.f.a(12, this.d, lVarA);
            } else {
                l lVarA2 = cVar.a();
                lVarA2.f39137i = this.j.b();
                com.smartdigimkt.m3.f.a(13, this.d, lVarA2);
            }
        }
    }

    public void a(BasePlayerView.a aVar) {
        this.f37930i = aVar;
    }

    public void c(int i2) {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            basePlayerView.release(i2);
        }
    }

    public void a(c cVar) {
        this.j = cVar;
    }

    public void d(int i2) {
        BasePlayerView webLandpagePlayerView;
        if (this.f37929h != null) {
            Context context = this.f37926b;
            if (i2 == 101) {
                webLandpagePlayerView = new WebLandpagePlayerView(context);
            } else if (i2 == 1) {
                webLandpagePlayerView = new EmptyAnimPlayer(context);
            } else if (i2 == 2) {
                webLandpagePlayerView = new GuideToClickAnimPlayerView(context);
            } else if (i2 == 3) {
                webLandpagePlayerView = new RedPacketAnimPlayerView(context);
            } else if (i2 == 4) {
                webLandpagePlayerView = new ViewPagerAnimPlayerView(context);
            } else if (i2 != 5) {
                webLandpagePlayerView = new EmptyAnimPlayer(context);
            } else {
                webLandpagePlayerView = new AlbumScaleAnimPlayerView(context);
            }
            webLandpagePlayerView.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f37929h.getParent();
            viewGroup.addView(webLandpagePlayerView, viewGroup.indexOfChild(this.f37929h), this.f37929h.getLayoutParams());
            viewGroup.removeView(this.f37929h);
            this.f37929h = webLandpagePlayerView;
        }
    }

    public void e(boolean z2) {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null) {
            basePlayerView.setNeedInterruptRelease(z2);
        }
    }

    public void a(com.smartdigimkt.w5.a aVar) {
        this.g = aVar;
    }

    public void b() {
        m();
    }

    public void a(WTWebContainerView wTWebContainerView) {
        this.q = wTWebContainerView;
    }

    /* JADX INFO: renamed from: com.smartdigimkt.q5.a$a, reason: collision with other inner class name */
    public class C0571a implements BasePlayerView.a {
        public C0571a() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(com.smartdigimkt.v3.h hVar) {
            String str = a.this.f37925a;
            hVar.c();
            if (a.this.g != null) {
                HashMap map = new HashMap();
                map.put(g.a.f39431i, hVar.c());
                a.this.g.a(map);
            }
            a.this.a(108);
            a.this.v();
            BasePlayerView.a aVar = a.this.f37930i;
            if (aVar != null) {
                aVar.a(hVar);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b() {
            a aVar = a.this;
            String str = aVar.f37925a;
            aVar.a(101);
            a aVar2 = a.this;
            com.smartdigimkt.w5.a aVar3 = aVar2.g;
            if (aVar3 != null) {
                aVar3.a(aVar2.f37929h.getVideoLength());
            }
            a.this.k = System.currentTimeMillis();
            a.this.t();
            BasePlayerView.a aVar4 = a.this.f37930i;
            if (aVar4 != null) {
                aVar4.b();
                a.this.f37930i.b(0L);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void c() {
            a aVar = a.this;
            String str = aVar.f37925a;
            BasePlayerView.a aVar2 = aVar.f37930i;
            if (aVar2 != null) {
                aVar2.c();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void d() {
            a aVar = a.this;
            String str = aVar.f37925a;
            aVar.a(107);
            a.this.r();
            BasePlayerView.a aVar2 = a.this.f37930i;
            if (aVar2 != null) {
                aVar2.d();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void e() {
            a aVar = a.this;
            String str = aVar.f37925a;
            aVar.f(false);
            BasePlayerView.a aVar2 = a.this.f37930i;
            if (aVar2 != null) {
                aVar2.e();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void onVideoDownloadResume() {
            String str = a.this.f37925a;
            com.smartdigimkt.g7.c.a().d(a.this.d.k0());
            BasePlayerView.a aVar = a.this.f37930i;
            if (aVar != null) {
                aVar.onVideoDownloadResume();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(int i2) {
            a.this.g(i2);
            BasePlayerView.a aVar = a.this.f37930i;
            if (aVar != null) {
                aVar.a(i2);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(long j) {
            if (a.this.g != null) {
                HashMap map = new HashMap();
                map.put(g.a.k, Long.valueOf(j));
                a.this.g.a(map);
            }
            a.this.a(125);
            a.this.a(j);
            BasePlayerView.a aVar = a.this.f37930i;
            if (aVar != null) {
                aVar.b(j);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a() {
            a aVar = a.this;
            String str = aVar.f37925a;
            aVar.f(true);
            BasePlayerView.a aVar2 = a.this.f37930i;
            if (aVar2 != null) {
                aVar2.a();
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void a(long j) {
            a aVar = a.this;
            String str = aVar.f37925a;
            if (aVar.g != null) {
                HashMap map = new HashMap();
                map.put("video_length", Long.valueOf(j));
                a.this.g.a(map);
            }
            a.this.a(123);
            a.this.y();
            BasePlayerView.a aVar2 = a.this.f37930i;
            if (aVar2 != null) {
                aVar2.a(j);
            }
        }

        @Override // com.smartdigimkt.sdk.basead.ui.animplayerview.BasePlayerView.a
        public void b(int i2) {
            a aVar = a.this;
            String str = aVar.f37925a;
            aVar.x();
            BasePlayerView.a aVar2 = a.this.f37930i;
            if (aVar2 != null) {
                aVar2.b(i2);
            }
        }
    }

    public BasePlayerView a(boolean z2, List<Bitmap> list, com.smartdigimkt.k5.d dVar) {
        this.f = z2;
        if (this.f37929h != null) {
            C0571a c0571a = new C0571a();
            this.m = c0571a;
            this.f37929h.setListener(c0571a);
            this.f37929h.init(this.d, this.f37927c, this.f, list, dVar);
        }
        return this.f37929h;
    }

    public void a(int i2) {
        com.smartdigimkt.w5.a aVar = this.g;
        if (aVar != null) {
            aVar.a(i2);
        }
        if (this.q != null) {
            com.smartdigimkt.w5.a aVar2 = this.g;
            this.q.notifyInnerAdEvent(i2, aVar2 != null ? aVar2.c() : null);
        }
    }

    public boolean a() {
        BasePlayerView basePlayerView = this.f37929h;
        return (basePlayerView == null || basePlayerView.getParent() == null || !(this.f37929h.getParent() instanceof ViewGroup)) ? false : true;
    }

    public void a(int i2, int i3, Intent intent) {
        if (g()) {
            ((WebLandpagePlayerView) this.f37929h).onActivityResult(i2, i3, intent);
        }
    }

    public View d() {
        return this.f37933p;
    }

    public boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView == null || !(basePlayerView instanceof WebLandpagePlayerView)) {
            return false;
        }
        return ((WebLandpagePlayerView) basePlayerView).openInternalWebView(str, iOfferClickHandler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        n nVarR0;
        Map<Integer, String[]> mapE0;
        f fVar = this.d;
        if (!(fVar instanceof com.smartdigimkt.w6.l) || (nVarR0 = ((com.smartdigimkt.w6.l) fVar).R0()) == null || (mapE0 = nVarR0.e0()) == null || mapE0.size() <= 0) {
            return;
        }
        if (this.s == null) {
            this.s = new ConcurrentHashMap<>();
        }
        long j2 = j / 1000;
        for (Integer num : mapE0.keySet()) {
            if (this.s.get(num) == null || !this.s.get(num).booleanValue()) {
                if (j2 >= num.intValue() && this.j != null) {
                    this.s.put(num, Boolean.TRUE);
                    l lVarA = this.j.a();
                    lVarA.j.f39149i = num.intValue();
                    com.smartdigimkt.m3.f.a(32, this.d, lVarA);
                }
            }
        }
    }

    public m a(boolean z2) {
        BasePlayerView basePlayerView = this.f37929h;
        if (basePlayerView != null && !basePlayerView.hasVideo()) {
            return null;
        }
        m mVar = new m();
        mVar.j = this.f37928e == 2 ? 4 : 1;
        mVar.f39150l = 1;
        BasePlayerView basePlayerView2 = this.f37929h;
        mVar.f39144a = basePlayerView2 != null ? basePlayerView2.getVideoLength() / 1000 : 0L;
        mVar.f39145b = this.f37931l / 1000;
        BasePlayerView basePlayerView3 = this.f37929h;
        mVar.f39146c = basePlayerView3 != null ? basePlayerView3.getCurrentPosition() / 1000 : 0L;
        long j = this.f37931l;
        mVar.d = j == 0 ? 1 : 0;
        mVar.k = j == 0 ? 1 : 2;
        BasePlayerView basePlayerView4 = this.f37929h;
        mVar.f39147e = (basePlayerView4 == null || basePlayerView4.getCurrentPosition() != this.f37929h.getVideoLength()) ? 0 : 1;
        mVar.m = z2 ? 0 : 2;
        mVar.f = this.k;
        mVar.g = System.currentTimeMillis();
        BasePlayerView basePlayerView5 = this.f37929h;
        mVar.f39148h = basePlayerView5 != null ? basePlayerView5.getCurrentPosition() : 0L;
        mVar.toString();
        return mVar;
    }
}
