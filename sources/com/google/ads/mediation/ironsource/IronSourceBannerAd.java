package com.google.ads.mediation.ironsource;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class IronSourceBannerAd implements MediationBannerAd {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> f18938arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public MediationBannerAdCallback f18939kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public ISBannerSize f18940molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public FrameLayout f18941monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public ISDemandOnlyBannerLayout f18942polloi;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<IronSourceBannerAd>> f18937graveside = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final IronSourceBannerAdListener f18936adultoid = new IronSourceBannerAdListener();

    public IronSourceBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        this.f18938arytenoidectomy = mediationAdLoadCallback;
    }

    public static void attabal(String str) {
        for (String str2 : f18937graveside.keySet()) {
            if (!str2.equals(str)) {
                String str3 = IronSourceConstants.f18943attabal;
                String.format("IronSource Banner Destroy ad with instance ID: %s", str2);
                IronSource.destroyISDemandOnlyBanner(str2);
                taiyuan(str2);
            }
        }
    }

    private void impromptu(AdError adError) {
        String str = IronSourceConstants.f18943attabal;
        adError.toString();
        MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback = this.f18938arytenoidectomy;
        if (mediationAdLoadCallback != null) {
            mediationAdLoadCallback.onFailure(adError);
        }
    }

    public static void taiyuan(String str) {
        f18937graveside.remove(str);
    }

    public static IronSourceBannerAd wireman(String str) {
        ConcurrentHashMap<String, WeakReference<IronSourceBannerAd>> concurrentHashMap = f18937graveside;
        if (concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.get(str).get();
        }
        return null;
    }

    public ISDemandOnlyBannerLayout beachfront() {
        return this.f18942polloi;
    }

    public final boolean competently(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
        Context context = mediationBannerAdConfiguration.getContext();
        AdError adErrorValidateIronSourceAdLoadParams = IronSourceAdapterUtils.validateIronSourceAdLoadParams(context, string);
        if (adErrorValidateIronSourceAdLoadParams != null) {
            impromptu(adErrorValidateIronSourceAdLoadParams);
            return false;
        }
        if (!IronSourceAdapterUtils.canLoadIronSourceAdInstance(string, f18937graveside)) {
            impromptu(new AdError(103, "An IronSource banner is already loaded for instance ID: " + string, "com.google.ads.mediation.ironsource"));
            return false;
        }
        AdSize adSize = mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String();
        ISBannerSize iSBannerSizeFromGoogleAdSize = IronSourceAdapterUtils.getISBannerSizeFromGoogleAdSize(context, adSize);
        this.f18940molybdenite = iSBannerSizeFromGoogleAdSize;
        if (iSBannerSizeFromGoogleAdSize != null) {
            return true;
        }
        impromptu(new AdError(105, "There is no matching IronSource banner ad size for Google ad size: " + adSize, "com.google.ads.mediation.ironsource"));
        return false;
    }

    public void cutely(MediationBannerAdCallback mediationBannerAdCallback) {
        this.f18939kowloon = mediationBannerAdCallback;
    }

    public MediationBannerAdCallback dern() {
        return this.f18939kowloon;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAd
    public View getView() {
        return this.f18941monoploid;
    }

    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        if (competently(mediationBannerAdConfiguration)) {
            String string = mediationBannerAdConfiguration.getServerParameters().getString("instanceId", "0");
            Context context = mediationBannerAdConfiguration.getContext();
            Activity activity = (Activity) context;
            f18937graveside.put(string, new WeakReference<>(this));
            this.f18941monoploid = new FrameLayout(context);
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayoutCreateBannerForDemandOnly = IronSource.createBannerForDemandOnly(activity, this.f18940molybdenite);
            this.f18942polloi = iSDemandOnlyBannerLayoutCreateBannerForDemandOnly;
            iSDemandOnlyBannerLayoutCreateBannerForDemandOnly.setBannerDemandOnlyListener(f18936adultoid);
            String str = IronSourceConstants.f18943attabal;
            String.format("Loading IronSource banner ad with instance ID: %s", string);
            IronSource.loadISDemandOnlyBanner(activity, this.f18942polloi, string);
        }
    }

    public FrameLayout marial() {
        return this.f18941monoploid;
    }

    public MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> saneness() {
        return this.f18938arytenoidectomy;
    }
}
