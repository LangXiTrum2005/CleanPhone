package kotlinx.coroutines.flow.internal;

import com.google.android.gms.ads.RequestConfiguration;
import com.startapp.sdk.components.e;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.ChildHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SafeCollector<T> extends ContinuationImpl implements FlowCollector<T>, CoroutineStackFrame {
    public final FlowCollector X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final CoroutineContext f45021Y;
    public final int Z;
    public CoroutineContext e0;
    public Continuation f0;

    public SafeCollector(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(NoOpContinuation.X, EmptyCoroutineContext.X);
        this.X = flowCollector;
        this.f45021Y = coroutineContext;
        this.Z = ((Number) coroutineContext.fold(0, new e(6))).intValue();
    }

    public final Object e(Continuation continuation, Object obj) {
        CoroutineContext f0 = continuation.getF0();
        JobKt.b(f0);
        CoroutineContext coroutineContext = this.e0;
        if (coroutineContext != f0) {
            if (coroutineContext instanceof DownstreamExceptionContext) {
                throw new IllegalStateException(StringsKt.c0("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((DownstreamExceptionContext) coroutineContext).f45016Y + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) f0.fold(0, new Function2() { // from class: kotlinx.coroutines.flow.internal.a
                /* JADX WARN: Code duplicated, block: B:6:0x001d  */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    int iIntValue = ((Integer) obj2).intValue();
                    CoroutineContext.Element element = (CoroutineContext.Element) obj3;
                    CoroutineContext.Key x = element.getX();
                    CoroutineContext.Element element2 = this.X.f45021Y.get(x);
                    if (x == Job.Key.X) {
                        Job job = (Job) element2;
                        Job parent = (Job) element;
                        while (true) {
                            if (parent != null) {
                                if (parent == job || !(parent instanceof ScopeCoroutine)) {
                                    break;
                                }
                                ChildHandle childHandle = (ChildHandle) JobSupport.f44760Y.get((ScopeCoroutine) parent);
                                parent = childHandle != null ? childHandle.getParent() : null;
                            } else {
                                parent = null;
                                break;
                            }
                        }
                        if (parent != job) {
                            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + parent + ", expected child of " + job + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                        }
                        if (job != null) {
                            iIntValue++;
                        }
                    } else if (element != element2) {
                        iIntValue = Integer.MIN_VALUE;
                    } else {
                        iIntValue++;
                    }
                    return Integer.valueOf(iIntValue);
                }
            })).intValue() != this.Z) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f45021Y + ",\n\t\tbut emission happened in " + f0 + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.e0 = f0;
        }
        this.f0 = continuation;
        Function3 function3 = SafeCollectorKt.f45022a;
        FlowCollector flowCollector = this.X;
        Intrinsics.d(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        ((SafeCollectorKt$emitFun$1) function3).getClass();
        Object objEmit = flowCollector.emit(obj, this);
        if (!Intrinsics.a(objEmit, CoroutineSingletons.X)) {
            this.f0 = null;
        }
        return objEmit;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        try {
            Object objE = e(continuation, obj);
            return objE == CoroutineSingletons.X ? objE : Unit.f43263a;
        } catch (Throwable th) {
            this.e0 = new DownstreamExceptionContext(continuation.getF0(), th);
            throw th;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f0;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl, kotlin.coroutines.Continuation
    /* JADX INFO: renamed from: getContext */
    public final CoroutineContext getF0() {
        CoroutineContext coroutineContext = this.e0;
        return coroutineContext == null ? EmptyCoroutineContext.X : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable thA = Result.a(obj);
        if (thA != null) {
            this.e0 = new DownstreamExceptionContext(getF0(), thA);
        }
        Continuation continuation = this.f0;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return CoroutineSingletons.X;
    }
}
