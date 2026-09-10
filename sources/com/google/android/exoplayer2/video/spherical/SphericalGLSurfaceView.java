package com.google.android.exoplayer2.video.spherical;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.view.Surface;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {

    public final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            synchronized (this) {
                Matrix.multiplyMM(null, 0, null, 0, null, 0);
                Matrix.multiplyMM(null, 0, null, 0, null, 0);
            }
            Matrix.multiplyMM(null, 0, null, 0, null, 0);
            throw null;
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f = i2 / i3;
            Matrix.perspectiveM(null, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            throw null;
        }
    }

    public interface VideoSurfaceListener {
    }

    public CameraMotionListener getCameraMotionListener() {
        return null;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return null;
    }

    public Surface getVideoSurface() {
        return null;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        throw null;
    }

    public void setDefaultStereoMode(int i2) {
        throw null;
    }

    public void setUseSensorRotation(boolean z2) {
    }
}
