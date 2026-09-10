package com.google.ads.mediation.mintegral.waterfall;

import android.content.Context;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralRewardedAdWrapper;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallRewardedAd extends MintegralRewardedAd {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public MintegralRewardedAdWrapper f19026graveside;

    public MintegralWaterfallRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f19016kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.f19017molybdenite.shouldRestrictMultipleAdLoads()) {
            MintegralSlotIdentifier mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            this.f19015arytenoidectomy = mintegralSlotIdentifier;
            Map<MintegralSlotIdentifier, WeakReference<Object>> map = MintegralMediationAdapter.loadedSlotIdentifiers;
            WeakReference<Object> weakReference = map.get(mintegralSlotIdentifier);
            if (weakReference != null && weakReference.get() != null) {
                this.f19016kowloon.onFailure(new AdError(106, MintegralConstants.ERROR_MSG_AD_ALREADY_LOADED, "com.google.ads.mediation.mintegral"));
                return;
            }
            map.put(this.f19015arytenoidectomy, new WeakReference<>(this));
        }
        MintegralRewardedAdWrapper mintegralRewardedAdWrapperCreateMintegralRewardedAdWrapper = MintegralFactory.createMintegralRewardedAdWrapper();
        this.f19026graveside = mintegralRewardedAdWrapperCreateMintegralRewardedAdWrapper;
        mintegralRewardedAdWrapperCreateMintegralRewardedAdWrapper.createAd(mediationRewardedAdConfiguration.getContext(), string2, string);
        this.f19026graveside.setRewardVideoListener(this);
        this.f19026graveside.load();
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f19026graveside.playVideoMute(this.f19019polloi ? 1 : 2);
        this.f19026graveside.show();
    }
}
