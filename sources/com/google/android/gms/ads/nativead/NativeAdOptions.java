package com.google.android.gms.ads.nativead;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoOptions;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
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
    public static final int SWIPE_GESTURE_DIRECTION_DOWN = 8;
    public static final int SWIPE_GESTURE_DIRECTION_LEFT = 2;
    public static final int SWIPE_GESTURE_DIRECTION_RIGHT = 1;
    public static final int SWIPE_GESTURE_DIRECTION_UP = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f11318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VideoOptions f11322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f11323f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f11324g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f11325h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f11326i;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public @interface AdChoicesPlacement {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public VideoOptions f11330d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11327a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f11328b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f11329c = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11331e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f11332f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f11333g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f11334h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f11335i = 1;

        @NonNull
        public NativeAdOptions build() {
            return new NativeAdOptions(this);
        }

        @NonNull
        public Builder enableCustomClickGestureDirection(@SwipeGestureDirection int i10, boolean z10) {
            this.f11333g = z10;
            this.f11334h = i10;
            return this;
        }

        @NonNull
        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i10) {
            this.f11331e = i10;
            return this;
        }

        @NonNull
        public Builder setMediaAspectRatio(@NativeMediaAspectRatio int i10) {
            this.f11328b = i10;
            return this;
        }

        @NonNull
        public Builder setRequestCustomMuteThisAd(boolean z10) {
            this.f11332f = z10;
            return this;
        }

        @NonNull
        public Builder setRequestMultipleImages(boolean z10) {
            this.f11329c = z10;
            return this;
        }

        @NonNull
        public Builder setReturnUrlsForImageAssets(boolean z10) {
            this.f11327a = z10;
            return this;
        }

        @NonNull
        public Builder setVideoOptions(@NonNull VideoOptions videoOptions) {
            this.f11330d = videoOptions;
            return this;
        }

        @NonNull
        public final Builder zzi(int i10) {
            this.f11335i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public @interface NativeMediaAspectRatio {
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public @interface SwipeGestureDirection {
    }

    public /* synthetic */ NativeAdOptions(Builder builder) {
        this.f11318a = builder.f11327a;
        this.f11319b = builder.f11328b;
        this.f11320c = builder.f11329c;
        this.f11321d = builder.f11331e;
        this.f11322e = builder.f11330d;
        this.f11323f = builder.f11332f;
        this.f11324g = builder.f11333g;
        this.f11325h = builder.f11334h;
        this.f11326i = builder.f11335i;
    }

    public int getAdChoicesPlacement() {
        return this.f11321d;
    }

    public int getMediaAspectRatio() {
        return this.f11319b;
    }

    @Nullable
    public VideoOptions getVideoOptions() {
        return this.f11322e;
    }

    public boolean shouldRequestMultipleImages() {
        return this.f11320c;
    }

    public boolean shouldReturnUrlsForImageAssets() {
        return this.f11318a;
    }

    public final boolean zza() {
        return this.f11323f;
    }

    public final int zzb() {
        return this.f11325h;
    }

    public final boolean zzc() {
        return this.f11324g;
    }

    public final int zzd() {
        return this.f11326i;
    }
}
