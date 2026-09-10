package kotlinx.coroutines.stream;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/stream/StreamFlow;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/atomicfu/AtomicBoolean;", "consumed", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class StreamFlow<T> implements Flow<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater X = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", l = {22}, m = "collect")
    final class AnonymousClass1 extends ContinuationImpl {
        public FlowCollector X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Iterator f45101Y;
        public /* synthetic */ Object Z;
        public int f0;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.Z = obj;
            this.f0 |= Integer.MIN_VALUE;
            StreamFlow.this.collect(null, this);
            return CoroutineSingletons.X;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        StreamFlow<T> streamFlow;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = anonymousClass1.f0;
        if (i3 == 0) {
            ResultKt.b(obj);
            if (!X.compareAndSet(this, 0, 1)) {
                throw new IllegalStateException("Stream.consumeAsFlow can be collected only once");
            }
            try {
                throw null;
            } catch (Throwable unused) {
                streamFlow = this;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it = anonymousClass1.f45101Y;
            FlowCollector flowCollector2 = anonymousClass1.X;
            try {
                ResultKt.b(obj);
                while (it.hasNext()) {
                    Object next = it.next();
                    anonymousClass1.X = flowCollector2;
                    anonymousClass1.f45101Y = it;
                    anonymousClass1.f0 = 1;
                    if (flowCollector2.emit(next, anonymousClass1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                throw null;
            } catch (Throwable unused2) {
                streamFlow = null;
            }
        }
        streamFlow.getClass();
        throw null;
    }
}
