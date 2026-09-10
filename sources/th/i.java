package th;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends RewardedAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50781b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f50780a = i10;
        this.f50781b = obj;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.f50780a) {
            case 0:
                super.onAdFailedToLoad(loadAdError);
                ((j) this.f50781b).f50783c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                ((xh.f) this.f50781b).f53809c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(RewardedAd rewardedAd) {
        switch (this.f50780a) {
            case 0:
                RewardedAd rewardedAd2 = rewardedAd;
                super.onAdLoaded(rewardedAd2);
                j jVar = (j) this.f50781b;
                jVar.f50783c.onAdLoaded();
                rewardedAd2.setFullScreenContentCallback(jVar.f50786f);
                jVar.f50782b.f50757b = rewardedAd2;
                ph.b bVar = jVar.f50763a;
                if (bVar != null) {
                    bVar.onAdLoaded();
                }
                break;
            default:
                RewardedAd rewardedAd3 = rewardedAd;
                super.onAdLoaded(rewardedAd3);
                xh.f fVar = (xh.f) this.f50781b;
                fVar.f53809c.onAdLoaded();
                rewardedAd3.setFullScreenContentCallback(fVar.f53812f);
                fVar.f53808b.f50757b = rewardedAd3;
                ph.b bVar2 = fVar.f50763a;
                if (bVar2 != null) {
                    bVar2.onAdLoaded();
                }
                break;
        }
    }
}
