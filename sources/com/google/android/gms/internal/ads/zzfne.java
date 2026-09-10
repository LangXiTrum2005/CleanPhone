package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public interface zzfne {
    static zzfne zzn(Context context, int i2) {
        boolean zBooleanValue;
        if (zzfnr.zza()) {
            int i3 = i2 - 2;
            if (i3 == 20 || i3 == 21) {
                zBooleanValue = ((Boolean) zzbid.zze.zze()).booleanValue();
            } else if (i3 != 110) {
                switch (i3) {
                    case 2:
                    case 3:
                    case 6:
                    case 7:
                    case 8:
                        zBooleanValue = ((Boolean) zzbid.zzc.zze()).booleanValue();
                        break;
                    case 4:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                        zBooleanValue = ((Boolean) zzbid.zzd.zze()).booleanValue();
                        break;
                    case 5:
                        zBooleanValue = ((Boolean) zzbid.zzb.zze()).booleanValue();
                        break;
                }
            } else {
                zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkh)).booleanValue();
            }
            if (zBooleanValue) {
                return new zzfng(context, i2);
            }
        }
        return new zzfof();
    }

    static zzfne zzo(Context context, int i2, int i3, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        zzfne zzfneVarZzn = zzn(context, i2);
        if (zzfneVarZzn instanceof zzfng) {
            zzfneVarZzn.zza();
            zzfneVarZzn.zzp(i3);
            zzfneVarZzn.zzf(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzd(zzmVar.zzm));
            String str = zzmVar.zzp;
            if (zzfnn.zza(str)) {
                zzfneVarZzn.zze(str);
            }
        }
        return zzfneVarZzn;
    }

    zzfne zza();

    boolean zzb();

    zzfne zzc();

    zzfne zzd(boolean z2);

    zzfne zze(String str);

    zzfne zzf(zzfnt zzfntVar);

    zzfne zzg(zzfib zzfibVar);

    zzfne zzh(com.google.android.gms.ads.internal.client.zze zzeVar);

    zzfne zzi(String str);

    zzfne zzj(Throwable th);

    zzfne zzk(String str);

    boolean zzl();

    zzfnh zzm();

    zzfne zzp(int i2);
}
