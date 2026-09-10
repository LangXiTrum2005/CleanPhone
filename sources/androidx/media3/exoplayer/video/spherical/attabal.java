package androidx.media3.exoplayer.video.spherical;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import com.unity3d.services.UnityAdsConstants;
import harlequinade.dern;

/* JADX INFO: compiled from: OrientationListener.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal implements SensorEventListener {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public boolean f12978adultoid;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final InterfaceC0093attabal[] f12980graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final Display f12982molybdenite;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final float[] f12981kowloon = new float[16];

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final float[] f12979arytenoidectomy = new float[16];

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final float[] f12983monoploid = new float[16];

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final float[] f12984polloi = new float[3];

    /* JADX INFO: renamed from: androidx.media3.exoplayer.video.spherical.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: OrientationListener.java */
    public interface InterfaceC0093attabal {
        void attabal(float[] fArr, float f);
    }

    public attabal(Display display, InterfaceC0093attabal... interfaceC0093attabalArr) {
        this.f12982molybdenite = display;
        this.f12980graveside = interfaceC0093attabalArr;
    }

    public static void marial(float[] fArr) {
        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final float attabal(float[] fArr) {
        SensorManager.remapCoordinateSystem(fArr, 1, 131, this.f12979arytenoidectomy);
        SensorManager.getOrientation(this.f12979arytenoidectomy, this.f12984polloi);
        return this.f12984polloi[2];
    }

    public final void dern(float[] fArr) {
        if (!this.f12978adultoid) {
            dern.attabal(this.f12983monoploid, fArr);
            this.f12978adultoid = true;
        }
        float[] fArr2 = this.f12979arytenoidectomy;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        Matrix.multiplyMM(fArr, 0, this.f12979arytenoidectomy, 0, this.f12983monoploid, 0);
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        SensorManager.getRotationMatrixFromVector(this.f12981kowloon, sensorEvent.values);
        wireman(this.f12981kowloon, this.f12982molybdenite.getRotation());
        float fAttabal = attabal(this.f12981kowloon);
        marial(this.f12981kowloon);
        dern(this.f12981kowloon);
        saneness(this.f12981kowloon, fAttabal);
    }

    public final void saneness(float[] fArr, float f) {
        for (InterfaceC0093attabal interfaceC0093attabal : this.f12980graveside) {
            interfaceC0093attabal.attabal(fArr, f);
        }
    }

    public final void wireman(float[] fArr, int i) {
        if (i != 0) {
            int i2 = 129;
            int i3 = 1;
            if (i == 1) {
                i3 = 129;
                i2 = 2;
            } else if (i == 2) {
                i3 = 130;
            } else {
                if (i != 3) {
                    throw new IllegalStateException();
                }
                i2 = 130;
            }
            float[] fArr2 = this.f12979arytenoidectomy;
            System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            SensorManager.remapCoordinateSystem(this.f12979arytenoidectomy, i2, i3, fArr);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }
}
