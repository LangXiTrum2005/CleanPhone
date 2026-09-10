package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbiz {
    public static final zzbhu zza = zzbhu.zza("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbhu zzb;

    static {
        zzbhu.zza("gads:invalidate_token_at_refresh_start", true);
        zzbhu.zza("gms:expose_token_for_gma:enabled", true);
        zzbhu.zza("gads:referesh_rate_limit", false);
        zzb = zzbhu.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbhu.zza("gads:token_anonymization:enabled", true);
        zzbhu.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
