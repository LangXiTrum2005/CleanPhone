package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobSupport.SelectOnAwaitCompletionHandler;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements Function3<JobSupport, SelectInstance<?>, Object, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objA;
        JobSupport jobSupport = (JobSupport) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.X;
        jobSupport.getClass();
        do {
            objA = JobSupport.X.get(jobSupport);
            if (!(objA instanceof Incomplete)) {
                if (!(objA instanceof CompletedExceptionally)) {
                    objA = JobSupportKt.a(objA);
                }
                selectInstance.c(objA);
            }
            return Unit.f43263a;
        } while (jobSupport.l0(objA) < 0);
        selectInstance.d(JobKt.c(jobSupport, true, jobSupport.new SelectOnAwaitCompletionHandler(selectInstance)));
        return Unit.f43263a;
    }
}
