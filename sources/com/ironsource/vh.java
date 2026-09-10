package com.ironsource;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vh implements Hf.a, OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ScheduledFuture f30870a;

    public /* synthetic */ vh(ScheduledFuture scheduledFuture) {
        this.f30870a = scheduledFuture;
    }

    @Override // com.ironsource.Hf.a
    public void cancel() {
        M5.a(this.f30870a);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        this.f30870a.cancel(false);
    }
}
