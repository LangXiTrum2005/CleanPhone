package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimeoutKt {
    public static final Object a(TimeoutCoroutine timeoutCoroutine, Function2 function2) throws Throwable {
        Object completedExceptionally;
        Object objC0;
        JobKt.c(timeoutCoroutine, true, new DisposeOnCompletion(DelayKt.b(timeoutCoroutine.e0.getF0()).i(timeoutCoroutine.f0, timeoutCoroutine, timeoutCoroutine.Z)));
        try {
            if (function2 == null) {
                completedExceptionally = IntrinsicsKt.c(function2, timeoutCoroutine, timeoutCoroutine);
            } else {
                TypeIntrinsics.d(2, function2);
                completedExceptionally = function2.invoke(timeoutCoroutine, timeoutCoroutine);
            }
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(false, th);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (completedExceptionally == coroutineSingletons || (objC0 = timeoutCoroutine.c0(completedExceptionally)) == JobSupportKt.f44764b) {
            return coroutineSingletons;
        }
        if (objC0 instanceof CompletedExceptionally) {
            Throwable th2 = ((CompletedExceptionally) objC0).f44747a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).X != timeoutCoroutine) {
                throw th2;
            }
            if (completedExceptionally instanceof CompletedExceptionally) {
                throw ((CompletedExceptionally) completedExceptionally).f44747a;
            }
        } else {
            completedExceptionally = JobSupportKt.a(objC0);
        }
        return completedExceptionally;
    }

    public static final Object b(long j, Function2 function2, ContinuationImpl continuationImpl) throws Throwable {
        if (j <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objA = a(new TimeoutCoroutine(j, continuationImpl), function2);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(long j, Function2 function2, Continuation continuation) throws Throwable {
        TimeoutKt$withTimeoutOrNull$1 timeoutKt$withTimeoutOrNull$1;
        Ref.ObjectRef objectRef;
        if (continuation instanceof TimeoutKt$withTimeoutOrNull$1) {
            timeoutKt$withTimeoutOrNull$1 = (TimeoutKt$withTimeoutOrNull$1) continuation;
            int i2 = timeoutKt$withTimeoutOrNull$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                timeoutKt$withTimeoutOrNull$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
            }
        } else {
            timeoutKt$withTimeoutOrNull$1 = new TimeoutKt$withTimeoutOrNull$1(continuation);
        }
        Object obj = timeoutKt$withTimeoutOrNull$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = timeoutKt$withTimeoutOrNull$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (j <= 0) {
                return null;
            }
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            try {
                timeoutKt$withTimeoutOrNull$1.X = function2;
                timeoutKt$withTimeoutOrNull$1.f44769Y = objectRef2;
                timeoutKt$withTimeoutOrNull$1.e0 = 1;
                TimeoutCoroutine timeoutCoroutine = new TimeoutCoroutine(j, timeoutKt$withTimeoutOrNull$1);
                objectRef2.X = timeoutCoroutine;
                Object objA = a(timeoutCoroutine, function2);
                return objA == coroutineSingletons ? coroutineSingletons : objA;
            } catch (TimeoutCancellationException e2) {
                e = e2;
                objectRef = objectRef2;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            objectRef = timeoutKt$withTimeoutOrNull$1.f44769Y;
            Function2 function3 = timeoutKt$withTimeoutOrNull$1.X;
            try {
                ResultKt.b(obj);
                return obj;
            } catch (TimeoutCancellationException e3) {
                e = e3;
            }
        }
        if (e.X == objectRef.X) {
            return null;
        }
        throw e;
    }
}
