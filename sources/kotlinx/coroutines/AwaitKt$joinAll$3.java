package kotlinx.coroutines;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {58}, m = "joinAll")
final class AwaitKt$joinAll$3 extends ContinuationImpl {
    public Iterator X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public /* synthetic */ Object f44739Y;
    public int Z;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f44739Y = obj;
        int i2 = (this.Z | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.Z = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (i2 == 0) {
            ResultKt.b(obj);
            throw null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Iterator it = this.X;
        ResultKt.b(obj);
        while (it.hasNext()) {
            Job job = (Job) it.next();
            this.X = it;
            this.Z = 1;
            if (job.n(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f43263a;
    }
}
