package pigboat;

import com.ironsource.C3414a2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: LockFreeTaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u0014*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002 \fB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00132\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0000j\b\u0012\u0004\u0012\u00028\u0000`\u00132\u0006\u0010\u001d\u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010!R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b$\u0010\nR\u0011\u0010(\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010'R%\u0010*\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00130)8\u0002X\u0082\u0004R\u000b\u0010,\u001a\u00020+8\u0002X\u0082\u0004R\u0013\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010-8\u0002X\u0082\u0004¨\u0006/"}, d2 = {"Lpigboat/kowloon;", "", "E", "", "capacity", "", "singleConsumer", "<init>", "(IZ)V", "wireman", "()Z", "element", "attabal", "(Ljava/lang/Object;)I", "impassible", "()Ljava/lang/Object;", "formularize", "()Lpigboat/kowloon;", "index", "Lkotlinx/coroutines/internal/Core;", "marial", "(ILjava/lang/Object;)Lpigboat/kowloon;", "oldHead", "newHead", "triweekly", "(II)Lpigboat/kowloon;", "", "apical", "()J", "state", "dern", "(J)Lpigboat/kowloon;", "saneness", "I", "Z", "mask", "cutely", "isEmpty", "competently", "()I", "size", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kowloon<E> {
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int capacity;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final int mask;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final boolean singleConsumer;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f35361wireman;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f35354beachfront = AtomicReferenceFieldUpdater.newUpdater(kowloon.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f35355competently = AtomicLongFieldUpdater.newUpdater(kowloon.class, "_state$volatile");

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static final stratoscope f35356impromptu = new stratoscope("REMOVE_FROZEN");

    /* JADX INFO: renamed from: pigboat.kowloon$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0011\u0010\u000e\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0011R\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016R\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0011R\u0014\u0010\u001f\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0011R\u0014\u0010#\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"Lpigboat/kowloon$attabal;", "", "<init>", "()V", "", C3414a2.d, "wireman", "(JJ)J", "", "newHead", "saneness", "(JI)J", "newTail", "dern", "attabal", "(J)I", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lpigboat/stratoscope;", "REMOVE_FROZEN", "Lpigboat/stratoscope;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int attabal(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long dern(long j, int i) {
            return wireman(j, 1152921503533105152L) | (((long) i) << 30);
        }

        public final long saneness(long j, int i) {
            return wireman(j, 1073741823L) | ((long) i);
        }

        public final long wireman(long j, long j2) {
            return j & (~j2);
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: LockFreeTaskQueue.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpigboat/kowloon$saneness;", "", "", "index", "<init>", "(I)V", "attabal", "I", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final int index;

        public saneness(int i) {
            this.index = i;
        }
    }

    public kowloon(int i, boolean z) {
        this.capacity = i;
        this.singleConsumer = z;
        int i2 = i - 1;
        this.mask = i2;
        this.f35361wireman = new AtomicReferenceArray(i);
        if (i2 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final long apical() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35355competently;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = 1152921504606846976L | j;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    public final int attabal(E element) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35355competently;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return INSTANCE.attabal(j);
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.mask;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.singleConsumer && getF35361wireman().get(i2 & i3) != null) {
                int i4 = this.capacity;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (f35355competently.compareAndSet(this, j, INSTANCE.dern(j, (i2 + 1) & 1073741823))) {
                getF35361wireman().set(i2 & i3, element);
                kowloon<E> kowloonVarMarial = this;
                while ((f35355competently.get(kowloonVarMarial) & 1152921504606846976L) != 0 && (kowloonVarMarial = kowloonVarMarial.formularize().marial(i2, element)) != null) {
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF35361wireman() {
        return this.f35361wireman;
    }

    public final int competently() {
        long j = f35355competently.get(this);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final boolean cutely() {
        long j = f35355competently.get(this);
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    public final kowloon<E> dern(long state) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f35354beachfront;
        while (true) {
            kowloon<E> kowloonVar = (kowloon) atomicReferenceFieldUpdater.get(this);
            if (kowloonVar != null) {
                return kowloonVar;
            }
            androidx.concurrent.futures.attabal.attabal(f35354beachfront, this, null, saneness(state));
        }
    }

    public final kowloon<E> formularize() {
        return dern(apical());
    }

    public final Object impassible() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35355competently;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j) != 0) {
                return f35356impromptu;
            }
            int i = (int) (1073741823 & j);
            int i2 = this.mask;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i2) == (i2 & i)) {
                return null;
            }
            Object obj = getF35361wireman().get(this.mask & i);
            if (obj == null) {
                if (this.singleConsumer) {
                    return null;
                }
            } else {
                if (obj instanceof saneness) {
                    return null;
                }
                int i3 = (i + 1) & 1073741823;
                if (f35355competently.compareAndSet(this, j, INSTANCE.saneness(j, i3))) {
                    getF35361wireman().set(this.mask & i, null);
                    return obj;
                }
                if (this.singleConsumer) {
                    kowloon<E> kowloonVarTriweekly = this;
                    do {
                        kowloonVarTriweekly = kowloonVarTriweekly.triweekly(i, i3);
                    } while (kowloonVarTriweekly != null);
                    return obj;
                }
            }
        }
    }

    public final kowloon<E> marial(int index, E element) {
        Object obj = getF35361wireman().get(this.mask & index);
        if (!(obj instanceof saneness) || ((saneness) obj).index != index) {
            return null;
        }
        getF35361wireman().set(index & this.mask, element);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final kowloon<E> saneness(long state) {
        kowloon<E> kowloonVar = new kowloon<>(this.capacity * 2, this.singleConsumer);
        int i = (int) (1073741823 & state);
        int i2 = (int) ((1152921503533105152L & state) >> 30);
        while (true) {
            int i3 = this.mask;
            if ((i & i3) == (i3 & i2)) {
                f35355competently.set(kowloonVar, INSTANCE.wireman(state, 1152921504606846976L));
                return kowloonVar;
            }
            Object sanenessVar = getF35361wireman().get(this.mask & i);
            if (sanenessVar == null) {
                sanenessVar = new saneness(i);
            }
            kowloonVar.getF35361wireman().set(kowloonVar.mask & i, sanenessVar);
            i++;
        }
    }

    public final kowloon<E> triweekly(int oldHead, int newHead) {
        long j;
        int i;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35355competently;
        do {
            j = atomicLongFieldUpdater.get(this);
            i = (int) (1073741823 & j);
            if ((1152921504606846976L & j) != 0) {
                return formularize();
            }
        } while (!f35355competently.compareAndSet(this, j, INSTANCE.saneness(j, newHead)));
        getF35361wireman().set(this.mask & i, null);
        return null;
    }

    public final boolean wireman() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f35355competently;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }
}
