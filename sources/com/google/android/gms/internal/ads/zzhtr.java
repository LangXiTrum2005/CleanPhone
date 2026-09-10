package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhtr {
    static {
        int i2 = zzhpy.zza;
        try {
            zza();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzhso.zzc();
        zzhss.zzc();
        zzhrm.zza(true);
        zzhte.zza(true);
        zzhtq.zza(true);
        if (zzhhc.zza()) {
            return;
        }
        zzhru.zza(true);
    }
}
