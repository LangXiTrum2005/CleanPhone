package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: loaded from: classes4.dex */
final class zzanb {
    private String zza;
    private int zzb;
    private boolean zzc;
    private int zzd;
    private boolean zze;
    private float zzk;
    private String zzl;
    private Layout.Alignment zzo;
    private Layout.Alignment zzp;
    private zzamu zzr;
    private String zzt;
    private String zzu;
    private int zzf = -1;
    private int zzg = -1;
    private int zzh = -1;
    private int zzi = -1;
    private int zzj = -1;
    private int zzm = -1;
    private int zzn = -1;
    private int zzq = -1;
    private float zzs = Float.MAX_VALUE;

    public final Layout.Alignment zzA() {
        return this.zzp;
    }

    public final zzanb zzB(Layout.Alignment alignment) {
        this.zzp = alignment;
        return this;
    }

    public final boolean zzC() {
        return this.zzq == 1;
    }

    public final zzanb zzD(boolean z2) {
        this.zzq = z2 ? 1 : 0;
        return this;
    }

    public final zzamu zzE() {
        return this.zzr;
    }

    public final zzanb zzF(zzamu zzamuVar) {
        this.zzr = zzamuVar;
        return this;
    }

    public final zzanb zzG(float f) {
        this.zzk = f;
        return this;
    }

    public final zzanb zzH(int i2) {
        this.zzj = i2;
        return this;
    }

    public final int zzI() {
        return this.zzj;
    }

    public final float zzJ() {
        return this.zzk;
    }

    public final zzanb zzK(String str) {
        this.zzt = str;
        return this;
    }

    public final String zzL() {
        return this.zzt;
    }

    public final zzanb zzM(String str) {
        this.zzu = str;
        return this;
    }

    public final String zzN() {
        return this.zzu;
    }

    public final int zza() {
        int i2 = this.zzh;
        if (i2 == -1 && this.zzi == -1) {
            return -1;
        }
        return (i2 == 1 ? 1 : 0) | (this.zzi == 1 ? 2 : 0);
    }

    public final boolean zzb() {
        return this.zzf == 1;
    }

    public final zzanb zzc(boolean z2) {
        this.zzf = z2 ? 1 : 0;
        return this;
    }

    public final boolean zzd() {
        return this.zzg == 1;
    }

    public final zzanb zze(boolean z2) {
        this.zzg = z2 ? 1 : 0;
        return this;
    }

    public final zzanb zzf(boolean z2) {
        this.zzh = z2 ? 1 : 0;
        return this;
    }

    public final zzanb zzg(boolean z2) {
        this.zzi = z2 ? 1 : 0;
        return this;
    }

    public final String zzh() {
        return this.zza;
    }

    public final zzanb zzi(String str) {
        this.zza = str;
        return this;
    }

    public final int zzj() {
        if (this.zzc) {
            return this.zzb;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public final zzanb zzk(int i2) {
        this.zzb = i2;
        this.zzc = true;
        return this;
    }

    public final boolean zzl() {
        return this.zzc;
    }

    public final int zzm() {
        if (this.zze) {
            return this.zzd;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public final zzanb zzn(int i2) {
        this.zzd = i2;
        this.zze = true;
        return this;
    }

    public final boolean zzo() {
        return this.zze;
    }

    public final zzanb zzp(float f) {
        this.zzs = f;
        return this;
    }

    public final float zzq() {
        return this.zzs;
    }

    public final zzanb zzr(zzanb zzanbVar) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zzanbVar != null) {
            if (!this.zzc && zzanbVar.zzc) {
                zzk(zzanbVar.zzb);
            }
            if (this.zzh == -1) {
                this.zzh = zzanbVar.zzh;
            }
            if (this.zzi == -1) {
                this.zzi = zzanbVar.zzi;
            }
            if (this.zza == null && (str = zzanbVar.zza) != null) {
                this.zza = str;
            }
            if (this.zzf == -1) {
                this.zzf = zzanbVar.zzf;
            }
            if (this.zzg == -1) {
                this.zzg = zzanbVar.zzg;
            }
            if (this.zzn == -1) {
                this.zzn = zzanbVar.zzn;
            }
            if (this.zzo == null && (alignment2 = zzanbVar.zzo) != null) {
                this.zzo = alignment2;
            }
            if (this.zzp == null && (alignment = zzanbVar.zzp) != null) {
                this.zzp = alignment;
            }
            if (this.zzq == -1) {
                this.zzq = zzanbVar.zzq;
            }
            if (this.zzj == -1) {
                this.zzj = zzanbVar.zzj;
                this.zzk = zzanbVar.zzk;
            }
            if (this.zzr == null) {
                this.zzr = zzanbVar.zzr;
            }
            if (this.zzs == Float.MAX_VALUE) {
                this.zzs = zzanbVar.zzs;
            }
            if (this.zzt == null) {
                this.zzt = zzanbVar.zzt;
            }
            if (this.zzu == null) {
                this.zzu = zzanbVar.zzu;
            }
            if (!this.zze && zzanbVar.zze) {
                zzn(zzanbVar.zzd);
            }
            if (this.zzm == -1 && (i2 = zzanbVar.zzm) != -1) {
                this.zzm = i2;
            }
        }
        return this;
    }

    public final zzanb zzs(String str) {
        this.zzl = str;
        return this;
    }

    public final String zzt() {
        return this.zzl;
    }

    public final zzanb zzu(int i2) {
        this.zzm = i2;
        return this;
    }

    public final int zzv() {
        return this.zzm;
    }

    public final zzanb zzw(int i2) {
        this.zzn = i2;
        return this;
    }

    public final int zzx() {
        return this.zzn;
    }

    public final Layout.Alignment zzy() {
        return this.zzo;
    }

    public final zzanb zzz(Layout.Alignment alignment) {
        this.zzo = alignment;
        return this;
    }
}
