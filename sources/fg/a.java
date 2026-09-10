package fg;

import android.graphics.SurfaceTexture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f40812a;

    public a(b bVar) {
        this.f40812a = bVar;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        b.f40813j.c("New frame available");
        synchronized (this.f40812a.f40822i) {
            try {
                b bVar = this.f40812a;
                if (bVar.f40821h) {
                    throw new RuntimeException("mFrameAvailable already set, frame could be dropped");
                }
                bVar.f40821h = true;
                bVar.f40822i.notifyAll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
