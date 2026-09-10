package tl;

import com.google.android.gms.internal.ads.k3;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends zl.n {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l0 f51346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f51347f = new a(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zl.d f51348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zl.s f51349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte f51350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51351d;

    static {
        l0 l0Var = new l0();
        f51346e = l0Var;
        l0Var.f51349b = zl.r.f55077b;
    }

    public l0() {
        this.f51350c = (byte) -1;
        this.f51351d = -1;
        this.f51348a = zl.d.f55026a;
    }

    @Override // zl.a
    public final int d() {
        int i10 = this.f51351d;
        if (i10 != -1) {
            return i10;
        }
        int size = 0;
        for (int i11 = 0; i11 < this.f51349b.size(); i11++) {
            zl.d byteString = this.f51349b.getByteString(i11);
            size += byteString.size() + k3.g(byteString.size());
        }
        int size2 = this.f51348a.size() + this.f51349b.size() + size;
        this.f51351d = size2;
        return size2;
    }

    @Override // zl.a
    public final zl.i g() {
        m mVar = new m(3);
        mVar.f51354d = zl.r.f55077b;
        return mVar;
    }

    @Override // zl.a
    public final zl.i h() {
        m mVar = new m(3);
        mVar.f51354d = zl.r.f55077b;
        mVar.l(this);
        return mVar;
    }

    @Override // zl.a
    public final void i(k3 k3Var) throws IOException {
        d();
        for (int i10 = 0; i10 < this.f51349b.size(); i10++) {
            zl.d byteString = this.f51349b.getByteString(i10);
            k3Var.B(1, 2);
            k3Var.z(byteString.size());
            k3Var.v(byteString);
        }
        k3Var.v(this.f51348a);
    }

    @Override // zl.u
    public final boolean isInitialized() {
        if (this.f51350c == 1) {
            return true;
        }
        this.f51350c = (byte) 1;
        return true;
    }

    public l0(m mVar) {
        this.f51350c = (byte) -1;
        this.f51351d = -1;
        this.f51348a = mVar.f55044a;
    }

    public l0(zl.e eVar) {
        this.f51350c = (byte) -1;
        this.f51351d = -1;
        this.f51349b = zl.r.f55077b;
        zl.c cVar = new zl.c();
        k3 k3VarL = k3.l(cVar, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int iN = eVar.n();
                    if (iN != 0) {
                        if (iN != 10) {
                            if (!eVar.q(iN, k3VarL)) {
                            }
                        } else {
                            zl.t tVarE = eVar.e();
                            if (!z11) {
                                this.f51349b = new zl.r();
                                z11 = true;
                            }
                            this.f51349b.a(tVarE);
                        }
                    }
                    z10 = true;
                } catch (zl.q e10) {
                    e10.f55076a = this;
                    throw e10;
                } catch (IOException e11) {
                    zl.q qVar = new zl.q(e11.getMessage());
                    qVar.f55076a = this;
                    throw qVar;
                }
            } catch (Throwable th2) {
                if (z11) {
                    this.f51349b = this.f51349b.getUnmodifiableView();
                }
                try {
                    k3VarL.j();
                } catch (IOException unused) {
                } finally {
                    this.f51348a = cVar.h();
                }
                throw th2;
            }
        }
        if (z11) {
            this.f51349b = this.f51349b.getUnmodifiableView();
        }
        try {
            k3VarL.j();
        } catch (IOException unused2) {
        } finally {
            this.f51348a = cVar.h();
        }
    }
}
