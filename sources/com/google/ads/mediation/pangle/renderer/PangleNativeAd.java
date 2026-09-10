package com.google.ads.mediation.pangle.renderer;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdData;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PangleMediationAdapter;
import com.google.ads.mediation.pangle.PangleRequestHelper;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PangleNativeAd extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final PangleInitializer f19082arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public PAGNativeAd f19083graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f19084kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public MediationNativeAdCallback f19085molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final PangleSdkWrapper f19086monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final PangleFactory f19087polloi;

    public class PangleNativeMappedImage extends NativeAd.Image {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Drawable f19088attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final double f19089dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final Uri f19090saneness;

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f19088attabal;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.f19089dern;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f19090saneness;
        }

        public PangleNativeMappedImage(Drawable drawable, Uri uri, double d) {
            this.f19088attabal = drawable;
            this.f19090saneness = uri;
            this.f19089dern = d;
        }
    }

    public class attabal implements PangleInitializer.Listener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ String f19092attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ String f19093dern;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ MediationNativeAdConfiguration f19094saneness;

        /* JADX INFO: renamed from: com.google.ads.mediation.pangle.renderer.PangleNativeAd$attabal$attabal, reason: collision with other inner class name */
        public class C0289attabal implements PAGNativeAdLoadListener {
            public C0289attabal() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
            /* JADX INFO: renamed from: attabal, reason: merged with bridge method [inline-methods] */
            public void onAdLoaded(PAGNativeAd pAGNativeAd) {
                PangleNativeAd.this.impromptu(pAGNativeAd);
                PangleNativeAd pangleNativeAd = PangleNativeAd.this;
                pangleNativeAd.f19085molybdenite = (MediationNativeAdCallback) pangleNativeAd.f19084kowloon.onSuccess(PangleNativeAd.this);
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.xha
            public void onError(int i, String str) {
                AdError adErrorCreateSdkError = PangleConstants.createSdkError(i, str);
                String str2 = PangleMediationAdapter.TAG;
                adErrorCreateSdkError.toString();
                PangleNativeAd.this.f19084kowloon.onFailure(adErrorCreateSdkError);
            }
        }

        public attabal(String str, MediationNativeAdConfiguration mediationNativeAdConfiguration, String str2) {
            this.f19092attabal = str;
            this.f19094saneness = mediationNativeAdConfiguration;
            this.f19093dern = str2;
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeError(AdError adError) {
            String str = PangleMediationAdapter.TAG;
            adError.toString();
            PangleNativeAd.this.f19084kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.pangle.PangleInitializer.Listener
        public void onInitializeSuccess() {
            PAGNativeRequest pAGNativeRequestCreatePagNativeRequest = PangleNativeAd.this.f19087polloi.createPagNativeRequest();
            pAGNativeRequestCreatePagNativeRequest.setAdString(this.f19092attabal);
            PangleRequestHelper.setWatermarkString(pAGNativeRequestCreatePagNativeRequest, this.f19092attabal, this.f19094saneness);
            PangleNativeAd.this.f19086monoploid.loadNativeAd(this.f19093dern, pAGNativeRequestCreatePagNativeRequest, new C0289attabal());
        }
    }

    public class dern implements View.OnClickListener {
        public dern() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PangleNativeAd.this.f19083graveside.showPrivacyActivity();
        }
    }

    public PangleNativeAd(MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, PangleInitializer pangleInitializer, PangleSdkWrapper pangleSdkWrapper, PangleFactory pangleFactory) {
        this.f19084kowloon = mediationAdLoadCallback;
        this.f19082arytenoidectomy = pangleInitializer;
        this.f19086monoploid = pangleSdkWrapper;
        this.f19087polloi = pangleFactory;
    }

    public final void impromptu(PAGNativeAd pAGNativeAd) {
        this.f19083graveside = pAGNativeAd;
        PAGNativeAdData nativeAdData = pAGNativeAd.getNativeAdData();
        setHeadline(nativeAdData.getTitle());
        setBody(nativeAdData.getDescription());
        setCallToAction(nativeAdData.getButtonText());
        if (nativeAdData.getIcon() != null) {
            setIcon(new PangleNativeMappedImage(null, Uri.parse(nativeAdData.getIcon().getImageUrl()), 1.0d));
        }
        setOverrideClickHandling(true);
        setMediaView(nativeAdData.getMediaView());
        setAdChoicesContent(nativeAdData.getAdLogoView());
    }

    public void render(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString("placementid");
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            String str = PangleMediationAdapter.TAG;
            adErrorCreateAdapterError.toString();
            this.f19084kowloon.onFailure(adErrorCreateAdapterError);
            return;
        }
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        this.f19082arytenoidectomy.initialize(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new attabal(bidResponse, mediationNativeAdConfiguration, string));
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        View view2 = (View) map3.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.f19083graveside.registerViewForInteraction((ViewGroup) view, new ArrayList(map3.values()), arrayList, (View) null, new saneness());
        getAdChoicesContent().setOnClickListener(new dern());
    }

    public class saneness implements PAGNativeAdInteractionListener {
        public saneness() {
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdClicked() {
            if (PangleNativeAd.this.f19085molybdenite != null) {
                PangleNativeAd.this.f19085molybdenite.reportAdClicked();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdShowed() {
            if (PangleNativeAd.this.f19085molybdenite != null) {
                PangleNativeAd.this.f19085molybdenite.reportAdImpression();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
        public void onAdDismissed() {
        }
    }
}
