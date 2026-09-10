package com.adcolony.sdk;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.iab.omid.library.adcolony.adsession.AdSession;
import com.iab.omid.library.adcolony.adsession.FriendlyObstructionPurpose;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class c extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<Integer, a1> f9036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<Integer, y0> f9037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<Integer, b1> f9038c;
    private HashMap<Integer, u> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap<Integer, a0> f9039e;
    private HashMap<Integer, Boolean> f;
    private HashMap<Integer, View> g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9041i;
    private int j;
    private int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9042l;
    boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f9043n;
    private float o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private double f9044p;
    private int q;
    private int r;
    private ArrayList<j0> s;
    private ArrayList<String> t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f9045u;
    private boolean v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f9046w;
    private AdSession x;
    Context y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    VideoView f9047z;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.c(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.g(h0Var);
            }
        }
    }

    /* JADX INFO: renamed from: com.adcolony.sdk.c$c, reason: collision with other inner class name */
    public class C0014c implements j0 {

        /* JADX INFO: renamed from: com.adcolony.sdk.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9051a;

            public a(h0 h0Var) {
                this.f9051a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.d(this.f9051a), FriendlyObstructionPurpose.OTHER);
            }
        }

        public C0014c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                z0.b(new a(h0Var));
            }
        }
    }

    public class d implements j0 {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ h0 f9054a;

            public a(h0 h0Var) {
                this.f9054a = h0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.h(this.f9054a);
            }
        }

        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                z0.b(new a(h0Var));
            }
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.b(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    public class f implements j0 {
        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.f(h0Var);
            }
        }
    }

    public class g implements j0 {
        public g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c cVar = c.this;
                cVar.a(cVar.a(h0Var), FriendlyObstructionPurpose.OTHER);
            }
        }
    }

    public class h implements j0 {
        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (c.this.i(h0Var)) {
                c.this.e(h0Var);
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9060a;

        public i(boolean z2) {
            this.f9060a = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            if (cVar.m) {
                return;
            }
            cVar.a(this.f9060a);
            c.this.b(this.f9060a);
        }
    }

    public c(Context context, String str) {
        super(context);
        this.o = 0.0f;
        this.f9044p = 0.0d;
        this.q = 0;
        this.r = 0;
        this.y = context;
        this.f9042l = str;
        setBackgroundColor(-16777216);
    }

    public a1 c(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "id");
        a1 a1Var = new a1(this.y, h0Var, iD, this);
        a1Var.d();
        this.f9036a.put(Integer.valueOf(iD), a1Var);
        this.g.put(Integer.valueOf(iD), a1Var);
        return a1Var;
    }

    public b1 d(h0 h0Var) {
        c1 c1VarA;
        f1 f1VarA = h0Var.a();
        int iD = c0.d(f1VarA, "id");
        boolean zB = c0.b(f1VarA, "is_module");
        k kVarB = com.adcolony.sdk.a.b();
        if (zB) {
            c1VarA = kVarB.B().get(Integer.valueOf(c0.d(f1VarA, "module_id")));
            if (c1VarA == null) {
                new e0.a().a("Module WebView created with invalid id").a(e0.f9131h);
                return null;
            }
            c1VarA.b(h0Var, iD, this);
        } else {
            try {
                c1VarA = b1.a(this.y, h0Var, iD, this);
            } catch (RuntimeException e2) {
                new e0.a().a(e2.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f9131h);
                AdColony.disable();
                return null;
            }
        }
        this.f9038c.put(Integer.valueOf(iD), c1VarA);
        this.g.put(Integer.valueOf(iD), c1VarA);
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "module_id", c1VarA.getWebViewModuleId());
        if (c1VarA instanceof l0) {
            c0.b(f1VarB, "mraid_module_id", ((l0) c1VarA).getAdcModuleId());
        }
        h0Var.a(f1VarB).c();
        return c1VarA;
    }

    public boolean e(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "id");
        View viewRemove = this.g.remove(Integer.valueOf(iD));
        a0 a0VarRemove = this.f9039e.remove(Integer.valueOf(iD));
        if (viewRemove == null || a0VarRemove == null) {
            com.adcolony.sdk.a.b().c().a(h0Var.b(), android.support.v4.media.a.h(iD, ""));
            return false;
        }
        removeView(a0VarRemove);
        return true;
    }

    public boolean f(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "id");
        View viewRemove = this.g.remove(Integer.valueOf(iD));
        y0 y0VarRemove = this.f.remove(Integer.valueOf(iD)).booleanValue() ? this.d.remove(Integer.valueOf(iD)) : this.f9037b.remove(Integer.valueOf(iD));
        if (viewRemove == null || y0VarRemove == null) {
            com.adcolony.sdk.a.b().c().a(h0Var.b(), android.support.v4.media.a.h(iD, ""));
            return false;
        }
        removeView(y0VarRemove);
        return true;
    }

    public boolean g(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "id");
        View viewRemove = this.g.remove(Integer.valueOf(iD));
        a1 a1VarRemove = this.f9036a.remove(Integer.valueOf(iD));
        if (viewRemove == null || a1VarRemove == null) {
            com.adcolony.sdk.a.b().c().a(h0Var.b(), android.support.v4.media.a.h(iD, ""));
            return false;
        }
        if (a1VarRemove.c()) {
            a1VarRemove.j();
        }
        a1VarRemove.a();
        removeView(a1VarRemove);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean h(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "id");
        k kVarB = com.adcolony.sdk.a.b();
        View viewRemove = this.g.remove(Integer.valueOf(iD));
        b1 b1VarRemove = this.f9038c.remove(Integer.valueOf(iD));
        if (b1VarRemove == 0 || viewRemove == null) {
            kVarB.c().a(h0Var.b(), android.support.v4.media.a.h(iD, ""));
            return false;
        }
        if (b1VarRemove instanceof k0) {
            kVarB.r().b((k0) b1VarRemove);
        }
        removeView(b1VarRemove);
        return true;
    }

    public boolean i(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        return c0.d(f1VarA, "container_id") == this.j && c0.h(f1VarA, "ad_session_id").equals(this.f9042l);
    }

    public void j(h0 h0Var) {
        this.f9036a = new HashMap<>();
        this.f9037b = new HashMap<>();
        this.f9038c = new HashMap<>();
        this.d = new HashMap<>();
        this.f9039e = new HashMap<>();
        this.f = new HashMap<>();
        this.g = new HashMap<>();
        this.s = new ArrayList<>();
        this.t = new ArrayList<>();
        f1 f1VarA = h0Var.a();
        if (c0.b(f1VarA, d9.h.T)) {
            setBackgroundColor(0);
        }
        this.j = c0.d(f1VarA, "id");
        this.f9040h = c0.d(f1VarA, "width");
        this.f9041i = c0.d(f1VarA, "height");
        this.k = c0.d(f1VarA, "module_id");
        this.f9043n = c0.b(f1VarA, "viewability_enabled");
        this.f9045u = this.j == 1;
        k kVarB = com.adcolony.sdk.a.b();
        if (this.f9040h == 0 && this.f9041i == 0) {
            Rect rectX = this.f9046w ? kVarB.n().x() : kVarB.n().w();
            this.f9040h = rectX.width();
            this.f9041i = rectX.height();
        } else {
            setLayoutParams(new FrameLayout.LayoutParams(this.f9040h, this.f9041i));
        }
        this.s.add(com.adcolony.sdk.a.a("VideoView.create", (j0) new a(), true));
        this.s.add(com.adcolony.sdk.a.a("VideoView.destroy", (j0) new b(), true));
        this.s.add(com.adcolony.sdk.a.a("WebView.create", (j0) new C0014c(), true));
        this.s.add(com.adcolony.sdk.a.a("WebView.destroy", (j0) new d(), true));
        this.s.add(com.adcolony.sdk.a.a("TextView.create", (j0) new e(), true));
        this.s.add(com.adcolony.sdk.a.a("TextView.destroy", (j0) new f(), true));
        this.s.add(com.adcolony.sdk.a.a("ImageView.create", (j0) new g(), true));
        this.s.add(com.adcolony.sdk.a.a("ImageView.destroy", (j0) new h(), true));
        this.t.add("VideoView.create");
        this.t.add("VideoView.destroy");
        this.t.add("WebView.create");
        this.t.add("WebView.destroy");
        this.t.add("TextView.create");
        this.t.add("TextView.destroy");
        this.t.add("ImageView.create");
        this.t.add("ImageView.destroy");
        VideoView videoView = new VideoView(this.y);
        this.f9047z = videoView;
        videoView.setVisibility(8);
        addView(this.f9047z);
        setClipToPadding(false);
        if (this.f9043n) {
            b(c0.b(h0Var.a(), "advanced_viewability"));
        }
    }

    public int k() {
        return this.k;
    }

    public HashMap<Integer, y0> l() {
        return this.f9037b;
    }

    public HashMap<Integer, a1> m() {
        return this.f9036a;
    }

    public HashMap<Integer, b1> n() {
        return this.f9038c;
    }

    public boolean o() {
        return this.v;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        k kVarB = com.adcolony.sdk.a.b();
        com.adcolony.sdk.d dVarC = kVarB.c();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "view_id", -1);
        c0.a(f1VarB, "ad_session_id", this.f9042l);
        c0.b(f1VarB, "container_x", x);
        c0.b(f1VarB, "container_y", y);
        c0.b(f1VarB, "view_x", x);
        c0.b(f1VarB, "view_y", y);
        c0.b(f1VarB, "id", this.j);
        if (action == 0) {
            new h0("AdContainer.on_touch_began", this.k, f1VarB).c();
        } else if (action == 1) {
            if (!this.f9045u) {
                kVarB.a(dVarC.d().get(this.f9042l));
            }
            new h0("AdContainer.on_touch_ended", this.k, f1VarB).c();
        } else if (action == 2) {
            new h0("AdContainer.on_touch_moved", this.k, f1VarB).c();
        } else if (action == 3) {
            new h0("AdContainer.on_touch_cancelled", this.k, f1VarB).c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(f1VarB, "container_x", (int) motionEvent.getX(action2));
            c0.b(f1VarB, "container_y", (int) motionEvent.getY(action2));
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action2));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action2));
            new h0("AdContainer.on_touch_began", this.k, f1VarB).c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(f1VarB, "container_x", (int) motionEvent.getX(action3));
            c0.b(f1VarB, "container_y", (int) motionEvent.getY(action3));
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action3));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action3));
            c0.b(f1VarB, "x", (int) motionEvent.getX(action3));
            c0.b(f1VarB, "y", (int) motionEvent.getY(action3));
            if (!this.f9045u) {
                kVarB.a(dVarC.d().get(this.f9042l));
            }
            new h0("AdContainer.on_touch_ended", this.k, f1VarB).c();
        }
        return true;
    }

    public boolean p() {
        return this.f9045u;
    }

    public boolean q() {
        return this.f9046w;
    }

    public a0 a(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "id");
        a0 a0Var = new a0(this.y, h0Var, iD, this);
        a0Var.a();
        this.f9039e.put(Integer.valueOf(iD), a0Var);
        this.g.put(Integer.valueOf(iD), a0Var);
        return a0Var;
    }

    public View b(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        int iD = c0.d(f1VarA, "id");
        if (c0.b(f1VarA, "editable")) {
            u uVar = new u(this.y, h0Var, iD, this);
            uVar.a();
            this.d.put(Integer.valueOf(iD), uVar);
            this.g.put(Integer.valueOf(iD), uVar);
            this.f.put(Integer.valueOf(iD), Boolean.TRUE);
            return uVar;
        }
        if (c0.b(f1VarA, "button")) {
            y0 y0Var = new y0(this.y, R.style.Widget.DeviceDefault.Button, h0Var, iD, this);
            y0Var.a();
            this.f9037b.put(Integer.valueOf(iD), y0Var);
            this.g.put(Integer.valueOf(iD), y0Var);
            this.f.put(Integer.valueOf(iD), Boolean.FALSE);
            return y0Var;
        }
        y0 y0Var2 = new y0(this.y, h0Var, iD, this);
        y0Var2.a();
        this.f9037b.put(Integer.valueOf(iD), y0Var2);
        this.g.put(Integer.valueOf(iD), y0Var2);
        this.f.put(Integer.valueOf(iD), Boolean.FALSE);
        return y0Var2;
    }

    public ArrayList<j0> i() {
        return this.s;
    }

    public int c() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z2) {
        View view = (View) getParent();
        AdColonyAdView adColonyAdView = com.adcolony.sdk.a.b().c().d().get(this.f9042l);
        b1 webView = adColonyAdView == null ? null : adColonyAdView.getWebView();
        Context contextA = com.adcolony.sdk.a.a();
        float fA = g1.a(view, contextA, true, z2, true, adColonyAdView != null);
        double dA = contextA == null ? 0.0d : z0.a(z0.a(contextA));
        int iA = z0.a(webView);
        int iB = z0.b(webView);
        boolean z3 = (iA == this.q && iB == this.r) ? false : true;
        if (z3) {
            this.q = iA;
            this.r = iB;
            a(iA, iB, webView);
        }
        if (this.o != fA || this.f9044p != dA || z3) {
            a(fA, dA);
        }
        this.o = fA;
        this.f9044p = dA;
    }

    public void c(boolean z2) {
        this.f9045u = z2;
    }

    public HashMap<Integer, View> e() {
        return this.g;
    }

    public void e(boolean z2) {
        this.v = z2;
    }

    public HashMap<Integer, u> f() {
        return this.d;
    }

    public HashMap<Integer, Boolean> g() {
        return this.f;
    }

    public HashMap<Integer, a0> h() {
        return this.f9039e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z2) {
        z0.a(new i(z2), 200L);
    }

    public int b() {
        return this.f9041i;
    }

    private void a(int i2, int i3, b1 b1Var) {
        float fS = com.adcolony.sdk.a.b().n().s();
        if (b1Var != null) {
            f1 f1VarB = c0.b();
            c0.b(f1VarB, "app_orientation", z0.d(z0.f()));
            c0.b(f1VarB, "width", (int) (b1Var.getCurrentWidth() / fS));
            c0.b(f1VarB, "height", (int) (b1Var.getCurrentHeight() / fS));
            c0.b(f1VarB, "x", i2);
            c0.b(f1VarB, "y", i3);
            c0.a(f1VarB, "ad_session_id", this.f9042l);
            new h0("MRAID.on_size_change", this.k, f1VarB).c();
        }
    }

    public void b(int i2) {
        this.f9040h = i2;
    }

    public int d() {
        return this.f9040h;
    }

    public void d(boolean z2) {
        this.f9046w = z2;
    }

    private void a(float f2, double d2) {
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "id", this.j);
        c0.a(f1VarB, "ad_session_id", this.f9042l);
        c0.a(f1VarB, "exposure", f2);
        c0.a(f1VarB, "volume", d2);
        new h0("AdContainer.on_exposure_change", this.k, f1VarB).c();
    }

    public String a() {
        return this.f9042l;
    }

    public void a(int i2) {
        this.f9041i = i2;
    }

    public void a(AdSession adSession) {
        this.x = adSession;
        a(this.g);
    }

    public void a(Map map) {
        if (this.x == null || map == null) {
            return;
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            a((View) ((Map.Entry) it.next()).getValue(), FriendlyObstructionPurpose.OTHER);
        }
    }

    public void a(View view, FriendlyObstructionPurpose friendlyObstructionPurpose) {
        AdSession adSession = this.x;
        if (adSession == null || view == null) {
            return;
        }
        try {
            adSession.addFriendlyObstruction(view, friendlyObstructionPurpose, null);
        } catch (RuntimeException unused) {
        }
    }

    public void a(View view) {
        AdSession adSession = this.x;
        if (adSession == null || view == null) {
            return;
        }
        try {
            adSession.removeFriendlyObstruction(view);
        } catch (RuntimeException unused) {
        }
    }

    public ArrayList<String> j() {
        return this.t;
    }
}
