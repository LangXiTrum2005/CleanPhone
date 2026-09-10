package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfoz {
    private final com.google.android.gms.ads.internal.util.client.zzx zza;
    private final com.google.android.gms.ads.internal.util.client.zzu zzb;
    private final zzgyx zzc;
    private final zzfpa zzd;
    private final zzcld zze;

    public zzfoz(com.google.android.gms.ads.internal.util.client.zzx zzxVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzgyx zzgyxVar, zzfpa zzfpaVar, zzcld zzcldVar) {
        this.zza = zzxVar;
        this.zzb = zzuVar;
        this.zzc = zzgyxVar;
        this.zzd = zzfpaVar;
        this.zze = zzcldVar;
    }

    private final ListenableFuture zze(final String str, final long j, final int i2) {
        final String strS;
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        if (i2 > zzxVar.zza()) {
            zzfpa zzfpaVar = this.zzd;
            if (zzfpaVar == null || !zzxVar.zzd()) {
                return zzgym.zza(com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE);
            }
            zzfpaVar.zza(str, "", 2);
            return zzgym.zza(com.google.android.gms.ads.internal.util.client.zzt.BUFFERED);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjN)).booleanValue()) {
            Uri uri = Uri.parse(str);
            String encodedQuery = uri.getEncodedQuery();
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            builderClearQuery.appendQueryParameter("pa", Integer.toString(i2));
            String strValueOf = String.valueOf(builderClearQuery.build());
            strS = android.support.v4.media.a.s(new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length()), strValueOf, d9.i.f24749c, encodedQuery);
        } else {
            strS = str;
        }
        zzgxu zzgxuVar = new zzgxu() { // from class: com.google.android.gms.internal.ads.zzfoy
            @Override // com.google.android.gms.internal.ads.zzgxu
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(i2, j, str, (com.google.android.gms.ads.internal.util.client.zzt) obj);
            }
        };
        if (j == 0) {
            zzgyx zzgyxVar = this.zzc;
            return zzgym.zzj(zzgyxVar.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzfox
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzd(strS);
                }
            }), zzgxuVar, zzgyxVar);
        }
        zzgyx zzgyxVar2 = this.zzc;
        return zzgym.zzj(zzgyxVar2.schedule(new Callable() { // from class: com.google.android.gms.internal.ads.zzfow
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc(strS);
            }
        }, j, TimeUnit.MILLISECONDS), zzgxuVar, zzgyxVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.ads.internal.util.client.zzt zzd(String str) {
        zzcld zzcldVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkf)).booleanValue() || (zzcldVar = this.zze) == null || (!com.google.android.gms.ads.internal.zzt.zzc().zzi(str) && !com.google.android.gms.ads.internal.zzt.zzc().zzj(str))) {
            return this.zzb.zzc(str, null);
        }
        String strZzb = zzcldVar.zzb();
        HashMap map = new HashMap();
        if (strZzb != null) {
            map.put((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkg), strZzb);
        }
        return this.zzb.zzc(str, map);
    }

    public final ListenableFuture zza(String str) {
        if (str != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzg)).booleanValue() || !str.isEmpty()) {
                try {
                    return zze(str, 0L, 1);
                } catch (NullPointerException | RejectedExecutionException unused) {
                    return zzgym.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
                }
            }
        }
        return zzgym.zza(com.google.android.gms.ads.internal.util.client.zzt.PERMANENT_FAILURE);
    }

    public final /* synthetic */ ListenableFuture zzb(int i2, long j, String str, com.google.android.gms.ads.internal.util.client.zzt zztVar) {
        if (zztVar != com.google.android.gms.ads.internal.util.client.zzt.RETRIABLE_FAILURE) {
            return zzgym.zza(zztVar);
        }
        com.google.android.gms.ads.internal.util.client.zzx zzxVar = this.zza;
        long jZzb = zzxVar.zzb();
        if (i2 != 1) {
            jZzb = (long) (zzxVar.zzc() * j);
        }
        return zze(str, jZzb, i2 + 1);
    }
}
