package com.google.ads.mediation.mintegral.waterfall;

import android.content.Context;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallInterstitialAd extends MintegralInterstitialAd {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public MintegralNewInterstitialAdWrapper f19024graveside;

    public MintegralWaterfallInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f19000kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.f19001molybdenite.shouldRestrictMultipleAdLoads()) {
            MintegralSlotIdentifier mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            this.f18999arytenoidectomy = mintegralSlotIdentifier;
            Map<MintegralSlotIdentifier, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(mintegralSlotIdentifier);
            if (weakReference != null && weakReference.get() != null) {
                this.f19000kowloon.onFailure(new AdError(106, MintegralConstants.ERROR_MSG_AD_ALREADY_LOADED, "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f18999arytenoidectomy, new WeakReference<>(this));
        }
        MintegralNewInterstitialAdWrapper mintegralNewInterstitialAdWrapperCreateInterstitialHandler = MintegralFactory.createInterstitialHandler();
        this.f19024graveside = mintegralNewInterstitialAdWrapperCreateInterstitialHandler;
        mintegralNewInterstitialAdWrapperCreateInterstitialHandler.createAd(mediationInterstitialAdConfiguration.getContext(), string2, string);
        this.f19024graveside.setInterstitialVideoListener(this);
        this.f19024graveside.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f19024graveside.playVideoMute(this.f19003polloi ? 1 : 2);
        this.f19024graveside.show();
    }
}
