package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaak {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzaal zzaalVar) {
        zzb(zzaalVar);
        this.zza.add(new zzaaj(handler, zzaalVar));
    }

    public final void zzb(zzaal zzaalVar) {
        CopyOnWriteArrayList<zzaaj> copyOnWriteArrayList = this.zza;
        for (zzaaj zzaajVar : copyOnWriteArrayList) {
            if (zzaajVar.zzc() == zzaalVar) {
                zzaajVar.zza();
                copyOnWriteArrayList.remove(zzaajVar);
            }
        }
    }

    public final void zzc(final int i2, final long j, final long j2) {
        for (final zzaaj zzaajVar : this.zza) {
            if (!zzaajVar.zzd()) {
                zzaajVar.zzb().post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaai
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzaajVar.zzc().zzX(i2, j, j2);
                    }
                });
            }
        }
    }
}
