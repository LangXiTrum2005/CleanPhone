package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbii {
    public static final zzbhu zza = zzbhu.zza("gads:init:init_on_bg_thread", true);
    public static final zzbhu zzb = zzbhu.zza("gads:init:init_on_single_bg_thread", false);
    public static final zzbhu zzc = zzbhu.zza("gads:adloader_load_bg_thread", true);
    public static final zzbhu zzd = zzbhu.zza("gads:appopen_load_on_bg_thread", true);
    public static final zzbhu zze = zzbhu.zza("gads:banner_destroy_bg_thread", false);
    public static final zzbhu zzf = zzbhu.zza("gads:banner_load_bg_thread", true);
    public static final zzbhu zzg = zzbhu.zza("gads:banner_pause_bg_thread", false);
    public static final zzbhu zzh = zzbhu.zza("gads:banner_resume_bg_thread", false);
    public static final zzbhu zzi = zzbhu.zza("gads:interstitial_load_on_bg_thread", true);
    public static final zzbhu zzj;
    public static final zzbhu zzk;

    static {
        zzbhu.zza("gads:persist_flags_on_bg_thread", true);
        zzj = zzbhu.zza("gads:query_info_bg_thread", true);
        zzk = zzbhu.zza("gads:rewarded_load_bg_thread", true);
    }
}
