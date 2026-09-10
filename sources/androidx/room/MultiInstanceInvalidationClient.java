package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/MultiInstanceInvalidationClient;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MultiInstanceInvalidationClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InvalidationTracker f8191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8192c;
    public final CoroutineScope d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f8193e;
    public int f;
    public IMultiInstanceInvalidationService g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SharedFlowImpl f8194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MultiInstanceInvalidationClient$observer$1 f8195i;
    public final MultiInstanceInvalidationClient$invalidationCallback$1 j;
    public final MultiInstanceInvalidationClient$serviceConnection$1 k;

    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.room.MultiInstanceInvalidationClient$serviceConnection$1] */
    /* JADX WARN: Type inference failed for: r2v9, types: [androidx.room.MultiInstanceInvalidationClient$observer$1] */
    public MultiInstanceInvalidationClient(Context context, String name, InvalidationTracker invalidationTracker) {
        Intrinsics.f(context, "context");
        Intrinsics.f(name, "name");
        this.f8190a = name;
        this.f8191b = invalidationTracker;
        this.f8192c = context.getApplicationContext();
        ContextScope contextScope = invalidationTracker.f8181a.f8217a;
        if (contextScope == null) {
            Intrinsics.m("coroutineScope");
            throw null;
        }
        this.d = contextScope;
        this.f8193e = new AtomicBoolean(true);
        this.f8194h = SharedFlowKt.a(0, 0, BufferOverflow.X);
        final String[] strArr = invalidationTracker.f8182b;
        this.f8195i = new InvalidationTracker.Observer(strArr) { // from class: androidx.room.MultiInstanceInvalidationClient$observer$1
            @Override // androidx.room.InvalidationTracker.Observer
            public final void a(Set tables) {
                Intrinsics.f(tables, "tables");
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.f8199b;
                if (multiInstanceInvalidationClient.f8193e.get()) {
                    return;
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = multiInstanceInvalidationClient.g;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.y(multiInstanceInvalidationClient.f, (String[]) tables.toArray(new String[0]));
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e2);
                }
            }
        };
        this.j = new MultiInstanceInvalidationClient$invalidationCallback$1(this);
        this.k = new ServiceConnection() { // from class: androidx.room.MultiInstanceInvalidationClient$serviceConnection$1
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName name2, IBinder service) {
                IMultiInstanceInvalidationService iMultiInstanceInvalidationService;
                Intrinsics.f(name2, "name");
                Intrinsics.f(service, "service");
                int i2 = IMultiInstanceInvalidationService.Stub.X;
                IInterface iInterfaceQueryLocalInterface = service.queryLocalInterface(IMultiInstanceInvalidationService.O8);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationService)) {
                    IMultiInstanceInvalidationService.Stub.Proxy proxy = new IMultiInstanceInvalidationService.Stub.Proxy();
                    proxy.X = service;
                    iMultiInstanceInvalidationService = proxy;
                } else {
                    iMultiInstanceInvalidationService = (IMultiInstanceInvalidationService) iInterfaceQueryLocalInterface;
                }
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.X;
                multiInstanceInvalidationClient.g = iMultiInstanceInvalidationService;
                try {
                    multiInstanceInvalidationClient.f = iMultiInstanceInvalidationService.E(multiInstanceInvalidationClient.j, multiInstanceInvalidationClient.f8190a);
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
                }
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName name2) {
                Intrinsics.f(name2, "name");
                this.X.g = null;
            }
        };
    }

    public final void a() {
        if (this.f8193e.compareAndSet(false, true)) {
            InvalidationTracker invalidationTracker = this.f8191b;
            MultiInstanceInvalidationClient$observer$1 observer = this.f8195i;
            invalidationTracker.getClass();
            Intrinsics.f(observer, "observer");
            ReentrantLock reentrantLock = invalidationTracker.f8184e;
            reentrantLock.lock();
            try {
                ObserverWrapper observerWrapper = (ObserverWrapper) invalidationTracker.d.remove(observer);
                reentrantLock.unlock();
                if (observerWrapper != null) {
                    TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.f8183c;
                    triggerBasedInvalidationTracker.getClass();
                    int[] tableIds = observerWrapper.f8211b;
                    Intrinsics.f(tableIds, "tableIds");
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
                            jArr[i2] = j - 1;
                            if (j == 1) {
                                observedTableStates.d = true;
                                z2 = true;
                            }
                        }
                        boolean z3 = z2 || observedTableStates.d || observedTableStates.f;
                        reentrantLock2.unlock();
                        if (z3) {
                            RunBlockingUninterruptible_androidKt.a(new InvalidationTracker$removeObserver$1(invalidationTracker, null));
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                try {
                    IMultiInstanceInvalidationService iMultiInstanceInvalidationService = this.g;
                    if (iMultiInstanceInvalidationService != null) {
                        iMultiInstanceInvalidationService.Z(this.j, this.f);
                    }
                } catch (RemoteException e2) {
                    Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e2);
                }
                this.f8192c.unbindService(this.k);
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }
}
