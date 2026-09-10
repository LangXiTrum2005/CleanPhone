package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdjn extends zzdgi {
    private boolean zzb;

    public zzdjn(Set set) {
        super(set);
    }

    public final void zza() {
        zzs(zzdjm.zza);
    }

    public final void zzb() {
        zzs(zzdji.zza);
    }

    public final synchronized void zzc() {
        zzs(zzdjj.zza);
        this.zzb = true;
    }

    public final synchronized void zzd() {
        try {
            if (!this.zzb) {
                zzs(zzdjl.zza);
                this.zzb = true;
            }
            zzs(zzdjk.zza);
        } catch (Throwable th) {
            throw th;
        }
    }
}
