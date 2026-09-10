package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzahg extends zzahf {
    private final zzer zzb;
    private final zzer zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzahg(zzaga zzagaVar) {
        super(zzagaVar);
        this.zzb = new zzer(zzgm.zza);
        this.zzc = new zzer(4);
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final boolean zza(zzer zzerVar) throws zzahe {
        int iZzs = zzerVar.zzs();
        int i2 = iZzs >> 4;
        int i3 = iZzs & 15;
        if (i3 != 7) {
            throw new zzahe(androidx.datastore.preferences.protobuf.a.g(i3, "Video format not supported: ", new StringBuilder(String.valueOf(i3).length() + 28)));
        }
        this.zzg = i2;
        return i2 != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final boolean zzb(zzer zzerVar, long j) throws zzat {
        int i2;
        int iZzs = zzerVar.zzs();
        long jZzy = zzerVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzer zzerVar2 = new zzer(new byte[zzerVar.zzd()]);
                zzerVar.zzm(zzerVar2.zzi(), 0, zzerVar.zzd());
                zzadt zzadtVarZza = zzadt.zza(zzerVar2);
                this.zzd = zzadtVarZza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("video/avc");
                zztVar.zzj(zzadtVarZza.zzl);
                zztVar.zzt(zzadtVarZza.zzc);
                zztVar.zzu(zzadtVarZza.zzd);
                zztVar.zzz(zzadtVarZza.zzk);
                zztVar.zzp(zzadtVarZza.zza);
                this.zza.zzu(zztVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i3 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i2 = i3;
            } else if (i3 != 0) {
                i2 = 1;
            }
            zzer zzerVar3 = this.zzc;
            byte[] bArrZzi = zzerVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i4 = 4 - this.zzd;
            int i5 = 0;
            while (zzerVar.zzd() > 0) {
                zzerVar.zzm(zzerVar3.zzi(), i4, this.zzd);
                zzerVar3.zzh(0);
                zzer zzerVar4 = this.zzb;
                int iZzH = zzerVar3.zzH();
                zzerVar4.zzh(0);
                zzaga zzagaVar = this.zza;
                zzagaVar.zzz(zzerVar4, 4);
                zzagaVar.zzz(zzerVar, iZzH);
                i5 = i5 + 4 + iZzH;
            }
            this.zza.zzx((jZzy * 1000) + j, i2, i5, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
