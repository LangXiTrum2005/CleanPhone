package com.google.ads.mediation.inmobi.rtb;

import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiInterstitialWrapper;
import com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiRtbInterstitialAd extends InMobiInterstitialAd {
    public InMobiRtbInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        attabal(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    public void saneness(InMobiInterstitialWrapper inMobiInterstitialWrapper, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiInterstitialWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiInterstitialWrapper.load(mediationInterstitialAdConfiguration.getBidResponse().getBytes());
    }
}
