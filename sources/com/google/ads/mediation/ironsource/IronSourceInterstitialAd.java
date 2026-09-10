package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceInterstitialAd implements MediationInterstitialAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> f18946arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MediationInterstitialAdCallback f18947kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final String f18948monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<IronSourceInterstitialAd>> f18945polloi = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final IronSourceInterstitialAdListener f18944molybdenite = new IronSourceInterstitialAdListener();

    public IronSourceInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback) {
        this.f18948monoploid = mediationInterstitialAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f18946arytenoidectomy = mediationAdLoadCallback;
    }

    public static IronSourceInterstitialAd attabal(String str) {
        ConcurrentHashMap<String, WeakReference<IronSourceInterstitialAd>> concurrentHashMap = f18945polloi;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    private void beachfront(AdError adError) {
        String str = IronSourceConstants.f18943attabal;
        adError.toString();
        MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback = this.f18946arytenoidectomy;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public static void competently(String str) {
        f18945polloi.remove(str);
    }

    public static IronSourceInterstitialAdListener dern() {
        return f18944molybdenite;
    }

    private boolean wireman(Context context) {
        AdError adErrorValidateIronSourceAdLoadParams = IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, this.f18948monoploid);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            beachfront(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.f18948monoploid, f18945polloi)) {
            return true;
        }
        beachfront(new AdError(103, String.format("An IronSource interstitial ad is already loading for instance ID: %s", this.f18948monoploid), "com.google.ads.mediation.ironsource"));
        return false;
    }

    public MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> getMediationAdLoadCallback() {
        return this.f18946arytenoidectomy;
    }

    public void impromptu(MediationInterstitialAdCallback mediationInterstitialAdCallback) {
        this.f18947kowloon = mediationInterstitialAdCallback;
    }

    public void loadWaterfallAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (marial(mediationInterstitialAdConfiguration)) {
            IronSource.loadISDemandOnlyInterstitial((Activity) mediationInterstitialAdConfiguration.getContext(), this.f18948monoploid);
        }
    }

    public final boolean marial(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        if (!wireman(mediationInterstitialAdConfiguration.getContext())) {
            return false;
        }
        f18945polloi.put(this.f18948monoploid, new WeakReference<>(this));
        String str = IronSourceConstants.f18943attabal;
        String.format("Loading IronSource interstitial ad with instance ID: %s", this.f18948monoploid);
        return true;
    }

    public MediationInterstitialAdCallback saneness() {
        return this.f18947kowloon;
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        IronSource.showISDemandOnlyInterstitial(this.f18948monoploid);
    }
}
