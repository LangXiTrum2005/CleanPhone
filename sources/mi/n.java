package mi;

import android.content.Context;
import android.graphics.Region;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import androidx.annotation.Nullable;
import io.flutter.embedding.engine.FlutterJNI;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class n extends SurfaceView implements io.flutter.embedding.engine.renderer.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f46035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f46036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f46037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f46038d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g0 f46039e;

    public n(Context context, boolean z10) {
        super(context, null);
        this.f46035a = false;
        this.f46036b = false;
        this.f46038d = false;
        g0 g0Var = new g0(new m(this), this, this.f46037c);
        this.f46039e = g0Var;
        if (z10) {
            getHolder().setFormat(-2);
            setZOrderOnTop(true);
        }
        this.f46038d = r9.b.p(getContext());
        getHolder().addCallback(g0Var);
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a(io.flutter.embedding.engine.renderer.h hVar) {
        io.flutter.embedding.engine.renderer.h hVar2 = this.f46037c;
        if (hVar2 != null) {
            hVar2.d();
        }
        this.f46037c = hVar;
        ((g0) this.f46039e.f46001d.f46523b).f45999b = hVar;
        resume();
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        if (this.f46037c == null) {
            Log.w("FlutterSurfaceView", "detachFromRenderer() invoked when no FlutterRenderer was attached.");
            return;
        }
        if (getWindowToken() != null) {
            io.flutter.embedding.engine.renderer.h hVar = this.f46037c;
            if (hVar == null) {
                throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
            }
            hVar.d();
        }
        ((g0) this.f46039e.f46001d.f46523b).f45999b = null;
        this.f46037c = null;
    }

    public final void c() {
        if (this.f46037c == null || getHolder() == null) {
            throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
        }
        io.flutter.embedding.engine.renderer.h hVar = this.f46037c;
        Surface surface = getHolder().getSurface();
        boolean z10 = this.f46036b;
        FlutterJNI flutterJNI = hVar.f43247a;
        if (!z10) {
            hVar.d();
        }
        hVar.f43249c = surface;
        if (z10) {
            flutterJNI.onSurfaceWindowChanged(surface);
        } else {
            flutterJNI.onSurfaceCreated(surface);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final boolean gatherTransparentRegion(Region region) {
        if (getAlpha() < 1.0f) {
            return false;
        }
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i10 = iArr[0];
        region.op(i10, iArr[1], (getRight() + i10) - getLeft(), (getBottom() + iArr[1]) - getTop(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    @Nullable
    public io.flutter.embedding.engine.renderer.h getAttachedRenderer() {
        return this.f46037c;
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (!this.f46038d) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        setMeasuredDimension(Math.max(View.MeasureSpec.getSize(i10), mode == 0 ? 1 : 0), Math.max(View.MeasureSpec.getSize(i11), View.MeasureSpec.getMode(i11) == 0 ? 1 : 0));
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void pause() {
        if (this.f46037c == null) {
            Log.w("FlutterSurfaceView", "pause() invoked when no FlutterRenderer was attached.");
        } else {
            this.f46036b = true;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void resume() {
        if (this.f46037c == null) {
            Log.w("FlutterSurfaceView", "resume() invoked when no FlutterRenderer was attached.");
            return;
        }
        n5.f fVar = this.f46039e.f46001d;
        if (this.f46035a) {
            c();
        }
        this.f46036b = false;
    }
}
