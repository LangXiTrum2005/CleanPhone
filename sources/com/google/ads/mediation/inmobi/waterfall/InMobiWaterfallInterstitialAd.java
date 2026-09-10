package com.google.ads.mediation.inmobi.waterfall;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiInterstitialWrapper;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiWaterfallInterstitialAd extends InMobiInterstitialAd {

    public class attabal implements InMobiInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f18927attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ MediationInterstitialAdConfiguration f18929saneness;

        public attabal(Context context, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
            this.f18927attabal = context;
            this.f18929saneness = mediationInterstitialAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            adError.toString();
            if (InMobiWaterfallInterstitialAd.this.f18909arytenoidectomy != null) {
                InMobiWaterfallInterstitialAd.this.f18909arytenoidectomy.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeSuccess() {
            InMobiWaterfallInterstitialAd.this.attabal(this.f18927attabal, this.f18929saneness);
        }
    }

    public InMobiWaterfallInterstitialAd(MediationAdLoadCallback<MediationInterstitialAd, MediationInterstitialAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    public void loadAd(MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        Context context = mediationInterstitialAdConfiguration.getContext();
        Bundle serverParameters = mediationInterstitialAdConfiguration.getServerParameters();
        String string = serverParameters.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        AdError adErrorValidateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, InMobiAdapterUtils.getPlacementId(serverParameters));
        if (adErrorValidateInMobiAdLoadParams != null) {
            this.f18909arytenoidectomy.onFailure(adErrorValidateInMobiAdLoadParams);
        } else {
            this.f18912monoploid.init(context, string, new attabal(context, mediationInterstitialAdConfiguration));
        }
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiInterstitialAd
    public void saneness(InMobiInterstitialWrapper inMobiInterstitialWrapper, MediationInterstitialAdConfiguration mediationInterstitialAdConfiguration) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(mediationInterstitialAdConfiguration.getContext(), mediationInterstitialAdConfiguration.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiInterstitialWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiInterstitialWrapper.load();
    }
}
