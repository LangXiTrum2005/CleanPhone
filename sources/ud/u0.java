package ud;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements wd.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd.c f52161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd.c f52162c;

    public /* synthetic */ u0(wd.c cVar, wd.c cVar2, int i10) {
        this.f52160a = i10;
        this.f52161b = cVar;
        this.f52162c = cVar2;
    }

    @Override // vj.a
    public final Object get() {
        switch (this.f52160a) {
            case 0:
                return new t0((g1) this.f52161b.get(), (h1) this.f52162c.get());
            default:
                return new xd.j((xd.o) this.f52161b.get(), (xd.o) this.f52162c.get());
        }
    }
}
