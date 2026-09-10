package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.locks.LockSupport;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlinx/coroutines/beachfront;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/attabal;", "Lkotlin/coroutines/CoroutineContext;", "parentContext", "Ljava/lang/Thread;", "blockedThread", "Lkotlinx/coroutines/lerp;", "eventLoop", "<init>", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/lerp;)V", "", "state", "", "trm", "(Ljava/lang/Object;)V", "tectonization", "()Ljava/lang/Object;", "polloi", "Ljava/lang/Thread;", "molybdenite", "Lkotlinx/coroutines/lerp;", "", "sensatory", "()Z", "isScopedCoroutine", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class beachfront<T> extends attabal<T> {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final lerp eventLoop;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final Thread blockedThread;

    public beachfront(CoroutineContext coroutineContext, Thread thread, lerp lerpVar) {
        super(coroutineContext, true, true);
        this.blockedThread = thread;
        this.eventLoop = lerpVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean sensatory() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T tectonization() throws Throwable {
        dern.attabal();
        try {
            lerp lerpVar = this.eventLoop;
            if (lerpVar != null) {
                lerp.picketboat(lerpVar, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    lerp lerpVar2 = this.eventLoop;
                    long jMonroe = lerpVar2 != null ? lerpVar2.monroe() : Long.MAX_VALUE;
                    if (saneness()) {
                        lerp lerpVar3 = this.eventLoop;
                        if (lerpVar3 != null) {
                            lerp.underbelly(lerpVar3, false, 1, null);
                        }
                        dern.attabal();
                        T t = (T) claque.impromptu(lerp());
                        stratoscope stratoscopeVar = t instanceof stratoscope ? (stratoscope) t : null;
                        if (stratoscopeVar == null) {
                            return t;
                        }
                        throw stratoscopeVar.cause;
                    }
                    dern.attabal();
                    LockSupport.parkNanos(this, jMonroe);
                } catch (Throwable th) {
                    lerp lerpVar4 = this.eventLoop;
                    if (lerpVar4 != null) {
                        lerp.underbelly(lerpVar4, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            sealless(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            dern.attabal();
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.JobSupport
    public void trm(Object state) {
        if (Intrinsics.wireman(Thread.currentThread(), this.blockedThread)) {
            return;
        }
        Thread thread = this.blockedThread;
        dern.attabal();
        LockSupport.unpark(thread);
    }
}
