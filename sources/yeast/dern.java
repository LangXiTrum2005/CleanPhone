package yeast;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern extends wireman {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Runnable f39729dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final Function1<InterruptedException, Unit> f39730wireman;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public dern(Lock lock, Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        super(lock);
        Intrinsics.checkNotNullParameter(lock, "lock");
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f39729dern = checkCancelled;
        this.f39730wireman = interruptedExceptionHandler;
    }

    @Override // yeast.wireman, p002kotlin.reflect.jvm.internal.impl.storage.attabal
    public void lock() {
        while (!attabal().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f39729dern.run();
            } catch (InterruptedException e) {
                this.f39730wireman.invoke(e);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public dern(Runnable checkCancelled, Function1<? super InterruptedException, Unit> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        Intrinsics.checkNotNullParameter(checkCancelled, "checkCancelled");
        Intrinsics.checkNotNullParameter(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
