package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfqz {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final zzfly zzd;
    private final ClientApi zze = new ClientApi();
    private final zzfjg zzf;
    private final Clock zzg;
    private final zzfpp zzh;

    public zzfqz(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfly zzflyVar, zzfjg zzfjgVar, Clock clock, zzfpp zzfppVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzd = zzflyVar;
        this.zzg = clock;
        this.zzf = zzfjgVar;
        this.zzh = zzfppVar;
    }

    private final zzfpy zzc() {
        return new zzfpy(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzG)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzH)).longValue(), 0.2d, this.zzg);
    }

    public final zzfqy zza(com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfqa(clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzftVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfrd(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzftVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfpx(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzftVar, zzceVar, this.zzc, this.zzd, zzc(), this.zzg);
    }

    public final zzfqy zzb(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zze;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfqa(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zzf, zzftVar, zzchVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zze;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfrd(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zzf, zzftVar, zzchVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zze;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfpx(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zzf, zzftVar, zzchVar, this.zzc, this.zzd, zzc(), this.zzg, this.zzh);
    }
}
