package com.google.ads.mediation.mintegral.rtb;

import android.content.Context;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralBidRewardedAdWrapper;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbRewardedAd extends MintegralRewardedAd {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public MintegralBidRewardedAdWrapper f19023graveside;

    public MintegralRtbRewardedAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration, MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationRewardedAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralRewardedAd
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        String string = mediationRewardedAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationRewardedAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationRewardedAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f19016kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.f19017molybdenite.shouldRestrictMultipleAdLoads()) {
            MintegralSlotIdentifier mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            this.f19015arytenoidectomy = mintegralSlotIdentifier;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(mintegralSlotIdentifier, new WeakReference<>(this));
        }
        MintegralBidRewardedAdWrapper mintegralBidRewardedAdWrapperCreateMintegralBidRewardedAdWrapper = MintegralFactory.createMintegralBidRewardedAdWrapper();
        this.f19023graveside = mintegralBidRewardedAdWrapperCreateMintegralBidRewardedAdWrapper;
        mintegralBidRewardedAdWrapperCreateMintegralBidRewardedAdWrapper.createAd(mediationRewardedAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationRewardedAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String());
            this.f19023graveside.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
            String str = MintegralMediationAdapter.TAG;
        }
        this.f19023graveside.setRewardVideoListener(this);
        this.f19023graveside.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAd
    public void showAd(Context context) {
        this.f19023graveside.playVideoMute(this.f19019polloi ? 1 : 2);
        this.f19023graveside.showFromBid();
    }
}
