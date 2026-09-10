package mi;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class r implements io.flutter.embedding.engine.renderer.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f46047a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.mbridge.msdk.config.component.info.provider.subprovider.f f46048b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f46049c;

    public r(s sVar, io.flutter.embedding.engine.renderer.h hVar, com.mbridge.msdk.config.component.info.provider.subprovider.f fVar) {
        this.f46049c = sVar;
        this.f46047a = hVar;
        this.f46048b = fVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void d() {
        l lVar;
        this.f46047a.f43247a.removeIsDisplayingFlutterUiListener(this);
        this.f46048b.run();
        s sVar = this.f46049c;
        if ((sVar.f46055f instanceof l) || (lVar = sVar.f46054e) == null) {
            return;
        }
        lVar.b();
        l lVar2 = sVar.f46054e;
        if (lVar2 != null) {
            lVar2.f46027a.close();
            sVar.removeView(sVar.f46054e);
            sVar.f46054e = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void c() {
    }
}
