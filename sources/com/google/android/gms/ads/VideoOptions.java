package com.google.android.gms.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.ads.internal.client.zzfw;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class VideoOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f10674c;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f10675a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f10676b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10677c = false;

        @NonNull
        public VideoOptions build() {
            return new VideoOptions(this);
        }

        @NonNull
        public Builder setClickToExpandRequested(boolean z10) {
            this.f10677c = z10;
            return this;
        }

        @NonNull
        public Builder setCustomControlsRequested(boolean z10) {
            this.f10676b = z10;
            return this;
        }

        @NonNull
        public Builder setStartMuted(boolean z10) {
            this.f10675a = z10;
            return this;
        }
    }

    public /* synthetic */ VideoOptions(Builder builder) {
        this.f10672a = builder.f10675a;
        this.f10673b = builder.f10676b;
        this.f10674c = builder.f10677c;
    }

    public boolean getClickToExpandRequested() {
        return this.f10674c;
    }

    public boolean getCustomControlsRequested() {
        return this.f10673b;
    }

    public boolean getStartMuted() {
        return this.f10672a;
    }

    public VideoOptions(zzfw zzfwVar) {
        this.f10672a = zzfwVar.zza;
        this.f10673b = zzfwVar.zzb;
        this.f10674c = zzfwVar.zzc;
    }
}
