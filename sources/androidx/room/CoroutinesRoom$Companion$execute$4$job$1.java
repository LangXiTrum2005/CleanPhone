package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.android.kt", l = {}, m = "invokeSuspend")
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Callable X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f8166Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$4$job$1(Callable callable, CancellableContinuationImpl cancellableContinuationImpl, Continuation continuation) {
        super(2, continuation);
        this.X = callable;
        this.f8166Y = cancellableContinuationImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.X, this.f8166Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutinesRoom$Companion$execute$4$job$1 coroutinesRoom$Companion$execute$4$job$1 = (CoroutinesRoom$Companion$execute$4$job$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f43263a;
        coroutinesRoom$Companion$execute$4$job$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f8166Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        try {
            cancellableContinuationImpl.resumeWith(this.X.call());
        } catch (Throwable th) {
            cancellableContinuationImpl.resumeWith(ResultKt.a(th));
        }
        return Unit.f43263a;
    }
}
