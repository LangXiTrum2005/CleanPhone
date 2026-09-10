package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbpl implements zzard {
    private volatile zzboy zza;
    private final Context zzb;

    public zzbpl(Context context) {
        this.zzb = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzard
    public final zzarg zza(zzark zzarkVar) throws zzart {
        Parcelable.Creator<zzboz> creator = zzboz.CREATOR;
        Map mapZzm = zzarkVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i2 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzboz zzbozVar = new zzboz(zzarkVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcdt zzcdtVar = new zzcdt();
            this.zza = new zzboy(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbpj(this, zzcdtVar), new zzbpk(this, zzcdtVar));
            this.zza.checkAvailabilityAndConnect();
            zzbph zzbphVar = new zzbph(this, zzbozVar);
            zzgyw zzgywVar = zzcdo.zza;
            ListenableFuture listenableFutureZzi = zzgym.zzi(zzgym.zzj(zzcdtVar, zzbphVar, zzgywVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfp)).intValue(), TimeUnit.MILLISECONDS, zzcdo.zzd);
            listenableFutureZzi.addListener(new zzbpi(this), zzgywVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) listenableFutureZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb.append("Http assets remote cache took ");
            sb.append(jElapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            zzbpb zzbpbVar = (zzbpb) new zzbyy(parcelFileDescriptor).zza(zzbpb.CREATOR);
            if (zzbpbVar == null) {
                return null;
            }
            if (zzbpbVar.zza) {
                throw new zzart(zzbpbVar.zzb);
            }
            String[] strArr3 = zzbpbVar.zze;
            String[] strArr4 = zzbpbVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < strArr3.length; i3++) {
                map.put(strArr3[i3], strArr4[i3]);
            }
            return new zzarg(zzbpbVar.zzc, zzbpbVar.zzd, map, zzbpbVar.zzg, zzbpbVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime3);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            return null;
        } catch (Throwable th) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime4);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            throw th;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzboy zzc() {
        return this.zza;
    }
}
