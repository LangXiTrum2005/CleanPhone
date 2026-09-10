package androidx.paging;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", l = {Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED_VALUE}, m = "invokeSuspend")
final class RemoteMediatorAccessImpl$launchRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Ref.BooleanRef X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f7864Y;
    public final /* synthetic */ RemoteMediatorAccessImpl Z;

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Key", "", "Value"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", l = {321}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        public final /* synthetic */ RemoteMediatorAccessImpl X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f7865Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, Ref.BooleanRef booleanRef, Continuation continuation) {
            super(1, continuation);
            this.X = remoteMediatorAccessImpl;
            this.f7865Y = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.X, this.f7865Y, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f43263a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            ResultKt.b(obj);
            this.X.getClass();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteMediatorAccessImpl$launchRefresh$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, Continuation continuation) {
        super(2, continuation);
        this.Z = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoteMediatorAccessImpl$launchRefresh$1(this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RemoteMediatorAccessImpl$launchRefresh$1 remoteMediatorAccessImpl$launchRefresh$1 = (RemoteMediatorAccessImpl$launchRefresh$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        remoteMediatorAccessImpl$launchRefresh$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.f7864Y;
        RemoteMediatorAccessImpl remoteMediatorAccessImpl = this.Z;
        if (i2 == 0) {
            ResultKt.b(obj);
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            remoteMediatorAccessImpl.getClass();
            new AnonymousClass1(remoteMediatorAccessImpl, booleanRef, null);
            this.X = booleanRef;
            this.f7864Y = 1;
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Ref.BooleanRef booleanRef2 = this.X;
        ResultKt.b(obj);
        if (booleanRef2.X) {
            remoteMediatorAccessImpl.getClass();
            BuildersKt.c(null, null, null, new RemoteMediatorAccessImpl$launchBoundary$1(remoteMediatorAccessImpl, null), 3);
        }
        return Unit.f43263a;
    }
}
