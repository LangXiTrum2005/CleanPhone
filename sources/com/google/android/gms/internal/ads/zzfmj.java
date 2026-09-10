package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfmj {
    private static int zza = 2;

    public static void zza(@NonNull Context context) {
        context.registerReceiver(new zzfmi(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }

    public static int zzb() {
        if (zzfmf.zza() != zzfkv.CTV) {
            return 2;
        }
        return zza;
    }
}
