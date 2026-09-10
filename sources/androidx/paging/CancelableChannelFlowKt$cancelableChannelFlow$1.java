package androidx.paging;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.JobImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/paging/SimpleProducerScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1", f = "CancelableChannelFlow.kt", l = {33}, m = "invokeSuspend")
final class CancelableChannelFlowKt$cancelableChannelFlow$1 extends SuspendLambda implements Function2<SimpleProducerScope<Object>, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7779Y;
    public final /* synthetic */ JobImpl Z;
    public final /* synthetic */ SuspendLambda e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CancelableChannelFlowKt$cancelableChannelFlow$1(JobImpl jobImpl, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.Z = jobImpl;
        this.e0 = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CancelableChannelFlowKt$cancelableChannelFlow$1 cancelableChannelFlowKt$cancelableChannelFlow$1 = new CancelableChannelFlowKt$cancelableChannelFlow$1(this.Z, this.e0, continuation);
        cancelableChannelFlowKt$cancelableChannelFlow$1.f7779Y = obj;
        return cancelableChannelFlowKt$cancelableChannelFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CancelableChannelFlowKt$cancelableChannelFlow$1) create((SimpleProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.f7779Y;
            this.Z.s(new Function1<Throwable, Unit>() { // from class: androidx.paging.CancelableChannelFlowKt$cancelableChannelFlow$1.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    simpleProducerScope.x(null);
                    return Unit.f43263a;
                }
            });
            this.X = 1;
            if (this.e0.invoke(simpleProducerScope, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f43263a;
    }
}
