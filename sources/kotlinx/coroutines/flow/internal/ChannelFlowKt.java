package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChannelFlowKt {
    public static final Object a(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation frame) {
        Object objInvoke;
        Object objC = ThreadContextKt.c(coroutineContext, obj2);
        try {
            StackFrameContinuation stackFrameContinuation = new StackFrameContinuation(frame, coroutineContext);
            if (function2 == null) {
                objInvoke = IntrinsicsKt.c(function2, obj, stackFrameContinuation);
            } else {
                TypeIntrinsics.d(2, function2);
                objInvoke = function2.invoke(obj, stackFrameContinuation);
            }
            ThreadContextKt.a(coroutineContext, objC);
            if (objInvoke == CoroutineSingletons.X) {
                Intrinsics.f(frame, "frame");
            }
            return objInvoke;
        } catch (Throwable th) {
            ThreadContextKt.a(coroutineContext, objC);
            throw th;
        }
    }
}
