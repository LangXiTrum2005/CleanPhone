package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: loaded from: classes7.dex */
public final class CancellableSimpleLock extends DefaultSimpleLock {
    /* JADX WARN: Code restructure failed: missing block: B:10:?, code lost:
    
        throw null;
     */
    @Override // kotlin.reflect.jvm.internal.impl.storage.DefaultSimpleLock, kotlin.reflect.jvm.internal.impl.storage.SimpleLock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void lock() {
        /*
            r5 = this;
            r0 = 0
            java.util.concurrent.locks.ReentrantLock r1 = r5.f44471a     // Catch: java.lang.InterruptedException -> Lf
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> Lf
            r3 = 50
            boolean r1 = r1.tryLock(r3, r2)     // Catch: java.lang.InterruptedException -> Lf
            if (r1 == 0) goto Le
            return
        Le:
            throw r0
        Lf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.storage.CancellableSimpleLock.lock():void");
    }
}
