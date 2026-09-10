package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import kotlinx.coroutines.sync.MutexImpl.SelectInstanceWithOwner;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class MutexImpl$onLock$1 extends FunctionReferenceImpl implements Function3<MutexImpl, SelectInstance<?>, Object, Unit> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int andDecrement;
        MutexImpl mutexImpl = (MutexImpl) obj;
        SelectInstance selectInstance = (SelectInstance) obj2;
        Unit unit = Unit.f43263a;
        if (obj3 != null) {
            while (mutexImpl.f()) {
                Object obj4 = MutexImpl.i0.get(mutexImpl);
                if (obj4 != MutexKt.f45104a) {
                    if (obj4 != obj3) {
                        break;
                    }
                    selectInstance.c(MutexKt.f45105b);
                    return unit;
                }
            }
        } else {
            mutexImpl.getClass();
        }
        Intrinsics.d(selectInstance, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
        MutexImpl.SelectInstanceWithOwner selectInstanceWithOwner = mutexImpl.new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj3);
        do {
            mutexImpl.getClass();
            do {
                andDecrement = SemaphoreAndMutexImpl.h0.getAndDecrement(mutexImpl);
            } while (andDecrement > mutexImpl.X);
            if (andDecrement > 0) {
                selectInstanceWithOwner.c(unit);
                return unit;
            }
        } while (!mutexImpl.d(selectInstanceWithOwner));
        return unit;
    }
}
