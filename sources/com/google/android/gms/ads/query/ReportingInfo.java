package com.google.android.gms.ads.query;

import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbub;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
@Deprecated
public final class ReportingInfo {
    private final zzbub zza;

    @KeepForSdk
    @Deprecated
    public static final class Builder {
        private final zzbua zza;

        @KeepForSdk
        @Deprecated
        public Builder(@NonNull View view) {
            zzbua zzbuaVar = new zzbua();
            this.zza = zzbuaVar;
            zzbuaVar.zzb(view);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public ReportingInfo build() {
            return new ReportingInfo(this, null);
        }

        @NonNull
        @KeepForSdk
        @Deprecated
        public Builder setAssetViews(@NonNull Map<String, View> map) {
            this.zza.zzc(map);
            return this;
        }
    }

    public /* synthetic */ ReportingInfo(Builder builder, zzb zzbVar) {
        this.zza = new zzbub(builder.zza);
    }

    @KeepForSdk
    @Deprecated
    public void recordClick(@NonNull List<Uri> list) {
        this.zza.zza(list);
    }

    @KeepForSdk
    @Deprecated
    public void recordImpression(@NonNull List<Uri> list) {
        this.zza.zzb(list);
    }

    @KeepForSdk
    @Deprecated
    public void reportTouchEvent(@NonNull MotionEvent motionEvent) {
        this.zza.zzc(motionEvent);
    }

    @KeepForSdk
    @Deprecated
    public void updateClickUrl(@NonNull Uri uri, @NonNull UpdateClickUrlCallback updateClickUrlCallback) {
        this.zza.zzd(uri, updateClickUrlCallback);
    }

    @KeepForSdk
    @Deprecated
    public void updateImpressionUrls(@NonNull List<Uri> list, @NonNull UpdateImpressionUrlsCallback updateImpressionUrlsCallback) {
        this.zza.zze(list, updateImpressionUrlsCallback);
    }
}
