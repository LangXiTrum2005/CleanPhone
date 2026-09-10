package ramallah;

import android.content.Context;
import com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode;
import com.unity3d.services.UnityAdsConstants;
import utwa.arytenoidectomy;

/* JADX INFO: compiled from: SystemReducedMotionOption.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness implements attabal {
    @Override // ramallah.attabal
    public ReducedMotionMode attabal(Context context) {
        return (context == null || arytenoidectomy.beachfront(context) != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? ReducedMotionMode.STANDARD_MOTION : ReducedMotionMode.REDUCED_MOTION;
    }
}
