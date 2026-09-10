package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {47}, m = "joinAll")
final class AwaitKt$joinAll$1 extends ContinuationImpl {
    public Object[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f44738Y;
    public int Z;
    public /* synthetic */ Object e0;
    public int f0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job job;
        this.e0 = obj;
        int i2 = (this.f0 | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.f0 = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i3 = this.Z;
        int i4 = this.f44738Y;
        Job[] jobArr = (Job[]) this.X;
        ResultKt.b(obj);
        do {
            i4++;
            if (i4 >= i3) {
                return Unit.f43263a;
            }
            job = jobArr[i4];
            this.X = jobArr;
            this.f44738Y = i4;
            this.Z = i3;
            this.f0 = 1;
        } while (job.n(this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
