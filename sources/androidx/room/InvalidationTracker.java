package androidx.room;

import android.content.Intent;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Observer", "MultiInstanceClientInitState", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class InvalidationTracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase_Impl f8181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f8182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TriggerBasedInvalidationTracker f8183c;
    public final LinkedHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f8184e;
    public final a f;
    public final a g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Intent f8185h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MultiInstanceInvalidationClient f8186i;
    public final Object j;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$Companion;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$MultiInstanceClientInitState;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MultiInstanceClientInitState {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiInstanceClientInitState)) {
                return false;
            }
            ((MultiInstanceClientInitState) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "MultiInstanceClientInitState(context=null, name=null, serviceIntent=null)";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f8187a;

        public Observer(String[] strArr) {
            this.f8187a = strArr;
        }

        public abstract void a(Set set);
    }

    public InvalidationTracker(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.f8181a = workDatabase_Impl;
        this.f8182b = strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(workDatabase_Impl, map, map2, strArr, workDatabase_Impl.k, new InvalidationTracker$implementation$1(1, this, InvalidationTracker.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.f8183c = triggerBasedInvalidationTracker;
        this.d = new LinkedHashMap();
        this.f8184e = new ReentrantLock();
        this.f = new a(this, 0);
        this.g = new a(this, 1);
        Intrinsics.e(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(...)");
        this.j = new Object();
        triggerBasedInvalidationTracker.k = new a(this, 2);
    }

    public final boolean a(Observer observer) {
        String[] strArr = observer.f8187a;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.f8183c;
        Pair pairG = triggerBasedInvalidationTracker.g(strArr);
        String[] strArr2 = (String[]) pairG.X;
        int[] tableIds = (int[]) pairG.f43249Y;
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, tableIds, strArr2);
        ReentrantLock reentrantLock = this.f8184e;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.d;
        try {
            ObserverWrapper observerWrapper2 = linkedHashMap.containsKey(observer) ? (ObserverWrapper) MapsKt.f(linkedHashMap, observer) : (ObserverWrapper) linkedHashMap.put(observer, observerWrapper);
            reentrantLock.unlock();
            if (observerWrapper2 != null) {
                return false;
            }
            ObservedTableStates observedTableStates = triggerBasedInvalidationTracker.f8259h;
            observedTableStates.getClass();
            Intrinsics.f(tableIds, "tableIds");
            ReentrantLock reentrantLock2 = observedTableStates.f8203a;
            reentrantLock2.lock();
            try {
                boolean z2 = false;
                for (int i2 : tableIds) {
                    long[] jArr = observedTableStates.f8204b;
                    long j = jArr[i2];
                    jArr[i2] = 1 + j;
                    if (j == 0) {
                        observedTableStates.d = true;
                        z2 = true;
                    }
                }
                boolean z3 = z2 || observedTableStates.d || observedTableStates.f;
                reentrantLock2.unlock();
                return z3;
            } catch (Throwable th) {
                reentrantLock2.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b() {
        this.f8183c.e(this.f, this.g);
    }

    public final Object c(SuspendLambda suspendLambda) throws Throwable {
        Object objF = this.f8183c.f(suspendLambda);
        return objF == CoroutineSingletons.X ? objF : Unit.f43263a;
    }
}
