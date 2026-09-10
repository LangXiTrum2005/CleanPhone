package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbit {
    public static final zzbhu zza = zzbhu.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbhu zzb = zzbhu.zza("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbhu zzc = new zzbhu("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbhu zzd = new zzbhu("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbhu zze;
    public static final zzbhu zzf;

    static {
        zzbhu.zza("gads:sdk_crash_report_enabled", false);
        zze = zzbhu.zza("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbhu.zzc("gads:trapped_exception_sample_rate", 0.01d);
    }
}
