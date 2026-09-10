package kotlinx.coroutines;

import com.startapp.sdk.components.e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CoroutineContextKt {
    public static final CoroutineContext a(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) coroutineContext.fold(bool, new e(3))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) coroutineContext2.fold(bool, new e(3))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.X = coroutineContext2;
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.X;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(emptyCoroutineContext, new Function2() { // from class: kotlinx.coroutines.b
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                CoroutineContext coroutineContext4 = (CoroutineContext) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                if (!(element instanceof CopyableThreadContextElement)) {
                    return coroutineContext4.plus(element);
                }
                Ref.ObjectRef objectRef2 = objectRef;
                if (((CoroutineContext) objectRef2.X).get(element.getX()) != null) {
                    objectRef2.X = ((CoroutineContext) objectRef2.X).minusKey(element.getX());
                    return coroutineContext4.plus(((CopyableThreadContextElement) element).P());
                }
                CopyableThreadContextElement copyableThreadContextElementT = (CopyableThreadContextElement) element;
                if (z2) {
                    copyableThreadContextElementT = copyableThreadContextElementT.t();
                }
                return coroutineContext4.plus(copyableThreadContextElementT);
            }
        });
        if (zBooleanValue2) {
            objectRef.X = ((CoroutineContext) objectRef.X).fold(emptyCoroutineContext, new e(4));
        }
        return coroutineContext3.plus((CoroutineContext) objectRef.X);
    }

    public static final CoroutineContext b(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextA = a(coroutineScope.getX(), coroutineContext, true);
        DefaultScheduler defaultScheduler = Dispatchers.f44752a;
        return (coroutineContextA == defaultScheduler || coroutineContextA.get(ContinuationInterceptor.Key.X) != null) ? coroutineContextA : coroutineContextA.plus(defaultScheduler);
    }

    public static final UndispatchedCoroutine c(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        UndispatchedCoroutine undispatchedCoroutine = null;
        if ((continuation instanceof CoroutineStackFrame) && coroutineContext.get(UndispatchedMarker.X) != null) {
            CoroutineStackFrame callerFrame = (CoroutineStackFrame) continuation;
            while (!(callerFrame instanceof DispatchedCoroutine) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof UndispatchedCoroutine) {
                    undispatchedCoroutine = (UndispatchedCoroutine) callerFrame;
                    break;
                }
            }
            if (undispatchedCoroutine != null) {
                undispatchedCoroutine.u0(coroutineContext, obj);
            }
        }
        return undispatchedCoroutine;
    }
}
