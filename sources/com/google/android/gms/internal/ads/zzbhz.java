package com.google.android.gms.internal.ads;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbhz {
    public static final zzbhu zza = zzbhu.zzb("gads:app_permissions_caching_expiry_ms:expiry", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
    public static final zzbhu zzb = zzbhu.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbhu zzc = zzbhu.zzb("gads:battery_caching_expiry_ms:expiry", 10000);
    public static final zzbhu zzd = zzbhu.zzb("gads:device_info_caching_expiry_ms:expiry", 300000);
    public static final zzbhu zze = zzbhu.zzb("gads:hsdp_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbhu zzf = zzbhu.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbhu zzg = zzbhu.zzb("gads:sdk_environment_caching_expiry_ms:expiry", TTAdConstant.AD_MAX_EVENT_TIME);
    public static final zzbhu zzh = zzbhu.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
