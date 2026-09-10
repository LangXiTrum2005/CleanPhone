package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Job extends CoroutineContext.Element {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/Job$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key implements CoroutineContext.Key<Job> {
        public static final /* synthetic */ Key X = new Key();
    }

    void a(CancellationException cancellationException);

    boolean h();

    boolean isActive();

    boolean isCancelled();

    Sequence m();

    Object n(ContinuationImpl continuationImpl);

    DisposableHandle o(boolean z2, boolean z3, Function1 function1);

    CancellationException p();

    ChildHandle q(JobSupport jobSupport);

    DisposableHandle s(Function1 function1);

    boolean start();
}
