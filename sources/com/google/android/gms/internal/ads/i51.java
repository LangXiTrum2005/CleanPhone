package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i51 extends qz0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d31 f15601f;

    public i51(Context context, ExecutorService executorService, d31 d31Var) {
        super(context, executorService, new TaskCompletionSource().getTask(), false);
        this.f15601f = d31Var;
    }

    @Override // com.google.android.gms.internal.ads.qz0
    public final void b(int i10, long j10) {
        ((g31) this.f15601f).a(i10, j10, null, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.qz0
    public final void c(int i10, long j10, Exception exc) {
        ((g31) this.f15601f).a(i10, j10, null, exc);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }

    @Override // com.google.android.gms.internal.ads.qz0
    public final void d(int i10, String str) {
        ((g31) this.f15601f).a(i10, -1L, str, null);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setResult(Boolean.TRUE);
        taskCompletionSource.getTask();
    }
}
