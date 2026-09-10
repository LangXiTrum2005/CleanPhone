package k3;

import i1.d0;
import i1.p;
import java.io.EOFException;
import l1.q;
import l1.y;
import n2.a0;
import n2.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f44301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f44302b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public m f44307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public p f44308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44309i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44304d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44305e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f44306f = y.f44831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f44303c = new q();

    public o(a0 a0Var, k kVar) {
        this.f44301a = a0Var;
        this.f44302b = kVar;
    }

    @Override // n2.a0
    public final void a(long j10, int i10, int i11, int i12, z zVar) {
        int i13;
        if (this.f44307g == null) {
            this.f44301a.a(j10, i10, i11, i12, zVar);
            return;
        }
        go.k.h("DRM on subtitles is not supported", zVar == null);
        int i14 = (this.f44305e - i12) - i11;
        try {
            i13 = i14;
            try {
                this.f44307g.e(this.f44306f, i13, i11, l.f44295c, new n(this, j10, i10));
            } catch (RuntimeException e10) {
                e = e10;
                RuntimeException runtimeException = e;
                if (!this.f44309i) {
                    throw runtimeException;
                }
                l1.a.t("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            }
        } catch (RuntimeException e11) {
            e = e11;
            i13 = i14;
        }
        int i15 = i13 + i11;
        this.f44304d = i15;
        if (i15 == this.f44305e) {
            this.f44304d = 0;
            this.f44305e = 0;
        }
    }

    @Override // n2.a0
    public final void b(p pVar) {
        pVar.f42643n.getClass();
        String str = pVar.f42643n;
        go.k.i(d0.h(str) == 3);
        boolean zEquals = pVar.equals(this.f44308h);
        k kVar = this.f44302b;
        if (!zEquals) {
            this.f44308h = pVar;
            this.f44307g = kVar.a(pVar) ? kVar.g(pVar) : null;
        }
        m mVar = this.f44307g;
        a0 a0Var = this.f44301a;
        if (mVar == null) {
            a0Var.b(pVar);
            return;
        }
        i1.o oVarA = pVar.a();
        oVarA.f42600m = d0.n("application/x-media3-cues");
        oVarA.f42598j = str;
        oVarA.f42605r = Long.MAX_VALUE;
        oVarA.K = kVar.h(pVar);
        q4.a.o(oVarA, a0Var);
    }

    @Override // n2.a0
    public final void d(q qVar, int i10, int i11) {
        if (this.f44307g == null) {
            this.f44301a.d(qVar, i10, i11);
            return;
        }
        h(i10);
        qVar.k(this.f44306f, this.f44305e, i10);
        this.f44305e += i10;
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) throws EOFException {
        if (this.f44307g == null) {
            return this.f44301a.f(iVar, i10, z10);
        }
        h(i10);
        int i11 = iVar.read(this.f44306f, this.f44305e, i10);
        if (i11 != -1) {
            this.f44305e += i11;
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(int i10) {
        int length = this.f44306f.length;
        int i11 = this.f44305e;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f44304d;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f44306f;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f44304d, bArr2, 0, i12);
        this.f44304d = 0;
        this.f44305e = i12;
        this.f44306f = bArr2;
    }
}
