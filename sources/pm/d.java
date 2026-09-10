package pm;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f48414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qm.b f48415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sm.d f48416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sm.d f48417h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(m0 m0Var, qm.b bVar, sm.d dVar, sm.d dVar2) {
        super(0);
        this.f48414e = m0Var;
        this.f48415f = bVar;
        this.f48416g = dVar;
        this.f48417h = dVar2;
    }

    @Override // jk.a
    public final Object invoke() {
        return Boolean.valueOf(f.m(this.f48414e, this.f48415f.p(this.f48416g), this.f48417h));
    }
}
