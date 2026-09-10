package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookRtbNativeAd extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public NativeAdBase f18857arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f18858kowloon;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final MetaFactory f18859molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public MediationNativeAdCallback f18860monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public MediaView f18861polloi;

    public interface dern {
        void attabal(AdError adError);

        void saneness();
    }

    public class saneness extends NativeAd.Image {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public Drawable f18863attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Uri f18865saneness;

        public saneness() {
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.f18863attabal;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.f18865saneness;
        }

        public saneness(Uri uri) {
            this.f18865saneness = uri;
        }

        public saneness(Drawable drawable) {
            this.f18863attabal = drawable;
        }
    }

    public FacebookRtbNativeAd(MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.f18858kowloon = mediationAdLoadCallback;
        this.f18859molybdenite = metaFactory;
    }

    public void mapNativeAd(Context context, dern dernVar) {
        if (!wireman(this.f18857arytenoidectomy)) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            adError.getMessage();
            dernVar.attabal(adError);
            return;
        }
        setHeadline(this.f18857arytenoidectomy.getAdHeadline());
        if (this.f18857arytenoidectomy.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new saneness(Uri.parse(this.f18857arytenoidectomy.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.f18857arytenoidectomy.getAdBodyText());
        if (this.f18857arytenoidectomy.getPreloadedIconViewDrawable() != null) {
            setIcon(new saneness(this.f18857arytenoidectomy.getPreloadedIconViewDrawable()));
        } else if (this.f18857arytenoidectomy.getAdIcon() == null) {
            setIcon(new saneness());
        } else {
            setIcon(new saneness(Uri.parse(this.f18857arytenoidectomy.getAdIcon().getUrl())));
        }
        setCallToAction(this.f18857arytenoidectomy.getAdCallToAction());
        setAdvertiser(this.f18857arytenoidectomy.getAdvertiserName());
        this.f18861polloi.setListener(new attabal());
        setHasVideoContent(true);
        setMediaView(this.f18861polloi);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.f18857arytenoidectomy.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.f18857arytenoidectomy.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.f18857arytenoidectomy, null));
        dernVar.saneness();
    }

    public void render(MediationNativeAdConfiguration mediationNativeAdConfiguration) {
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            String str = FacebookMediationAdapter.TAG;
            adError.getMessage();
            this.f18858kowloon.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.f18861polloi = this.f18859molybdenite.createMediaView(mediationNativeAdConfiguration.getContext());
        try {
            this.f18857arytenoidectomy = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String())) {
                this.f18857arytenoidectomy.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getCom.mbridge.msdk.MBridgeConstans.EXTRA_KEY_WM java.lang.String()).build());
            }
            NativeAdBase nativeAdBase = this.f18857arytenoidectomy;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new wireman(mediationNativeAdConfiguration.getContext(), this.f18857arytenoidectomy)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e.getMessage(), "com.google.ads.mediation.facebook");
            String str2 = FacebookMediationAdapter.TAG;
            adError2.getMessage();
            this.f18858kowloon.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.f18857arytenoidectomy;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                String str = FacebookMediationAdapter.TAG;
                return;
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            } else {
                String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass());
                String str2 = FacebookMediationAdapter.TAG;
                return;
            }
        }
        if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            String str3 = FacebookMediationAdapter.TAG;
            return;
        }
        com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
        if (view2 instanceof ImageView) {
            nativeAd.registerViewForInteraction(view, this.f18861polloi, (ImageView) view2, arrayList);
        } else {
            String str4 = FacebookMediationAdapter.TAG;
            nativeAd.registerViewForInteraction(view, this.f18861polloi, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.f18857arytenoidectomy;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }

    public final boolean wireman(NativeAdBase nativeAdBase) {
        boolean z = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (nativeAdBase instanceof NativeBannerAd) {
            return z;
        }
        return (!z || nativeAdBase.getAdCoverImage() == null || this.f18861polloi == null) ? false : true;
    }

    public class attabal implements MediaViewListener {
        public attabal() {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onComplete(MediaView mediaView) {
            if (FacebookRtbNativeAd.this.f18860monoploid != null) {
                FacebookRtbNativeAd.this.f18860monoploid.onVideoComplete();
            }
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onEnterFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onExitFullscreen(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenBackground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onFullscreenForeground(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPause(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onPlay(MediaView mediaView) {
        }

        @Override // com.facebook.ads.MediaViewListener
        public void onVolumeChange(MediaView mediaView, float f) {
        }
    }

    public class wireman implements AdListener, NativeAdListener {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final NativeAdBase f18866arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final WeakReference<Context> f18867kowloon;

        public class attabal implements dern {
            public attabal() {
            }

            @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.dern
            public void attabal(AdError adError) {
                String str = FacebookMediationAdapter.TAG;
                adError.getMessage();
                FacebookRtbNativeAd.this.f18858kowloon.onFailure(adError);
            }

            @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.dern
            public void saneness() {
                FacebookRtbNativeAd facebookRtbNativeAd = FacebookRtbNativeAd.this;
                facebookRtbNativeAd.f18860monoploid = (MediationNativeAdCallback) facebookRtbNativeAd.f18858kowloon.onSuccess(FacebookRtbNativeAd.this);
            }
        }

        public wireman(Context context, NativeAdBase nativeAdBase) {
            this.f18866arytenoidectomy = nativeAdBase;
            this.f18867kowloon = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(Ad ad) {
            FacebookRtbNativeAd.this.f18860monoploid.reportAdClicked();
            FacebookRtbNativeAd.this.f18860monoploid.onAdOpened();
            FacebookRtbNativeAd.this.f18860monoploid.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(Ad ad) {
            if (ad != this.f18866arytenoidectomy) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
                String str = FacebookMediationAdapter.TAG;
                adError.getMessage();
                FacebookRtbNativeAd.this.f18858kowloon.onFailure(adError);
                return;
            }
            Context context = this.f18867kowloon.get();
            if (context != null) {
                FacebookRtbNativeAd.this.mapNativeAd(context, new attabal());
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
            String str2 = FacebookMediationAdapter.TAG;
            adError2.getMessage();
            FacebookRtbNativeAd.this.f18858kowloon.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(Ad ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            String str = FacebookMediationAdapter.TAG;
            adError2.getMessage();
            FacebookRtbNativeAd.this.f18858kowloon.onFailure(adError2);
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(Ad ad) {
            String str = FacebookMediationAdapter.TAG;
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(Ad ad) {
        }
    }
}
