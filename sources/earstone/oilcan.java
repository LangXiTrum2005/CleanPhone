package earstone;

import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;

/* JADX INFO: compiled from: VelocityTracker1D.java */
/* JADX INFO: loaded from: classes.dex */
public class oilcan {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public long[] f25536attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public float[] f25538saneness = new float[20];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f25537dern = 0;

    public oilcan() {
        long[] jArr = new long[20];
        this.f25536attabal = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    public void attabal(long j, float f) {
        int i = (this.f25537dern + 1) % 20;
        this.f25537dern = i;
        this.f25536attabal[i] = j;
        this.f25538saneness[i] = f;
    }

    public final float dern(float f) {
        return (float) (((double) Math.signum(f)) * Math.sqrt(Math.abs(f) * 2.0f));
    }

    public float saneness() {
        float fDern;
        int i = this.f25537dern;
        if (i == 0 && this.f25536attabal[i] == Long.MIN_VALUE) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        long j = this.f25536attabal[i];
        int i2 = 0;
        long j2 = j;
        while (true) {
            long j3 = this.f25536attabal[i];
            if (j3 == Long.MIN_VALUE) {
                break;
            }
            float f = j - j3;
            float fAbs = Math.abs(j3 - j2);
            if (f > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i == 0) {
                i = 20;
            }
            i--;
            i2++;
            if (i2 >= 20) {
                break;
            }
            j2 = j3;
        }
        if (i2 < 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (i2 == 2) {
            int i3 = this.f25537dern;
            int i4 = i3 == 0 ? 19 : i3 - 1;
            long[] jArr = this.f25536attabal;
            float f2 = jArr[i3] - jArr[i4];
            if (f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            float[] fArr = this.f25538saneness;
            fDern = (fArr[i3] - fArr[i4]) / f2;
        } else {
            int i5 = this.f25537dern;
            int i6 = ((i5 - i2) + 21) % 20;
            int i7 = (i5 + 21) % 20;
            long j4 = this.f25536attabal[i6];
            float f3 = this.f25538saneness[i6];
            int i8 = i6 + 1;
            float fDern2 = 0.0f;
            for (int i9 = i8 % 20; i9 != i7; i9 = (i9 + 1) % 20) {
                long j5 = this.f25536attabal[i9];
                float f4 = j5 - j4;
                if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f5 = this.f25538saneness[i9];
                    float f6 = (f5 - f3) / f4;
                    fDern2 += (f6 - dern(fDern2)) * Math.abs(f6);
                    if (i9 == i8) {
                        fDern2 *= 0.5f;
                    }
                    f3 = f5;
                    j4 = j5;
                }
            }
            fDern = dern(fDern2);
        }
        return fDern * 1000.0f;
    }
}
