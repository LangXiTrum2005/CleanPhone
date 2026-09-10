package p0;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f47880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f47881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f47882e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f47883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f47884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f47885h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f47886i;

    public final float a(long j10) {
        long j11 = this.f47882e;
        if (j10 < j11) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        long j12 = this.f47884g;
        if (j12 < 0 || j10 < j12) {
            return c.b((j10 - j11) / this.f47878a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
        }
        float f10 = this.f47885h;
        return (c.b((j10 - j12) / this.f47886i, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * f10) + (1.0f - f10);
    }
}
