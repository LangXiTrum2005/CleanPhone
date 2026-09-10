package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public final class zzclh {
    private VersionInfoParcel zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzclh zza(VersionInfoParcel versionInfoParcel) {
        this.zza = versionInfoParcel;
        return this;
    }

    public final zzclh zzb(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzclh zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final /* synthetic */ VersionInfoParcel zzd() {
        return this.zza;
    }

    public final /* synthetic */ Context zze() {
        return this.zzb;
    }

    public final /* synthetic */ long zzf() {
        return this.zzc;
    }

    public final /* synthetic */ WeakReference zzg() {
        return this.zzd;
    }
}
