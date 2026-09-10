package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.Nullable;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzecs {

    @Nullable
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzecs(Context context) {
        this.zzb = context;
    }

    public final AI zza() {
        try {
            MeasurementManagerFutures measurementManagerFuturesFrom = MeasurementManagerFutures.from(this.zzb);
            this.zza = measurementManagerFuturesFrom;
            return measurementManagerFuturesFrom == null ? zzgch.zzg(new IllegalStateException("MeasurementManagerFutures is null")) : measurementManagerFuturesFrom.getMeasurementApiStatusAsync();
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }

    public final AI zzb(Uri uri, InputEvent inputEvent) {
        try {
            MeasurementManagerFutures measurementManagerFutures = this.zza;
            Objects.requireNonNull(measurementManagerFutures);
            return measurementManagerFutures.registerSourceAsync(uri, inputEvent);
        } catch (Exception e) {
            return zzgch.zzg(e);
        }
    }
}
