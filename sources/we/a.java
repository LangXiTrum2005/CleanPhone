package we;

import com.ironsource.mediationsdk.ads.nativead.LevelPlayNativeAd;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LevelPlayNativeAd f53173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdInfo f53174c;

    public /* synthetic */ a(LevelPlayNativeAd levelPlayNativeAd, AdInfo adInfo, int i10) {
        this.f53172a = i10;
        this.f53173b = levelPlayNativeAd;
        this.f53174c = adInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53172a) {
            case 0:
                LevelPlayNativeAd.a(this.f53173b, this.f53174c);
                break;
            default:
                LevelPlayNativeAd.b(this.f53173b, this.f53174c);
                break;
        }
    }
}
