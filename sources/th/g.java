package th;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g extends FullScreenContentCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f50774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f50775b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f50774a = i10;
        this.f50775b = obj;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdClicked() {
        switch (this.f50774a) {
            case 0:
                super.onAdClicked();
                ((h) this.f50775b).f50777c.onAdClicked();
                break;
            case 1:
                super.onAdClicked();
                ((j) this.f50775b).f50783c.onAdClicked();
                break;
            case 2:
                super.onAdClicked();
                ((xh.d) this.f50775b).f53804c.onAdClicked();
                break;
            default:
                super.onAdClicked();
                ((xh.f) this.f50775b).f53809c.onAdClicked();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        switch (this.f50774a) {
            case 0:
                super.onAdDismissedFullScreenContent();
                ((h) this.f50775b).f50777c.onAdClosed();
                break;
            case 1:
                super.onAdDismissedFullScreenContent();
                ((j) this.f50775b).f50783c.onAdClosed();
                break;
            case 2:
                super.onAdDismissedFullScreenContent();
                ((xh.d) this.f50775b).f53804c.onAdClosed();
                break;
            default:
                super.onAdDismissedFullScreenContent();
                ((xh.f) this.f50775b).f53809c.onAdClosed();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        switch (this.f50774a) {
            case 0:
                super.onAdFailedToShowFullScreenContent(adError);
                ((h) this.f50775b).f50777c.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
            case 1:
                super.onAdFailedToShowFullScreenContent(adError);
                ((j) this.f50775b).f50783c.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
            case 2:
                super.onAdFailedToShowFullScreenContent(adError);
                ((xh.d) this.f50775b).f53804c.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
            default:
                super.onAdFailedToShowFullScreenContent(adError);
                ((xh.f) this.f50775b).f53809c.onAdFailedToShow(adError.getCode(), adError.toString());
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdImpression() {
        switch (this.f50774a) {
            case 0:
                super.onAdImpression();
                ((h) this.f50775b).f50777c.onAdImpression();
                break;
            case 1:
                super.onAdImpression();
                ((j) this.f50775b).f50783c.onAdImpression();
                break;
            case 2:
                super.onAdImpression();
                ((xh.d) this.f50775b).f53804c.onAdImpression();
                break;
            default:
                super.onAdImpression();
                ((xh.f) this.f50775b).f53809c.onAdImpression();
                break;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        switch (this.f50774a) {
            case 0:
                super.onAdShowedFullScreenContent();
                ((h) this.f50775b).f50777c.onAdOpened();
                break;
            case 1:
                super.onAdShowedFullScreenContent();
                ((j) this.f50775b).f50783c.onAdOpened();
                break;
            case 2:
                super.onAdShowedFullScreenContent();
                ((xh.d) this.f50775b).f53804c.onAdOpened();
                break;
            default:
                super.onAdShowedFullScreenContent();
                ((xh.f) this.f50775b).f53809c.onAdOpened();
                break;
        }
    }
}
