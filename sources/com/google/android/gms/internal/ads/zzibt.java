package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzibt implements zzicv {
    private static final zzica zzb = new zzibr();
    private final zzica zza;

    public zzibt() {
        zziak zziakVarZza = zziak.zza();
        int i2 = zzhyy.zza;
        zzibs zzibsVar = new zzibs(zziakVarZza, zzb);
        byte[] bArr = zzibe.zzb;
        this.zza = zzibsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzicv
    public final zzicu zza(Class cls) {
        int i2 = zzicw.zza;
        if (!zziar.class.isAssignableFrom(cls)) {
            int i3 = zzhyy.zza;
        }
        zzibz zzibzVarZzc = this.zza.zzc(cls);
        if (zzibzVarZzc.zza()) {
            int i4 = zzhyy.zza;
            return zzicg.zzh(zzicw.zzF(), zziae.zza(), zzibzVarZzc.zzb());
        }
        int i5 = zzhyy.zza;
        return zzicf.zzm(cls, zzibzVarZzc, zzicj.zza(), zzibp.zza(), zzicw.zzF(), zzibzVarZzc.zzc() + (-1) != 1 ? zziae.zza() : null, zziby.zza());
    }
}
