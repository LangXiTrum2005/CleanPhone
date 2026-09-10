package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.JobSupport.SelectOnJoinCompletionHandler;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class JobSupport$onJoin$1 extends FunctionReferenceImpl implements Function3<JobSupport, SelectInstance<?>, Object, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        JobSupport jobSupport = (JobSupport) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.X;
        jobSupport.getClass();
        while (true) {
            Object obj4 = JobSupport.X.get(jobSupport);
            if (!(obj4 instanceof Incomplete)) {
                z2 = false;
                break;
            }
            if (jobSupport.l0(obj4) >= 0) {
                z2 = true;
                break;
            }
        }
        Unit unit = Unit.f43263a;
        if (z2) {
            selectInstance.d(JobKt.c(jobSupport, true, jobSupport.new SelectOnJoinCompletionHandler(selectInstance)));
            return unit;
        }
        selectInstance.c(unit);
        return unit;
    }
}
