package kotlinx.coroutines;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AwaitKt {
    public static final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        return arrayList.isEmpty() ? EmptyList.X : new AwaitAll((Deferred[]) arrayList.toArray(new Deferred[0])).a(continuationImpl);
    }

    public static final Object b(Deferred[] deferredArr, Continuation continuation) {
        return deferredArr.length == 0 ? EmptyList.X : new AwaitAll(deferredArr).a((ContinuationImpl) continuation);
    }
}
