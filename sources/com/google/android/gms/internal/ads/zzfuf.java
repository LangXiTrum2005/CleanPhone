package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class zzfuf {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzf = 1;
    private final Context zzb;
    private final Executor zzc;
    private final Task zzd;
    private final boolean zze;

    public zzfuf(Context context, Executor executor, Task task, boolean z2) {
        this.zzb = context;
        this.zzc = executor;
        this.zzd = task;
        this.zze = z2;
    }

    public static zzfuf zza(final Context context, Executor executor, boolean z2) {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z2) {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfub
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfwb.zzb(context, "GLAS", null));
                }
            });
        } else {
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfud
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    taskCompletionSource.setResult(zzfwb.zzc());
                }
            });
        }
        return new zzfuf(context, executor, taskCompletionSource.getTask(), z2);
    }

    public static void zzg(int i2) {
        zzf = i2;
    }

    private final Task zzh(final int i2, long j, Exception exc, String str, Map map, String str2) {
        if (!this.zze) {
            return this.zzd.continueWith(this.zzc, zzfue.zza);
        }
        Context context = this.zzb;
        final zzauy zzauyVarZza = zzavc.zza();
        zzauyVarZza.zza(context.getPackageName());
        zzauyVarZza.zzb(j);
        zzauyVarZza.zzg(zzf);
        if (exc != null) {
            int i3 = zzgqx.zza;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            zzauyVarZza.zzc(stringWriter.toString());
            zzauyVarZza.zzd(exc.getClass().getName());
        }
        if (str2 != null) {
            zzauyVarZza.zze(str2);
        }
        if (str != null) {
            zzauyVarZza.zzf(str);
        }
        return this.zzd.continueWith(this.zzc, new Continuation() { // from class: com.google.android.gms.internal.ads.zzfuc
            @Override // com.google.android.gms.tasks.Continuation
            public final /* synthetic */ Object then(Task task) {
                if (!task.isSuccessful()) {
                    return Boolean.FALSE;
                }
                int i4 = i2;
                zzfwa zzfwaVarZza = ((zzfwb) task.getResult()).zza(((zzavc) zzauyVarZza.zzbu()).zzaN());
                zzfwaVarZza.zzc(i4);
                zzfwaVarZza.zza();
                return Boolean.TRUE;
            }
        });
    }

    public Task zzb(int i2, long j) {
        return zzh(i2, j, null, null, null, null);
    }

    public Task zzc(int i2, long j, Exception exc) {
        return zzh(i2, j, exc, null, null, null);
    }

    public final Task zzd(int i2, long j, String str, Map map) {
        return zzh(i2, j, null, str, null, null);
    }

    public Task zze(int i2, String str) {
        return zzh(i2, 0L, null, null, null, str);
    }

    public final Task zzf(int i2, long j, String str) {
        return zzh(i2, j, null, null, null, str);
    }
}
