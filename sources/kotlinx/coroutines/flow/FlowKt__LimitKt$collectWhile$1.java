package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE}, m = "collectWhile")
final class FlowKt__LimitKt$collectWhile$1<T> extends ContinuationImpl {
    public FlowKt__LimitKt$collectWhile$collector$1 X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44903Y;
    public int Z;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44903Y = obj;
        int i2 = (this.Z | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.Z = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                this.X = new FlowKt__LimitKt$collectWhile$collector$1();
                this.Z = 1;
                throw null;
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = this.X;
            ResultKt.b(obj);
            return Unit.f43263a;
        } catch (AbortFlowException e2) {
            if (e2.X != i2) {
                throw e2;
            }
        }
    }
}
