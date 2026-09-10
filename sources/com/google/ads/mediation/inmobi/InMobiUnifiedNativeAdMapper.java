package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.ads.mediation.inmobi.renderers.InMobiNativeAd;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import com.inmobi.media.ads.nativeAd.MediaView;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class InMobiUnifiedNativeAdMapper extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final boolean f18893arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final InMobiNativeWrapper f18894kowloon;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> f18895monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final InMobiNativeAd f18896polloi;

    public class attabal implements com.google.ads.mediation.inmobi.attabal.saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Uri f18897attabal;

        public attabal(Uri uri) {
            this.f18897attabal = uri;
        }

        @Override // com.google.ads.mediation.inmobi.attabal.saneness
        public void attabal(HashMap<String, Drawable> map) {
            Drawable drawable = map.get("icon_key");
            InMobiUnifiedNativeAdMapper.this.setIcon(new idolatry.attabal(drawable, this.f18897attabal, 1.0d));
            ArrayList arrayList = new ArrayList();
            arrayList.add(new idolatry.attabal(new ColorDrawable(0), null, 1.0d));
            InMobiUnifiedNativeAdMapper.this.setImages(arrayList);
            if (drawable != null && InMobiUnifiedNativeAdMapper.this.f18895monoploid != null) {
                InMobiUnifiedNativeAdMapper.this.f18896polloi.mediationNativeAdCallback = (MediationNativeAdCallback) InMobiUnifiedNativeAdMapper.this.f18895monoploid.onSuccess(InMobiUnifiedNativeAdMapper.this);
            } else {
                AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(109, "InMobi SDK failed to download native ad image assets.");
                String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
                adErrorCreateAdapterError.toString();
                InMobiUnifiedNativeAdMapper.this.f18895monoploid.onFailure(adErrorCreateAdapterError);
            }
        }

        @Override // com.google.ads.mediation.inmobi.attabal.saneness
        public void saneness() {
            AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(109, "InMobi SDK failed to download native ad image assets.");
            String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
            adErrorCreateAdapterError.toString();
            InMobiUnifiedNativeAdMapper.this.f18895monoploid.onFailure(adErrorCreateAdapterError);
        }
    }

    public InMobiUnifiedNativeAdMapper(InMobiNativeWrapper inMobiNativeWrapper, Boolean bool, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, InMobiNativeAd inMobiNativeAd) {
        this.f18894kowloon = inMobiNativeWrapper;
        this.f18893arytenoidectomy = bool.booleanValue();
        this.f18895monoploid = mediationAdLoadCallback;
        this.f18896polloi = inMobiNativeAd;
        setOverrideImpressionRecording(true);
    }

    public void mapUnifiedNativeAd(Context context) {
        if (this.f18894kowloon.getAdTitle() != null) {
            setHeadline(this.f18894kowloon.getAdTitle());
        }
        if (this.f18894kowloon.getAdDescription() != null) {
            setBody(this.f18894kowloon.getAdDescription());
        }
        if (this.f18894kowloon.getAdCtaText() != null) {
            setCallToAction(this.f18894kowloon.getAdCtaText());
        }
        if (this.f18894kowloon.getAdvertiserName() != null) {
            setAdvertiser(this.f18894kowloon.getAdvertiserName());
        }
        setStarRating(Double.valueOf(this.f18894kowloon.getAdRating()));
        MediaView mediaView = this.f18894kowloon.getMediaView();
        if (mediaView != null) {
            setMediaView(mediaView);
        }
        setHasVideoContent(this.f18894kowloon.isVideo().booleanValue());
        if (this.f18894kowloon.getAdIconUrl() != null) {
            try {
                URL url = new URL(this.f18894kowloon.getAdIconUrl());
                Uri uri = Uri.parse(url.toURI().toString());
                HashMap map = new HashMap();
                if (this.f18893arytenoidectomy) {
                    setIcon(new idolatry.attabal(null, uri, 1.0d));
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new idolatry.attabal(new ColorDrawable(0), null, 1.0d));
                    setImages(arrayList);
                } else {
                    map.put("icon_key", url);
                }
                if (!this.f18893arytenoidectomy) {
                    new com.google.ads.mediation.inmobi.attabal(new attabal(uri)).execute(map);
                    return;
                }
                MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback = this.f18895monoploid;
                if (mediationAdLoadCallback != null) {
                    this.f18896polloi.mediationNativeAdCallback = mediationAdLoadCallback.onSuccess(this);
                }
            } catch (MalformedURLException | URISyntaxException e) {
                AdError adErrorCreateAdapterError = InMobiConstants.createAdapterError(108, e.getLocalizedMessage());
                String str = InMobiMediationAdapter.ERROR_MESSAGE_FOR_INVALID_ACCOUNTID;
                adErrorCreateAdapterError.toString();
                this.f18895monoploid.onFailure(adErrorCreateAdapterError);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        View view2 = map.get("3001");
        View view3 = map.get("3004");
        View view4 = map.get("3003");
        View view5 = map.get("3002");
        View view6 = map.get("3005");
        View view7 = map.get("3009");
        InMobiNativeViewData.Builder builder = new InMobiNativeViewData.Builder((ViewGroup) view);
        if (view2 != null) {
            builder.setTitleView(view2);
        }
        if (view3 != null) {
            builder.setDescriptionView(view3);
        }
        if (view4 instanceof ImageView) {
            builder.setIconView((ImageView) view4);
        }
        if (view5 != null) {
            builder.setCTAView(view5);
        }
        if (view6 != null) {
            builder.setAdvertiserView(view6);
        }
        if (view7 != null) {
            builder.setRatingView(view7);
        }
        this.f18894kowloon.registerForTracking(builder.build());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        this.f18894kowloon.unTrackViews();
    }
}
