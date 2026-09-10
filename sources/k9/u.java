package k9;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements j9.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.internal.auth.o f44514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f44515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f44516c;

    public u(com.google.android.gms.internal.auth.o oVar, TaskCompletionSource taskCompletionSource, l lVar) {
        this.f44514a = oVar;
        this.f44515b = taskCompletionSource;
        this.f44516c = lVar;
    }

    @Override // j9.m
    public final void a(Status status) {
        boolean zB = status.b();
        TaskCompletionSource taskCompletionSource = this.f44515b;
        if (!zB) {
            taskCompletionSource.setException(c0.m(status));
            return;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        taskCompletionSource.setResult(this.f44516c.d(this.f44514a.a()));
    }
}
