package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzrh implements zzsb {
    private static final zzro zza = new zzrf();
    private final zzro zzb;

    public zzrh() {
        zzqi zzqiVarZza = zzqi.zza();
        int i = zzpc.zza;
        zzrg zzrgVar = new zzrg(zzqiVarZza, zza);
        byte[] bArr = zzqs.zzb;
        this.zzb = zzrgVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsb
    public final zzsa zza(Class cls) {
        int i = zzsc.zza;
        if (!zzqm.class.isAssignableFrom(cls)) {
            int i2 = zzpc.zza;
        }
        zzrn zzrnVarZzb = this.zzb.zzb(cls);
        if (zzrnVarZzb.zzb()) {
            int i3 = zzpc.zza;
            return zzru.zzi(zzsc.zzn(), zzqd.zza(), zzrnVarZzb.zza());
        }
        int i4 = zzpc.zza;
        return zzrt.zzi(cls, zzrnVarZzb, zzrw.zza(), zzrd.zza(), zzsc.zzn(), zzrnVarZzb.zzc() + (-1) != 1 ? zzqd.zza() : null, zzrm.zza());
    }
}
