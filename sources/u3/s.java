package u3;

import com.google.android.gms.internal.ads.ga;
import l1.x;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f51851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1.q f51852b = new l1.q(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f51853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f51854d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f51855e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f51856f;

    public s(r rVar) {
        this.f51851a = rVar;
    }

    @Override // u3.v
    public final void a(x xVar, n2.m mVar, ga gaVar) {
        this.f51851a.a(xVar, mVar, gaVar);
        this.f51856f = true;
    }

    @Override // u3.v
    public final void b(int i10, l1.q qVar) {
        int iZ;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iZ = qVar.f44814b + qVar.z();
        } else {
            iZ = -1;
        }
        if (this.f51856f) {
            if (!z10) {
                return;
            }
            this.f51856f = false;
            qVar.M(iZ);
            this.f51854d = 0;
        }
        while (qVar.a() > 0) {
            int i11 = this.f51854d;
            l1.q qVar2 = this.f51852b;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iZ2 = qVar.z();
                    qVar.M(qVar.f44814b - 1);
                    if (iZ2 == 255) {
                        this.f51856f = true;
                        return;
                    }
                }
                int iMin = Math.min(qVar.a(), 3 - this.f51854d);
                qVar.k(qVar2.f44813a, this.f51854d, iMin);
                int i12 = this.f51854d + iMin;
                this.f51854d = i12;
                if (i12 == 3) {
                    qVar2.M(0);
                    qVar2.L(3);
                    qVar2.N(1);
                    int iZ3 = qVar2.z();
                    int iZ4 = qVar2.z();
                    this.f51855e = (iZ3 & 128) != 0;
                    int i13 = (((iZ3 & 15) << 8) | iZ4) + 3;
                    this.f51853c = i13;
                    byte[] bArr = qVar2.f44813a;
                    if (bArr.length < i13) {
                        qVar2.c(Math.min(4098, Math.max(i13, bArr.length * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(qVar.a(), this.f51853c - this.f51854d);
                qVar.k(qVar2.f44813a, this.f51854d, iMin2);
                int i14 = this.f51854d + iMin2;
                this.f51854d = i14;
                int i15 = this.f51853c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f51855e) {
                        qVar2.L(i15);
                    } else {
                        if (y.p(0, i15, -1, qVar2.f44813a) != 0) {
                            this.f51856f = true;
                            return;
                        }
                        qVar2.L(this.f51853c - 4);
                    }
                    qVar2.M(0);
                    this.f51851a.b(qVar2);
                    this.f51854d = 0;
                }
            }
        }
    }

    @Override // u3.v
    public final void seek() {
        this.f51856f = true;
    }
}
