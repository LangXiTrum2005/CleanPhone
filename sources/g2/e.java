package g2;

import android.util.SparseArray;
import com.google.android.gms.internal.ads.q2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import eb.d0;
import i1.p;
import n2.a0;
import n2.t;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements n2.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final q2 f41355k = new q2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n2.k f41356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f41358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f41359d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f41360e = d.f41354a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d0 f41362g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f41363h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t f41364i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p[] f41365j;

    public e(n2.k kVar, int i10, p pVar) {
        this.f41356a = kVar;
        this.f41357b = i10;
        this.f41358c = pVar;
    }

    public final n2.g a() {
        t tVar = this.f41364i;
        if (tVar instanceof n2.g) {
            return (n2.g) tVar;
        }
        if (tVar instanceof f3.c) {
            return ((f3.c) tVar).f40541a;
        }
        return null;
    }

    public final void b(d0 d0Var, long j10, long j11) {
        this.f41362g = d0Var;
        this.f41363h = j11;
        boolean z10 = this.f41361f;
        n2.k kVar = this.f41356a;
        if (!z10) {
            kVar.c(this);
            if (j10 != C.TIME_UNSET) {
                kVar.seek(0L, j10);
            }
            this.f41361f = true;
            return;
        }
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        kVar.seek(0L, j10);
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.f41359d;
            if (i10 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i10);
            if (d0Var == null) {
                cVar.f41352f = cVar.f41349c;
            } else {
                cVar.f41353g = j11;
                a0 a0VarA1 = d0Var.a1(cVar.f41347a);
                cVar.f41352f = a0VarA1;
                p pVar = cVar.f41351e;
                if (pVar != null) {
                    a0VarA1.b(pVar);
                }
            }
            i10++;
        }
    }

    @Override // n2.m
    public final void endTracks() {
        SparseArray sparseArray = this.f41359d;
        p[] pVarArr = new p[sparseArray.size()];
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            p pVar = ((c) sparseArray.valueAt(i10)).f41351e;
            pVar.getClass();
            pVarArr[i10] = pVar;
        }
        this.f41365j = pVarArr;
    }

    @Override // n2.m
    public final a0 track(int i10, int i11) {
        SparseArray sparseArray = this.f41359d;
        c cVar = (c) sparseArray.get(i10);
        if (cVar == null) {
            go.k.t(this.f41365j == null);
            cVar = new c(i10, i11, i11 == this.f41357b ? this.f41358c : null, this.f41360e);
            d0 d0Var = this.f41362g;
            long j10 = this.f41363h;
            if (d0Var == null) {
                cVar.f41352f = cVar.f41349c;
            } else {
                cVar.f41353g = j10;
                a0 a0VarA1 = d0Var.a1(i11);
                cVar.f41352f = a0VarA1;
                p pVar = cVar.f41351e;
                if (pVar != null) {
                    a0VarA1.b(pVar);
                }
            }
            sparseArray.put(i10, cVar);
        }
        return cVar;
    }

    @Override // n2.m
    public final void u(t tVar) {
        this.f41364i = tVar;
    }
}
