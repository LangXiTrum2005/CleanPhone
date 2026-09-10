package ln;

import ak.k;
import hn.s;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f45621e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.f45621e = new AtomicReferenceArray(i.f45620f);
    }

    @Override // hn.s
    public final int g() {
        return i.f45620f;
    }

    @Override // hn.s
    public final void h(int i10, k kVar) {
        this.f45621e.set(i10, i.f45619e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f42455c + ", hashCode=" + hashCode() + ']';
    }
}
