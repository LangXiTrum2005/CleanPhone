package mi;

import android.content.Context;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p extends TextureView implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f46043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Surface f46044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46045e;

    public p(Context context) {
        super(context, null);
        this.f46041a = false;
        this.f46042b = false;
        this.f46045e = false;
        setSurfaceTextureListener(new o(this));
        this.f46045e = r9.b.p(getContext());
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f46043c;
        if (hVar2 != null) {
            hVar2.d();
        }
        this.f46043c = hVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f46043c == null) {
            Log.w("FlutterTextureView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f46043c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.d();
            Surface surface = this.f46044d;
            if (surface != null) {
                surface.release();
                this.f46044d = null;
            }
        }
        this.f46043c = null;
    }

    public final void c() {
        if (this.f46043c == null || getSurfaceTexture() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
        }
        Surface surface = this.f46044d;
        if (surface != null) {
            surface.release();
            this.f46044d = null;
        }
        Surface surface2 = new Surface(getSurfaceTexture());
        this.f46044d = surface2;
        io.flutter.embedding.engine.renderer.h hVar = this.f46043c;
        boolean z10 = this.f46042b;
        FlutterJNI flutterJNI = hVar.f43247a;
        if (!z10) {
            hVar.d();
        }
        hVar.f43249c = surface2;
        if (z10) {
            flutterJNI.onSurfaceWindowChanged(surface2);
        } else {
            flutterJNI.onSurfaceCreated(surface2);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    @Nullable
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f46043c;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f46045e) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i10), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i11), View.MeasureSpec.getMode(i11) == 0 ? 1 : 0));
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void pause() {
        if (this.f46043c == null) {
            Log.w("FlutterTextureView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f46042b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void resume() {
        if (this.f46043c == null) {
            Log.w("FlutterTextureView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (this.f46041a) {
            c();
        }
        this.f46042b = false;
    }

    public void setRenderSurface(Surface surface) {
        this.f46044d = surface;
    }
}
