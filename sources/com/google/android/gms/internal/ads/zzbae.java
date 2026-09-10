package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbae extends zzbbh {
    public zzbae(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "zPJzhz1QtGvdwoq8b/etTeYWv9LDeLRPadnOSNl7lohby1/0Z3YfZB4nvs0ev2QM", "fVJK5Q/FtQnQT4sQUZztmOn3k4N5bqyd4pz/QTy2bEo=", zzavsVar, i2, 89);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        String str = (String) this.zze.invoke(null, new Object[0]);
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzavsVar.zzaa(str);
        }
    }
}
