package com.smartdigimkt.u1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.smartdigimkt.expressad.splash.view.ATSplashPopView;
import com.smartdigimkt.expressad.splash.view.ATSplashView;
import com.smartdigimkt.f1.u;
import com.smartdigimkt.t1.e;
import com.smartdigimkt.t1.f;
import com.smartdigimkt.v0.n;

/* JADX INFO: loaded from: classes6.dex */
public class c implements com.smartdigimkt.c5.b {
    private static String G0 = "SplashProvider";
    private Context A0;
    private boolean B0;
    private com.smartdigimkt.x.d C0;
    private ATSplashPopView D0;
    private String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f38783Y;
    private int e0;
    private long f0;
    private int g0;
    private int h0;
    private e i0;
    private f j0;
    private com.smartdigimkt.u1.b k0;
    private com.smartdigimkt.f1.e l0;
    private d m0;
    private ATSplashView n0;
    private ViewGroup o0;
    private View p0;
    private com.smartdigimkt.n1.c q0;
    private boolean r0;
    private ViewGroup s0;
    private boolean t0;
    private int v0;
    private int w0;
    private int Z = 5;
    private int u0 = 1;
    private Object x0 = new Object();
    private Object y0 = new Object();
    public boolean z0 = false;
    private boolean E0 = false;
    private boolean F0 = false;

    public class a implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.d X;

