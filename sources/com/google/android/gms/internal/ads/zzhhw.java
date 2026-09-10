package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhw extends zzhxq {
    public static final zzhxj zzb(zzhyo zzhyoVar) throws IOException {
        String strZzh;
        int iZzm = zzhyoVar.zzm();
        zzhxj zzhxjVarZze = zze(zzhyoVar, iZzm);
        if (zzhxjVarZze == null) {
            return zzd(zzhyoVar, iZzm);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzhyoVar.zzf()) {
                if (zzhxjVarZze instanceof zzhxl) {
                    strZzh = zzhyoVar.zzh();
                    if (!zzhhy.zza(strZzh)) {
                        throw new IOException("illegal characters in string");
                    }
                } else {
                    strZzh = null;
                }
                int iZzm2 = zzhyoVar.zzm();
                zzhxj zzhxjVarZze2 = zze(zzhyoVar, iZzm2);
                zzhxj zzhxjVarZzd = zzhxjVarZze2 == null ? zzd(zzhyoVar, iZzm2) : zzhxjVarZze2;
                if (zzhxjVarZze instanceof zzhxi) {
                    ((zzhxi) zzhxjVarZze).zza(zzhxjVarZzd);
                } else {
                    zzhxl zzhxlVar = (zzhxl) zzhxjVarZze;
                    if (zzhxlVar.zzc(strZzh)) {
                        throw new IOException("duplicate key: ".concat(String.valueOf(strZzh)));
                    }
                    zzhxlVar.zza(strZzh, zzhxjVarZzd);
                }
                if (zzhxjVarZze2 != null) {
                    arrayDeque.addLast(zzhxjVarZze);
                    if (arrayDeque.size() > 100) {
                        throw new IOException("too many recursions");
                    }
                    zzhxjVarZze = zzhxjVarZzd;
                } else {
                    continue;
                }
            } else {
                if (zzhxjVarZze instanceof zzhxi) {
                    zzhyoVar.zzc();
                } else {
                    zzhyoVar.zze();
                }
                if (arrayDeque.isEmpty()) {
                    return zzhxjVarZze;
                }
                zzhxjVarZze = (zzhxj) arrayDeque.removeLast();
            }
        }
    }

    private static final zzhxj zzd(zzhyo zzhyoVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 5) {
            String strZzi = zzhyoVar.zzi();
            if (zzhhy.zza(strZzi)) {
                return new zzhxn(strZzi);
            }
            throw new IOException("illegal characters in string");
        }
        if (i3 == 6) {
            return new zzhxn(new zzhhx(zzhyoVar.zzi()));
        }
        if (i3 == 7) {
            return new zzhxn(Boolean.valueOf(zzhyoVar.zzj()));
        }
        if (i3 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzhyp.zza(i2)));
        }
        zzhyoVar.zzk();
        return zzhxk.zza;
    }

    @Nullable
    private static final zzhxj zze(zzhyo zzhyoVar, int i2) throws IOException {
        int i3 = i2 - 1;
        if (i3 == 0) {
            zzhyoVar.zzb();
            return new zzhxi();
        }
        if (i3 != 2) {
            return null;
        }
        zzhyoVar.zzd();
        return new zzhxl();
    }

    @Override // com.google.android.gms.internal.ads.zzhxq
    public final /* bridge */ /* synthetic */ void zza(zzhyq zzhyqVar, Object obj) throws IOException {
        throw null;
    }
}
