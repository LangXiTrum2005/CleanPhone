package kotlinx.coroutines.flow;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {151}, m = "last")
final class FlowKt__ReduceKt$last$1<T> extends ContinuationImpl {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44938Y;
    public int Z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44938Y = obj;
        int i2 = (this.Z | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.Z = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        Symbol symbol = NullSurrogateKt.f45018a;
        if (i2 == 0) {
            ResultKt.b(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.X = symbol;
            this.X = objectRef;
            this.Z = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.ObjectRef objectRef2 = this.X;
        ResultKt.b(obj);
        Object obj2 = objectRef2.X;
        if (obj2 != symbol) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
}
