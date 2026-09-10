package androidx.media3.exoplayer.video.spherical;

import android.opengl.Matrix;
import androidx.media3.common.util.TimedValueQueue;

/* JADX INFO: loaded from: classes.dex */
final class FrameRotationQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f6673a = new float[16];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f6674b = new float[16];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimedValueQueue f6675c = new TimedValueQueue();
    public boolean d;

    public static void a(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        float f3 = fArr2[10] / fSqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3;
    }
}
