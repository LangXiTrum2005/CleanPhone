package com.google.ads.mediation.mintegral.rtb;

import android.widget.FrameLayout;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralFactory;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralRtbBannerAd extends MintegralBannerAd {
    public MintegralRtbBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralBannerAd
    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        BannerSize mintegralBannerSizeFromAdMobAdSize = MintegralBannerAd.getMintegralBannerSizeFromAdMobAdSize(mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String(), mediationBannerAdConfiguration.getContext(), true);
        if (mintegralBannerSizeFromAdMobAdSize == null) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String()));
            String str = MintegralMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f18997kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString("placement_id");
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2, bidResponse);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f18997kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MBBannerView mBBannerViewCreateMBBannerView = MintegralFactory.createMBBannerView(mediationBannerAdConfiguration.getContext());
        this.f18996arytenoidectomy = mBBannerViewCreateMBBannerView;
        mBBannerViewCreateMBBannerView.init(mintegralBannerSizeFromAdMobAdSize, string2, string);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(MBridgeConstans.EXTRA_KEY_WM, mediationBannerAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String());
            this.f18996arytenoidectomy.setExtraInfo(jSONObject);
        } catch (JSONException unused) {
            String str2 = MintegralMediationAdapter.TAG;
        }
        this.f18996arytenoidectomy.setLayoutParams(new FrameLayout.LayoutParams(MintegralUtils.convertDipToPixel(mediationBannerAdConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getWidth()), MintegralUtils.convertDipToPixel(mediationBannerAdConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getHeight())));
        this.f18996arytenoidectomy.setBannerAdListener(this);
        this.f18996arytenoidectomy.loadFromBid(bidResponse);
    }
}
