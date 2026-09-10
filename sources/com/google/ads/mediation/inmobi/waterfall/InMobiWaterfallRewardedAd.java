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
import com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.mediation.MediationRewardedAdConfiguration;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiWaterfallRewardedAd extends InMobiRewardedAd {

    public class attabal implements InMobiInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f18933attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ MediationRewardedAdConfiguration f18935saneness;

        public attabal(Context context, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
            this.f18933attabal = context;
            this.f18935saneness = mediationRewardedAdConfiguration;
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            adError.toString();
            if (InMobiWaterfallRewardedAd.this.f18918arytenoidectomy != null) {
                InMobiWaterfallRewardedAd.this.f18918arytenoidectomy.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeSuccess() {
            InMobiWaterfallRewardedAd.this.attabal(this.f18933attabal, this.f18935saneness);
        }
    }

    public InMobiWaterfallRewardedAd(MediationAdLoadCallback<MediationRewardedAd, MediationRewardedAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    public void loadAd(MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        Context context = mediationRewardedAdConfiguration.getContext();
        Bundle serverParameters = mediationRewardedAdConfiguration.getServerParameters();
        String string = serverParameters.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        AdError adErrorValidateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, InMobiAdapterUtils.getPlacementId(serverParameters));
        if (adErrorValidateInMobiAdLoadParams != null) {
            this.f18918arytenoidectomy.onFailure(adErrorValidateInMobiAdLoadParams);
        } else {
            this.f18921monoploid.init(context, string, new attabal(context, mediationRewardedAdConfiguration));
        }
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiRewardedAd
    public void saneness(InMobiInterstitialWrapper inMobiInterstitialWrapper, MediationRewardedAdConfiguration mediationRewardedAdConfiguration) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(mediationRewardedAdConfiguration.getContext(), mediationRewardedAdConfiguration.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiInterstitialWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiInterstitialWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiInterstitialWrapper.load();
    }
}
