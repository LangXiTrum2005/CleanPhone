package utwa;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: LottieTrace.java */
/* JADX INFO: loaded from: classes.dex */
public class impromptu {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final String[] f39261attabal = new String[5];

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final long[] f39263saneness = new long[5];

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f39262dern = 0;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public int f39264wireman = 0;

    public void attabal(String str) {
        int i = this.f39262dern;
        if (i == 5) {
            this.f39264wireman++;
            return;
        }
        this.f39261attabal[i] = str;
        this.f39263saneness[i] = System.nanoTime();
        claque.impassible.attabal(str);
        this.f39262dern++;
    }

    public float saneness(String str) {
        int i = this.f39264wireman;
        if (i > 0) {
            this.f39264wireman = i - 1;
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int i2 = this.f39262dern - 1;
        this.f39262dern = i2;
        if (i2 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f39261attabal[i2])) {
            claque.impassible.saneness();
            return (System.nanoTime() - this.f39263saneness[this.f39262dern]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f39261attabal[this.f39262dern] + ".");
    }
}
