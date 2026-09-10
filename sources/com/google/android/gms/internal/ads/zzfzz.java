package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfzz {
    private static final Object zza = new Object();
    private static zzfzz zzb;
    private final zzfzx zzc;

    private zzfzz(Context context, ExecutorService executorService, zzgad zzgadVar) {
        zzgak zzgakVar = new zzgak(null);
        zzgakVar.zzc(context);
        zzgakVar.zzb(executorService);
        zzgakVar.zzd(zzgadVar);
        this.zzc = (zzfzx) ((zzgaj) zzgakVar.zza()).zzI.zzb();
    }

    public static zzfzz zza(Context context, ExecutorService executorService, zzgad zzgadVar) {
        zzfzz zzfzzVar;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    zzb = new zzfzz(context, executorService, zzgadVar);
                }
                zzfzzVar = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzfzzVar;
    }

    public final ListenableFuture zzb() {
        return this.zzc.zza();
    }

    public final String zzc(Context context) {
        return this.zzc.zzb(context);
    }

    public final String zzd(Context context, String str, View view, Activity activity) {
        return this.zzc.zzc(context, null, view, activity);
    }

    public final String zze(Context context, String str, View view, Activity activity) {
        return this.zzc.zzd(context, str, view, null);
    }

    public final void zzf(List list) {
        this.zzc.zze(list);
    }

    public final void zzg(InputEvent inputEvent) {
        this.zzc.zzf(inputEvent);
    }

    public final int zzh() {
        return this.zzc.zzj();
    }
}
