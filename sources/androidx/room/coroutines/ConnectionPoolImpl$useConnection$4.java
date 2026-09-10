package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {159}, m = "invokeSuspend")
final class ConnectionPoolImpl$useConnection$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Function2 f8284Y;
    public final /* synthetic */ Ref.ObjectRef Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionPoolImpl$useConnection$4(Function2 function2, Ref.ObjectRef objectRef, Continuation continuation) {
        super(2, continuation);
        this.f8284Y = function2;
        this.Z = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionPoolImpl$useConnection$4(this.f8284Y, this.Z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionPoolImpl$useConnection$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        Object obj2 = this.Z.X;
        this.X = 1;
        Object objInvoke = this.f8284Y.invoke(obj2, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
