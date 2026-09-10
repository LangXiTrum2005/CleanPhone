package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private MaxAdFormat f10352a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f10353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f10354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f10355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f10356e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f10357f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private View f10358g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private View f10359h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private View f10360i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f10361j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f10362k;
        private Double l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f10352a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f10354c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f10355d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f10356e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f10357f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f10358g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f10361j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.f10362k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f10360i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f10359h = view;
            return this;
        }

        public Builder setStarRating(Double d10) {
            this.l = d10;
            return this;
        }

        public Builder setTitle(String str) {
            this.f10353b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f10352a;
        this.title = builder.f10353b;
        this.advertiser = builder.f10354c;
        this.body = builder.f10355d;
        this.callToAction = builder.f10356e;
        this.icon = builder.f10357f;
        this.iconView = builder.f10358g;
        this.optionsView = builder.f10359h;
        this.mediaView = builder.f10360i;
        this.mainImage = builder.f10361j;
        this.mediaContentAspectRatio = builder.f10362k;
        Double d10 = builder.l;
        this.starRating = (d10 == null || d10.doubleValue() < 3.0d) ? null : d10;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class MaxNativeAdImage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Drawable f10363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Uri f10364b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f10363a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f10363a;
        }

        @Nullable
        public Uri getUri() {
            return this.f10364b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f10364b = uri;
        }
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
