package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbij {
    public static final zzbhu zza = new zzbhu("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbhu zzb = new zzbhu("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbhu zzc = zzbhu.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbhu zzd = zzbhu.zza("gads:gma_attestation:click:enable", false);
    public static final zzbhu zze = zzbhu.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbhu zzf = zzbhu.zza("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbhu zzg = zzbhu.zza("gads:gma_attestation:image_hash", false);
    public static final zzbhu zzh = zzbhu.zza("gads:gma_attestation:impression:enable", false);
    public static final zzbhu zzi;

    static {
        zzbhu.zza("gads:gma_attestation:request:enable_javascript", false);
        zzbhu.zza("gads:gma_attestation:request:enable", true);
        zzi = zzbhu.zza("gads:gma_attestation:click:report_error", true);
    }
}
