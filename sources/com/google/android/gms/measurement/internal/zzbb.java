package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.a;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbb {
    final String zza;
    final String zzb;
    final String zzc;
    final long zzd;
    final long zze;
    final zzbe zzf;

    public zzbb(zzic zzicVar, String str, String str2, String str3, long j, long j2, Bundle bundle) {
        zzbe zzbeVar;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzicVar.zzaV().zze().zzb("Event created with reverse previous/current timestamps. appId", zzgu.zzl(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    zzicVar.zzaV().zzb().zza("Param name can't be null");
                    it.remove();
                } else {
                    Object objZzE = zzicVar.zzk().zzE(next, bundle2.get(next));
                    if (objZzE == null) {
                        zzicVar.zzaV().zze().zzb("Param value can't be null", zzicVar.zzl().zzb(next));
                        it.remove();
                    } else {
                        zzicVar.zzk().zzM(bundle2, next, objZzE);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.zzf = zzbeVar;
    }

    public final String toString() {
        String string = this.zzf.toString();
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        a.C(sb, "Event{appId='", str, "', name='", str2);
        return android.support.v4.media.a.s(sb, "', params=", string, "}");
    }

    public final zzbb zza(zzic zzicVar, long j) {
        return new zzbb(zzicVar, this.zzc, this.zza, this.zzb, this.zzd, j, this.zzf);
    }

    private zzbb(zzic zzicVar, String str, String str2, String str3, long j, long j2, zzbe zzbeVar) {
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzbeVar);
        this.zza = str2;
        this.zzb = str3;
        this.zzc = true == TextUtils.isEmpty(str) ? null : str;
        this.zzd = j;
        this.zze = j2;
        if (j2 != 0 && j2 > j) {
            zzicVar.zzaV().zze().zzc("Event created with reverse previous/current timestamps. appId, name", zzgu.zzl(str2), zzgu.zzl(str3));
        }
        this.zzf = zzbeVar;
    }
}
