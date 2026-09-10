package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlinx/coroutines/JobKt__FutureKt", "kotlinx/coroutines/JobKt__JobKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class JobKt {
    public static JobImpl a() {
        return new JobImpl(null);
    }

    public static final void b(CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.Key.X);
        if (job != null && !job.isActive()) {
            throw job.p();
        }
    }

    public static final DisposableHandle c(Job job, boolean z2, JobNode jobNode) {
        return job instanceof JobSupport ? ((JobSupport) job).Z(z2, jobNode) : job.o(jobNode.k(), z2, new JobKt__JobKt$invokeOnCompletion$1(1, jobNode, JobNode.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0));
    }
}
