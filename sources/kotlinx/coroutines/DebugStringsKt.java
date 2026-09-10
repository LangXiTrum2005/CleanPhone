package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class DebugStringsKt {
    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String b(Continuation continuation) {
        Object objA;
        if (continuation instanceof DispatchedContinuation) {
            return ((DispatchedContinuation) continuation).toString();
        }
        try {
            objA = continuation + '@' + a(continuation);
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (Result.a(objA) != null) {
            objA = continuation.getClass().getName() + '@' + a(continuation);
        }
        return (String) objA;
    }
}
