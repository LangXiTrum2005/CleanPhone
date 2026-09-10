package androidx.datastore.core;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ClosedSendChannelException;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.datastore.core.DataStoreImpl$updateData$2", f = "DataStoreImpl.kt", l = {169}, m = "invokeSuspend")
final class DataStoreImpl$updateData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f4639Y;
    public final /* synthetic */ DataStoreImpl Z;
    public final /* synthetic */ SuspendLambda e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DataStoreImpl$updateData$2(DataStoreImpl dataStoreImpl, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.Z = dataStoreImpl;
        this.e0 = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DataStoreImpl$updateData$2 dataStoreImpl$updateData$2 = new DataStoreImpl$updateData$2(this.Z, this.e0, continuation);
        dataStoreImpl$updateData$2.f4639Y = obj;
        return dataStoreImpl$updateData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DataStoreImpl$updateData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f4639Y;
        CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
        DataStoreImpl dataStoreImpl = this.Z;
        Message.Update update = new Message.Update(this.e0, completableDeferredA, dataStoreImpl.f4609h.a(), coroutineScope.getX());
        SimpleActor simpleActor = dataStoreImpl.f4611l;
        Object objI = simpleActor.f4685c.i(update);
        if (objI instanceof ChannelResult.Closed) {
            Throwable thA = ChannelResult.a(objI);
            if (thA == null) {
                throw new ClosedSendChannelException("Channel was closed normally");
            }
            throw thA;
        }
        if (objI instanceof ChannelResult.Failed) {
            throw new IllegalStateException("Check failed.");
        }
        if (simpleActor.d.f4598a.getAndIncrement() == 0) {
            BuildersKt.c(simpleActor.f4683a, null, null, new SimpleActor$offer$2(simpleActor, null), 3);
        }
        this.X = 1;
        Object objR = completableDeferredA.r(this);
        return objR == coroutineSingletons ? coroutineSingletons : objR;
    }
}
