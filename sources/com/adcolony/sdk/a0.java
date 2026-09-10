package com.adcolony.sdk;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class a0 extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8954a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f8955b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8956c;
    private int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8957e;
    private boolean f;
    private boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f8958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f8959i;
    private String j;
    private h0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.adcolony.sdk.c f8960l;

    public class a implements j0 {
        public a() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.d(h0Var);
            }
        }
    }

    public class b implements j0 {
        public b() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.b(h0Var);
            }
        }
    }

    public class c implements j0 {
        public c() {
        }

        @Override // com.adcolony.sdk.j0
        public void a(h0 h0Var) {
            if (a0.this.a(h0Var)) {
                a0.this.c(h0Var);
            }
        }
    }

    public a0(Context context, h0 h0Var, int i2, com.adcolony.sdk.c cVar) {
        super(context);
        this.f8954a = i2;
        this.k = h0Var;
        this.f8960l = cVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k kVarB = com.adcolony.sdk.a.b();
        d dVarC = kVarB.c();
        int action = motionEvent.getAction() & 255;
        if (action != 0 && action != 1 && action != 3 && action != 2 && action != 5 && action != 6) {
            return false;
        }
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        f1 f1VarB = c0.b();
        c0.b(f1VarB, "view_id", this.f8954a);
        c0.a(f1VarB, "ad_session_id", this.j);
        c0.b(f1VarB, "container_x", this.f8955b + x);
        c0.b(f1VarB, "container_y", this.f8956c + y);
        c0.b(f1VarB, "view_x", x);
        c0.b(f1VarB, "view_y", y);
        c0.b(f1VarB, "id", this.f8960l.getId());
        if (action == 0) {
            new h0("AdContainer.on_touch_began", this.f8960l.k(), f1VarB).c();
        } else if (action == 1) {
            if (!this.f8960l.p()) {
                kVarB.a(dVarC.d().get(this.j));
            }
            if (x <= 0 || x >= this.d || y <= 0 || y >= this.f8957e) {
                new h0("AdContainer.on_touch_cancelled", this.f8960l.k(), f1VarB).c();
            } else {
                new h0("AdContainer.on_touch_ended", this.f8960l.k(), f1VarB).c();
            }
        } else if (action == 2) {
            new h0("AdContainer.on_touch_moved", this.f8960l.k(), f1VarB).c();
        } else if (action == 3) {
            new h0("AdContainer.on_touch_cancelled", this.f8960l.k(), f1VarB).c();
        } else if (action == 5) {
            int action2 = (motionEvent.getAction() & 65280) >> 8;
            c0.b(f1VarB, "container_x", ((int) motionEvent.getX(action2)) + this.f8955b);
            c0.b(f1VarB, "container_y", ((int) motionEvent.getY(action2)) + this.f8956c);
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action2));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action2));
            new h0("AdContainer.on_touch_began", this.f8960l.k(), f1VarB).c();
        } else if (action == 6) {
            int action3 = (motionEvent.getAction() & 65280) >> 8;
            int x2 = (int) motionEvent.getX(action3);
            int y2 = (int) motionEvent.getY(action3);
            c0.b(f1VarB, "container_x", ((int) motionEvent.getX(action3)) + this.f8955b);
            c0.b(f1VarB, "container_y", ((int) motionEvent.getY(action3)) + this.f8956c);
            c0.b(f1VarB, "view_x", (int) motionEvent.getX(action3));
            c0.b(f1VarB, "view_y", (int) motionEvent.getY(action3));
            if (!this.f8960l.p()) {
                kVarB.a(dVarC.d().get(this.j));
            }
            if (x2 <= 0 || x2 >= this.d || y2 <= 0 || y2 >= this.f8957e) {
                new h0("AdContainer.on_touch_cancelled", this.f8960l.k(), f1VarB).c();
            } else {
                new h0("AdContainer.on_touch_ended", this.f8960l.k(), f1VarB).c();
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        return c0.d(f1VarA, "id") == this.f8954a && c0.d(f1VarA, "container_id") == this.f8960l.c() && c0.h(f1VarA, "ad_session_id").equals(this.f8960l.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(h0 h0Var) {
        f1 f1VarA = h0Var.a();
        this.f8955b = c0.d(f1VarA, "x");
        this.f8956c = c0.d(f1VarA, "y");
        this.d = c0.d(f1VarA, "width");
        this.f8957e = c0.d(f1VarA, "height");
        if (this.f) {
            float fS = (this.f8957e * com.adcolony.sdk.a.b().n().s()) / getDrawable().getIntrinsicHeight();
            this.f8957e = (int) (getDrawable().getIntrinsicHeight() * fS);
            int intrinsicWidth = (int) (getDrawable().getIntrinsicWidth() * fS);
            this.d = intrinsicWidth;
            this.f8955b -= intrinsicWidth;
            this.f8956c -= this.f8957e;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
        layoutParams.setMargins(this.f8955b, this.f8956c, 0, 0);
        layoutParams.width = this.d;
        layoutParams.height = this.f8957e;
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(h0 h0Var) {
        this.f8959i = c0.h(h0Var.a(), "filepath");
        setImageURI(Uri.fromFile(new File(this.f8959i)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(h0 h0Var) {
        if (c0.b(h0Var.a(), "visible")) {
            setVisibility(0);
        } else {
            setVisibility(4);
        }
    }

    public void a() {
        FrameLayout.LayoutParams layoutParams;
        int i2;
        f1 f1VarA = this.k.a();
        this.j = c0.h(f1VarA, "ad_session_id");
        this.f8955b = c0.d(f1VarA, "x");
        this.f8956c = c0.d(f1VarA, "y");
        this.d = c0.d(f1VarA, "width");
        this.f8957e = c0.d(f1VarA, "height");
        this.f8959i = c0.h(f1VarA, "filepath");
        this.f = c0.b(f1VarA, "dpi");
        this.g = c0.b(f1VarA, "invert_y");
        this.f8958h = c0.b(f1VarA, "wrap_content");
        setImageURI(Uri.fromFile(new File(this.f8959i)));
        if (this.f) {
            float fS = (this.f8957e * com.adcolony.sdk.a.b().n().s()) / getDrawable().getIntrinsicHeight();
            this.f8957e = (int) (getDrawable().getIntrinsicHeight() * fS);
            int intrinsicWidth = (int) (getDrawable().getIntrinsicWidth() * fS);
            this.d = intrinsicWidth;
            this.f8955b -= intrinsicWidth;
            if (this.g) {
                i2 = this.f8956c + this.f8957e;
            } else {
                i2 = this.f8956c - this.f8957e;
            }
            this.f8956c = i2;
        }
        setVisibility(4);
        if (this.f8958h) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(this.d, this.f8957e);
        }
        layoutParams.setMargins(this.f8955b, this.f8956c, 0, 0);
        layoutParams.gravity = 0;
        this.f8960l.addView(this, layoutParams);
        this.f8960l.i().add(com.adcolony.sdk.a.a("ImageView.set_visible", (j0) new a(), true));
        this.f8960l.i().add(com.adcolony.sdk.a.a("ImageView.set_bounds", (j0) new b(), true));
        this.f8960l.i().add(com.adcolony.sdk.a.a("ImageView.set_image", (j0) new c(), true));
        this.f8960l.j().add("ImageView.set_visible");
        this.f8960l.j().add("ImageView.set_bounds");
        this.f8960l.j().add("ImageView.set_image");
    }
}
