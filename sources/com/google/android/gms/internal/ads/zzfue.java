package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class zzfue implements Continuation {
    static final /* synthetic */ zzfue zza = new zzfue();

    private /* synthetic */ zzfue() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        return new Boolean(task.isSuccessful());
    }
}
