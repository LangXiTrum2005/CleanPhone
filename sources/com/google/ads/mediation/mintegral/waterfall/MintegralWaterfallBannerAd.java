package com.google.ads.mediation.mintegral.waterfall;

import android.widget.FrameLayout;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.ads.mediation.mintegral.MintegralUtils;
import com.google.ads.mediation.mintegral.mediation.MintegralBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralWaterfallBannerAd extends MintegralBannerAd {
    public MintegralWaterfallBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback) {
        super(mediationAdLoadCallback);
    }

    @Override // com.google.ads.mediation.mintegral.mediation.MintegralBannerAd
    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        BannerSize mintegralBannerSizeFromAdMobAdSize = MintegralBannerAd.getMintegralBannerSizeFromAdMobAdSize(mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String(), mediationBannerAdConfiguration.getContext(), false);
        if (mintegralBannerSizeFromAdMobAdSize == null) {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(102, String.format("The requested banner size: %s is not supported by Mintegral SDK.", mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String()));
            String str = MintegralMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f18997kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String string = mediationBannerAdConfiguration.getServerParameters().getString("ad_unit_id");
        String string2 = mediationBannerAdConfiguration.getServerParameters().getString("placement_id");
        AdError adErrorValidateMintegralAdLoadParams = MintegralUtils.validateMintegralAdLoadParams(string, string2);
        if (adErrorValidateMintegralAdLoadParams != null) {
            this.f18997kowloon.onFailure(adErrorValidateMintegralAdLoadParams);
            return;
        }
        MBBannerView mBBannerView = new MBBannerView(mediationBannerAdConfiguration.getContext());
        this.f18996arytenoidectomy = mBBannerView;
        mBBannerView.init(mintegralBannerSizeFromAdMobAdSize, string2, string);
        this.f18996arytenoidectomy.setLayoutParams(new FrameLayout.LayoutParams(MintegralUtils.convertDipToPixel(mediationBannerAdConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getWidth()), MintegralUtils.convertDipToPixel(mediationBannerAdConfiguration.getContext(), mintegralBannerSizeFromAdMobAdSize.getHeight())));
        this.f18996arytenoidectomy.setBannerAdListener(this);
        this.f18996arytenoidectomy.load();
    }
}
