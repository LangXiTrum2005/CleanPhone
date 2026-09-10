package pigboat;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.setterwort;
import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.coroutines.CoroutineContext;
import pigboat.preprohormone;

/* JADX INFO: compiled from: ConcurrentLinkedList.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u000b\u0010!\u001a\u00020 8\u0002X\u0082\u0004¨\u0006\""}, d2 = {"Lpigboat/preprohormone;", "S", "Lpigboat/saneness;", "Lkotlinx/coroutines/setterwort;", "", "id", "prev", "", "pointers", "<init>", "(JLpigboat/preprohormone;I)V", "", "adultoid", "()Z", "arytenoidectomy", "index", "", "cause", "Lkotlin/coroutines/CoroutineContext;", "context", "", "molybdenite", "(ILjava/lang/Throwable;Lkotlin/coroutines/CoroutineContext;)V", "graveside", "()V", "monoploid", "J", "polloi", "()I", "numberOfSlots", "apical", "isRemoved", "Lkotlinx/atomicfu/AtomicInt;", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class preprohormone<S extends preprohormone<S>> extends saneness<S> implements setterwort {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f35369polloi = AtomicIntegerFieldUpdater.newUpdater(preprohormone.class, "cleanedAndPointers$volatile");
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final long id;

    public preprohormone(long j, S s, int i) {
        super(s);
        this.id = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    public final boolean adultoid() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f35369polloi;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            if (i == polloi() && !formularize()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }

    @Override // pigboat.saneness
    public boolean apical() {
        return f35369polloi.get(this) == polloi() && !formularize();
    }

    public final boolean arytenoidectomy() {
        return f35369polloi.addAndGet(this, Opcodes.V_PREVIEW) == polloi() && !formularize();
    }

    public final void graveside() {
        if (f35369polloi.incrementAndGet(this) == polloi()) {
            triweekly();
        }
    }

    public abstract void molybdenite(int index, Throwable cause, CoroutineContext context);

    public abstract int polloi();
}
