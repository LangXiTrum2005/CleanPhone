package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzagx extends zzaea {
    public zzagx(final zzafb zzafbVar, int i2, long j, long j2) {
        long j3;
        Objects.requireNonNull(zzafbVar);
        zzadx zzadxVar = new zzadx() { // from class: com.google.android.gms.internal.ads.zzagv
            @Override // com.google.android.gms.internal.ads.zzadx
            public final /* synthetic */ long zza(long j4) {
                return zzafbVar.zzb(j4);
            }
        };
        zzagw zzagwVar = new zzagw(zzafbVar, i2, null);
        long jZza = zzafbVar.zza();
        long j4 = zzafbVar.zzj;
        int i3 = zzafbVar.zzd;
        if (i3 > 0) {
            j3 = ((((long) i3) + ((long) zzafbVar.zzc)) / 2) + 1;
        } else {
            int i4 = zzafbVar.zza;
            int i5 = zzafbVar.zzb;
            long j5 = PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
            if (i4 == i5 && i4 > 0) {
                j5 = i4;
            }
            j3 = 64 + (((j5 * ((long) zzafbVar.zzg)) * ((long) zzafbVar.zzh)) / 8);
        }
        super(zzadxVar, zzagwVar, jZza, 0L, j4, j, j2, j3, Math.max(6, zzafbVar.zzc));
    }
}
