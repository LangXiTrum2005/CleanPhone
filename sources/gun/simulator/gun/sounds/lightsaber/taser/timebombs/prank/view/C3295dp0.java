package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3295dp0 extends AdListener implements AppEventListener, zza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractAdViewAdapter f4294a;
    public final MediationBannerListener b;

    public C3295dp0(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.f4294a = abstractAdViewAdapter;
        this.b = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.b.onAdClicked(this.f4294a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.b.onAdClosed(this.f4294a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.onAdFailedToLoad(this.f4294a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.b.onAdLoaded(this.f4294a);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.b.onAdOpened(this.f4294a);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.b.zzb(this.f4294a, str, str2);
    }
}
