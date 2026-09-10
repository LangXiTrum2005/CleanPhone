package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnn {
    public static boolean zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjZ), str);
    }

    public static void zzb(ListenableFuture listenableFuture, zzfne zzfneVar) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            zzgym.zzr(zzgye.zzw(listenableFuture), new zzfnj(zzfneVar), zzcdo.zzg);
        }
    }

    public static zzflu zzc(final zzfne zzfneVar) {
        return new zzflu() { // from class: com.google.android.gms.internal.ads.zzfnm
            @Override // com.google.android.gms.internal.ads.zzflu
            public final /* synthetic */ Object zza(Object obj) {
                if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
                    zzfneVar.zza();
                }
                return obj;
            }
        };
    }

    public static void zzd(ListenableFuture listenableFuture, zzfno zzfnoVar, zzfne zzfneVar) {
        zzh(listenableFuture, zzfnoVar, zzfneVar, false);
    }

    public static void zze(ListenableFuture listenableFuture, zzfno zzfnoVar, zzfne zzfneVar) {
        zzh(listenableFuture, zzfnoVar, zzfneVar, true);
    }

    public static void zzf(ListenableFuture listenableFuture, zzfno zzfnoVar, zzfne zzfneVar) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            zzgym.zzr(zzgye.zzw(listenableFuture), new zzfnl(zzfnoVar, zzfneVar), zzcdo.zzg);
        }
    }

    public static int zzg(zzfik zzfikVar) {
        int iZzg = com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzg(zzfikVar) - 1;
        return (iZzg == 0 || iZzg == 1) ? 7 : 23;
    }

    private static void zzh(ListenableFuture listenableFuture, zzfno zzfnoVar, zzfne zzfneVar, boolean z2) {
        if (((Boolean) zzbid.zzc.zze()).booleanValue()) {
            zzgym.zzr(zzgye.zzw(listenableFuture), new zzfnk(zzfnoVar, zzfneVar, z2), zzcdo.zzg);
        }
    }
}
