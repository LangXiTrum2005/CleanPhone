package inceptive;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: compiled from: ScarRewardedAdListener.java */
/* JADX INFO: loaded from: classes4.dex */
public class impromptu extends inceptive.saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final com.unity3d.scar.adapter.common.competently f28607dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f28609saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final RewardedAdLoadCallback f28610wireman = new attabal();

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final OnUserEarnedRewardListener f28608marial = new saneness();

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final FullScreenContentCallback f28606beachfront = new dern();

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class attabal extends RewardedAdLoadCallback {
        public attabal() {
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class dern extends FullScreenContentCallback {
        public dern() {
        }
    }

    /* JADX INFO: compiled from: ScarRewardedAdListener.java */
    public class saneness implements OnUserEarnedRewardListener {
        public saneness() {
        }
    }

    public impromptu(com.unity3d.scar.adapter.common.competently competentlyVar, competently competentlyVar2) {
        this.f28607dern = competentlyVar;
        this.f28609saneness = competentlyVar2;
    }

    public OnUserEarnedRewardListener dern() {
        return this.f28608marial;
    }

    public RewardedAdLoadCallback saneness() {
        return this.f28610wireman;
    }
}
