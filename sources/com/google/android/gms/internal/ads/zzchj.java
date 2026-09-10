package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzchj implements zzlg {
    private final zzaan zza = new zzaan(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zza(zzpn zzpnVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzb(zzlf zzlfVar, zzyh zzyhVar, zzzw[] zzzwVarArr) {
        int i2;
        this.zzf = 0;
        for (zzzw zzzwVar : zzzwVarArr) {
            if (zzzwVar != null) {
                int i3 = this.zzf;
                int i4 = zzzwVar.zza().zzc;
                if (i4 == 0) {
                    i2 = 144310272;
                } else if (i4 == 1) {
                    i2 = 13107200;
                } else if (i4 != 2) {
                    i2 = 131072;
                    if (i4 != 3 && i4 != 5 && i4 != 6) {
                        throw new IllegalArgumentException();
                    }
                } else {
                    i2 = 131072000;
                }
                this.zzf = i3 + i2;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzc(zzpn zzpnVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final void zzd(zzpn zzpnVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final zzaah zze(zzpn zzpnVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final long zzf(zzpn zzpnVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzg(zzpn zzpnVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzh(zzlf zzlfVar) {
        char c2;
        long j = zzlfVar.zze;
        boolean z2 = true;
        if (j > this.zzc) {
            c2 = 0;
        } else {
            c2 = j < this.zzb ? (char) 2 : (char) 1;
        }
        int iZzg = this.zza.zzg();
        int i2 = this.zzf;
        if (c2 != 2 && (c2 != 1 || !this.zzg || iZzg >= i2)) {
            z2 = false;
        }
        this.zzg = z2;
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzlg
    public final boolean zzi(zzlf zzlfVar) {
        long j = zzlfVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzlfVar.zze >= j;
    }

    public final synchronized void zzk(int i2) {
        this.zzb = ((long) i2) * 1000;
    }

    public final synchronized void zzl(int i2) {
        this.zzc = ((long) i2) * 1000;
    }

    public final synchronized void zzm(int i2) {
        this.zzd = ((long) i2) * 1000;
    }

    public final synchronized void zzn(int i2) {
        this.zze = ((long) i2) * 1000;
    }

    public final void zzo(boolean z2) {
        this.zzf = 0;
        this.zzg = false;
        if (z2) {
            this.zza.zze();
        }
    }
}
