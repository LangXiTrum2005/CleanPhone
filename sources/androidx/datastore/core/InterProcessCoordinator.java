package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/datastore/core/InterProcessCoordinator;", "", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface InterProcessCoordinator {
    Object a(Function2 function2, ContinuationImpl continuationImpl);

    Flow b();

    Object c(ContinuationImpl continuationImpl);

    Object d(Function1 function1, ContinuationImpl continuationImpl);

    Object e(Continuation continuation);
}
