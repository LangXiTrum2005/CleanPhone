package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqt implements Runnable {
    final /* synthetic */ zzfqy zza;

    public zzfqt(zzfqy zzfqyVar) {
        Objects.requireNonNull(zzfqyVar);
        this.zza = zzfqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfqy zzfqyVar = this.zza;
        if (zzfqyVar.zzG() != null) {
            zzfqd zzfqdVarZzG = zzfqyVar.zzG();
            Clock clockZzH = zzfqyVar.zzH();
            zzfqdVarZzG.zzj(clockZzH.currentTimeMillis(), zzfqyVar.zzI(), zzfqyVar.zze.zzd, zzfqyVar.zzF());
        }
    }
}
