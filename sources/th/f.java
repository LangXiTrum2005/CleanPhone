package th;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends InterstitialAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50773b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f50772a = i10;
        this.f50773b = obj;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        switch (this.f50772a) {
            case 0:
                super.onAdFailedToLoad(loadAdError);
                ((h) this.f50773b).f50777c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
            default:
                super.onAdFailedToLoad(loadAdError);
                ((xh.d) this.f50773b).f53804c.onAdFailedToLoad(loadAdError.getCode(), loadAdError.toString());
                break;
        }
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdLoaded(InterstitialAd interstitialAd) {
        switch (this.f50772a) {
            case 0:
                InterstitialAd interstitialAd2 = interstitialAd;
                super.onAdLoaded(interstitialAd2);
                h hVar = (h) this.f50773b;
                hVar.f50777c.onAdLoaded();
                interstitialAd2.setFullScreenContentCallback(hVar.f50779e);
                hVar.f50776b.f50757b = interstitialAd2;
                ph.b bVar = hVar.f50763a;
                if (bVar != null) {
                    bVar.onAdLoaded();
                }
                break;
            default:
                InterstitialAd interstitialAd3 = interstitialAd;
                super.onAdLoaded(interstitialAd3);
                xh.d dVar = (xh.d) this.f50773b;
                dVar.f53804c.onAdLoaded();
                interstitialAd3.setFullScreenContentCallback(dVar.f53806e);
                dVar.f53803b.f50757b = interstitialAd3;
                ph.b bVar2 = dVar.f50763a;
                if (bVar2 != null) {
                    bVar2.onAdLoaded();
                }
                break;
        }
    }
}
