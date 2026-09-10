package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfuv {
    private final Context zza;
    private final Executor zzb;
    private final zzfuf zzc;
    private final zzfuu zzd;
    private Task zze;

    public zzfuv(Context context, Executor executor, zzfuf zzfufVar, zzfuh zzfuhVar, zzfur zzfurVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzfufVar;
        this.zzd = zzfurVar;
    }

    public static zzfuv zza(Context context, Executor executor, zzfuf zzfufVar, zzfuh zzfuhVar) {
        final zzfuv zzfuvVar = new zzfuv(context, executor, zzfufVar, zzfuhVar, new zzfur());
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzfut
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        };
        Executor executor2 = zzfuvVar.zzb;
        zzfuvVar.zze = Tasks.call(executor2, callable).addOnFailureListener(executor2, new OnFailureListener() { // from class: com.google.android.gms.internal.ads.zzfus
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzd(exc);
            }
        });
        return zzfuvVar;
    }

    public final zzawp zzb() {
        zzfuu zzfuuVar = this.zzd;
        Task task = this.zze;
        return !task.isSuccessful() ? zzfuuVar.zza() : (zzawp) task.getResult();
    }

    public final /* synthetic */ zzawp zzc() throws PackageManager.NameNotFoundException {
        Context context = this.zza;
        return zzfum.zza(context, context.getPackageName(), Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
    }

    public final /* synthetic */ void zzd(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.zzc.zzc(2025, -1L, exc);
    }
}
