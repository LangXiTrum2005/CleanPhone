package harlequinade;

import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil;
import com.unity3d.services.UnityAdsConstants;
import decarock.sealless;

/* JADX INFO: compiled from: FrameRotationQueue.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public boolean f27560wireman;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float[] f27557attabal = new float[16];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final float[] f27559saneness = new float[16];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final sealless<float[]> f27558dern = new sealless<>();

    public static void attabal(float[] fArr, float[] fArr2) {
        GlUtil.apical(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    public static void saneness(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            GlUtil.apical(fArr);
        }
    }

    public boolean dern(float[] fArr, long j) {
        float[] fArrCutely = this.f27558dern.cutely(j);
        if (fArrCutely == null) {
            return false;
        }
        saneness(this.f27559saneness, fArrCutely);
        if (!this.f27560wireman) {
            attabal(this.f27557attabal, this.f27559saneness);
            this.f27560wireman = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f27557attabal, 0, this.f27559saneness, 0);
        return true;
    }

    public void marial(long j, float[] fArr) {
        this.f27558dern.attabal(j, fArr);
    }

    public void wireman() {
        this.f27558dern.dern();
        this.f27560wireman = false;
    }
}
