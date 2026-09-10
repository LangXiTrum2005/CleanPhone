package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "value", "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends SuspendLambda implements Function2<ChannelResult<Object>, Continuation<? super Boolean>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44887Y;
    public final /* synthetic */ FlowCollector Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector flowCollector, Continuation continuation) {
        super(2, continuation);
        this.Z = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.Z, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.f44887Y = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(new ChannelResult(((ChannelResult) obj).f44798a), (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0042  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Throwable thA;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            obj2 = ((ChannelResult) this.f44887Y).f44798a;
            if (!(obj2 instanceof ChannelResult.Failed)) {
                this.f44887Y = obj2;
                this.X = 1;
                if (this.Z.emit(obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj3 = obj2;
            }
            if (obj2 instanceof ChannelResult.Closed) {
                return Boolean.TRUE;
            }
            thA = ChannelResult.a(obj2);
            if (thA == null) {
                return Boolean.FALSE;
            }
            throw thA;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        obj3 = this.f44887Y;
        ResultKt.b(obj);
        obj2 = obj3;
        if (obj2 instanceof ChannelResult.Closed) {
            return Boolean.TRUE;
        }
        thA = ChannelResult.a(obj2);
        if (thA == null) {
            return Boolean.FALSE;
        }
        throw thA;
    }
}
