package a5;

import a5.g;
import a5.k;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.n;
import x4.i;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SidecarInterface f3397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f3398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f3399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f3400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g9.k f3401e;

    public k(Context context) {
        n.f(context, "context");
        SidecarInterface sidecarInterfaceA = i.a(context);
        g gVar = new g();
        this.f3397a = sidecarInterfaceA;
        this.f3398b = gVar;
        this.f3399c = new LinkedHashMap();
        this.f3400d = new LinkedHashMap();
    }

    public final x4.i a(Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return new x4.i(v.f53866a);
        }
        SidecarInterface sidecarInterface = this.f3397a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
        SidecarInterface sidecarInterface2 = this.f3397a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f3398b.d(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Activity activity) {
        SidecarInterface sidecarInterface;
        WindowManager.LayoutParams attributes;
        Window window = activity.getWindow();
        IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
        if (iBinder == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f3397a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
        }
        LinkedHashMap linkedHashMap = this.f3400d;
        l0.a aVar = (l0.a) linkedHashMap.get(activity);
        if (aVar != null) {
            if (activity instanceof c0.d) {
                ((c0.d) activity).removeOnConfigurationChangedListener(aVar);
            }
            linkedHashMap.remove(activity);
        }
        g9.k kVar = this.f3401e;
        if (kVar != null) {
            ReentrantLock reentrantLock = (ReentrantLock) kVar.f41771c;
            reentrantLock.lock();
            try {
                ((WeakHashMap) kVar.f41772d).put(activity, null);
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
        LinkedHashMap linkedHashMap2 = this.f3399c;
        boolean z10 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinder);
        if (!z10 || (sidecarInterface = this.f3397a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c(IBinder iBinder, final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f3399c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f3397a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f3397a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        g9.k kVar = this.f3401e;
        if (kVar != null) {
            kVar.A(activity, a(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f3400d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof c0.d)) {
            l0.a aVar = new l0.a() { // from class: a5.h
                @Override // l0.a
                public final void accept(Object obj) {
                    k this$0 = this.f3392a;
                    n.f(this$0, "this$0");
                    Activity activity2 = activity;
                    n.f(activity2, "$activity");
                    g9.k kVar2 = this$0.f3401e;
                    if (kVar2 != null) {
                        kVar2.A(activity2, this$0.a(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, aVar);
            ((c0.d) activity).addOnConfigurationChangedListener(aVar);
        }
    }

    public final void d(n5.f fVar) {
        this.f3401e = new g9.k(fVar);
        SidecarInterface sidecarInterface = this.f3397a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f3398b, new SidecarInterface.SidecarCallback() { // from class: androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback
                public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
                    SidecarInterface sidecarInterface2;
                    Window window;
                    WindowManager.LayoutParams attributes;
                    n.f(newDeviceState, "newDeviceState");
                    Collection<Activity> collectionValues = this.f5007a.f3399c.values();
                    k kVar = this.f5007a;
                    for (Activity activity : collectionValues) {
                        SidecarWindowLayoutInfo windowLayoutInfo = null;
                        IBinder iBinder = (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
                        if (iBinder != null && (sidecarInterface2 = kVar.f3397a) != null) {
                            windowLayoutInfo = sidecarInterface2.getWindowLayoutInfo(iBinder);
                        }
                        g9.k kVar2 = kVar.f3401e;
                        if (kVar2 != null) {
                            kVar2.A(activity, kVar.f3398b.d(windowLayoutInfo, newDeviceState));
                        }
                    }
                }

                public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
                    SidecarDeviceState sidecarDeviceState;
                    n.f(windowToken, "windowToken");
                    n.f(newLayout, "newLayout");
                    Activity activity = (Activity) this.f5007a.f3399c.get(windowToken);
                    if (activity == null) {
                        Log.w("SidecarCompat", "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                        return;
                    }
                    k kVar = this.f5007a;
                    g gVar = kVar.f3398b;
                    SidecarInterface sidecarInterface2 = kVar.f3397a;
                    if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
                        sidecarDeviceState = new SidecarDeviceState();
                    }
                    i iVarD = gVar.d(newLayout, sidecarDeviceState);
                    g9.k kVar2 = this.f5007a.f3401e;
                    if (kVar2 != null) {
                        kVar2.A(activity, iVarD);
                    }
                }
            }));
        }
    }

    public final boolean e() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f3397a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!n.a(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f3397a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f3397a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f3397a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!n.a(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f3397a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!n.a(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f3397a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!n.a(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null);
                n.d(objInvoke, "null cannot be cast to non-null type kotlin.Int");
                if (((Integer) objInvoke).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            Rect rect = sidecarDisplayFeature.getRect();
            n.e(rect, "displayFeature.rect");
            sidecarDisplayFeature.setRect(rect);
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
                return true;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                Object objInvoke2 = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null);
                n.d(objInvoke2, "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                if (arrayList.equals((List) objInvoke2)) {
                    return true;
                }
                throw new Exception("Invalid display feature getter/setter");
            }
        } catch (Throwable unused3) {
            return false;
        }
    }
}
