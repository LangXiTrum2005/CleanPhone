package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c32 implements v32, c22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public iw0 f13013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f81 f13014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e32 f13015d;

    public c32(e32 e32Var, Object obj) {
        this.f13015d = e32Var;
        this.f13013b = new iw0((CopyOnWriteArrayList) e32Var.f11822c.f15865c, false, null, 17);
        this.f13014c = new f81((CopyOnWriteArrayList) e32Var.f11823d.f14318c, (r32) null);
        this.f13012a = obj;
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void a(int i10, r32 r32Var, j32 j32Var, o32 o32Var) {
        if (f(r32Var)) {
            iw0 iw0Var = this.f13013b;
            g(o32Var, r32Var);
            iw0Var.getClass();
            iw0Var.B(new u32(iw0Var, j32Var, o32Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void b(int i10, r32 r32Var, j32 j32Var, o32 o32Var) {
        if (f(r32Var)) {
            iw0 iw0Var = this.f13013b;
            g(o32Var, r32Var);
            iw0Var.getClass();
            iw0Var.B(new u32(iw0Var, j32Var, o32Var, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void c(int i10, r32 r32Var, j32 j32Var, o32 o32Var, int i11) {
        if (f(r32Var)) {
            iw0 iw0Var = this.f13013b;
            g(o32Var, r32Var);
            iw0Var.getClass();
            iw0Var.B(new vc(iw0Var, j32Var, o32Var, i11));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void d(int i10, r32 r32Var, o32 o32Var) {
        if (f(r32Var)) {
            iw0 iw0Var = this.f13013b;
            g(o32Var, r32Var);
            iw0Var.getClass();
            iw0Var.B(new f81(12, iw0Var, o32Var));
        }
    }

    @Override // com.google.android.gms.internal.ads.v32
    public final void e(int i10, r32 r32Var, j32 j32Var, o32 o32Var, IOException iOException, boolean z10) {
        if (f(r32Var)) {
            iw0 iw0Var = this.f13013b;
            g(o32Var, r32Var);
            iw0Var.getClass();
            iw0Var.B(new m01(iw0Var, j32Var, o32Var, iOException, z10));
        }
    }

    public final boolean f(r32 r32Var) {
        r32 r32VarV;
        Object obj = this.f13012a;
        e32 e32Var = this.f13015d;
        if (r32Var != null) {
            r32VarV = e32Var.v(obj, r32Var);
            if (r32VarV == null) {
                return false;
            }
        } else {
            r32VarV = null;
        }
        e32Var.u(obj);
        iw0 iw0Var = this.f13013b;
        iw0Var.getClass();
        if (!Objects.equals((r32) iw0Var.f15864b, r32VarV)) {
            this.f13013b = new iw0((CopyOnWriteArrayList) e32Var.f11822c.f15865c, false, r32VarV, 17);
        }
        f81 f81Var = this.f13014c;
        f81Var.getClass();
        if (Objects.equals((r32) f81Var.f14317b, r32VarV)) {
            return true;
        }
        this.f13014c = new f81((CopyOnWriteArrayList) e32Var.f11823d.f14318c, r32VarV);
        return true;
    }

    public final void g(o32 o32Var, r32 r32Var) {
        long j10 = o32Var.f18114c;
        e32 e32Var = this.f13015d;
        Object obj = this.f13012a;
        e32Var.w(j10, obj);
        e32Var.w(o32Var.f18115d, obj);
    }
}
