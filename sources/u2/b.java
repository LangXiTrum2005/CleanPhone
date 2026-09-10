package u2;

import com.google.android.gms.internal.ads.q2;
import n2.h;
import n2.k;
import n2.l;
import n2.m;
import n2.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f51673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f51674b;

    public b(int i10) {
        boolean z10 = (i10 & 1) != 0;
        this.f51674b = z10;
        if (z10) {
            this.f51673a = new v(-1, -1, "image/heif");
        } else {
            this.f51673a = new a();
        }
    }

    @Override // n2.k
    public final boolean a(l lVar) {
        return this.f51674b ? r9.b.z((h) lVar, false) : this.f51673a.a(lVar);
    }

    @Override // n2.k
    public final int b(l lVar, q2 q2Var) {
        return this.f51673a.b(lVar, q2Var);
    }

    @Override // n2.k
    public final void c(m mVar) {
        this.f51673a.c(mVar);
    }

    @Override // n2.k
    public final void release() {
        this.f51673a.release();
    }

    @Override // n2.k
    public final void seek(long j10, long j11) {
        this.f51673a.seek(j10, j11);
    }
}
