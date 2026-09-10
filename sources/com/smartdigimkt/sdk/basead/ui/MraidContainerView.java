package com.smartdigimkt.sdk.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.smartdigimkt.g5.i;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.sdk.basead.mraid.MraidWebView;
import com.smartdigimkt.w6.f;
import com.smartdigimkt.w6.g;

/* JADX INFO: loaded from: classes6.dex */
public class MraidContainerView extends FrameLayout {
    public static final int ENDCARD_INIT = 1;
    public static final int LOAD_RETRY_CLICK = 3;
    public static final int PRE_LOAD = 5;
    public static final int VISIABLE_CLICK = 4;
    public static final int WINDOW_ATTACH_CHECK = 2;
    private static final String x0 = "MraidContainerView";
    protected f e0;
    protected g f0;
    protected com.smartdigimkt.v6.a g0;
    protected com.smartdigimkt.k5.d h0;
    protected com.smartdigimkt.l5.c i0;
    protected ClickToReLoadView j0;
    protected MraidWebView k0;
    protected e l0;
    private boolean m0;
    private boolean n0;
    private boolean o0;
    private boolean p0;
    private com.smartdigimkt.k7.f.c q0;
    boolean r0;
    boolean s0;
    boolean t0;
    long u0;
    final long v0;
    boolean w0;

    public class a extends com.smartdigimkt.g5.e {
        public a() {
        }

        @Override // com.smartdigimkt.g5.e
        public void a() {
            e eVar = MraidContainerView.this.l0;
            if (eVar != null) {
                eVar.b();
            }
        }

        @Override // com.smartdigimkt.s4.b
        public void close() {
        }

        @Override // com.smartdigimkt.s4.b
        public void open(String str) {
            MraidContainerView mraidContainerView = MraidContainerView.this;
            if (mraidContainerView.l0 == null || !mraidContainerView.a(str)) {
                return;
            }
            MraidContainerView.this.l0.open(str);
            MraidContainerView.this.u0 = 0L;
        }
    }

    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ViewTreeObserver X;

