package h3;

import com.google.android.gms.internal.ads.y6;
import l1.y;
import n2.a0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f42098a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f42101d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f42102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f42103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f42104g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42105h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f42106i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i1.p f42107j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42109m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y6 f42099b = new y6(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1.q f42100c = new l1.q();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final l1.q f42108k = new l1.q(1);
    public final l1.q l = new l1.q();

    public f(a0 a0Var, r rVar, c cVar, i1.p pVar) {
        this.f42098a = a0Var;
        this.f42101d = rVar;
        this.f42102e = cVar;
        this.f42107j = pVar;
        this.f42101d = rVar;
        this.f42102e = cVar;
        a0Var.b(pVar);
        e();
    }

    public final int a() {
        int i10;
        if (this.f42109m) {
            i10 = this.f42099b.f22168i[this.f42103f] ? 1 : 0;
        } else {
            i10 = this.f42101d.f42203g[this.f42103f];
        }
        return b() != null ? 1073741824 | i10 : i10;
    }

    public final q b() {
        if (this.f42109m) {
            y6 y6Var = this.f42099b;
            c cVar = (c) y6Var.f22173o;
            String str = y.f44830a;
            int i10 = cVar.f42090a;
            q qVar = (q) y6Var.f22174p;
            if (qVar == null) {
                q[] qVarArr = this.f42101d.f42197a.l;
                qVar = qVarArr == null ? null : qVarArr[i10];
            }
            if (qVar != null && qVar.f42192a) {
                return qVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f42103f++;
        if (!this.f42109m) {
            return false;
        }
        int i10 = this.f42104g + 1;
        this.f42104g = i10;
        int[] iArr = this.f42099b.f22165f;
        int i11 = this.f42105h;
        if (i10 != iArr[i11]) {
            return true;
        }
        this.f42105h = i11 + 1;
        this.f42104g = 0;
        return false;
    }

    public final int d(int i10, int i11) {
        l1.q qVar;
        q qVarB = b();
        if (qVarB == null) {
            return 0;
        }
        int length = qVarB.f42195d;
        y6 y6Var = this.f42099b;
        if (length != 0) {
            qVar = (l1.q) y6Var.f22175q;
        } else {
            byte[] bArr = qVarB.f42196e;
            String str = y.f44830a;
            int length2 = bArr.length;
            l1.q qVar2 = this.l;
            qVar2.K(bArr, length2);
            length = bArr.length;
            qVar = qVar2;
        }
        boolean z10 = y6Var.f22169j && y6Var.f22170k[this.f42103f];
        boolean z11 = z10 || i11 != 0;
        l1.q qVar3 = this.f42108k;
        qVar3.f44813a[0] = (byte) ((z11 ? 128 : 0) | length);
        qVar3.M(0);
        a0 a0Var = this.f42098a;
        a0Var.d(qVar3, 1, 1);
        a0Var.d(qVar, length, 1);
        if (!z11) {
            return length + 1;
        }
        l1.q qVar4 = this.f42100c;
        if (!z10) {
            qVar4.J(8);
            byte[] bArr2 = qVar4.f44813a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i11 & 255);
            bArr2[4] = (byte) ((i10 >> 24) & 255);
            bArr2[5] = (byte) ((i10 >> 16) & 255);
            bArr2[6] = (byte) ((i10 >> 8) & 255);
            bArr2[7] = (byte) (i10 & 255);
            a0Var.d(qVar4, 8, 1);
            return length + 9;
        }
        l1.q qVar5 = (l1.q) y6Var.f22175q;
        int iG = qVar5.G();
        qVar5.N(-2);
        int i12 = (iG * 6) + 2;
        if (i11 != 0) {
            qVar4.J(i12);
            byte[] bArr3 = qVar4.f44813a;
            qVar5.k(bArr3, 0, i12);
            int i13 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i11;
            bArr3[2] = (byte) ((i13 >> 8) & 255);
            bArr3[3] = (byte) (i13 & 255);
        } else {
            qVar4 = qVar5;
        }
        a0Var.d(qVar4, i12, 1);
        return length + 1 + i12;
    }

    public final void e() {
        y6 y6Var = this.f42099b;
        y6Var.f22162c = 0;
        y6Var.f22171m = 0L;
        y6Var.f22172n = false;
        y6Var.f22169j = false;
        y6Var.l = false;
        y6Var.f22174p = null;
        this.f42103f = 0;
        this.f42105h = 0;
        this.f42104g = 0;
        this.f42106i = 0;
        this.f42109m = false;
    }
}
