package androidx.core.view;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: VelocityTrackerFallback.java */
/* JADX INFO: loaded from: classes.dex */
public class permissivist {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final float[] f9378attabal = new float[20];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long[] f9381saneness = new long[20];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public float f9379dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f9382wireman = 0;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public int f9380marial = 0;

    public static float beachfront(float f) {
        return (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f) * 2.0f));
    }

    public void attabal(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f9382wireman != 0 && eventTime - this.f9381saneness[this.f9380marial] > 40) {
            saneness();
        }
        int i = (this.f9380marial + 1) % 20;
        this.f9380marial = i;
        int i2 = this.f9382wireman;
        if (i2 != 20) {
            this.f9382wireman = i2 + 1;
        }
        this.f9378attabal[i] = motionEvent.getAxisValue(26);
        this.f9381saneness[this.f9380marial] = eventTime;
    }

    public void dern(int i, float f) {
        float fMarial = marial() * i;
        this.f9379dern = fMarial;
        if (fMarial < (-Math.abs(f))) {
            this.f9379dern = -Math.abs(f);
        } else if (this.f9379dern > Math.abs(f)) {
            this.f9379dern = Math.abs(f);
        }
    }

    public final float marial() {
        long[] jArr;
        long j;
        int i = this.f9382wireman;
        if (i < 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = this.f9380marial;
        int i3 = ((i2 + 20) - (i - 1)) % 20;
        long j2 = this.f9381saneness[i2];
        while (true) {
            jArr = this.f9381saneness;
            j = jArr[i3];
            if (j2 - j <= 100) {
                break;
            }
            this.f9382wireman--;
            i3 = (i3 + 1) % 20;
        }
        int i4 = this.f9382wireman;
        if (i4 < 2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        if (i4 == 2) {
            int i5 = (i3 + 1) % 20;
            long j3 = jArr[i5];
            return j == j3 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f9378attabal[i5] / (j3 - j);
        }
        float fAbs = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < this.f9382wireman - 1; i7++) {
            int i8 = i7 + i3;
            long[] jArr2 = this.f9381saneness;
            long j4 = jArr2[i8 % 20];
            int i9 = (i8 + 1) % 20;
            if (jArr2[i9] != j4) {
                i6++;
                float fBeachfront = beachfront(fAbs);
                float f = this.f9378attabal[i9] / (this.f9381saneness[i9] - j4);
                fAbs += (f - fBeachfront) * Math.abs(f);
                if (i6 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return beachfront(fAbs);
    }

    public final void saneness() {
        this.f9382wireman = 0;
        this.f9379dern = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public float wireman(int i) {
        return i != 26 ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f9379dern;
    }
}
