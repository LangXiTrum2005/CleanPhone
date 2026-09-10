package androidx.lifecycle;

import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry;", "Landroidx/lifecycle/Lifecycle;", "Companion", "ObserverWithState", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class LifecycleRegistry extends Lifecycle {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FastSafeIterableMap f5237c;
    public Lifecycle.State d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakReference f5238e;
    public int f;
    public boolean g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f5240i;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$Companion;", "", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/LifecycleRegistry$ObserverWithState;", "", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ObserverWithState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Lifecycle.State f5241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public LifecycleEventObserver f5242b;

        public final void a(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            Lifecycle.State stateD = event.d();
            Lifecycle.State state1 = this.f5241a;
            Intrinsics.f(state1, "state1");
            if (stateD.compareTo(state1) < 0) {
                state1 = stateD;
            }
            this.f5241a = state1;
            this.f5242b.onStateChanged(lifecycleOwner, event);
            this.f5241a = stateD;
        }
    }

    public LifecycleRegistry(LifecycleOwner lifecycleOwner) {
        this.f5230a = new AtomicReference();
        this.f5236b = true;
        this.f5237c = new FastSafeIterableMap();
        this.d = Lifecycle.State.f5232Y;
        this.f5240i = new ArrayList();
        this.f5238e = new WeakReference(lifecycleOwner);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void a(LifecycleObserver observer) {
        LifecycleEventObserver reflectiveGenericLifecycleObserver;
        LifecycleOwner lifecycleOwner;
        Lifecycle.Event event;
        ArrayList arrayList = this.f5240i;
        Intrinsics.f(observer, "observer");
        e("addObserver");
        Lifecycle.State state = this.d;
        Lifecycle.State state2 = Lifecycle.State.X;
        if (state != state2) {
            state2 = Lifecycle.State.f5232Y;
        }
        ObserverWithState observerWithState = new ObserverWithState();
        HashMap map = Lifecycling.f5243a;
        boolean z2 = observer instanceof LifecycleEventObserver;
        boolean z3 = observer instanceof DefaultLifecycleObserver;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) observer, (LifecycleEventObserver) observer);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((DefaultLifecycleObserver) observer, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (LifecycleEventObserver) observer;
        } else {
            Class<?> cls = observer.getClass();
            if (Lifecycling.b(cls) == 2) {
                Object obj = Lifecycling.f5244b.get(cls);
                Intrinsics.c(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(Lifecycling.a((Constructor) list.get(0), observer));
                } else {
                    int size = list.size();
                    GeneratedAdapter[] generatedAdapterArr = new GeneratedAdapter[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        generatedAdapterArr[i2] = Lifecycling.a((Constructor) list.get(i2), observer);
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(generatedAdapterArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(observer);
            }
        }
        observerWithState.f5242b = reflectiveGenericLifecycleObserver;
        observerWithState.f5241a = state2;
        if (((ObserverWithState) this.f5237c.c(observer, observerWithState)) == null && (lifecycleOwner = (LifecycleOwner) this.f5238e.get()) != null) {
            boolean z4 = this.f != 0 || this.g;
            Lifecycle.State stateD = d(observer);
            this.f++;
            while (observerWithState.f5241a.compareTo(stateD) < 0 && this.f5237c.f0.containsKey(observer)) {
                arrayList.add(observerWithState.f5241a);
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                Lifecycle.State state3 = observerWithState.f5241a;
                companion.getClass();
                Intrinsics.f(state3, "state");
                int iOrdinal = state3.ordinal();
                if (iOrdinal == 1) {
                    event = Lifecycle.Event.ON_CREATE;
                } else if (iOrdinal != 2) {
                    event = iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME;
                } else {
                    event = Lifecycle.Event.ON_START;
                }
                if (event == null) {
                    throw new IllegalStateException("no event up from " + observerWithState.f5241a);
                }
                observerWithState.a(lifecycleOwner, event);
                arrayList.remove(arrayList.size() - 1);
                stateD = d(observer);
            }
            if (!z4) {
                i();
            }
            this.f--;
        }
    }

    @Override // androidx.lifecycle.Lifecycle
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Lifecycle.State getD() {
        return this.d;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void c(LifecycleObserver observer) {
        Intrinsics.f(observer, "observer");
        e("removeObserver");
        this.f5237c.d(observer);
    }

    public final Lifecycle.State d(LifecycleObserver lifecycleObserver) {
        ObserverWithState observerWithState;
        Map.Entry entryE = this.f5237c.e(lifecycleObserver);
        Lifecycle.State state = (entryE == null || (observerWithState = (ObserverWithState) entryE.getValue()) == null) ? null : observerWithState.f5241a;
        ArrayList arrayList = this.f5240i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) android.support.v4.media.a.d(1, arrayList);
        Lifecycle.State state1 = this.d;
        Intrinsics.f(state1, "state1");
        if (state == null || state.compareTo(state1) >= 0) {
            state = state1;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void e(String str) {
        if (this.f5236b) {
            ArchTaskExecutor.a().f3676a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(android.support.v4.media.a.n("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(Lifecycle.Event event) {
        Intrinsics.f(event, "event");
        e("handleLifecycleEvent");
        g(event.d());
    }

    public final void g(Lifecycle.State state) {
        Lifecycle.State state2 = this.d;
        if (state2 == state) {
            return;
        }
        Lifecycle.State state3 = Lifecycle.State.f5232Y;
        Lifecycle.State state4 = Lifecycle.State.X;
        if (state2 == state3 && state == state4) {
            throw new IllegalStateException(("no event down from " + this.d + " in component " + this.f5238e.get()).toString());
        }
        this.d = state;
        if (this.g || this.f != 0) {
            this.f5239h = true;
            return;
        }
        this.g = true;
        i();
        this.g = false;
        if (this.d == state4) {
            this.f5237c = new FastSafeIterableMap();
        }
    }

    public final void h() {
        Lifecycle.State state = Lifecycle.State.Z;
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i() {
        Lifecycle.Event event;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) this.f5238e.get();
        if (lifecycleOwner == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            FastSafeIterableMap fastSafeIterableMap = this.f5237c;
            if (fastSafeIterableMap.e0 != 0) {
                SafeIterableMap.Entry entry = fastSafeIterableMap.X;
                Intrinsics.c(entry);
                Lifecycle.State state = ((ObserverWithState) entry.getValue()).f5241a;
                SafeIterableMap.Entry entry2 = this.f5237c.f3680Y;
                Intrinsics.c(entry2);
                Lifecycle.State state2 = ((ObserverWithState) entry2.getValue()).f5241a;
                if (state == state2 && this.d == state2) {
                    break;
                }
                this.f5239h = false;
                Lifecycle.State state3 = this.d;
                SafeIterableMap.Entry entry3 = this.f5237c.X;
                Intrinsics.c(entry3);
                if (state3.compareTo(((ObserverWithState) entry3.getValue()).f5241a) < 0) {
                    Iterator itDescendingIterator = this.f5237c.descendingIterator();
                    while (itDescendingIterator.hasNext() && !this.f5239h) {
                        Map.Entry entry4 = (Map.Entry) itDescendingIterator.next();
                        Intrinsics.e(entry4, "next()");
                        LifecycleObserver lifecycleObserver = (LifecycleObserver) entry4.getKey();
                        ObserverWithState observerWithState = (ObserverWithState) entry4.getValue();
                        while (observerWithState.f5241a.compareTo(this.d) > 0 && !this.f5239h && this.f5237c.f0.containsKey(lifecycleObserver)) {
                            Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                            Lifecycle.State state4 = observerWithState.f5241a;
                            companion.getClass();
                            Lifecycle.Event eventA = Lifecycle.Event.Companion.a(state4);
                            if (eventA == null) {
                                throw new IllegalStateException("no event down from " + observerWithState.f5241a);
                            }
                            this.f5240i.add(eventA.d());
                            observerWithState.a(lifecycleOwner, eventA);
                            ArrayList arrayList = this.f5240i;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                SafeIterableMap.Entry entry5 = this.f5237c.f3680Y;
                if (!this.f5239h && entry5 != null && this.d.compareTo(((ObserverWithState) entry5.getValue()).f5241a) > 0) {
                    FastSafeIterableMap fastSafeIterableMap2 = this.f5237c;
                    fastSafeIterableMap2.getClass();
                    SafeIterableMap.IteratorWithAdditions iteratorWithAdditions = new SafeIterableMap.IteratorWithAdditions();
                    fastSafeIterableMap2.Z.put(iteratorWithAdditions, Boolean.FALSE);
                    while (iteratorWithAdditions.hasNext() && !this.f5239h) {
                        Map.Entry entry6 = (Map.Entry) iteratorWithAdditions.next();
                        LifecycleObserver lifecycleObserver2 = (LifecycleObserver) entry6.getKey();
                        ObserverWithState observerWithState2 = (ObserverWithState) entry6.getValue();
                        while (observerWithState2.f5241a.compareTo(this.d) < 0 && !this.f5239h && this.f5237c.f0.containsKey(lifecycleObserver2)) {
                            this.f5240i.add(observerWithState2.f5241a);
                            Lifecycle.Event.Companion companion2 = Lifecycle.Event.INSTANCE;
                            Lifecycle.State state5 = observerWithState2.f5241a;
                            companion2.getClass();
                            Intrinsics.f(state5, "state");
                            int iOrdinal = state5.ordinal();
                            if (iOrdinal == 1) {
                                event = Lifecycle.Event.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                event = iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME;
                            } else {
                                event = Lifecycle.Event.ON_START;
                            }
                            if (event == null) {
                                throw new IllegalStateException("no event up from " + observerWithState2.f5241a);
                            }
                            observerWithState2.a(lifecycleOwner, event);
                            ArrayList arrayList2 = this.f5240i;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f5239h = false;
    }
}
