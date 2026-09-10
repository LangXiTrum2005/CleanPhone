package tb;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements tc.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r1.q f50709c = new r1.q(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final kd.d f50710d = new kd.d(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public tc.a f50711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile tc.b f50712b;

    public o(r1.q qVar, tc.b bVar) {
        this.f50711a = qVar;
        this.f50712b = bVar;
    }

    public final void a(tc.a aVar) {
        tc.b bVar;
        tc.b bVar2;
        tc.b bVar3 = this.f50712b;
        kd.d dVar = f50710d;
        if (bVar3 != dVar) {
            aVar.b(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f50712b;
            if (bVar != dVar) {
                bVar2 = bVar;
            } else {
                this.f50711a = new n(0, this.f50711a, aVar);
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            aVar.b(bVar);
        }
    }

    @Override // tc.b
    public final Object get() {
        return this.f50712b.get();
    }
}
