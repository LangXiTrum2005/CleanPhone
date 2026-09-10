package r5;

import android.util.Log;
import android.view.Surface;
import app.rive.rive_native.RiveNativePluginKt;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextureRegistry$SurfaceProducer f49408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f49409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f49410d;

    public b(TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer, int i10, int i11) {
        this.f49408b = textureRegistry$SurfaceProducer;
        textureRegistry$SurfaceProducer.setSize(i10, i11);
        textureRegistry$SurfaceProducer.setCallback(this);
        Surface surface = textureRegistry$SurfaceProducer.getSurface();
        n.e(surface, "getSurface(...)");
        this.f49409c = surface;
        this.f49410d = RiveNativePluginKt.createRiveRenderer(surface, i10, i11);
    }

    @Override // io.flutter.view.o
    public final void a() {
        synchronized (this) {
            long j10 = this.f49410d;
            if (j10 != 0) {
                RiveNativePluginKt.markDestroyedRiveRenderer(j10);
            }
        }
    }

    @Override // io.flutter.view.o
    public final void b() {
        synchronized (this) {
            long j10 = this.f49410d;
            if (j10 != 0) {
                RiveNativePluginKt.markDestroyedRiveRenderer(j10);
            }
        }
        Surface surface = this.f49408b.getSurface();
        n.e(surface, "getSurface(...)");
        this.f49409c = surface;
    }

    public final void c() {
        synchronized (this) {
            long j10 = this.f49410d;
            if (j10 != 0) {
                RiveNativePluginKt.destroyRiveRenderer(j10);
                this.f49410d = 0L;
            }
            try {
                this.f49409c.release();
                this.f49408b.release();
            } catch (Exception e10) {
                Log.w("RiveNativePlugin", "release: error releasing surface: " + e10);
            }
        }
    }
}
