package com.google.android.play.core.review.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes4.dex */
final class zzm extends zzj {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f19653Y;
    public final /* synthetic */ zzj Z;
    public final /* synthetic */ zzt e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzm(zzt zztVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzj zzjVar) {
        super(taskCompletionSource);
        this.f19653Y = taskCompletionSource2;
        this.Z = zzjVar;
        this.e0 = zztVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void b() {
        synchronized (this.e0.f) {
            try {
                final zzt zztVar = this.e0;
                final TaskCompletionSource taskCompletionSource = this.f19653Y;
                zztVar.f19661e.add(taskCompletionSource);
                taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.core.review.internal.zzl
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        zzt zztVar2 = zztVar;
                        TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                        synchronized (zztVar2.f) {
                            zztVar2.f19661e.remove(taskCompletionSource2);
                        }
                    }
                });
                if (this.e0.k.getAndIncrement() > 0) {
                    this.e0.f19659b.a("Already connected to the service.", new Object[0]);
                }
                zzt.b(this.e0, this.Z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
