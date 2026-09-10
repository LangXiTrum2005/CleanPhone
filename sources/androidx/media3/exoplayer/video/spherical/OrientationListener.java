package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;

/* JADX INFO: loaded from: classes.dex */
final class OrientationListener implements SensorEventListener {
    public final float[] X = new float[16];

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final float[] f6676Y = new float[16];
    public final float[] Z = new float[16];
    public final float[] e0 = new float[3];
    public final Display f0;
    public final Listener[] g0;
    public boolean h0;

    public interface Listener {
        void a(float[] fArr, float f);
    }

    public OrientationListener(Display display, Listener... listenerArr) {
        this.f0 = display;
        this.g0 = listenerArr;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i2;
        float[] fArr = sensorEvent.values;
        float[] fArr2 = this.X;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f0.getRotation();
        float[] fArr3 = this.f6676Y;
        if (rotation != 0) {
            int i3 = 129;
            if (rotation != 1) {
                i2 = 130;
                if (rotation != 2) {
                    if (rotation != 3) {
                        throw new IllegalStateException();
                    }
                    i3 = 130;
                    i2 = 1;
                }
            } else {
                i2 = 129;
                i3 = 2;
            }
            System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
            SensorManager.remapCoordinateSystem(fArr3, i3, i2, fArr2);
        }
        SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
        float[] fArr4 = this.e0;
        SensorManager.getOrientation(fArr3, fArr4);
        float f = fArr4[2];
        Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
        boolean z2 = this.h0;
        float[] fArr5 = this.Z;
        if (!z2) {
            FrameRotationQueue.a(fArr5, fArr2);
            this.h0 = true;
        }
        System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
        Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
        for (Listener listener : this.g0) {
            listener.a(fArr2, f);
        }
    }
}
