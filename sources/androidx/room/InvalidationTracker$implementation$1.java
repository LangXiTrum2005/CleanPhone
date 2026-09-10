package androidx.room;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class InvalidationTracker$implementation$1 extends FunctionReferenceImpl implements Function1<Set<? extends Integer>, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set p0 = (Set) obj;
        Intrinsics.f(p0, "p0");
        InvalidationTracker invalidationTracker = (InvalidationTracker) this.receiver;
        ReentrantLock reentrantLock = invalidationTracker.f8184e;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> listI0 = CollectionsKt.i0(invalidationTracker.d.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : listI0) {
                observerWrapper.getClass();
                int[] iArr = observerWrapper.f8211b;
                int length = iArr.length;
                Set setA = EmptySet.X;
                if (length != 0) {
                    int i2 = 0;
                    if (length != 1) {
                        SetBuilder setBuilder = new SetBuilder();
                        int length2 = iArr.length;
                        int i3 = 0;
                        while (i2 < length2) {
                            int i4 = i3 + 1;
                            if (p0.contains(Integer.valueOf(iArr[i2]))) {
                                setBuilder.add(observerWrapper.f8212c[i3]);
                            }
                            i2++;
                            i3 = i4;
                        }
                        setA = SetsKt.a(setBuilder);
                    } else if (p0.contains(Integer.valueOf(iArr[0]))) {
                        setA = observerWrapper.d;
                    }
                }
                if (!setA.isEmpty()) {
                    observerWrapper.f8210a.a(setA);
                }
            }
            return Unit.f43263a;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
