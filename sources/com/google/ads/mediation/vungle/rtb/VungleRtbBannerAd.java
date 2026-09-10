package com.google.ads.mediation.vungle.rtb;

import android.text.TextUtils;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.renderers.VungleBannerAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;
import com.vungle.ads.VungleBannerView;
import com.vungle.ads.competently;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbBannerAd extends VungleBannerAd implements competently {
    public VungleRtbBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        super(mediationAdLoadCallback, vungleFactory);
    }

    @Override // com.google.ads.mediation.vungle.renderers.VungleBannerAd
    public void wireman(VungleBannerView vungleBannerView, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        String bidResponse = mediationBannerAdConfiguration.getBidResponse();
        String str = mediationBannerAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String();
        if (!TextUtils.isEmpty(str)) {
            vungleBannerView.getAdConfig().setWatermark(str);
        }
        vungleBannerView.load(bidResponse);
    }
}