        public b(ViewTreeObserver viewTreeObserver) {
            this.X = viewTreeObserver;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                MraidContainerView mraidContainerView = MraidContainerView.this;
                if (!mraidContainerView.w0) {
                    mraidContainerView.w0 = true;
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) mraidContainerView.k0.getLayoutParams();
                    layoutParams.width = h.a(com.smartdigimkt.m6.b.p().k(), MraidContainerView.this.e0.Q());
                    layoutParams.height = h.a(com.smartdigimkt.m6.b.p().k(), MraidContainerView.this.e0.J());
                    int width = (MraidContainerView.this.getWidth() - MraidContainerView.this.getPaddingLeft()) - MraidContainerView.this.getPaddingRight();
                    int height = (MraidContainerView.this.getHeight() - MraidContainerView.this.getPaddingBottom()) - MraidContainerView.this.getPaddingTop();
                    float fQ = MraidContainerView.this.e0.Q() / (MraidContainerView.this.e0.J() * 1.0f);
                    layoutParams.width = Math.min(width, layoutParams.width);
                    int iMin = Math.min(height, layoutParams.height);
                    layoutParams.height = iMin;
                    float f = layoutParams.width;
                    float f2 = iMin;
                    float f3 = f / (1.0f * f2);
                    if (f3 > fQ) {
                        layoutParams.width = (int) (f2 * fQ);
                    } else if (f3 < fQ) {
                        layoutParams.height = (int) (f / fQ);
                    }
                    layoutParams.gravity = 17;
                    MraidContainerView.this.k0.setLayoutParams(layoutParams);
                }
                this.X.removeGlobalOnLayoutListener(this);
            } catch (Throwable unused) {
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ String X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        final /* synthetic */ String f38375Y;
        final /* synthetic */ int Z;

        public class a implements i.b {
            public a() {
            }

            @Override // com.smartdigimkt.g5.i.b
            public void a(com.smartdigimkt.v3.h hVar) {
                MraidContainerView.this.o0 = false;
                String unused = MraidContainerView.x0;
                hVar.c();
                MraidContainerView.this.g();
                MraidContainerView.this.f();
            }

            @Override // com.smartdigimkt.g5.i.b
            public void onPageFinished(WebView webView, String str) {
                String unused = MraidContainerView.x0;
                MraidContainerView.this.o0 = false;
                MraidContainerView.this.c();
                MraidContainerView.this.f();
            }
        }

        public c(String str, String str2, int i2) {
            this.X = str;
            this.f38375Y = str2;
            this.Z = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MraidContainerView.this.k0 = new MraidWebView(com.smartdigimkt.m6.b.p().k());
                MraidContainerView mraidContainerView = MraidContainerView.this;
                if (mraidContainerView.t0) {
                    mraidContainerView.d();
                }
                String str = this.X;
                String str2 = this.f38375Y;
                MraidWebView mraidWebView = MraidContainerView.this.k0;
                a aVar = new a();
                MraidContainerView mraidContainerView2 = MraidContainerView.this;
                i.a(str, str2, mraidWebView, aVar, mraidContainerView2.e0, mraidContainerView2.g0, this.Z, mraidContainerView2.t0);
            } catch (Throwable th) {
                MraidContainerView.this.o0 = false;
                String unused = MraidContainerView.x0;
                th.getMessage();
                MraidContainerView.this.f();
                e eVar = MraidContainerView.this.l0;
                if (eVar != null) {
                    eVar.a(th.getMessage());
                }
            }
        }
    }

    public class d implements ClickToReLoadView.b {
        public d() {
        }

        @Override // com.smartdigimkt.sdk.basead.ui.ClickToReLoadView.b
        public void a() {
            MraidContainerView.this.loadMraidWebView(3);
        }
    }

    public interface e {
        void a();

        void a(String str);

        void b();

        void open(String str);
    }

    public MraidContainerView(Context context) {
        super(context);
        this.v0 = 5000L;
    }

    private void e() {
        ClickToReLoadView clickToReLoadView = this.j0;
        if (clickToReLoadView != null) {
            removeView(clickToReLoadView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        com.smartdigimkt.l5.c cVar = this.i0;
        if (cVar != null) {
            cVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.j0 == null) {
            ClickToReLoadView clickToReLoadView = new ClickToReLoadView(getContext());
            this.j0 = clickToReLoadView;
            clickToReLoadView.setListener(new d());
        }
        addView(this.j0, new FrameLayout.LayoutParams(-1, -1));
    }

    private void h() {
        com.smartdigimkt.l5.c cVar = this.i0;
        if (cVar != null) {
            cVar.c();
        }
    }

    private void i() {
        if (!this.s0 && this.m0 && this.r0) {
            this.s0 = true;
            com.smartdigimkt.k5.d dVar = this.h0;
            if (dVar == null || !dVar.b()) {
                return;
            }
            this.h0.a(201, this.k0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.u0 = System.currentTimeMillis();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void fireAudioVolumeChange(boolean z2) {
        try {
            if (!this.p0 || this.k0 == null) {
                return;
            }
            if (z2) {
                com.smartdigimkt.s4.a.a().a(this.k0, 0.0d);
            } else {
                com.smartdigimkt.s4.a.a().a(this.k0, 1.0d);
            }
        } catch (Exception unused) {
        }
    }

    public void fireMraidIsViewable(boolean z2) {
        MraidWebView mraidWebView;
        try {
            if (!this.p0 || (mraidWebView = this.k0) == null) {
                return;
            }
            if (z2) {
                com.smartdigimkt.g5.c.a(mraidWebView, true);
            } else {
                com.smartdigimkt.g5.c.a(mraidWebView, false);
            }
        } catch (Throwable unused) {
        }
    }

    public void init() {
        if (com.smartdigimkt.r3.d.b(this.g0, this.e0)) {
            c();
            return;
        }
        com.smartdigimkt.l5.c cVar = new com.smartdigimkt.l5.c(this);
        this.i0 = cVar;
        cVar.a(30);
    }

    public void loadMraidWebView(int i2) {
        e();
        if (this.o0 || this.p0) {
            return;
        }
        if (!this.t0 || this.m0) {
            this.o0 = true;
            h();
            String strA = i.a(this.g0, this.e0);
            if (TextUtils.isEmpty(strA)) {
                this.o0 = false;
                f();
            } else {
                com.smartdigimkt.l7.b.a().e(new c(com.smartdigimkt.r3.d.a(this.g0, this.e0), strA, i2));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m0 = true;
        i();
        a(2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.m0 = false;
    }

    public void release() {
        MraidWebView mraidWebView;
        try {
            if (this.p0 && (mraidWebView = this.k0) != null) {
                com.smartdigimkt.j7.c.a(mraidWebView);
                this.k0.release();
                com.smartdigimkt.d7.d.c().b(this.g0, this.e0);
            }
            com.smartdigimkt.j7.c.a(this);
        } catch (Throwable unused) {
        }
    }

    public void setNeedRegisterVolumeChangeReceiver(boolean z2) {
        this.n0 = z2;
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (this.m0) {
            a(4);
        }
    }

    private void b() {
        if (this.e0.Q() <= 0 || this.e0.J() <= 0) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        viewTreeObserver.addOnGlobalLayoutListener(new b(viewTreeObserver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        MraidWebView mraidWebViewF = com.smartdigimkt.r3.d.f(com.smartdigimkt.r3.d.a(this.g0, this.e0));
        this.k0 = mraidWebViewF;
        if (mraidWebViewF != null) {
            e();
            this.p0 = true;
            if (this.n0) {
                this.k0.setNeedRegisterVolumeChangeReceiver(true);
            }
            this.k0.prepare(getContext(), new a());
            d();
            b();
            this.r0 = true;
            i();
            e eVar = this.l0;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.k0.getParent() == null) {
            this.k0.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            addView(this.k0);
        }
    }

    public MraidContainerView(Context context, f fVar, com.smartdigimkt.v6.a aVar, com.smartdigimkt.k5.d dVar, e eVar) {
        super(context);
        this.v0 = 5000L;
        this.e0 = fVar;
        this.f0 = aVar.t;
        this.g0 = aVar;
        this.h0 = dVar;
        this.l0 = eVar;
        setBackgroundDrawable(new com.smartdigimkt.s5.a());
        this.t0 = false;
        g gVar = this.f0;
        if (gVar != null) {
            this.t0 = gVar.y0() == 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    public synchronized boolean a(String str) {
        boolean z2;
        int i2;
        try {
            z2 = true;
            if (System.currentTimeMillis() - this.u0 > 5000) {
                boolean zR1 = this.e0.i().R1();
                boolean z3 = !zR1;
                if (zR1) {
                    i2 = 1;
                    z2 = z3;
                } else {
                    if (this.q0 == null) {
                        this.q0 = new com.smartdigimkt.k7.f.c(1);
                    }
                    if (com.smartdigimkt.j7.c.a(this, this.q0, 20)) {
                        i2 = 1;
                        z2 = z3;
                    } else {
                        z2 = false;
                        i2 = 2;
                    }
                }
            } else {
                i2 = 1;
            }
            if (!z2) {
                String strI0 = "";
                String strM = "";
                String strL = "";
                f fVar = this.e0;
                if (fVar != null && (fVar instanceof com.smartdigimkt.w6.d)) {
                    strI0 = ((com.smartdigimkt.w6.d) fVar).I0();
                    strM = ((com.smartdigimkt.w6.d) this.e0).m();
                    strL = ((com.smartdigimkt.w6.d) this.e0).L();
                }
                com.smartdigimkt.i7.d.a(this.g0, strL, strM, strI0, str, i2);
            }
        } catch (Throwable th) {
            throw th;
        }
        return z2;
    }

    private void a(int i2) {
        if (com.smartdigimkt.r3.d.b(this.g0, this.e0)) {
            return;
        }
        loadMraidWebView(i2);
    }
}
