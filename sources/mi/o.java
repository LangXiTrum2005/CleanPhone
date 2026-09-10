package mi;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o implements TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f46040a;

    public o(p pVar) {
        this.f46040a = pVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        p pVar = this.f46040a;
        pVar.f46041a = true;
        if (pVar.f46043c == null || pVar.f46042b) {
            return;
        }
        pVar.c();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        p pVar = this.f46040a;
        pVar.f46041a = false;
        io.flutter.embedding.engine.renderer.h hVar = pVar.f46043c;
        if (hVar != null && !pVar.f46042b) {
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.d();
            Surface surface = pVar.f46044d;
            if (surface != null) {
                surface.release();
                pVar.f46044d = null;
            }
        }
        Surface surface2 = pVar.f46044d;
        if (surface2 == null) {
            return true;
        }
        surface2.release();
        pVar.f46044d = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        p pVar = this.f46040a;
        io.flutter.embedding.engine.renderer.h hVar = pVar.f46043c;
        if (hVar == null || pVar.f46042b) {
            return;
        }
        if (hVar == null) {
            throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
        }
        hVar.f43247a.onSurfaceChanged(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
