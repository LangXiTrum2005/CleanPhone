package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {49}, m = "runInIsolation")
final class SingleRunner$runInIsolation$1 extends ContinuationImpl {
    public SingleRunner X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f7883Y;
    public final /* synthetic */ SingleRunner Z;
    public int e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$1(SingleRunner singleRunner, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.Z = singleRunner;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleRunner$runInIsolation$1 singleRunner$runInIsolation$1;
        this.f7883Y = obj;
        this.e0 |= Integer.MIN_VALUE;
        SingleRunner singleRunner = this.Z;
        singleRunner.getClass();
        if (this instanceof SingleRunner$runInIsolation$1) {
            int i2 = this.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.e0 = i2 - Integer.MIN_VALUE;
                singleRunner$runInIsolation$1 = this;
            } else {
                singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(singleRunner, this);
            }
        } else {
            singleRunner$runInIsolation$1 = new SingleRunner$runInIsolation$1(singleRunner, this);
        }
        Object obj2 = singleRunner$runInIsolation$1.f7883Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = singleRunner$runInIsolation$1.e0;
        try {
            if (i3 == 0) {
                ResultKt.b(obj2);
                SingleRunner$runInIsolation$2 singleRunner$runInIsolation$2 = new SingleRunner$runInIsolation$2(singleRunner, 0, null, null);
                singleRunner$runInIsolation$1.X = singleRunner;
                singleRunner$runInIsolation$1.e0 = 1;
                if (CoroutineScopeKt.d(singleRunner$runInIsolation$2, singleRunner$runInIsolation$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                singleRunner = singleRunner$runInIsolation$1.X;
                ResultKt.b(obj2);
            }
        } catch (SingleRunner.CancelIsolatedRunnerException e2) {
            if (e2.X != singleRunner) {
                throw e2;
            }
        }
        return Unit.f43263a;
    }
}
