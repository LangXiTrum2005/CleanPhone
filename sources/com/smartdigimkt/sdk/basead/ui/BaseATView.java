package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.m3.i;
import com.smartdigimkt.sdk.api.IExHandlerBaseAd;
import com.smartdigimkt.sdk.api.IOfferClickHandler;
import com.smartdigimkt.sdk.basead.ui.component.CTAButtonLayout;
import com.smartdigimkt.v3.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseATView extends RelativeLayout implements com.smartdigimkt.u5.a {
    protected com.smartdigimkt.k5.d A0;
    boolean B0;
    String e0;
    protected com.smartdigimkt.v6.a f0;
    protected com.smartdigimkt.w6.f g0;
    com.smartdigimkt.k7.c h0;
    com.smartdigimkt.m3.g i0;
    volatile boolean j0;
    volatile boolean k0;
    protected boolean l0;
    String m0;
    protected List<View> n0;
    View o0;
    protected boolean p0;
    protected View q0;
    protected com.smartdigimkt.q5.a r0;
    protected com.smartdigimkt.w5.a s0;
    com.smartdigimkt.u5.b t0;
    private IExHandlerBaseAd.DataFetchListener u0;
    protected com.smartdigimkt.a6.c v0;
    protected long w0;
    protected long x0;
    protected boolean y0;
    protected boolean z0;

    public class a extends com.smartdigimkt.w5.a {
        public a(ViewGroup viewGroup, com.smartdigimkt.w6.f fVar, com.smartdigimkt.v6.a aVar, int i2, com.smartdigimkt.w5.c.a aVar2) {
            super(viewGroup, fVar, aVar, i2, aVar2);
        }

        @Override // com.smartdigimkt.w5.a
        public ViewGroup.LayoutParams d() {
            return BaseATView.this.getSpecialNoteViewLayoutParams();
        }
    }

    public class b implements com.smartdigimkt.m3.g.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f38276a;

        public b(j jVar) {
            this.f38276a = jVar;
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickCallback() {
            if (BaseATView.this.k0) {
                return;
            }
            if (BaseATView.this.f()) {
                com.smartdigimkt.w6.f fVar = BaseATView.this.g0;
                if (fVar == null || fVar.i() == null || BaseATView.this.g0.i().A() != 2) {
                    BaseATView baseATView = BaseATView.this;
                    com.smartdigimkt.i7.d.c(baseATView.g0, baseATView.f0, 1);
                    return;
                } else {
                    BaseATView baseATView2 = BaseATView.this;
                    com.smartdigimkt.i7.d.c(baseATView2.g0, baseATView2.f0, 2);
                }
            }
            BaseATView.this.a(this.f38276a);
            BaseATView.this.n();
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickEndUI() {
            BaseATView.this.k();
        }

        @Override // com.smartdigimkt.m3.g.d
        public void clickStartUI() {
            BaseATView.this.l();
        }

        @Override // com.smartdigimkt.m3.g.d
        public void deeplinkCallback(boolean z2) {
            com.smartdigimkt.w6.f fVar;
            if (BaseATView.this.k0) {
                return;
            }
            if (!BaseATView.this.f() || (fVar = BaseATView.this.g0) == null || fVar.i() == null || BaseATView.this.g0.i().A() == 2) {
                BaseATView.this.a(z2);
            }
        }

        @Override // com.smartdigimkt.m3.g.d
        public boolean openInternalWebView(String str, IOfferClickHandler iOfferClickHandler) {
            return BaseATView.this.a(str, iOfferClickHandler);
        }
    }

    public class c extends com.smartdigimkt.k7.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f38278a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f38279b;

        public c(Runnable runnable, int i2) {
            this.f38278a = runnable;
            this.f38279b = i2;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public int getImpressionMinTimeViewed() {
            int i2 = this.f38279b;
            if (i2 > 0) {
                return i2;
            }
            return 50;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            Runnable runnable = this.f38278a;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public class d extends com.smartdigimkt.k3.b.a {
        public d(com.smartdigimkt.w6.f fVar) {
            super(fVar);
        }

        @Override // com.smartdigimkt.sdk.api.IExHandlerBaseAd.DataFetchListener
        public void onStatusChanged(String str) {
            View view = BaseATView.this.q0;
            if (view != null && (view instanceof CTAButtonLayout)) {
                ((CTAButtonLayout) view).setMajorCTAText(str);
            }
            if (BaseATView.this.s0 != null) {
                BaseATView.this.s0.a(androidx.media3.extractor.text.ttml.a.s(com.smartdigimkt.w5.g.a.f39430h, str));
            }
            BaseATView.this.a(121);
        }
    }

    public class e implements Runnable {
        final /* synthetic */ com.smartdigimkt.w6.f X;

        public e(com.smartdigimkt.w6.f fVar) {
            this.X = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!(BaseATView.this.q0 instanceof ScanningAnimButton) || this.X.i() == null) {
                return;
            }
            ((ScanningAnimButton) BaseATView.this.q0).startAnimation(this.X.i().L());
        }
    }

    public class f implements com.smartdigimkt.w5.c.a {
        public f() {
        }

        @Override // com.smartdigimkt.w5.c.a
        public void a(int i2, int i3) {
            BaseATView.this.a(i2, i3);
        }
    }

    public static class g {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public static final int f38284A = 202;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public static final int f38285B = 203;
        public static final int C = 204;
        public static final int D = 205;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public static final int f38286E = 206;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public static final int f38287F = 207;
        public static final int G = 208;
        public static final int H = 209;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public static final int f38288I = 210;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public static final int f38289J = 211;
        public static final int K = 212;
        public static final int L = 301;
        public static final int M = 302;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public static final int f38290N = 303;
        public static final int O = 304;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public static final int f38291P = 305;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f38292a = 101;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38293b = 102;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38294c = 103;
        public static final int d = 104;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38295e = 105;
        public static final int f = 106;
        public static final int g = 107;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f38296h = 108;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f38297i = 110;
        public static final int j = 111;
        public static final int k = 112;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final int f38298l = 113;
        public static final int m = 114;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final int f38299n = 115;
        public static final int o = 116;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f38300p = 117;
        public static final int q = 118;
        public static final int r = 119;
        public static final int s = 120;
        public static final int t = 121;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final int f38301u = 122;
        public static final int v = 123;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f38302w = 124;
        public static final int x = 125;
        public static final int y = 125;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final int f38303z = 201;
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f38304a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f38305b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f38306c = 2;
        public static final int d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f38307e = 4;
        public static final int f = 5;
        public static final int g = 6;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f38308h = 100;
    }

    public BaseATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar, String str) {
        super(context);
        this.e0 = "BaseATView";
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.p0 = false;
        this.B0 = false;
        this.f0 = aVar;
        this.g0 = fVar;
        this.m0 = str;
        this.n0 = new ArrayList();
        this.v0 = new com.smartdigimkt.a6.c(this.g0);
        this.A0 = new com.smartdigimkt.k5.d(this.g0, this.f0);
        a();
        d();
        c();
        com.smartdigimkt.w6.f fVar2 = this.g0;
        if (fVar2 != null && !fVar2.w0()) {
            setFocusable(true);
            setClickable(true);
        }
        b(fVar);
        a(fVar);
    }

    public void a() {
    }

    public abstract void a(j jVar);

    public abstract void a(boolean z2);

    public l b() {
        l lVar = new l(this.f0, "");
        lVar.g = getWidth();
        lVar.f39136h = getHeight();
        try {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            lVar.f39139n = iArr[0];
            lVar.o = iArr[1];
        } catch (Throwable unused) {
        }
        lVar.f39140p = 100;
        com.smartdigimkt.v6.a aVar = this.f0;
        if (aVar != null && aVar.f39164b == 2) {
            lVar.f39140p = com.smartdigimkt.k7.f.c.a(this);
        }
        lVar.q = this.w0;
        return lVar;
    }

    public void c() {
        this.s0 = new a(this, this.g0, this.f0, getATViewType(), getImproveClickCallback());
    }

    public abstract void d();

    public void destroy() {
        a(112);
        com.smartdigimkt.m3.g gVar = this.i0;
        if (gVar != null) {
            gVar.a();
        }
        com.smartdigimkt.k7.c cVar = this.h0;
        if (cVar != null) {
            cVar.b();
        }
        if (this.u0 != null) {
            com.smartdigimkt.k3.b.a().removeDataFetchListener(this.u0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        com.smartdigimkt.a6.c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            com.smartdigimkt.a6.c cVar2 = this.v0;
            if (cVar2 != null) {
                cVar2.a((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
            }
        } else if ((action == 1 || action == 3) && (cVar = this.v0) != null) {
            cVar.b((int) motionEvent.getRawX(), (int) motionEvent.getRawY(), (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean e() {
        return i.c(this.g0);
    }

    public boolean f() {
        com.smartdigimkt.w6.f fVar = this.g0;
        if (fVar instanceof com.smartdigimkt.w6.l) {
            return ((com.smartdigimkt.w6.l) fVar).U0();
        }
        return false;
    }

    public boolean g() {
        return false;
    }

    public int getATViewType() {
        return 0;
    }

    public com.smartdigimkt.v3.a getAdClickRecord() {
        com.smartdigimkt.a6.c cVar = this.v0;
        if (cVar != null) {
            return cVar.a(13);
        }
        return null;
    }

    public boolean getHasPerformClick() {
        return this.l0;
    }

    public com.smartdigimkt.w5.c.a getImproveClickCallback() {
        return new f();
    }

    public View getOmsdkMeasureView() {
        return this;
    }

    public RelativeLayout.LayoutParams getSpecialNoteViewLayoutParams() {
        return null;
    }

    public boolean h() {
        return true;
    }

    public void i() {
    }

    public boolean isShowingEndCardAfterVideoPlay() {
        return this.p0;
    }

    public abstract void j();

    public void k() {
    }

    public void l() {
    }

    public synchronized void m() {
        if (this.j0) {
            return;
        }
        this.j0 = true;
        if (f()) {
            com.smartdigimkt.i7.d.c(this.g0, this.f0, 3);
            i();
            this.k0 = true;
        } else {
            o();
            a(114);
            com.smartdigimkt.m3.f.a(8, this.g0, b());
            j();
        }
    }

    public void n() {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        com.smartdigimkt.w6.f fVar = this.g0;
        if ((fVar instanceof com.smartdigimkt.w6.l) && this.f0.j == 67) {
            if (((com.smartdigimkt.w6.l) fVar).a(true, false)) {
                com.smartdigimkt.q6.c.a(getContext()).a(this.g0.L(), 1, 0);
            }
            if (((com.smartdigimkt.w6.l) this.g0).a(false, false)) {
                com.smartdigimkt.q6.b.a(getContext()).a(this.g0.m(), 1, 0);
            }
        }
    }

    public void o() {
        com.smartdigimkt.w6.f fVar = this.g0;
        if (fVar instanceof com.smartdigimkt.z6.a) {
            com.smartdigimkt.i5.b.a(getContext()).d((com.smartdigimkt.z6.a) this.g0);
        } else if (fVar instanceof com.smartdigimkt.w6.l) {
            com.smartdigimkt.e5.c cVarA = com.smartdigimkt.e5.c.a();
            Context context = getContext();
            com.smartdigimkt.v6.a aVar = this.f0;
            cVarA.a(context, com.smartdigimkt.e5.c.a(aVar.f39163a, aVar.f39166e), this.g0, this.f0.t);
        }
        com.smartdigimkt.w6.f fVar2 = this.g0;
        if ((fVar2 instanceof com.smartdigimkt.w6.l) && this.f0.j == 67) {
            if (((com.smartdigimkt.w6.l) fVar2).a(true, true)) {
                com.smartdigimkt.q6.c.a(getContext()).a(this.g0.L(), 0, 1);
            }
            if (((com.smartdigimkt.w6.l) this.g0).a(false, true)) {
                com.smartdigimkt.q6.b.a(getContext()).a(this.g0.m(), 0, 1);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.w0 == 0) {
            this.w0 = System.currentTimeMillis();
            if (!this.A0.b()) {
                a(201);
            }
        }
        a(116);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a(117);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        a(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean p() {
        return i.a(this.f0);
    }

    @Override // com.smartdigimkt.u5.a
    public void setCallback(com.smartdigimkt.u5.b bVar) {
        synchronized (this) {
            this.t0 = bVar;
        }
    }

    public void setHasPerformClick(boolean z2) {
        this.l0 = z2;
    }

    public void setShowingEndCardAfterVideoPlay(boolean z2) {
        this.p0 = z2;
    }

    public void setTrackClickAreaView(View view) {
        this.o0 = view;
    }

    public boolean a(String str, IOfferClickHandler iOfferClickHandler) {
        return false;
    }

    public void a(int i2, int i3) {
        this.l0 = true;
        m();
        if (this.i0 == null) {
            this.i0 = new com.smartdigimkt.m3.g(getContext(), this.f0, this.g0, this);
        }
        if (this.i0.d()) {
            return;
        }
        if (this.g0.s0() && i2 == 1 && ((i3 == 1 || i3 == 6) && this.g0.g() == 4 && this.f0.t.P1())) {
            com.smartdigimkt.k3.b.a().pause(this.g0);
            return;
        }
        if (i2 != 5 && i2 != 6 && i2 != 7) {
            int iB = com.smartdigimkt.a6.c.b(i2, i3);
            if (iB == 0 || iB == 1) {
                this.z0 = true;
            } else if (iB == 2) {
                this.y0 = true;
            }
        }
        if (this.p0) {
            if (i3 == 1) {
                i3 = 6;
            } else if (i3 == 2 || i3 == 3) {
                i3 = 7;
            } else if (i3 == 4) {
                i3 = 8;
            } else if (i3 == 5) {
                i3 = 9;
            }
        }
        this.i0.a(new b(new j().a(i2, i3)));
        l lVarB = b();
        com.smartdigimkt.a6.c cVar = this.v0;
        if (cVar != null) {
            if (i2 != 1) {
                View view = this.o0;
                if (view != null) {
                    lVarB.f39137i = cVar.a(view, i2, i3);
                } else {
                    lVarB.f39137i = cVar.a(this, i2, i3);
                }
            } else {
                lVarB.f39137i = cVar.a(0, i3);
            }
        }
        this.i0.a(lVarB);
        if (this.s0 != null) {
            HashMap map = new HashMap();
            androidx.datastore.preferences.protobuf.a.v(i2, map, "click_type", i3, com.smartdigimkt.w5.g.a.g);
            this.s0.a(map);
        }
        a(113);
    }

    private void b(com.smartdigimkt.w6.f fVar) {
        if (fVar == null || !fVar.s0()) {
            return;
        }
        this.u0 = new d(fVar);
        com.smartdigimkt.k3.b.a().addDataFetchListener(this.u0);
    }

    public BaseATView(Context context, com.smartdigimkt.v6.a aVar, com.smartdigimkt.w6.f fVar) {
        this(context, aVar, fVar, "");
    }

    public BaseATView(Context context) {
        super(context);
        this.e0 = "BaseATView";
        this.j0 = false;
        this.k0 = false;
        this.l0 = false;
        this.p0 = false;
        this.B0 = false;
    }

    public void a(int i2, Runnable runnable) {
        com.smartdigimkt.w6.f fVar = this.g0;
        int iM1 = (fVar == null || fVar.i() == null) ? 1 : this.g0.i().M1();
        if (i2 > 0) {
            this.h0 = new com.smartdigimkt.k7.c(iM1, getContext(), i2);
        } else {
            this.h0 = new com.smartdigimkt.k7.c(iM1, getContext());
        }
        this.h0.a(this, new c(runnable, i2));
    }

    public float a(com.smartdigimkt.l5.b bVar, boolean z2) {
        return com.smartdigimkt.a6.b.a(bVar, z2, this.f0);
    }

    public void a(int i2) {
        if (i2 == 114) {
            this.x0 = System.currentTimeMillis();
        }
        com.smartdigimkt.k5.d dVar = this.A0;
        if (dVar != null) {
            dVar.a(i2, getOmsdkMeasureView());
        }
        com.smartdigimkt.w5.a aVar = this.s0;
        if (aVar != null) {
            aVar.a(i2);
        }
    }

    private boolean a(MotionEvent motionEvent) {
        synchronized (this) {
            try {
                try {
                    com.smartdigimkt.u5.b bVar = this.t0;
                    if (bVar != null && bVar.a(motionEvent)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(com.smartdigimkt.w6.f fVar) {
        post(new e(fVar));
    }

    public void a(View view) {
        if (this.A0 == null || view == null || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            this.A0.a(viewGroup.getChildAt(i2));
        }
    }
}
