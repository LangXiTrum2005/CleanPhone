package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x9 implements ha {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j9 f21785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gp0 f21786b = new gp0(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21787c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public st0 f21789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f21790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f21791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f21792h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21793i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f21794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21795k;

    public x9(j9 j9Var) {
        this.f21785a = j9Var;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void a(st0 st0Var, o2 o2Var, ga gaVar) {
        this.f21789e = st0Var;
        this.f21785a.e(o2Var, gaVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.gp0] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.j9] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.ha
    public final void b(int i10, np0 np0Var) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        int i14;
        ?? r10;
        long jC;
        this.f21789e.getClass();
        int i15 = i10 & 1;
        ?? r3 = this.f21785a;
        int i16 = -1;
        int i17 = 2;
        ?? r11 = 0;
        int i18 = 1;
        if (i15 != 0) {
            int i19 = this.f21787c;
            if (i19 != 0 && i19 != 1) {
                if (i19 != 2) {
                    int i20 = this.f21794j;
                    if (i20 != -1) {
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i20).length() + 48);
                        sb2.append("Unexpected start indicator: expected ");
                        sb2.append(i20);
                        sb2.append(" more bytes");
                        v71.y("PesReader", sb2.toString());
                    }
                    r3.a(np0Var.f17882c == 0);
                } else {
                    v71.y("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f21787c = 1;
            this.f21788d = 0;
        }
        int i21 = i10;
        while (np0Var.B() > 0) {
            int i22 = this.f21787c;
            if (i22 != 0) {
                ?? r12 = this.f21786b;
                if (i22 != i18) {
                    if (i22 != i17) {
                        int iB = np0Var.B();
                        int i23 = this.f21794j;
                        if (i23 == i16) {
                            r10 = r11;
                        } else {
                            i14 = iB - i23;
                        }
                        if (r10 > 0) {
                            r10 = i14;
                            iB -= r10;
                            np0Var.C(np0Var.f17881b + iB);
                        }
                        r10 = i14;
                        r3.f(np0Var);
                        int i24 = this.f21794j;
                        if (i24 != i16) {
                            int i25 = i24 - iB;
                            this.f21794j = i25;
                            if (i25 == 0) {
                                r3.a(r11);
                                this.f21787c = i18;
                                this.f21788d = r11;
                            }
                        }
                    } else {
                        if (c(np0Var, r12.f14921a, Math.min(10, this.f21793i)) && c(np0Var, null, this.f21793i)) {
                            r12.d(r11);
                            if (this.f21790f) {
                                r12.f(4);
                                long jH = r12.h(3);
                                r12.f(i18);
                                int iH = r12.h(15) << 15;
                                r12.f(i18);
                                long jH2 = r12.h(15);
                                r12.f(i18);
                                if (!this.f21792h && this.f21791g) {
                                    r12.f(4);
                                    long jH3 = ((long) r12.h(3)) << 30;
                                    r12.f(i18);
                                    int iH2 = r12.h(15) << 15;
                                    r12.f(i18);
                                    long jH4 = r12.h(15);
                                    r12.f(i18);
                                    this.f21789e.c(jH3 | ((long) iH2) | jH4);
                                    this.f21792h = true;
                                }
                                jC = this.f21789e.c(jH2 | (jH << 30) | ((long) iH));
                            } else {
                                jC = C.TIME_UNSET;
                            }
                            i21 |= true != this.f21795k ? 0 : 4;
                            r3.c(i21, jC);
                            this.f21787c = 3;
                            this.f21788d = 0;
                            r11 = 0;
                            i16 = -1;
                            i17 = 2;
                            i18 = 1;
                        }
                    }
                    ?? r14 = r11;
                    i11 = i17;
                    z10 = r14 == true ? 1 : 0;
                    i12 = i18;
                } else {
                    ?? r13 = r11;
                    if (c(np0Var, r12.f14921a, 9)) {
                        r12.d(r13 == true ? 1 : 0);
                        int iH3 = r12.h(24);
                        i12 = 1;
                        if (iH3 != 1) {
                            com.applovin.impl.ca.r(new StringBuilder(String.valueOf(iH3).length() + 30), "Unexpected start code prefix: ", iH3, "PesReader");
                            i16 = -1;
                            this.f21794j = -1;
                            i13 = 0;
                            i11 = 2;
                        } else {
                            r12.f(8);
                            int iH4 = r12.h(16);
                            r12.f(5);
                            this.f21795k = r12.g();
                            i11 = 2;
                            r12.f(2);
                            this.f21790f = r12.g();
                            this.f21791g = r12.g();
                            r12.f(6);
                            int iH5 = r12.h(8);
                            this.f21793i = iH5;
                            if (iH4 == 0) {
                                this.f21794j = -1;
                                i13 = 2;
                                i16 = -1;
                            } else {
                                int i26 = (iH4 - 3) - iH5;
                                this.f21794j = i26;
                                if (i26 < 0) {
                                    com.applovin.impl.ca.r(new StringBuilder(String.valueOf(i26).length() + 36), "Found negative packet payload size: ", i26, "PesReader");
                                    i16 = -1;
                                    this.f21794j = -1;
                                } else {
                                    i16 = -1;
                                }
                                i13 = 2;
                            }
                        }
                        this.f21787c = i13;
                        z10 = false;
                        this.f21788d = 0;
                    } else {
                        z10 = r13 == true ? 1 : 0;
                        i16 = -1;
                        i11 = 2;
                        i12 = 1;
                    }
                }
            } else {
                ?? r15 = r11;
                i11 = i17;
                z10 = r15 == true ? 1 : 0;
                i12 = i18;
                np0Var.G(np0Var.B());
            }
            int i27 = i11;
            r11 = z10;
            i17 = i27;
            i18 = i12;
        }
    }

    public final boolean c(np0 np0Var, byte[] bArr, int i10) {
        int iMin = Math.min(np0Var.B(), i10 - this.f21788d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            np0Var.G(iMin);
        } else {
            np0Var.H(bArr, this.f21788d, iMin);
        }
        int i11 = this.f21788d + iMin;
        this.f21788d = i11;
        return i11 == i10;
    }

    @Override // com.google.android.gms.internal.ads.ha
    public final void zzb() {
        this.f21787c = 0;
        this.f21788d = 0;
        this.f21792h = false;
        this.f21785a.zza();
    }
}
