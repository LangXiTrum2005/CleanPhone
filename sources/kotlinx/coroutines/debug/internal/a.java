package kotlinx.coroutines.debug.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int X;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ConcurrentWeakMap.f44840Y;
                return new ConcurrentWeakMap.Entry(obj, obj2);
            default:
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = ConcurrentWeakMap.f44840Y;
                return obj;
        }
    }
}
