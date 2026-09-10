package androidx.room;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class InvalidationTracker$setAutoCloser$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InvalidationTracker invalidationTracker = (InvalidationTracker) this.receiver;
        synchronized (invalidationTracker.j) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = invalidationTracker.f8186i;
                if (multiInstanceInvalidationClient != null) {
                    ReentrantLock reentrantLock = invalidationTracker.f8184e;
                    reentrantLock.lock();
                    try {
                        List listI0 = CollectionsKt.i0(invalidationTracker.d.keySet());
                        reentrantLock.unlock();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listI0) {
                            InvalidationTracker.Observer observer = (InvalidationTracker.Observer) obj;
                            observer.getClass();
                            if (!(observer instanceof MultiInstanceInvalidationClient$observer$1)) {
                                arrayList.add(obj);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            multiInstanceInvalidationClient.a();
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                ObservedTableStates observedTableStates = invalidationTracker.f8183c.f8259h;
                ReentrantLock reentrantLock2 = observedTableStates.f8203a;
                reentrantLock2.lock();
                try {
                    boolean[] zArr = observedTableStates.f8205c;
                    Arrays.fill(zArr, 0, zArr.length, false);
                    observedTableStates.d = true;
                    reentrantLock2.unlock();
                } catch (Throwable th2) {
                    reentrantLock2.unlock();
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return Unit.f43263a;
    }
}
