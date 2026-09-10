package com.applovin.mediation.nativeAds;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f10381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f10383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f10384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f10385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f10386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f10387g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f10388h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f10389i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f10390j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f10391k;
        private int l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f10392m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f10393n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f10381a, this.f10382b, this.f10383c, this.f10384d, this.f10385e, this.f10386f, this.f10387g, this.f10390j, this.f10388h, this.f10389i, this.f10391k, this.l, this.f10392m, this.f10393n);
        }

        public Builder setAdvertiserTextViewId(int i10) {
            this.f10384d = i10;
            return this;
        }

        public Builder setBodyTextViewId(int i10) {
            this.f10385e = i10;
            return this;
        }

        public Builder setCallToActionButtonId(int i10) {
            this.f10392m = i10;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i10) {
            this.f10387g = i10;
            return this;
        }

        public Builder setIconImageViewId(int i10) {
            this.f10386f = i10;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i10) {
            this.l = i10;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i10) {
            this.f10391k = i10;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i10) {
            this.f10389i = i10;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i10) {
            this.f10388h = i10;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i10) {
            this.f10390j = i10;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f10393n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i10) {
            this.f10383c = i10;
            return this;
        }

        public Builder(int i10) {
            this(i10, null);
        }

        private Builder(int i10, View view) {
            this.f10383c = -1;
            this.f10384d = -1;
            this.f10385e = -1;
            this.f10386f = -1;
            this.f10387g = -1;
            this.f10388h = -1;
            this.f10389i = -1;
            this.f10390j = -1;
            this.f10391k = -1;
            this.l = -1;
            this.f10392m = -1;
            this.f10382b = i10;
            this.f10381a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, String str) {
        this.mainView = view;
        this.layoutResourceId = i10;
        this.titleTextViewId = i11;
        this.advertiserTextViewId = i12;
        this.bodyTextViewId = i13;
        this.iconImageViewId = i14;
        this.iconContentViewId = i15;
        this.starRatingContentViewGroupId = i16;
        this.optionsContentViewGroupId = i17;
        this.optionsContentFrameLayoutId = i18;
        this.mediaContentViewGroupId = i19;
        this.mediaContentFrameLayoutId = i20;
        this.callToActionButtonId = i21;
        this.templateType = str;
    }
}
