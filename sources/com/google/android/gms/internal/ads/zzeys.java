package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeys implements zzezv {
    private zzfzf zza;
    private zzfzf zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzeys(zzfzf zzfzfVar, zzfzf zzfzfVar2, boolean z2, boolean z3, boolean z4) {
        this.zza = zzfzfVar;
        this.zzb = zzfzfVar2;
        this.zzc = z2;
        this.zzd = z3;
        this.zzf = z4;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x003a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x006e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0080  */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:9:0x0026 A[DONT_INVERT] */
    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzczm) obj).zza;
        if (this.zze) {
            return;
        }
        Bundle bundleZza = zzfiz.zza(bundle, "pii");
        boolean z2 = this.zzf;
        if (!z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdP)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zza());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                }
            } else if (z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdR)).booleanValue()) {
                    if (this.zza.zzc()) {
                        bundleZza.putString("paidv1_id_android", this.zza.zza());
                        bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                    }
                }
            }
        } else if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdR)).booleanValue()) {
                if (this.zza.zzc()) {
                    bundleZza.putString("paidv1_id_android", this.zza.zza());
                    bundleZza.putLong("paidv1_creation_time_android", this.zza.zzb());
                }
            }
        }
        if (!z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdQ)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zza());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            } else if (z2) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdS)).booleanValue()) {
                    if (this.zzb.zzc()) {
                        bundleZza.putString("paidv2_id_android", this.zzb.zza());
                        bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                    }
                    bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                    bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
                }
            }
        } else if (z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdS)).booleanValue()) {
                if (this.zzb.zzc()) {
                    bundleZza.putString("paidv2_id_android", this.zzb.zza());
                    bundleZza.putLong("paidv2_creation_time_android", this.zzb.zzb());
                }
                bundleZza.putBoolean("paidv2_pub_option_android", this.zzc);
                bundleZza.putBoolean("paidv2_user_option_android", this.zzd);
            }
        }
        if (bundleZza.isEmpty()) {
            return;
        }
        bundle.putBundle("pii", bundleZza);
    }

    public zzeys(boolean z2) {
        this.zzf = z2;
    }
}
