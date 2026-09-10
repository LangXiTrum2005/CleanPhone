package p002kotlin.reflect.jvm.internal.impl.storage;

import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import yeast.dern;
import yeast.wireman;

/* JADX INFO: compiled from: locks.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final C0704attabal f31646attabal = C0704attabal.f31647attabal;

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.storage.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: locks.kt */
    public static final class C0704attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ C0704attabal f31647attabal = new C0704attabal();

        public final wireman attabal(Runnable runnable, Function1<? super InterruptedException, Unit> function1) {
            return (runnable == null || function1 == null) ? new wireman(null, 1, null) : new dern(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
