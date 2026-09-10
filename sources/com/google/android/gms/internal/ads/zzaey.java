package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaey {
    public static zzap zza(zzaep zzaepVar, boolean z2) throws IOException {
        zzap zzapVarZza = new zzafi().zza(zzaepVar, z2 ? null : zzaif.zza, 0);
        if (zzapVarZza == null || zzapVarZza.zza() == 0) {
            return null;
        }
        return zzapVarZza;
    }

    public static boolean zzb(zzaep zzaepVar, zzaex zzaexVar) throws IOException {
        zzaepVar.zzl();
        zzeq zzeqVar = new zzeq(new byte[4], 4);
        zzaepVar.zzi(zzeqVar.zza, 0, 4);
        boolean zZzi = zzeqVar.zzi();
        int iZzj = zzeqVar.zzj(7);
        int iZzj2 = zzeqVar.zzj(24) + 4;
        if (iZzj == 0) {
            byte[] bArr = new byte[38];
            zzaepVar.zzc(bArr, 0, 38);
            zzaexVar.zza = new zzafb(bArr, 4);
            return zZzi;
        }
        zzafb zzafbVar = zzaexVar.zza;
        if (zzafbVar == null) {
            throw new IllegalArgumentException();
        }
        if (iZzj == 3) {
            zzer zzerVar = new zzer(iZzj2);
            zzaepVar.zzc(zzerVar.zzi(), 0, iZzj2);
            zzaexVar.zza = zzafbVar.zze(zzc(zzerVar));
            return zZzi;
        }
        if (iZzj == 4) {
            zzer zzerVar2 = new zzer(iZzj2);
            zzaepVar.zzc(zzerVar2.zzi(), 0, iZzj2);
            zzerVar2.zzk(4);
            zzaexVar.zza = new zzafb(zzafbVar.zza, zzafbVar.zzb, zzafbVar.zzc, zzafbVar.zzd, zzafbVar.zze, zzafbVar.zzg, zzafbVar.zzh, zzafbVar.zzj, zzafbVar.zzk, zzafbVar.zzd(zzagg.zzc(Arrays.asList(zzagg.zzb(zzerVar2, false, false).zza))));
            return zZzi;
        }
        if (iZzj != 6) {
            zzaepVar.zzf(iZzj2);
            return zZzi;
        }
        zzer zzerVar3 = new zzer(iZzj2);
        zzaepVar.zzc(zzerVar3.zzi(), 0, iZzj2);
        zzerVar3.zzk(4);
        zzaexVar.zza = new zzafb(zzafbVar.zza, zzafbVar.zzb, zzafbVar.zzc, zzafbVar.zzd, zzafbVar.zze, zzafbVar.zzg, zzafbVar.zzh, zzafbVar.zzj, zzafbVar.zzk, zzafbVar.zzd(new zzap(zzgtd.zzj(zzaht.zzb(zzerVar3)))));
        return zZzi;
    }

    public static zzafa zzc(zzer zzerVar) {
        zzerVar.zzk(1);
        int iZzx = zzerVar.zzx();
        long jZzg = zzerVar.zzg();
        long j = iZzx;
        int i2 = iZzx / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            long jZzD = zzerVar.zzD();
            if (jZzD == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jZzD;
            jArrCopyOf2[i3] = zzerVar.zzD();
            zzerVar.zzk(2);
        }
        zzerVar.zzk((int) ((jZzg + j) - ((long) zzerVar.zzg())));
        return new zzafa(jArrCopyOf, jArrCopyOf2);
    }
}
