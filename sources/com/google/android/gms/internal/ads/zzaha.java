package com.google.android.gms.internal.ads;

import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
final class zzaha extends zzahf {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaha(zzaga zzagaVar) {
        super(zzagaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final boolean zza(zzer zzerVar) throws zzahe {
        if (this.zzc) {
            zzerVar.zzk(1);
        } else {
            int iZzs = zzerVar.zzs();
            int i2 = iZzs >> 4;
            this.zze = i2;
            if (i2 == 2) {
                int i3 = zzb[(iZzs >> 2) & 3];
                zzt zztVar = new zzt();
                zztVar.zzl("video/x-flv");
                zztVar.zzm("audio/mpeg");
                zztVar.zzE(1);
                zztVar.zzF(i3);
                this.zza.zzu(zztVar.zzM());
                this.zzd = true;
            } else if (i2 == 7 || i2 == 8) {
                zzt zztVar2 = new zzt();
                zztVar2.zzl("video/x-flv");
                zztVar2.zzm(i2 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzE(1);
                zztVar2.zzF(8000);
                this.zza.zzu(zztVar2.zzM());
                this.zzd = true;
            } else if (i2 != 10) {
                throw new zzahe(androidx.datastore.preferences.protobuf.a.g(i2, "Audio format not supported: ", new StringBuilder(String.valueOf(i2).length() + 28)));
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzahf
    public final boolean zzb(zzer zzerVar, long j) throws zzat {
        if (this.zze == 2) {
            int iZzd = zzerVar.zzd();
            zzaga zzagaVar = this.zza;
            zzagaVar.zzz(zzerVar, iZzd);
            zzagaVar.zzx(j, 1, iZzd, 0, null);
            return true;
        }
        int iZzs = zzerVar.zzs();
        if (iZzs != 0 || this.zzd) {
            if (this.zze == 10 && iZzs != 1) {
                return false;
            }
            int iZzd2 = zzerVar.zzd();
            zzaga zzagaVar2 = this.zza;
            zzagaVar2.zzz(zzerVar, iZzd2);
            zzagaVar2.zzx(j, 1, iZzd2, 0, null);
            return true;
        }
        int iZzd3 = zzerVar.zzd();
        byte[] bArr = new byte[iZzd3];
        zzerVar.zzm(bArr, 0, iZzd3);
        zzadm zzadmVarZza = zzadn.zza(bArr);
        zzt zztVar = new zzt();
        zztVar.zzl("video/x-flv");
        zztVar.zzm("audio/mp4a-latm");
        zztVar.zzj(zzadmVarZza.zzc);
        zztVar.zzE(zzadmVarZza.zzb);
        zztVar.zzF(zzadmVarZza.zza);
        zztVar.zzp(Collections.singletonList(bArr));
        this.zza.zzu(zztVar.zzM());
        this.zzd = true;
        return false;
    }
}
