package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.MutexImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131}, m = "onFinish")
final class SingleRunner$Holder$onFinish$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Job f7881Y;
    public MutexImpl Z;
    public /* synthetic */ Object e0;
    public final /* synthetic */ SingleRunner.Holder f0;
    public int g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$onFinish$1(SingleRunner.Holder holder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f0 = holder;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0020  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
        this.e0 = obj;
        this.g0 |= Integer.MIN_VALUE;
        SingleRunner.Holder holder = this.f0;
        holder.getClass();
        if (this instanceof SingleRunner$Holder$onFinish$1) {
            int i2 = this.g0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                this.g0 = i2 - Integer.MIN_VALUE;
                singleRunner$Holder$onFinish$1 = this;
            } else {
                singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(holder, this);
            }
        } else {
            singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(holder, this);
        }
        Object obj2 = singleRunner$Holder$onFinish$1.e0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = singleRunner$Holder$onFinish$1.g0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            singleRunner$Holder$onFinish$1.X = holder;
            singleRunner$Holder$onFinish$1.f7881Y = null;
            singleRunner$Holder$onFinish$1.Z = null;
            singleRunner$Holder$onFinish$1.g0 = 1;
            throw null;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MutexImpl mutexImpl = singleRunner$Holder$onFinish$1.Z;
        Job job = singleRunner$Holder$onFinish$1.f7881Y;
        SingleRunner.Holder holder2 = (SingleRunner.Holder) singleRunner$Holder$onFinish$1.X;
        ResultKt.b(obj2);
        try {
            if (job == holder2.f7879a) {
                holder2.f7879a = null;
            }
            return Unit.f43263a;
        } finally {
            mutexImpl.b(null);
        }
    }
}
