package com.google.android.gms.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AdRequest {

    @NonNull
    public static final String DEVICE_ID_EMULATOR = "B3EEABB8EE11C2BE770B684D95219ECB";
    public static final int ERROR_CODE_APP_ID_MISSING = 8;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_AD_STRING = 11;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_MEDIATION_NO_FILL = 9;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int ERROR_CODE_REQUEST_ID_MISMATCH = 10;
    public static final int MAX_CONTENT_URL_LENGTH = 512;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzeh f10629a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class Builder extends AbstractAdRequestBuilder<Builder> {
        @NonNull
        public AdRequest build() {
            return new AdRequest(this);
        }

        @Override // com.google.android.gms.ads.AbstractAdRequestBuilder
        @NonNull
        public Builder self() {
            return this;
        }
    }

    public AdRequest(AbstractAdRequestBuilder abstractAdRequestBuilder) {
        this.f10629a = new zzeh(abstractAdRequestBuilder.f10616a);
    }

    @Nullable
    public String getAdString() {
        return this.f10629a.zzn();
    }

    @NonNull
    public String getContentUrl() {
        return this.f10629a.zza();
    }

    @Nullable
    @Deprecated
    public <T extends CustomEvent> Bundle getCustomEventExtrasBundle(@NonNull Class<T> cls) {
        return this.f10629a.zze(cls);
    }

    @NonNull
    public Bundle getCustomTargeting() {
        return this.f10629a.zzk();
    }

    @NonNull
    public Set<String> getKeywords() {
        return this.f10629a.zzc();
    }

    @NonNull
    public List<String> getNeighboringContentUrls() {
        return this.f10629a.zzb();
    }

    @Nullable
    public <T extends MediationExtrasReceiver> Bundle getNetworkExtrasBundle(@NonNull Class<T> cls) {
        return this.f10629a.zzd(cls);
    }

    public long getPlacementId() {
        return this.f10629a.zzr();
    }

    @NonNull
    public String getRequestAgent() {
        return this.f10629a.zzg();
    }

    public boolean isTestDevice(@NonNull Context context) {
        return this.f10629a.zzh(context);
    }

    public final zzeh zza() {
        return this.f10629a;
    }
}
