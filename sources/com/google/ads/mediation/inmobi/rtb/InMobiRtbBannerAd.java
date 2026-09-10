package com.google.ads.mediation.inmobi.rtb;

import android.content.Context;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiBannerWrapper;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.renderers.InMobiBannerAd;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiRtbBannerAd extends InMobiBannerAd {
    public InMobiRtbBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void internalLoadAd(InMobiBannerWrapper inMobiBannerWrapper, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_RTB);
        inMobiBannerWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiBannerWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiBannerWrapper.load(mediationBannerAdConfiguration.getBidResponse().getBytes());
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeFindClosestBannerSize = InMobiAdapterUtils.findClosestBannerSize(context, mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String());
        if (adSizeFindClosestBannerSize == null) {
            adSizeFindClosestBannerSize = mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String();
        }
        attabal(context, adSizeFindClosestBannerSize, mediationBannerAdConfiguration);
    }
}
