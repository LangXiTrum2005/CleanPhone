package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzhyf extends zzhxq {
    static final zzhyf zza = new zzhyf();

    private zzhyf() {
    }

    @Override // com.google.android.gms.internal.ads.zzhxq
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(zzhyq zzhyqVar, zzhxj zzhxjVar) throws IOException {
        if (zzhxjVar == null || (zzhxjVar instanceof zzhxk)) {
            zzhyqVar.zzj();
            return;
        }
        if (zzhxjVar instanceof zzhxn) {
            zzhxn zzhxnVarZzg = zzhxjVar.zzg();
            if (zzhxnVarZzg.zzc()) {
                zzhyqVar.zzi(zzhxnVarZzg.zzh());
                return;
            } else if (zzhxnVarZzg.zza()) {
                zzhyqVar.zzh(zzhxnVarZzg.zzb());
                return;
            } else {
                zzhyqVar.zzg(zzhxnVarZzg.zzd());
                return;
            }
        }
        if (zzhxjVar instanceof zzhxi) {
            zzhyqVar.zzb();
            Iterator it = zzhxjVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzhyqVar, (zzhxj) it.next());
            }
            zzhyqVar.zzc();
            return;
        }
        if (!(zzhxjVar instanceof zzhxl)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzhxjVar.getClass())));
        }
        zzhyqVar.zzd();
        for (Map.Entry entry : zzhxjVar.zze().zzb()) {
            zzhyqVar.zzf((String) entry.getKey());
            zza(zzhyqVar, (zzhxj) entry.getValue());
        }
        zzhyqVar.zze();
    }
}
