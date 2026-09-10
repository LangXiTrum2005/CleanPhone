package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, com.google.android.gms.auth.account.zzb
    public final void zzc(boolean z2) {
        this.zza.setResult(new zzak(z2 ? Status.RESULT_SUCCESS : zzal.zza));
    }
}
