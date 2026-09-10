package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q9 implements j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final da f18983a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18987e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18989g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h3 f18990h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public p9 f18991i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f18992j;
    public boolean l;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f18988f = new boolean[3];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w9 f18984b = new w9(7, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w9 f18985c = new w9(8, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w9 f18986d = new w9(6, 0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18993k = C.TIME_UNSET;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final np0 f18994m = new np0();

    public q9(da daVar) {
        this.f18983a = daVar;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void a(boolean z10) {
        this.f18990h.getClass();
        String str = uu0.f20901a;
        if (z10) {
            this.f18983a.f13475d.w(0);
            d(0, 0, this.f18987e, this.f18993k);
            b(9, this.f18987e, this.f18993k);
            d(0, 0, this.f18987e, this.f18993k);
        }
    }

    public final void b(int i10, long j10, long j11) {
        if (!this.f18992j) {
            this.f18984b.f(i10);
            this.f18985c.f(i10);
        }
        this.f18986d.f(i10);
        p9 p9Var = this.f18991i;
        boolean z10 = this.l;
        p9Var.f18564d = i10;
        p9Var.f18566f = j11;
        p9Var.f18565e = j10;
        p9Var.f18571k = z10;
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void c(int i10, long j10) {
        this.f18993k = j10;
        int i11 = i10 & 2;
        this.l = (i11 != 0) | this.l;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void d(int i10, int i11, long j10, long j11) {
        kj1 kj1Var = this.f18983a.f13475d;
        boolean z10 = true;
        if (!this.f18992j) {
            w9 w9Var = this.f18984b;
            w9Var.h(i11);
            w9 w9Var2 = this.f18985c;
            w9Var2.h(i11);
            if (this.f18992j) {
                if (w9Var.f21459c) {
                    t61 t61VarF = dv.F(w9Var.f21460d, 4, w9Var.f21461e);
                    kj1Var.u(t61VarF.f20226m);
                    this.f18991i.f18562b.append(t61VarF.f20218d, t61VarF);
                    w9Var.e();
                } else if (w9Var2.f21459c) {
                    ta1 ta1Var = new ta1(w9Var2.f21460d, 4, w9Var2.f21461e);
                    int iG = ta1Var.g();
                    ta1Var.g();
                    ta1Var.a();
                    ta1Var.d();
                    this.f18991i.f18563c.append(iG, new tt0(iG));
                    w9Var2.e();
                }
            } else if (w9Var.f21459c && w9Var2.f21459c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(w9Var.f21460d, w9Var.f21461e));
                arrayList.add(Arrays.copyOf(w9Var2.f21460d, w9Var2.f21461e));
                t61 t61VarF2 = dv.F(w9Var.f21460d, 4, w9Var.f21461e);
                ta1 ta1Var2 = new ta1(w9Var2.f21460d, 4, w9Var2.f21461e);
                int iG2 = ta1Var2.g();
                ta1Var2.g();
                ta1Var2.a();
                ta1Var2.d();
                tt0 tt0Var = new tt0(iG2);
                int i12 = t61VarF2.f20215a;
                int i13 = t61VarF2.f20216b;
                int i14 = t61VarF2.f20217c;
                byte[] bArr = re0.f19567a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14));
                h3 h3Var = this.f18990h;
                i12 i12Var = new i12();
                i12Var.f15499a = this.f18989g;
                i12Var.d("video/mp2t");
                i12Var.e("video/avc");
                i12Var.f15508j = str;
                i12Var.f15518u = t61VarF2.f20219e;
                i12Var.f15519v = t61VarF2.f20220f;
                i12Var.D = new lq1(t61VarF2.f20224j, t61VarF2.f20225k, t61VarF2.l, t61VarF2.f20222h + 8, t61VarF2.f20223i + 8, null);
                i12Var.A = t61VarF2.f20221g;
                i12Var.f15514q = arrayList;
                int i15 = t61VarF2.f20226m;
                i12Var.f15513p = i15;
                h3Var.f(new g22(i12Var));
                this.f18992j = true;
                kj1Var.u(i15);
                this.f18991i.f18562b.append(t61VarF2.f20218d, t61VarF2);
                this.f18991i.f18563c.append(iG2, tt0Var);
                w9Var.e();
                w9Var2.e();
            }
        }
        w9 w9Var3 = this.f18986d;
        if (w9Var3.h(i11)) {
            int iB = dv.b(w9Var3.f21461e, w9Var3.f21460d);
            byte[] bArr2 = w9Var3.f21460d;
            np0 np0Var = this.f18994m;
            np0Var.z(iB, bArr2);
            np0Var.E(4);
            kj1Var.v(j11, np0Var);
        }
        p9 p9Var = this.f18991i;
        boolean z11 = this.f18992j;
        if (p9Var.f18564d == 9) {
            if (z11 && p9Var.f18567g) {
                long j12 = p9Var.f18565e;
                int i16 = i10 + ((int) (j10 - j12));
                long j13 = p9Var.f18569i;
                if (j13 != C.TIME_UNSET) {
                    long j14 = p9Var.f18568h;
                    if (j12 != j14) {
                        p9Var.f18561a.c(j13, p9Var.f18570j ? 1 : 0, (int) (j12 - j14), i16, null);
                    }
                }
            }
            p9Var.f18568h = p9Var.f18565e;
            p9Var.f18569i = p9Var.f18566f;
            p9Var.f18570j = false;
            p9Var.f18567g = true;
        }
        boolean z12 = p9Var.f18571k;
        boolean z13 = p9Var.f18570j;
        int i17 = p9Var.f18564d;
        if (i17 != 5 && (!z12 || i17 != 1)) {
            z10 = false;
        }
        boolean z14 = z13 | z10;
        p9Var.f18570j = z14;
        p9Var.f18564d = 24;
        if (z14) {
            this.l = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void e(o2 o2Var, ga gaVar) {
        gaVar.c();
        gaVar.d();
        this.f18989g = gaVar.f14806e;
        gaVar.d();
        h3 h3VarE = o2Var.e(gaVar.f14805d, 2);
        this.f18990h = h3VarE;
        this.f18991i = new p9(h3VarE);
        this.f18983a.a(o2Var, gaVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0040  */
    @Override // com.google.android.gms.internal.ads.j9
    public final void f(np0 np0Var) {
        w9 w9Var;
        w9 w9Var2;
        w9 w9Var3;
        int i10;
        this.f18990h.getClass();
        String str = uu0.f20901a;
        int i11 = np0Var.f17881b;
        int i12 = np0Var.f17882c;
        byte[] bArr = np0Var.f17880a;
        this.f18987e += (long) np0Var.B();
        this.f18990h.b(np0Var.B(), np0Var);
        while (true) {
            int iK = dv.K(bArr, i11, i12, this.f18988f);
            w9Var = this.f18986d;
            w9Var2 = this.f18985c;
            w9Var3 = this.f18984b;
            if (iK == i12) {
                break;
            }
            int i13 = bArr[iK + 3] & 31;
            int i14 = 3;
            if (iK > 0) {
                i10 = iK - 1;
                if (bArr[i10] == 0) {
                    i14 = 4;
                } else {
                    i10 = iK;
                }
            } else {
                i10 = iK;
            }
            int i15 = i14;
            int i16 = i10 - i11;
            if (i16 > 0) {
                if (!this.f18992j) {
                    w9Var3.g(bArr, i11, i10);
                    w9Var2.g(bArr, i11, i10);
                }
                w9Var.g(bArr, i11, i10);
            }
            int i17 = i12 - i10;
            long j10 = this.f18987e - ((long) i17);
            d(i17, i16 < 0 ? -i16 : 0, j10, this.f18993k);
            b(i13, j10, this.f18993k);
            i11 = i10 + i15;
        }
        if (!this.f18992j) {
            w9Var3.g(bArr, i11, i12);
            w9Var2.g(bArr, i11, i12);
        }
        w9Var.g(bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.j9
    public final void zza() {
        this.f18987e = 0L;
        this.l = false;
        this.f18993k = C.TIME_UNSET;
        dv.L(this.f18988f);
        this.f18984b.e();
        this.f18985c.e();
        this.f18986d.e();
        this.f18983a.f13475d.w(0);
        p9 p9Var = this.f18991i;
        if (p9Var != null) {
            p9Var.f18567g = false;
        }
    }
}
