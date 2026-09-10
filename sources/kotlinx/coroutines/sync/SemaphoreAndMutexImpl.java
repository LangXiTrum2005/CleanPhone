package kotlinx.coroutines.sync;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u00002\u00020\u0001R\u0011\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004R\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004R\u000b\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004R\u000b\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", TtmlNode.TAG_HEAD, "Lkotlinx/atomicfu/AtomicLong;", "deqIdx", "tail", "enqIdx", "Lkotlinx/atomicfu/AtomicInt;", "_availablePermits", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SemaphoreAndMutexImpl {
    public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e0 = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater f0 = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater g0 = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater h0 = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");
    public final int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final kotlinx.coroutines.a f45107Y;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public SemaphoreAndMutexImpl(int i2, int i3) {
        this.X = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i3 < 0 || i3 > i2) {
            throw new IllegalArgumentException(android.support.v4.media.a.h(i2, "The number of acquired permits should be in 0..").toString());
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i2 - i3;
        this.f45107Y = new kotlinx.coroutines.a(this, 1);
    }

    public final Object c(ContinuationImpl continuationImpl) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i2;
        do {
            atomicIntegerFieldUpdater = h0;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i2 = this.X;
        } while (andDecrement > i2);
        Unit unit = Unit.f43263a;
        if (andDecrement <= 0) {
            CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(continuationImpl));
            try {
                if (!d(cancellableContinuationImplB)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i2) {
                            if (andDecrement2 > 0) {
                                cancellableContinuationImplB.w(unit, this.f45107Y);
                                break;
                            }
                            if (d(cancellableContinuationImplB)) {
                                break;
                            }
                        }
                    }
                }
                Object objP = cancellableContinuationImplB.p();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (objP != coroutineSingletons) {
                    objP = unit;
                }
                if (objP == coroutineSingletons) {
                    return objP;
                }
            } catch (Throwable th) {
                cancellableContinuationImplB.y();
                throw th;
            }
        }
        return unit;
    }

    public final boolean d(Waiter waiter) {
        Object objA;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
        long andIncrement = g0.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.X;
        long j = andIncrement / ((long) SemaphoreKt.f);
        loop0: while (true) {
            objA = ConcurrentLinkedListKt.a(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.b(objA)) {
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.Z >= segmentA.Z) {
                        break loop0;
                    }
                    if (!segmentA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentA)) {
                            if (!segment.f()) {
                                break loop0;
                            }
                            segment.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (segmentA.f()) {
                        segmentA.e();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.a(objA);
        int i2 = (int) (andIncrement % ((long) SemaphoreKt.f));
        AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.f0;
        while (!atomicReferenceArray.compareAndSet(i2, null, waiter)) {
            if (atomicReferenceArray.get(i2) != null) {
                Symbol symbol = SemaphoreKt.f45109b;
                Symbol symbol2 = SemaphoreKt.f45110c;
                while (!atomicReferenceArray.compareAndSet(i2, symbol, symbol2)) {
                    if (atomicReferenceArray.get(i2) != symbol) {
                        return false;
                    }
                }
                boolean z2 = waiter instanceof CancellableContinuation;
                Unit unit = Unit.f43263a;
                if (z2) {
                    ((CancellableContinuation) waiter).w(unit, this.f45107Y);
                    return true;
                }
                if (waiter instanceof SelectInstance) {
                    ((SelectInstance) waiter).c(unit);
                    return true;
                }
                throw new IllegalStateException(("unexpected: " + waiter).toString());
            }
        }
        waiter.a(semaphoreSegment2, i2);
        return true;
    }

    public final void e() {
        int i2;
        Object objA;
        boolean zE;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.X;
            if (andIncrement >= i3) {
                do {
                    i2 = atomicIntegerFieldUpdater.get(this);
                    if (i2 <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Z;
            SemaphoreSegment semaphoreSegment = (SemaphoreSegment) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = e0.getAndIncrement(this);
            long j = andIncrement2 / ((long) SemaphoreKt.f);
            SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.X;
            while (true) {
                objA = ConcurrentLinkedListKt.a(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
                if (!SegmentOrClosed.b(objA)) {
                    Segment segmentA = SegmentOrClosed.a(objA);
                    while (true) {
                        Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                        if (segment.Z >= segmentA.Z) {
                            break;
                        }
                        if (!segmentA.j()) {
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentA)) {
                                if (!segment.f()) {
                                    break;
                                }
                                segment.e();
                                break;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == segment);
                        if (segmentA.f()) {
                            segmentA.e();
                        }
                    }
                } else {
                    break;
                }
            }
            SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.a(objA);
            semaphoreSegment2.a();
            zE = false;
            if (semaphoreSegment2.Z <= j) {
                int i4 = (int) (andIncrement2 % ((long) SemaphoreKt.f));
                Symbol symbol = SemaphoreKt.f45109b;
                AtomicReferenceArray atomicReferenceArray = semaphoreSegment2.f0;
                Object andSet = atomicReferenceArray.getAndSet(i4, symbol);
                if (andSet == null) {
                    int i5 = SemaphoreKt.f45108a;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= i5) {
                            Symbol symbol2 = SemaphoreKt.f45109b;
                            Symbol symbol3 = SemaphoreKt.d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i4, symbol2, symbol3)) {
                                    zE = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i4) == symbol2);
                            zE = !zE;
                            break;
                        }
                        if (atomicReferenceArray.get(i4) == SemaphoreKt.f45110c) {
                            zE = true;
                            break;
                        }
                        i6++;
                    }
                } else if (andSet != SemaphoreKt.f45111e) {
                    boolean z2 = andSet instanceof CancellableContinuation;
                    Unit unit = Unit.f43263a;
                    if (z2) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) andSet;
                        Symbol symbolC = cancellableContinuation.c(unit, this.f45107Y);
                        if (symbolC != null) {
                            cancellableContinuation.A(symbolC);
                            zE = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof SelectInstance)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zE = ((SelectInstance) andSet).e(this, unit);
                    }
                }
            }
        } while (!zE);
    }
}
