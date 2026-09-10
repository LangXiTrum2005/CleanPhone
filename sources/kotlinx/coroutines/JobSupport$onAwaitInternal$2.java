package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class JobSupport$onAwaitInternal$2 extends FunctionReferenceImpl implements Function3<JobSupport, Object, Object, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.X;
        ((JobSupport) obj).getClass();
        if (obj3 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj3).f44747a;
        }
        return obj3;
    }
}
