package kotlinx.coroutines.internal;

import _COROUTINE.CoroutineDebuggingKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000*\f\b\u0000\u0010\u0003\"\u00020\u00022\u00020\u0002¨\u0006\u0004"}, d2 = {"Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class StackTraceRecoveryKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f45045a = 0;

    static {
        Object objA;
        Object objA2;
        CoroutineDebuggingKt.a(new Exception(), "_BOUNDARY");
        try {
            objA = BaseContinuationImpl.class.getCanonicalName();
        } catch (Throwable th) {
            objA = ResultKt.a(th);
        }
        if (Result.a(objA) != null) {
            objA = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objA2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            objA2 = ResultKt.a(th2);
        }
        if (Result.a(objA2) != null) {
            objA2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
