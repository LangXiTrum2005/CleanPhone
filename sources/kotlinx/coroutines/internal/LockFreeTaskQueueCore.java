package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0002\t\nR\u0019\u0010\u0004\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00000\u00038\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00078\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "", "E", "Lkotlinx/atomicfu/AtomicRef;", "_next", "Lkotlinx/atomicfu/AtomicLong;", "_state", "Lkotlinx/atomicfu/AtomicArray;", "array", "Placeholder", "Companion", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LockFreeTaskQueueCore<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f45037e = AtomicReferenceFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(LockFreeTaskQueueCore.class, "_state$volatile");
    public static final Symbol g = new Symbol("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f45039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f45040c;
    public final /* synthetic */ AtomicReferenceArray d;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion;", "", "", "INITIAL_CAPACITY", "I", "CAPACITY_BITS", "MAX_CAPACITY_MASK", "HEAD_SHIFT", "", "HEAD_MASK", "J", "TAIL_SHIFT", "TAIL_MASK", "FROZEN_SHIFT", "FROZEN_MASK", "CLOSED_SHIFT", "CLOSED_MASK", "MIN_ADD_SPIN_CAPACITY", "Lkotlinx/coroutines/internal/Symbol;", "REMOVE_FROZEN", "Lkotlinx/coroutines/internal/Symbol;", "ADD_SUCCESS", "ADD_FROZEN", "ADD_CLOSED", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeTaskQueueCore$Placeholder;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Placeholder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f45041a;

        public Placeholder(int i2) {
            this.f45041a = i2;
        }
    }

    public LockFreeTaskQueueCore(int i2, boolean z2) {
        this.f45038a = i2;
        this.f45039b = z2;
        int i3 = i2 - 1;
        this.f45040c = i3;
        this.d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Runnable runnable) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            int i4 = this.f45040c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (!this.f45039b && atomicReferenceArray.get(i3 & i4) != null) {
                int i5 = this.f45038a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    return 1;
                }
            } else if (atomicLongFieldUpdater.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i3 + 1) & 1073741823)) << 30))) {
                atomicReferenceArray.set(i3 & i4, runnable);
                LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreC = this;
                while ((atomicLongFieldUpdater.get(lockFreeTaskQueueCoreC) & 1152921504606846976L) != 0) {
                    lockFreeTaskQueueCoreC = lockFreeTaskQueueCoreC.c();
                    AtomicReferenceArray atomicReferenceArray2 = lockFreeTaskQueueCoreC.d;
                    int i6 = lockFreeTaskQueueCoreC.f45040c & i3;
                    Object obj = atomicReferenceArray2.get(i6);
                    if ((obj instanceof Placeholder) && ((Placeholder) obj).f45041a == i3) {
                        atomicReferenceArray2.set(i6, runnable);
                    } else {
                        lockFreeTaskQueueCoreC = null;
                    }
                    if (lockFreeTaskQueueCoreC == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final LockFreeTaskQueueCore c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCore;
        while (true) {
            atomicLongFieldUpdater = f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                lockFreeTaskQueueCore = this;
                break;
            }
            long j2 = 1152921504606846976L | j;
            lockFreeTaskQueueCore = this;
            if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCore, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f45037e;
            LockFreeTaskQueueCore lockFreeTaskQueueCore2 = (LockFreeTaskQueueCore) atomicReferenceFieldUpdater.get(this);
            if (lockFreeTaskQueueCore2 != null) {
                return lockFreeTaskQueueCore2;
            }
            LockFreeTaskQueueCore lockFreeTaskQueueCore3 = new LockFreeTaskQueueCore(lockFreeTaskQueueCore.f45038a * 2, lockFreeTaskQueueCore.f45039b);
            int i2 = (int) (1073741823 & j);
            int i3 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i4 = lockFreeTaskQueueCore.f45040c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object placeholder = lockFreeTaskQueueCore.d.get(i5);
                if (placeholder == null) {
                    placeholder = new Placeholder(i2);
                }
                lockFreeTaskQueueCore3.d.set(lockFreeTaskQueueCore3.f45040c & i2, placeholder);
                i2++;
            }
            atomicLongFieldUpdater.set(lockFreeTaskQueueCore3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lockFreeTaskQueueCore3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        LockFreeTaskQueueCore<E> lockFreeTaskQueueCoreC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j = atomicLongFieldUpdater.get(lockFreeTaskQueueCoreC);
            if ((j & 1152921504606846976L) != 0) {
                return g;
            }
            int i2 = (int) (j & 1073741823);
            int i3 = lockFreeTaskQueueCoreC.f45040c;
            int i4 = ((int) ((1152921503533105152L & j) >> 30)) & i3;
            int i5 = i3 & i2;
            if (i4 != i5) {
                AtomicReferenceArray atomicReferenceArray = lockFreeTaskQueueCoreC.d;
                Object obj = atomicReferenceArray.get(i5);
                boolean z2 = lockFreeTaskQueueCoreC.f45039b;
                if (obj == null) {
                    if (z2) {
                    }
                } else if (!(obj instanceof Placeholder)) {
                    long j2 = (i2 + 1) & 1073741823;
                    if (atomicLongFieldUpdater.compareAndSet(lockFreeTaskQueueCoreC, j, (j & (-1073741824)) | j2)) {
                        atomicReferenceArray.set(i5, null);
                        return obj;
                    }
                    lockFreeTaskQueueCoreC = this;
                    if (z2) {
                        while (true) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f;
                            long j3 = atomicLongFieldUpdater2.get(lockFreeTaskQueueCoreC);
                            int i6 = (int) (j3 & 1073741823);
                            if ((j3 & 1152921504606846976L) != 0) {
                                lockFreeTaskQueueCoreC = lockFreeTaskQueueCoreC.c();
                            } else {
                                LockFreeTaskQueueCore<E> lockFreeTaskQueueCore = lockFreeTaskQueueCoreC;
                                lockFreeTaskQueueCoreC = lockFreeTaskQueueCore;
                                if (atomicLongFieldUpdater2.compareAndSet(lockFreeTaskQueueCore, j3, (j3 & (-1073741824)) | j2)) {
                                    lockFreeTaskQueueCoreC.d.set(lockFreeTaskQueueCoreC.f45040c & i6, null);
                                    lockFreeTaskQueueCoreC = null;
                                } else {
                                    continue;
                                }
                            }
                            if (lockFreeTaskQueueCoreC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}
