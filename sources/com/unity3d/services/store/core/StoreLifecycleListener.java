package com.unity3d.services.store.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.store.gpbl.StoreBilling;
import com.unity3d.services.store.gpbl.listeners.StoreEventListener;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B/\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0019\u0010\u0012J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0014R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/unity3d/services/store/core/StoreLifecycleListener;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "_purchaseTypes", "Lcom/unity3d/services/store/gpbl/StoreBilling;", "_storeBilling", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "_storeEventListener", "<init>", "(Ljava/util/ArrayList;Lcom/unity3d/services/store/gpbl/StoreBilling;Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;)V", "Landroid/app/Activity;", "activity", "Landroid/os/Bundle;", "savedInstanceState", "Lwj/r;", "onActivityCreated", "(Landroid/app/Activity;Landroid/os/Bundle;)V", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "outState", "onActivitySaveInstanceState", "onActivityDestroyed", "Ljava/util/ArrayList;", "Lcom/unity3d/services/store/gpbl/StoreBilling;", "Lcom/unity3d/services/store/gpbl/listeners/StoreEventListener;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class StoreLifecycleListener implements Application.ActivityLifecycleCallbacks {
    private final ArrayList<String> _purchaseTypes;
    private final StoreBilling _storeBilling;
    private final StoreEventListener _storeEventListener;

    public StoreLifecycleListener(ArrayList<String> _purchaseTypes, StoreBilling _storeBilling, StoreEventListener _storeEventListener) {
        n.f(_purchaseTypes, "_purchaseTypes");
        n.f(_storeBilling, "_storeBilling");
        n.f(_storeEventListener, "_storeEventListener");
        this._purchaseTypes = _purchaseTypes;
        this._storeBilling = _storeBilling;
        this._storeEventListener = _storeEventListener;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        n.f(activity, "activity");
        try {
            Iterator<String> it = this._purchaseTypes.iterator();
            while (it.hasNext()) {
                this._storeBilling.getPurchases(it.next(), this._storeEventListener);
            }
        } catch (ClassNotFoundException e10) {
            DeviceLog.warning("Couldn't fetch purchases onActivityResumed. " + e10.getMessage());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        n.f(activity, "activity");
        n.f(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        n.f(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        n.f(activity, "activity");
    }
}
