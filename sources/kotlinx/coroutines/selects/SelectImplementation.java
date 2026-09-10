package kotlinx.coroutines.selects;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancelHandler;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001\bR\u0011\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", "Lkotlinx/atomicfu/AtomicRef;", "", "state", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class SelectImplementation<R> implements CancelHandler, SelectBuilder<R>, SelectInstanceInternal<R> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g0 = AtomicReferenceFieldUpdater.newUpdater(SelectImplementation.class, Object.class, "state$volatile");
    public final CoroutineContext X;
    public Object Z;
    private volatile /* synthetic */ Object state$volatile = SelectKt.f45096b;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ArrayList f45086Y = new ArrayList(2);
    public int e0 = -1;
    public Object f0 = SelectKt.f45098e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class ClauseData {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f45087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function3 f45088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function3 f45089c;
        public final Symbol d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Function f45090e;
        public final Function3 f;
        public Object g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f45091h = -1;

        public ClauseData(Object obj, Function3 function3, Function3 function4, Symbol symbol, Function function, Function3 function5) {
            this.f45087a = obj;
            this.f45088b = function3;
            this.f45089c = function4;
            this.d = symbol;
            this.f45090e = function;
            this.f = function5;
        }

        public final void a() {
            Object obj = this.g;
            if (obj instanceof Segment) {
                ((Segment) obj).h(this.f45091h, SelectImplementation.this.X);
                return;
            }
            DisposableHandle disposableHandle = obj instanceof DisposableHandle ? (DisposableHandle) obj : null;
            if (disposableHandle != null) {
                disposableHandle.dispose();
            }
        }
    }

    public SelectImplementation(CoroutineContext coroutineContext) {
        this.X = coroutineContext;
    }

    @Override // kotlinx.coroutines.Waiter
    public final void a(Segment segment, int i2) {
        this.Z = segment;
        this.e0 = i2;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public final void b(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == SelectKt.f45097c) {
                return;
            }
            Symbol symbol = SelectKt.d;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                    ArrayList arrayList = this.f45086Y;
                    if (arrayList == null) {
                        return;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ClauseData) it.next()).a();
                    }
                    this.f0 = SelectKt.f45098e;
                    this.f45086Y = null;
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void c(Object obj) {
        this.f0 = obj;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final void d(DisposableHandle disposableHandle) {
        this.Z = disposableHandle;
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public final boolean e(Object obj, Object obj2) {
        return l(obj, obj2) == 0;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        Object obj = atomicReferenceFieldUpdater.get(this);
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        ClauseData clauseData = (ClauseData) obj;
        Object obj2 = this.f0;
        ArrayList<ClauseData> arrayList = this.f45086Y;
        if (arrayList != null) {
            for (ClauseData clauseData2 : arrayList) {
                if (clauseData2 != clauseData) {
                    clauseData2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, SelectKt.f45097c);
            this.f0 = SelectKt.f45098e;
            this.f45086Y = null;
        }
        Object objInvoke = clauseData.f45089c.invoke(clauseData.f45087a, clauseData.d, obj2);
        clauseData.getClass();
        Symbol symbol = SelectKt.f;
        Function function = clauseData.f45090e;
        return clauseData.d == symbol ? ((Function1) function).invoke(continuationImpl) : ((Function2) function).invoke(objInvoke, continuationImpl);
    }

    public Object g(Continuation continuation) {
        return g0.get(this) instanceof ClauseData ? f((ContinuationImpl) continuation) : h((ContinuationImpl) continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(ContinuationImpl continuationImpl) throws Throwable {
        SelectImplementation$doSelectSuspend$1 selectImplementation$doSelectSuspend$1;
        Object obj;
        SelectImplementation<R> selectImplementation;
        if (continuationImpl instanceof SelectImplementation$doSelectSuspend$1) {
            selectImplementation$doSelectSuspend$1 = (SelectImplementation$doSelectSuspend$1) continuationImpl;
            int i2 = selectImplementation$doSelectSuspend$1.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                selectImplementation$doSelectSuspend$1.e0 = i2 - Integer.MIN_VALUE;
            } else {
                selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
            }
        } else {
            selectImplementation$doSelectSuspend$1 = new SelectImplementation$doSelectSuspend$1(this, continuationImpl);
        }
        Object obj2 = selectImplementation$doSelectSuspend$1.f45093Y;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = selectImplementation$doSelectSuspend$1.e0;
        if (i3 == 0) {
            ResultKt.b(obj2);
            selectImplementation$doSelectSuspend$1.X = this;
            selectImplementation$doSelectSuspend$1.e0 = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(selectImplementation$doSelectSuspend$1));
            cancellableContinuationImpl.q();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
                Object obj3 = atomicReferenceFieldUpdater.get(this);
                Symbol symbol = SelectKt.f45096b;
                obj = Unit.f43263a;
                if (obj3 == symbol) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, cancellableContinuationImpl)) {
                            cancellableContinuationImpl.t(this);
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                } else {
                    if (!(obj3 instanceof List)) {
                        if (!(obj3 instanceof ClauseData)) {
                            throw new IllegalStateException(("unexpected state: " + obj3).toString());
                        }
                        ClauseData clauseData = (ClauseData) obj3;
                        Object obj4 = this.f0;
                        Function3 function3 = clauseData.f;
                        cancellableContinuationImpl.w(obj, function3 != null ? (Function3) function3.invoke(this, clauseData.d, obj4) : null);
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, symbol)) {
                            Iterator it = ((Iterable) obj3).iterator();
                            while (it.hasNext()) {
                                ClauseData clauseDataI = i(it.next());
                                Intrinsics.c(clauseDataI);
                                clauseDataI.g = null;
                                clauseDataI.f45091h = -1;
                                k(clauseDataI, true);
                            }
                            break;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj3);
                }
            }
            Object objP = cancellableContinuationImpl.p();
            if (objP == CoroutineSingletons.X) {
                obj = objP;
            }
            if (obj != coroutineSingletons) {
                selectImplementation = this;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj2);
            return obj2;
        }
        selectImplementation = selectImplementation$doSelectSuspend$1.X;
        ResultKt.b(obj2);
        selectImplementation$doSelectSuspend$1.X = null;
        selectImplementation$doSelectSuspend$1.e0 = 2;
        Object objF = selectImplementation.f(selectImplementation$doSelectSuspend$1);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }

    public final ClauseData i(Object obj) {
        ArrayList arrayList = this.f45086Y;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            if (((ClauseData) obj3).f45087a == obj) {
                obj2 = obj3;
                break;
            }
        }
        ClauseData clauseData = (ClauseData) obj2;
        if (clauseData != null) {
            return clauseData;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public void j(SelectClause1 selectClause1, Function2 function2) {
        k(new ClauseData(selectClause1.getF45077a(), selectClause1.getF45078b(), selectClause1.getF45079c(), null, function2, selectClause1.b()), false);
    }

    public final void k(ClauseData clauseData, boolean z2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
        if (atomicReferenceFieldUpdater.get(this) instanceof ClauseData) {
            return;
        }
        Object obj = clauseData.f45087a;
        if (!z2) {
            ArrayList arrayList = this.f45086Y;
            Intrinsics.c(arrayList);
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((ClauseData) it.next()).f45087a == obj) {
                        throw new IllegalStateException(("Cannot use select clauses on the same object: " + obj).toString());
                    }
                }
            }
        }
        clauseData.f45088b.invoke(obj, this, clauseData.d);
        if (this.f0 != SelectKt.f45098e) {
            atomicReferenceFieldUpdater.set(this, clauseData);
            return;
        }
        if (!z2) {
            ArrayList arrayList2 = this.f45086Y;
            Intrinsics.c(arrayList2);
            arrayList2.add(clauseData);
        }
        clauseData.g = this.Z;
        clauseData.f45091h = this.e0;
        this.Z = null;
        this.e0 = -1;
    }

    public final int l(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g0;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof CancellableContinuation)) {
                if (Intrinsics.a(obj3, SelectKt.f45097c) || (obj3 instanceof ClauseData)) {
                    return 3;
                }
                if (Intrinsics.a(obj3, SelectKt.d)) {
                    return 2;
                }
                if (Intrinsics.a(obj3, SelectKt.f45096b)) {
                    List listH = CollectionsKt.H(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listH)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListP = CollectionsKt.P(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListP)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                    }
                }
                return 1;
            }
            ClauseData clauseDataI = i(obj);
            if (clauseDataI != null) {
                Function3 function3 = clauseDataI.f;
                Function3 function4 = function3 != null ? (Function3) function3.invoke(this, clauseDataI.d, obj2) : null;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj3, clauseDataI)) {
                        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj3;
                        this.f0 = obj2;
                        Function3 function5 = SelectKt.f45095a;
                        Symbol symbolC = cancellableContinuation.c(Unit.f43263a, function4);
                        if (symbolC == null) {
                            this.f0 = SelectKt.f45098e;
                            return 2;
                        }
                        cancellableContinuation.A(symbolC);
                        return 0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj3);
            } else {
                continue;
            }
        }
    }
}
