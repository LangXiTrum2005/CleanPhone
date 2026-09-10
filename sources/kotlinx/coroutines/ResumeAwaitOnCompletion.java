package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ResumeAwaitOnCompletion;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class ResumeAwaitOnCompletion<T> extends JobNode {
    public final CancellableContinuationImpl f0;

    public ResumeAwaitOnCompletion(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f0 = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        Object obj = JobSupport.X.get(j());
        boolean z2 = obj instanceof CompletedExceptionally;
        CancellableContinuationImpl cancellableContinuationImpl = this.f0;
        if (z2) {
            cancellableContinuationImpl.resumeWith(ResultKt.a(((CompletedExceptionally) obj).f44747a));
        } else {
            cancellableContinuationImpl.resumeWith(JobSupportKt.a(obj));
        }
    }
}
