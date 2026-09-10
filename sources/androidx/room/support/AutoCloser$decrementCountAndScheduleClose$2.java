package androidx.room.support;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", f = "AutoCloser.android.kt", l = {167}, m = "invokeSuspend")
final class AutoCloser$decrementCountAndScheduleClose$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ AutoCloser f8321Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCloser$decrementCountAndScheduleClose$2(AutoCloser autoCloser, Continuation continuation) {
        super(2, continuation);
        this.f8321Y = autoCloser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoCloser$decrementCountAndScheduleClose$2(this.f8321Y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((AutoCloser$decrementCountAndScheduleClose$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        return CoroutineSingletons.X;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.f8321Y.getClass();
            this.X = 1;
            if (DelayKt.a(0L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.f8321Y.getClass();
        throw null;
    }
}
