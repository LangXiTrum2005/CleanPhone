package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Strings;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeug implements zzezx {
    private final zzfer zza;

    public zzeug(zzfer zzferVar) {
        this.zza = zzferVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        zzfer zzferVar = this.zza;
        if (zzferVar == null) {
            return zzgym.zza(new zzeuf(null));
        }
        String strZza = zzferVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgym.zza(new zzeuf(null)) : zzgym.zza(new zzeuf(strZza));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 15;
    }
}
