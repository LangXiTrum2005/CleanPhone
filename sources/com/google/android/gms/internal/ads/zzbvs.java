package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvs implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbvu zza;

    public zzbvs(zzbvu zzbvuVar) {
        Objects.requireNonNull(zzbvuVar);
        this.zza = zzbvuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        zzbvu zzbvuVar = this.zza;
        Intent intentZzb = zzbvuVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzaa(zzbvuVar.zzc(), intentZzb);
    }
}
