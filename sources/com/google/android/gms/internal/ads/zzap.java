package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    private static final zzao zzh(zzao zzaoVar, Class cls, zzgqb zzgqbVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgqbVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzap.class == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return Long.hashCode(-9223372036854775807L) + (Arrays.hashCode(this.zza) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.zza);
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(string).length() + 8), "entries=", string, "");
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i2) {
        return this.zza[i2];
    }

    public final zzao zzc(Class cls, zzgqb zzgqbVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgqbVar);
            if (zzaoVarZzh != null) {
                return zzaoVarZzh;
            }
        }
        return null;
    }

    public final zzgtd zzd(Class cls) {
        int i2 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgtaVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgtaVar.zzi();
    }

    public final zzgtd zze(Class cls, zzgqb zzgqbVar) {
        int i2 = zzgtd.zzd;
        zzgta zzgtaVar = new zzgta();
        for (zzao zzaoVar : this.zza) {
            zzao zzaoVarZzh = zzh(zzaoVar, cls, zzgqbVar);
            if (zzaoVarZzh != null) {
                zzgtaVar.zzf(zzaoVarZzh);
            }
        }
        return zzgtaVar.zzi();
    }

    public final zzap zzf(zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfj.zza;
        int length2 = zzaoVarArr2.length;
        Object[] objArrCopyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, objArrCopyOf, length2, length);
        return new zzap(-9223372036854775807L, (zzao[]) objArrCopyOf);
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }
}
