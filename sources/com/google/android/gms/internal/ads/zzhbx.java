package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzhbx implements zzhhz {
    static final /* synthetic */ zzhbx zza = new zzhbx();

    private /* synthetic */ zzhbx() {
    }

    @Override // com.google.android.gms.internal.ads.zzhhz
    public final /* synthetic */ zzgzx zza(zzhan zzhanVar, Integer num) throws GeneralSecurityException {
        zzhcb zzhcbVar = (zzhcb) zzhanVar;
        int i2 = zzhby.zza;
        if (zzhcbVar.zzc() == 24) {
            throw new GeneralSecurityException("192 bit AES GCM Parameters are not valid");
        }
        zzhbu zzhbuVar = new zzhbu(null);
        zzhbuVar.zza(zzhcbVar);
        zzhbuVar.zzc(num);
        zzhbuVar.zzb(zzhxe.zzb(zzhcbVar.zzc()));
        return zzhbuVar.zzd();
    }
}
