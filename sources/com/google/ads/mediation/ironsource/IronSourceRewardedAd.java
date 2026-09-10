package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.ironsource.mediationsdk.IronSource;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceRewardedAd implements MediationRewardedAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> f18954arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MediationRewardedAdCallback f18955kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final String f18956monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<IronSourceRewardedAd>> f18953polloi = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final IronSourceRewardedAdListener f18952molybdenite = new IronSourceRewardedAdListener();

    public IronSourceRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback) {
        this.f18956monoploid = mediationRewardedAdConfiguration.getServerParameters().getString("instanceId", "0");
        this.f18954arytenoidectomy = mediationAdLoadCallback;
    }

    public static IronSourceRewardedAd attabal(String str) {
        ConcurrentHashMap<String, WeakReference<IronSourceRewardedAd>> concurrentHashMap = f18953polloi;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public static void competently(String str) {
        f18953polloi.remove(str);
    }

    public static IronSourceRewardedAdListener saneness() {
        return f18952molybdenite;
    }

    public final void beachfront(AdError adError) {
        String str = IronSourceConstants.f18943attabal;
        adError.toString();
        this.f18954arytenoidectomy.onFailure(adError);
    }

    public MediationRewardedAdCallback dern() {
        return this.f18955kowloon;
    }

    public MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> getMediationAdLoadCallback() {
        return this.f18954arytenoidectomy;
    }

    public void impromptu(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.f18955kowloon = mediationRewardedAdCallback;
    }

    public void loadWaterfallAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (marial(mediationRewardedAdConfiguration)) {
            IronSource.loadISDemandOnlyRewardedVideo((Activity) mediationRewardedAdConfiguration.getContext(), this.f18956monoploid);
        }
    }

    public final boolean marial(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        if (!wireman(mediationRewardedAdConfiguration.getContext())) {
            return false;
        }
        f18953polloi.put(this.f18956monoploid, new WeakReference<>(this));
        String str = IronSourceConstants.f18943attabal;
        String.format("Loading IronSource rewarded ad with instance ID: %s", this.f18956monoploid);
        return true;
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        String str = IronSourceConstants.f18943attabal;
        String.format("Showing IronSource rewarded ad for instance ID: %s", this.f18956monoploid);
        IronSource.showISDemandOnlyRewardedVideo(this.f18956monoploid);
    }

    public final boolean wireman(Context context) {
        AdError adErrorValidateIronSourceAdLoadParams = IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, this.f18956monoploid);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            beachfront(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (IronSourceAdapterUtils.canLoadIronSourceAdInstance(this.f18956monoploid, f18953polloi)) {
            return true;
        }
        beachfront(new AdError(103, String.format("An IronSource Rewarded ad is already loading for instance ID: %s", this.f18956monoploid), "com.google.ads.mediation.ironsource"));
        return false;
    }
}
