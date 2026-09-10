package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;
import com.facebook.ads.AdListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd;
import com.google.android.gms.ads.AdError;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4880vt implements AdListener, NativeAdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f5160a;
    public final NativeAdBase b;
    public final /* synthetic */ FacebookRtbNativeAd c;

    public C4880vt(FacebookRtbNativeAd facebookRtbNativeAd, Context context, NativeAdBase nativeAdBase) {
        this.c = facebookRtbNativeAd;
        this.b = nativeAdBase;
        this.f5160a = new WeakReference(context);
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(com.facebook.ads.Ad ad) {
        FacebookRtbNativeAd facebookRtbNativeAd = this.c;
        facebookRtbNativeAd.d.reportAdClicked();
        facebookRtbNativeAd.d.onAdOpened();
        facebookRtbNativeAd.d.onAdLeftApplication();
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(com.facebook.ads.Ad ad) {
        NativeAdBase nativeAdBase = this.b;
        FacebookRtbNativeAd facebookRtbNativeAd = this.c;
        if (ad != nativeAdBase) {
            AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
            adError.getMessage();
            facebookRtbNativeAd.b.onFailure(adError);
            return;
        }
        Context context = (Context) this.f5160a.get();
        if (context != null) {
            facebookRtbNativeAd.mapNativeAd(context, new Wm0(this, 15));
            return;
        }
        AdError adError2 = new AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
        adError2.getMessage();
        facebookRtbNativeAd.b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(com.facebook.ads.Ad ad, com.facebook.ads.AdError adError) {
        AdError adError2 = FacebookMediationAdapter.getAdError(adError);
        adError2.getMessage();
        this.c.b.onFailure(adError2);
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(com.facebook.ads.Ad ad) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(com.facebook.ads.Ad ad) {
    }
}
