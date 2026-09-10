package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.formats.zzf;
import com.google.android.gms.ads.formats.zzg;
import com.google.android.gms.ads.formats.zzi;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.internal.ads.zzbgr;

/* JADX INFO: loaded from: classes2.dex */
public final class mp0 extends AdListener implements zzi, zzg, zzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f4718a;
    public final MediationNativeListener b;

    public mp0(AbstractAdViewAdapter abstractAdViewAdapter, MediationNativeListener mediationNativeListener) {
        this.f4718a = abstractAdViewAdapter;
        this.b = mediationNativeListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.b.onAdClicked(this.f4718a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.b.onAdClosed(this.f4718a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.onAdFailedToLoad(this.f4718a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdImpression() {
        this.b.onAdImpression(this.f4718a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.b.onAdOpened(this.f4718a);
    }

    @Override // com.google.android.gms.ads.formats.zzi
    public final void zza(UnifiedNativeAd unifiedNativeAd) {
        C3119bp0 c3119bp0 = new C3119bp0();
        c3119bp0.setHeadline(unifiedNativeAd.zzh());
        c3119bp0.setImages(unifiedNativeAd.zzk());
        c3119bp0.setBody(unifiedNativeAd.zzf());
        c3119bp0.setIcon(unifiedNativeAd.zzb());
        c3119bp0.setCallToAction(unifiedNativeAd.zzg());
        c3119bp0.setAdvertiser(unifiedNativeAd.zze());
        c3119bp0.setStarRating(unifiedNativeAd.zzc());
        c3119bp0.setStore(unifiedNativeAd.zzj());
        c3119bp0.setPrice(unifiedNativeAd.zzi());
        c3119bp0.zzd(unifiedNativeAd.zzd());
        c3119bp0.setOverrideImpressionRecording(true);
        c3119bp0.setOverrideClickHandling(true);
        c3119bp0.zze(unifiedNativeAd.zza());
        this.b.onAdLoaded(this.f4718a, c3119bp0);
    }

    @Override // com.google.android.gms.ads.formats.zzf
    public final void zzb(zzbgr zzbgrVar, String str) {
        this.b.zze(this.f4718a, zzbgrVar, str);
    }

    @Override // com.google.android.gms.ads.formats.zzg
    public final void zzc(zzbgr zzbgrVar) {
        this.b.zzd(this.f4718a, zzbgrVar);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
    }
}
