package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v5 implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w5 f23222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w5 f23223b;

    public v5(w5 w5Var) {
        this.f23222a = w5Var;
        if (w5Var.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f23223b = (w5) w5Var.f(4);
    }

    public final w5 a() {
        w5 w5VarB = b();
        w5VarB.getClass();
        boolean zG = true;
        byte bByteValue = ((Byte) w5VarB.f(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zG = false;
            } else {
                zG = p6.f23162c.a(w5VarB.getClass()).g(w5VarB);
                w5VarB.f(2);
            }
        }
        if (zG) {
            return w5VarB;
        }
        throw new aa.b("Message was missing required fields.  (Lite runtime could not determine which fields were missing).", 9);
    }

    public final w5 b() {
        if (!this.f23223b.e()) {
            return this.f23223b;
        }
        this.f23223b.j();
        return this.f23223b;
    }

    public final void c() {
        if (this.f23223b.e()) {
            return;
        }
        w5 w5Var = (w5) this.f23222a.f(4);
        p6.f23162c.a(w5Var.getClass()).e(w5Var, this.f23223b);
        this.f23223b = w5Var;
    }

    public final Object clone() {
        v5 v5Var = (v5) this.f23222a.f(5);
        v5Var.f23223b = b();
        return v5Var;
    }
}
