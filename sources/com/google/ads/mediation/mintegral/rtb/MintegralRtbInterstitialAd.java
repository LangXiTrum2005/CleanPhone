package com.google.ads.mediation.mintegral.rtb;

import android.content.Context;
import com.google.ads.mediation.mintegral.FlagValueGetter;
import com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralSlotIdentifier;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbInterstitialAd extends MintegralInterstitialAd {

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public MintegralBidNewInterstitialAdWrapper f19021graveside;

    public MintegralRtbInterstitialAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration, MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, FlagValueGetter flagValueGetter) {
        super(mediationInterstitialAdConfiguration, mediationAdLoadCallback, flagValueGetter);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralInterstitialAd
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        String string = mediationInterstitialAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationInterstitialAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationInterstitialAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f19000kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        if (this.f19001molybdenite.shouldRestrictMultipleAdLoads()) {
            MintegralSlotIdentifier mintegralSlotIdentifier = new MintegralSlotIdentifier(string, string2);
            this.f18999arytenoidectomy = mintegralSlotIdentifier;
            MintegralMediationAdapter.loadedSlotIdentifiers.put(mintegralSlotIdentifier, new WeakReference<>(this));
        }
        MintegralBidNewInterstitialAdWrapper mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler = MintegralFactory.createBidInterstitialHandler();
        this.f19021graveside = mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler;
        mintegralBidNewInterstitialAdWrapperCreateBidInterstitialHandler.createAd(mediationInterstitialAdConfiguration.getContext(), string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationInterstitialAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String());
            this.f19021graveside.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
            String str = MintegralMediationAdapter.TAG;
        }
        this.f19021graveside.setInterstitialVideoListener(this);
        this.f19021graveside.loadFromBid(bidResponse);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAd
    public void showAd(Context context) {
        this.f19021graveside.playVideoMute(this.f19003polloi ? 1 : 2);
        this.f19021graveside.showFromBid();
    }
}
