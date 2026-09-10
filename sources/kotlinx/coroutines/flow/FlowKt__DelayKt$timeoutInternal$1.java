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
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.selects.OnTimeoutKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;", "downStream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {TTAdConstant.VIDEO_INFO_CODE}, m = "invokeSuspend")
final class FlowKt__DelayKt$timeoutInternal$1 extends SuspendLambda implements Function3<CoroutineScope, FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public long X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44886Y;
    public /* synthetic */ Object Z;
    public /* synthetic */ Object e0;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f44886Y;
        if (i2 == 0) {
            ResultKt.b(obj);
            Duration.Companion companion = Duration.f44719Y;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j = this.X;
        ReceiveChannel receiveChannel = (ReceiveChannel) this.e0;
        FlowCollector flowCollector = (FlowCollector) this.Z;
        ResultKt.b(obj);
        while (((Boolean) obj).booleanValue()) {
            SelectImplementation selectImplementation = new SelectImplementation(getF45023Y());
            selectImplementation.j(receiveChannel.u(), new FlowKt__DelayKt$timeoutInternal$1$1$1(flowCollector, null));
            OnTimeoutKt.a(selectImplementation, DelayKt.c(j), new FlowKt__DelayKt$timeoutInternal$1$1$2(j, null));
            this.Z = flowCollector;
            this.e0 = receiveChannel;
            this.X = j;
            this.f44886Y = 1;
            obj = selectImplementation.g(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f43263a;
    }
}
