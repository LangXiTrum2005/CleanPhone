package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzrw extends AudioTrack$StreamEventCallback {
    final /* synthetic */ zzry zza;

    public zzrw(zzry zzryVar) {
        Objects.requireNonNull(zzryVar);
        this.zza = zzryVar;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i2) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzrv.zza);
        zzedVarZzs.zze();
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzrt.zza);
        zzedVarZzs.zze();
    }

    public final void onTearDown(AudioTrack audioTrack) {
        zzed zzedVarZzs = this.zza.zza.zzs();
        zzedVarZzs.zzd(-1, zzru.zza);
        zzedVarZzs.zze();
    }
}
