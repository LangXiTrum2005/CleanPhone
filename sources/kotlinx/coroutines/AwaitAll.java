package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u0005\u0006R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Lkotlinx/atomicfu/AtomicInt;", "notCompletedCount", "DisposeHandlersOnCancel", "AwaitAllNode", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class AwaitAll<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f44736b = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Deferred[] f44737a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001R\u001d\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "_disposer", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class AwaitAllNode extends JobNode {
        public static final /* synthetic */ AtomicReferenceFieldUpdater i0 = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        public final CancellableContinuationImpl f0;
        public DisposableHandle g0;

        public AwaitAllNode(CancellableContinuationImpl cancellableContinuationImpl) {
            this.f0 = cancellableContinuationImpl;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            CancellableContinuationImpl cancellableContinuationImpl = this.f0;
            if (th != null) {
                cancellableContinuationImpl.getClass();
                Symbol symbolD = cancellableContinuationImpl.D(new CompletedExceptionally(false, th), null);
                if (symbolD != null) {
                    cancellableContinuationImpl.A(symbolD);
                    DisposeHandlersOnCancel disposeHandlersOnCancel = (DisposeHandlersOnCancel) i0.get(this);
                    if (disposeHandlersOnCancel != null) {
                        disposeHandlersOnCancel.a();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = AwaitAll.f44736b;
            AwaitAll awaitAll = AwaitAll.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(awaitAll) == 0) {
                Deferred[] deferredArr = awaitAll.f44737a;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.k());
                }
                cancellableContinuationImpl.resumeWith(arrayList);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class DisposeHandlersOnCancel implements CancelHandler {
        public final AwaitAllNode[] X;

        public DisposeHandlersOnCancel(AwaitAllNode[] awaitAllNodeArr) {
            this.X = awaitAllNodeArr;
        }

        public final void a() {
            for (AwaitAllNode awaitAllNode : this.X) {
                DisposableHandle disposableHandle = awaitAllNode.g0;
                if (disposableHandle == null) {
                    Intrinsics.m("handle");
                    throw null;
                }
                disposableHandle.dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public final void b(Throwable th) {
            a();
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.X + AbstractJsonLexerKt.END_LIST;
        }
    }

    public AwaitAll(Deferred[] deferredArr) {
        this.f44737a = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    public final Object a(ContinuationImpl continuationImpl) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.q();
        Deferred[] deferredArr = this.f44737a;
        int length = deferredArr.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i2 = 0; i2 < length; i2++) {
            Deferred deferred = deferredArr[i2];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.g0 = JobKt.c(deferred, true, awaitAllNode);
            awaitAllNodeArr[i2] = awaitAllNode;
        }
        DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i3 = 0; i3 < length; i3++) {
            AwaitAllNode awaitAllNode2 = awaitAllNodeArr[i3];
            awaitAllNode2.getClass();
            AwaitAllNode.i0.set(awaitAllNode2, disposeHandlersOnCancel);
        }
        if (CancellableContinuationImpl.h0.get(cancellableContinuationImpl) instanceof NotCompleted) {
            cancellableContinuationImpl.t(disposeHandlersOnCancel);
        } else {
            disposeHandlersOnCancel.a();
        }
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }
}
