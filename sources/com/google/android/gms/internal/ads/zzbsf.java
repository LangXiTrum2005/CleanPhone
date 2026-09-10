package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbsf {
    static final com.google.android.gms.ads.internal.util.zzbc zza = new zzbsd();
    static final com.google.android.gms.ads.internal.util.zzbc zzb = new zzbse();
    private final zzbrr zzc;

    public zzbsf(Context context, VersionInfoParcel versionInfoParcel, String str, @Nullable zzfnr zzfnrVar) {
        this.zzc = new zzbrr(context, versionInfoParcel, str, zza, zzb, zzfnrVar);
    }

    public final zzbrv zza(String str, zzbry zzbryVar, zzbrx zzbrxVar) {
        return new zzbsj(this.zzc, str, zzbryVar, zzbrxVar);
    }

    public final zzbso zzb() {
        return new zzbso(this.zzc);
    }

    public final void zzc() {
        this.zzc.zzc();
    }
}
