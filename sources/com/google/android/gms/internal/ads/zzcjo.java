package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzcjo implements zzbnn {
    final /* synthetic */ zzcju zza;

    public zzcjo(zzcju zzcjuVar) {
        Objects.requireNonNull(zzcjuVar);
        this.zza = zzcjuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        if (map != null) {
            String str = (String) map.get("height");
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                int i2 = Integer.parseInt(str);
                zzcju zzcjuVar = this.zza;
                synchronized (zzcjuVar) {
                    try {
                        if (zzcjuVar.zzaX() != i2) {
                            zzcjuVar.zzaY(i2);
                            zzcjuVar.requestLayout();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e2) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Exception occurred while getting webview content height", e2);
            }
        }
    }
}
