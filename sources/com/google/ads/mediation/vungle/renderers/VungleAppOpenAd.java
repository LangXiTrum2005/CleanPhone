package com.google.ads.mediation.vungle.renderers;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.ironsource.If;
import com.vungle.ads.BaseAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.arytenoidectomy;
import com.vungle.ads.kowloon;
import com.vungle.ads.saneness;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleAppOpenAd.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\u001dJ\u001f\u0010$\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010&\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b&\u0010%J\u0017\u0010'\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b'\u0010\u001dR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/google/ads/mediation/vungle/renderers/VungleAppOpenAd;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAd;", "Lcom/vungle/ads/arytenoidectomy;", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "mediationAdLoadCallback", "Lcom/google/ads/mediation/vungle/VungleFactory;", "vungleFactory", "<init>", "(Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;Lcom/google/ads/mediation/vungle/VungleFactory;)V", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;", "mediationAppOpenAdConfiguration", "", "render", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)V", "", "getAdMarkup", "(Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)Ljava/lang/String;", "Lcom/vungle/ads/saneness;", "adConfig", "maybeAddWatermarkToVungleAdConfig", "(Lcom/vungle/ads/saneness;Lcom/google/android/gms/ads/mediation/MediationAppOpenAdConfiguration;)V", "Landroid/content/Context;", "context", "showAd", "(Landroid/content/Context;)V", "Lcom/vungle/ads/BaseAd;", "baseAd", If.j, "(Lcom/vungle/ads/BaseAd;)V", "onAdStart", "onAdEnd", If.f, If.k, "Lcom/vungle/ads/VungleError;", "adError", "onAdFailedToPlay", "(Lcom/vungle/ads/BaseAd;Lcom/vungle/ads/VungleError;)V", "onAdFailedToLoad", "onAdImpression", "kowloon", "Lcom/google/android/gms/ads/mediation/MediationAdLoadCallback;", "arytenoidectomy", "Lcom/google/ads/mediation/vungle/VungleFactory;", "Lcom/vungle/ads/kowloon;", "monoploid", "Lcom/vungle/ads/kowloon;", "appOpenAd", "polloi", "Lcom/google/android/gms/ads/mediation/MediationAppOpenAdCallback;", "mediationAppOpenAdCallback", "liftoffmonetize_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class VungleAppOpenAd implements MediationAppOpenAd, arytenoidectomy {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final VungleFactory vungleFactory;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public kowloon appOpenAd;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public MediationAppOpenAdCallback mediationAppOpenAdCallback;

    public VungleAppOpenAd(MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        Intrinsics.checkNotNullParameter(mediationAdLoadCallback, "mediationAdLoadCallback");
        Intrinsics.checkNotNullParameter(vungleFactory, "vungleFactory");
        this.mediationAdLoadCallback = mediationAdLoadCallback;
        this.vungleFactory = vungleFactory;
    }

    public abstract String getAdMarkup(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void maybeAddWatermarkToVungleAdConfig(saneness adConfig, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdClicked(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdEnd(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToLoad(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        String str = VungleMediationAdapter.TAG;
        adError2.toString();
        this.mediationAdLoadCallback.onFailure(adError2);
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdFailedToPlay(BaseAd baseAd, VungleError adError) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        Intrinsics.checkNotNullParameter(adError, "adError");
        AdError adError2 = VungleMediationAdapter.getAdError(adError);
        Intrinsics.checkNotNullExpressionValue(adError2, "getAdError(...)");
        String str = VungleMediationAdapter.TAG;
        adError2.toString();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError2);
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdImpression(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLeftApplication(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdLoaded(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        this.mediationAppOpenAdCallback = this.mediationAdLoadCallback.onSuccess(this);
    }

    @Override // com.vungle.ads.arytenoidectomy, com.vungle.ads.impassible, com.vungle.ads.impromptu
    public void onAdStart(BaseAd baseAd) {
        Intrinsics.checkNotNullParameter(baseAd, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    public final void render(final MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration) {
        Intrinsics.checkNotNullParameter(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        final Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        Intrinsics.checkNotNullExpressionValue(mediationExtras, "getMediationExtras(...)");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        Intrinsics.checkNotNullExpressionValue(serverParameters, "getServerParameters(...)");
        String string = serverParameters.getString("appid");
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            this.mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            this.mediationAdLoadCallback.onFailure(adError2);
        } else {
            final Context context = mediationAppOpenAdConfiguration.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            VungleInitializer vungleInitializer = VungleInitializer.getInstance();
            Intrinsics.beachfront(string);
            vungleInitializer.initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.render.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    String str3 = VungleMediationAdapter.TAG;
                    error.toString();
                    VungleAppOpenAd.this.mediationAdLoadCallback.onFailure(error);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    saneness sanenessVarCreateAdConfig = VungleAppOpenAd.this.vungleFactory.createAdConfig();
                    if (mediationExtras.containsKey(VungleConstants.KEY_ORIENTATION)) {
                        sanenessVarCreateAdConfig.setAdOrientation(mediationExtras.getInt(VungleConstants.KEY_ORIENTATION, 2));
                    }
                    if (mediationExtras.containsKey(VungleConstants.KEY_BACK_BUTTON_IMMEDIATELY_ENABLED)) {
                        sanenessVarCreateAdConfig.setBackButtonImmediatelyEnabled(mediationExtras.getBoolean(VungleConstants.KEY_BACK_BUTTON_IMMEDIATELY_ENABLED, false));
                    }
                    VungleAppOpenAd.this.maybeAddWatermarkToVungleAdConfig(sanenessVarCreateAdConfig, mediationAppOpenAdConfiguration);
                    VungleAppOpenAd vungleAppOpenAd = VungleAppOpenAd.this;
                    VungleFactory vungleFactory = vungleAppOpenAd.vungleFactory;
                    Context context2 = context;
                    String str3 = string2;
                    Intrinsics.beachfront(str3);
                    vungleAppOpenAd.appOpenAd = vungleFactory.createInterstitialAd(context2, str3, sanenessVarCreateAdConfig);
                    kowloon kowloonVar = VungleAppOpenAd.this.appOpenAd;
                    kowloon kowloonVar2 = null;
                    if (kowloonVar == null) {
                        Intrinsics.preprohormone("appOpenAd");
                        kowloonVar = null;
                    }
                    kowloonVar.setAdListener(VungleAppOpenAd.this);
                    kowloon kowloonVar3 = VungleAppOpenAd.this.appOpenAd;
                    if (kowloonVar3 == null) {
                        Intrinsics.preprohormone("appOpenAd");
                    } else {
                        kowloonVar2 = kowloonVar3;
                    }
                    kowloonVar2.load(VungleAppOpenAd.this.getAdMarkup(mediationAppOpenAdConfiguration));
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        kowloon kowloonVar = this.appOpenAd;
        kowloon kowloonVar2 = null;
        if (kowloonVar == null) {
            Intrinsics.preprohormone("appOpenAd");
            kowloonVar = null;
        }
        if (kowloonVar.canPlayAd().booleanValue()) {
            kowloon kowloonVar3 = this.appOpenAd;
            if (kowloonVar3 == null) {
                Intrinsics.preprohormone("appOpenAd");
            } else {
                kowloonVar2 = kowloonVar3;
            }
            kowloonVar2.play(context);
            return;
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        String str = VungleMediationAdapter.TAG;
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.mediationAppOpenAdCallback;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
