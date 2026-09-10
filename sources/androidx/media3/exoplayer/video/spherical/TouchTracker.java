package androidx.media3.exoplayer.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
final class TouchTracker extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, OrientationListener.Listener {
    public final Listener Z;
    public final GestureDetector f0;
    public final PointF X = new PointF();

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final PointF f6695Y = new PointF();
    public final float e0 = 25.0f;
    public volatile float g0 = 3.1415927f;

    public interface Listener {
    }

    public TouchTracker(Context context, Listener listener) {
        this.Z = listener;
        this.f0 = new GestureDetector(context, this);
    }

    @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
    public final void a(float[] fArr, float f) {
        this.g0 = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.X.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.X.x) / this.e0;
        float y = motionEvent2.getY();
        PointF pointF = this.X;
        float f3 = (y - pointF.y) / this.e0;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.g0;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f6695Y;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = (fCos * f3) + (fSin * x) + pointF2.y;
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        Listener listener = this.Z;
        PointF pointF3 = this.f6695Y;
        SphericalGLSurfaceView.Renderer renderer = (SphericalGLSurfaceView.Renderer) listener;
        synchronized (renderer) {
            float f5 = pointF3.y;
            renderer.h0 = f5;
            Matrix.setRotateM(renderer.f0, 0, -f5, (float) Math.cos(renderer.i0), (float) Math.sin(renderer.i0), 0.0f);
            Matrix.setRotateM(renderer.g0, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return SphericalGLSurfaceView.this.performClick();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f0.onTouchEvent(motionEvent);
    }
}
