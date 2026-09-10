package com.smartdigimkt.b5;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.smartdigimkt.sdk.api.IExHandlerBaseAd;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.sdk.api.format.SDMNativeAdMediaViewListener;
import com.smartdigimkt.sdk.basead.ui.OwnNativeATView;
import com.smartdigimkt.w6.l;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends com.smartdigimkt.b5.d {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    com.smartdigimkt.k7.c f33931A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    HashMap<String, Object> f33932B;
    private IExHandlerBaseAd.DataFetchListener C;
    private boolean D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    com.smartdigimkt.k5.d f33933E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    View.OnClickListener f33934F;
    View.OnClickListener G;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f33935p;
    volatile boolean q;
    volatile boolean r;
    OwnNativeATView s;
    WeakReference<View> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    com.smartdigimkt.l5.a f33936u;
    com.smartdigimkt.q5.a.c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    com.smartdigimkt.m3.g f33937w;
    com.smartdigimkt.w5.a x;
    com.smartdigimkt.a6.c y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    com.smartdigimkt.k7.c f33938z;

    /* JADX INFO: renamed from: com.smartdigimkt.b5.a$a, reason: collision with other inner class name */
    public class C0443a extends com.smartdigimkt.k7.a {
        public C0443a() {
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            a.this.h();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.f33934F.onClick(view);
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(view, false);
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.a(view, true);
        }
    }

    public class e implements com.smartdigimkt.m3.g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f33940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f33941b;

        public e(int i2, int i3) {
            this.f33940a = i2;
            this.f33941b = i3;
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickCallback() {
            if (a.this.r) {
                return;
            }
            l lVar = a.this.f33956c;
            if (lVar != null && lVar.U0()) {
                if (a.this.f33956c.i() == null || a.this.f33956c.i().A() != 2) {
                    a aVar = a.this;
                    com.smartdigimkt.i7.d.c(aVar.f33956c, aVar.d, 1);
                    return;
                } else {
                    a aVar2 = a.this;
                    com.smartdigimkt.i7.d.c(aVar2.f33956c, aVar2.d, 2);
                }
            }
            com.smartdigimkt.f5.a aVar3 = a.this.f;
            if (aVar3 != null) {
                aVar3.onAdClick(new com.smartdigimkt.f5.j().a(this.f33940a, this.f33941b).c(a.this.d.t.z0()));
            }
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickEndUI() {
            com.smartdigimkt.w5.i.a().d();
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickStartUI() {
            a.this.c();
        }

        @Override // com.smartdigimkt.m3.g.d
        public void deeplinkCallback(boolean z2) {
            com.smartdigimkt.f5.a aVar;
            if (a.this.r) {
                return;
            }
            l lVar = a.this.f33956c;
            if ((lVar == null || !lVar.U0() || a.this.f33956c.i() == null || a.this.f33956c.i().A() == 2) && (aVar = a.this.f) != null) {
                aVar.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.m3.g.d
        public boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
            return false;
        }
    }

    public class f implements com.smartdigimkt.q5.a.c {
        public f() {
        }

        @Override // com.smartdigimkt.q5.a.c
        public com.smartdigimkt.v3.l a() {
            return a.this.a();
        }

        @Override // com.smartdigimkt.q5.a.c
        public com.smartdigimkt.v3.a b() {
            OwnNativeATView ownNativeATView = a.this.s;
            if (ownNativeATView != null) {
                return ownNativeATView.getAdClickRecord(13);
            }
            return null;
        }
    }

    public class g extends com.smartdigimkt.k7.a {
        public g() {
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public int getImpressionMinPercentageViewed() {
            return 25;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            a aVar = a.this;
            if (aVar.m == 0) {
                aVar.m = System.currentTimeMillis();
            }
        }
    }

    public class h extends com.smartdigimkt.k3.b.a {
        public h(com.smartdigimkt.w6.f fVar) {
            super(fVar);
        }

        @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd.DataFetchListener
        public void onStatusChanged(String str) {
            WeakReference<View> weakReference = a.this.t;
            if (weakReference == null || weakReference.get() == null) {
                a.this.d();
            }
            WeakReference<View> weakReference2 = a.this.t;
            View view = weakReference2 != null ? weakReference2.get() : null;
            if (view == null || !(view instanceof TextView)) {
                return;
            }
            ((TextView) view).setText(str);
        }
    }

    public class i implements com.smartdigimkt.w5.c.a {
        public i() {
        }

        @Override // com.smartdigimkt.w5.c.a
        public void a(int i2, int i3) {
            a aVar = a.this;
            aVar.a(aVar.d(), i2, i3);
        }
    }

    public class j extends com.smartdigimkt.w5.a {
        public j(ViewGroup viewGroup, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, com.smartdigimkt.w5.c.a aVar2) {
            super(viewGroup, fVar, aVar, i2, aVar2);
        }

        @Override // com.smartdigimkt.w5.a
        public ViewGroup.LayoutParams d() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            if (a.this.s != null) {
                layoutParams.gravity = 81;
                layoutParams.setMargins(0, 0, 0, 0);
            }
            return layoutParams;
        }
    }

    public class k implements OwnNativeATView.a {
        public k() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.OwnNativeATView.a
        public void onPause() {
            a.this.a(111);
        }

        @Override // com.smartdigimkt.sdk.basead.ui.OwnNativeATView.a
        public void onResume() {
            a.this.a(110);
        }
    }

    public a(Context context, l lVar, com.smartdigimkt.v6.a aVar, boolean z2) {
        super(context, lVar, aVar, z2);
        this.f33935p = "a";
        this.q = false;
        this.r = false;
        this.f33932B = new HashMap<>();
        this.D = false;
        this.f33934F = new c();
        this.G = new d();
        this.y = new com.smartdigimkt.a6.c(this.f33956c);
        this.v = new f();
        this.f33933E = new com.smartdigimkt.k5.d(lVar, aVar);
    }

    private void g() {
        l lVar;
        com.smartdigimkt.v6.a aVar;
        OwnNativeATView ownNativeATView = this.s;
        if (ownNativeATView == null || (lVar = this.f33956c) == null || (aVar = this.d) == null) {
            return;
        }
        this.x = new j(ownNativeATView, lVar, aVar, this.f33957e ? 5 : 6, new i());
        this.f33932B.put(com.smartdigimkt.w5.g.a.f39428c, this.f);
        this.x.a(this.f33932B);
        this.s.setLifeCallback(new k());
        com.smartdigimkt.l5.a aVar2 = this.f33936u;
        if (aVar2 != null) {
            aVar2.setATImproveClickViewController(this.x);
        }
        if (this.q) {
            a(114);
        }
    }

    public void a(View view, boolean z2) {
        WeakReference<View> weakReference = this.t;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null && view == view2) {
            a(view, 1, 1, z2);
        } else if (f() == null || !f().contains(view)) {
            a(view, 1, 2, z2);
        } else {
            a(view, 1, 3, z2);
        }
    }

    @Override // com.smartdigimkt.b5.d
    public View b() {
        return this.s;
    }

    public void c() {
    }

    public abstract View d();

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void destroy() {
        super.destroy();
        a(112);
        OwnNativeATView ownNativeATView = this.s;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
        }
        this.s = null;
        this.t = null;
        com.smartdigimkt.k5.d dVar = this.f33933E;
        if (dVar != null) {
            dVar.a();
        }
        com.smartdigimkt.m3.g gVar = this.f33937w;
        if (gVar != null) {
            gVar.a();
            this.f33937w = null;
        }
        if (this.C != null) {
            com.smartdigimkt.k3.b.a().removeDataFetchListener(this.C);
        }
        com.smartdigimkt.l5.a aVar = this.f33936u;
        if (aVar != null) {
            aVar.destroyPlayerView(3);
        }
        com.smartdigimkt.k7.c cVar = this.f33938z;
        if (cVar != null) {
            cVar.b();
            this.f33938z = null;
        }
        com.smartdigimkt.k7.c cVar2 = this.f33931A;
        if (cVar2 != null) {
            cVar2.b();
            this.f33931A = null;
        }
    }

    public OwnNativeATView e() {
        OwnNativeATView ownNativeATView = this.s;
        if (ownNativeATView != null) {
            ownNativeATView.releaseAllCallback();
            com.smartdigimkt.k5.d dVar = this.f33933E;
            if (dVar != null) {
                dVar.a();
                this.f33933E = null;
            }
        }
        OwnNativeATView ownNativeATView2 = new OwnNativeATView(this.f33955b);
        ownNativeATView2.setClickRecordHelper(this.y);
        this.D = false;
        return ownNativeATView2;
    }

    public List<View> f() {
        return null;
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public long getVideoCurrentPosition() {
        com.smartdigimkt.l5.a aVar = this.f33936u;
        if (aVar != null) {
            return aVar.getVideoCurrentPosition();
        }
        return 0L;
    }

    public void h() {
        if (this.q) {
            return;
        }
        this.q = true;
        l lVar = this.f33956c;
        if (lVar != null && lVar.U0()) {
            com.smartdigimkt.i7.d.c(this.f33956c, this.d, 3);
            this.r = true;
            return;
        }
        if (b() != null) {
            com.smartdigimkt.v3.l lVarA = a();
            if (lVarA != null) {
                com.smartdigimkt.m3.f.a(8, this.f33956c, lVarA);
            }
            com.smartdigimkt.f5.a aVar = this.f;
            if (aVar != null) {
                aVar.onAdShow(new com.smartdigimkt.f5.j().c(this.d.t.z0()));
            }
        }
        a(114);
        a(this.f33956c);
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void pauseVideo() {
        super.pauseVideo();
        com.smartdigimkt.l5.a aVar = this.f33936u;
        if (aVar != null) {
            aVar.pauseVideo();
        }
    }

    @Override // com.smartdigimkt.y4.a
    public void registerAdView(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        if (this.s == null || this.D) {
            return;
        }
        int iM1 = 1;
        this.D = true;
        com.smartdigimkt.k5.d dVar = this.f33933E;
        if (dVar != null && view2 != null) {
            dVar.b(view2);
        }
        if (!this.q && this.f33931A == null) {
            g gVar = new g();
            l lVar = this.f33956c;
            if (lVar != null && lVar.i() != null) {
                iM1 = this.f33956c.i().M1();
            }
            com.smartdigimkt.k7.c cVar = new com.smartdigimkt.k7.c(iM1, view.getContext(), 0);
            this.f33931A = cVar;
            cVar.a(view, gVar);
            a(201);
        }
        l lVar2 = this.f33956c;
        if (lVar2 != null && !lVar2.v0()) {
            a(view);
            if (list == null || list.size() <= 0) {
                a(view, this.f33934F);
            } else {
                for (View view3 : list) {
                    if (view3 != null) {
                        view3.setOnClickListener(this.f33934F);
                    }
                }
            }
            if (list2 != null && list2.size() > 0) {
                for (View view4 : list2) {
                    if (view4 != null) {
                        view4.setOnClickListener(this.G);
                    }
                }
            }
        }
        g();
        d();
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void resumeVideo() {
        super.resumeVideo();
        com.smartdigimkt.l5.a aVar = this.f33936u;
        if (aVar != null) {
            aVar.resumeVideo();
        }
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void setMute(boolean z2) {
        super.setMute(z2);
        com.smartdigimkt.l5.a aVar = this.f33936u;
        if (aVar != null) {
            aVar.setIsMuted(z2);
        }
    }

    @Override // com.smartdigimkt.b5.d, com.smartdigimkt.y4.a
    public void unregisterView() {
        super.unregisterView();
        com.smartdigimkt.k7.c cVar = this.f33938z;
        if (cVar != null) {
            cVar.a();
        }
    }

    public void a(View view, int i2, int i3) {
        a(view, i2, i3, false);
    }

    public void a(View view, int i2, int i3, boolean z2) {
        if (this.s != null) {
            h();
            if (this.f33937w == null) {
                this.f33937w = new com.smartdigimkt.m3.g(com.smartdigimkt.m6.b.p().k(), this.d, this.f33956c, this.s);
            }
            if (this.f33937w.d()) {
                return;
            }
            if (this.f33956c.s0() && ((i3 == 1 || i3 == 6) && this.f33956c.g() == 4 && this.d.t.P1())) {
                com.smartdigimkt.k3.b.a().pause(this.f33956c);
                return;
            }
            this.f33937w.a(new e(i2, i3));
            com.smartdigimkt.v3.l lVarA = a();
            if (i2 == 1) {
                OwnNativeATView ownNativeATView = this.s;
                lVarA.f39137i = ownNativeATView != null ? ownNativeATView.getAdClickRecord(i3) : null;
            } else {
                com.smartdigimkt.a6.c cVar = this.y;
                lVarA.f39137i = cVar != null ? cVar.a(view, i2, i3) : null;
            }
            if (z2) {
                lVarA.m = true;
            }
            this.f33937w.a(lVarA);
            if (this.x != null) {
                HashMap map = new HashMap();
                androidx.datastore.preferences.protobuf.a.v(i2, map, "click_type", i3, com.smartdigimkt.w5.g.a.g);
                this.x.a(map);
            }
            a(113);
        }
    }

    public void a(l lVar) {
        if (lVar == null || !lVar.s0()) {
            return;
        }
        this.C = new h(lVar);
        com.smartdigimkt.k3.b.a().addDataFetchListener(this.C);
    }

    public void a(int i2) {
        com.smartdigimkt.w5.a aVar = this.x;
        if (aVar != null) {
            aVar.a(i2);
        }
        com.smartdigimkt.k5.d dVar = this.f33933E;
        if (dVar != null) {
            dVar.a(i2, this.s);
        }
    }

    private void a(View view, View.OnClickListener onClickListener) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                a(viewGroup.getChildAt(i2), onClickListener);
            }
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public void a(View view) {
        C0443a c0443a = new C0443a();
        if (this.f33938z == null) {
            l lVar = this.f33956c;
            this.f33938z = new com.smartdigimkt.k7.c((lVar == null || lVar.i() == null) ? 1 : this.f33956c.i().M1(), view.getContext(), this.d.t.i0() <= 0 ? 100 : this.d.t.i0());
        }
        this.f33938z.a(view, c0443a);
    }

    public void a(com.smartdigimkt.l5.a aVar, SDMNativeAdMediaViewListener sDMNativeAdMediaViewListener) {
        this.f33936u = aVar;
        aVar.initPlayerView(this.f33956c, this.d, this.v, this.f33933E);
        this.f33936u.setIsMuted(this.g);
        this.f33936u.setAutoPlay(this.f33958h);
        this.f33936u.setVideoListener(sDMNativeAdMediaViewListener);
        this.f33936u.setPlayerOnClickListener(new b());
    }
}
