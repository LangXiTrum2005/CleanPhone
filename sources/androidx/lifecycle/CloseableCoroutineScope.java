package androidx.lifecycle;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/CloseableCoroutineScope;", "Ljava/io/Closeable;", "Lkotlinx/coroutines/CoroutineScope;", "lifecycle-viewmodel-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CloseableCoroutineScope implements Closeable, CoroutineScope {
    public final CoroutineContext X;

    public CloseableCoroutineScope(CoroutineContext context) {
        Intrinsics.f(context, "context");
        this.X = context;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Job job = (Job) this.X.get(Job.Key.X);
        if (job != null) {
            job.a(null);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext, reason: from getter */
    public final CoroutineContext getX() {
        return this.X;
    }
}
