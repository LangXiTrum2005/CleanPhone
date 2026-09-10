package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0005\t\n\u000b\f\rR\u0013\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00048\u0002X\u0082\u0004¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", "Lkotlinx/atomicfu/AtomicRef;", "", "_state", "Lkotlinx/coroutines/ChildHandle;", "_parentHandle", "SelectOnJoinCompletionHandler", "Finishing", "ChildCompletion", "AwaitContinuation", "SelectOnAwaitCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class JobSupport implements Job, ChildJob, ParentJob {
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f44760Y = AtomicReferenceFieldUpdater.newUpdater(JobSupport.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/JobSupport$AwaitContinuation;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/CancellableContinuationImpl;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AwaitContinuation<T> extends CancellableContinuationImpl<T> {
        public final JobSupport j0;

        public AwaitContinuation(Continuation continuation, JobSupport jobSupport) {
            super(1, continuation);
            this.j0 = jobSupport;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final Throwable o(JobSupport jobSupport) {
            Throwable thC;
            JobSupport jobSupport2 = this.j0;
            jobSupport2.getClass();
            Object obj = JobSupport.X.get(jobSupport2);
            if (!(obj instanceof Finishing) || (thC = ((Finishing) obj).c()) == null) {
                return obj instanceof CompletedExceptionally ? ((CompletedExceptionally) obj).f44747a : jobSupport.p();
            }
            return thC;
        }

        @Override // kotlinx.coroutines.CancellableContinuationImpl
        public final String x() {
            return "AwaitContinuation";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/JobSupport$ChildCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ChildCompletion extends JobNode {
        public final JobSupport f0;
        public final Finishing g0;
        public final ChildHandleNode h0;
        public final Object i0;

        public ChildCompletion(JobSupport jobSupport, Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
            this.f0 = jobSupport;
            this.g0 = finishing;
            this.h0 = childHandleNode;
            this.i0 = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.X;
            ChildHandleNode childHandleNode = this.h0;
            JobSupport jobSupport = this.f0;
            jobSupport.getClass();
            ChildHandleNode childHandleNodeE0 = JobSupport.e0(childHandleNode);
            Finishing finishing = this.g0;
            Object obj = this.i0;
            if (childHandleNodeE0 == null || !jobSupport.p0(finishing, childHandleNodeE0, obj)) {
                finishing.X.d(2);
                ChildHandleNode childHandleNodeE1 = JobSupport.e0(childHandleNode);
                if (childHandleNodeE1 == null || !jobSupport.p0(finishing, childHandleNodeE1, obj)) {
                    jobSupport.B(jobSupport.Q(finishing, obj));
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003R\u000b\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004R\u0013\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004R\u0013\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002X\u0082\u0004¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/Incomplete;", "Lkotlinx/atomicfu/AtomicBoolean;", "_isCompleting", "Lkotlinx/atomicfu/AtomicRef;", "", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Finishing implements Incomplete {

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f44761Y = AtomicIntegerFieldUpdater.newUpdater(Finishing.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater Z = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater e0 = AtomicReferenceFieldUpdater.newUpdater(Finishing.class, Object.class, "_exceptionsHolder$volatile");
        public final NodeList X;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        public Finishing(NodeList nodeList, Throwable th) {
            this.X = nodeList;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable thC = c();
            if (thC == null) {
                Z.set(this, th);
                return;
            }
            if (th == thC) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Override // kotlinx.coroutines.Incomplete
        /* JADX INFO: renamed from: b, reason: from getter */
        public final NodeList getX() {
            return this.X;
        }

        public final Throwable c() {
            return (Throwable) Z.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final ArrayList e(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e0;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable thC = c();
            if (thC != null) {
                arrayList.add(0, thC);
            }
            if (th != null && !th.equals(thC)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, JobSupportKt.f44766e);
            return arrayList;
        }

        @Override // kotlinx.coroutines.Incomplete
        /* JADX INFO: renamed from: isActive */
        public final boolean getX() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(d());
            sb.append(", completing=");
            sb.append(f44761Y.get(this) != 0);
            sb.append(", rootCause=");
            sb.append(c());
            sb.append(", exceptions=");
            sb.append(e0.get(this));
            sb.append(", list=");
            sb.append(this.X);
            sb.append(AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnAwaitCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectOnAwaitCompletionHandler extends JobNode {
        public final SelectInstance f0;

        public SelectOnAwaitCompletionHandler(SelectInstance selectInstance) {
            this.f0 = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            JobSupport jobSupport = JobSupport.this;
            jobSupport.getClass();
            Object objA = JobSupport.X.get(jobSupport);
            if (!(objA instanceof CompletedExceptionally)) {
                objA = JobSupportKt.a(objA);
            }
            this.f0.e(jobSupport, objA);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/JobSupport$SelectOnJoinCompletionHandler;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SelectOnJoinCompletionHandler extends JobNode {
        public final SelectInstance f0;

        public SelectOnJoinCompletionHandler(SelectInstance selectInstance) {
            this.f0 = selectInstance;
        }

        @Override // kotlinx.coroutines.JobNode
        public final boolean k() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void l(Throwable th) {
            this.f0.e(JobSupport.this, Unit.f43263a);
        }
    }

    public JobSupport(boolean z2) {
        this._state$volatile = z2 ? JobSupportKt.g : JobSupportKt.f;
    }

    public static ChildHandleNode e0(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.h()) {
            LockFreeLinkedListNode lockFreeLinkedListNodeE = lockFreeLinkedListNode.e();
            if (lockFreeLinkedListNodeE == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = LockFreeLinkedListNode.f45035Y;
                Object obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                while (true) {
                    lockFreeLinkedListNode = (LockFreeLinkedListNode) obj;
                    if (!lockFreeLinkedListNode.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(lockFreeLinkedListNode);
                }
            } else {
                lockFreeLinkedListNode = lockFreeLinkedListNodeE;
            }
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.g();
            if (!lockFreeLinkedListNode.h()) {
                if (lockFreeLinkedListNode instanceof ChildHandleNode) {
                    return (ChildHandleNode) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof NodeList) {
                    return null;
                }
            }
        }
    }

    public static String m0(Object obj) {
        if (!(obj instanceof Finishing)) {
            if (obj instanceof Incomplete) {
                return ((Incomplete) obj).getX() ? "Active" : "New";
            }
            return obj instanceof CompletedExceptionally ? "Cancelled" : "Completed";
        }
        Finishing finishing = (Finishing) obj;
        if (finishing.d()) {
            return "Cancelling";
        }
        return Finishing.f44761Y.get(finishing) != 0 ? "Completing" : "Active";
    }

    public static CancellationException n0(JobSupport jobSupport, Throwable th) {
        jobSupport.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new JobCancellationException(jobSupport.L(), th, jobSupport) : cancellationException;
    }

    public void B(Object obj) {
    }

    public void C(Object obj) {
        B(obj);
    }

    public final Object D(Continuation continuation) throws Throwable {
        Object obj;
        do {
            obj = X.get(this);
            if (!(obj instanceof Incomplete)) {
                if (obj instanceof CompletedExceptionally) {
                    throw ((CompletedExceptionally) obj).f44747a;
                }
                return JobSupportKt.a(obj);
            }
        } while (l0(obj) < 0);
        AwaitContinuation awaitContinuation = new AwaitContinuation(IntrinsicsKt.b(continuation), this);
        awaitContinuation.q();
        CancellableContinuationKt.a(awaitContinuation, JobKt.c(this, true, new ResumeAwaitOnCompletion(awaitContinuation)));
        Object objP = awaitContinuation.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        return objP;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00bf->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0041 A[PHI: r0
  0x0041: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0008, B:16:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:40:0x0087, B:36:0x007a, B:39:0x0081), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x006d A[Catch: all -> 0x007f, TRY_ENTER, TryCatch #0 {all -> 0x007f, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:40:0x0087, B:36:0x007a, B:39:0x0081), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x007a A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:24:0x0052, B:29:0x0067, B:32:0x006d, B:40:0x0087, B:36:0x007a, B:39:0x0081), top: B:84:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0090  */
    /* JADX WARN: Code duplicated, block: B:45:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0113  */
    /* JADX WARN: Code duplicated, block: B:84:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0045, please report this as an issue */
    public final boolean E(Object obj) {
        Throwable thO;
        Object obj2;
        Finishing finishing;
        boolean z2;
        Throwable thC;
        Symbol symbol;
        Incomplete incomplete;
        NodeList nodeListV;
        Finishing finishing2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objO0;
        Object objO1 = JobSupportKt.f44763a;
        if (U()) {
            do {
                Object obj3 = X.get(this);
                if (obj3 instanceof Incomplete) {
                    if (obj3 instanceof Finishing) {
                        Finishing finishing3 = (Finishing) obj3;
                        finishing3.getClass();
                        if (Finishing.f44761Y.get(finishing3) != 0) {
                        }
                    }
                    objO1 = o0(obj3, new CompletedExceptionally(false, O(obj)));
                }
                objO1 = JobSupportKt.f44763a;
                break;
            } while (objO1 == JobSupportKt.f44765c);
            if (objO1 != JobSupportKt.f44764b) {
                if (objO1 == JobSupportKt.f44763a) {
                    thO = null;
                    loop1: while (true) {
                        obj2 = X.get(this);
                        if (obj2 instanceof Finishing) {
                            synchronized (obj2) {
                                try {
                                    finishing = (Finishing) obj2;
                                    finishing.getClass();
                                    if (Finishing.e0.get(finishing) == JobSupportKt.f44766e) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        symbol = JobSupportKt.d;
                                    } else {
                                        boolean zD = ((Finishing) obj2).d();
                                        if (obj == null || !zD) {
                                            if (thO == null) {
                                                thO = O(obj);
                                            }
                                            ((Finishing) obj2).a(thO);
                                        }
                                        thC = zD ? null : ((Finishing) obj2).c();
                                        if (thC != null) {
                                            f0(((Finishing) obj2).X, thC);
                                        }
                                        symbol = JobSupportKt.f44763a;
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else if (obj2 instanceof Incomplete) {
                            if (thO == null) {
                                thO = O(obj);
                            }
                            incomplete = (Incomplete) obj2;
                            if (incomplete.getX()) {
                                nodeListV = V(incomplete);
                                if (nodeListV == null) {
                                    continue;
                                } else {
                                    finishing2 = new Finishing(nodeListV, thO);
                                    while (true) {
                                        atomicReferenceFieldUpdater = X;
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, finishing2)) {
                                            f0(nodeListV, thO);
                                            symbol = JobSupportKt.f44763a;
                                        } else if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                                        }
                                    }
                                }
                            } else {
                                objO0 = o0(obj2, new CompletedExceptionally(false, thO));
                                if (objO0 != JobSupportKt.f44763a) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objO0 != JobSupportKt.f44765c) {
                                    objO1 = objO0;
                                    break;
                                }
                            }
                        } else {
                            symbol = JobSupportKt.d;
                        }
                        objO1 = symbol;
                        break;
                    }
                }
                if (objO1 != JobSupportKt.f44763a && objO1 != JobSupportKt.f44764b) {
                    if (objO1 == JobSupportKt.d) {
                        return false;
                    }
                    B(objO1);
                    return true;
                }
            }
        } else {
            if (objO1 == JobSupportKt.f44763a) {
                thO = null;
                loop1: while (true) {
                    obj2 = X.get(this);
                    if (obj2 instanceof Finishing) {
                        synchronized (obj2) {
                            finishing = (Finishing) obj2;
                            finishing.getClass();
                            if (Finishing.e0.get(finishing) == JobSupportKt.f44766e) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                symbol = JobSupportKt.d;
                            } else {
                                boolean zD2 = ((Finishing) obj2).d();
                                if (obj == null) {
                                    if (thO == null) {
                                        thO = O(obj);
                                    }
                                    ((Finishing) obj2).a(thO);
                                } else {
                                    if (thO == null) {
                                        thO = O(obj);
                                    }
                                    ((Finishing) obj2).a(thO);
                                }
                                if (zD2) {
                                }
                                if (thC != null) {
                                    f0(((Finishing) obj2).X, thC);
                                }
                                symbol = JobSupportKt.f44763a;
                            }
                        }
                    } else if (obj2 instanceof Incomplete) {
                        if (thO == null) {
                            thO = O(obj);
                        }
                        incomplete = (Incomplete) obj2;
                        if (incomplete.getX()) {
                            nodeListV = V(incomplete);
                            if (nodeListV == null) {
                                continue;
                            } else {
                                finishing2 = new Finishing(nodeListV, thO);
                                while (true) {
                                    atomicReferenceFieldUpdater = X;
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, finishing2)) {
                                        f0(nodeListV, thO);
                                        symbol = JobSupportKt.f44763a;
                                    } else if (atomicReferenceFieldUpdater.get(this) != incomplete) {
                                    }
                                }
                            }
                        } else {
                            objO0 = o0(obj2, new CompletedExceptionally(false, thO));
                            if (objO0 != JobSupportKt.f44763a) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objO0 != JobSupportKt.f44765c) {
                                objO1 = objO0;
                                break;
                            }
                        }
                    } else {
                        symbol = JobSupportKt.d;
                    }
                    objO1 = symbol;
                    break;
                }
            }
            if (objO1 != JobSupportKt.f44763a) {
                if (objO1 == JobSupportKt.d) {
                    return false;
                }
                B(objO1);
                return true;
            }
        }
        return true;
    }

    public void F(CancellationException cancellationException) {
        E(cancellationException);
    }

    public final boolean G(Throwable th) {
        if (!a0()) {
            boolean z2 = th instanceof CancellationException;
            ChildHandle childHandle = (ChildHandle) f44760Y.get(this);
            if (childHandle == null || childHandle == NonDisposableHandle.X) {
                return z2;
            }
            return childHandle.a(th) || z2;
        }
        return true;
    }

    public boolean H(Object obj) {
        return b0(obj);
    }

    @Override // kotlinx.coroutines.ParentJob
    public final CancellationException K() {
        Throwable thC;
        Object obj = X.get(this);
        if (obj instanceof Finishing) {
            thC = ((Finishing) obj).c();
        } else if (obj instanceof CompletedExceptionally) {
            thC = ((CompletedExceptionally) obj).f44747a;
        } else {
            if (obj instanceof Incomplete) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            thC = null;
        }
        CancellationException cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(m0(obj)), thC, this) : cancellationException;
    }

    public String L() {
        return "Job was cancelled";
    }

    public boolean M(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return E(th) && getZ();
    }

    public final void N(Incomplete incomplete, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44760Y;
        ChildHandle childHandle = (ChildHandle) atomicReferenceFieldUpdater.get(this);
        if (childHandle != null) {
            childHandle.dispose();
            atomicReferenceFieldUpdater.set(this, NonDisposableHandle.X);
        }
        CompletionHandlerException completionHandlerException = null;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f44747a : null;
        if (incomplete instanceof JobNode) {
            try {
                ((JobNode) incomplete).l(th);
                return;
            } catch (Throwable th2) {
                X(new CompletionHandlerException("Exception in completion handler " + incomplete + " for " + this, th2));
                return;
            }
        }
        NodeList x = incomplete.getX();
        if (x != null) {
            x.d(1);
            Object obj2 = LockFreeLinkedListNode.X.get(x);
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (LockFreeLinkedListNode lockFreeLinkedListNodeG = (LockFreeLinkedListNode) obj2; !lockFreeLinkedListNodeG.equals(x); lockFreeLinkedListNodeG = lockFreeLinkedListNodeG.g()) {
                if (lockFreeLinkedListNodeG instanceof JobNode) {
                    try {
                        ((JobNode) lockFreeLinkedListNodeG).l(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            kotlin.ExceptionsKt.a(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeG + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                X(completionHandlerException);
            }
        }
    }

    public final Throwable O(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new JobCancellationException(L(), null, this) : th;
        }
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((ParentJob) obj).K();
    }

    public final Object Q(Finishing finishing, Object obj) {
        boolean zD;
        Throwable thR;
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        Throwable th = completedExceptionally != null ? completedExceptionally.f44747a : null;
        synchronized (finishing) {
            zD = finishing.d();
            ArrayList<Throwable> arrayListE = finishing.e(th);
            thR = R(finishing, arrayListE);
            if (thR != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thR && th2 != thR && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        kotlin.ExceptionsKt.a(thR, th2);
                    }
                }
            }
        }
        if (thR != null && thR != th) {
            obj = new CompletedExceptionally(false, thR);
        }
        if (thR != null && (G(thR) || W(thR))) {
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            CompletedExceptionally.f44746b.compareAndSet((CompletedExceptionally) obj, 0, 1);
        }
        if (!zD) {
            g0(thR);
        }
        h0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        Object incompleteStateBox = obj instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, finishing, incompleteStateBox) && atomicReferenceFieldUpdater.get(this) == finishing) {
        }
        N(finishing, obj);
        return obj;
    }

    public final Throwable R(Finishing finishing, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (finishing.d()) {
                return new JobCancellationException(L(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: S */
    public boolean getZ() {
        return true;
    }

    public boolean U() {
        return this instanceof CompletableDeferredImpl;
    }

    public final NodeList V(Incomplete incomplete) {
        NodeList x = incomplete.getX();
        if (x != null) {
            return x;
        }
        if (incomplete instanceof Empty) {
            return new NodeList();
        }
        if (incomplete instanceof JobNode) {
            k0((JobNode) incomplete);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + incomplete).toString());
    }

    public boolean W(Throwable th) {
        return false;
    }

    public final void Y(Job job) {
        NonDisposableHandle nonDisposableHandle = NonDisposableHandle.X;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f44760Y;
        if (job == null) {
            atomicReferenceFieldUpdater.set(this, nonDisposableHandle);
            return;
        }
        job.start();
        ChildHandle childHandleQ = job.q(this);
        atomicReferenceFieldUpdater.set(this, childHandleQ);
        if (h()) {
            childHandleQ.dispose();
            atomicReferenceFieldUpdater.set(this, nonDisposableHandle);
        }
    }

    public final DisposableHandle Z(boolean z2, JobNode jobNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z3;
        boolean zC;
        jobNode.e0 = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj instanceof Empty;
            NonDisposableHandle nonDisposableHandle = NonDisposableHandle.X;
            z3 = true;
            if (!z4) {
                if (!(obj instanceof Incomplete)) {
                    z3 = false;
                    break;
                }
                Incomplete incomplete = (Incomplete) obj;
                NodeList x = incomplete.getX();
                if (x == null) {
                    Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    k0((JobNode) obj);
                } else {
                    if (jobNode.k()) {
                        Finishing finishing = incomplete instanceof Finishing ? (Finishing) incomplete : null;
                        Throwable thC = finishing != null ? finishing.c() : null;
                        if (thC == null) {
                            zC = x.c(jobNode, 5);
                        } else if (z2) {
                            jobNode.l(thC);
                            return nonDisposableHandle;
                        }
                    } else {
                        zC = x.c(jobNode, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                Empty empty = (Empty) obj;
                if (empty.X) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, jobNode)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    j0(empty);
                }
            }
            return nonDisposableHandle;
        }
        if (z3) {
            return jobNode;
        }
        if (z2) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
            jobNode.l(completedExceptionally != null ? completedExceptionally.f44747a : null);
        }
        return nonDisposableHandle;
    }

    @Override // kotlinx.coroutines.Job
    public void a(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(L(), null, this);
        }
        F(cancellationException);
    }

    public boolean a0() {
        return this instanceof BlockingCoroutine;
    }

    public final boolean b0(Object obj) {
        Object objO0;
        do {
            objO0 = o0(X.get(this), obj);
            if (objO0 == JobSupportKt.f44763a) {
                return false;
            }
            if (objO0 == JobSupportKt.f44764b) {
                return true;
            }
        } while (objO0 == JobSupportKt.f44765c);
        B(objO0);
        return true;
    }

    public final Object c0(Object obj) {
        Object objO0;
        do {
            objO0 = o0(X.get(this), obj);
            if (objO0 == JobSupportKt.f44763a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
                throw new IllegalStateException(str, completedExceptionally != null ? completedExceptionally.f44747a : null);
            }
        } while (objO0 == JobSupportKt.f44765c);
        return objO0;
    }

    public String d0() {
        return getClass().getSimpleName();
    }

    public final void f0(NodeList nodeList, Throwable th) {
        g0(th);
        nodeList.d(4);
        Object obj = LockFreeLinkedListNode.X.get(nodeList);
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNodeG = (LockFreeLinkedListNode) obj; !lockFreeLinkedListNodeG.equals(nodeList); lockFreeLinkedListNodeG = lockFreeLinkedListNodeG.g()) {
            if ((lockFreeLinkedListNodeG instanceof JobNode) && ((JobNode) lockFreeLinkedListNodeG).k()) {
                try {
                    ((JobNode) lockFreeLinkedListNodeG).l(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        kotlin.ExceptionsKt.a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + lockFreeLinkedListNodeG + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            X(completionHandlerException);
        }
        G(th);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    public void g0(Throwable th) {
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    /* JADX INFO: renamed from: getKey */
    public final CoroutineContext.Key getX() {
        return Job.Key.X;
    }

    @Override // kotlinx.coroutines.Job
    public final boolean h() {
        return !(X.get(this) instanceof Incomplete);
    }

    public void h0(Object obj) {
    }

    public void i0() {
    }

    @Override // kotlinx.coroutines.Job
    public boolean isActive() {
        Object obj = X.get(this);
        return (obj instanceof Incomplete) && ((Incomplete) obj).getX();
    }

    @Override // kotlinx.coroutines.Job
    public final boolean isCancelled() {
        Object obj = X.get(this);
        if (obj instanceof CompletedExceptionally) {
            return true;
        }
        return (obj instanceof Finishing) && ((Finishing) obj).d();
    }

    public final void j0(Empty empty) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        NodeList nodeList = new NodeList();
        Object inactiveNodeList = nodeList;
        if (!empty.X) {
            inactiveNodeList = new InactiveNodeList(nodeList);
        }
        do {
            atomicReferenceFieldUpdater = X;
            if (atomicReferenceFieldUpdater.compareAndSet(this, empty, inactiveNodeList)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == empty);
    }

    public Object k() throws Throwable {
        Object obj = X.get(this);
        if (obj instanceof Incomplete) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) obj).f44747a;
        }
        return JobSupportKt.a(obj);
    }

    public final void k0(JobNode jobNode) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        NodeList nodeList = new NodeList();
        jobNode.getClass();
        LockFreeLinkedListNode.f45035Y.set(nodeList, jobNode);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = LockFreeLinkedListNode.X;
        atomicReferenceFieldUpdater2.set(nodeList, jobNode);
        loop0: while (atomicReferenceFieldUpdater2.get(jobNode) == jobNode) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(jobNode, jobNode, nodeList)) {
                    nodeList.f(jobNode);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(jobNode) == jobNode);
        }
        LockFreeLinkedListNode lockFreeLinkedListNodeG = jobNode.g();
        do {
            atomicReferenceFieldUpdater = X;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jobNode, lockFreeLinkedListNodeG)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == jobNode);
    }

    public final int l0(Object obj) {
        boolean z2 = obj instanceof Empty;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        if (z2) {
            if (((Empty) obj).X) {
                return 0;
            }
            Empty empty = JobSupportKt.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, empty)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            i0();
            return 1;
        }
        if (!(obj instanceof InactiveNodeList)) {
            return 0;
        }
        NodeList nodeList = ((InactiveNodeList) obj).X;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nodeList)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        i0();
        return 1;
    }

    @Override // kotlinx.coroutines.Job
    public final Sequence m() {
        return new SequencesKt__SequenceBuilderKt$sequence$$inlined$Sequence$1(new JobSupport$children$1(null, this));
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        return CoroutineContext.Element.DefaultImpls.c(this, key);
    }

    @Override // kotlinx.coroutines.Job
    public final Object n(ContinuationImpl continuationImpl) throws Throwable {
        boolean z2;
        while (true) {
            Object obj = X.get(this);
            if (!(obj instanceof Incomplete)) {
                z2 = false;
                break;
            }
            if (l0(obj) >= 0) {
                z2 = true;
                break;
            }
        }
        Unit unit = Unit.f43263a;
        if (!z2) {
            JobKt.b(continuationImpl.getF45023Y());
            return unit;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(continuationImpl));
        cancellableContinuationImpl.q();
        CancellableContinuationKt.a(cancellableContinuationImpl, JobKt.c(this, true, new ResumeOnCompletion(cancellableContinuationImpl)));
        Object objP = cancellableContinuationImpl.p();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        if (objP != coroutineSingletons) {
            objP = unit;
        }
        return objP == coroutineSingletons ? objP : unit;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle o(boolean z2, boolean z3, Function1 function1) {
        return Z(z3, z2 ? new InvokeOnCancelling(function1) : new InvokeOnCompletion(function1));
    }

    public final Object o0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof Incomplete)) {
            return JobSupportKt.f44763a;
        }
        if (((obj instanceof Empty) || (obj instanceof JobNode)) && !(obj instanceof ChildHandleNode) && !(obj2 instanceof CompletedExceptionally)) {
            Incomplete incomplete = (Incomplete) obj;
            Object incompleteStateBox = obj2 instanceof Incomplete ? new IncompleteStateBox((Incomplete) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = X;
                if (atomicReferenceFieldUpdater.compareAndSet(this, incomplete, incompleteStateBox)) {
                    g0(null);
                    h0(obj2);
                    N(incomplete, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == incomplete);
            return JobSupportKt.f44765c;
        }
        Incomplete incomplete2 = (Incomplete) obj;
        NodeList nodeListV = V(incomplete2);
        if (nodeListV == null) {
            return JobSupportKt.f44765c;
        }
        Finishing finishing = incomplete2 instanceof Finishing ? (Finishing) incomplete2 : null;
        if (finishing == null) {
            finishing = new Finishing(nodeListV, null);
        }
        synchronized (finishing) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = Finishing.f44761Y;
                if (atomicIntegerFieldUpdater.get(finishing) != 0) {
                    return JobSupportKt.f44763a;
                }
                atomicIntegerFieldUpdater.set(finishing, 1);
                if (finishing != incomplete2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = X;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, incomplete2, finishing)) {
                        if (atomicReferenceFieldUpdater2.get(this) != incomplete2) {
                            return JobSupportKt.f44765c;
                        }
                    }
                }
                boolean zD = finishing.d();
                CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
                if (completedExceptionally != null) {
                    finishing.a(completedExceptionally.f44747a);
                }
                Throwable thC = zD ? null : finishing.c();
                if (thC != null) {
                    f0(nodeListV, thC);
                }
                ChildHandleNode childHandleNodeE0 = e0(nodeListV);
                if (childHandleNodeE0 != null && p0(finishing, childHandleNodeE0, obj2)) {
                    return JobSupportKt.f44764b;
                }
                nodeListV.d(2);
                ChildHandleNode childHandleNodeE1 = e0(nodeListV);
                return (childHandleNodeE1 == null || !p0(finishing, childHandleNodeE1, obj2)) ? Q(finishing, obj2) : JobSupportKt.f44764b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.Job
    public final CancellationException p() {
        Object obj = X.get(this);
        if (!(obj instanceof Finishing)) {
            if (!(obj instanceof Incomplete)) {
                return obj instanceof CompletedExceptionally ? n0(this, ((CompletedExceptionally) obj).f44747a) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((Finishing) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException jobCancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (jobCancellationException == null) {
            if (strConcat == null) {
                strConcat = L();
            }
            jobCancellationException = new JobCancellationException(strConcat, thC, this);
        }
        return jobCancellationException;
    }

    public final boolean p0(Finishing finishing, ChildHandleNode childHandleNode, Object obj) {
        while (JobKt.c(childHandleNode.f0, false, new ChildCompletion(this, finishing, childHandleNode, obj)) == NonDisposableHandle.X) {
            childHandleNode = e0(childHandleNode);
            if (childHandleNode == null) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.DefaultImpls.d(this, coroutineContext);
    }

    @Override // kotlinx.coroutines.Job
    public final ChildHandle q(JobSupport jobSupport) {
        ChildHandleNode childHandleNode = new ChildHandleNode(jobSupport);
        childHandleNode.e0 = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof Empty) {
                Empty empty = (Empty) obj;
                if (empty.X) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, childHandleNode)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                j0(empty);
            } else {
                boolean z2 = obj instanceof Incomplete;
                NonDisposableHandle nonDisposableHandle = NonDisposableHandle.X;
                Throwable thC = null;
                if (!z2) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    CompletedExceptionally completedExceptionally = obj2 instanceof CompletedExceptionally ? (CompletedExceptionally) obj2 : null;
                    childHandleNode.l(completedExceptionally != null ? completedExceptionally.f44747a : null);
                    return nonDisposableHandle;
                }
                NodeList x = ((Incomplete) obj).getX();
                if (x != null) {
                    if (x.c(childHandleNode, 7)) {
                        break;
                    }
                    boolean zC = x.c(childHandleNode, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof Finishing) {
                        thC = ((Finishing) obj3).c();
                    } else {
                        CompletedExceptionally completedExceptionally2 = obj3 instanceof CompletedExceptionally ? (CompletedExceptionally) obj3 : null;
                        if (completedExceptionally2 != null) {
                            thC = completedExceptionally2.f44747a;
                        }
                    }
                    childHandleNode.l(thC);
                    if (zC) {
                        break;
                    }
                    return nonDisposableHandle;
                }
                Intrinsics.d(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                k0((JobNode) obj);
            }
        }
        return childHandleNode;
    }

    @Override // kotlinx.coroutines.Job
    public final DisposableHandle s(Function1 function1) {
        return Z(true, new InvokeOnCompletion(function1));
    }

    @Override // kotlinx.coroutines.Job
    public final boolean start() {
        int iL0;
        do {
            iL0 = l0(X.get(this));
            if (iL0 == 0) {
                return false;
            }
        } while (iL0 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(d0() + AbstractJsonLexerKt.BEGIN_OBJ + m0(X.get(this)) + AbstractJsonLexerKt.END_OBJ);
        sb.append('@');
        sb.append(DebugStringsKt.a(this));
        return sb.toString();
    }

    public void X(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }
}
