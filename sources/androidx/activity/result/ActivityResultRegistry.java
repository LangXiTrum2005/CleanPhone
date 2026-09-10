package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.a;
import android.util.Log;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.random.Random;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f3249a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f3250b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f3251c = new HashMap();
    public ArrayList d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient HashMap f3252e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public static class CallbackAndContract<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActivityResultCallback f3260a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ActivityResultContract f3261b;

        public CallbackAndContract(ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
            this.f3260a = activityResultCallback;
            this.f3261b = activityResultContract;
        }
    }

    public static class LifecycleContainer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Lifecycle f3262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f3263b = new ArrayList();

        public LifecycleContainer(Lifecycle lifecycle) {
            this.f3262a = lifecycle;
        }
    }

    public final void a(int i2, Serializable serializable) {
        ActivityResultCallback activityResultCallback;
        String str = (String) this.f3249a.get(Integer.valueOf(i2));
        if (str == null) {
            return;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.f3252e.get(str);
        if (callbackAndContract == null || (activityResultCallback = callbackAndContract.f3260a) == null) {
            this.g.remove(str);
            this.f.put(str, serializable);
        } else if (this.d.remove(str)) {
            activityResultCallback.a(serializable);
        }
    }

    public final boolean b(int i2, int i3, Intent intent) {
        ActivityResultCallback activityResultCallback;
        String str = (String) this.f3249a.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        CallbackAndContract callbackAndContract = (CallbackAndContract) this.f3252e.get(str);
        if (callbackAndContract == null || (activityResultCallback = callbackAndContract.f3260a) == null || !this.d.contains(str)) {
            this.f.remove(str);
            this.g.putParcelable(str, new ActivityResult(i3, intent));
            return true;
        }
        activityResultCallback.a(callbackAndContract.f3261b.c(i3, intent));
        this.d.remove(str);
        return true;
    }

    public abstract void c(int i2, ActivityResultContract activityResultContract, Object obj);

    public final ActivityResultLauncher d(final String str, final ActivityResultContract activityResultContract, ActivityResultCallback activityResultCallback) {
        f(str);
        this.f3252e.put(str, new CallbackAndContract(activityResultContract, activityResultCallback));
        HashMap map = this.f;
        if (map.containsKey(str)) {
            Object obj = map.get(str);
            map.remove(str);
            activityResultCallback.a(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            activityResultCallback.a(activityResultContract.c(activityResult.X, activityResult.f3248Y));
        }
        return new ActivityResultLauncher<Object>() { // from class: androidx.activity.result.ActivityResultRegistry.3
            @Override // androidx.activity.result.ActivityResultLauncher
            public final void a(Object obj2) throws Exception {
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                HashMap map2 = activityResultRegistry.f3250b;
                String str2 = str;
                Integer num = (Integer) map2.get(str2);
                ActivityResultContract activityResultContract2 = activityResultContract;
                if (num != null) {
                    activityResultRegistry.d.add(str2);
                    try {
                        activityResultRegistry.c(num.intValue(), activityResultContract2, obj2);
                        return;
                    } catch (Exception e2) {
                        activityResultRegistry.d.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract2 + " and input " + obj2 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void b() {
                ActivityResultRegistry.this.g(str);
            }
        };
    }

    public final ActivityResultLauncher e(final String str, LifecycleOwner lifecycleOwner, final ActivityResultContract activityResultContract, final ActivityResultCallback activityResultCallback) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.b().compareTo(Lifecycle.State.e0) >= 0) {
            throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        f(str);
        HashMap map = this.f3251c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map.get(str);
        if (lifecycleContainer == null) {
            lifecycleContainer = new LifecycleContainer(lifecycle);
        }
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                boolean zEquals = Lifecycle.Event.ON_START.equals(event);
                String str2 = str;
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                if (!zEquals) {
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        activityResultRegistry.f3252e.remove(str2);
                        return;
                    } else {
                        if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                            activityResultRegistry.g(str2);
                            return;
                        }
                        return;
                    }
                }
                HashMap map2 = activityResultRegistry.f3252e;
                ActivityResultCallback activityResultCallback2 = activityResultCallback;
                ActivityResultContract activityResultContract2 = activityResultContract;
                map2.put(str2, new CallbackAndContract(activityResultContract2, activityResultCallback2));
                HashMap map3 = activityResultRegistry.f;
                if (map3.containsKey(str2)) {
                    Object obj = map3.get(str2);
                    map3.remove(str2);
                    activityResultCallback2.a(obj);
                }
                Bundle bundle = activityResultRegistry.g;
                ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                if (activityResult != null) {
                    bundle.remove(str2);
                    activityResultCallback2.a(activityResultContract2.c(activityResult.X, activityResult.f3248Y));
                }
            }
        };
        lifecycleContainer.f3262a.a(lifecycleEventObserver);
        lifecycleContainer.f3263b.add(lifecycleEventObserver);
        map.put(str, lifecycleContainer);
        return new ActivityResultLauncher<Object>() { // from class: androidx.activity.result.ActivityResultRegistry.2
            @Override // androidx.activity.result.ActivityResultLauncher
            public final void a(Object obj) throws Exception {
                ActivityResultRegistry activityResultRegistry = ActivityResultRegistry.this;
                HashMap map2 = activityResultRegistry.f3250b;
                String str2 = str;
                Integer num = (Integer) map2.get(str2);
                ActivityResultContract activityResultContract2 = activityResultContract;
                if (num != null) {
                    activityResultRegistry.d.add(str2);
                    try {
                        activityResultRegistry.c(num.intValue(), activityResultContract2, obj);
                        return;
                    } catch (Exception e2) {
                        activityResultRegistry.d.remove(str2);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + activityResultContract2 + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }

            @Override // androidx.activity.result.ActivityResultLauncher
            public final void b() {
                ActivityResultRegistry.this.g(str);
            }
        };
    }

    public final void f(String str) {
        HashMap map = this.f3250b;
        if (((Integer) map.get(str)) != null) {
            return;
        }
        int iJ = Random.f43340Y.j(2147418112);
        while (true) {
            int i2 = iJ + 65536;
            HashMap map2 = this.f3249a;
            if (!map2.containsKey(Integer.valueOf(i2))) {
                map2.put(Integer.valueOf(i2), str);
                map.put(str, Integer.valueOf(i2));
                return;
            }
            iJ = Random.f43340Y.j(2147418112);
        }
    }

    public final void g(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.f3250b.remove(str)) != null) {
            this.f3249a.remove(num);
        }
        this.f3252e.remove(str);
        HashMap map = this.f;
        if (map.containsKey(str)) {
            StringBuilder sbY = a.y("Dropping pending result for request ", str, ": ");
            sbY.append(map.get(str));
            Log.w("ActivityResultRegistry", sbY.toString());
            map.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            StringBuilder sbY2 = a.y("Dropping pending result for request ", str, ": ");
            sbY2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", sbY2.toString());
            bundle.remove(str);
        }
        HashMap map2 = this.f3251c;
        LifecycleContainer lifecycleContainer = (LifecycleContainer) map2.get(str);
        if (lifecycleContainer != null) {
            ArrayList arrayList = lifecycleContainer.f3263b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lifecycleContainer.f3262a.c((LifecycleEventObserver) it.next());
            }
            arrayList.clear();
            map2.remove(str);
        }
    }
}
