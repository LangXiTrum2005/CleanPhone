package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
import com.google.gson.JsonObject;
import complexometry.formularize;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.conclusively;
import saneness.coreopsis;
import saneness.nepali;
import saneness.weimar;
import saneness.yardman;

/* JADX INFO: loaded from: classes.dex */
public final class su1 implements conclusively {
    public final MediationAdapter a;
    public View b;
    public weimar c;
    public MediationInterstitialAdapter d;

    public su1(MediationAdapter adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        this.a = adapter;
    }

    public final void a(Context context, liquory.attabal adSize, formularize baseRequest, RequestConfiguration requestConfiguration, JsonObject serverParameterData, coreopsis mediationAdLoadListener, yb0 delegatingThirdPartyEventEmitter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(mediationAdLoadListener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        if (this.a instanceof MediationBannerAdapter) {
            ((MediationBannerAdapter) this.a).requestBannerAd(context, new ou1(delegatingThirdPartyEventEmitter, (fx2) mediationAdLoadListener, this), yardman.attabal(serverParameterData), nepali.attabal(adSize.getWidth(), adSize.getHeight(), adSize.getFormatString(), adSize.getIsAnchoredAdaptiveBanner(), adSize.getIsInlineAdaptiveBanner(), adSize.getHeight()), new wd1(baseRequest.molybdenite(), requestConfiguration.competently(context), requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(serverParameterData, requestConfiguration)), yardman.saneness(baseRequest, this.a));
            return;
        }
        ((fx2) mediationAdLoadListener).a(new AdError(0, "Failed to cast " + this.a.getClass().getCanonicalName() + " to " + MediationBannerAdapter.class.getCanonicalName() + ". Does " + this.a.getClass().getCanonicalName() + " implement " + MediationBannerAdapter.class.getCanonicalName() + "?", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
    }

    public final void a(Context context, formularize baseRequest, RequestConfiguration requestConfiguration, JsonObject serverParameterData, coreopsis mediationAdLoadListener, yb0 delegatingThirdPartyEventEmitter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(serverParameterData, "serverParameterData");
        Intrinsics.checkNotNullParameter(mediationAdLoadListener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        if (!(this.a instanceof MediationInterstitialAdapter)) {
            ((fx2) mediationAdLoadListener).a(new AdError(0, "Failed to cast " + this.a.getClass().getCanonicalName() + " to " + MediationInterstitialAdapter.class.getCanonicalName() + ". Does " + this.a.getClass().getCanonicalName() + " implement " + MediationInterstitialAdapter.class.getCanonicalName() + "?", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        ((MediationInterstitialAdapter) this.a).requestInterstitialAd(context, new pu1(delegatingThirdPartyEventEmitter, (fx2) mediationAdLoadListener, this), yardman.attabal(serverParameterData), new wd1(baseRequest.molybdenite(), requestConfiguration.competently(context), requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(serverParameterData, requestConfiguration)), yardman.saneness(baseRequest, this.a));
    }

    public final void a(Context context, formularize baseRequest, com.google.android.libraries.ads.mobile.sdk.nativead.dern nativeRequest, RequestConfiguration requestConfiguration, JsonObject adapterData, coreopsis mediationAdLoadListener, yb0 delegatingThirdPartyEventEmitter) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(baseRequest, "baseRequest");
        Intrinsics.checkNotNullParameter(nativeRequest, "nativeRequest");
        Intrinsics.checkNotNullParameter(requestConfiguration, "requestConfiguration");
        Intrinsics.checkNotNullParameter(adapterData, "adapterData");
        Intrinsics.checkNotNullParameter(mediationAdLoadListener, "mediationAdLoadListener");
        Intrinsics.checkNotNullParameter(delegatingThirdPartyEventEmitter, "delegatingThirdPartyEventEmitter");
        if (!(this.a instanceof MediationNativeAdapter)) {
            ((fx2) mediationAdLoadListener).a(new AdError(0, "Failed to cast " + this.a.getClass().getCanonicalName() + " to " + MediationNativeAdapter.class.getCanonicalName() + ". Does " + this.a.getClass().getCanonicalName() + " implement " + MediationNativeAdapter.class.getCanonicalName() + "?", AdError.GOOGLE_MOBILE_ADS_DOMAIN));
            return;
        }
        ((MediationNativeAdapter) this.a).requestNativeAd(context, new qu1(delegatingThirdPartyEventEmitter, (fx2) mediationAdLoadListener, new ru1(this)), yardman.attabal(adapterData), new jp1(baseRequest.molybdenite(), requestConfiguration.competently(context), requestConfiguration.getTagForChildDirectedTreatment().getValue(), requestConfiguration.getTagForUnderAgeOfConsent().getValue(), yardman.wireman(adapterData, requestConfiguration), yardman.dern(nativeRequest)), yardman.saneness(baseRequest, this.a));
    }

    @Override // saneness.conclusively
    public final Object a(Context context, j8 j8Var, wretchedly.dern dernVar) {
        return new rn0("Old mediation adapters do not implement initialize method.", k41.INTERNAL_ERROR);
    }
}
