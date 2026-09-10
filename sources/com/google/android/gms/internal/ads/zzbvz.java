package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvz implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbwa zza;

    public zzbvz(zzbwa zzbwaVar) {
        Objects.requireNonNull(zzbwaVar);
        this.zza = zzbwaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzg("User canceled the download.");
    }
}
