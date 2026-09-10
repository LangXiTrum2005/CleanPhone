package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzicx extends zzidb {
    public zzicx() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzidb
    public final void zza() {
        if (!zzb()) {
            for (int i2 = 0; i2 < zzc(); i2++) {
                Map.Entry entryZzd = zzd(i2);
                if (((zziaf) ((zzicy) entryZzd).zza()).zzd()) {
                    entryZzd.setValue(Collections.unmodifiableList((List) entryZzd.getValue()));
                }
            }
            for (Map.Entry entry : zze()) {
                if (((zziaf) entry.getKey()).zzd()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
