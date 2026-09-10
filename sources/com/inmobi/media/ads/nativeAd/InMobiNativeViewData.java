package com.inmobi.media.ads.nativeAd;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001&R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0018\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR \u0010%\u001a\b\u0012\u0004\u0012\u00020\b0 8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "", "Landroid/view/ViewGroup;", "a", "Landroid/view/ViewGroup;", "getParentView$media_release", "()Landroid/view/ViewGroup;", "parentView", "Landroid/view/View;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Landroid/view/View;", "getTitleView$media_release", "()Landroid/view/View;", "titleView", "c", "getDescriptionView$media_release", "descriptionView", "Landroid/widget/ImageView;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, "Landroid/widget/ImageView;", "getIconView$media_release", "()Landroid/widget/ImageView;", "iconView", "e", "getCtaView$media_release", "ctaView", "f", "getRatingView$media_release", "ratingView", "g", "getAdvertiserView$media_release", "advertiserView", "", "h", "Ljava/util/List;", "getExtraViews$media_release", "()Ljava/util/List;", "extraViews", "Builder", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiNativeViewData {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final ViewGroup parentView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final View titleView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final View descriptionView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final ImageView iconView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final View ctaView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final View ratingView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final View advertiserView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final List extraViews;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0011\u0010\tJ\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\tJ\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0015\u0010\tJ\u001b\u0010\u0018\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData$Builder;", "", "Landroid/view/ViewGroup;", "parentView", "<init>", "(Landroid/view/ViewGroup;)V", "Landroid/view/View;", "titleView", "setTitleView", "(Landroid/view/View;)Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData$Builder;", "descriptionView", "setDescriptionView", "Landroid/widget/ImageView;", "iconView", "setIconView", "(Landroid/widget/ImageView;)Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData$Builder;", "ctaView", "setCTAView", "ratingView", "setRatingView", "advertiserView", "setAdvertiserView", "", "extraViews", "setExtraViews", "(Ljava/util/List;)Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData$Builder;", "Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "build", "()Lcom/inmobi/media/ads/nativeAd/InMobiNativeViewData;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        public final ViewGroup a;
        public View b;
        public View c;
        public ImageView d;
        public View e;
        public View f;
        public View g;
        public final ArrayList h;

        public Builder(ViewGroup parentView) {
            Intrinsics.checkNotNullParameter(parentView, "parentView");
            this.a = parentView;
            this.h = new ArrayList();
        }

        public final InMobiNativeViewData build() {
            return new InMobiNativeViewData(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
        }

        public final Builder setAdvertiserView(View advertiserView) {
            this.g = advertiserView;
            return this;
        }

        public final Builder setCTAView(View ctaView) {
            this.e = ctaView;
            return this;
        }

        public final Builder setDescriptionView(View descriptionView) {
            this.c = descriptionView;
            return this;
        }

        public final Builder setExtraViews(List<? extends View> extraViews) {
            Intrinsics.checkNotNullParameter(extraViews, "extraViews");
            this.h.addAll(extraViews);
            return this;
        }

        public final Builder setIconView(ImageView iconView) {
            this.d = iconView;
            return this;
        }

        public final Builder setRatingView(View ratingView) {
            this.f = ratingView;
            return this;
        }

        public final Builder setTitleView(View titleView) {
            this.b = titleView;
            return this;
        }
    }

    public InMobiNativeViewData(ViewGroup viewGroup, View view, View view2, ImageView imageView, View view3, View view4, View view5, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this.parentView = viewGroup;
        this.titleView = view;
        this.descriptionView = view2;
        this.iconView = imageView;
        this.ctaView = view3;
        this.ratingView = view4;
        this.advertiserView = view5;
        this.extraViews = list;
    }

    /* JADX INFO: renamed from: getAdvertiserView$media_release, reason: from getter */
    public final View getAdvertiserView() {
        return this.advertiserView;
    }

    /* JADX INFO: renamed from: getCtaView$media_release, reason: from getter */
    public final View getCtaView() {
        return this.ctaView;
    }

    /* JADX INFO: renamed from: getDescriptionView$media_release, reason: from getter */
    public final View getDescriptionView() {
        return this.descriptionView;
    }

    public final List<View> getExtraViews$media_release() {
        return this.extraViews;
    }

    /* JADX INFO: renamed from: getIconView$media_release, reason: from getter */
    public final ImageView getIconView() {
        return this.iconView;
    }

    /* JADX INFO: renamed from: getParentView$media_release, reason: from getter */
    public final ViewGroup getParentView() {
        return this.parentView;
    }

    /* JADX INFO: renamed from: getRatingView$media_release, reason: from getter */
    public final View getRatingView() {
        return this.ratingView;
    }

    /* JADX INFO: renamed from: getTitleView$media_release, reason: from getter */
    public final View getTitleView() {
        return this.titleView;
    }
}
