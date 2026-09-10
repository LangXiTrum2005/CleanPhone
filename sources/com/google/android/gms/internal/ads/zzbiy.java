package com.google.android.gms.internal.ads;

import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbiy {
    public static final zzbhu zza;

    static {
        zzbhu.zzb("gads:ad_loader:timeout_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        zza = zzbhu.zzb("gads:rendering:timeout_ms", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
        zzbhu.zzb("gads:resolve_future:default_timeout_ms", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
    }
}
