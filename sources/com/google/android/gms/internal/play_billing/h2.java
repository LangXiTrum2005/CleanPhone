package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements k2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f24279b = new r1(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24280a;

    public h2(k2... k2VarArr) {
        this.f24280a = k2VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public r2 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            k2 k2Var = ((k2[]) this.f24280a)[i10];
            if (k2Var.b(cls)) {
                return k2Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.k2
    public boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (((k2[]) this.f24280a)[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }

    public void c(int i10, Object obj, s2 s2Var) {
        j1 j1Var = (j1) this.f24280a;
        j1Var.c0(i10, 3);
        s2Var.f((c1) obj, j1Var.f24306a);
        j1Var.c0(i10, 4);
    }

    public void d(int i10, Object obj, s2 s2Var) {
        c1 c1Var = (c1) obj;
        j1 j1Var = (j1) this.f24280a;
        j1Var.e0((i10 << 3) | 2);
        j1Var.e0(c1Var.b(s2Var));
        s2Var.f(c1Var, j1Var.f24306a);
    }

    public h2() {
        p2 p2Var = p2.f24443c;
        h2 h2Var = new h2(r1.f24459b, f24279b);
        Charset charset = z1.f24507a;
        this.f24280a = h2Var;
    }

    public h2(j1 j1Var) {
        Charset charset = z1.f24507a;
        this.f24280a = j1Var;
        j1Var.f24306a = this;
    }
}
