package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqd implements zzaeo {
    private zzaer zza;
    private zzaga zzb;
    private zzaqa zze;
    private int zzc = 0;
    private long zzd = -1;
    private int zzf = -1;
    private long zzg = -1;

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        return zzaqg.zza(zzaepVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zza = zzaerVar;
        this.zzb = zzaerVar.zzu(0, 1);
        zzaerVar.zzv();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        int i2;
        this.zzb.getClass();
        String str = zzfj.zza;
        int i3 = this.zzc;
        int iZzz = 4;
        if (i3 == 0) {
            zzgqa.zzi(zzaepVar.zzn() == 0);
            int i4 = this.zzf;
            if (i4 != -1) {
                zzaepVar.zzf(i4);
                this.zzc = 4;
                return 0;
            }
            if (!zzaqg.zza(zzaepVar)) {
                throw zzat.zzb("Unsupported or unrecognized wav file type.", null);
            }
            zzaepVar.zzf((int) (zzaepVar.zzm() - zzaepVar.zzn()));
            this.zzc = 1;
            return 0;
        }
        long jZzE = -1;
        if (i3 == 1) {
            zzer zzerVar = new zzer(8);
            zzaqf zzaqfVarZza = zzaqf.zza(zzaepVar, zzerVar);
            if (zzaqfVarZza.zza != 1685272116) {
                zzaepVar.zzl();
            } else {
                zzaepVar.zzk(8);
                zzerVar.zzh(0);
                zzaepVar.zzi(zzerVar.zzi(), 0, 8);
                jZzE = zzerVar.zzE();
                zzaepVar.zzf(((int) zzaqfVarZza.zzb) + 8);
            }
            this.zzd = jZzE;
            this.zzc = 2;
            return 0;
        }
        if (i3 == 2) {
            zzaqe zzaqeVarZzb = zzaqg.zzb(zzaepVar);
            int i5 = zzaqeVarZzb.zza;
            if (i5 == 17) {
                this.zze = new zzapz(this.zza, this.zzb, zzaqeVarZzb);
            } else if (i5 == 6) {
                this.zze = new zzaqb(this.zza, this.zzb, zzaqeVarZzb, "audio/g711-alaw", -1);
            } else if (i5 == 7) {
                this.zze = new zzaqb(this.zza, this.zzb, zzaqeVarZzb, "audio/g711-mlaw", -1);
            } else {
                int i6 = zzaqeVarZzb.zze;
                if (i5 == 1) {
                    iZzz = zzfj.zzz(i6, ByteOrder.LITTLE_ENDIAN);
                    i2 = iZzz;
                } else {
                    if (i5 != 3) {
                        if (i5 == 65534) {
                            iZzz = zzfj.zzz(i6, ByteOrder.LITTLE_ENDIAN);
                            i2 = iZzz;
                        }
                    } else if (i6 == 32) {
                        i2 = iZzz;
                    }
                    i2 = 0;
                }
                if (i2 == 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i5).length() + 29);
                    sb.append("Unsupported WAV format type: ");
                    sb.append(i5);
                    throw zzat.zzc(sb.toString());
                }
                this.zze = new zzaqb(this.zza, this.zzb, zzaqeVarZzb, "audio/raw", i2);
            }
            this.zzc = 3;
            return 0;
        }
        if (i3 != 3) {
            zzgqa.zzi(this.zzg != -1);
            long jZzn = this.zzg - zzaepVar.zzn();
            zzaqa zzaqaVar = this.zze;
            zzaqaVar.getClass();
            return zzaqaVar.zzc(zzaepVar, jZzn) ? -1 : 0;
        }
        Pair pairZzc = zzaqg.zzc(zzaepVar);
        this.zzf = ((Long) pairZzc.first).intValue();
        long jLongValue = ((Long) pairZzc.second).longValue();
        long j = this.zzd;
        if (j != -1 && jLongValue == 4294967295L) {
            jLongValue = j;
        }
        long j2 = ((long) this.zzf) + jLongValue;
        this.zzg = j2;
        long jZzo = zzaepVar.zzo();
        if (jZzo != -1 && j2 > jZzo) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 29 + String.valueOf(jZzo).length());
            androidx.datastore.preferences.protobuf.a.A(sb2, "Data exceeds input length: ", j2, ", ");
            sb2.append(jZzo);
            zzee.zzc("WavExtractor", sb2.toString());
            this.zzg = jZzo;
            j2 = jZzo;
        }
        zzaqa zzaqaVar2 = this.zze;
        zzaqaVar2.getClass();
        zzaqaVar2.zzb(this.zzf, j2);
        this.zzc = 4;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzc = j == 0 ? 0 : 4;
        zzaqa zzaqaVar = this.zze;
        if (zzaqaVar != null) {
            zzaqaVar.zza(j2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
