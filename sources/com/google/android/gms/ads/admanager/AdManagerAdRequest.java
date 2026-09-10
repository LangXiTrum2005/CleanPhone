package com.google.android.gms.ads.admanager;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class AdManagerAdRequest extends AdRequest {

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class Builder extends AbstractAdRequestBuilder<Builder> {
        @NonNull
        public Builder addCategoryExclusion(@NonNull String str) {
            this.f10616a.zzm(str);
            return this;
        }

        @NonNull
        public AdManagerAdRequest build() {
            return new AdManagerAdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public final /* bridge */ /* synthetic */ AbstractAdRequestBuilder self() {
            return this;
        }

        @NonNull
        public Builder setPublisherProvidedId(@NonNull String str) {
            this.f10616a.zzi(str);
            return this;
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public Builder self() {
            return this;
        }
    }

    @Override // com.google.android.gms.ads.AdRequest
    @NonNull
    public Bundle getCustomTargeting() {
        return this.f10629a.zzk();
    }

    @NonNull
    public String getPublisherProvidedId() {
        return this.f10629a.zzf();
    }
}
