package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzpb {
    final /* synthetic */ zzpc zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzwg zze;
    private boolean zzf;
    private boolean zzg;

    public zzpb(zzpc zzpcVar, String str, int i2, zzwg zzwgVar) {
        Objects.requireNonNull(zzpcVar);
        this.zza = zzpcVar;
        this.zzb = str;
        this.zzc = i2;
        this.zzd = zzwgVar == null ? -1L : zzwgVar.zzd;
        if (zzwgVar == null || !zzwgVar.zzb()) {
            return;
        }
        this.zze = zzwgVar;
    }

    public final boolean zza(zzbf zzbfVar, zzbf zzbfVar2) {
        int i2 = this.zzc;
        if (i2 < zzbfVar.zza()) {
            zzpc zzpcVar = this.zza;
            zzbfVar.zzb(i2, zzpcVar.zzj(), 0L);
            int i3 = zzpcVar.zzj().zzn;
            while (true) {
                if (i3 > zzpcVar.zzj().zzo) {
                    i2 = -1;
                    break;
                }
                int iZze = zzbfVar2.zze(zzbfVar.zzf(i3));
                if (iZze != -1) {
                    i2 = zzbfVar2.zzd(iZze, zzpcVar.zzk(), false).zzc;
                    break;
                }
                i3++;
            }
        } else if (i2 >= zzbfVar2.zza()) {
            i2 = -1;
            break;
        }
        this.zzc = i2;
        if (i2 == -1) {
            return false;
        }
        zzwg zzwgVar = this.zze;
        return zzwgVar == null || zzbfVar2.zze(zzwgVar.zza) != -1;
    }

    public final boolean zzb(int i2, zzwg zzwgVar) {
        if (zzwgVar == null) {
            return i2 == this.zzc;
        }
        zzwg zzwgVar2 = this.zze;
        if (zzwgVar2 == null) {
            return !zzwgVar.zzb() && zzwgVar.zzd == this.zzd;
        }
        return zzwgVar.zzd == zzwgVar2.zzd && zzwgVar.zzb == zzwgVar2.zzb && zzwgVar.zzc == zzwgVar2.zzc;
    }

    public final void zzc(int i2, zzwg zzwgVar) {
        if (this.zzd == -1 && i2 == this.zzc && zzwgVar != null) {
            zzpc zzpcVar = this.zza;
            long j = zzwgVar.zzd;
            if (j >= zzpcVar.zzi()) {
                this.zzd = j;
            }
        }
    }

    public final boolean zzd(zzmv zzmvVar) {
        zzwg zzwgVar = zzmvVar.zzd;
        if (zzwgVar == null) {
            return this.zzc != zzmvVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzwgVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbf zzbfVar = zzmvVar.zzb;
        int iZze = zzbfVar.zze(zzwgVar.zza);
        int iZze2 = zzbfVar.zze(this.zze.zza);
        zzwg zzwgVar2 = this.zze;
        if (j2 < zzwgVar2.zzd || iZze < iZze2) {
            return false;
        }
        if (iZze > iZze2) {
            return true;
        }
        if (!zzwgVar.zzb()) {
            int i2 = zzwgVar.zze;
            return i2 == -1 || i2 > zzwgVar2.zzb;
        }
        int i3 = zzwgVar.zzb;
        int i4 = zzwgVar.zzc;
        int i5 = zzwgVar2.zzb;
        if (i3 <= i5) {
            return i3 == i5 && i4 > zzwgVar2.zzc;
        }
        return true;
    }

    public final /* synthetic */ String zze() {
        return this.zzb;
    }

    public final /* synthetic */ int zzf() {
        return this.zzc;
    }

    public final /* synthetic */ long zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzwg zzh() {
        return this.zze;
    }

    public final /* synthetic */ boolean zzi() {
        return this.zzf;
    }

    public final /* synthetic */ void zzj(boolean z2) {
        this.zzf = true;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzg;
    }

    public final /* synthetic */ void zzl(boolean z2) {
        this.zzg = true;
    }
}
