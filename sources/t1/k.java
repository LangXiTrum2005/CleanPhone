package t1;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends m implements s1.g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final n f50385h;

    public k(i1.p pVar, j0 j0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(pVar, j0Var, nVar, arrayList, list, list2);
        this.f50385h = nVar;
    }

    @Override // s1.g
    public final long A() {
        return this.f50385h.f50395d;
    }

    @Override // s1.g
    public final long B(long j10, long j11) {
        return this.f50385h.b(j10, j11);
    }

    @Override // t1.m
    public final String a() {
        return null;
    }

    @Override // t1.m
    public final j c() {
        return null;
    }

    @Override // s1.g
    public final long d(long j10, long j11) {
        return this.f50385h.e(j10, j11);
    }

    @Override // s1.g
    public final long g(long j10, long j11) {
        return this.f50385h.c(j10, j11);
    }

    @Override // s1.g
    public final long getTimeUs(long j10) {
        return this.f50385h.g(j10);
    }

    @Override // s1.g
    public final long h(long j10, long j11) {
        n nVar = this.f50385h;
        if (nVar.f50397f != null) {
            return C.TIME_UNSET;
        }
        long jB = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(jB, j10) + nVar.g(jB)) - nVar.f50400i;
    }

    @Override // s1.g
    public final j i(long j10) {
        return this.f50385h.h(this, j10);
    }

    @Override // s1.g
    public final long k(long j10, long j11) {
        return this.f50385h.f(j10, j11);
    }

    @Override // s1.g
    public final long q(long j10) {
        return this.f50385h.d(j10);
    }

    @Override // s1.g
    public final boolean z() {
        return this.f50385h.i();
    }

    @Override // t1.m
    public final s1.g b() {
        return this;
    }
}
