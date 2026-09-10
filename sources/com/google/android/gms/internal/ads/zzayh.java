package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzayh implements Runnable {
    final /* synthetic */ zzayi zza;

    public zzayh(zzayi zzayiVar) {
        Objects.requireNonNull(zzayiVar);
        this.zza = zzayiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzayi zzayiVar = this.zza;
        synchronized (zzayiVar.zzp()) {
            if (zzayiVar.zzq()) {
                return;
            }
            zzayiVar.zzr(true);
            try {
                zzayiVar.zzn();
            } catch (Exception e2) {
                this.zza.zzo().zzc(2023, -1L, e2);
            }
            zzayi zzayiVar2 = this.zza;
            synchronized (zzayiVar2.zzp()) {
                zzayiVar2.zzr(false);
            }
        }
    }
}
