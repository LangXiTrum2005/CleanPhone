package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class FragmentManagerViewModel extends ViewModel {
    public static final ViewModelProvider.Factory j = new AnonymousClass1();
    public final boolean g;
    public final HashMap d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f5142e = new HashMap();
    public final HashMap f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5143h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5144i = false;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManagerViewModel$1, reason: invalid class name */
    public class AnonymousClass1 implements ViewModelProvider.Factory {
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final ViewModel b(Class cls) {
            return new FragmentManagerViewModel(true);
        }
    }

    public FragmentManagerViewModel(boolean z2) {
        this.g = z2;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void b() {
        if (FragmentManager.I(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f5143h = true;
    }

    public final void d(Fragment fragment) {
        if (this.f5144i) {
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        HashMap map = this.d;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void e(Fragment fragment) {
        if (FragmentManager.I(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        f(fragment.mWho);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && FragmentManagerViewModel.class == obj.getClass()) {
            FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) obj;
            if (this.d.equals(fragmentManagerViewModel.d) && this.f5142e.equals(fragmentManagerViewModel.f5142e) && this.f.equals(fragmentManagerViewModel.f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str) {
        HashMap map = this.f5142e;
        FragmentManagerViewModel fragmentManagerViewModel = (FragmentManagerViewModel) map.get(str);
        if (fragmentManagerViewModel != null) {
            fragmentManagerViewModel.b();
            map.remove(str);
        }
        HashMap map2 = this.f;
        ViewModelStore viewModelStore = (ViewModelStore) map2.get(str);
        if (viewModelStore != null) {
            viewModelStore.a();
            map2.remove(str);
        }
    }

    public final void g(Fragment fragment) {
        if (this.f5144i) {
            if (FragmentManager.I(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.d.remove(fragment.mWho) == null || !FragmentManager.I(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.f5142e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f5142e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
