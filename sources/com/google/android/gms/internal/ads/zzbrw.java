package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbrw {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbsf zzc;
    private zzbsf zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbiq.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzm(zzd(context)).zza().toLowerCase(Locale.ROOT).equals(com.smartdigimkt.d2.a.f34403Y);
    }

    public final zzbsf zza(Context context, VersionInfoParcel versionInfoParcel, zzfnr zzfnrVar) {
        zzbsf zzbsfVar;
        String str;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    Context contextZzd = zzd(context);
                    if (zze(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzc);
                    } else {
                        str = (String) zzbiu.zza.zze();
                    }
                    this.zzd = new zzbsf(contextZzd, versionInfoParcel, str, zzfnrVar);
                }
                zzbsfVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbsfVar;
    }

    public final zzbsf zzb(Context context, VersionInfoParcel versionInfoParcel, zzfnr zzfnrVar) {
        zzbsf zzbsfVar;
        String str;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    if (zze(context)) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzc);
                    } else if (((Boolean) zzbiq.zzg.zze()).booleanValue()) {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zza);
                    } else {
                        str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzb);
                    }
                    this.zzc = new zzbsf(zzd(context), versionInfoParcel, str, zzfnrVar);
                }
                zzbsfVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbsfVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            try {
                zzbsf zzbsfVar = this.zzc;
                if (zzbsfVar != null) {
                    zzbsfVar.zzc();
                    this.zzc = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
