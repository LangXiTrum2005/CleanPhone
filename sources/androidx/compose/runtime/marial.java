package androidx.compose.runtime;

import androidx.compose.runtime.internal.AtomicInt;
import com.ironsource.C3414a2;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: compiled from: BroadcastFrameClock.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002-.B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\fH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u00060\u0016j\u0002`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030#0\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010%R\u0011\u0010,\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Landroidx/compose/runtime/marial;", "Landroidx/compose/runtime/milliradian;", "Lkotlin/Function0;", "", "onNewAwaiters", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "", "timeNanos", "triweekly", "(J)V", "R", "Lkotlin/Function1;", "onFrame", "formularize", "(Lkotlin/jvm/functions/Function1;Lwretchedly/dern;)Ljava/lang/Object;", "", "cause", "apical", "(Ljava/lang/Throwable;)V", "kowloon", "Lkotlin/jvm/functions/Function0;", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "arytenoidectomy", "Ljava/lang/Object;", "lock", "monoploid", "Ljava/lang/Throwable;", "failureCause", "Landroidx/compose/runtime/marial$attabal;", "polloi", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingAwaitersCountUnlocked", "Landroidx/collection/seminary;", "Landroidx/compose/runtime/marial$saneness;", "molybdenite", "Landroidx/collection/seminary;", "awaiters", "graveside", "spareList", "", "impassible", "()Z", "hasAwaiters", "saneness", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class marial implements milliradian {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> onNewAwaiters;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Throwable failureCause;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final Object lock = new Object();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final AtomicInt pendingAwaitersCountUnlocked = attabal.saneness();

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.seminary<saneness<?>> awaiters = new androidx.collection.seminary<>(0, 1, null);

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.seminary<saneness<?>> spareList = new androidx.collection.seminary<>(0, 1, null);

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class dern implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ marial f6068arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ saneness<R> f6069kowloon;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ Ref$IntRef f6070monoploid;

        public dern(saneness<R> sanenessVar, marial marialVar, Ref$IntRef ref$IntRef) {
            this.f6069kowloon = sanenessVar;
            this.f6068arytenoidectomy = marialVar;
            this.f6070monoploid = ref$IntRef;
        }

        public final void attabal(Throwable th) {
            int i;
            this.f6069kowloon.attabal();
            AtomicInt atomicInt = this.f6068arytenoidectomy.pendingAwaitersCountUnlocked;
            int i2 = this.f6070monoploid.element;
            do {
                i = atomicInt.get();
            } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i2 ? i - 1 : i));
        }

        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            attabal(th);
            return Unit.f29295attabal;
        }
    }

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R$\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015¨\u0006\u0016"}, d2 = {"Landroidx/compose/runtime/marial$saneness;", "R", "", "Lkotlin/Function1;", "", "onFrame", "Lkotlinx/coroutines/impassible;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlinx/coroutines/impassible;)V", "", "attabal", "()V", "timeNanos", "saneness", "(J)V", "", "exception", "dern", "(Ljava/lang/Throwable;)V", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/impassible;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness<R> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public Function1<? super Long, ? extends R> onFrame;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public kotlinx.coroutines.impassible<? super R> continuation;

        public saneness(Function1<? super Long, ? extends R> function1, kotlinx.coroutines.impassible<? super R> impassibleVar) {
            this.onFrame = function1;
            this.continuation = impassibleVar;
        }

        public final void attabal() {
            this.onFrame = null;
            this.continuation = null;
        }

        public final void dern(Throwable exception) {
            kotlinx.coroutines.impassible<? super R> impassibleVar = this.continuation;
            if (impassibleVar != null) {
                Result.Companion companion = Result.INSTANCE;
                impassibleVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(exception)));
            }
        }

        public final void saneness(long timeNanos) {
            kotlinx.coroutines.impassible<? super R> impassibleVar;
            Object objM3351constructorimpl;
            Function1<? super Long, ? extends R> function1 = this.onFrame;
            if (function1 == null || (impassibleVar = this.continuation) == null) {
                return;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(function1.invoke(Long.valueOf(timeNanos)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
            }
            impassibleVar.resumeWith(objM3351constructorimpl);
        }
    }

    public marial(Function0<Unit> function0) {
        this.onNewAwaiters = function0;
    }

    public final void apical(Throwable cause) {
        int i;
        synchronized (this.lock) {
            try {
                if (this.failureCause != null) {
                    return;
                }
                this.failureCause = cause;
                androidx.collection.seminary<saneness<?>> seminaryVar = this.awaiters;
                Object[] objArr = seminaryVar.content;
                int i2 = seminaryVar._size;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((saneness) objArr[i3]).dern(cause);
                }
                this.awaiters.molybdenite();
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, attabal.beachfront(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) milliradian.attabal.attabal(this, r, function2);
    }

    @Override // androidx.compose.runtime.milliradian
    public <R> Object formularize(Function1<? super Long, ? extends R> function1, wretchedly.dern<? super R> dernVar) {
        int i;
        int i2;
        boolean z = true;
        kotlinx.coroutines.kowloon kowloonVar = new kotlinx.coroutines.kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar.kattegat();
        saneness sanenessVar = new saneness(function1, kowloonVar);
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = -1;
        synchronized (this.lock) {
            Throwable th = this.failureCause;
            if (th != null) {
                Result.Companion companion = Result.INSTANCE;
                kowloonVar.resumeWith(Result.m3351constructorimpl(p002kotlin.dern.attabal(th)));
            } else {
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                    i2 = i + 1;
                } while (!atomicInt.compareAndSet(i, i2));
                if ((134217727 & i2) != 1) {
                    z = false;
                }
                ref$IntRef.element = (i2 >>> 27) & 15;
                this.awaiters.triweekly(sanenessVar);
                kowloonVar.beachfront(new dern(sanenessVar, this, ref$IntRef));
                if (z && this.onNewAwaiters != null) {
                    try {
                        this.onNewAwaiters.invoke();
                    } catch (Throwable th2) {
                        apical(th2);
                    }
                }
            }
        }
        Object objCuirassed = kowloonVar.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, p002kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E get(CoroutineContext.saneness<E> sanenessVar) {
        return (E) milliradian.attabal.saneness(this, sanenessVar);
    }

    public final boolean impassible() {
        return (this.pendingAwaitersCountUnlocked.get() & 134217727) > 0;
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.saneness<?> sanenessVar) {
        return milliradian.attabal.dern(this, sanenessVar);
    }

    @Override // p002kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return milliradian.attabal.wireman(this, coroutineContext);
    }

    public final void triweekly(long timeNanos) {
        int i;
        int i2;
        synchronized (this.lock) {
            try {
                androidx.collection.seminary<saneness<?>> seminaryVar = this.awaiters;
                this.awaiters = this.spareList;
                this.spareList = seminaryVar;
                AtomicInt atomicInt = this.pendingAwaitersCountUnlocked;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, attabal.beachfront(atomicInt, ((i >>> 27) & 15) + 1, 0)));
                int i3 = seminaryVar.get_size();
                for (i2 = 0; i2 < i3; i2++) {
                    seminaryVar.wireman(i2).saneness(timeNanos);
                }
                seminaryVar.molybdenite();
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: BroadcastFrameClock.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0083@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016\u0088\u0001\u0005\u0092\u0001\u00020\u0004¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/marial$attabal;", "", "saneness", "()Landroidx/compose/runtime/internal/AtomicInt;", "Landroidx/compose/runtime/internal/AtomicInt;", "value", "dern", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "", "version", "count", "beachfront", "(Landroidx/compose/runtime/internal/AtomicInt;II)I", "", "competently", "(Landroidx/compose/runtime/internal/AtomicInt;)Ljava/lang/String;", "hashCode", "()I", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/internal/AtomicInt;", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal {
        private final AtomicInt value;

        public static final int beachfront(AtomicInt atomicInt, int i, int i2) {
            return ((i & 15) << 27) | (134217727 & i2);
        }

        public static String competently(AtomicInt atomicInt) {
            int i = atomicInt.get();
            return "AtomicAwaitersCount(version = " + ((i >>> 27) & 15) + ", count = " + (i & 134217727) + ')';
        }

        public static int marial(AtomicInt atomicInt) {
            return atomicInt.hashCode();
        }

        public static AtomicInt saneness() {
            return dern(new AtomicInt(0));
        }

        public static boolean wireman(AtomicInt atomicInt, Object obj) {
            return (obj instanceof attabal) && Intrinsics.wireman(atomicInt, ((attabal) obj).getValue());
        }

        public boolean equals(Object other) {
            return wireman(this.value, other);
        }

        public int hashCode() {
            return marial(this.value);
        }

        /* JADX INFO: renamed from: impromptu, reason: from getter */
        public final /* synthetic */ AtomicInt getValue() {
            return this.value;
        }

        public String toString() {
            return competently(this.value);
        }

        public static AtomicInt dern(AtomicInt atomicInt) {
            return atomicInt;
        }
    }
}
