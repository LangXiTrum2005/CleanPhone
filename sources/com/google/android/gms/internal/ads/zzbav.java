package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbav extends zzbbh {
    public zzbav(zzazt zzaztVar, String str, String str2, zzavs zzavsVar, int i2, int i3) {
        super(zzaztVar, "8W5EiIZWvw8ca0gdEf2baMelwD0v1LgWFEv6AqIRDGIzRlZJKgzzVYcusXATxgKN", "ZXwHOojdfPkjtU4/T1kRX8Zucxdzz/LL+/XimOcPDrc=", zzavsVar, i2, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbbh
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdG);
        bool.booleanValue();
        zzayz zzayzVar = new zzayz((String) this.zze.invoke(null, this.zza.zzb(), bool));
        zzavs zzavsVar = this.zzd;
        synchronized (zzavsVar) {
            zzavsVar.zzc(zzayzVar.zza);
            zzavsVar.zzP(zzayzVar.zzb);
        }
    }
}
