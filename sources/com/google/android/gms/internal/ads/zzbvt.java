package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvt implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbvu zza;

    public zzbvt(zzbvu zzbvuVar) {
        Objects.requireNonNull(zzbvuVar);
        this.zza = zzbvuVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzg("Operation denied by user.");
    }
}
