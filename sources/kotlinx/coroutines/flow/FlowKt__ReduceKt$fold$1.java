package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {40}, m = "fold")
final class FlowKt__ReduceKt$fold$1<T, R> extends ContinuationImpl {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44936Y;
    public int Z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44936Y = obj;
        int i2 = (this.Z | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.Z = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref.ObjectRef objectRef = this.X;
            ResultKt.b(obj);
            return objectRef.X;
        }
        ResultKt.b(obj);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        objectRef2.X = null;
        this.X = objectRef2;
        this.Z = 1;
        throw null;
    }
}
