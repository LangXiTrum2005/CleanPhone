package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzets implements zzezv {

    @Nullable
    private final Integer zza;

    private zzets(@Nullable Integer num) {
        this.zza = num;
    }

    public static /* synthetic */ zzets zzc(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlt)).booleanValue()) {
            return new zzets(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int extensionVersion = 0;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlw)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzlv)).intValue() && i2 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        extensionVersion = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzets(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzezv
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzczm zzczmVar = (zzczm) obj;
        if (num != null) {
            zzczmVar.zza.putInt("aos", num.intValue());
        }
    }
}
