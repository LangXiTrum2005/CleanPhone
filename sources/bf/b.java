package bf;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f5696d = new Object[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a[] f5697e = new a[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f5698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f5699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lock f5700c;

    public b(Object obj) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.readLock();
        this.f5700c = reentrantReadWriteLock.writeLock();
        this.f5699b = new AtomicReference(f5697e);
        AtomicReference atomicReference = new AtomicReference();
        this.f5698a = atomicReference;
        atomicReference.lazySet(obj);
    }

    public final void a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("value == null");
        }
        Lock lock = this.f5700c;
        lock.lock();
        this.f5698a.lazySet(obj);
        lock.unlock();
        a[] aVarArr = (a[]) this.f5699b.get();
        if (aVarArr.length <= 0) {
            return;
        }
        a aVar = aVarArr[0];
        throw null;
    }
}
