package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
final class zzalj extends zzalm {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzer zzerVar) {
        return zzk(zzerVar, zza);
    }

    private static boolean zzk(zzer zzerVar, byte[] bArr) {
        if (zzerVar.zzd() < 8) {
            return false;
        }
        int iZzg = zzerVar.zzg();
        byte[] bArr2 = new byte[8];
        zzerVar.zzm(bArr2, 0, 8);
        zzerVar.zzh(iZzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final long zzb(zzer zzerVar) {
        return zzi(zzafn.zzd(zzerVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    @EnsuresNonNullIf
    public final boolean zzc(zzer zzerVar, long j, zzalk zzalkVar) throws zzat {
        if (zzk(zzerVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze());
            int i2 = bArrCopyOf[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            List listZza = zzafn.zza(bArrCopyOf);
            if (zzalkVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzl("audio/ogg");
            zztVar.zzm("audio/opus");
            zztVar.zzE(i2);
            zztVar.zzF(48000);
            zztVar.zzp(listZza);
            zzalkVar.zza = zztVar.zzM();
            return true;
        }
        if (!zzk(zzerVar, zzb)) {
            zzalkVar.zza.getClass();
            return false;
        }
        zzalkVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzerVar.zzk(8);
        zzap zzapVarZzc = zzagg.zzc(zzgtd.zzr(zzagg.zzb(zzerVar, false, false).zza));
        if (zzapVarZzc == null) {
            return true;
        }
        zzt zztVarZza = zzalkVar.zza.zza();
        zztVarZza.zzk(zzapVarZzc.zzf(zzalkVar.zza.zzl));
        zzalkVar.zza = zztVarZza.zzM();
        return true;
    }
}
