package com.google.ads.mediation.inmobi.waterfall;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiBannerWrapper;
import com.google.ads.mediation.inmobi.InMobiConstants;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.renderers.InMobiBannerAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationBannerAd;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiWaterfallBannerAd extends InMobiBannerAd {

    public class attabal implements InMobiInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f18923attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ MediationBannerAdConfiguration f18924dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ AdSize f18925saneness;

        public attabal(Context context, AdSize adSize, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
            this.f18923attabal = context;
            this.f18925saneness = adSize;
            this.f18924dern = mediationBannerAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            adError.toString();
            InMobiWaterfallBannerAd.this.f18905kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeSuccess() {
            InMobiWaterfallBannerAd.this.attabal(this.f18923attabal, this.f18925saneness, this.f18924dern);
        }
    }

    public InMobiWaterfallBannerAd(MediationAdLoadCallback<MediationBannerAd, MediationBannerAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void internalLoadAd(InMobiBannerWrapper inMobiBannerWrapper, MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(mediationBannerAdConfiguration.getContext(), mediationBannerAdConfiguration.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiBannerWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiBannerWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiBannerWrapper.load();
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiBannerAd
    public void loadAd(MediationBannerAdConfiguration mediationBannerAdConfiguration) {
        Context context = mediationBannerAdConfiguration.getContext();
        AdSize adSizeFindClosestBannerSize = InMobiAdapterUtils.findClosestBannerSize(context, mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String());
        if (adSizeFindClosestBannerSize == null) {
            AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(102, String.format("The requested banner size: %s is not supported by InMobi SDK.", mediationBannerAdConfiguration.getCom.ironsource.X3.i.O java.lang.String()));
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            adErrorCreateAdapterError.toString();
            this.f18905kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        Bundle serverParameters = mediationBannerAdConfiguration.getServerParameters();
        String string = serverParameters.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        AdError adErrorValidateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, InMobiAdapterUtils.getPlacementId(serverParameters));
        if (adErrorValidateInMobiAdLoadParams != null) {
            this.f18905kowloon.onFailure(adErrorValidateInMobiAdLoadParams);
        } else {
            this.f18904arytenoidectomy.init(context, string, new attabal(context, adSizeFindClosestBannerSize, mediationBannerAdConfiguration));
        }
    }
}
