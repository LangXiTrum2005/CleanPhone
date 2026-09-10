package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/AbstractCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractCoroutine<T> extends JobSupport implements Job, Continuation<T>, CoroutineScope {
    public final CoroutineContext Z;

    public AbstractCoroutine(CoroutineContext coroutineContext, boolean z2) {
        super(z2);
        Y((Job) coroutineContext.get(Job.Key.X));
        this.Z = coroutineContext.plus(this);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final String L() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void X(CompletionHandlerException completionHandlerException) {
        CoroutineExceptionHandlerKt.a(this.Z, completionHandlerException);
    }

    @Override // kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public final CoroutineContext getF45023Y() {
        return this.Z;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    /* JADX INFO: renamed from: getCoroutineContext */
    public final CoroutineContext getF5233Y() {
        return this.Z;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void h0(Object obj) {
        if (!(obj instanceof CompletedExceptionally)) {
            r0(obj);
            return;
        }
        CompletedExceptionally completedExceptionally = (CompletedExceptionally) obj;
        q0(CompletedExceptionally.f44746b.get(completedExceptionally) != 0, completedExceptionally.f44747a);
    }

    public void r0(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            obj = new CompletedExceptionally(false, thA);
        }
        Object objC0 = c0(obj);
        if (objC0 == JobSupportKt.f44764b) {
            return;
        }
        C(objC0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void s0(CoroutineStart coroutineStart, AbstractCoroutine abstractCoroutine, Function2 function2) {
        int iOrdinal = coroutineStart.ordinal();
        Unit unit = Unit.f43263a;
        if (iOrdinal == 0) {
            try {
                DispatchedContinuationKt.a(unit, IntrinsicsKt.b(((BaseContinuationImpl) function2).create(abstractCoroutine, this)));
                return;
            } catch (Throwable th) {
                resumeWith(ResultKt.a(th));
                throw th;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                IntrinsicsKt.b(((BaseContinuationImpl) function2).create(abstractCoroutine, this)).resumeWith(unit);
                return;
            }
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                CoroutineContext coroutineContext = this.Z;
                Object objC = ThreadContextKt.c(coroutineContext, null);
                try {
                    TypeIntrinsics.d(2, function2);
                    Object objInvoke = function2.invoke(abstractCoroutine, this);
                    ThreadContextKt.a(coroutineContext, objC);
                    if (objInvoke != CoroutineSingletons.X) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th2) {
                    ThreadContextKt.a(coroutineContext, objC);
                    throw th2;
                }
            } catch (Throwable th3) {
                resumeWith(ResultKt.a(th3));
            }
        }
    }

    public void q0(boolean z2, Throwable th) {
    }
}
