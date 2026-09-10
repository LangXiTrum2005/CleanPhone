package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.VungleError;
import com.vungle.ads.graveside;
import com.vungle.ads.internal.ui.view.MediaView;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbNativeAd extends UnifiedNativeAdMapper implements graveside {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public MediationNativeAdCallback f19203arytenoidectomy;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final VungleFactory f19204graveside;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f19205kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public String f19206molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public NativeAd f19207monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediaView f19208polloi;

    public class attabal implements VungleInitializer.VungleInitializationListener {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Context f19209attabal;

        /* JADX INFO: renamed from: dern, reason: collision with root package name */
        public final /* synthetic */ int f19211dern;

        /* JADX INFO: renamed from: marial, reason: collision with root package name */
        public final /* synthetic */ String f19212marial;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ String f19213saneness;

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ VideoOptions f19214wireman;

        public attabal(Context context, String str, int i, VideoOptions videoOptions, String str2) {
            this.f19209attabal = context;
            this.f19213saneness = str;
            this.f19211dern = i;
            this.f19214wireman = videoOptions;
            this.f19212marial = str2;
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeError(AdError adError) {
            String str = VungleMediationAdapter.TAG;
            adError.toString();
            VungleRtbNativeAd.this.f19205kowloon.onFailure(adError);
        }

        @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
        public void onInitializeSuccess() throws Throwable {
            VungleRtbNativeAd vungleRtbNativeAd = VungleRtbNativeAd.this;
            vungleRtbNativeAd.f19207monoploid = vungleRtbNativeAd.f19204graveside.createNativeAd(this.f19209attabal, this.f19213saneness);
            VungleRtbNativeAd.this.f19207monoploid.setAdOptionsPosition(this.f19211dern);
            VungleRtbNativeAd.this.f19207monoploid.setAdListener(VungleRtbNativeAd.this);
            if (this.f19214wireman != null) {
                VungleRtbNativeAd.this.f19207monoploid.getVideoOptions().setStartMuted(Boolean.valueOf(this.f19214wireman.getStartMuted()));
            }
            VungleRtbNativeAd.this.f19208polloi = new MediaView(this.f19209attabal);
            if (!TextUtils.isEmpty(this.f19212marial)) {
                VungleRtbNativeAd.this.f19207monoploid.getAdConfig().setWatermark(this.f19212marial);
            }
            VungleRtbNativeAd.this.f19207monoploid.load(VungleRtbNativeAd.this.f19206molybdenite);
        }
    }

    public static class dern extends com.google.android.gms.ads.formats.NativeAd.Image {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Uri f19215attabal;

        public dern(Uri uri) {
            this.f19215attabal = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return null;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f19215attabal;
        }
    }

    public class saneness implements metairie.dern {
        public saneness() {
        }

        @Override // metairie.dern
        public void onVideoEnd() {
            VungleRtbNativeAd.this.f19203arytenoidectomy.onVideoComplete();
        }

        @Override // metairie.dern
        public void onVideoMute() {
            VungleRtbNativeAd.this.f19203arytenoidectomy.onVideoMute();
        }

        @Override // metairie.dern
        public void onVideoPause() {
            VungleRtbNativeAd.this.f19203arytenoidectomy.onVideoPause();
        }

        @Override // metairie.dern
        public void onVideoPlay() {
            VungleRtbNativeAd.this.f19203arytenoidectomy.onVideoPlay();
        }

        @Override // metairie.dern
        public void onVideoUnmute() {
            VungleRtbNativeAd.this.f19203arytenoidectomy.onVideoUnmute();
        }
    }

    public VungleRtbNativeAd(MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f19205kowloon = mediationAdLoadCallback;
        this.f19204graveside = vungleFactory;
    }

    public final void impromptu() {
        setHeadline(this.f19207monoploid.getAdTitle());
        setBody(this.f19207monoploid.getAdBodyText());
        setCallToAction(this.f19207monoploid.getAdCallToActionText());
        Double adStarRating = this.f19207monoploid.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.f19207monoploid.getAdSponsoredText());
        setHasVideoContent(this.f19207monoploid.hasVideoContent());
        setMediaView(this.f19208polloi);
        this.f19208polloi.setNativeVideoListener(new saneness());
        String appIcon = this.f19207monoploid.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(monacal.attabal.FILE_SCHEME)) {
            setIcon(new dern(Uri.parse(appIcon)));
        }
        setMediaContentAspectRatio(this.f19207monoploid.getMediaAspectRatio());
        if (VungleMediationAdapter.runtimeGmaSdkListensToAdapterReportedImpressions()) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdClicked(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19203arytenoidectomy;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.f19203arytenoidectomy.onAdOpened();
        }
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f19205kowloon.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        AdError adError = VungleMediationAdapter.getAdError(vungleError);
        String str = VungleMediationAdapter.TAG;
        adError.toString();
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdImpression(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19203arytenoidectomy;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.f19203arytenoidectomy;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdLoaded(BaseAd baseAd) {
        impromptu();
        this.f19203arytenoidectomy = this.f19205kowloon.onSuccess(this);
    }

    public void render(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        int i;
        int i2;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        VideoOptions videoOptions = nativeAdOptions.getVideoOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        if (TextUtils.isEmpty(string)) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str = VungleMediationAdapter.TAG;
            this.f19205kowloon.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            String str2 = VungleMediationAdapter.TAG;
            this.f19205kowloon.onFailure(adError2);
            return;
        }
        this.f19206molybdenite = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            i = 3;
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i = 1;
                } else {
                    i2 = 2;
                }
            }
            VungleInitializer.getInstance().initialize(string, context, new attabal(context, string2, i2, videoOptions, mediationNativeAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()));
        }
        i = 0;
        i2 = i;
        VungleInitializer.getInstance().initialize(string, context, new attabal(context, string2, i2, videoOptions, mediationNativeAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()));
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        super.trackViews(view, map, map2);
        String str = VungleMediationAdapter.TAG;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.f19207monoploid == null) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (childAt instanceof FrameLayout) {
                ArrayList arrayList = new ArrayList();
                ImageView imageView = null;
                View value = null;
                for (Map.Entry<String, View> entry : map.entrySet()) {
                    arrayList.add(entry.getValue());
                    if (entry.getKey().equals("3003")) {
                        value = entry.getValue();
                    } else if (entry.getKey().equals("3010")) {
                        arrayList.add(this.f19208polloi);
                    }
                }
                if (value instanceof ImageView) {
                    imageView = (ImageView) value;
                } else {
                    String str2 = VungleMediationAdapter.TAG;
                }
                this.f19207monoploid.registerViewForInteraction((FrameLayout) childAt, this.f19208polloi, imageView, arrayList);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        super.untrackView(view);
        String str = VungleMediationAdapter.TAG;
        NativeAd nativeAd = this.f19207monoploid;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.graveside, com.vungle.ads.impromptu
    public void onAdStart(BaseAd baseAd) {
    }
}
