package com.google.android.gms.ads.formats;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_LEFT = 0;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_ANY = 1;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_LANDSCAPE = 2;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_PORTRAIT = 3;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_SQUARE = 4;
    public static final int NATIVE_MEDIA_ASPECT_RATIO_UNKNOWN = 0;
    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final VideoOptions f10695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f10696g;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public @interface AdChoicesPlacement {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VideoOptions f10701e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10697a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10698b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10699c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10700d = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f10702f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f10703g = false;

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i10) {
            this.f10702f = i10;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setImageOrientation(int i10) {
            this.f10698b = i10;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i10) {
            this.f10699c = i10;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z10) {
            this.f10703g = z10;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z10) {
            this.f10700d = z10;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z10) {
            this.f10697a = z10;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
            this.f10701e = videoOptions;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public @interface NativeMediaAspectRatio {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f10690a = builder.f10697a;
        this.f10691b = builder.f10698b;
        this.f10692c = builder.f10699c;
        this.f10693d = builder.f10700d;
        this.f10694e = builder.f10702f;
        this.f10695f = builder.f10701e;
        this.f10696g = builder.f10703g;
    }

    public int getAdChoicesPlacement() {
        return this.f10694e;
    }

    @Deprecated
    public int getImageOrientation() {
        return this.f10691b;
    }

    public int getMediaAspectRatio() {
        return this.f10692c;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f10695f;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f10693d;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f10690a;
    }

    public final boolean zza() {
        return this.f10696g;
    }
}
