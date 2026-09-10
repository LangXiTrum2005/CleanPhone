package tb;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements qc.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f50715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qc.c f50716b;

    public r(Set set, qc.c cVar) {
        this.f50715a = set;
        this.f50716b = cVar;
    }

    @Override // qc.c
    public final void a(qc.a aVar) {
        if (this.f50715a.contains(mb.b.class)) {
            this.f50716b.a(aVar);
            return;
        }
        throw new aa.b("Attempting to publish an undeclared event " + aVar + ".", 18);
    }
}
