package mi;

import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 implements SurfaceHolder.Callback2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f45998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f45999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f46000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n5.f f46001d;

    public g0(m mVar, n nVar, io.flutter.embedding.engine.renderer.h hVar) {
        new io.flutter.embedding.engine.renderer.a(this, 3);
        this.f46001d = new n5.f(this, 27);
        this.f46000c = mVar;
        this.f45999b = hVar;
        this.f45998a = nVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f46000c.surfaceChanged(surfaceHolder, i10, i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f46000c.surfaceCreated(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f46000c.surfaceDestroyed(surfaceHolder);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        io.flutter.embedding.engine.renderer.h hVar = this.f45999b;
        if (hVar == null) {
            return;
        }
        f0 f0Var = new f0(this, runnable);
        hVar.f43247a.addIsDisplayingFlutterUiListener(f0Var);
        if (hVar.f43250d) {
            f0Var.d();
        }
    }

    @Override // android.view.SurfaceHolder.Callback2
    public final void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }
}
