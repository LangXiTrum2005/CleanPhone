package com.google.android.gms.internal.auth;

import com.unity3d.services.core.fid.Constants;

/* JADX INFO: loaded from: classes4.dex */
final class zzfo implements zzgi {
    private static final zzfu zza = new zzfm();
    private final zzfu zzb;

    public zzfo() {
        zzfu zzfuVar;
        zzer zzerVarZza = zzer.zza();
        try {
            zzfuVar = (zzfu) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            zzfuVar = zza;
        }
        zzfn zzfnVar = new zzfn(zzerVarZza, zzfuVar);
        zzez.zzf(zzfnVar, "messageInfoFactory");
        this.zzb = zzfnVar;
    }

    private static boolean zzb(zzft zzftVar) {
        return zzftVar.zzc() == 1;
    }

    @Override // com.google.android.gms.internal.auth.zzgi
    public final zzgh zza(Class cls) {
        zzgj.zzg(cls);
        zzft zzftVarZzb = this.zzb.zzb(cls);
        if (zzftVarZzb.zzb()) {
            return zzeu.class.isAssignableFrom(cls) ? zzga.zzb(zzgj.zzc(), zzen.zzb(), zzftVarZzb.zza()) : zzga.zzb(zzgj.zza(), zzen.zza(), zzftVarZzb.zza());
        }
        if (zzeu.class.isAssignableFrom(cls)) {
            return zzb(zzftVarZzb) ? zzfz.zzj(cls, zzftVarZzb, zzgc.zzb(), zzfk.zzd(), zzgj.zzc(), zzen.zzb(), zzfs.zzb()) : zzfz.zzj(cls, zzftVarZzb, zzgc.zzb(), zzfk.zzd(), zzgj.zzc(), null, zzfs.zzb());
        }
        return zzb(zzftVarZzb) ? zzfz.zzj(cls, zzftVarZzb, zzgc.zza(), zzfk.zzc(), zzgj.zza(), zzen.zza(), zzfs.zza()) : zzfz.zzj(cls, zzftVarZzb, zzgc.zza(), zzfk.zzc(), zzgj.zzb(), null, zzfs.zza());
    }
}
