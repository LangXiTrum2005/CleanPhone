package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.sync.SemaphoreAndMutexImpl;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function3 {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f44772Y;

    public /* synthetic */ a(Object obj, int i2) {
        this.X = i2;
        this.f44772Y = obj;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit unit = Unit.f43263a;
        Object obj4 = this.f44772Y;
        Throwable th = (Throwable) obj;
        switch (this.X) {
            case 0:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = CancellableContinuationImpl.g0;
                ((kotlinx.coroutines.sync.b) obj4).invoke(th);
                break;
            default:
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = SemaphoreAndMutexImpl.Z;
                ((SemaphoreAndMutexImpl) obj4).e();
                break;
        }
        return unit;
    }
}
