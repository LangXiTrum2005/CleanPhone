package pigboat;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R!\u0010\u0016\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0014j\b\u0012\u0004\u0012\u00028\u0000`\u00150\u00138\u0002X\u0082\u0004¨\u0006\u0017"}, d2 = {"Lpigboat/triweekly;", "", "E", "", "singleConsumer", "<init>", "(Z)V", "", "saneness", "()V", "element", "attabal", "(Ljava/lang/Object;)Z", "marial", "()Ljava/lang/Object;", "", "dern", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "Lpigboat/kowloon;", "Lkotlinx/coroutines/internal/Core;", "_cur", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class triweekly<E> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35379attabal = AtomicReferenceFieldUpdater.newUpdater(triweekly.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public triweekly(boolean z) {
        this._cur$volatile = new kowloon(8, z);
    }

    public final boolean attabal(E element) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35379attabal;
        while (true) {
            kowloon kowloonVar = (kowloon) atomicReferenceFieldUpdater.get(this);
            int iAttabal = kowloonVar.attabal(element);
            if (iAttabal == 0) {
                return true;
            }
            if (iAttabal == 1) {
                androidx.concurrent.futures.attabal.attabal(f35379attabal, this, kowloonVar, kowloonVar.formularize());
            } else if (iAttabal == 2) {
                return false;
            }
        }
    }

    public final int dern() {
        return ((kowloon) f35379attabal.get(this)).competently();
    }

    public final E marial() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35379attabal;
        while (true) {
            kowloon kowloonVar = (kowloon) atomicReferenceFieldUpdater.get(this);
            E e = (E) kowloonVar.impassible();
            if (e != kowloon.f35356impromptu) {
                return e;
            }
            androidx.concurrent.futures.attabal.attabal(f35379attabal, this, kowloonVar, kowloonVar.formularize());
        }
    }

    public final void saneness() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35379attabal;
        while (true) {
            kowloon kowloonVar = (kowloon) atomicReferenceFieldUpdater.get(this);
            if (kowloonVar.wireman()) {
                return;
            } else {
                androidx.concurrent.futures.attabal.attabal(f35379attabal, this, kowloonVar, kowloonVar.formularize());
            }
        }
    }
}
