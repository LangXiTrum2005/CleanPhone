package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\b\u0012\u0004\u0012\u00028\u00000\u0006R\u0011\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int f0;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    final class AnonymousClass1 extends ContinuationImpl {
        public Object X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public FlowCollector f44985Y;
        public Object Z;
        public Job e0;
        public Object f0;
        public /* synthetic */ Object g0;
        public int i0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.g0 = obj;
            this.i0 |= Integer.MIN_VALUE;
            StateFlowImpl.this.collect(null, this);
            return CoroutineSingletons.X;
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public final boolean a(Object obj) {
        setValue(obj);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public final Flow b(CoroutineContext coroutineContext, int i2, BufferOverflow bufferOverflow) {
        return (((i2 < 0 || i2 >= 2) && i2 != -2) || bufferOverflow != BufferOverflow.f44779Y) ? SharedFlowKt.d(this, coroutineContext, i2, bufferOverflow) : this;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x010f A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003d, B:37:0x00a5, B:39:0x00ad, B:42:0x00b4, B:43:0x00b8, B:45:0x00bb, B:55:0x00dc, B:58:0x00ec, B:59:0x0106, B:65:0x0118, B:62:0x010f, B:64:0x0115, B:47:0x00c1, B:51:0x00c8, B:21:0x005a, B:24:0x006b, B:36:0x0096), top: B:72:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0115 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:59:0x0106->B:79:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00eb -> B:37:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.Flow
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r17, kotlin.coroutines.Continuation r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final boolean compareAndSet(Object obj, Object obj2) {
        Symbol symbol = NullSurrogateKt.f45018a;
        if (obj == null) {
            obj = symbol;
        }
        if (obj2 == null) {
            obj2 = symbol;
        }
        return h(obj, obj2);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot e() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        setValue(obj);
        return Unit.f43263a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public final AbstractSharedFlowSlot[] f() {
        return new StateFlowSlot[2];
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public final Object getValue() {
        Symbol symbol = NullSurrogateKt.f45018a;
        Object obj = g0.get(this);
        if (obj == symbol) {
            return null;
        }
        return obj;
    }

    public final boolean h(Object obj, Object obj2) {
        int i2;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        Symbol symbol;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i3 = this.f0;
            if ((i3 & 1) != 0) {
                this.f0 = i3 + 2;
                return true;
            }
            int i4 = i3 + 1;
            this.f0 = i4;
            AbstractSharedFlowSlot[] abstractSharedFlowSlotArr2 = this.X;
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = (StateFlowSlot[]) abstractSharedFlowSlotArr2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            AtomicReference atomicReference = stateFlowSlot.f44988a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 == null || obj4 == (symbol = StateFlowKt.f44987b)) {
                                    break;
                                }
                                Symbol symbol2 = StateFlowKt.f44986a;
                                if (obj4 != symbol2) {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, symbol2)) {
                                            ((CancellableContinuationImpl) obj4).resumeWith(Unit.f43263a);
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                } else {
                                    do {
                                        if (atomicReference.compareAndSet(obj4, symbol)) {
                                            break;
                                        }
                                    } while (atomicReference.get() == obj4);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i2 = this.f0;
                    if (i2 == i4) {
                        this.f0 = i4 + 1;
                        return true;
                    }
                    abstractSharedFlowSlotArr = this.X;
                }
                abstractSharedFlowSlotArr2 = abstractSharedFlowSlotArr;
                i4 = i2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public final void setValue(Object obj) {
        if (obj == null) {
            obj = NullSurrogateKt.f45018a;
        }
        h(null, obj);
    }
}
