package mi;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f0 implements io.flutter.embedding.engine.renderer.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f45996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f45997b;

    public f0(g0 g0Var, Runnable runnable) {
        this.f45997b = g0Var;
        this.f45996a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void d() {
        this.f45996a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f45997b.f45999b;
        if (hVar != null) {
            hVar.f43247a.removeIsDisplayingFlutterUiListener(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void c() {
    }
}
