package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 extends e32 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a32 f17629k;
    public final boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ih f17630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ug f17631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l32 f17632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k32 f17633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f17634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f17635r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f17636s;

    public n32(a32 a32Var, boolean z10) {
        boolean z11;
        this.f17629k = a32Var;
        if (z10) {
            a32Var.e();
            z11 = true;
        } else {
            z11 = false;
        }
        this.l = z11;
        this.f17630m = new ih();
        this.f17631n = new ug();
        a32Var.d();
        this.f17632o = new l32(new m32(a32Var.f()), ih.f15742m, l32.f16697e);
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void a(f5 f5Var) {
        if (this.f17636s) {
            l32 l32Var = this.f17632o;
            ci ciVar = l32Var.f15101b;
            this.f17632o = new l32(ciVar instanceof u42 ? new u42(((u42) ciVar).f15101b, f5Var) : new u42(ciVar, f5Var), l32Var.f16698c, l32Var.f16699d);
        } else {
            this.f17632o = new l32(new m32(f5Var), ih.f15742m, l32.f16697e);
        }
        this.f17629k.a(f5Var);
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void b(q32 q32Var) {
        k32 k32Var = (k32) q32Var;
        q32 q32Var2 = k32Var.f16301e;
        if (q32Var2 != null) {
            a32 a32Var = k32Var.f16300d;
            a32Var.getClass();
            a32Var.b(q32Var2);
        }
        if (q32Var == this.f17633p) {
            this.f17633p = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void d() {
        this.f17629k.d();
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void e() {
        this.f17629k.e();
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final f5 f() {
        return this.f17629k.f();
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void h(ox1 ox1Var) {
        this.f13826j = uu0.o();
        if (this.l) {
            return;
        }
        this.f17634q = true;
        t(null, this.f17629k);
    }

    @Override // com.google.android.gms.internal.ads.e32, com.google.android.gms.internal.ads.a32
    public final void j() {
        this.f17635r = false;
        this.f17634q = false;
        super.j();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    @Override // com.google.android.gms.internal.ads.e32
    public final void s(Object obj, a32 a32Var, ci ciVar) {
        long j10;
        l32 l32Var;
        l32 l32Var2;
        r32 r32VarA = null;
        if (this.f17635r) {
            l32 l32Var3 = this.f17632o;
            this.f17632o = new l32(ciVar, l32Var3.f16698c, l32Var3.f16699d);
            k32 k32Var = this.f17633p;
            if (k32Var != null) {
                y(k32Var.f16303g);
            }
        } else if (ciVar.g()) {
            if (this.f17636s) {
                l32 l32Var4 = this.f17632o;
                l32Var2 = new l32(ciVar, l32Var4.f16698c, l32Var4.f16699d);
            } else {
                l32Var2 = new l32(ciVar, ih.f15742m, l32.f16697e);
            }
            this.f17632o = l32Var2;
        } else {
            ih ihVar = this.f17630m;
            ciVar.b(0, ihVar, 0L);
            Object obj2 = ihVar.f15744a;
            k32 k32Var2 = this.f17633p;
            if (k32Var2 != null) {
                j10 = k32Var2.f16298b;
                this.f17632o.o(k32Var2.f16297a.f19359a, this.f17631n);
                this.f17632o.b(0, ihVar, 0L);
                if (j10 == 0) {
                    j10 = 0;
                }
            } else {
                j10 = 0;
            }
            Pair pairM = ciVar.m(ihVar, this.f17631n, 0, j10);
            Object obj3 = pairM.first;
            long jLongValue = ((Long) pairM.second).longValue();
            if (this.f17636s) {
                l32 l32Var5 = this.f17632o;
                l32Var = new l32(ciVar, l32Var5.f16698c, l32Var5.f16699d);
            } else {
                l32Var = new l32(ciVar, obj2, obj3);
            }
            this.f17632o = l32Var;
            k32 k32Var3 = this.f17633p;
            if (k32Var3 != null && y(jLongValue)) {
                r32 r32Var = k32Var3.f16297a;
                Object obj4 = r32Var.f19359a;
                if (this.f17632o.f16699d != null && obj4.equals(l32.f16697e)) {
                    obj4 = this.f17632o.f16699d;
                }
                r32VarA = r32Var.a(obj4);
            }
        }
        this.f17636s = true;
        this.f17635r = true;
        k(this.f17632o);
        if (r32VarA != null) {
            k32 k32Var4 = this.f17633p;
            k32Var4.getClass();
            k32Var4.j(r32VarA);
        }
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* bridge */ /* synthetic */ void u(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final r32 v(Object obj, r32 r32Var) {
        Object obj2 = this.f17632o.f16699d;
        Object obj3 = r32Var.f19359a;
        if (obj2 != null && obj2.equals(obj3)) {
            obj3 = l32.f16697e;
        }
        return r32Var.a(obj3);
    }

    @Override // com.google.android.gms.internal.ads.e32
    public final /* synthetic */ void w(long j10, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.a32
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final k32 c(r32 r32Var, u uVar, long j10) {
        k32 k32Var = new k32(r32Var, uVar, j10);
        ps1.c0(k32Var.f16300d == null);
        a32 a32Var = this.f17629k;
        k32Var.f16300d = a32Var;
        if (!this.f17635r) {
            this.f17633p = k32Var;
            if (!this.f17634q) {
                this.f17634q = true;
                t(null, a32Var);
            }
            return k32Var;
        }
        Object obj = r32Var.f19359a;
        if (this.f17632o.f16699d != null && obj.equals(l32.f16697e)) {
            obj = this.f17632o.f16699d;
        }
        k32Var.j(r32Var.a(obj));
        return k32Var;
    }

    public final boolean y(long j10) {
        k32 k32Var = this.f17633p;
        int iE = this.f17632o.e(k32Var.f16297a.f19359a);
        if (iE == -1) {
            return false;
        }
        l32 l32Var = this.f17632o;
        ug ugVar = this.f17631n;
        l32Var.d(iE, ugVar, false);
        long j11 = ugVar.f20773d;
        if (j11 != C.TIME_UNSET && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        k32Var.f16303g = j10;
        return true;
    }
}
