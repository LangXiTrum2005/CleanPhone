package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public class zzibm {
    protected volatile zzicc zza;
    private volatile zzhzl zzb;
    private volatile boolean zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzibm)) {
            return false;
        }
        zzibm zzibmVar = (zzibm) obj;
        zzicc zziccVar = this.zza;
        zzicc zziccVar2 = zzibmVar.zza;
        if (zziccVar == null && zziccVar2 == null) {
            return zzc().equals(zzibmVar.zzc());
        }
        if (zziccVar != null && zziccVar2 != null) {
            return zziccVar.equals(zziccVar2);
        }
        if (zziccVar != null) {
            zzibmVar.zzd(zziccVar.zzbw());
            return zziccVar.equals(zzibmVar.zza);
        }
        zzd(zziccVar2.zzbw());
        return this.zza.equals(zziccVar2);
    }

    public int hashCode() {
        return 1;
    }

    public final zzicc zza(zzicc zziccVar) {
        zzicc zziccVar2 = this.zza;
        this.zzb = null;
        this.zza = zziccVar;
        return zziccVar2;
    }

    public final int zzb() {
        if (this.zzb != null) {
            return ((zzhzj) this.zzb).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzbr();
        }
        return 0;
    }

    public final zzhzl zzc() {
        if (this.zzb != null) {
            return this.zzb;
        }
        synchronized (this) {
            try {
                if (this.zzb != null) {
                    return this.zzb;
                }
                if (this.zza == null) {
                    this.zzb = zzhzl.zzb;
                } else {
                    this.zzb = this.zza.zzaM();
                }
                return this.zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(zzicc zziccVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza != null) {
                return;
            }
            try {
                this.zza = zziccVar;
                this.zzb = zzhzl.zzb;
            } catch (zzibg unused) {
                this.zzc = true;
                this.zza = zziccVar;
                this.zzb = zzhzl.zzb;
            }
        }
    }
}
