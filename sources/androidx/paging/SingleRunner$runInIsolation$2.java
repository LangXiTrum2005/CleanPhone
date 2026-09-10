package androidx.paging;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner$runInIsolation$2", f = "SingleRunner.kt", l = {53, 59, Sdk.SDKMetric.SDKMetricType.APP_BACKGROUND_DURING_AD_LOAD_VALUE, Sdk.SDKMetric.SDKMetricType.APP_BACKGROUND_DURING_AD_LOAD_VALUE}, m = "invokeSuspend")
final class SingleRunner$runInIsolation$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7884Y;
    public final /* synthetic */ SingleRunner Z;
    public final /* synthetic */ int e0;
    public final /* synthetic */ SuspendLambda f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SingleRunner$runInIsolation$2(SingleRunner singleRunner, int i2, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.Z = singleRunner;
        this.e0 = i2;
        this.f0 = (SuspendLambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(this.Z, this.e0, this.f0, continuation);
        singleRunner$runInIsolation$2.f7884Y = obj;
        return singleRunner$runInIsolation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SingleRunner$runInIsolation$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f43263a);
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i2 = this.X;
        SingleRunner singleRunner = this.Z;
        if (i2 == 0) {
            ResultKt.b(obj);
            CoroutineContext.Element element = ((CoroutineScope) this.f7884Y).getF5233Y().get(Job.Key.X);
            if (element == null) {
                throw new IllegalStateException("Internal error. coroutineScope should've created a job.");
            }
            singleRunner.getClass();
            this.f7884Y = (Job) element;
            this.X = 1;
            throw null;
        }
        try {
            if (i2 == 1) {
                Job job = (Job) this.f7884Y;
                ResultKt.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    ?? r8 = this.f0;
                    this.f7884Y = job;
                    this.X = 2;
                    if (r8.invoke(this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    singleRunner.getClass();
                    this.f7884Y = null;
                    this.X = 3;
                    throw null;
                }
                return Unit.f43263a;
            }
            if (i2 == 2) {
                ResultKt.b(obj);
                singleRunner.getClass();
                this.f7884Y = null;
                this.X = 3;
                throw null;
            }
            if (i2 == 3) {
                ResultKt.b(obj);
                return Unit.f43263a;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Throwable th = (Throwable) this.f7884Y;
            ResultKt.b(obj);
            throw th;
        } catch (Throwable th2) {
            singleRunner.getClass();
            this.f7884Y = th2;
            this.X = 4;
            throw null;
        }
    }
}
