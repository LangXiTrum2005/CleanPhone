package com.google.ads.mediation.mintegral.mediation;

import android.content.Context;
import com.google.ads.mediation.mintegral.MintegralConstants;
import com.google.ads.mediation.mintegral.MintegralMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeAdWithCodeListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MintegralNativeAdListener extends NativeAdWithCodeListener {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f19012attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Context f19013dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public MintegralNativeAd f19014saneness;

    public MintegralNativeAdListener(MintegralNativeAd mintegralNativeAd, Context context, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f19013dern = context;
        this.f19014saneness = mintegralNativeAd;
        this.f19012attabal = mediationAdLoadCallback;
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdClick(Campaign campaign) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19014saneness.f19006monoploid;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f19014saneness.f19006monoploid.onAdLeftApplication();
        }
    }

    @Override // com.mbridge.msdk.out.NativeAdWithCodeListener
    public void onAdLoadErrorWithCode(int i, String str) {
        AdError adErrorCreateSdkError = MintegralConstants.createSdkError(i, str);
        String str2 = MintegralMediationAdapter.TAG;
        adErrorCreateSdkError.toString();
        this.f19012attabal.onFailure(adErrorCreateSdkError);
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdLoaded(List<Campaign> list, int i) {
        if (list != null && list.size() != 0) {
            this.f19014saneness.attabal(list.get(0), this.f19013dern);
            MintegralNativeAd mintegralNativeAd = this.f19014saneness;
            mintegralNativeAd.f19006monoploid = this.f19012attabal.onSuccess(mintegralNativeAd);
        } else {
            AdError adErrorCreateAdapterError = MintegralConstants.createAdapterError(104, "Mintegral SDK failed to return a native ad.");
            String str = MintegralMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f19012attabal.onFailure(adErrorCreateAdapterError);
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onLoggingImpression(int i) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19014saneness.f19006monoploid;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
    public void onAdFramesLoaded(List<Frame> list) {
    }
}
