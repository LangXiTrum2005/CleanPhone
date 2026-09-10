package lh;

import com.ironsource.Bb;
import com.unity3d.ironsourceads.banner.BannerAdLoader;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoader;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoader;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bb f45334b;

    public /* synthetic */ a(Bb bb2, int i10) {
        this.f45333a = i10;
        this.f45334b = bb2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f45333a;
        Bb bb2 = this.f45334b;
        switch (i10) {
            case 0:
                BannerAdLoader.a(bb2);
                break;
            case 1:
                InterstitialAdLoader.a(bb2);
                break;
            default:
                RewardedAdLoader.a(bb2);
                break;
        }
    }
}
