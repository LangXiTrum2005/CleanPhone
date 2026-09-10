package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* JADX INFO: loaded from: classes4.dex */
final class zzald extends zzalm {
    private zzafb zza;
    private zzalc zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(boolean z2) {
        super.zza(z2);
        if (z2) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final long zzb(zzer zzerVar) {
        if (!zzd(zzerVar.zzi())) {
            return -1L;
        }
        int i2 = (zzerVar.zzi()[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) >> 4;
        if (i2 == 6) {
            zzerVar.zzk(4);
            zzerVar.zzO();
        } else if (i2 == 7) {
            i2 = 7;
            zzerVar.zzk(4);
            zzerVar.zzO();
        }
        int iZzc = zzaew.zzc(zzerVar, i2);
        zzerVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    @EnsuresNonNullIf
    public final boolean zzc(zzer zzerVar, long j, zzalk zzalkVar) {
        byte[] bArrZzi = zzerVar.zzi();
        zzafb zzafbVar = this.zza;
        if (zzafbVar == null) {
            zzafb zzafbVar2 = new zzafb(bArrZzi, 17);
            this.zza = zzafbVar2;
            zzt zztVarZza = zzafbVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzerVar.zze()), null).zza();
            zztVarZza.zzl("audio/ogg");
            zzalkVar.zza = zztVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & AbstractJsonLexerKt.TC_INVALID) == 3) {
            zzafa zzafaVarZzc = zzaey.zzc(zzerVar);
            zzafb zzafbVarZze = zzafbVar.zze(zzafaVarZzc);
            this.zza = zzafbVarZze;
            this.zzb = new zzalc(zzafbVarZze, zzafaVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzalc zzalcVar = this.zzb;
        if (zzalcVar != null) {
            zzalcVar.zzd(j);
            zzalkVar.zzb = this.zzb;
        }
        zzalkVar.zza.getClass();
        return false;
    }
}
