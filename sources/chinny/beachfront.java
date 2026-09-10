package chinny;

import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: CutCornerTreatment.java */
/* JADX INFO: loaded from: classes3.dex */
public class beachfront extends marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public float f15459attabal = -1.0f;

    @Override // chinny.marial
    public void attabal(monoploid monoploidVar, float f, float f2, float f3) {
        float f4 = f3 * f2;
        monoploidVar.kowloon(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 180.0f, 180.0f - f);
        double d = f4;
        monoploidVar.impassible((float) (Math.sin(Math.toRadians(f)) * d), (float) (Math.sin(Math.toRadians(90.0f - f)) * d));
    }
}
