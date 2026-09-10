package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public class zzra {
    protected volatile zzrq zza;
    private volatile zzpm zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzra)) {
            return false;
        }
        zzra zzraVar = (zzra) obj;
        zzrq zzrqVar = this.zza;
        zzrq zzrqVar2 = zzraVar.zza;
        if (zzrqVar == null && zzrqVar2 == null) {
            return zzb().equals(zzraVar.zzb());
        }
        if (zzrqVar != null && zzrqVar2 != null) {
            return zzrqVar.equals(zzrqVar2);
        }
        if (zzrqVar != null) {
            zzraVar.zzd(zzrqVar.zzl());
            return zzrqVar.equals(zzraVar.zza);
        }
        zzd(zzrqVar2.zzl());
        return this.zza.equals(zzrqVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzb != null) {
            return ((zzpk) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzn();
        }
        return 0;
    }

    public final zzpm zzb() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzpm.zzb;
                } else {
                    this.zzb = this.zza.zzk();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final zzrq zzc(zzrq zzrqVar) {
        zzrq zzrqVar2 = this.zza;
        this.zzb = null;
        this.zza = zzrqVar;
        return zzrqVar2;
    }

    public final void zzd(zzrq zzrqVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zzrqVar;
                this.zzb = zzpm.zzb;
            } catch (zzqu unused) {
                this.zzc = true;
                this.zza = zzrqVar;
                this.zzb = zzpm.zzb;
            }
        }
    }
}
