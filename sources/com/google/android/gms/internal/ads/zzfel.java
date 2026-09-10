package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfel implements zzffj {
    private zzczr zza;
    private final Executor zzb = zzgzd.zza();

    public final zzczr zza() {
        return this.zza;
    }

    public final ListenableFuture zzb(zzffk zzffkVar, zzffi zzffiVar, zzczr zzczrVar) {
        zzczq zzczqVarZza = zzffiVar.zza(zzffkVar.zzb);
        zzczqVarZza.zzj(new zzffn(true));
        zzczr zzczrVar2 = (zzczr) zzczqVarZza.zzh();
        this.zza = zzczrVar2;
        final zzcwo zzcwoVarZza = zzczrVar2.zza();
        final zzfki zzfkiVar = new zzfki();
        zzgye zzgyeVarZzw = zzgye.zzw(zzcwoVarZza.zzb());
        zzgxu zzgxuVar = new zzgxu(this) { // from class: com.google.android.gms.internal.ads.zzfek
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                zzfic zzficVar = (zzfic) obj;
                zzfkiVar.zzb = zzficVar;
                Iterator it = zzficVar.zzb.zza.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfhr) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzgym.zza(null);
                        }
                        z2 = true;
                    }
                }
                if (z2) {
                    return zzcwoVarZza.zzc(zzgym.zza(zzficVar));
                }
                return zzgym.zza(null);
            }
        };
        Executor executor = this.zzb;
        return (zzgye) zzgym.zzk((zzgye) zzgym.zzj(zzgyeVarZzw, zzgxuVar, executor), new zzgpr() { // from class: com.google.android.gms.internal.ads.zzfej
            @Override // com.google.android.gms.internal.ads.zzgpr
            public final /* synthetic */ Object apply(Object obj) {
                zzfki zzfkiVar2 = zzfkiVar;
                zzfkiVar2.zzc = (zzcvk) obj;
                return zzfkiVar2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* bridge */ /* synthetic */ ListenableFuture zzc(zzffk zzffkVar, zzffi zzffiVar, Object obj) {
        return zzb(zzffkVar, zzffiVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzffj
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
