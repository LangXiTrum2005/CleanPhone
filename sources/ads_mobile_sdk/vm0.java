package ads_mobile_sdk;

import saneness.lamplit;

/* JADX INFO: loaded from: classes.dex */
public abstract class vm0 extends lamplit {
    public final xm0 a;
    public xm0 b;

    public vm0(xm0 xm0Var) {
        this.a = xm0Var;
        if (xm0Var.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.b = c();
    }

    public final xm0 a() {
        xm0 xm0Var;
        if (this.b.j()) {
            this.b.k();
            xm0Var = this.b;
        } else {
            xm0Var = this.b;
        }
        xm0Var.getClass();
        if (xm0.a(xm0Var, true)) {
            return xm0Var;
        }
        throw new x43();
    }

    public final void b() {
        if (this.b.j()) {
            return;
        }
        xm0 xm0Var = (xm0) this.a.a(4, (xm0) null);
        a(xm0Var, this.b);
        this.b = xm0Var;
    }

    public final xm0 c() {
        return this.a.m();
    }

    public final Object clone() {
        xm0 xm0Var;
        vm0 vm0Var = (vm0) this.a.a(5, (xm0) null);
        if (this.b.j()) {
            this.b.k();
            xm0Var = this.b;
        } else {
            xm0Var = this.b;
        }
        vm0Var.b = xm0Var;
        return vm0Var;
    }

    public static void a(xm0 xm0Var, Object obj) {
        y72 y72Var = y72.c;
        y72Var.getClass();
        y72Var.a(xm0Var.getClass()).a(xm0Var, obj);
    }
}
