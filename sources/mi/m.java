package mi;

import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class m implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f46034a;

    public m(n nVar) {
        this.f46034a = nVar;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        n nVar = this.f46034a;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f46037c;
        if (hVar == null || nVar.f46036b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f43247a.onSurfaceChanged(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        n nVar = this.f46034a;
        nVar.f46035a = true;
        if (nVar.f46037c == null || nVar.f46036b) {
            return;
        }
        nVar.c();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        n nVar = this.f46034a;
        nVar.f46035a = false;
        io.flutter.embedding.engine.renderer.h hVar = nVar.f46037c;
        if (hVar == null || nVar.f46036b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
        }
        hVar.d();
    }
}
