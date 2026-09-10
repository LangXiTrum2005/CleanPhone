package androidx.media3.exoplayer.video.spherical;

import A.I0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes.dex */
public final class SphericalGLSurfaceView extends GLSurfaceView {
    public final CopyOnWriteArrayList e0;
    public final SensorManager f0;
    public final Sensor g0;
    public final OrientationListener h0;
    public final Handler i0;
    public final SceneRenderer j0;
    public SurfaceTexture k0;
    public Surface l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;

    public final class Renderer implements GLSurfaceView.Renderer, TouchTracker.Listener, OrientationListener.Listener {
        public final SceneRenderer X;
        public final float[] e0;
        public final float[] f0;
        public final float[] g0;
        public float h0;
        public float i0;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final float[] f6694Y = new float[16];
        public final float[] Z = new float[16];
        public final float[] j0 = new float[16];
        public final float[] k0 = new float[16];

        public Renderer(SceneRenderer sceneRenderer) {
            float[] fArr = new float[16];
            this.e0 = fArr;
            float[] fArr2 = new float[16];
            this.f0 = fArr2;
            float[] fArr3 = new float[16];
            this.g0 = fArr3;
            this.X = sceneRenderer;
            Matrix.setIdentityM(fArr, 0);
            Matrix.setIdentityM(fArr2, 0);
            Matrix.setIdentityM(fArr3, 0);
            this.i0 = 3.1415927f;
        }

        @Override // androidx.media3.exoplayer.video.spherical.OrientationListener.Listener
        public final synchronized void a(float[] fArr, float f) {
            float[] fArr2 = this.e0;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            float f2 = -f;
            this.i0 = f2;
            Matrix.setRotateM(this.f0, 0, -this.h0, (float) Math.cos(f2), (float) Math.sin(this.i0), 0.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onDrawFrame(GL10 gl10) {
            float[] fArr;
            Object objD;
            synchronized (this) {
                Matrix.multiplyMM(this.k0, 0, this.e0, 0, this.g0, 0);
                Matrix.multiplyMM(this.j0, 0, this.f0, 0, this.k0, 0);
            }
            Matrix.multiplyMM(this.Z, 0, this.f6694Y, 0, this.j0, 0);
            SceneRenderer sceneRenderer = this.X;
            float[] fArr2 = this.Z;
            GLES20.glClear(16384);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e2) {
                Log.d("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (sceneRenderer.X.compareAndSet(true, false)) {
                SurfaceTexture surfaceTexture = sceneRenderer.k0;
                surfaceTexture.getClass();
                surfaceTexture.updateTexImage();
                try {
                    GlUtil.b();
                } catch (GlUtil.GlException e3) {
                    Log.d("SceneRenderer", "Failed to draw a frame", e3);
                }
                if (sceneRenderer.f6693Y.compareAndSet(true, false)) {
                    Matrix.setIdentityM(sceneRenderer.h0, 0);
                }
                long timestamp = sceneRenderer.k0.getTimestamp();
                TimedValueQueue timedValueQueue = sceneRenderer.f0;
                synchronized (timedValueQueue) {
                    objD = timedValueQueue.d(timestamp, false);
                }
                Long l2 = (Long) objD;
                if (l2 != null) {
                    FrameRotationQueue frameRotationQueue = sceneRenderer.e0;
                    float[] fArr3 = sceneRenderer.h0;
                    float[] fArr4 = (float[]) frameRotationQueue.f6675c.f(l2.longValue());
                    if (fArr4 != null) {
                        float f = fArr4[0];
                        float f2 = -fArr4[1];
                        float f3 = -fArr4[2];
                        float length = Matrix.length(f, f2, f3);
                        float[] fArr5 = frameRotationQueue.f6674b;
                        if (length != 0.0f) {
                            Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                        } else {
                            Matrix.setIdentityM(fArr5, 0);
                        }
                        if (!frameRotationQueue.d) {
                            FrameRotationQueue.a(frameRotationQueue.f6673a, frameRotationQueue.f6674b);
                            frameRotationQueue.d = true;
                        }
                        Matrix.multiplyMM(fArr3, 0, frameRotationQueue.f6673a, 0, frameRotationQueue.f6674b, 0);
                    }
                }
                Projection projection = (Projection) sceneRenderer.g0.f(timestamp);
                if (projection != null) {
                    ProjectionRenderer projectionRenderer = sceneRenderer.Z;
                    projectionRenderer.getClass();
                    if (ProjectionRenderer.b(projection)) {
                        projectionRenderer.f6685a = projection.f6679c;
                        projectionRenderer.f6686b = new ProjectionRenderer.MeshData(projection.f6677a.f6680a[0]);
                        if (!projection.d) {
                            new ProjectionRenderer.MeshData(projection.f6678b.f6680a[0]);
                        }
                    }
                }
            }
            Matrix.multiplyMM(sceneRenderer.i0, 0, fArr2, 0, sceneRenderer.h0, 0);
            ProjectionRenderer projectionRenderer2 = sceneRenderer.Z;
            int i2 = sceneRenderer.j0;
            float[] fArr6 = sceneRenderer.i0;
            ProjectionRenderer.MeshData meshData = projectionRenderer2.f6686b;
            if (meshData == null) {
                return;
            }
            int i3 = projectionRenderer2.f6685a;
            if (i3 == 1) {
                fArr = ProjectionRenderer.j;
            } else {
                fArr = i3 == 2 ? ProjectionRenderer.k : ProjectionRenderer.f6684i;
            }
            GLES20.glUniformMatrix3fv(projectionRenderer2.f6688e, 1, false, fArr, 0);
            GLES20.glUniformMatrix4fv(projectionRenderer2.d, 1, false, fArr6, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i2);
            GLES20.glUniform1i(projectionRenderer2.f6689h, 0);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e4) {
                android.util.Log.e("ProjectionRenderer", "Failed to bind uniforms", e4);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.f, 3, 5126, false, 12, (Buffer) meshData.f6691b);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e5) {
                android.util.Log.e("ProjectionRenderer", "Failed to load position data", e5);
            }
            GLES20.glVertexAttribPointer(projectionRenderer2.g, 2, 5126, false, 8, (Buffer) meshData.f6692c);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e6) {
                android.util.Log.e("ProjectionRenderer", "Failed to load texture data", e6);
            }
            GLES20.glDrawArrays(meshData.d, 0, meshData.f6690a);
            try {
                GlUtil.b();
            } catch (GlUtil.GlException e7) {
                android.util.Log.e("ProjectionRenderer", "Failed to render", e7);
            }
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
            float f = i2 / i3;
            Matrix.perspectiveM(this.f6694Y, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            SphericalGLSurfaceView sphericalGLSurfaceView = SphericalGLSurfaceView.this;
            sphericalGLSurfaceView.i0.post(new I0(14, sphericalGLSurfaceView, this.X.b()));
        }
    }

