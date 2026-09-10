package j4;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.c1;
import androidx.lifecycle.d1;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.r0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43700b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f43699a = i10;
        this.f43700b = obj;
    }

    @Override // androidx.lifecycle.t
    public final void onStateChanged(v vVar, m mVar) {
        switch (this.f43699a) {
            case 0:
                g gVar = (g) this.f43700b;
                if (mVar != m.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                vVar.getLifecycle().b(this);
                Bundle bundleA = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        n.e(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                n.e(objNewInstance, "{\n                constr…wInstance()\n            }");
                                if (!(gVar instanceof d1)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                c1 viewModelStore = ((d1) gVar).getViewModelStore();
                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f4532a;
                                for (String key : new HashSet(linkedHashMap.keySet())) {
                                    n.f(key, "key");
                                    x0 x0Var = (x0) linkedHashMap.get(key);
                                    n.c(x0Var);
                                    r0.a(x0Var, savedStateRegistry, gVar.getLifecycle());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e10) {
                                throw new RuntimeException(defpackage.e.n("Failed to instantiate ", str), e10);
                            }
                        } catch (NoSuchMethodException e11) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
                        }
                    } catch (ClassNotFoundException e12) {
                        throw new RuntimeException(defpackage.e.o("Class ", str, " wasn't found"), e12);
                    }
                }
                return;
            case 1:
                new HashMap();
                h[] hVarArr = (h[]) this.f43700b;
                if (hVarArr.length > 0) {
                    h hVar = hVarArr[0];
                    throw null;
                }
                if (hVarArr.length <= 0) {
                    return;
                }
                h hVar2 = hVarArr[0];
                throw null;
            case 2:
                if (mVar != m.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + mVar).toString());
                }
                vVar.getLifecycle().b(this);
                ((s0) this.f43700b).b();
                return;
            default:
                ComponentActivity componentActivity = (ComponentActivity) this.f43700b;
                ComponentActivity.access$ensureViewModelStore(componentActivity);
                componentActivity.getLifecycle().b(this);
                return;
        }
    }
}
