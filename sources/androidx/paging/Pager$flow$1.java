package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
final /* synthetic */ class Pager$flow$1 extends FunctionReferenceImpl implements Function1<Continuation<? super PagingSource<Object, Object>>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Continuation continuation) {
        SuspendingPagingSourceFactory suspendingPagingSourceFactory = (SuspendingPagingSourceFactory) this.receiver;
        suspendingPagingSourceFactory.getClass();
        return BuildersKt.f(null, new SuspendingPagingSourceFactory$create$2(suspendingPagingSourceFactory, null), continuation);
    }
}
