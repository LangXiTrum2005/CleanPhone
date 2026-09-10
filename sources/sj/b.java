package sj;

import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.flutter.view.o;
import p1.b0;
import p1.k;
import qj.h;
import qj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends w implements o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f50255g;

    @Override // io.flutter.view.o
    public final void a() {
        ((b0) this.f49093e).f1(null);
        this.f50255g = true;
    }

    @Override // io.flutter.view.o
    public final void b() {
        if (this.f50255g) {
            ((b0) this.f49093e).f1(this.f49091c.getSurface());
            this.f50255g = false;
        }
    }

    @Override // qj.w
    public final h c(k kVar, TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer) {
        if (textureRegistry$SurfaceProducer == null) {
            throw new IllegalArgumentException("surfaceProducer cannot be null to create an ExoPlayerEventListener for TextureVideoPlayer.");
        }
        return new a(kVar, this.f49090b, textureRegistry$SurfaceProducer.handlesCropAndRotation());
    }

    @Override // qj.w
    public final void d() {
        super.d();
        this.f49091c.release();
    }
}
