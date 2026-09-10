package com.adcolony.sdk;

import android.content.Context;
import android.graphics.Typeface;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
class y0 extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f9474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f9475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9476c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f9477e;
    private int f;
    private int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f9478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9479i;
    private int j;
    private String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f9480l;
    private String m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f9481n;
    private com.adcolony.sdk.c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h0 f9482p;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.a(h0Var);
            }
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.k(h0Var);
            }
        }
    }

    public class c implements j0 {
        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.e(h0Var);
            }
        }
    }

    public class d implements j0 {
        public d() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.f(h0Var);
            }
        }
    }

    public class e implements j0 {
        public e() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.d(h0Var);
            }
        }
    }

    public class f implements j0 {
        public f() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.j(h0Var);
            }
        }
    }

    public class g implements j0 {
        public g() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.g(h0Var);
            }
        }
    }

    public class h implements j0 {
        public h() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.h(h0Var);
            }
        }
    }

    public class i implements j0 {
        public i() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.b(h0Var);
            }
        }
    }

    public class j implements j0 {
        public j() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (y0.this.c(h0Var)) {
                y0.this.i(h0Var);
            }
        }
    }

    public y0(Context context, h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        super(context);
        this.f9474a = i2;
        this.f9482p = h0Var;
        this.o = cVar;
    }

    public int a(boolean z2, int i2) {
        if (i2 == 0) {
            return z2 ? 1 : 16;
        }
        if (i2 == 1) {
            return z2 ? 8388611 : 48;
        }
        if (i2 != 2) {
            return 17;
        }
        return z2 ? 8388613 : 80;
    }

    public void b(h0 h0Var) {
        f1 f1VarB = c0.b();
        c0.a(f1VarB, "text", getText().toString());
        h0Var.a(f1VarB).c();
    }

    public boolean c(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        return c0.d(f1VarA, "id") == this.f9474a && c0.d(f1VarA, "container_id") == this.o.c() && c0.h(f1VarA, "ad_session_id").equals(this.o.a());
    }

    public void d(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "background_color");
        this.k = strH;
        setBackgroundColor(z0.f(strH));
    }

    public void e(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        this.f9475b = c0.d(f1VarA, "x");
        this.f9476c = c0.d(f1VarA, "y");
        this.d = c0.d(f1VarA, "width");
        this.f9477e = c0.d(f1VarA, "height");
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f9475b, this.f9476c, 0, 0);
        layoutParams.width = this.d;
        layoutParams.height = this.f9477e;
        setLayoutParams(layoutParams);
    }

    public void f(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "font_color");
        this.f9480l = strH;
        setTextColor(z0.f(strH));
    }

    public void g(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "font_size");
        this.f9478h = iD;
        setTextSize(iD);
    }

    public void h(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "font_style");
        this.f = iD;
        if (iD == 0) {
            setTypeface(getTypeface(), 0);
            return;
        }
        if (iD == 1) {
            setTypeface(getTypeface(), 1);
        } else if (iD == 2) {
            setTypeface(getTypeface(), 2);
        } else {
            if (iD != 3) {
                return;
            }
            setTypeface(getTypeface(), 3);
        }
    }

    public void i(h0 h0Var) {
        String strH = c0.h(h0Var.a(), "text");
        this.m = strH;
        setText(strH);
    }

    public void j(h0 h0Var) {
        int iD = c0.d(h0Var.a(), "font_family");
        this.g = iD;
        if (iD == 0) {
            setTypeface(Typeface.DEFAULT);
            return;
        }
        if (iD == 1) {
            setTypeface(Typeface.SERIF);
        } else if (iD == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else {
            if (iD != 3) {
                return;
            }
            setTypeface(Typeface.MONOSPACE);
        }
    }

    public void k(h0 h0Var) {
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k kVarB = com.adcolony.sdk.a.b();
        com.adcolony.sdk.d dVarC = kVarB.c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "view_id", this.f9474a);
        c0.a(f1VarB, "ad_session_id", this.f9481n);
        c0.b(f1VarB, "container_x", this.f9475b + x);
        c0.b(f1VarB, "container_y", this.f9476c + y);
        c0.b(f1VarB, "view_x", x);
        c0.b(f1VarB, "view_y", y);
        c0.b(f1VarB, "id", this.o.getId());
        if (action == 0) {
            new h0("AdContainer.on_touch_began", this.o.k(), f1VarB).c();
        } else if (action == 1) {
            if (!this.o.p()) {
                kVarB.a(dVarC.d().get(this.f9481n));
            }
            if (x <= 0 || x >= getWidth() || y <= 0 || y >= getHeight()) {
                new h0("AdContainer.on_touch_cancelled", this.o.k(), f1VarB).c();
            } else {
                new h0("AdContainer.on_touch_ended", this.o.k(), f1VarB).c();
            }
        } else if (action == 2) {
            new h0("AdContainer.on_touch_moved", this.o.k(), f1VarB).c();
        } else if (action == 3) {
            new h0("AdContainer.on_touch_cancelled", this.o.k(), f1VarB).c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(f1VarB, "container_x", ((int) motionEvent.getX(action2)) + this.f9475b);
            c0.b(f1VarB, "container_y", ((int) motionEvent.getY(action2)) + this.f9476c);
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action2));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action2));
            new h0("AdContainer.on_touch_began", this.o.k(), f1VarB).c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            int x2 = (int) motionEvent.getX(action3);
            int y2 = (int) motionEvent.getY(action3);
            c0.b(f1VarB, "container_x", ((int) motionEvent.getX(action3)) + this.f9475b);
            c0.b(f1VarB, "container_y", ((int) motionEvent.getY(action3)) + this.f9476c);
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action3));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action3));
            if (!this.o.p()) {
                kVarB.a(dVarC.d().get(this.f9481n));
            }
            if (x2 <= 0 || x2 >= getWidth() || y2 <= 0 || y2 >= getHeight()) {
                new h0("AdContainer.on_touch_cancelled", this.o.k(), f1VarB).c();
            } else {
                new h0("AdContainer.on_touch_ended", this.o.k(), f1VarB).c();
            }
        }
        return true;
    }

    public void a(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        this.f9479i = c0.d(f1VarA, "x");
        this.j = c0.d(f1VarA, "y");
        setGravity(a(true, this.f9479i) | a(false, this.j));
    }

    public y0(Context context, int i2, h0 h0Var, int i3, com.adcolony.sdk.c cVar) {
        super(context, null, i2);
        this.f9474a = i3;
        this.f9482p = h0Var;
        this.o = cVar;
    }

    public void a() {
        FrameLayout.LayoutParams layoutParams;
        int iS;
        int iS2;
        f1 f1VarA = this.f9482p.a();
        this.f9481n = c0.h(f1VarA, "ad_session_id");
        this.f9475b = c0.d(f1VarA, "x");
        this.f9476c = c0.d(f1VarA, "y");
        this.d = c0.d(f1VarA, "width");
        this.f9477e = c0.d(f1VarA, "height");
        this.g = c0.d(f1VarA, "font_family");
        this.f = c0.d(f1VarA, "font_style");
        this.f9478h = c0.d(f1VarA, "font_size");
        this.k = c0.h(f1VarA, "background_color");
        this.f9480l = c0.h(f1VarA, "font_color");
        this.m = c0.h(f1VarA, "text");
        this.f9479i = c0.d(f1VarA, "align_x");
        this.j = c0.d(f1VarA, "align_y");
        k kVarB = com.adcolony.sdk.a.b();
        if (this.m.equals("")) {
            this.m = "Learn More";
        }
        setVisibility(4);
        if (c0.b(f1VarA, "wrap_content")) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.d, this.f9477e);
        }
        layoutParams.gravity = 0;
        setText(this.m);
        setTextSize(this.f9478h);
        if (c0.b(f1VarA, "overlay")) {
            this.f9475b = 0;
            this.f9476c = 0;
            iS = (int) (kVarB.n().s() * 6.0f);
            iS2 = (int) (kVarB.n().s() * 6.0f);
            int iS3 = (int) (kVarB.n().s() * 4.0f);
            setPadding(iS3, iS3, iS3, iS3);
            layoutParams.gravity = 8388693;
        } else {
            iS = 0;
            iS2 = 0;
        }
        layoutParams.setMargins(this.f9475b, this.f9476c, iS, iS2);
        this.o.addView(this, layoutParams);
        int i2 = this.g;
        if (i2 == 0) {
            setTypeface(Typeface.DEFAULT);
        } else if (i2 == 1) {
            setTypeface(Typeface.SERIF);
        } else if (i2 == 2) {
            setTypeface(Typeface.SANS_SERIF);
        } else if (i2 == 3) {
            setTypeface(Typeface.MONOSPACE);
        }
        int i3 = this.f;
        if (i3 == 0) {
            setTypeface(getTypeface(), 0);
        } else if (i3 == 1) {
            setTypeface(getTypeface(), 1);
        } else if (i3 == 2) {
            setTypeface(getTypeface(), 2);
        } else if (i3 == 3) {
            setTypeface(getTypeface(), 3);
        }
        setGravity(a(true, this.f9479i) | a(false, this.j));
        if (!this.k.equals("")) {
            setBackgroundColor(z0.f(this.k));
        }
        if (!this.f9480l.equals("")) {
            setTextColor(z0.f(this.f9480l));
        }
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_visible", (j0) new b(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_bounds", (j0) new c(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_font_color", (j0) new d(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_background_color", (j0) new e(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_typeface", (j0) new f(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_font_size", (j0) new g(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_font_style", (j0) new h(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.get_text", (j0) new i(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.set_text", (j0) new j(), true));
        this.o.i().add(com.adcolony.sdk.a.a("TextView.align", (j0) new a(), true));
        this.o.j().add("TextView.set_visible");
        this.o.j().add("TextView.set_bounds");
        this.o.j().add("TextView.set_font_color");
        this.o.j().add("TextView.set_background_color");
        this.o.j().add("TextView.set_typeface");
        this.o.j().add("TextView.set_font_size");
        this.o.j().add("TextView.set_font_style");
        this.o.j().add("TextView.get_text");
        this.o.j().add("TextView.set_text");
        this.o.j().add("TextView.align");
    }
}
