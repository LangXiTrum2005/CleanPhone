package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@7.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdy {
    private static final zzdx zza;
    private static final zzdx zzb;

    static {
        zzdx zzdxVar = null;
        try {
            zzdxVar = (zzdx) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzdxVar;
        zzb = new zzdx();
    }

    public static zzdx zza() {
        return zza;
    }

    public static zzdx zzb() {
        return zzb;
    }
}
