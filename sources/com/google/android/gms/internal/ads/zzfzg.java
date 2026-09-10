package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzg {
    private static zzfzg zzb;
    final zzfzh zza;

    private zzfzg(Context context) {
        this.zza = zzfzh.zza(context);
    }

    public static final zzfzg zza(Context context) {
        zzfzg zzfzgVar;
        synchronized (zzfzg.class) {
            try {
                if (zzb == null) {
                    zzb = new zzfzg(context);
                }
                zzfzgVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfzgVar;
    }

    public final void zzb(boolean z2) throws IOException {
        synchronized (zzfzg.class) {
            try {
                zzfzh zzfzhVar = this.zza;
                zzfzhVar.zzb("paidv2_publisher_option", Boolean.valueOf(z2));
                if (!z2) {
                    zzfzhVar.zzf("paidv2_creation_time");
                    zzfzhVar.zzf("paidv2_id");
                    zzfzhVar.zzf("vendor_scoped_gpid_v2_id");
                    zzfzhVar.zzf("vendor_scoped_gpid_v2_creation_time");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean zzc() {
        boolean zZze;
        synchronized (zzfzg.class) {
            zZze = this.zza.zze("paidv2_publisher_option", true);
        }
        return zZze;
    }

    public final void zzd(boolean z2) throws IOException {
        synchronized (zzfzg.class) {
            this.zza.zzb("paidv2_user_option", Boolean.valueOf(z2));
        }
    }

    public final boolean zze() {
        boolean zZze;
        synchronized (zzfzg.class) {
            zZze = this.zza.zze("paidv2_user_option", true);
        }
        return zZze;
    }
}
