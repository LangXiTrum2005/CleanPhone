package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwc {
    public static final zzhwc zza = new zzhwc(new zzhwd());
    public static final zzhwc zzb = new zzhwc(new zzhwh());
    public static final zzhwc zzc = new zzhwc(new zzhwj());
    public static final zzhwc zzd = new zzhwc(new zzhwi());
    public static final zzhwc zze;
    public static final zzhwc zzf;
    private final zzhwb zzg;

    static {
        new zzhwc(new zzhwe());
        zze = new zzhwc(new zzhwg());
        zzf = new zzhwc(new zzhwf());
    }

    public zzhwc(zzhwk zzhwkVar) {
        this.zzg = !zzhhc.zza() ? "The Android Project".equals(System.getProperty("java.vendor")) ? new zzhvy(zzhwkVar, null) : new zzhvz(zzhwkVar, null) : new zzhwa(zzhwkVar, null);
    }

    public static List zza(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zzb(String str) throws GeneralSecurityException {
        return this.zzg.zza(str);
    }
}
