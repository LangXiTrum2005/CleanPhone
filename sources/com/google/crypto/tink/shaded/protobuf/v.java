package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v implements p0, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f24644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public x f24645b;

    public v(x xVar) {
        this.f24644a = xVar;
        if (xVar.o()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f24645b = xVar.r();
    }

    public static void g(Object obj, Object obj2) {
        w0 w0Var = w0.f24646c;
        w0Var.getClass();
        w0Var.a(obj.getClass()).a(obj, obj2);
    }

    public final x a() {
        x xVarB = b();
        xVarB.getClass();
        if (x.n(xVarB, true)) {
            return xVarB;
        }
        throw new b1();
    }

    public final x b() {
        if (!this.f24645b.o()) {
            return this.f24645b;
        }
        x xVar = this.f24645b;
        xVar.getClass();
        w0 w0Var = w0.f24646c;
        w0Var.getClass();
        w0Var.a(xVar.getClass()).b(xVar);
        xVar.p();
        return this.f24645b;
    }

    public final v c() {
        v vVarQ = this.f24644a.c();
        vVarQ.f24645b = b();
        return vVarQ;
    }

    public final void e() {
        if (this.f24645b.o()) {
            return;
        }
        x xVarR = this.f24644a.r();
        g(xVarR, this.f24645b);
        this.f24645b = xVarR;
    }

    public final void f(x xVar) {
        if (this.f24644a.equals(xVar)) {
            return;
        }
        e();
        g(this.f24645b, xVar);
    }
}
