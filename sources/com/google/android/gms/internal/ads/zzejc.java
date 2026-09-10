package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzejc {
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzejc(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesA = MeasurementManagerFutures.a(this.zzb);
            this.zza = measurementManagerFuturesA;
            return measurementManagerFuturesA == null ? zzgym.zzc(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesA.b();
        } catch (Exception e2) {
            return zzgym.zzc(e2);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.c(uri, inputEvent);
        } catch (Exception e2) {
            return zzgym.zzc(e2);
        }
    }
}
