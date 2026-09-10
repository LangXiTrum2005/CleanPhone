package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class zzaml {
    private final zzer zza = new zzer();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final zzcx zza() {
        int i2;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzer zzerVar = this.zza;
        if (zzerVar.zze() == 0 || zzerVar.zzg() != zzerVar.zze() || !this.zzc) {
            return null;
        }
        zzerVar.zzh(0);
        int i3 = this.zzh * this.zzi;
        int[] iArr = new int[i3];
        int i4 = 0;
        while (i4 < i3) {
            int iZzs = zzerVar.zzs();
            if (iZzs != 0) {
                i2 = i4 + 1;
                iArr[i4] = this.zzb[iZzs];
            } else {
                int iZzs2 = zzerVar.zzs();
                if (iZzs2 != 0) {
                    int iZzs3 = iZzs2 & 63;
                    if ((iZzs2 & 64) != 0) {
                        iZzs3 = (iZzs3 << 8) | zzerVar.zzs();
                    }
                    i2 = iZzs3 + i4;
                    Arrays.fill(iArr, i4, i2, (iZzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzerVar.zzs()]);
                }
            }
            i4 = i2;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcw zzcwVar = new zzcw();
        zzcwVar.zzc(bitmapCreateBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    public final /* synthetic */ void zzc(zzer zzerVar, int i2) {
        if (i2 % 5 != 2) {
            return;
        }
        zzer zzerVar2 = zzerVar;
        zzerVar2.zzk(2);
        int[] iArr = this.zzb;
        Arrays.fill(iArr, 0);
        int i3 = i2 / 5;
        int i4 = 0;
        while (i4 < i3) {
            int iZzs = zzerVar2.zzs();
            int iZzs2 = zzerVar2.zzs();
            int iZzs3 = zzerVar2.zzs();
            int iZzs4 = zzerVar2.zzs();
            double d = iZzs2;
            int iZzs5 = zzerVar2.zzs() << 24;
            String str = zzfj.zza;
            double d2 = iZzs3 - 128;
            double d3 = iZzs4 - 128;
            iArr[iZzs] = (Math.max(0, Math.min((int) ((1.402d * d2) + d), 255)) << 16) | iZzs5 | (Math.max(0, Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d3 * 1.772d) + d), 255));
            i4++;
            zzerVar2 = zzerVar;
        }
        this.zzc = true;
    }

    public final /* synthetic */ void zzd(zzer zzerVar, int i2) {
        int iZzx;
        if (i2 < 4) {
            return;
        }
        zzerVar.zzk(3);
        int i3 = i2 - 4;
        if ((zzerVar.zzs() & 128) != 0) {
            if (i3 < 7 || (iZzx = zzerVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzerVar.zzt();
            this.zzi = zzerVar.zzt();
            this.zza.zza(iZzx - 4);
            i3 = i2 - 11;
        }
        zzer zzerVar2 = this.zza;
        int iZzg = zzerVar2.zzg();
        int iZze = zzerVar2.zze();
        if (iZzg >= iZze || i3 <= 0) {
            return;
        }
        int iMin = Math.min(i3, iZze - iZzg);
        zzerVar.zzm(zzerVar2.zzi(), iZzg, iMin);
        zzerVar2.zzh(iZzg + iMin);
    }

    public final /* synthetic */ void zze(zzer zzerVar, int i2) {
        if (i2 < 19) {
            return;
        }
        this.zzd = zzerVar.zzt();
        this.zze = zzerVar.zzt();
        zzerVar.zzk(11);
        this.zzf = zzerVar.zzt();
        this.zzg = zzerVar.zzt();
    }
}
