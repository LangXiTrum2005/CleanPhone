package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "singleOrNull")
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 f44943Y;
    public /* synthetic */ Object Z;
    public int e0;

    /* JADX WARN: Code duplicated, block: B:22:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ?? r0;
        Ref.ObjectRef objectRef;
        AbortFlowException e2;
        Object obj2;
        this.Z = obj;
        int i2 = (this.e0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.e0 = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        Symbol symbol = NullSurrogateKt.f45018a;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r0 = this.f44943Y;
            objectRef = this.X;
            try {
                ResultKt.b(obj);
            } catch (AbortFlowException e3) {
                e2 = e3;
                if (e2.X != r0) {
                    throw e2;
                }
            }
            obj2 = objectRef.X;
            if (obj2 == symbol) {
                return null;
            }
            return obj2;
        }
        ResultKt.b(obj);
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.X = symbol;
        r0 = new FlowCollector<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj3, Continuation continuation) {
                Ref.ObjectRef objectRef3 = objectRef2;
                Object obj4 = objectRef3.X;
                Symbol symbol2 = NullSurrogateKt.f45018a;
                if (obj4 == symbol2) {
                    objectRef3.X = obj3;
                    return Unit.f43263a;
                }
                objectRef3.X = symbol2;
                throw new AbortFlowException(this);
            }
        };
        try {
            this.X = objectRef2;
            this.f44943Y = r0;
            this.e0 = 1;
            throw null;
        } catch (AbortFlowException e4) {
            objectRef = objectRef2;
            e2 = e4;
        }
        if (e2.X != r0) {
            throw e2;
        }
        obj2 = objectRef.X;
        if (obj2 == symbol) {
            return null;
        }
        return obj2;
    }
}
