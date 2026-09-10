package androidx.paging;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {131, 102}, m = "tryEnqueue")
final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    public Object X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Job f7882Y;
    public Mutex Z;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ SingleRunner.Holder g0;
    public int h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(SingleRunner.Holder holder, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g0 = holder;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.paging.SingleRunner$Holder, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r0v4, types: [kotlinx.coroutines.sync.Mutex] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
        int i2;
        Mutex mutex;
        Job job;
        SingleRunner.Holder holder;
        SingleRunner.Holder holder2;
        this.f0 = obj;
        this.h0 |= Integer.MIN_VALUE;
        ?? r0 = this.g0;
        r0.getClass();
        if (this instanceof SingleRunner$Holder$tryEnqueue$1) {
            int i3 = this.h0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                this.h0 = i3 - Integer.MIN_VALUE;
                singleRunner$Holder$tryEnqueue$1 = this;
            } else {
                singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(r0, this);
            }
        } else {
            singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(r0, this);
        }
        Object obj2 = singleRunner$Holder$tryEnqueue$1.f0;
        Object objValueOf = CoroutineSingletons.X;
        int i4 = singleRunner$Holder$tryEnqueue$1.h0;
        boolean z2 = true;
        if (i4 == 0) {
            ResultKt.b(obj2);
            singleRunner$Holder$tryEnqueue$1.X = r0;
            singleRunner$Holder$tryEnqueue$1.f7882Y = null;
            singleRunner$Holder$tryEnqueue$1.Z = null;
            singleRunner$Holder$tryEnqueue$1.e0 = 0;
            singleRunner$Holder$tryEnqueue$1.h0 = 1;
            throw null;
        }
        try {
            if (i4 == 1) {
                i2 = singleRunner$Holder$tryEnqueue$1.e0;
                mutex = singleRunner$Holder$tryEnqueue$1.Z;
                job = singleRunner$Holder$tryEnqueue$1.f7882Y;
                holder = (SingleRunner.Holder) singleRunner$Holder$tryEnqueue$1.X;
                ResultKt.b(obj2);
                Job job2 = holder.f7879a;
                if (job2 == null || !job2.isActive() || holder.f7880b < i2) {
                    if (job2 != null) {
                        job2.a(new SingleRunner.CancelIsolatedRunnerException(null));
                    }
                    if (job2 != null) {
                        singleRunner$Holder$tryEnqueue$1.X = holder;
                        singleRunner$Holder$tryEnqueue$1.f7882Y = job;
                        singleRunner$Holder$tryEnqueue$1.Z = mutex;
                        singleRunner$Holder$tryEnqueue$1.e0 = i2;
                        singleRunner$Holder$tryEnqueue$1.h0 = 2;
                        if (job2.n(singleRunner$Holder$tryEnqueue$1) != objValueOf) {
                            holder2 = holder;
                            mutex = mutex;
                        }
                    } else {
                        holder.f7879a = job;
                        holder.f7880b = i2;
                        r0 = mutex;
                        objValueOf = Boolean.valueOf(z2);
                        r0.b(null);
                    }
                } else {
                    z2 = false;
                    r0 = mutex;
                    objValueOf = Boolean.valueOf(z2);
                    r0.b(null);
                }
                return objValueOf;
            }
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = singleRunner$Holder$tryEnqueue$1.e0;
            Mutex mutex2 = singleRunner$Holder$tryEnqueue$1.Z;
            job = singleRunner$Holder$tryEnqueue$1.f7882Y;
            holder2 = (SingleRunner.Holder) singleRunner$Holder$tryEnqueue$1.X;
            ResultKt.b(obj2);
            mutex = mutex2;
            holder = holder2;
            holder.f7879a = job;
            holder.f7880b = i2;
            r0 = mutex;
            objValueOf = Boolean.valueOf(z2);
            r0.b(null);
            return objValueOf;
        } catch (Throwable th) {
            r0.b(null);
            throw th;
        }
    }
}
