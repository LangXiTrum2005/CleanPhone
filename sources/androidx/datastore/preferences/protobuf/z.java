package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f4207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f4208b;

    public z(b0 b0Var) {
        this.f4207a = b0Var;
        if (b0Var.g()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f4208b = b0Var.i();
    }

    public final b0 a() {
        b0 b0VarB = b();
        b0VarB.getClass();
        if (b0.f(b0VarB, true)) {
            return b0VarB;
        }
        throw new j1();
    }

    public final b0 b() {
        if (!this.f4208b.g()) {
            return this.f4208b;
        }
        b0 b0Var = this.f4208b;
        b0Var.getClass();
        a1 a1Var = a1.f4050c;
        a1Var.getClass();
        a1Var.a(b0Var.getClass()).b(b0Var);
        b0Var.h();
        return this.f4208b;
    }

    public final void c() {
        if (this.f4208b.g()) {
            return;
        }
        b0 b0VarI = this.f4207a.i();
        b0 b0Var = this.f4208b;
        a1 a1Var = a1.f4050c;
        a1Var.getClass();
        a1Var.a(b0VarI.getClass()).a(b0VarI, b0Var);
        this.f4208b = b0VarI;
    }

    public final Object clone() {
        z zVar = (z) this.f4207a.c(5);
        zVar.f4208b = b();
        return zVar;
    }
}
