package com.google.android.gms.internal.ads;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwz {
    public static String zza(zzhwl zzhwlVar) throws GeneralSecurityException {
        zzhxa.zzb(zzhwlVar);
        return zzhwlVar.toString().concat("withECDSA");
    }

    public static String zzb(zzhwl zzhwlVar) throws GeneralSecurityException {
        int iOrdinal = zzhwlVar.ordinal();
        if (iOrdinal == 0) {
            return AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1;
        }
        if (iOrdinal == 1) {
            return "SHA-224";
        }
        if (iOrdinal == 2) {
            return "SHA-256";
        }
        if (iOrdinal == 3) {
            return "SHA-384";
        }
        if (iOrdinal == 4) {
            return "SHA-512";
        }
        throw new GeneralSecurityException("Unsupported hash ".concat(zzhwlVar.toString()));
    }
}
