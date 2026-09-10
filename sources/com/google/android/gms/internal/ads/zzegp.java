package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegp implements zzdby, zzdan {
    private static final Object zza = new Object();
    private static int zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;
    private final zzegz zzd;

    public zzegp(zzegz zzegzVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzd = zzegzVar;
        this.zzc = zzgVar;
    }

    private final void zzb(boolean z2) {
        int i2;
        int iIntValue;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue() && !this.zzc.zzx()) {
            Object obj = zza;
            synchronized (obj) {
                i2 = zzb;
                iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzhb)).intValue();
            }
            if (i2 < iIntValue) {
                this.zzd.zza(z2);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdan
    public final void zzdI(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzb(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdby
    public final void zzg() {
        zzb(true);
    }
}
