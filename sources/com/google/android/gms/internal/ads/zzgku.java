package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgku implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzgku(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzgku zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzgku(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        File file = (File) this.zza.zzb();
        zzgca zzgcaVar = (zzgca) this.zzb.zzb();
        final zzgnc zzgncVar = (zzgnc) this.zzc.zzb();
        return zzgcaVar.zzb(file, new byte[0], new Function() { // from class: com.google.android.gms.internal.ads.zzgke
            @Override // java.util.function.Function
            public final /* synthetic */ Object apply(Object obj) {
                zzgncVar.zzd(15310, (Throwable) obj);
                return new byte[0];
            }
        });
    }
}
