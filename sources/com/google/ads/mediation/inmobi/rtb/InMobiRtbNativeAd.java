package com.google.ads.mediation.inmobi.rtb;

import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiNativeWrapper;
import com.google.ads.mediation.inmobi.renderers.InMobiNativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiRtbNativeAd extends InMobiNativeAd {
    public InMobiRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void internalLoadAd(InMobiNativeWrapper inMobiNativeWrapper) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(this.f18915kowloon.getContext(), this.f18915kowloon.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiNativeWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiNativeWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiNativeWrapper.load(this.f18915kowloon.getBidResponse().getBytes());
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void loadAd() {
        attabal(this.f18915kowloon.getContext(), InMobiAdapterUtils.getPlacementId(this.f18915kowloon.getServerParameters()));
    }
}
