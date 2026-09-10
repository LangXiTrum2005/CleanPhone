package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzbvv implements View.OnClickListener {
    final /* synthetic */ zzbvx zza;

    public zzbvv(zzbvx zzbvxVar) {
        Objects.requireNonNull(zzbvxVar);
        this.zza = zzbvxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.zza.zzb(true);
    }
}
