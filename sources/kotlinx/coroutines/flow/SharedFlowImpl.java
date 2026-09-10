package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006:\u0001\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/SharedFlowSlot;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Emitter", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public final int f0;
    public final int g0;
    public final BufferOverflow h0;
    public Object[] i0;
    public long j0;
    public long k0;
    public int l0;
    public int m0;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/flow/SharedFlowImpl$Emitter;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Emitter implements DisposableHandle {
        public final SharedFlowImpl X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final long f44970Y;
        public final Object Z;
        public final CancellableContinuationImpl e0;

        public Emitter(SharedFlowImpl sharedFlowImpl, long j, Object obj, CancellableContinuationImpl cancellableContinuationImpl) {
            this.X = sharedFlowImpl;
            this.f44970Y = j;
            this.Z = obj;
            this.e0 = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final void dispose() {
            SharedFlowImpl sharedFlowImpl = this.X;
            synchronized (sharedFlowImpl) {
                if (this.f44970Y < sharedFlowImpl.n()) {
                    return;
                }
                Object[] objArr = sharedFlowImpl.i0;
                Intrinsics.c(objArr);
                long j = this.f44970Y;
                if (objArr[((int) j) & (objArr.length - 1)] != this) {
                    return;
                }
                SharedFlowKt.c(objArr, j, SharedFlowKt.f44972a);
                sharedFlowImpl.i();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                BufferOverflow bufferOverflow = BufferOverflow.X;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                BufferOverflow bufferOverflow2 = BufferOverflow.X;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    final class AnonymousClass1<T> extends ContinuationImpl {
        public SharedFlowImpl X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public FlowCollector f44971Y;
        public SharedFlowSlot Z;
        public Job e0;
        public /* synthetic */ Object f0;
        public int h0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f0 = obj;
            this.h0 |= Integer.MIN_VALUE;
            SharedFlowImpl.j(SharedFlowImpl.this, null, this);
            return CoroutineSingletons.X;
        }
    }

    public SharedFlowImpl(int i2, int i3, BufferOverflow bufferOverflow) {
        this.f0 = i2;
        this.g0 = i3;
        this.h0 = bufferOverflow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void j(SharedFlowImpl sharedFlowImpl, FlowCollector flowCollector, Continuation continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SharedFlowImpl sharedFlowImpl2;
        Throwable th;
        SharedFlowSlot sharedFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.h0 = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.f0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.h0;
        if (i3 != 0) {
            if (i3 == 1) {
                sharedFlowSlot = anonymousClass1.Z;
                FlowCollector flowCollector3 = anonymousClass1.f44971Y;
                SharedFlowImpl sharedFlowImpl3 = anonymousClass1.X;
                try {
                    ResultKt.b(obj);
                    flowCollector2 = flowCollector3;
                    sharedFlowImpl = sharedFlowImpl3;
                    try {
                        job = (Job) anonymousClass1.getF45023Y().get(Job.Key.X);
                    } catch (Throwable th2) {
                        sharedFlowImpl2 = sharedFlowImpl;
                        th = th2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sharedFlowImpl2 = sharedFlowImpl3;
                }
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Job job2 = anonymousClass1.e0;
                sharedFlowSlot = anonymousClass1.Z;
                FlowCollector flowCollector4 = anonymousClass1.f44971Y;
                sharedFlowImpl2 = anonymousClass1.X;
                try {
                    ResultKt.b(obj);
                    flowCollector2 = flowCollector4;
                    job = job2;
                    sharedFlowImpl = sharedFlowImpl2;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            sharedFlowImpl2.g(sharedFlowSlot);
            throw th;
        }
        ResultKt.b(obj);
        SharedFlowSlot sharedFlowSlot2 = (SharedFlowSlot) sharedFlowImpl.c();
        try {
            if (flowCollector instanceof SubscribedFlowCollector) {
                anonymousClass1.X = sharedFlowImpl;
                anonymousClass1.f44971Y = flowCollector;
                anonymousClass1.Z = sharedFlowSlot2;
                anonymousClass1.h0 = 1;
                if (((SubscribedFlowCollector) flowCollector).b(anonymousClass1) == coroutineSingletons) {
                    return;
                }
            }
            flowCollector2 = flowCollector;
            sharedFlowSlot = sharedFlowSlot2;
            job = (Job) anonymousClass1.getF45023Y().get(Job.Key.X);
        } catch (Throwable th5) {
            sharedFlowImpl2 = sharedFlowImpl;
            th = th5;
            sharedFlowSlot = sharedFlowSlot2;
        }
        while (true) {
            Object objR = sharedFlowImpl.r(sharedFlowSlot);
            if (objR == SharedFlowKt.f44972a) {
                anonymousClass1.X = sharedFlowImpl;
                anonymousClass1.f44971Y = flowCollector2;
                anonymousClass1.Z = sharedFlowSlot;
                anonymousClass1.e0 = job;
                anonymousClass1.h0 = 2;
                if (sharedFlowImpl.h(sharedFlowSlot, anonymousClass1) == coroutineSingletons) {
                    return;
                }
            } else {
                if (job != null && !job.isActive()) {
                    throw job.p();
                }
                anonymousClass1.X = sharedFlowImpl;
                anonymousClass1.f44971Y = flowCollector2;
                anonymousClass1.Z = sharedFlowSlot;
                anonymousClass1.e0 = job;
                anonymousClass1.h0 = 3;
                if (flowCollector2.emit(objR, anonymousClass1) == coroutineSingletons) {
                    return;
                }
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean a(Object obj) {
        int i2;
        boolean z2;
        Continuation[] continuationArrM = AbstractSharedFlowKt.f44994a;
        synchronized (this) {
            if (p(obj)) {
                continuationArrM = m(continuationArrM);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Continuation continuation : continuationArrM) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f43263a);
            }
        }
        return z2;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return SharedFlowKt.d(this, coroutineContext, i2, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) throws Throwable {
        j(this, flowCollector, continuation);
        return CoroutineSingletons.X;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot e() {
        SharedFlowSlot sharedFlowSlot = new SharedFlowSlot();
        sharedFlowSlot.f44973a = -1L;
        return sharedFlowSlot;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        Throwable th;
        Continuation[] continuationArrM;
        Emitter emitter;
        if (a(obj)) {
            return Unit.f43263a;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        Continuation[] continuationArrM2 = AbstractSharedFlowKt.f44994a;
        synchronized (this) {
            try {
                if (p(obj)) {
                    try {
                        cancellableContinuationImpl.resumeWith(Unit.f43263a);
                        continuationArrM = m(continuationArrM2);
                        emitter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        Emitter emitter2 = new Emitter(this, n() + ((long) (this.l0 + this.m0)), obj, cancellableContinuationImpl);
                        l(emitter2);
                        this.m0++;
                        if (this.g0 == 0) {
                            continuationArrM2 = m(continuationArrM2);
                        }
                        continuationArrM = continuationArrM2;
                        emitter = emitter2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.a(cancellableContinuationImpl, emitter);
                }
                for (Continuation continuation2 : continuationArrM) {
                    if (continuation2 != null) {
                        continuation2.resumeWith(Unit.f43263a);
                    }
                }
                Object objP = cancellableContinuationImpl.p();
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (objP != coroutineSingletons) {
                    objP = Unit.f43263a;
                }
                return objP == coroutineSingletons ? objP : Unit.f43263a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] f() {
        return new SharedFlowSlot[2];
    }

    public final Object h(SharedFlowSlot sharedFlowSlot, Continuation continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuation));
        cancellableContinuationImpl.q();
        synchronized (this) {
            if (q(sharedFlowSlot) < 0) {
                sharedFlowSlot.f44974b = cancellableContinuationImpl;
            } else {
                cancellableContinuationImpl.resumeWith(Unit.f43263a);
            }
        }
        Object objP = cancellableContinuationImpl.p();
        return objP == CoroutineSingletons.X ? objP : Unit.f43263a;
    }

    public final void i() {
        if (this.g0 != 0 || this.m0 > 1) {
            Object[] objArr = this.i0;
            Intrinsics.c(objArr);
            while (this.m0 > 0) {
                long jN = n();
                int i2 = this.l0;
                int i3 = this.m0;
                if (objArr[((int) ((jN + ((long) (i2 + i3))) - 1)) & (objArr.length - 1)] != SharedFlowKt.f44972a) {
                    return;
                }
                this.m0 = i3 - 1;
                SharedFlowKt.c(objArr, n() + ((long) (this.l0 + this.m0)), null);
            }
        }
    }

    public final void k() {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Object[] objArr = this.i0;
        Intrinsics.c(objArr);
        SharedFlowKt.c(objArr, n(), null);
        this.l0--;
        long jN = n() + 1;
        if (this.j0 < jN) {
            this.j0 = jN;
        }
        if (this.k0 < jN) {
            if (this.f44993Y != 0 && (abstractSharedFlowSlotArr = this.X) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                        long j = sharedFlowSlot.f44973a;
                        if (j >= 0 && j < jN) {
                            sharedFlowSlot.f44973a = jN;
                        }
                    }
                }
            }
            this.k0 = jN;
        }
    }

    public final void l(Object obj) {
        int i2 = this.l0 + this.m0;
        Object[] objArrO = this.i0;
        if (objArrO == null) {
            objArrO = o(null, 0, 2);
        } else if (i2 >= objArrO.length) {
            objArrO = o(objArrO, i2, objArrO.length * 2);
        }
        SharedFlowKt.c(objArrO, n() + ((long) i2), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final Continuation[] m(Continuation[] continuationArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        CancellableContinuationImpl cancellableContinuationImpl;
        int length = continuationArr.length;
        if (this.f44993Y != 0 && (abstractSharedFlowSlotArr = this.X) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i2 = 0;
            while (i2 < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i2];
                if (abstractSharedFlowSlot == null || (cancellableContinuationImpl = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).f44974b) == null || q(sharedFlowSlot) < 0) {
                    continuationArr = continuationArr;
                } else {
                    if (length >= continuationArr.length) {
                        continuationArr = continuationArr;
                        continuationArr = continuationArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.e(objArrCopyOf, "copyOf(...)");
                        continuationArr = objArrCopyOf;
                    }
                    continuationArr = continuationArr;
                    continuationArr = continuationArr;
                    ((Continuation[]) continuationArr)[length] = cancellableContinuationImpl;
                    sharedFlowSlot.f44974b = null;
                    length++;
                }
                i2++;
                continuationArr = continuationArr;
            }
            continuationArr = continuationArr;
        }
        return (Continuation[]) continuationArr;
    }

    public final long n() {
        return Math.min(this.k0, this.j0);
    }

    public final Object[] o(Object[] objArr, int i2, int i3) {
        if (i3 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i3];
        this.i0 = objArr2;
        if (objArr != null) {
            long jN = n();
            for (int i4 = 0; i4 < i2; i4++) {
                long j = ((long) i4) + jN;
                SharedFlowKt.c(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
            }
        }
        return objArr2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    public final boolean p(Object obj) {
        int i2;
        long jN;
        long j;
        int i3 = this.f44993Y;
        int i4 = this.f0;
        if (i3 != 0) {
            int i5 = this.l0;
            int i6 = this.g0;
            if (i5 < i6 || this.k0 > this.j0) {
                l(obj);
                i2 = this.l0 + 1;
                this.l0 = i2;
                if (i2 > i6) {
                    k();
                }
                jN = n() + ((long) this.l0);
                j = this.j0;
                if (((int) (jN - j)) > i4) {
                    s(1 + j, this.k0, n() + ((long) this.l0), n() + ((long) this.l0) + ((long) this.m0));
                }
            } else {
                int iOrdinal = this.h0.ordinal();
                if (iOrdinal == 0) {
                    return false;
                }
                if (iOrdinal == 1) {
                    l(obj);
                    i2 = this.l0 + 1;
                    this.l0 = i2;
                    if (i2 > i6) {
                        k();
                    }
                    jN = n() + ((long) this.l0);
                    j = this.j0;
                    if (((int) (jN - j)) > i4) {
                        s(1 + j, this.k0, n() + ((long) this.l0), n() + ((long) this.l0) + ((long) this.m0));
                    }
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        } else if (i4 != 0) {
            l(obj);
            int i7 = this.l0 + 1;
            this.l0 = i7;
            if (i7 > i4) {
                k();
            }
            this.k0 = n() + ((long) this.l0);
            return true;
        }
        return true;
    }

    public final long q(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.f44973a;
        if (j < n() + ((long) this.l0)) {
            return j;
        }
        if (this.g0 <= 0 && j <= n() && this.m0 != 0) {
            return j;
        }
        return -1L;
    }

    public final Object r(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        Continuation[] continuationArrT = AbstractSharedFlowKt.f44994a;
        synchronized (this) {
            try {
                long jQ = q(sharedFlowSlot);
                if (jQ < 0) {
                    obj = SharedFlowKt.f44972a;
                } else {
                    long j = sharedFlowSlot.f44973a;
                    Object[] objArr = this.i0;
                    Intrinsics.c(objArr);
                    Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof Emitter) {
                        obj2 = ((Emitter) obj2).Z;
                    }
                    sharedFlowSlot.f44973a = jQ + 1;
                    Object obj3 = obj2;
                    continuationArrT = t(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Continuation continuation : continuationArrT) {
            if (continuation != null) {
                continuation.resumeWith(Unit.f43263a);
            }
        }
        return obj;
    }

    public final void s(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jN = n(); jN < jMin; jN++) {
            Object[] objArr = this.i0;
            Intrinsics.c(objArr);
            SharedFlowKt.c(objArr, jN, null);
        }
        this.j0 = j;
        this.k0 = j2;
        this.l0 = (int) (j3 - jMin);
        this.m0 = (int) (j4 - j3);
    }

    public final Continuation[] t(long j) {
        long j2;
        long j3;
        long j4;
        Continuation[] continuationArr;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        long j5 = this.k0;
        Continuation[] continuationArr2 = AbstractSharedFlowKt.f44994a;
        if (j <= j5) {
            long jN = n();
            long j6 = ((long) this.l0) + jN;
            int i2 = this.g0;
            if (i2 == 0 && this.m0 > 0) {
                j6++;
            }
            int i3 = 0;
            if (this.f44993Y != 0 && (abstractSharedFlowSlotArr = this.X) != null) {
                for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                    if (abstractSharedFlowSlot != null) {
                        long j7 = ((SharedFlowSlot) abstractSharedFlowSlot).f44973a;
                        if (j7 >= 0 && j7 < j6) {
                            j6 = j7;
                        }
                    }
                }
            }
            if (j6 > this.k0) {
                long jN2 = n() + ((long) this.l0);
                int iMin = this.f44993Y > 0 ? Math.min(this.m0, i2 - ((int) (jN2 - j6))) : this.m0;
                long j8 = ((long) this.m0) + jN2;
                Symbol symbol = SharedFlowKt.f44972a;
                if (iMin > 0) {
                    Continuation[] continuationArr3 = new Continuation[iMin];
                    j4 = 1;
                    Object[] objArr = this.i0;
                    Intrinsics.c(objArr);
                    long j9 = jN2;
                    while (true) {
                        if (jN2 >= j8) {
                            j2 = jN;
                            j3 = j6;
                            break;
                        }
                        j2 = jN;
                        Object obj = objArr[((int) jN2) & (objArr.length - 1)];
                        if (obj != symbol) {
                            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                            Emitter emitter = (Emitter) obj;
                            int i4 = i3 + 1;
                            j3 = j6;
                            continuationArr3[i3] = emitter.e0;
                            SharedFlowKt.c(objArr, jN2, symbol);
                            SharedFlowKt.c(objArr, j9, emitter.Z);
                            j9++;
                            if (i4 >= iMin) {
                                break;
                            }
                            i3 = i4;
                        } else {
                            j3 = j6;
                        }
                        jN2++;
                        jN = j2;
                        j6 = j3;
                    }
                    jN2 = j9;
                    continuationArr = continuationArr3;
                } else {
                    j2 = jN;
                    j3 = j6;
                    j4 = 1;
                    continuationArr = continuationArr2;
                }
                int i5 = (int) (jN2 - j2);
                long j10 = this.f44993Y == 0 ? jN2 : j3;
                long jMax = Math.max(this.j0, jN2 - ((long) Math.min(this.f0, i5)));
                if (i2 == 0 && jMax < j8) {
                    Object[] objArr2 = this.i0;
                    Intrinsics.c(objArr2);
                    if (Intrinsics.a(objArr2[((int) jMax) & (objArr2.length - 1)], symbol)) {
                        jN2 += j4;
                        jMax += j4;
                    }
                }
                s(jMax, j10, jN2, j8);
                i();
                return continuationArr.length == 0 ? continuationArr : m(continuationArr);
            }
        }
        return continuationArr2;
    }
}
