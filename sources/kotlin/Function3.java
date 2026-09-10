package kotlin;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: renamed from: kotlin.DeepRecursiveKt, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*r\b\u0002\u0010\u0005\"5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¢\u0006\u0002\b\u000425\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0000¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lkotlin/Function3;", "Lkotlin/DeepRecursiveScope;", "", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "DeepRecursiveFunctionBlock", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CoroutineSingletons f43244a = CoroutineSingletons.X;

    public static final Object a(DeepRecursiveFunction deepRecursiveFunction) {
        Object objInvoke;
        Unit unit = Unit.f43263a;
        kotlin.jvm.functions.Function3 function3 = deepRecursiveFunction.f43243a;
        DeepRecursiveScopeImpl deepRecursiveScopeImpl = new DeepRecursiveScopeImpl();
        deepRecursiveScopeImpl.X = function3;
        deepRecursiveScopeImpl.f43245Y = unit;
        deepRecursiveScopeImpl.Z = deepRecursiveScopeImpl;
        CoroutineSingletons coroutineSingletons = f43244a;
        deepRecursiveScopeImpl.e0 = coroutineSingletons;
        while (true) {
            Object obj = deepRecursiveScopeImpl.e0;
            Continuation continuation = deepRecursiveScopeImpl.Z;
            if (continuation == null) {
                ResultKt.b(obj);
                return obj;
            }
            if (Intrinsics.a(coroutineSingletons, obj)) {
                try {
                    kotlin.jvm.functions.Function3 function4 = deepRecursiveScopeImpl.X;
                    Unit unit2 = deepRecursiveScopeImpl.f43245Y;
                    if (function4 == null) {
                        Intrinsics.f(function4, "<this>");
                        CoroutineContext f45023y = continuation.getF45023Y();
                        Object intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1 = f45023y == EmptyCoroutineContext.X ? new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1(continuation) : new IntrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$2(continuation, f45023y);
                        TypeIntrinsics.d(3, function4);
                        objInvoke = function4.invoke(deepRecursiveScopeImpl, unit2, intrinsicsKt__IntrinsicsJvmKt$createSimpleCoroutineForSuspendFunction$1);
                    } else {
                        TypeIntrinsics.d(3, function4);
                        objInvoke = function4.invoke(deepRecursiveScopeImpl, unit2, continuation);
                    }
                    if (objInvoke != CoroutineSingletons.X) {
                        continuation.resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    continuation.resumeWith(ResultKt.a(th));
                }
            } else {
                deepRecursiveScopeImpl.e0 = coroutineSingletons;
                continuation.resumeWith(obj);
            }
        }
    }
}
