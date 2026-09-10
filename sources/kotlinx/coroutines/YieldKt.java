package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.internal.DispatchedContinuation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class YieldKt {
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final Object a(ContinuationImpl continuationImpl) {
        Object obj;
        CoroutineContext f45023y = continuationImpl.getF45023Y();
        JobKt.b(f45023y);
        Continuation continuationB = IntrinsicsKt.b(continuationImpl);
        DispatchedContinuation dispatchedContinuation = continuationB instanceof DispatchedContinuation ? (DispatchedContinuation) continuationB : null;
        Unit unit = Unit.f43263a;
        if (dispatchedContinuation == null) {
            obj = unit;
        } else {
            CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.e0;
            if (coroutineDispatcher.c0(f45023y)) {
                dispatchedContinuation.g0 = unit;
                dispatchedContinuation.Z = 1;
                coroutineDispatcher.Y(f45023y, dispatchedContinuation);
            } else {
                YieldContext yieldContext = new YieldContext(YieldContext.f44771Y);
                CoroutineContext coroutineContextPlus = f45023y.plus(yieldContext);
                dispatchedContinuation.g0 = unit;
                dispatchedContinuation.Z = 1;
                coroutineDispatcher.Y(coroutineContextPlus, dispatchedContinuation);
                if (yieldContext.X) {
                    EventLoop eventLoopA = ThreadLocalEventLoop.a();
                    ArrayDeque arrayDeque = eventLoopA.e0;
                    if (arrayDeque != null ? arrayDeque.isEmpty() : true) {
                        obj = unit;
                    } else {
                        if (eventLoopA.f44753Y >= 4294967296L) {
                            dispatchedContinuation.g0 = unit;
                            dispatchedContinuation.Z = 1;
                            eventLoopA.n0(dispatchedContinuation);
                            obj = CoroutineSingletons.X;
                        } else {
                            eventLoopA.q0(true);
                            try {
                                dispatchedContinuation.run();
                                do {
                                } while (eventLoopA.t0());
                            } catch (Throwable th) {
                                try {
                                    dispatchedContinuation.h(th);
                                } catch (Throwable th2) {
                                    eventLoopA.j0(true);
                                    throw th2;
                                }
                            }
                            eventLoopA.j0(true);
                            obj = unit;
                        }
                    }
                }
            }
            obj = CoroutineSingletons.X;
        }
        return obj == CoroutineSingletons.X ? obj : unit;
    }
}
