package kotlinx.coroutines.channels;

import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectKt;
import kotlinx.coroutines.selects.TrySelectDetailedResult;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0010\u0011R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0005\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004R\u000b\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004R\u0017\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004R\u0017\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004R\u0017\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002X\u0082\u0004R\u0013\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b8\u0002X\u0082\u0004R\u0013\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\b8\u0002X\u0082\u0004¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel;", "E", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/atomicfu/AtomicLong;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/channels/ChannelSegment;", "sendSegment", "receiveSegment", "bufferEndSegment", "", "_closeCause", "closeHandler", "SendBroadcast", "BufferedChannelIterator", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class BufferedChannel<E> implements Channel<E> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f44780Y = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Z = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater e0 = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f0 = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h0 = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j0 = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater k0 = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");
    public final int X;
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$BufferedChannelIterator;", "Lkotlinx/coroutines/channels/ChannelIterator;", "Lkotlinx/coroutines/Waiter;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        public Object X = BufferedChannelKt.f44793p;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public CancellableContinuationImpl f44781Y;

        public BufferedChannelIterator() {
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i2) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f44781Y;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.a(segment, i2);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public final Object b(Continuation continuation) throws Throwable {
            ChannelSegment channelSegmentR;
            Boolean bool;
            Object obj = this.X;
            boolean z2 = true;
            if (obj == BufferedChannelKt.f44793p || obj == BufferedChannelKt.f44791l) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = BufferedChannel.h0;
                BufferedChannel bufferedChannel = BufferedChannel.this;
                ChannelSegment channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(bufferedChannel);
                while (!bufferedChannel.D()) {
                    long andIncrement = BufferedChannel.Z.getAndIncrement(bufferedChannel);
                    long j = BufferedChannelKt.f44786b;
                    long j2 = andIncrement / j;
                    int i2 = (int) (andIncrement % j);
                    if (channelSegment.Z != j2) {
                        channelSegmentR = bufferedChannel.r(j2, channelSegment);
                        if (channelSegmentR == null) {
                            continue;
                        }
                    } else {
                        channelSegmentR = channelSegment;
                    }
                    Object objP = bufferedChannel.P(channelSegmentR, i2, andIncrement, null);
                    Symbol symbol = BufferedChannelKt.m;
                    if (objP == symbol) {
                        throw new IllegalStateException("unreachable");
                    }
                    Symbol symbol2 = BufferedChannelKt.o;
                    if (objP == symbol2) {
                        if (andIncrement < bufferedChannel.A()) {
                            channelSegmentR.a();
                        }
                        channelSegment = channelSegmentR;
                    } else {
                        if (objP == BufferedChannelKt.f44792n) {
                            BufferedChannel bufferedChannel2 = BufferedChannel.this;
                            CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(continuation));
                            try {
                                this.f44781Y = cancellableContinuationImplB;
                                Object objP2 = bufferedChannel2.P(channelSegmentR, i2, andIncrement, this);
                                if (objP2 != symbol) {
                                    if (objP2 == symbol2) {
                                        if (andIncrement < bufferedChannel2.A()) {
                                            channelSegmentR.a();
                                        }
                                        ChannelSegment channelSegment2 = (ChannelSegment) BufferedChannel.h0.get(bufferedChannel2);
                                        while (true) {
                                            if (bufferedChannel2.D()) {
                                                CancellableContinuationImpl cancellableContinuationImpl = this.f44781Y;
                                                Intrinsics.c(cancellableContinuationImpl);
                                                this.f44781Y = null;
                                                this.X = BufferedChannelKt.f44791l;
                                                Throwable thS = bufferedChannel.s();
                                                if (thS != null) {
                                                    cancellableContinuationImpl.resumeWith(ResultKt.a(thS));
                                                    break;
                                                }
                                                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                                                break;
                                            }
                                            long andIncrement2 = BufferedChannel.Z.getAndIncrement(bufferedChannel2);
                                            long j3 = BufferedChannelKt.f44786b;
                                            long j4 = andIncrement2 / j3;
                                            int i3 = (int) (andIncrement2 % j3);
                                            if (channelSegment2.Z != j4) {
                                                ChannelSegment channelSegmentR2 = bufferedChannel2.r(j4, channelSegment2);
                                                if (channelSegmentR2 != null) {
                                                    channelSegment2 = channelSegmentR2;
                                                }
                                            }
                                            Object objP3 = bufferedChannel2.P(channelSegment2, i3, andIncrement2, this);
                                            if (objP3 == BufferedChannelKt.m) {
                                                a(channelSegment2, i3);
                                                break;
                                            }
                                            if (objP3 == BufferedChannelKt.o) {
                                                if (andIncrement2 < bufferedChannel2.A()) {
                                                    channelSegment2.a();
                                                }
                                            } else {
                                                if (objP3 == BufferedChannelKt.f44792n) {
                                                    throw new IllegalStateException("unexpected");
                                                }
                                                channelSegment2.a();
                                                this.X = objP3;
                                                this.f44781Y = null;
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                    } else {
                                        channelSegmentR.a();
                                        this.X = objP2;
                                        this.f44781Y = null;
                                        bool = Boolean.TRUE;
                                    }
                                    cancellableContinuationImplB.w(bool, null);
                                    break;
                                }
                                a(channelSegmentR, i2);
                                Object objP4 = cancellableContinuationImplB.p();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                                return objP4;
                            } catch (Throwable th) {
                                cancellableContinuationImplB.y();
                                throw th;
                            }
                        }
                        channelSegmentR.a();
                        this.X = objP;
                    }
                }
                this.X = BufferedChannelKt.f44791l;
                Throwable thS2 = bufferedChannel.s();
                if (thS2 != null) {
                    int i4 = StackTraceRecoveryKt.f45045a;
                    throw thS2;
                }
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public final Object next() throws Throwable {
            Object obj = this.X;
            Symbol symbol = BufferedChannelKt.f44793p;
            if (obj == symbol) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.X = symbol;
            if (obj != BufferedChannelKt.f44791l) {
                return obj;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = BufferedChannel.f44780Y;
            Throwable thT = BufferedChannel.this.t();
            int i2 = StackTraceRecoveryKt.f45045a;
            throw thT;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/channels/BufferedChannel$SendBroadcast;", "Lkotlinx/coroutines/Waiter;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendBroadcast implements Waiter {
        public final /* synthetic */ CancellableContinuationImpl X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final CancellableContinuationImpl f44782Y;

        public SendBroadcast(CancellableContinuationImpl cancellableContinuationImpl) {
            this.X = cancellableContinuationImpl;
            this.f44782Y = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.Waiter
        public final void a(Segment segment, int i2) {
            this.X.a(segment, i2);
        }
    }

    public BufferedChannel(int i2) {
        this.X = i2;
        if (i2 < 0) {
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.k("Invalid channel capacity: ", i2, ", should be >=0").toString());
        }
        ChannelSegment channelSegment = BufferedChannelKt.f44785a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = e0.get(this);
        ChannelSegment channelSegment2 = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment2;
        this.receiveSegment$volatile = channelSegment2;
        if (F()) {
            channelSegment2 = BufferedChannelKt.f44785a;
            Intrinsics.d(channelSegment2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment$volatile = channelSegment2;
        this._closeCause$volatile = BufferedChannelKt.s;
    }

    public static void B(BufferedChannel bufferedChannel) {
        bufferedChannel.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f0;
        if ((atomicLongFieldUpdater.addAndGet(bufferedChannel, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bufferedChannel) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static Object I(BufferedChannel bufferedChannel, ContinuationImpl continuationImpl) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ChannelSegment channelSegment;
        if (continuationImpl instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) continuationImpl;
            int i2 = bufferedChannel$receiveCatching$1.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.Z = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, continuationImpl);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = bufferedChannel$receiveCatching$2.Z;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return ((ChannelResult) obj).f44798a;
        }
        ResultKt.b(obj);
        ChannelSegment channelSegment2 = (ChannelSegment) h0.get(bufferedChannel);
        while (!bufferedChannel.D()) {
            long andIncrement = Z.getAndIncrement(bufferedChannel);
            long j = BufferedChannelKt.f44786b;
            long j2 = andIncrement / j;
            int i4 = (int) (andIncrement % j);
            if (channelSegment2.Z != j2) {
                ChannelSegment channelSegmentR = bufferedChannel.r(j2, channelSegment2);
                if (channelSegmentR == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentR;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object objP = bufferedChannel2.P(channelSegment, i4, andIncrement, null);
            if (objP == BufferedChannelKt.m) {
                throw new IllegalStateException("unexpected");
            }
            if (objP != BufferedChannelKt.o) {
                if (objP != BufferedChannelKt.f44792n) {
                    channelSegment.a();
                    return objP;
                }
                bufferedChannel$receiveCatching$2.Z = 1;
                Object objJ = bufferedChannel2.J(channelSegment, i4, andIncrement, bufferedChannel$receiveCatching$2);
                return objJ == coroutineSingletons ? coroutineSingletons : objJ;
            }
            if (andIncrement < bufferedChannel2.A()) {
                channelSegment.a();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        return new ChannelResult.Closed(bufferedChannel.s());
    }

    public static final ChannelSegment b(BufferedChannel bufferedChannel, long j, ChannelSegment channelSegment) {
        Object objA;
        BufferedChannel bufferedChannel2;
        bufferedChannel.getClass();
        ChannelSegment channelSegment2 = BufferedChannelKt.f44785a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.X;
        loop0: while (true) {
            objA = ConcurrentLinkedListKt.a(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
            if (!SegmentOrClosed.b(objA)) {
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(bufferedChannel);
                    if (segment.Z >= segmentA.Z) {
                        break loop0;
                    }
                    if (!segmentA.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bufferedChannel, segment, segmentA)) {
                            if (!segment.f()) {
                                break loop0;
                            }
                            segment.e();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bufferedChannel) == segment);
                    if (segmentA.f()) {
                        segmentA.e();
                    }
                }
            } else {
                break;
            }
        }
        boolean zB = SegmentOrClosed.b(objA);
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        if (zB) {
            bufferedChannel.z();
            if (channelSegment.Z * ((long) BufferedChannelKt.f44786b) < atomicLongFieldUpdater.get(bufferedChannel)) {
                channelSegment.a();
                return null;
            }
        } else {
            ChannelSegment channelSegment3 = (ChannelSegment) SegmentOrClosed.a(objA);
            long j2 = channelSegment3.Z;
            if (j2 <= j) {
                return channelSegment3;
            }
            long j3 = ((long) BufferedChannelKt.f44786b) * j2;
            while (true) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f44780Y;
                long j4 = atomicLongFieldUpdater2.get(bufferedChannel);
                long j5 = 1152921504606846975L & j4;
                if (j5 >= j3) {
                    bufferedChannel2 = bufferedChannel;
                    break;
                }
                bufferedChannel2 = bufferedChannel;
                if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel2, j4, j5 + (((long) ((int) (j4 >> 60))) << 60))) {
                    break;
                }
                bufferedChannel = bufferedChannel2;
            }
            if (j2 * ((long) BufferedChannelKt.f44786b) < atomicLongFieldUpdater.get(bufferedChannel2)) {
                channelSegment3.a();
            }
        }
        return null;
    }

    public static final void c(BufferedChannel bufferedChannel, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
        bufferedChannel.getClass();
        cancellableContinuationImpl.resumeWith(ResultKt.a(bufferedChannel.w()));
    }

    public static final void f(BufferedChannel bufferedChannel, Waiter waiter, ChannelSegment channelSegment, int i2) {
        bufferedChannel.getClass();
        waiter.a(channelSegment, i2 + BufferedChannelKt.f44786b);
    }

    public static final void h(BufferedChannel bufferedChannel, SelectInstance selectInstance) {
        ChannelSegment channelSegment;
        Object obj;
        bufferedChannel.getClass();
        ChannelSegment channelSegment2 = (ChannelSegment) h0.get(bufferedChannel);
        while (!bufferedChannel.D()) {
            long andIncrement = Z.getAndIncrement(bufferedChannel);
            long j = BufferedChannelKt.f44786b;
            long j2 = andIncrement / j;
            int i2 = (int) (andIncrement % j);
            if (channelSegment2.Z != j2) {
                ChannelSegment channelSegmentR = bufferedChannel.r(j2, channelSegment2);
                if (channelSegmentR == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentR;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object objP = bufferedChannel.P(channelSegment, i2, andIncrement, selectInstance);
            channelSegment2 = channelSegment;
            if (objP == BufferedChannelKt.m) {
                Waiter waiter = selectInstance instanceof Waiter ? (Waiter) obj : null;
                if (waiter == null) {
                    obj = selectInstance;
                    return;
                } else {
                    obj = selectInstance;
                    waiter.a(channelSegment2, i2);
                    return;
                }
            }
            if (objP != BufferedChannelKt.o) {
                if (objP == BufferedChannelKt.f44792n) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment2.a();
                selectInstance.c(objP);
                return;
            }
            if (andIncrement < bufferedChannel.A()) {
                channelSegment2.a();
            }
            bufferedChannel = bufferedChannel;
            selectInstance = selectInstance;
        }
        selectInstance.c(BufferedChannelKt.f44791l);
    }

    public static final int j(BufferedChannel bufferedChannel, ChannelSegment channelSegment, int i2, Object obj, long j, Object obj2, boolean z2) {
        bufferedChannel.getClass();
        channelSegment.n(i2, obj);
        if (z2) {
            return bufferedChannel.Q(channelSegment, i2, obj, j, obj2, z2);
        }
        Object objL = channelSegment.l(i2);
        if (objL == null) {
            if (bufferedChannel.k(j)) {
                if (channelSegment.k(i2, null, BufferedChannelKt.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (channelSegment.k(i2, null, obj2)) {
                    return 2;
                }
            }
        } else if (objL instanceof Waiter) {
            channelSegment.n(i2, null);
            if (bufferedChannel.N(objL, obj)) {
                channelSegment.o(i2, BufferedChannelKt.f44790i);
                return 0;
            }
            Symbol symbol = BufferedChannelKt.k;
            if (channelSegment.g0.getAndSet((i2 * 2) + 1, symbol) == symbol) {
                return 5;
            }
            channelSegment.m(i2, true);
            return 5;
        }
        return bufferedChannel.Q(channelSegment, i2, obj, j, obj2, z2);
    }

    public final long A() {
        return f44780Y.get(this) & 1152921504606846975L;
    }

    public final boolean C(long j, boolean z2) {
        int i2 = (int) (j >> 60);
        if (i2 == 0 || i2 == 1) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        if (i2 == 2) {
            o(j & 1152921504606846975L);
            if (z2) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
                    ChannelSegment channelSegmentR = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
                    long j2 = atomicLongFieldUpdater.get(this);
                    if (A() <= j2) {
                        break;
                    }
                    long j3 = BufferedChannelKt.f44786b;
                    long j4 = j2 / j3;
                    if (channelSegmentR.Z != j4 && (channelSegmentR = r(j4, channelSegmentR)) == null) {
                        if (((ChannelSegment) atomicReferenceFieldUpdater.get(this)).Z < j4) {
                            break;
                        }
                    } else {
                        channelSegmentR.a();
                        int i3 = (int) (j2 % j3);
                        while (true) {
                            Object objL = channelSegmentR.l(i3);
                            if (objL != null && objL != BufferedChannelKt.f44788e) {
                                if (objL != BufferedChannelKt.d && (objL == BufferedChannelKt.j || objL == BufferedChannelKt.f44791l || objL == BufferedChannelKt.f44790i || objL == BufferedChannelKt.f44789h || (objL != BufferedChannelKt.g && (objL == BufferedChannelKt.f || j2 != atomicLongFieldUpdater.get(this))))) {
                                    break;
                                    break;
                                    break;
                                    break;
                                    break;
                                    break;
                                }
                                return false;
                            }
                            if (channelSegmentR.k(i3, objL, BufferedChannelKt.f44789h)) {
                                q();
                                break;
                            }
                        }
                        Z.compareAndSet(this, j2, j2 + 1);
                    }
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException(android.support.v4.media.a.h(i2, "unexpected close status: ").toString());
            }
            ChannelSegment channelSegmentO = o(j & 1152921504606846975L);
            Object objA = null;
            loop0: do {
                for (int i4 = BufferedChannelKt.f44786b - 1; -1 < i4; i4--) {
                    long j5 = (channelSegmentO.Z * ((long) BufferedChannelKt.f44786b)) + ((long) i4);
                    while (true) {
                        Object objL2 = channelSegmentO.l(i4);
                        if (objL2 == BufferedChannelKt.f44790i) {
                            break loop0;
                        }
                        if (objL2 != BufferedChannelKt.d) {
                            if (objL2 != BufferedChannelKt.f44788e && objL2 != null) {
                                if (!(objL2 instanceof Waiter) && !(objL2 instanceof WaiterEB)) {
                                    Symbol symbol = BufferedChannelKt.g;
                                    if (objL2 == symbol || objL2 == BufferedChannelKt.f) {
                                        break loop0;
                                    }
                                    if (objL2 != symbol) {
                                        break;
                                    }
                                } else {
                                    if (j5 < atomicLongFieldUpdater.get(this)) {
                                        break loop0;
                                    }
                                    Waiter waiter = objL2 instanceof WaiterEB ? ((WaiterEB) objL2).f44839a : (Waiter) objL2;
                                    if (channelSegmentO.k(i4, objL2, BufferedChannelKt.f44791l)) {
                                        objA = InlineList.a(objA, waiter);
                                        channelSegmentO.n(i4, null);
                                        channelSegmentO.i();
                                        break;
                                    }
                                }
                            } else {
                                if (channelSegmentO.k(i4, objL2, BufferedChannelKt.f44791l)) {
                                    channelSegmentO.i();
                                    break;
                                }
                            }
                        } else {
                            if (j5 < atomicLongFieldUpdater.get(this)) {
                                break loop0;
                            }
                            if (channelSegmentO.k(i4, objL2, BufferedChannelKt.f44791l)) {
                                channelSegmentO.n(i4, null);
                                channelSegmentO.i();
                                break;
                            }
                        }
                    }
                }
                channelSegmentO = (ChannelSegment) ((ConcurrentLinkedListNode) ConcurrentLinkedListNode.f45027Y.get(channelSegmentO));
            } while (channelSegmentO != null);
            if (objA != null) {
                if (objA instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) objA;
                    for (int size = arrayList.size() - 1; -1 < size; size--) {
                        L((Waiter) arrayList.get(size), false);
                    }
                } else {
                    L((Waiter) objA, false);
                }
            }
        }
        return true;
    }

    public final boolean D() {
        return C(f44780Y.get(this), true);
    }

    public boolean E() {
        return false;
    }

    public final boolean F() {
        long j = e0.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }

    public final void G(long j, ChannelSegment channelSegment) {
        ChannelSegment channelSegment2;
        ChannelSegment channelSegment3;
        while (channelSegment.Z < j && (channelSegment3 = (ChannelSegment) channelSegment.c()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.d() || (channelSegment2 = (ChannelSegment) channelSegment.c()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.Z >= channelSegment.Z) {
                        return;
                    }
                    if (!channelSegment.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, channelSegment)) {
                            if (segment.f()) {
                                segment.e();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (channelSegment.f()) {
                        channelSegment.e();
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    public final Object H(Object obj, Continuation continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        cancellableContinuationImpl.resumeWith(ResultKt.a(w()));
        Object objP = cancellableContinuationImpl.p();
        return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object J(ChannelSegment channelSegment, int i2, long j, ContinuationImpl continuationImpl) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ChannelSegment channelSegment2;
        if (continuationImpl instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) continuationImpl;
            int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Z = i3 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, continuationImpl);
        }
        Object objP = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.X;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i4 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Z;
        if (i4 == 0) {
            ResultKt.b(objP);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.Z = 1;
            CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                ReceiveCatching receiveCatching = new ReceiveCatching(cancellableContinuationImplB);
                Object objP2 = P(channelSegment, i2, j, receiveCatching);
                if (objP2 == BufferedChannelKt.m) {
                    receiveCatching.a(channelSegment, i2);
                } else if (objP2 == BufferedChannelKt.o) {
                    if (j < A()) {
                        channelSegment.a();
                    }
                    ChannelSegment channelSegment3 = (ChannelSegment) h0.get(this);
                    while (true) {
                        if (D()) {
                            cancellableContinuationImplB.resumeWith(new ChannelResult(new ChannelResult.Closed(s())));
                            break;
                        }
                        long andIncrement = Z.getAndIncrement(this);
                        long j2 = BufferedChannelKt.f44786b;
                        long j3 = andIncrement / j2;
                        int i5 = (int) (andIncrement % j2);
                        if (channelSegment3.Z != j3) {
                            ChannelSegment channelSegmentR = r(j3, channelSegment3);
                            if (channelSegmentR != null) {
                                channelSegment2 = channelSegmentR;
                            }
                        } else {
                            channelSegment2 = channelSegment3;
                        }
                        Object objP3 = P(channelSegment2, i5, andIncrement, receiveCatching);
                        ChannelSegment channelSegment4 = channelSegment2;
                        if (objP3 == BufferedChannelKt.m) {
                            receiveCatching.a(channelSegment4, i5);
                            break;
                        }
                        if (objP3 != BufferedChannelKt.o) {
                            if (objP3 == BufferedChannelKt.f44792n) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment4.a();
                            cancellableContinuationImplB.w(new ChannelResult(objP3), null);
                            break;
                        }
                        if (andIncrement < A()) {
                            channelSegment4.a();
                        }
                        channelSegment3 = channelSegment4;
                    }
                } else {
                    channelSegment.a();
                    cancellableContinuationImplB.w(new ChannelResult(objP2), null);
                }
                objP = cancellableContinuationImplB.p();
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.X;
                if (objP == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (Throwable th) {
                cancellableContinuationImplB.y();
                throw th;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((ChannelResult) objP).f44798a;
    }

    public void K(SelectInstance selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) g0.get(this);
        while (true) {
            long andIncrement = f44780Y.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zC = C(andIncrement, false);
            long j2 = BufferedChannelKt.f44786b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (channelSegment2.Z != j3) {
                ChannelSegment channelSegmentB = b(this, j3, channelSegment2);
                if (channelSegmentB != null) {
                    channelSegment = channelSegmentB;
                } else if (zC) {
                    selectInstance.c(BufferedChannelKt.f44791l);
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance selectInstance2 = selectInstance;
            Object obj2 = obj;
            int iJ = j(this, channelSegment, i2, obj2, j, selectInstance2, zC);
            channelSegment2 = channelSegment;
            Unit unit = Unit.f43263a;
            if (iJ == 0) {
                channelSegment2.a();
                selectInstance2.c(unit);
                return;
            }
            if (iJ == 1) {
                selectInstance2.c(unit);
                return;
            }
            if (iJ == 2) {
                if (zC) {
                    channelSegment2.i();
                    selectInstance2.c(BufferedChannelKt.f44791l);
                    return;
                } else {
                    Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                    if (waiter != null) {
                        f(this, waiter, channelSegment2, i2);
                        return;
                    }
                    return;
                }
            }
            if (iJ == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iJ == 4) {
                if (j < Z.get(this)) {
                    channelSegment2.a();
                }
                selectInstance2.c(BufferedChannelKt.f44791l);
                return;
            } else {
                if (iJ == 5) {
                    channelSegment2.a();
                }
                obj = obj2;
                selectInstance = selectInstance2;
            }
        }
    }

    public final void L(Waiter waiter, boolean z2) {
        if (waiter instanceof SendBroadcast) {
            ((SendBroadcast) waiter).f44782Y.resumeWith(Boolean.FALSE);
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            ((Continuation) waiter).resumeWith(ResultKt.a(z2 ? t() : w()));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            ((ReceiveCatching) waiter).X.resumeWith(new ChannelResult(new ChannelResult.Closed(s())));
            return;
        }
        if (!(waiter instanceof BufferedChannelIterator)) {
            if (waiter instanceof SelectInstance) {
                ((SelectInstance) waiter).e(this, BufferedChannelKt.f44791l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + waiter).toString());
            }
        }
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) waiter;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.f44781Y;
        Intrinsics.c(cancellableContinuationImpl);
        bufferedChannelIterator.f44781Y = null;
        bufferedChannelIterator.X = BufferedChannelKt.f44791l;
        Throwable thS = BufferedChannel.this.s();
        if (thS == null) {
            cancellableContinuationImpl.resumeWith(Boolean.FALSE);
        } else {
            cancellableContinuationImpl.resumeWith(ResultKt.a(thS));
        }
    }

    public Object M(Continuation continuation) throws Throwable {
        ChannelSegment channelSegmentB;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        SendBroadcast sendBroadcast = new SendBroadcast(cancellableContinuationImpl);
        ChannelSegment channelSegment = (ChannelSegment) g0.get(this);
        while (true) {
            long andIncrement = f44780Y.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zC = C(andIncrement, false);
            long j2 = BufferedChannelKt.f44786b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (channelSegment.Z != j3) {
                channelSegmentB = b(this, j3, channelSegment);
                if (channelSegmentB == null) {
                    if (zC) {
                        cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                        break;
                    }
                }
            } else {
                channelSegmentB = channelSegment;
            }
            int iJ = j(this, channelSegmentB, i2, null, j, sendBroadcast, zC);
            if (iJ == 0) {
                channelSegmentB.a();
            } else if (iJ != 1) {
                if (iJ == 2) {
                    if (!zC) {
                        f(this, sendBroadcast, channelSegmentB, i2);
                        break;
                    }
                    channelSegmentB.i();
                } else {
                    if (iJ == 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iJ != 4) {
                        if (iJ == 5) {
                            channelSegmentB.a();
                        }
                        channelSegment = channelSegmentB;
                    } else if (j < Z.get(this)) {
                        channelSegmentB.a();
                    }
                }
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                break;
            }
            cancellableContinuationImpl.resumeWith(Boolean.TRUE);
            break;
        }
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    public final boolean N(Object obj, Object obj2) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).e(this, obj2);
        }
        if (obj instanceof ReceiveCatching) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.ReceiveCatching<E of kotlinx.coroutines.channels.BufferedChannel>");
            return BufferedChannelKt.a(((ReceiveCatching) obj).X, new ChannelResult(obj2), null);
        }
        if (!(obj instanceof BufferedChannelIterator)) {
            if (obj instanceof CancellableContinuation) {
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
                return BufferedChannelKt.a((CancellableContinuation) obj, obj2, null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
        BufferedChannelIterator bufferedChannelIterator = (BufferedChannelIterator) obj;
        CancellableContinuationImpl cancellableContinuationImpl = bufferedChannelIterator.f44781Y;
        Intrinsics.c(cancellableContinuationImpl);
        bufferedChannelIterator.f44781Y = null;
        bufferedChannelIterator.X = obj2;
        Boolean bool = Boolean.TRUE;
        BufferedChannel.this.getClass();
        return BufferedChannelKt.a(cancellableContinuationImpl, bool, null);
    }

    public final boolean O(Object obj, ChannelSegment channelSegment, int i2) {
        TrySelectDetailedResult trySelectDetailedResult;
        boolean z2 = obj instanceof CancellableContinuation;
        Unit unit = Unit.f43263a;
        if (z2) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return BufferedChannelKt.a((CancellableContinuation) obj, unit, null);
        }
        if (!(obj instanceof SelectInstance)) {
            if (obj instanceof SendBroadcast) {
                return BufferedChannelKt.a(((SendBroadcast) obj).f44782Y, Boolean.TRUE, null);
            }
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        int iL = ((SelectImplementation) obj).l(this, unit);
        Function3 function3 = SelectKt.f45095a;
        if (iL == 0) {
            trySelectDetailedResult = TrySelectDetailedResult.X;
        } else if (iL == 1) {
            trySelectDetailedResult = TrySelectDetailedResult.f45099Y;
        } else if (iL == 2) {
            trySelectDetailedResult = TrySelectDetailedResult.Z;
        } else {
            if (iL != 3) {
                throw new IllegalStateException(("Unexpected internal result: " + iL).toString());
            }
            trySelectDetailedResult = TrySelectDetailedResult.e0;
        }
        if (trySelectDetailedResult == TrySelectDetailedResult.f45099Y) {
            channelSegment.n(i2, null);
        }
        return trySelectDetailedResult == TrySelectDetailedResult.X;
    }

    public final Object P(ChannelSegment channelSegment, int i2, long j, Object obj) {
        Object objL = channelSegment.l(i2);
        AtomicReferenceArray atomicReferenceArray = channelSegment.g0;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44780Y;
        if (objL == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.f44792n;
                }
                if (channelSegment.k(i2, objL, obj)) {
                    q();
                    return BufferedChannelKt.m;
                }
            }
        } else if (objL == BufferedChannelKt.d && channelSegment.k(i2, objL, BufferedChannelKt.f44790i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i2 * 2);
            channelSegment.n(i2, null);
            return obj2;
        }
        while (true) {
            Object objL2 = channelSegment.l(i2);
            if (objL2 == null || objL2 == BufferedChannelKt.f44788e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (channelSegment.k(i2, objL2, BufferedChannelKt.f44789h)) {
                        q();
                        return BufferedChannelKt.o;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.f44792n;
                    }
                    if (channelSegment.k(i2, objL2, obj)) {
                        q();
                        return BufferedChannelKt.m;
                    }
                }
            } else if (objL2 != BufferedChannelKt.d) {
                Symbol symbol = BufferedChannelKt.j;
                if (objL2 == symbol) {
                    return BufferedChannelKt.o;
                }
                if (objL2 == BufferedChannelKt.f44789h) {
                    return BufferedChannelKt.o;
                }
                if (objL2 == BufferedChannelKt.f44791l) {
                    q();
                    return BufferedChannelKt.o;
                }
                if (objL2 != BufferedChannelKt.g && channelSegment.k(i2, objL2, BufferedChannelKt.f)) {
                    boolean z2 = objL2 instanceof WaiterEB;
                    if (z2) {
                        objL2 = ((WaiterEB) objL2).f44839a;
                    }
                    if (O(objL2, channelSegment, i2)) {
                        channelSegment.o(i2, BufferedChannelKt.f44790i);
                        q();
                        Object obj3 = atomicReferenceArray.get(i2 * 2);
                        channelSegment.n(i2, null);
                        return obj3;
                    }
                    channelSegment.o(i2, symbol);
                    channelSegment.i();
                    if (z2) {
                        q();
                    }
                    return BufferedChannelKt.o;
                }
            } else if (channelSegment.k(i2, objL2, BufferedChannelKt.f44790i)) {
                q();
                Object obj4 = atomicReferenceArray.get(i2 * 2);
                channelSegment.n(i2, null);
                return obj4;
            }
        }
    }

    public final int Q(ChannelSegment channelSegment, int i2, Object obj, long j, Object obj2, boolean z2) {
        while (true) {
            Object objL = channelSegment.l(i2);
            if (objL == null) {
                if (!k(j) || z2) {
                    if (z2) {
                        if (channelSegment.k(i2, null, BufferedChannelKt.j)) {
                            channelSegment.i();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (channelSegment.k(i2, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.k(i2, null, BufferedChannelKt.d)) {
                    break;
                }
            } else {
                if (objL != BufferedChannelKt.f44788e) {
                    Symbol symbol = BufferedChannelKt.k;
                    if (objL == symbol) {
                        channelSegment.n(i2, null);
                        return 5;
                    }
                    if (objL == BufferedChannelKt.f44789h) {
                        channelSegment.n(i2, null);
                        return 5;
                    }
                    if (objL == BufferedChannelKt.f44791l) {
                        channelSegment.n(i2, null);
                        z();
                        return 4;
                    }
                    channelSegment.n(i2, null);
                    if (objL instanceof WaiterEB) {
                        objL = ((WaiterEB) objL).f44839a;
                    }
                    if (N(objL, obj)) {
                        channelSegment.o(i2, BufferedChannelKt.f44790i);
                        return 0;
                    }
                    if (channelSegment.g0.getAndSet((i2 * 2) + 1, symbol) != symbol) {
                        channelSegment.m(i2, true);
                    }
                    return 5;
                }
                if (channelSegment.k(i2, objL, BufferedChannelKt.d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void R(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.F()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = e0;
            if (atomicLongFieldUpdater.get(bufferedChannel) > j) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        int i2 = BufferedChannelKt.f44787c;
        int i3 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f0;
            if (i3 < i2) {
                long j2 = atomicLongFieldUpdater.get(bufferedChannel);
                if (j2 == (4611686018427387903L & atomicLongFieldUpdater2.get(bufferedChannel)) && j2 == atomicLongFieldUpdater.get(bufferedChannel)) {
                    return;
                } else {
                    i3++;
                }
            } else {
                while (true) {
                    long j3 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j3, (j3 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bufferedChannel = this;
                    }
                }
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(bufferedChannel);
                    long j5 = atomicLongFieldUpdater2.get(bufferedChannel);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z2 = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(bufferedChannel)) {
                        break;
                    }
                    if (!z2) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, 4611686018427387904L + j6);
                    }
                    bufferedChannel = this;
                }
                while (true) {
                    long j7 = atomicLongFieldUpdater2.get(bufferedChannel);
                    if (atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j7, j7 & 4611686018427387903L)) {
                        return;
                    } else {
                        bufferedChannel = this;
                    }
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void a(CancellationException cancellationException) {
        m(cancellationException);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object e(ContinuationImpl continuationImpl) {
        return I(this, continuationImpl);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final void g(Function1 function1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = k0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, function1)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = BufferedChannelKt.q;
            if (obj != symbol) {
                if (obj == BufferedChannelKt.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            Symbol symbol2 = BufferedChannelKt.r;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, symbol2)) {
                    function1.invoke(s());
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == symbol);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0072  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:34:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x009b  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:45:0x00af  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0056 A[SYNTHETIC] */
    @Override // kotlinx.coroutines.channels.SendChannel
    public Object i(Object obj) {
        int iJ;
        Unit unit;
        Waiter waiter;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44780Y;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = 1152921504606846975L;
        boolean z2 = C(j, false) ? false : !k(j & 1152921504606846975L);
        ChannelResult.Failed failed = ChannelResult.f44797b;
        if (z2) {
            return failed;
        }
        Object obj2 = BufferedChannelKt.j;
        ChannelSegment channelSegment = (ChannelSegment) g0.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j3 = andIncrement & j2;
            boolean zC = C(andIncrement, false);
            long j4 = BufferedChannelKt.f44786b;
            long j5 = j3 / j4;
            int i2 = (int) (j3 % j4);
            if (channelSegment.Z == j5) {
                iJ = j(this, channelSegment, i2, obj, j3, obj2, zC);
                unit = Unit.f43263a;
                if (iJ != 0) {
                    channelSegment.a();
                    return unit;
                }
                if (iJ != 1) {
                    return unit;
                }
                if (iJ != 2) {
                    if (zC) {
                        channelSegment.i();
                        return new ChannelResult.Closed(w());
                    }
                    if (obj2 instanceof Waiter) {
                        waiter = (Waiter) obj2;
                    } else {
                        waiter = null;
                    }
                    if (waiter != null) {
                        f(this, waiter, channelSegment, i2);
                    }
                    channelSegment.i();
                    return failed;
                }
                if (iJ != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iJ != 4) {
                    if (j3 < Z.get(this)) {
                        channelSegment.a();
                    }
                    return new ChannelResult.Closed(w());
                }
                if (iJ != 5) {
                    channelSegment.a();
                }
            } else {
                ChannelSegment channelSegmentB = b(this, j5, channelSegment);
                if (channelSegmentB != null) {
                    channelSegment = channelSegmentB;
                    iJ = j(this, channelSegment, i2, obj, j3, obj2, zC);
                    unit = Unit.f43263a;
                    if (iJ != 0) {
                        channelSegment.a();
                        return unit;
                    }
                    if (iJ != 1) {
                        return unit;
                    }
                    if (iJ != 2) {
                        if (zC) {
                            channelSegment.i();
                            return new ChannelResult.Closed(w());
                        }
                        if (obj2 instanceof Waiter) {
                            waiter = (Waiter) obj2;
                        } else {
                            waiter = null;
                        }
                        if (waiter != null) {
                            f(this, waiter, channelSegment, i2);
                        }
                        channelSegment.i();
                        return failed;
                    }
                    if (iJ != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iJ != 4) {
                        if (j3 < Z.get(this)) {
                            channelSegment.a();
                        }
                        return new ChannelResult.Closed(w());
                    }
                    if (iJ != 5) {
                        channelSegment.a();
                    }
                } else if (zC) {
                    return new ChannelResult.Closed(w());
                }
            }
            j2 = 1152921504606846975L;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final ChannelIterator iterator() {
        return new BufferedChannelIterator();
    }

    public final boolean k(long j) {
        return j < e0.get(this) || j < Z.get(this) + ((long) this.X);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 l() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.X;
        TypeIntrinsics.d(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.X;
        TypeIntrinsics.d(3, bufferedChannel$onReceive$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, null);
    }

    public void m(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        n(true, cancellationException);
    }

    public final boolean n(boolean z2, Throwable th) {
        BufferedChannel<E> bufferedChannel;
        boolean z3;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f44780Y;
        if (!z2) {
            bufferedChannel = this;
            break;
        }
        do {
            j5 = atomicLongFieldUpdater.get(this);
            if (((int) (j5 >> 60)) != 0) {
                bufferedChannel = this;
                break;
            }
            ChannelSegment channelSegment = BufferedChannelKt.f44785a;
            bufferedChannel = this;
        } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j5, (j5 & 1152921504606846975L) + (((long) 1) << 60)));
        Symbol symbol = BufferedChannelKt.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j4, (((long) 3) << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j >> 60);
                if (i2 == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bufferedChannel, j, (j3 << 60) + j2));
        }
        z();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k0;
                obj = atomicReferenceFieldUpdater2.get(this);
                Symbol symbol2 = obj == null ? BufferedChannelKt.q : BufferedChannelKt.r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                TypeIntrinsics.d(1, obj);
                ((Function1) obj).invoke(s());
                return z3;
            }
        }
        return z3;
    }

    public final ChannelSegment o(long j) {
        Object objA;
        long j2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj = i0.get(this);
        ChannelSegment channelSegment = (ChannelSegment) g0.get(this);
        if (channelSegment.Z > ((ChannelSegment) obj).Z) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) h0.get(this);
        if (channelSegment2.Z > ((ChannelSegment) obj).Z) {
            obj = channelSegment2;
        }
        ConcurrentLinkedListNode concurrentLinkedListNode = (ConcurrentLinkedListNode) obj;
        loop0: while (true) {
            concurrentLinkedListNode.getClass();
            Object obj2 = ConcurrentLinkedListNode.X.get(concurrentLinkedListNode);
            Symbol symbol = ConcurrentLinkedListKt.f45026a;
            objA = null;
            if (obj2 == symbol) {
                break;
            }
            ConcurrentLinkedListNode concurrentLinkedListNode2 = (ConcurrentLinkedListNode) obj2;
            if (concurrentLinkedListNode2 == null) {
                do {
                    atomicReferenceFieldUpdater = ConcurrentLinkedListNode.X;
                    if (atomicReferenceFieldUpdater.compareAndSet(concurrentLinkedListNode, null, symbol)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(concurrentLinkedListNode) == null);
            } else {
                concurrentLinkedListNode = concurrentLinkedListNode2;
            }
        }
        ChannelSegment channelSegment3 = (ChannelSegment) concurrentLinkedListNode;
        if (E()) {
            ChannelSegment channelSegment4 = channelSegment3;
            loop2: while (true) {
                int i2 = BufferedChannelKt.f44786b - 1;
                while (true) {
                    if (-1 < i2) {
                        j2 = (channelSegment4.Z * ((long) BufferedChannelKt.f44786b)) + ((long) i2);
                        if (j2 >= Z.get(this)) {
                            while (true) {
                                Object objL = channelSegment4.l(i2);
                                if (objL != null && objL != BufferedChannelKt.f44788e) {
                                    if (objL != BufferedChannelKt.d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (channelSegment4.k(i2, objL, BufferedChannelKt.f44791l)) {
                                    channelSegment4.i();
                                    break;
                                }
                            }
                            i2--;
                        }
                    } else {
                        channelSegment4 = (ChannelSegment) ((ConcurrentLinkedListNode) ConcurrentLinkedListNode.f45027Y.get(channelSegment4));
                        if (channelSegment4 == null) {
                        }
                    }
                    j2 = -1;
                    break;
                }
            }
            if (j2 != -1) {
                p(j2);
            }
        }
        loop5: for (ChannelSegment channelSegment5 = channelSegment3; channelSegment5 != null; channelSegment5 = (ChannelSegment) ((ConcurrentLinkedListNode) ConcurrentLinkedListNode.f45027Y.get(channelSegment5))) {
            for (int i3 = BufferedChannelKt.f44786b - 1; -1 < i3; i3--) {
                if ((channelSegment5.Z * ((long) BufferedChannelKt.f44786b)) + ((long) i3) < j) {
                    break loop5;
                }
                while (true) {
                    Object objL2 = channelSegment5.l(i3);
                    if (objL2 != null && objL2 != BufferedChannelKt.f44788e) {
                        if (!(objL2 instanceof WaiterEB)) {
                            if (!(objL2 instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment5.k(i3, objL2, BufferedChannelKt.f44791l)) {
                                objA = InlineList.a(objA, objL2);
                                channelSegment5.m(i3, true);
                                break;
                            }
                        } else {
                            if (channelSegment5.k(i3, objL2, BufferedChannelKt.f44791l)) {
                                objA = InlineList.a(objA, ((WaiterEB) objL2).f44839a);
                                channelSegment5.m(i3, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment5.k(i3, objL2, BufferedChannelKt.f44791l)) {
                            channelSegment5.i();
                            break;
                        }
                    }
                }
            }
        }
        if (objA != null) {
            if (!(objA instanceof ArrayList)) {
                L((Waiter) objA, true);
                return channelSegment3;
            }
            ArrayList arrayList = (ArrayList) objA;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                L((Waiter) arrayList.get(size), true);
            }
        }
        return channelSegment3;
    }

    public final void p(long j) {
        ChannelSegment channelSegment = (ChannelSegment) h0.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(((long) this.X) + j2, e0.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, 1 + j2)) {
                long j3 = BufferedChannelKt.f44786b;
                long j4 = j2 / j3;
                int i2 = (int) (j2 % j3);
                if (channelSegment.Z != j4) {
                    ChannelSegment channelSegmentR = r(j4, channelSegment);
                    if (channelSegmentR != null) {
                        channelSegment = channelSegmentR;
                    }
                }
                ChannelSegment channelSegment2 = channelSegment;
                if (P(channelSegment2, i2, j2, null) != BufferedChannelKt.o || j2 < A()) {
                    channelSegment2.a();
                }
                channelSegment = channelSegment2;
            }
        }
    }

    public final void q() {
        Object objA;
        if (F()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i0;
        ChannelSegment channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = e0.getAndIncrement(this);
            long j = andIncrement / ((long) BufferedChannelKt.f44786b);
            if (A() <= andIncrement) {
                if (channelSegment.Z < j && channelSegment.c() != null) {
                    G(j, channelSegment);
                }
                B(this);
                return;
            }
            if (channelSegment.Z != j) {
                BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.X;
                while (true) {
                    objA = ConcurrentLinkedListKt.a(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
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
                ChannelSegment channelSegment2 = null;
                if (SegmentOrClosed.b(objA)) {
                    z();
                    G(j, channelSegment);
                    B(this);
                } else {
                    ChannelSegment channelSegment3 = (ChannelSegment) SegmentOrClosed.a(objA);
                    long j2 = channelSegment3.Z;
                    if (j2 > j) {
                        long j3 = j2 * ((long) BufferedChannelKt.f44786b);
                        if (e0.compareAndSet(this, 1 + andIncrement, j3)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = f0;
                            if ((atomicLongFieldUpdater.addAndGet(this, j3 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            B(this);
                        }
                    } else {
                        channelSegment2 = channelSegment3;
                    }
                }
                if (channelSegment2 == null) {
                    continue;
                } else {
                    channelSegment = channelSegment2;
                }
            }
            int i2 = (int) (andIncrement % ((long) BufferedChannelKt.f44786b));
            Object objL = channelSegment.l(i2);
            boolean z2 = objL instanceof Waiter;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z;
            if (!z2 || andIncrement < atomicLongFieldUpdater2.get(this) || !channelSegment.k(i2, objL, BufferedChannelKt.g)) {
                while (true) {
                    Object objL2 = channelSegment.l(i2);
                    if (objL2 instanceof Waiter) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (channelSegment.k(i2, objL2, new WaiterEB((Waiter) objL2))) {
                                B(this);
                                return;
                            }
                        } else if (channelSegment.k(i2, objL2, BufferedChannelKt.g)) {
                            if (!O(objL2, channelSegment, i2)) {
                                channelSegment.o(i2, BufferedChannelKt.j);
                                channelSegment.i();
                                break;
                            } else {
                                channelSegment.o(i2, BufferedChannelKt.d);
                                B(this);
                                return;
                            }
                        }
                    } else {
                        if (objL2 == BufferedChannelKt.j) {
                            break;
                        }
                        if (objL2 == null) {
                            if (channelSegment.k(i2, objL2, BufferedChannelKt.f44788e)) {
                                B(this);
                                return;
                            }
                        } else if (objL2 == BufferedChannelKt.d || objL2 == BufferedChannelKt.f44789h || objL2 == BufferedChannelKt.f44790i || objL2 == BufferedChannelKt.k || objL2 == BufferedChannelKt.f44791l) {
                            B(this);
                            return;
                        } else if (objL2 != BufferedChannelKt.f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objL2).toString());
                        }
                    }
                }
                B(this);
            } else if (O(objL, channelSegment, i2)) {
                channelSegment.o(i2, BufferedChannelKt.d);
                B(this);
                return;
            } else {
                channelSegment.o(i2, BufferedChannelKt.j);
                channelSegment.i();
                B(this);
            }
        }
    }

    public final ChannelSegment r(long j, ChannelSegment channelSegment) {
        Object objA;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        ChannelSegment channelSegment2 = BufferedChannelKt.f44785a;
        BufferedChannelKt$createSegmentFunction$1 bufferedChannelKt$createSegmentFunction$1 = BufferedChannelKt$createSegmentFunction$1.X;
        loop0: while (true) {
            objA = ConcurrentLinkedListKt.a(channelSegment, j, bufferedChannelKt$createSegmentFunction$1);
            if (!SegmentOrClosed.b(objA)) {
                Segment segmentA = SegmentOrClosed.a(objA);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h0;
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
        if (SegmentOrClosed.b(objA)) {
            z();
            if (channelSegment.Z * ((long) BufferedChannelKt.f44786b) < A()) {
                channelSegment.a();
                return null;
            }
        } else {
            ChannelSegment channelSegment3 = (ChannelSegment) SegmentOrClosed.a(objA);
            boolean zF = F();
            long j3 = channelSegment3.Z;
            if (!zF && j <= e0.get(this) / ((long) BufferedChannelKt.f44786b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = i0;
                    Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                    if (segment2.Z >= j3 || !channelSegment3.j()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment3)) {
                            if (!segment2.f()) {
                                break loop3;
                            }
                            segment2.e();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == segment2);
                    if (channelSegment3.f()) {
                        channelSegment3.e();
                    }
                }
            }
            if (j3 <= j) {
                return channelSegment3;
            }
            long j4 = j3 * ((long) BufferedChannelKt.f44786b);
            do {
                atomicLongFieldUpdater = Z;
                j2 = atomicLongFieldUpdater.get(this);
                if (j2 >= j4) {
                    break;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
            if (j3 * ((long) BufferedChannelKt.f44786b) < A()) {
                channelSegment3.a();
            }
        }
        return null;
    }

    public final Throwable s() {
        return (Throwable) j0.get(this);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new ClosedReceiveChannelException("Channel was closed") : thS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i2 = (int) (f44780Y.get(this) >> 60);
        if (i2 == 2) {
            sb.append("closed,");
        } else if (i2 == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.X + AbstractJsonLexerKt.COMMA);
        sb.append("data=[");
        int i3 = 0;
        boolean z2 = true;
        List listI = CollectionsKt.I(h0.get(this), g0.get(this), i0.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (((ChannelSegment) obj) != BufferedChannelKt.f44785a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).Z;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).Z;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long j3 = Z.get(this);
        long jA = A();
        loop2: while (true) {
            int i4 = BufferedChannelKt.f44786b;
            int i5 = i3;
            while (i5 < i4) {
                long j4 = (channelSegment.Z * ((long) BufferedChannelKt.f44786b)) + ((long) i5);
                if (j4 >= jA && j4 >= j3) {
                    break loop2;
                }
                Object objL = channelSegment.l(i5);
                boolean z3 = z2;
                Object obj2 = channelSegment.g0.get(i5 * 2);
                if (objL instanceof CancellableContinuation) {
                    string = (j4 >= j3 || j4 < jA) ? (j4 >= jA || j4 < j3) ? "cont" : "send" : "receive";
                } else if (objL instanceof SelectInstance) {
                    string = (j4 >= j3 || j4 < jA) ? (j4 >= jA || j4 < j3) ? "select" : "onSend" : "onReceive";
                } else if (objL instanceof ReceiveCatching) {
                    string = "receiveCatching";
                } else if (objL instanceof SendBroadcast) {
                    string = "sendBroadcast";
                } else if (objL instanceof WaiterEB) {
                    string = "EB(" + objL + ')';
                } else if (Intrinsics.a(objL, BufferedChannelKt.f) || Intrinsics.a(objL, BufferedChannelKt.g)) {
                    string = "resuming_sender";
                } else {
                    if (objL != null && !objL.equals(BufferedChannelKt.f44788e) && !objL.equals(BufferedChannelKt.f44790i) && !objL.equals(BufferedChannelKt.f44789h) && !objL.equals(BufferedChannelKt.k) && !objL.equals(BufferedChannelKt.j) && !objL.equals(BufferedChannelKt.f44791l)) {
                        string = objL.toString();
                    }
                    i5++;
                    z2 = z3;
                }
                if (obj2 != null) {
                    sb.append("(" + string + AbstractJsonLexerKt.COMMA + obj2 + "),");
                } else {
                    sb.append(string + AbstractJsonLexerKt.COMMA);
                }
                i5++;
                z2 = z3;
            }
            boolean z4 = z2;
            channelSegment = (ChannelSegment) channelSegment.c();
            if (channelSegment == null) {
                break;
            }
            z2 = z4;
            i3 = 0;
        }
        if (StringsKt.x(sb) == ',') {
            Intrinsics.e(sb.deleteCharAt(sb.length() - 1), "deleteCharAt(...)");
        }
        sb.append(d9.i.f24752e);
        return sb.toString();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final SelectClause1 u() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.X;
        TypeIntrinsics.d(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.X;
        TypeIntrinsics.d(3, bufferedChannel$onReceiveCatching$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final Object v() {
        ChannelSegment channelSegment;
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = f44780Y.get(this);
        if (C(j2, true)) {
            return new ChannelResult.Closed(s());
        }
        long j3 = j2 & 1152921504606846975L;
        ChannelResult.Failed failed = ChannelResult.f44797b;
        if (j >= j3) {
            return failed;
        }
        Object obj = BufferedChannelKt.k;
        ChannelSegment channelSegment2 = (ChannelSegment) h0.get(this);
        while (!D()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = BufferedChannelKt.f44786b;
            long j5 = andIncrement / j4;
            int i2 = (int) (andIncrement % j4);
            if (channelSegment2.Z != j5) {
                ChannelSegment channelSegmentR = r(j5, channelSegment2);
                if (channelSegmentR == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentR;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object objP = P(channelSegment, i2, andIncrement, obj);
            ChannelSegment channelSegment3 = channelSegment;
            if (objP == BufferedChannelKt.m) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    waiter.a(channelSegment3, i2);
                }
                R(andIncrement);
                channelSegment3.i();
                return failed;
            }
            if (objP != BufferedChannelKt.o) {
                if (objP == BufferedChannelKt.f44792n) {
                    throw new IllegalStateException("unexpected");
                }
                channelSegment3.a();
                return objP;
            }
            if (andIncrement < A()) {
                channelSegment3.a();
            }
            channelSegment2 = channelSegment3;
        }
        return new ChannelResult.Closed(s());
    }

    public final Throwable w() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean x(Throwable th) {
        return n(false, th);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0141  */
    /* JADX WARN: Code duplicated, block: B:86:0x0144 A[RETURN] */
    @Override // kotlinx.coroutines.channels.SendChannel
    public Object y(Object obj, Continuation continuation) throws Throwable {
        Unit unit;
        Object objP;
        CoroutineSingletons coroutineSingletons;
        ChannelSegment channelSegmentB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        ChannelSegment channelSegment = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f44780Y;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zC = C(andIncrement, false);
            long j2 = BufferedChannelKt.f44786b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            long j4 = channelSegment.Z;
            unit = Unit.f43263a;
            if (j4 != j3) {
                ChannelSegment channelSegmentB2 = b(this, j3, channelSegment);
                if (channelSegmentB2 != null) {
                    channelSegment = channelSegmentB2;
                } else if (zC) {
                    Object objH = H(obj, continuation);
                    if (objH == CoroutineSingletons.X) {
                        return objH;
                    }
                }
            }
            int iJ = j(this, channelSegment, i2, obj, j, null, zC);
            if (iJ == 0) {
                channelSegment.a();
                return unit;
            }
            int i3 = 1;
            if (iJ != 1) {
                if (iJ == 2) {
                    if (!zC) {
                        break;
                    }
                    channelSegment.i();
                    Object objH2 = H(obj, continuation);
                    if (objH2 == CoroutineSingletons.X) {
                        return objH2;
                    }
                } else {
                    AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z;
                    if (iJ == 3) {
                        CancellableContinuationImpl cancellableContinuationImplB = CancellableContinuationKt.b(IntrinsicsKt.b(continuation));
                        try {
                            int iJ2 = j(this, channelSegment, i2, obj, j, cancellableContinuationImplB, false);
                            if (iJ2 != 0) {
                                if (iJ2 != 1) {
                                    if (iJ2 != 2) {
                                        if (iJ2 != 4) {
                                            String str = "unexpected";
                                            if (iJ2 != 5) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            channelSegment.a();
                                            ChannelSegment channelSegment2 = (ChannelSegment) atomicReferenceFieldUpdater.get(this);
                                            while (true) {
                                                long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(this);
                                                long j5 = andIncrement2 & 1152921504606846975L;
                                                boolean zC2 = C(andIncrement2, false);
                                                long j6 = BufferedChannelKt.f44786b;
                                                str = str;
                                                long j7 = j5 / j6;
                                                int i4 = (int) (j5 % j6);
                                                if (channelSegment2.Z != j7) {
                                                    channelSegmentB = b(this, j7, channelSegment2);
                                                    if (channelSegmentB == null) {
                                                        if (zC2) {
                                                        }
                                                    }
                                                } else {
                                                    channelSegmentB = channelSegment2;
                                                }
                                                int iJ3 = j(this, channelSegmentB, i4, obj, j5, cancellableContinuationImplB, zC2);
                                                if (iJ3 == 0) {
                                                    channelSegmentB.a();
                                                } else if (iJ3 != i3) {
                                                    if (iJ3 == 2) {
                                                        if (!zC2) {
                                                            f(this, cancellableContinuationImplB, channelSegmentB, i4);
                                                            break;
                                                        }
                                                        channelSegmentB.i();
                                                    } else {
                                                        if (iJ3 == 3) {
                                                            throw new IllegalStateException(str);
                                                        }
                                                        if (iJ3 != 4) {
                                                            if (iJ3 == 5) {
                                                                channelSegmentB.a();
                                                            }
                                                            i3 = 1;
                                                            channelSegment2 = channelSegmentB;
                                                        } else if (j5 < atomicLongFieldUpdater2.get(this)) {
                                                            channelSegmentB.a();
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (j < atomicLongFieldUpdater2.get(this)) {
                                            channelSegment.a();
                                        }
                                        c(this, obj, cancellableContinuationImplB);
                                        break;
                                    } else {
                                        f(this, cancellableContinuationImplB, channelSegment, i2);
                                    }
                                }
                                objP = cancellableContinuationImplB.p();
                                coroutineSingletons = CoroutineSingletons.X;
                                if (objP != coroutineSingletons) {
                                    objP = unit;
                                }
                                if (objP == coroutineSingletons) {
                                    return objP;
                                }
                            } else {
                                channelSegment.a();
                            }
                            cancellableContinuationImplB.resumeWith(unit);
                            objP = cancellableContinuationImplB.p();
                            coroutineSingletons = CoroutineSingletons.X;
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
                    } else if (iJ == 4) {
                        if (j < atomicLongFieldUpdater2.get(this)) {
                            channelSegment.a();
                        }
                        Object objH3 = H(obj, continuation);
                        if (objH3 == CoroutineSingletons.X) {
                            return objH3;
                        }
                    } else if (iJ == 5) {
                        channelSegment.a();
                    }
                }
            } else {
                break;
            }
        }
        return unit;
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean z() {
        return C(f44780Y.get(this), false);
    }
}
