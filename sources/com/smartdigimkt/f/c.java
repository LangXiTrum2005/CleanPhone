package com.smartdigimkt.f;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.smartdigimkt.expressad.advanced.js.NativeAdvancedJsUtils;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedView;
import com.smartdigimkt.expressad.advanced.view.ATNativeAdvancedWebview;
import com.smartdigimkt.expressad.advanced.view.ATOutNativeAdvancedViewGroup;
import com.smartdigimkt.f1.p;
import com.smartdigimkt.n.h;
import com.smartdigimkt.v0.a0;
import com.smartdigimkt.v0.n;
import com.smartdigimkt.x.e;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class c implements com.smartdigimkt.c5.b {
    private static String H0 = "NativeAdvancedProvider";
    public static final int I0 = 1;
    public static final int J0 = 2;
    public static final int K0 = 3;
    private boolean A0;
    private boolean B0;
    boolean F0;
    e G0;
    private String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private String f34950Y;
    private com.smartdigimkt.e.b Z;
    private com.smartdigimkt.e.c e0;
    private com.smartdigimkt.f.b f0;
    private p g0;
    private d h0;
    private ATNativeAdvancedView i0;
    private ATNativeAdvancedWebview j0;
    private com.smartdigimkt.g.a k0;
    private com.smartdigimkt.n1.c l0;
    private boolean m0;
    private JSONObject w0;
    private ATOutNativeAdvancedViewGroup y0;
    private boolean z0;
    private int n0 = -1;
    private boolean o0 = false;
    private int p0 = 0;
    private boolean q0 = false;
    private int r0 = 0;
    private boolean s0 = false;
    private int t0 = 0;
    private int u0 = 0;
    private Object v0 = new Object();
    private boolean x0 = false;
    private boolean C0 = true;
    public boolean D0 = false;
    private ViewTreeObserver.OnScrollChangedListener E0 = new a();

    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.smartdigimkt.f.c$a$a, reason: collision with other inner class name */
        public class RunnableC0477a implements Runnable {
            public RunnableC0477a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.C0 = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.C0) {
                c.this.C0 = false;
                if (c.this.y0 != null) {
                    c.this.y0.postDelayed(new RunnableC0477a(), 1000L);
                }
                try {
                    c.this.j();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public class b implements com.smartdigimkt.e.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.smartdigimkt.x.d f34952a;

        public b(com.smartdigimkt.x.d dVar) {
            this.f34952a = dVar;
        }

        @Override // com.smartdigimkt.e.d.c
        public void a(String str) {
            c.this.F0 = false;
        }

        @Override // com.smartdigimkt.e.d.c
        public void b() {
            String unused = c.H0;
            c.this.a(this.f34952a, false);
        }
    }

    public c(String str, String str2, Context context) {
        this.f34950Y = TextUtils.isEmpty(str) ? "" : str;
        this.X = str2;
        a(context);
    }

    private void e(int i2) {
        ATNativeAdvancedWebview aTNativeAdvancedWebview = this.j0;
        if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
            return;
        }
        try {
            if (this.j0 != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(NativeAdvancedJsUtils.f34668n, i2);
                h.a().a((WebView) this.j0, NativeAdvancedJsUtils.m, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.z0 && this.A0 && this.B0) {
            com.smartdigimkt.e.b bVar = this.Z;
            com.smartdigimkt.x.d dVarE = bVar != null ? bVar.e() : null;
            if (dVarE != null) {
                dVarE.N0();
            }
            if (a0.a(this.i0.getAdvancedNativeWebview(), 0) || this.y0.getAlpha() < 0.5f || this.y0.getVisibility() != 0) {
                return;
            }
            com.smartdigimkt.e.c cVar = this.e0;
            if (cVar != null) {
                cVar.f();
            }
            b(dVarE);
        }
    }

    private void k() {
        a(this.n0);
        c(this.p0);
        g(this.r0);
        a(this.w0);
        e(n.h(com.smartdigimkt.m6.b.p().k()));
    }

    public ATOutNativeAdvancedViewGroup d() {
        return this.y0;
    }

    public String f() {
        if (this.D0) {
            com.smartdigimkt.e.c cVar = this.e0;
            return cVar != null ? cVar.c() : "";
        }
        com.smartdigimkt.e.b bVar = this.Z;
        return bVar != null ? bVar.f() : "";
    }

    public int g() {
        return this.n0;
    }

    public boolean h() {
        return this.m0;
    }

    public void i(int i2) {
        if (i2 == 1) {
            this.z0 = true;
        } else if (i2 == 2) {
            this.A0 = true;
        } else if (i2 == 3) {
            this.B0 = true;
        }
        try {
            j();
        } catch (Throwable unused) {
        }
    }

    @Override // com.smartdigimkt.c5.b
    public boolean isReady() {
        return true;
    }

    private void c(int i2) {
        if (this.q0) {
            this.p0 = i2;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.j0;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.j0, NativeAdvancedJsUtils.f34666i, "mute", Integer.valueOf(i2));
        }
    }

    private void g(int i2) {
        if (this.s0) {
            this.r0 = i2;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.j0;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.j0, NativeAdvancedJsUtils.k, NativeAdvancedJsUtils.f34667l, Integer.valueOf(i2));
        }
    }

    public void b(JSONObject jSONObject) {
        this.x0 = true;
        a(jSONObject);
    }

    public void d(int i2) {
        this.q0 = true;
        c(i2);
    }

    public void h(int i2) {
        this.s0 = true;
        g(i2);
    }

    public void a(boolean z2) {
        this.m0 = z2;
    }

    public void b(int i2) {
        this.o0 = true;
        a(i2);
    }

    private void a(JSONObject jSONObject) {
        if (this.x0) {
            this.w0 = jSONObject;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.j0;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            NativeAdvancedJsUtils.sendThirdToH5(this.j0, NativeAdvancedJsUtils.f34664e, "", jSONObject);
        }
    }

    private void i() {
        com.smartdigimkt.e.c cVar = this.e0;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void b(int i2, int i3) {
        a(i2, i3);
    }

    public int c() {
        com.smartdigimkt.e.b bVar = this.Z;
        com.smartdigimkt.x.d dVarE = bVar != null ? bVar.e() : null;
        if (dVarE != null) {
            return TextUtils.isEmpty(dVarE.u2()) ? 2 : 1;
        }
        return 0;
    }

    public void b(com.smartdigimkt.x.d dVar) {
        if (dVar != null) {
            if (this.l0 == null) {
                this.l0 = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a(), this.X);
            }
            this.h0 = new d(this, this.g0, this.l0.h(), dVar);
            if (this.F0) {
                return;
            }
            this.F0 = true;
            com.smartdigimkt.e.d.a(this.i0, dVar, this.f34950Y, this.X, this.n0, true, (com.smartdigimkt.e.d.c) new b(dVar));
        }
    }

    public com.smartdigimkt.n1.c e() {
        return this.l0;
    }

    public void f(int i2) {
        if (i2 == 1) {
            this.z0 = false;
        } else if (i2 == 2) {
            this.A0 = false;
        } else if (i2 == 3) {
            this.B0 = false;
        }
        i();
    }

    public void a(p pVar) {
        this.g0 = pVar;
    }

    private void a(int i2) {
        if (this.o0) {
            this.n0 = i2;
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.j0;
            if (aTNativeAdvancedWebview == null || aTNativeAdvancedWebview.isDestroyed()) {
                return;
            }
            int i3 = this.n0;
            if (i3 == 1) {
                this.e0.a(true);
                NativeAdvancedJsUtils.sendThirdToH5(this.j0, NativeAdvancedJsUtils.g, "", null);
            } else if (i3 == 0) {
                this.e0.a(false);
                NativeAdvancedJsUtils.sendThirdToH5(this.j0, NativeAdvancedJsUtils.f34665h, "", null);
            }
        }
    }

    public void b() {
        if (this.g0 != null) {
            this.g0 = null;
        }
        if (this.f0 != null) {
            this.f0 = null;
        }
        if (this.h0 != null) {
            this.h0 = null;
        }
        com.smartdigimkt.e.b bVar = this.Z;
        if (bVar != null) {
            bVar.a((ATNativeAdvancedView) null);
            this.Z.g();
        }
        com.smartdigimkt.e.c cVar = this.e0;
        if (cVar != null) {
            cVar.g();
        }
        ATNativeAdvancedView aTNativeAdvancedView = this.i0;
        if (aTNativeAdvancedView != null) {
            aTNativeAdvancedView.destroy();
        }
        com.smartdigimkt.c.a.b(this.G0.y());
        com.smartdigimkt.g.a aVar = this.k0;
        if (aVar != null) {
            aVar.b();
        }
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.y0;
        if (aTOutNativeAdvancedViewGroup != null) {
            aTOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.E0);
            this.y0.removeAllViews();
            this.y0 = null;
        }
    }

    public void a(com.smartdigimkt.x.d dVar, boolean z2) {
        c cVar;
        com.smartdigimkt.x.d dVar2;
        k();
        ATOutNativeAdvancedViewGroup aTOutNativeAdvancedViewGroup = this.y0;
        if (aTOutNativeAdvancedViewGroup == null || aTOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (dVar == null || !z2) {
            cVar = this;
            dVar2 = dVar;
        } else {
            if (this.l0 == null) {
                this.l0 = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a(), this.X);
            }
            cVar = this;
            dVar2 = dVar;
            cVar.h0 = new d(cVar, this.g0, this.l0.h(), dVar2);
        }
        if (cVar.e0 == null) {
            com.smartdigimkt.e.c cVar2 = new com.smartdigimkt.e.c(com.smartdigimkt.m6.b.p().k(), cVar.f34950Y, cVar.X);
            cVar.e0 = cVar2;
            cVar2.a(this);
        }
        a(dVar2);
    }

    private void a(com.smartdigimkt.x.d dVar) {
        this.e0.a(this.h0);
        this.e0.a(dVar, this.i0, true);
    }

    public void a(e eVar) {
        this.G0 = eVar;
        this.C0 = true;
        this.m0 = true;
        this.i0.clearResStateAndRemoveClose();
        com.smartdigimkt.n1.c cVarA = com.smartdigimkt.n1.b.b().a(com.smartdigimkt.u.a.f().a(), this.X);
        this.l0 = cVarA;
        if (cVarA == null) {
            this.l0 = com.smartdigimkt.n1.c.c(this.X);
        }
        com.smartdigimkt.f.b bVar = new com.smartdigimkt.f.b(this);
        this.f0 = bVar;
        bVar.a(this.g0);
        if (this.Z == null) {
            this.Z = new com.smartdigimkt.e.b(this.f34950Y, this.X, 0L);
        }
        com.smartdigimkt.f.b bVar2 = this.f0;
        if (bVar2 != null) {
            this.Z.a(bVar2);
        }
        this.i0.resetLoadState();
        this.Z.a(this.i0);
        this.Z.a(this.l0);
        this.Z.a(this.t0, this.u0);
        this.Z.a(this.n0);
        this.Z.a(eVar);
    }

    private void a(Context context) {
        com.smartdigimkt.g.a aVar;
        ViewGroup.LayoutParams layoutParams;
        if (this.e0 == null) {
            com.smartdigimkt.e.c cVar = new com.smartdigimkt.e.c(com.smartdigimkt.m6.b.p().k(), this.f34950Y, this.X);
            this.e0 = cVar;
            cVar.a(this);
        }
        if (this.j0 == null) {
            try {
                this.j0 = new ATNativeAdvancedWebview(com.smartdigimkt.m6.b.p().k());
            } catch (Throwable unused) {
            }
            if (this.k0 == null) {
                try {
                    this.k0 = new com.smartdigimkt.g.a(this.X, this.e0.b(), this);
                } catch (Throwable unused2) {
                }
            }
            ATNativeAdvancedWebview aTNativeAdvancedWebview = this.j0;
            if (aTNativeAdvancedWebview != null && (aVar = this.k0) != null) {
                aTNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.i0 == null) {
            ATNativeAdvancedView aTNativeAdvancedView = new ATNativeAdvancedView(context);
            this.i0 = aTNativeAdvancedView;
            aTNativeAdvancedView.setAdvancedNativeWebview(this.j0);
            ATNativeAdvancedWebview aTNativeAdvancedWebview2 = this.j0;
            if (aTNativeAdvancedWebview2 != null && aTNativeAdvancedWebview2.getParent() == null) {
                this.i0.addView(this.j0, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.y0 == null) {
            this.y0 = new ATOutNativeAdvancedViewGroup(com.smartdigimkt.m6.b.p().k());
            if (this.t0 != 0 && this.u0 != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.t0, this.u0);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.y0.setLayoutParams(layoutParams);
            this.y0.setProvider(this);
            this.y0.addView(this.i0);
            this.y0.getViewTreeObserver().addOnScrollChangedListener(this.E0);
        }
    }

    public String a(String str) {
        com.smartdigimkt.e.b bVar = this.Z;
        if (bVar != null) {
            return bVar.a(str);
        }
        return "";
    }

    private void a(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            return;
        }
        this.u0 = i2;
        this.t0 = i3;
        this.y0.setLayoutParams(new ViewGroup.LayoutParams(i3, i2));
    }
}
