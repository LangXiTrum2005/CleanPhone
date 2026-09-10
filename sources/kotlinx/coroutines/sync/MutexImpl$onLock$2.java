package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class MutexImpl$onLock$2 extends FunctionReferenceImpl implements Function3<MutexImpl, Object, Object, Object> {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutexImpl mutexImpl = (MutexImpl) obj;
        mutexImpl.getClass();
        if (!Intrinsics.a(obj3, MutexKt.f45105b)) {
            return mutexImpl;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj2).toString());
    }
}
