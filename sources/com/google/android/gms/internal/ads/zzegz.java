package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.p004ironsource.d9;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzegz extends zzeha {
    private static final SparseArray zzg;
    private final Context zzb;
    private final zzczo zzc;
    private final TelephonyManager zzd;
    private final zzegr zze;
    private zzbfp.zzq zzf;

    static {
        SparseArray sparseArray = new SparseArray();
        zzg = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbfp.zzaf.zzd.CONNECTED);
        int iOrdinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbfp.zzaf.zzd zzdVar = zzbfp.zzaf.zzd.CONNECTING;
        sparseArray.put(iOrdinal, zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbfp.zzaf.zzd.DISCONNECTING);
        int iOrdinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbfp.zzaf.zzd zzdVar2 = zzbfp.zzaf.zzd.DISCONNECTED;
        sparseArray.put(iOrdinal2, zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzdVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbfp.zzaf.zzd.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzdVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzdVar);
    }

    public zzegz(Context context, zzczo zzczoVar, zzegr zzegrVar, zzegn zzegnVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzegnVar, zzgVar);
        this.zzb = context;
        this.zzc = zzczoVar;
        this.zze = zzegrVar;
        this.zzd = (TelephonyManager) context.getSystemService("phone");
    }

    public static final /* synthetic */ zzbfp.zzaf.zzd zze(Bundle bundle) {
        return (zzbfp.zzaf.zzd) zzg.get(zzfiz.zza(zzfiz.zza(bundle, d9.h.G), "network").getInt("active_network_state", -1), zzbfp.zzaf.zzd.UNSPECIFIED);
    }

    private static final zzbfp.zzq zzg(boolean z2) {
        return z2 ? zzbfp.zzq.ENUM_TRUE : zzbfp.zzq.ENUM_FALSE;
    }

    public final void zza(boolean z2) {
        zzgym.zzr(this.zzc.zza(new Bundle()), new zzegy(this, z2), zzcdo.zzg);
    }

    public final /* synthetic */ zzbfp.zzab zzb(Bundle bundle) {
        zzbfp.zzab.zzb zzbVar;
        zzbfp.zzab.zza zzaVarZzq = zzbfp.zzab.zzq();
        int i2 = bundle.getInt("cnt", -2);
        int i3 = bundle.getInt("gnt", 0);
        if (i2 == -1) {
            this.zzf = zzbfp.zzq.ENUM_TRUE;
        } else {
            this.zzf = zzbfp.zzq.ENUM_FALSE;
            if (i2 == 0) {
                zzaVarZzq.zzc(zzbfp.zzab.zzc.CELL);
            } else if (i2 != 1) {
                zzaVarZzq.zzc(zzbfp.zzab.zzc.NETWORKTYPE_UNSPECIFIED);
            } else {
                zzaVarZzq.zzc(zzbfp.zzab.zzc.WIFI);
            }
            switch (i3) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzbVar = zzbfp.zzab.zzb.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzbVar = zzbfp.zzab.zzb.THREE_G;
                    break;
                case 13:
                    zzbVar = zzbfp.zzab.zzb.LTE;
                    break;
                default:
                    zzbVar = zzbfp.zzab.zzb.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzaVarZzq.zzg(zzbVar);
        }
        return zzaVarZzq.zzbu();
    }

    public final /* synthetic */ byte[] zzc(boolean z2, ArrayList arrayList, zzbfp.zzab zzabVar, zzbfp.zzaf.zzd zzdVar) {
        zzbfp.zzaf.zza.C0187zza c0187zzaZzz = zzbfp.zzaf.zza.zzz();
        c0187zzaZzz.zzv(arrayList);
        Context context = this.zzb;
        c0187zzaZzz.zzJ(zzg(Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0));
        c0187zzaZzz.zzN(com.google.android.gms.ads.internal.zzt.zzf().zzf(context, this.zzd));
        zzegr zzegrVar = this.zze;
        c0187zzaZzz.zzk(zzegrVar.zzf());
        c0187zzaZzz.zzo(zzegrVar.zzj());
        c0187zzaZzz.zzR(zzegrVar.zzd());
        c0187zzaZzz.zzZ(zzdVar);
        c0187zzaZzz.zzz(zzabVar);
        c0187zzaZzz.zzV(this.zzf);
        c0187zzaZzz.zzg(zzg(z2));
        c0187zzaZzz.zzad(zzegrVar.zzb());
        c0187zzaZzz.zzc(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        c0187zzaZzz.zzF(zzg(Settings.Global.getInt(context.getContentResolver(), "wifi_on", 0) != 0));
        return c0187zzaZzz.zzbu().zzaN();
    }

    public final /* synthetic */ zzegr zzd() {
        return this.zze;
    }
}
