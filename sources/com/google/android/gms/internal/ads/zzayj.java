package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzayj implements Runnable {
    final /* synthetic */ zzayk zza;

    public zzayj(zzayk zzaykVar) {
        Objects.requireNonNull(zzaykVar);
        this.zza = zzaykVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzayk zzaykVar = this.zza;
        if (zzaykVar.zzb != null) {
            return;
        }
        synchronized (zzayk.zzd) {
            if (zzaykVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                zBooleanValue = ((Boolean) zzbgk.zzdj.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzayk.zza = zzfwb.zzb(this.zza.zzb().zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z2);
            zzayk.zzd.open();
        }
    }
}
