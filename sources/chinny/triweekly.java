package chinny;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: RoundedCornerTreatment.java */
/* JADX INFO: loaded from: classes3.dex */
public class triweekly extends marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f15608attabal = -1.0f;

    @Override // chinny.marial
    public void attabal(monoploid monoploidVar, float f, float f2, float f3) {
        float f4 = f3 * f2;
        monoploidVar.kowloon(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 180.0f, 180.0f - f);
        float f5 = f4 * 2.0f;
        monoploidVar.attabal(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f5, f5, 180.0f, f);
    }
}
