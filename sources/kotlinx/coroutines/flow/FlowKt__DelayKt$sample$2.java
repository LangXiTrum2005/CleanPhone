package kotlinx.coroutines.flow;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {TTAdConstant.IMAGE_URL_CODE}, m = "invokeSuspend")
final class FlowKt__DelayKt$sample$2 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public Ref.ObjectRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ReceiveChannel f44882Y;
    public int Z;
    public /* synthetic */ Object e0;
    public /* synthetic */ Object f0;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.Z;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ReceiveChannel receiveChannel = this.f44882Y;
        Ref.ObjectRef objectRef = this.X;
        ReceiveChannel receiveChannel2 = (ReceiveChannel) this.f0;
        FlowCollector flowCollector = (FlowCollector) this.e0;
        ResultKt.b(obj);
        while (objectRef.X != NullSurrogateKt.f45020c) {
            SelectImplementation selectImplementation = new SelectImplementation(getF45023Y());
            selectImplementation.j(receiveChannel2.u(), new FlowKt__DelayKt$sample$2$1$1(objectRef, receiveChannel, null));
            selectImplementation.j(receiveChannel.l(), new FlowKt__DelayKt$sample$2$1$2(null, objectRef, flowCollector));
            this.e0 = flowCollector;
            this.f0 = receiveChannel2;
            this.X = objectRef;
            this.f44882Y = receiveChannel;
            this.Z = 1;
            if (selectImplementation.g(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f43263a;
    }
}
