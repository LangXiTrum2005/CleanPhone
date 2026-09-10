package com.google.android.gms.ads.preload;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class PreloadConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdFormat f11548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AdRequest f11549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11550d;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f11551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AdFormat f11552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AdRequest f11553c = new AdRequest.Builder().build();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11554d;

        public Builder(@NonNull String str) {
            this.f11551a = str;
        }

        @NonNull
        public PreloadConfiguration build() {
            return new PreloadConfiguration(this);
        }

        @NonNull
        public Builder setAdRequest(@NonNull AdRequest adRequest) {
            this.f11553c = adRequest;
            return this;
        }

        @NonNull
        public Builder setBufferSize(int i10) {
            this.f11554d = i10;
            return this;
        }

        @Deprecated
        public Builder(@NonNull String str, @NonNull AdFormat adFormat) {
            this.f11551a = str;
            this.f11552b = adFormat;
        }
    }

    public /* synthetic */ PreloadConfiguration(Builder builder) {
        this.f11547a = builder.f11551a;
        this.f11548b = builder.f11552b;
        this.f11549c = builder.f11553c;
        this.f11550d = builder.f11554d;
    }

    @NonNull
    @Deprecated
    public AdFormat getAdFormat() {
        AdFormat adFormat = this.f11548b;
        return adFormat == null ? AdFormat.INTERSTITIAL : adFormat;
    }

    @NonNull
    public AdRequest getAdRequest() {
        return this.f11549c;
    }

    @NonNull
    public String getAdUnitId() {
        return this.f11547a;
    }

    public int getBufferSize() {
        return this.f11550d;
    }
}
