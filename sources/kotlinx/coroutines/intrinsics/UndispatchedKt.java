package kotlinx.coroutines.intrinsics;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class UndispatchedKt {
    public static final Object a(ScopeCoroutine scopeCoroutine, ScopeCoroutine scopeCoroutine2, Function2 function2) {
        Object completedExceptionally;
        Object objC0;
        try {
            TypeIntrinsics.d(2, function2);
            completedExceptionally = function2.invoke(scopeCoroutine2, scopeCoroutine);
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(false, th);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (completedExceptionally == coroutineSingletons || (objC0 = scopeCoroutine.c0(completedExceptionally)) == JobSupportKt.f44764b) {
            return coroutineSingletons;
        }
        if (objC0 instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) objC0).f44747a;
        }
        return JobSupportKt.a(objC0);
    }
}
