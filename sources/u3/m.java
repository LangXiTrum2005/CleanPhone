package u3;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.ga;
import com.google.android.gms.internal.ads.kj1;
import com.google.android.gms.internal.ads.w9;
import com.google.android.gms.internal.ads.xd1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i1.d0;
import java.util.ArrayList;
import java.util.Arrays;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1.s f51799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51801c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f51805g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51807i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a0 f51808j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f51809k;
    public boolean l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f51811n;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f51806h = new boolean[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w9 f51802d = new w9(7, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final w9 f51803e = new w9(8, 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w9 f51804f = new w9(6, 1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f51810m = C.TIME_UNSET;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final l1.q f51812o = new l1.q();

    public m(r1.s sVar, boolean z10, boolean z11) {
        this.f51799a = sVar;
        this.f51800b = z10;
        this.f51801c = z11;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:94:0x022d  */
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
    public final void a(long j10, int i10, int i11, long j11) {
        long j12;
        int i12;
        long j13;
        long j14;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z12;
        kj1 kj1Var = (kj1) this.f51799a.f49340d;
        if (!this.l || this.f51809k.f51783c) {
            w9 w9Var = this.f51802d;
            w9Var.b(i11);
            w9 w9Var2 = this.f51803e;
            w9Var2.b(i11);
            if (this.l) {
                if (w9Var.f21459c) {
                    m1.m mVarK = m1.n.k(w9Var.f21460d, 3, w9Var.f21461e);
                    kj1Var.r(mVarK.f45819s);
                    this.f51809k.f51784d.append(mVarK.f45805d, mVarK);
                    w9Var.c();
                } else if (w9Var2.f21459c) {
                    xd1 xd1Var = new xd1(w9Var2.f21460d, 4, w9Var2.f21461e);
                    int iM = xd1Var.m();
                    int iM2 = xd1Var.m();
                    xd1Var.s();
                    this.f51809k.f51785e.append(iM, new m1.l(iM, iM2, xd1Var.h()));
                    w9Var2.c();
                }
            } else if (w9Var.f21459c && w9Var2.f21459c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(w9Var.f21460d, w9Var.f21461e));
                arrayList.add(Arrays.copyOf(w9Var2.f21460d, w9Var2.f21461e));
                m1.m mVarK2 = m1.n.k(w9Var.f21460d, 3, w9Var.f21461e);
                int i17 = mVarK2.f45819s;
                xd1 xd1Var2 = new xd1(w9Var2.f21460d, 4, w9Var2.f21461e);
                int iM3 = xd1Var2.m();
                int iM4 = xd1Var2.m();
                xd1Var2.s();
                m1.l lVar = new m1.l(iM3, iM4, xd1Var2.h());
                String strA = l1.c.a(mVarK2.f45802a, mVarK2.f45803b, mVarK2.f45804c);
                a0 a0Var = this.f51808j;
                i1.o oVar = new i1.o();
                oVar.f42589a = this.f51807i;
                oVar.l = d0.n("video/mp2t");
                oVar.f42600m = d0.n("video/avc");
                oVar.f42598j = strA;
                oVar.f42607t = mVarK2.f45806e;
                oVar.f42608u = mVarK2.f45807f;
                oVar.C = new i1.h(mVarK2.f45816p, mVarK2.f45817q, mVarK2.f45818r, mVarK2.f45809h + 8, mVarK2.f45810i + 8, null);
                oVar.f42613z = mVarK2.f45808g;
                oVar.f42603p = arrayList;
                oVar.f42602o = i17;
                q4.a.o(oVar, a0Var);
                this.l = true;
                kj1Var.r(i17);
                this.f51809k.f51784d.append(mVarK2.f45805d, mVarK2);
                this.f51809k.f51785e.append(iM3, lVar);
                w9Var.c();
                w9Var2.c();
            }
        }
        w9 w9Var3 = this.f51804f;
        if (w9Var3.b(i11)) {
            int iN = m1.n.n(w9Var3.f21460d, w9Var3.f21461e);
            byte[] bArr = w9Var3.f21460d;
            l1.q qVar = this.f51812o;
            qVar.K(bArr, iN);
            qVar.M(4);
            kj1Var.a(j11, qVar);
        }
        l lVar2 = this.f51809k;
        boolean z13 = this.l;
        if (lVar2.f51789i == 9) {
            if (z13 && lVar2.f51794o) {
                j12 = lVar2.f51790j;
                i12 = i10 + ((int) (j10 - j12));
                j13 = lVar2.f51796q;
                if (j13 != C.TIME_UNSET) {
                    j14 = lVar2.f51795p;
                    if (j12 != j14) {
                        lVar2.f51781a.a(j13, lVar2.f51797r ? 1 : 0, (int) (j12 - j14), i12, null);
                    }
                }
            }
            lVar2.f51795p = lVar2.f51790j;
            lVar2.f51796q = lVar2.l;
            lVar2.f51797r = false;
            lVar2.f51794o = true;
        } else if (lVar2.f51783c) {
            k kVar = lVar2.f51793n;
            k kVar2 = lVar2.f51792m;
            if (kVar.f51766a) {
                if (kVar2.f51766a) {
                    m1.m mVar = kVar.f51768c;
                    mVar.getClass();
                    m1.m mVar2 = kVar2.f51768c;
                    mVar2.getClass();
                    int i18 = mVar2.f45813m;
                    if (kVar.f51771f != kVar2.f51771f || kVar.f51772g != kVar2.f51772g || kVar.f51773h != kVar2.f51773h || ((kVar.f51774i && kVar2.f51774i && kVar.f51775j != kVar2.f51775j) || (((i14 = kVar.f51769d) != (i15 = kVar2.f51769d) && (i14 == 0 || i15 == 0)) || (((i16 = mVar.f45813m) == 0 && i18 == 0 && (kVar.f51777m != kVar2.f51777m || kVar.f51778n != kVar2.f51778n)) || ((i16 == 1 && i18 == 1 && (kVar.f51779o != kVar2.f51779o || kVar.f51780p != kVar2.f51780p)) || (z12 = kVar.f51776k) != kVar2.f51776k || (z12 && kVar.l != kVar2.l)))))) {
                        if (z13) {
                            j12 = lVar2.f51790j;
                            i12 = i10 + ((int) (j10 - j12));
                            j13 = lVar2.f51796q;
                            if (j13 != C.TIME_UNSET) {
                                j14 = lVar2.f51795p;
                                if (j12 != j14) {
                                    lVar2.f51781a.a(j13, lVar2.f51797r ? 1 : 0, (int) (j12 - j14), i12, null);
                                }
                            }
                        }
                        lVar2.f51795p = lVar2.f51790j;
                        lVar2.f51796q = lVar2.l;
                        lVar2.f51797r = false;
                        lVar2.f51794o = true;
                    }
                } else {
                    if (z13) {
                        j12 = lVar2.f51790j;
                        i12 = i10 + ((int) (j10 - j12));
                        j13 = lVar2.f51796q;
                        if (j13 != C.TIME_UNSET) {
                            j14 = lVar2.f51795p;
                            if (j12 != j14) {
                                lVar2.f51781a.a(j13, lVar2.f51797r ? 1 : 0, (int) (j12 - j14), i12, null);
                            }
                        }
                    }
                    lVar2.f51795p = lVar2.f51790j;
                    lVar2.f51796q = lVar2.l;
                    lVar2.f51797r = false;
                    lVar2.f51794o = true;
                }
            }
        }
        if (lVar2.f51782b) {
            k kVar3 = lVar2.f51793n;
            z10 = kVar3.f51767b && ((i13 = kVar3.f51770e) == 7 || i13 == 2);
        } else {
            z10 = lVar2.f51798s;
        }
        boolean z14 = lVar2.f51797r;
        int i19 = lVar2.f51789i;
        if (i19 == 5) {
            z11 = true;
        } else if (z10) {
            z11 = true;
            if (i19 != 1) {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        boolean z15 = z14 | z11;
        lVar2.f51797r = z15;
        lVar2.f51789i = 24;
        if (z15) {
            this.f51811n = false;
        }
    }

    @Override // u3.f
    public final void b(l1.q qVar) {
        int i10;
        this.f51808j.getClass();
        String str = y.f44830a;
        int i11 = qVar.f44814b;
        int i12 = qVar.f44815c;
        byte[] bArr = qVar.f44813a;
        this.f51805g += (long) qVar.a();
        this.f51808j.g(qVar.a(), qVar);
        while (true) {
            int iB = m1.n.b(bArr, i11, i12, this.f51806h);
            if (iB == i12) {
                c(bArr, i11, i12);
                return;
            }
            int i13 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i10 = 3;
            } else {
                iB--;
                i10 = 4;
            }
            int i14 = iB;
            int i15 = i10;
            int i16 = i14 - i11;
            if (i16 > 0) {
                c(bArr, i11, i14);
            }
            int i17 = i12 - i14;
            long j10 = this.f51805g - ((long) i17);
            a(j10, i17, i16 < 0 ? -i16 : 0, this.f51810m);
            e(j10, i13, this.f51810m);
            i11 = i14 + i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0102  */
    /* JADX WARN: Code duplicated, block: B:59:0x0104  */
    /* JADX WARN: Code duplicated, block: B:61:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x010e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0113  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118  */
    /* JADX WARN: Code duplicated, block: B:71:0x011f  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139  */
    public final void c(byte[] bArr, int i10, int i11) {
        boolean zH;
        boolean zH2;
        boolean z10;
        boolean z11;
        int iM;
        int i12;
        int i13;
        int i14;
        int iN;
        int iN2;
        if (!this.l || this.f51809k.f51783c) {
            this.f51802d.a(bArr, i10, i11);
            this.f51803e.a(bArr, i10, i11);
        }
        this.f51804f.a(bArr, i10, i11);
        l lVar = this.f51809k;
        SparseArray sparseArray = lVar.f51785e;
        xd1 xd1Var = lVar.f51786f;
        if (lVar.f51791k) {
            int i15 = i11 - i10;
            byte[] bArr2 = lVar.f51787g;
            int length = bArr2.length;
            int i16 = lVar.f51788h + i15;
            if (length < i16) {
                lVar.f51787g = Arrays.copyOf(bArr2, i16 * 2);
            }
            System.arraycopy(bArr, i10, lVar.f51787g, lVar.f51788h, i15);
            int i17 = lVar.f51788h + i15;
            lVar.f51788h = i17;
            xd1Var.f21843b = lVar.f51787g;
            xd1Var.f21845d = 0;
            xd1Var.f21844c = i17;
            xd1Var.f21846e = 0;
            xd1Var.a();
            if (xd1Var.d(8)) {
                xd1Var.s();
                int i18 = xd1Var.i(2);
                xd1Var.t(5);
                if (xd1Var.e()) {
                    xd1Var.m();
                    if (xd1Var.e()) {
                        int iM2 = xd1Var.m();
                        if (!lVar.f51783c) {
                            lVar.f51791k = false;
                            k kVar = lVar.f51793n;
                            kVar.f51770e = iM2;
                            kVar.f51767b = true;
                            return;
                        }
                        if (xd1Var.e()) {
                            int iM3 = xd1Var.m();
                            if (sparseArray.indexOfKey(iM3) < 0) {
                                lVar.f51791k = false;
                                return;
                            }
                            m1.l lVar2 = (m1.l) sparseArray.get(iM3);
                            SparseArray sparseArray2 = lVar.f51784d;
                            int i19 = lVar2.f45800a;
                            boolean z12 = lVar2.f45801b;
                            m1.m mVar = (m1.m) sparseArray2.get(i19);
                            boolean z13 = mVar.f45811j;
                            int i20 = mVar.f45814n;
                            int i21 = mVar.l;
                            if (z13) {
                                if (!xd1Var.d(2)) {
                                    return;
                                } else {
                                    xd1Var.t(2);
                                }
                            }
                            if (xd1Var.d(i21)) {
                                int i22 = xd1Var.i(i21);
                                if (!mVar.f45812k) {
                                    if (xd1Var.d(1)) {
                                        zH = xd1Var.h();
                                        if (!zH) {
                                            zH2 = false;
                                        } else {
                                            if (!xd1Var.d(1)) {
                                                return;
                                            }
                                            zH2 = xd1Var.h();
                                            z10 = true;
                                        }
                                        if (lVar.f51789i == 5) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (z11) {
                                            iM = 0;
                                        } else if (!xd1Var.e()) {
                                            return;
                                        } else {
                                            iM = xd1Var.m();
                                        }
                                        i12 = mVar.f45813m;
                                        if (i12 != 0) {
                                            if (xd1Var.d(i20)) {
                                                i13 = xd1Var.i(i20);
                                                if (!z12 && !zH) {
                                                    if (!xd1Var.e()) {
                                                        return;
                                                    }
                                                    iN2 = xd1Var.n();
                                                    i14 = 0;
                                                }
                                                iN = 0;
                                                k kVar2 = lVar.f51793n;
                                                kVar2.f51768c = mVar;
                                                kVar2.f51769d = i18;
                                                kVar2.f51770e = iM2;
                                                kVar2.f51771f = i22;
                                                kVar2.f51772g = iM3;
                                                kVar2.f51773h = zH;
                                                kVar2.f51774i = z10;
                                                kVar2.f51775j = zH2;
                                                kVar2.f51776k = z11;
                                                kVar2.l = iM;
                                                kVar2.f51777m = i13;
                                                kVar2.f51778n = iN2;
                                                kVar2.f51779o = i14;
                                                kVar2.f51780p = iN;
                                                kVar2.f51766a = true;
                                                kVar2.f51767b = true;
                                                lVar.f51791k = false;
                                            }
                                            return;
                                        }
                                        if (i12 == 1 || mVar.f45815o) {
                                            i13 = 0;
                                        } else {
                                            if (!xd1Var.e()) {
                                                return;
                                            }
                                            int iN3 = xd1Var.n();
                                            if (!z12 || zH) {
                                                i14 = iN3;
                                                i13 = 0;
                                                iN2 = 0;
                                                iN = 0;
                                            } else {
                                                if (!xd1Var.e()) {
                                                    return;
                                                }
                                                iN = xd1Var.n();
                                                iN2 = 0;
                                                i14 = iN3;
                                                i13 = 0;
                                            }
                                        }
                                        k kVar3 = lVar.f51793n;
                                        kVar3.f51768c = mVar;
                                        kVar3.f51769d = i18;
                                        kVar3.f51770e = iM2;
                                        kVar3.f51771f = i22;
                                        kVar3.f51772g = iM3;
                                        kVar3.f51773h = zH;
                                        kVar3.f51774i = z10;
                                        kVar3.f51775j = zH2;
                                        kVar3.f51776k = z11;
                                        kVar3.l = iM;
                                        kVar3.f51777m = i13;
                                        kVar3.f51778n = iN2;
                                        kVar3.f51779o = i14;
                                        kVar3.f51780p = iN;
                                        kVar3.f51766a = true;
                                        kVar3.f51767b = true;
                                        lVar.f51791k = false;
                                        i14 = 0;
                                        iN2 = 0;
                                        iN = 0;
                                        k kVar4 = lVar.f51793n;
                                        kVar4.f51768c = mVar;
                                        kVar4.f51769d = i18;
                                        kVar4.f51770e = iM2;
                                        kVar4.f51771f = i22;
                                        kVar4.f51772g = iM3;
                                        kVar4.f51773h = zH;
                                        kVar4.f51774i = z10;
                                        kVar4.f51775j = zH2;
                                        kVar4.f51776k = z11;
                                        kVar4.l = iM;
                                        kVar4.f51777m = i13;
                                        kVar4.f51778n = iN2;
                                        kVar4.f51779o = i14;
                                        kVar4.f51780p = iN;
                                        kVar4.f51766a = true;
                                        kVar4.f51767b = true;
                                        lVar.f51791k = false;
                                    }
                                    return;
                                }
                                zH = false;
                                zH2 = false;
                                z10 = zH2;
                                if (lVar.f51789i == 5) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    iM = 0;
                                } else if (!xd1Var.e()) {
                                    return;
                                } else {
                                    iM = xd1Var.m();
                                }
                                i12 = mVar.f45813m;
                                if (i12 != 0) {
                                    if (i12 == 1) {
                                    }
                                    i13 = 0;
                                } else {
                                    if (xd1Var.d(i20)) {
                                        return;
                                    }
                                    i13 = xd1Var.i(i20);
                                    if (!z12) {
                                    }
                                }
                                i14 = 0;
                                iN2 = 0;
                                iN = 0;
                                k kVar5 = lVar.f51793n;
                                kVar5.f51768c = mVar;
                                kVar5.f51769d = i18;
                                kVar5.f51770e = iM2;
                                kVar5.f51771f = i22;
                                kVar5.f51772g = iM3;
                                kVar5.f51773h = zH;
                                kVar5.f51774i = z10;
                                kVar5.f51775j = zH2;
                                kVar5.f51776k = z11;
                                kVar5.l = iM;
                                kVar5.f51777m = i13;
                                kVar5.f51778n = iN2;
                                kVar5.f51779o = i14;
                                kVar5.f51780p = iN;
                                kVar5.f51766a = true;
                                kVar5.f51767b = true;
                                lVar.f51791k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // u3.f
    public final void d(boolean z10) {
        this.f51808j.getClass();
        String str = y.f44830a;
        if (z10) {
            ((kj1) this.f51799a.f49340d).o(0);
            a(this.f51805g, 0, 0, this.f51810m);
            e(this.f51805g, 9, this.f51810m);
            a(this.f51805g, 0, 0, this.f51810m);
        }
    }

    public final void e(long j10, int i10, long j11) {
        if (!this.l || this.f51809k.f51783c) {
            this.f51802d.d(i10);
            this.f51803e.d(i10);
        }
        this.f51804f.d(i10);
        l lVar = this.f51809k;
        boolean z10 = this.f51811n;
        lVar.f51789i = i10;
        lVar.l = j11;
        lVar.f51790j = j10;
        lVar.f51798s = z10;
        if (!lVar.f51782b || i10 != 1) {
            if (!lVar.f51783c) {
                return;
            }
            if (i10 != 5 && i10 != 1 && i10 != 2) {
                return;
            }
        }
        k kVar = lVar.f51792m;
        lVar.f51792m = lVar.f51793n;
        lVar.f51793n = kVar;
        kVar.f51767b = false;
        kVar.f51766a = false;
        lVar.f51788h = 0;
        lVar.f51791k = true;
    }

    @Override // u3.f
    public final void g(n2.m mVar, ga gaVar) {
        gaVar.a();
        gaVar.b();
        this.f51807i = gaVar.f14806e;
        gaVar.b();
        a0 a0VarTrack = mVar.track(gaVar.f14805d, 2);
        this.f51808j = a0VarTrack;
        this.f51809k = new l(a0VarTrack, this.f51800b, this.f51801c);
        this.f51799a.i(mVar, gaVar);
    }

    @Override // u3.f
    public final void h(int i10, long j10) {
        this.f51810m = j10;
        this.f51811n = ((i10 & 2) != 0) | this.f51811n;
    }

    @Override // u3.f
    public final void seek() {
        this.f51805g = 0L;
        this.f51811n = false;
        this.f51810m = C.TIME_UNSET;
        m1.n.a(this.f51806h);
        this.f51802d.c();
        this.f51803e.c();
        this.f51804f.c();
        ((kj1) this.f51799a.f49340d).o(0);
        l lVar = this.f51809k;
        if (lVar != null) {
            lVar.f51791k = false;
            lVar.f51794o = false;
            k kVar = lVar.f51793n;
            kVar.f51767b = false;
            kVar.f51766a = false;
        }
    }
}