    public interface VideoSurfaceListener {
        void r(Surface surface);

        void u();
    }

    public SphericalGLSurfaceView(Context context) {
        super(context, null);
        this.e0 = new CopyOnWriteArrayList();
        this.i0 = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f0 = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.g0 = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        SceneRenderer sceneRenderer = new SceneRenderer();
        this.j0 = sceneRenderer;
        Renderer renderer = new Renderer(sceneRenderer);
        View.OnTouchListener touchTracker = new TouchTracker(context, renderer);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.h0 = new OrientationListener(windowManager.getDefaultDisplay(), touchTracker, renderer);
        this.m0 = true;
        setEGLContextClientVersion(2);
        setRenderer(renderer);
        setOnTouchListener(touchTracker);
    }

    public final void a() {
        boolean z2 = this.m0 && this.n0;
        Sensor sensor = this.g0;
        if (sensor == null || z2 == this.o0) {
            return;
        }
        OrientationListener orientationListener = this.h0;
        SensorManager sensorManager = this.f0;
        if (z2) {
            sensorManager.registerListener(orientationListener, sensor, 0);
        } else {
            sensorManager.unregisterListener(orientationListener);
        }
        this.o0 = z2;
    }

    public CameraMotionListener getCameraMotionListener() {
        return this.j0;
    }

    public VideoFrameMetadataListener getVideoFrameMetadataListener() {
        return this.j0;
    }

    public Surface getVideoSurface() {
        return this.l0;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i0.post(new Runnable() { // from class: androidx.media3.exoplayer.video.spherical.b
            @Override // java.lang.Runnable
            public final void run() {
                SphericalGLSurfaceView sphericalGLSurfaceView = this.X;
                Surface surface = sphericalGLSurfaceView.l0;
                if (surface != null) {
                    Iterator it = sphericalGLSurfaceView.e0.iterator();
                    while (it.hasNext()) {
                        ((SphericalGLSurfaceView.VideoSurfaceListener) it.next()).u();
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.k0;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.k0 = null;
                sphericalGLSurfaceView.l0 = null;
            }
        });
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.n0 = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.n0 = true;
        a();
    }

    public void setDefaultStereoMode(int i2) {
        this.j0.l0 = i2;
    }

    public void setUseSensorRotation(boolean z2) {
        this.m0 = z2;
        a();
    }
}