        public a(com.smartdigimkt.x.d dVar) {
            this.X = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.b(this.X, 0, false);
        }
    }

    public class b implements Runnable {
        final /* synthetic */ com.smartdigimkt.x.d X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ int f38785Y;
        final /* synthetic */ boolean Z;

        public b(com.smartdigimkt.x.d dVar, int i2, boolean z2) {
            this.X = dVar;
            this.f38785Y = i2;
            this.Z = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.X, this.f38785Y - 1, this.Z);
        }
    }

    public c(Context context, String str, String str2) {
        this.v0 = n.g(com.smartdigimkt.m6.b.p().k());
        this.w0 = n.f(com.smartdigimkt.m6.b.p().k());
        this.v0 = context.getResources().getDisplayMetrics().widthPixels;
        this.w0 = context.getResources().getDisplayMetrics().heightPixels;
        this.f38783Y = TextUtils.isEmpty(str) ? "" : str;
        this.X = str2;
        this.A0 = context;
        a(context);
    }

    public void b(int i2) {
        this.u0 = i2;
    }

    public void c(boolean z2) {
        this.r0 = z2;
    }

    public void d(boolean z2) {
        this.t0 = z2;
    }

    public long e() {
        return this.f0;
    }

    public boolean f() {
        return this.t0;
    }

    public boolean g() {
        return this.r0;
    }

    public void h() {
        f fVar = this.j0;
        if (fVar != null) {
            fVar.f();
        }
        ATSplashPopView aTSplashPopView = this.D0;
        if (aTSplashPopView == null || !this.E0) {
            return;
        }
        aTSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.j0;
        if (fVar != null) {
            fVar.g();
        }
        ATSplashPopView aTSplashPopView = this.D0;
        if (aTSplashPopView == null || !this.E0) {
            return;
        }
        aTSplashPopView.reStartCountDown();
    }

    @Override // com.smartdigimkt.c5.b
    public boolean isReady() {
        e eVar = this.i0;
        return (eVar == null || eVar.e() == null || !com.smartdigimkt.t1.d.a(this.n0, this.i0.e())) ? false : true;
    }

    public void j() {
        this.E0 = true;
        ATSplashPopView aTSplashPopView = this.D0;
        if (aTSplashPopView != null) {
            aTSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.E0 = false;
        com.smartdigimkt.f1.e eVar = this.l0;
        if (eVar != null) {
            eVar.onZoomOutPlayFinish();
        }
        ATSplashPopView aTSplashPopView = this.D0;
        if (aTSplashPopView != null) {
            aTSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.s0 = viewGroup;
    }

    public void b(boolean z2) {
        this.F0 = z2;
    }

    public String c() {
        if (this.z0) {
            f fVar = this.j0;
            return fVar != null ? fVar.c() : "";
        }
        e eVar = this.i0;
        return eVar != null ? eVar.f() : "";
    }

    public void d(int i2) {
        this.Z = i2;
    }

    public void e(boolean z2) {
        this.B0 = z2;
    }

    public void a(long j) {
        this.f0 = j;
    }

    public void b(int i2, int i3) {
        a(i3, i2);
    }

    public int d() {
        return this.Z;
    }

    public void a(com.smartdigimkt.f1.d dVar) {
        if (this.k0 == null) {
            this.k0 = new com.smartdigimkt.u1.b(this);
        }
        this.k0.a(dVar);
    }

    public String b() {
        if (!this.z0) {
            e eVar = this.i0;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.j0;
        if (fVar != null) {
            return fVar.b();
        }
        return "";
    }

    public void a(com.smartdigimkt.f1.e eVar) {
        this.l0 = eVar;
    }

    public void a(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            com.smartdigimkt.f1.e eVar = this.l0;
            if (eVar != null) {
                eVar.onShowFailed("token is null or empty");
                return;
            }
            return;
        }
        b(viewGroup);
    }

    public void c(int i2) {
        this.e0 = i2;
    }

    public void b(ViewGroup viewGroup) {
        this.o0 = viewGroup;
        ATSplashView aTSplashView = this.n0;
        if (aTSplashView != null) {
            aTSplashView.setDevContainer(viewGroup);
        }
        e eVar = this.i0;
        com.smartdigimkt.x.d dVarE = eVar != null ? eVar.e() : null;
        if (dVarE != null) {
            if (this.q0 == null) {
                this.q0 = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a(), this.X);
            }
            d dVar = new d(this, this.l0, this.q0.h(), dVarE);
            this.m0 = dVar;
            int i2 = this.Z;
            if (i2 < 2 || i2 > 10) {
                this.Z = 5;
            }
            dVar.b();
            viewGroup.post(new a(dVarE));
            return;
        }
        com.smartdigimkt.f1.e eVar2 = this.l0;
        if (eVar2 != null) {
            eVar2.onShowFailed("campaignEx is vali");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.smartdigimkt.x.d dVar, int i2, boolean z2) {
        if (!com.smartdigimkt.t1.d.a(this.n0, dVar)) {
            if (i2 > 0) {
                this.j0.f38619z.postDelayed(new b(dVar, i2, z2), 1L);
                return;
            }
            d dVar2 = this.m0;
            if (dVar2 != null) {
                dVar2.onShowFailed("campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        this.j0.c(this.Z);
        this.j0.d(this.e0);
        this.j0.a(this.s0);
        this.j0.a(this.m0);
        ViewGroup viewGroup = this.o0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            com.smartdigimkt.j7.c.a(this.n0);
            this.o0.addView(this.n0, new ViewGroup.LayoutParams(-1, -1));
        }
        this.j0.a(this.t0);
        this.j0.a(dVar, this.n0);
    }

    public void b(com.smartdigimkt.x.d dVar, int i2, boolean z2) {
        c cVar;
        com.smartdigimkt.x.d dVar2;
        if (dVar == null || !z2) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.q0 == null) {
                this.q0 = com.smartdigimkt.n1.b.b().d(com.smartdigimkt.u.a.f().a(), this.X);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.m0 = new d(cVar, this.l0, this.q0.h(), dVar2);
        }
        cVar.C0 = dVar2;
        ViewGroup viewGroup = cVar.o0;
        if (viewGroup == null) {
            d dVar3 = cVar.m0;
            if (dVar3 != null) {
                dVar3.onShowFailed("container is null");
                return;
            }
            return;
        }
        if (cVar.j0 == null) {
            cVar.j0 = new f(viewGroup.getContext(), cVar.f38783Y, cVar.X);
        }
        a(dVar2, i2, z2);
    }

    public void a(com.smartdigimkt.x.e eVar) {
        synchronized (this.x0) {
            try {
                if (this.r0) {
                    if (this.k0 != null) {
                        this.k0.a(new com.smartdigimkt.y.c(com.smartdigimkt.y.b.f40001p, "current unit is loading"), 2);
                        this.r0 = true;
                    }
                    return;
                }
                this.r0 = true;
                this.n0.clearResState();
                this.q0 = com.smartdigimkt.n1.c.p();
                if (this.i0 == null) {
                    this.i0 = new e(this.f38783Y, this.X, this.f0 * 1000);
                }
                com.smartdigimkt.u1.b bVar = this.k0;
                if (bVar != null) {
                    bVar.a("");
                    this.i0.a(this.k0);
                }
                this.n0.resetLoadState();
                this.i0.a(this.Z);
                this.i0.a(this.n0);
                this.i0.a(this.q0);
                this.i0.a(this.v0, this.w0);
                this.i0.a(this.t0);
                this.i0.b(this.F0);
                this.i0.b(this.u0);
                this.i0.a(eVar, 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void a(Context context) {
        if (this.j0 == null) {
            if (context != null) {
                this.j0 = new f(context, this.f38783Y, this.X);
            } else {
                this.j0 = new f(com.smartdigimkt.m6.b.p().k(), this.f38783Y, this.X);
            }
        }
        if (this.n0 == null) {
            if (context != null) {
                this.n0 = new ATSplashView(context);
            } else {
                this.n0 = new ATSplashView(com.smartdigimkt.m6.b.p().k());
            }
            this.n0.setSplashWebview();
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.p0 = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            ATSplashView aTSplashView = this.n0;
            if (aTSplashView != null) {
                aTSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(u uVar) {
        ATSplashPopView aTSplashPopView = new ATSplashPopView(com.smartdigimkt.m6.b.p().k(), new ATSplashPopView.h(this.f38783Y, this.X, uVar.c(), this.C0), this.m0);
        this.D0 = aTSplashPopView;
        return aTSplashPopView;
    }

    private void a(int i2, int i3) {
        int iG = n.g(com.smartdigimkt.m6.b.p().k());
        int iF = n.f(com.smartdigimkt.m6.b.p().k());
        int i4 = this.u0;
        if (i4 == 1) {
            if (iF >= i3 * 4) {
                this.w0 = iF - i3;
                this.v0 = iG;
                return;
            } else {
                this.w0 = 0;
                this.v0 = 0;
                return;
            }
        }
        if (i4 == 2) {
            if (iG >= i2 * 4) {
                this.v0 = iG - i2;
                this.w0 = iF;
            } else {
                this.w0 = 0;
                this.v0 = 0;
            }
        }
    }

    public void a(boolean z2) {
        ATSplashView aTSplashView = this.n0;
        if (aTSplashView != null) {
            aTSplashView.setAllowClickSplash(z2);
        }
    }

    public void a() {
        this.C0 = null;
        if (this.l0 != null) {
            this.l0 = null;
        }
        if (this.k0 != null) {
            this.k0 = null;
        }
        if (this.m0 != null) {
            this.m0 = null;
        }
        e eVar = this.i0;
        if (eVar != null) {
            eVar.h();
        }
        f fVar = this.j0;
        if (fVar != null) {
            fVar.h();
        }
        if (this.A0 != null) {
            this.A0 = null;
        }
    }

    public void a(int i2, int i3, int i4, int i5) {
        try {
            ATSplashView aTSplashView = this.n0;
            if (aTSplashView != null) {
                aTSplashView.setNotchPadding(i2, i3, i4, i5);
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void a(int i2) {
        f fVar = this.j0;
        if (fVar != null) {
            fVar.b(i2);
        }
    }
}
