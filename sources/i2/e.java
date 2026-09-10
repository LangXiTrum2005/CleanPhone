package i2;

import android.content.res.Resources;
import android.text.TextUtils;
import i1.q0;
import i1.s0;
import java.util.Objects;
import l1.y;
import oa.j0;
import oa.m1;
import oa.w1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends n implements Comparable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f42750e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42751f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f42752g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f42753h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f42754i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42755j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42756k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f42757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f42758n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f42759o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f42760p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f42761q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f42762r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f42763s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f42764t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f42765u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f42766v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f42767w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f42768x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f42769y;

    /* JADX WARN: Code duplicated, block: B:109:0x0179  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:85:0x0137  */
    /* JADX WARN: Code duplicated, block: B:86:0x0139  */
    /* JADX WARN: Code duplicated, block: B:89:0x0142  */
    /* JADX WARN: Code duplicated, block: B:90:0x0144  */
    public e(int i10, q0 q0Var, int i11, i iVar, int i12, boolean z10, d dVar, int i13) {
        int i14;
        int iD;
        boolean z11;
        int iD2;
        boolean z12;
        boolean z13;
        boolean z14;
        s0 s0Var;
        super(i10, q0Var, i11);
        this.f42753h = iVar;
        boolean z15 = iVar.f42781z;
        j0 j0Var = iVar.f42687p;
        j0 j0Var2 = iVar.l;
        int i15 = z15 ? 24 : 16;
        int i16 = 0;
        this.f42758n = false;
        this.f42752g = p.f(this.f42799d.f42634d);
        this.f42754i = p1.a.k(i12, false);
        int i17 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i17 >= j0Var2.size()) {
                iD = 0;
                i17 = Integer.MAX_VALUE;
                break;
            } else {
                iD = p.d(this.f42799d, (String) j0Var2.get(i17), false);
                if (iD > 0) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        this.f42756k = i17;
        this.f42755j = iD;
        int i18 = this.f42799d.f42636f;
        this.l = (i18 == 0 || i18 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        this.f42757m = p.b(this.f42799d, iVar.f42684m);
        i1.p pVar = this.f42799d;
        int i19 = pVar.f42636f;
        this.f42759o = i19 == 0 || (i19 & 1) != 0;
        this.f42762r = (pVar.f42635e & 1) != 0;
        String str = pVar.f42643n;
        if (str != null) {
            switch (str) {
                case "audio/eac3-joc":
                case "audio/ac4":
                case "audio/iamf":
                    z11 = true;
                    break;
                default:
                    z11 = false;
                    break;
            }
        } else {
            z11 = false;
        }
        this.f42769y = z11;
        int i20 = pVar.F;
        this.f42763s = i20;
        this.f42764t = pVar.G;
        int i21 = pVar.f42640j;
        this.f42765u = i21;
        this.f42751f = (i21 == -1 || i21 <= iVar.f42686o) && (i20 == -1 || i20 <= iVar.f42685n) && dVar.apply(pVar);
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i22 = 0; i22 < strArrSplit.length; i22++) {
            strArrSplit[i22] = y.N(strArrSplit[i22]);
        }
        int i23 = 0;
        while (true) {
            if (i23 < strArrSplit.length) {
                iD2 = p.d(this.f42799d, strArrSplit[i23], false);
                if (iD2 <= 0) {
                    i23++;
                }
            } else {
                iD2 = 0;
                i23 = Integer.MAX_VALUE;
            }
        }
        this.f42760p = i23;
        this.f42761q = iD2;
        for (int i24 = 0; i24 < j0Var.size(); i24++) {
            String str2 = this.f42799d.f42643n;
            if (str2 != null && str2.equals(j0Var.get(i24))) {
                i14 = i24;
                this.f42766v = i14;
                if ((i12 & 384) == 128) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                this.f42767w = z12;
                if ((i12 & 64) == 64) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                this.f42768x = z13;
                boolean z16 = this.f42751f;
                i iVar2 = this.f42753h;
                z14 = iVar2.B;
                s0Var = iVar2.f42688q;
                if (p1.a.k(i12, z14) && (z16 || iVar2.f42780y)) {
                    s0Var.getClass();
                    if (p1.a.k(i12, false) || !z16 || this.f42799d.f42640j == -1 || ((!iVar2.C && z10) || (i15 & i12) == 0)) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                }
                this.f42750e = i16;
            }
        }
        this.f42766v = i14;
        if ((i12 & 384) == 128) {
            z12 = true;
        } else {
            z12 = false;
        }
        this.f42767w = z12;
        if ((i12 & 64) == 64) {
            z13 = true;
        } else {
            z13 = false;
        }
        this.f42768x = z13;
        boolean z17 = this.f42751f;
        i iVar3 = this.f42753h;
        z14 = iVar3.B;
        s0Var = iVar3.f42688q;
        if (p1.a.k(i12, z14)) {
            s0Var.getClass();
            if (p1.a.k(i12, false)) {
                i16 = 1;
            } else {
                i16 = 1;
            }
        }
        this.f42750e = i16;
    }

    @Override // i2.n
    public final int a() {
        return this.f42750e;
    }

    @Override // i2.n
    public final boolean b(n nVar) {
        int i10;
        String str;
        e eVar = (e) nVar;
        i1.p pVar = eVar.f42799d;
        this.f42753h.getClass();
        i1.p pVar2 = this.f42799d;
        int i11 = pVar2.F;
        if (i11 == -1 || i11 != pVar.F) {
            return false;
        }
        return (this.f42758n || ((str = pVar2.f42643n) != null && TextUtils.equals(str, pVar.f42643n))) && (i10 = pVar2.G) != -1 && i10 == pVar.G && this.f42767w == eVar.f42767w && this.f42768x == eVar.f42768x;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(e eVar) {
        boolean z10 = this.f42754i;
        boolean z11 = this.f42751f;
        m1 m1VarD = (z11 && z10) ? p.f42818k : p.f42818k.d();
        boolean z12 = eVar.f42754i;
        int i10 = eVar.f42765u;
        oa.y yVarC = oa.y.f47346a.c(z10, z12);
        Integer numValueOf = Integer.valueOf(this.f42756k);
        Integer numValueOf2 = Integer.valueOf(eVar.f42756k);
        w1 w1Var = w1.f47340a;
        oa.y yVarB = yVarC.b(numValueOf, numValueOf2, w1Var).a(this.f42755j, eVar.f42755j).a(this.l, eVar.l).b(Integer.valueOf(this.f42757m), Integer.valueOf(eVar.f42757m), w1Var).c(this.f42762r, eVar.f42762r).c(this.f42759o, eVar.f42759o).b(Integer.valueOf(this.f42760p), Integer.valueOf(eVar.f42760p), w1Var).a(this.f42761q, eVar.f42761q).c(z11, eVar.f42751f).b(Integer.valueOf(this.f42766v), Integer.valueOf(eVar.f42766v), w1Var);
        this.f42753h.getClass();
        oa.y yVarB2 = yVarB.c(this.f42767w, eVar.f42767w).c(this.f42768x, eVar.f42768x).c(this.f42769y, eVar.f42769y).b(Integer.valueOf(this.f42763s), Integer.valueOf(eVar.f42763s), m1VarD).b(Integer.valueOf(this.f42764t), Integer.valueOf(eVar.f42764t), m1VarD);
        if (Objects.equals(this.f42752g, eVar.f42752g)) {
            yVarB2 = yVarB2.b(Integer.valueOf(this.f42765u), Integer.valueOf(i10), m1VarD);
        }
        return yVarB2.e();
    }
}
