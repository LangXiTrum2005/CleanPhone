package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "onStateChanged"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements LifecycleEventObserver {

    /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Mutex X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f5255Y;
        public int Z;
        public final /* synthetic */ MutexImpl e0;
        public final /* synthetic */ Function2 f0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutexImpl mutexImpl, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.e0 = mutexImpl;
            this.f0 = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.e0, this.f0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Mutex mutex;
            Function2 function2;
            Mutex mutex2;
            Throwable th;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.Z;
            try {
                if (i2 == 0) {
                    ResultKt.b(obj);
                    mutex = this.e0;
                    this.X = mutex;
                    function2 = this.f0;
                    this.f5255Y = function2;
                    this.Z = 1;
                    if (mutex.a(this) != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mutex2 = this.X;
                    try {
                        ResultKt.b(obj);
                        mutex2.b(null);
                        return Unit.f43263a;
                    } catch (Throwable th2) {
                        th = th2;
                        mutex2.b(null);
                        throw th;
                    }
                }
                function2 = (Function2) this.f5255Y;
                Mutex mutex3 = this.X;
                ResultKt.b(obj);
                mutex = mutex3;
                RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(function2, null);
                this.X = mutex;
                this.f5255Y = null;
                this.Z = 2;
                if (CoroutineScopeKt.d(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                    mutex2 = mutex;
                    mutex2.b(null);
                    return Unit.f43263a;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                mutex2 = mutex;
                th = th3;
                mutex2.b(null);
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == null) {
            BuildersKt.c(null, null, null, new AnonymousClass1(null, null, null), 3);
            throw null;
        }
        if (event == null) {
            throw null;
        }
        if (event == Lifecycle.Event.ON_DESTROY) {
            throw null;
        }
    }
}
