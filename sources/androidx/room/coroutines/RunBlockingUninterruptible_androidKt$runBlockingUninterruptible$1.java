package androidx.room.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.JobSupport;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
final class RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    public /* synthetic */ Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ SuspendLambda f8311Y;

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {Sdk.SDKMetric.SDKMetricType.AD_REQUIRED_DOWNLOAD_DURATION_MS_VALUE}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public /* synthetic */ Object f8312Y;
        public final /* synthetic */ CompletableDeferred Z;
        public final /* synthetic */ SuspendLambda e0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(CompletableDeferred completableDeferred, Function2 function2, Continuation continuation) {
            super(2, continuation);
            this.Z = completableDeferred;
            this.e0 = (SuspendLambda) function2;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.Z, this.e0, continuation);
            anonymousClass1.f8312Y = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CompletableDeferred completableDeferred;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
            int i2 = this.X;
            if (i2 == 0) {
                ResultKt.b(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f8312Y;
                CompletableDeferred completableDeferred2 = this.Z;
                ?? r3 = this.e0;
                try {
                    this.f8312Y = completableDeferred2;
                    this.X = 1;
                    obj = r3.invoke(coroutineScope, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    completableDeferred = completableDeferred2;
                } catch (Throwable th) {
                    th = th;
                    completableDeferred = completableDeferred2;
                    obj = ResultKt.a(th);
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                completableDeferred = (CompletableDeferred) this.f8312Y;
                try {
                    ResultKt.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    obj = ResultKt.a(th);
                }
            }
            Throwable thA = Result.a(obj);
            if (thA == null) {
                completableDeferred.H(obj);
            } else {
                completableDeferred.j(thA);
            }
            return Unit.f43263a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
        public int X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final /* synthetic */ CompletableDeferred f8313Y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CompletableDeferred completableDeferred, Continuation continuation) {
            super(2, continuation);
            this.f8313Y = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.f8313Y, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
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
            this.X = 1;
            Object objR = this.f8313Y.r(this);
            return objR == coroutineSingletons ? coroutineSingletons : objR;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.f8311Y = (SuspendLambda) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 = new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(this.f8311Y, continuation);
        runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.X = obj;
        return runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ResultKt.b(obj);
        CoroutineContext.Element element = ((CoroutineScope) this.X).getX().get(ContinuationInterceptor.Key.X);
        Intrinsics.c(element);
        ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) element;
        CompletableDeferred completableDeferredA = CompletableDeferredKt.a();
        BuildersKt.b(GlobalScope.X, continuationInterceptor, CoroutineStart.e0, new AnonymousClass1(completableDeferredA, this.f8311Y, null));
        while (!((JobSupport) completableDeferredA).h()) {
            try {
                return BuildersKt.d(continuationInterceptor, new AnonymousClass2(completableDeferredA, null));
            } catch (InterruptedException unused) {
            }
        }
        return completableDeferredA.k();
    }
}
