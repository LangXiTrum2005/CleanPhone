package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class FragmentStore {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5154a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f5155b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f5156c = new HashMap();
    public FragmentManagerViewModel d;

    public final void a(Fragment fragment) {
        if (this.f5154a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f5154a) {
            this.f5154a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        FragmentStateManager fragmentStateManager = (FragmentStateManager) this.f5155b.get(str);
        if (fragmentStateManager != null) {
            return fragmentStateManager.f5150c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (FragmentStateManager fragmentStateManager : this.f5155b.values()) {
            if (fragmentStateManager != null && (fragmentFindFragmentByWho = fragmentStateManager.f5150c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f5155b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (FragmentStateManager fragmentStateManager : this.f5155b.values()) {
            if (fragmentStateManager != null) {
                arrayList.add(fragmentStateManager.f5150c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f5154a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f5154a) {
            arrayList = new ArrayList(this.f5154a);
        }
        return arrayList;
    }

    public final void g(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f5150c;
        String str = fragment.mWho;
        HashMap map = this.f5155b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, fragmentStateManager);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.d(fragment);
            } else {
                this.d.g(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.I(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(FragmentStateManager fragmentStateManager) {
        Fragment fragment = fragmentStateManager.f5150c;
        if (fragment.mRetainInstance) {
            this.d.g(fragment);
        }
        HashMap map = this.f5155b;
        if (map.get(fragment.mWho) == fragmentStateManager && ((FragmentStateManager) map.put(fragment.mWho, null)) != null && FragmentManager.I(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.f5156c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
