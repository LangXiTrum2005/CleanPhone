package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzfrh {
    public static zzfrh zze(zzfri zzfriVar, zzfrj zzfrjVar) {
        zzftf.zza();
        return new zzfrl(zzfriVar, zzfrjVar, UUID.randomUUID().toString());
    }

    public abstract void zza();

    public abstract void zzb(View view);

    public abstract void zzc();

    public abstract void zzd(View view, zzfro zzfroVar, String str);
}
