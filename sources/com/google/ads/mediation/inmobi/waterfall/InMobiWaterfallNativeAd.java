package com.google.ads.mediation.inmobi.waterfall;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.inmobi.InMobiAdFactory;
import com.google.ads.mediation.inmobi.InMobiAdapterUtils;
import com.google.ads.mediation.inmobi.InMobiExtras;
import com.google.ads.mediation.inmobi.InMobiExtrasBuilder;
import com.google.ads.mediation.inmobi.InMobiInitializer;
import com.google.ads.mediation.inmobi.InMobiMediationAdapter;
import com.google.ads.mediation.inmobi.InMobiNativeWrapper;
import com.google.ads.mediation.inmobi.renderers.InMobiNativeAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiWaterfallNativeAd extends InMobiNativeAd {

    public class attabal implements InMobiInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f18930attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ long f18932saneness;

        public attabal(Context context, long j) {
            this.f18930attabal = context;
            this.f18932saneness = j;
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            adError.toString();
            if (InMobiWaterfallNativeAd.this.f18914arytenoidectomy != null) {
                InMobiWaterfallNativeAd.this.f18914arytenoidectomy.onFailure(adError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.InMobiInitializer.Listener
        public void onInitializeSuccess() {
            InMobiWaterfallNativeAd.this.attabal(this.f18930attabal, this.f18932saneness);
        }
    }

    public InMobiWaterfallNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, InMobiInitializer inMobiInitializer, InMobiAdFactory inMobiAdFactory) {
        super(mediationNativeAdConfiguration, mediationAdLoadCallback, inMobiInitializer, inMobiAdFactory);
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void internalLoadAd(InMobiNativeWrapper inMobiNativeWrapper) {
        InMobiExtras inMobiExtrasBuild = InMobiExtrasBuilder.build(this.f18915kowloon.getContext(), this.f18915kowloon.getMediationExtras(), InMobiAdapterUtils.PROTOCOL_WATERFALL);
        inMobiNativeWrapper.setExtras(inMobiExtrasBuild.getParameterMap());
        inMobiNativeWrapper.setKeywords(inMobiExtrasBuild.getKeywords());
        inMobiNativeWrapper.load();
    }

    @Override // com.google.ads.mediation.inmobi.renderers.InMobiNativeAd
    public void loadAd() {
        Context context = this.f18915kowloon.getContext();
        Bundle serverParameters = this.f18915kowloon.getServerParameters();
        String string = serverParameters.getString(InMobiAdapterUtils.KEY_ACCOUNT_ID);
        long placementId = InMobiAdapterUtils.getPlacementId(serverParameters);
        AdError adErrorValidateInMobiAdLoadParams = InMobiAdapterUtils.validateInMobiAdLoadParams(string, placementId);
        if (adErrorValidateInMobiAdLoadParams != null) {
            this.f18914arytenoidectomy.onFailure(adErrorValidateInMobiAdLoadParams);
        } else {
            this.inMobiInitializer.init(context, string, new attabal(context, placementId));
        }
    }
}
