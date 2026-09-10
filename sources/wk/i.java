package wk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f53315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f53316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i10) {
        super(0);
        this.f53315e = i10;
        this.f53316f = jVar;
    }

    @Override // jk.a
    public final Object invoke() {
        switch (this.f53315e) {
            case 0:
                return m.f53373k.c(this.f53316f.f53327b);
            default:
                return m.f53373k.c(this.f53316f.f53326a);
        }
    }
}
