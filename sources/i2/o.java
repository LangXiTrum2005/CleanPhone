package i2;

import com.applovin.shadow.okhttp3.internal.http2.Http2;
import i1.q0;
import java.util.Objects;
import oa.j0;
import oa.m1;
import oa.w1;
import oa.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f42801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42803h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f42804i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f42805j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f42806k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f42807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f42808n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f42809o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f42810p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f42811q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f42812r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f42813s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f42814t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f42815u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f42816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f42817w;

    /* JADX WARN: Code duplicated, block: B:124:0x0176  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:42:0x006a  */
    public o(int i10, q0 q0Var, int i11, i iVar, int i12, String str, int i13, boolean z10) {
        boolean z11;
        boolean z12;
        int i14;
        int iD;
        int i15;
        int i16;
        i1.p pVar;
        int i17;
        int i18;
        int i19;
        i1.p pVar2;
        int i20;
        int i21;
        int i22;
        super(i10, q0Var, i11);
        this.f42801f = iVar;
        boolean z13 = iVar.f42779x;
        j0 j0Var = iVar.f42681i;
        j0 j0Var2 = iVar.f42683k;
        int i23 = z13 ? 24 : 16;
        int i24 = 0;
        this.f42813s = false;
        if (!z10 || (((i20 = (pVar2 = this.f42799d).f42650u) != -1 && i20 > iVar.f42673a) || ((i21 = pVar2.f42651v) != -1 && i21 > iVar.f42674b))) {
            z11 = false;
        } else {
            float f10 = pVar2.f42654y;
            if ((f10 == -1.0f || f10 <= iVar.f42675c) && ((i22 = pVar2.f42640j) == -1 || i22 <= iVar.f42676d)) {
                z11 = true;
            } else {
                z11 = false;
            }
        }
        this.f42800e = z11;
        if (!z10 || (((i17 = (pVar = this.f42799d).f42650u) != -1 && i17 < 0) || ((i18 = pVar.f42651v) != -1 && i18 < 0))) {
            z12 = false;
        } else {
            float f11 = pVar.f42654y;
            if ((f11 == -1.0f || f11 >= 0) && ((i19 = pVar.f42640j) == -1 || i19 >= 0)) {
                z12 = true;
            } else {
                z12 = false;
            }
        }
        this.f42802g = z12;
        this.f42803h = p1.a.k(i12, false);
        i1.p pVar3 = this.f42799d;
        float f12 = pVar3.f42654y;
        this.f42804i = f12 != -1.0f && f12 >= 10.0f;
        this.f42805j = pVar3.f42640j;
        int i25 = pVar3.f42650u;
        this.f42806k = (i25 == -1 || (i16 = pVar3.f42651v) == -1) ? -1 : i25 * i16;
        int i26 = 0;
        while (true) {
            i14 = Integer.MAX_VALUE;
            if (i26 >= j0Var2.size()) {
                iD = 0;
                i26 = Integer.MAX_VALUE;
                break;
            } else {
                iD = p.d(this.f42799d, (String) j0Var2.get(i26), false);
                if (iD > 0) {
                    break;
                } else {
                    i26++;
                }
            }
        }
        this.f42807m = i26;
        this.f42808n = iD;
        int i27 = this.f42799d.f42636f;
        m1 m1Var = p.f42818k;
        this.f42809o = (i27 == 0 || i27 != 0) ? Integer.bitCount(0) : Integer.MAX_VALUE;
        int i28 = this.f42799d.f42636f;
        this.f42811q = i28 == 0 || (i28 & 1) != 0;
        this.f42812r = p.d(this.f42799d, str, p.f(str) == null);
        for (int i29 = 0; i29 < j0Var.size(); i29++) {
            String str2 = this.f42799d.f42643n;
            if (str2 != null && str2.equals(j0Var.get(i29))) {
                i14 = i29;
                break;
            }
        }
        this.l = i14;
        this.f42810p = p.b(this.f42799d, iVar.f42682j);
        this.f42815u = (i12 & 384) == 128;
        this.f42816v = (i12 & 64) == 64;
        i1.p pVar4 = this.f42799d;
        String str3 = pVar4.f42643n;
        if (str3 != null) {
            i15 = 4;
            switch (str3) {
                case "video/dolby-vision":
                    i15 = 5;
                    break;
                case "video/av01":
                    break;
                case "video/hevc":
                    i15 = 3;
                    break;
                case "video/avc":
                    i15 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i15 = 2;
                    break;
                default:
                    i15 = 0;
                    break;
            }
        } else {
            i15 = 0;
        }
        this.f42817w = i15;
        boolean z14 = this.f42800e;
        i iVar2 = this.f42801f;
        if ((pVar4.f42636f & Http2.INITIAL_MAX_FRAME_SIZE) == 0 && p1.a.k(i12, iVar2.B) && (z14 || iVar2.f42778w)) {
            i24 = (p1.a.k(i12, false) && this.f42802g && z14 && pVar4.f42640j != -1 && (i23 & i12) != 0) ? 2 : 1;
        }
        this.f42814t = i24;
    }

    public static int c(o oVar, o oVar2) {
        y yVarC = y.f47346a.c(oVar.f42803h, oVar2.f42803h);
        Integer numValueOf = Integer.valueOf(oVar.f42807m);
        Integer numValueOf2 = Integer.valueOf(oVar2.f42807m);
        w1 w1Var = w1.f47340a;
        y yVarB = yVarC.b(numValueOf, numValueOf2, w1Var).a(oVar.f42808n, oVar2.f42808n).a(oVar.f42809o, oVar2.f42809o).b(Integer.valueOf(oVar.f42810p), Integer.valueOf(oVar2.f42810p), w1Var).c(oVar.f42811q, oVar2.f42811q).a(oVar.f42812r, oVar2.f42812r).c(oVar.f42804i, oVar2.f42804i).c(oVar.f42800e, oVar2.f42800e).c(oVar.f42802g, oVar2.f42802g).b(Integer.valueOf(oVar.l), Integer.valueOf(oVar2.l), w1Var);
        boolean z10 = oVar.f42815u;
        y yVarC2 = yVarB.c(z10, oVar2.f42815u);
        boolean z11 = oVar.f42816v;
        y yVarC3 = yVarC2.c(z11, oVar2.f42816v);
        if (z10 && z11) {
            yVarC3 = yVarC3.a(oVar.f42817w, oVar2.f42817w);
        }
        return yVarC3.e();
    }

    @Override // i2.n
    public final int a() {
        return this.f42814t;
    }

    @Override // i2.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (!this.f42813s && !Objects.equals(this.f42799d.f42643n, oVar.f42799d.f42643n)) {
            return false;
        }
        this.f42801f.getClass();
        return this.f42815u == oVar.f42815u && this.f42816v == oVar.f42816v;
    }
}
