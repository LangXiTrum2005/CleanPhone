package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;

/* JADX INFO: loaded from: classes4.dex */
final class zzakg {
    public final zzaga zza;
    public zzaky zzd;
    public zzakb zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final zzv zzj;
    private boolean zzm;
    public final zzakx zzb = new zzakx();
    public final zzer zzc = new zzer();
    private final zzer zzk = new zzer(1);
    private final zzer zzl = new zzer();

    public zzakg(zzaga zzagaVar, zzaky zzakyVar, zzakb zzakbVar, zzv zzvVar) {
        this.zza = zzagaVar;
        this.zzd = zzakyVar;
        this.zze = zzakbVar;
        this.zzj = zzvVar;
        zza(zzakyVar, zzakbVar);
    }

    public final void zza(zzaky zzakyVar, zzakb zzakbVar) {
        this.zzd = zzakyVar;
        this.zze = zzakbVar;
        this.zza.zzu(this.zzj);
        zzc();
    }

    public final void zzb(zzq zzqVar) {
        zzakv zzakvVar = this.zzd.zza;
        zzakb zzakbVar = this.zzb.zza;
        String str = zzfj.zza;
        zzakw zzakwVarZza = zzakvVar.zza(zzakbVar.zza);
        zzq zzqVarZzb = zzqVar.zzb(zzakwVarZza != null ? zzakwVarZza.zzb : null);
        zzt zztVarZza = this.zzj.zza();
        zztVarZza.zzq(zzqVarZzb);
        this.zza.zzu(zztVarZza.zzM());
    }

    public final void zzc() {
        zzakx zzakxVar = this.zzb;
        zzakxVar.zzd = 0;
        zzakxVar.zzp = 0L;
        zzakxVar.zzq = false;
        zzakxVar.zzk = false;
        zzakxVar.zzo = false;
        zzakxVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        zzakx zzakxVar = this.zzb;
        return zzakxVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i2;
        if (this.zzm) {
            i2 = this.zzb.zzj[this.zzf] ? 1 : 0;
        } else {
            i2 = this.zzd.zzg[this.zzf];
        }
        return zzj() != null ? i2 | 1073741824 : i2;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i2 = this.zzg + 1;
        this.zzg = i2;
        int[] iArr = this.zzb.zzg;
        int i3 = this.zzh;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.zzh = i3 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i2, int i3) {
        zzer zzerVar;
        zzakw zzakwVarZzj = zzj();
        if (zzakwVarZzj == null) {
            return 0;
        }
        int i4 = zzakwVarZzj.zzd;
        if (i4 != 0) {
            zzerVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzakwVarZzj.zze;
            String str = zzfj.zza;
            zzer zzerVar2 = this.zzl;
            int length = bArr.length;
            zzerVar2.zzb(bArr, length);
            zzerVar = zzerVar2;
            i4 = length;
        }
        zzakx zzakxVar = this.zzb;
        boolean zZzb = zzakxVar.zzb(this.zzf);
        boolean z2 = zZzb || i3 != 0;
        zzer zzerVar3 = this.zzk;
        zzerVar3.zzi()[0] = (byte) ((true != z2 ? 0 : 128) | i4);
        zzerVar3.zzh(0);
        zzaga zzagaVar = this.zza;
        zzagaVar.zzw(zzerVar3, 1, 1);
        zzagaVar.zzw(zzerVar, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        if (!zZzb) {
            zzer zzerVar4 = this.zzc;
            zzerVar4.zza(8);
            byte[] bArrZzi = zzerVar4.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 1;
            bArrZzi[2] = 0;
            bArrZzi[3] = (byte) i3;
            bArrZzi[4] = (byte) ((i2 >> 24) & 255);
            bArrZzi[5] = (byte) ((i2 >> 16) & 255);
            bArrZzi[6] = (byte) ((i2 >> 8) & 255);
            bArrZzi[7] = (byte) (i2 & 255);
            zzagaVar.zzw(zzerVar4, 8, 1);
            return i4 + 9;
        }
        int i5 = i4 + 1;
        zzer zzerVar5 = zzakxVar.zzn;
        int iZzt = zzerVar5.zzt();
        zzerVar5.zzk(-2);
        int i6 = (iZzt * 6) + 2;
        if (i3 != 0) {
            zzer zzerVar6 = this.zzc;
            zzerVar6.zza(i6);
            byte[] bArrZzi2 = zzerVar6.zzi();
            zzerVar5.zzm(bArrZzi2, 0, i6);
            int i7 = (((bArrZzi2[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArrZzi2[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) + i3;
            bArrZzi2[2] = (byte) ((i7 >> 8) & 255);
            bArrZzi2[3] = (byte) (i7 & 255);
            zzerVar5 = zzerVar6;
        }
        zzagaVar.zzw(zzerVar5, i6, 1);
        return i5 + i6;
    }

    public final zzakw zzj() {
        if (!this.zzm) {
            return null;
        }
        zzakx zzakxVar = this.zzb;
        zzakb zzakbVar = zzakxVar.zza;
        String str = zzfj.zza;
        int i2 = zzakbVar.zza;
        zzakw zzakwVarZza = zzakxVar.zzm;
        if (zzakwVarZza == null) {
            zzakwVarZza = this.zzd.zza.zza(i2);
        }
        if (zzakwVarZza == null || !zzakwVarZza.zza) {
            return null;
        }
        return zzakwVarZza;
    }

    public final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    public final /* synthetic */ void zzl(boolean z2) {
        this.zzm = true;
    }
}
