package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends androidx.lifecycle.x0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final j1 f4372j = new j1(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4376g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f4373d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f4374e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f4375f = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4377h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4378i = false;

    public k1(boolean z10) {
        this.f4376g = z10;
    }

    @Override // androidx.lifecycle.x0
    public final void b() {
        if (g1.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f4377h = true;
    }

    public final void c(Fragment fragment) {
        if (this.f4378i) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = fragment.mWho;
        HashMap map = this.f4373d;
        if (map.containsKey(str)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (g1.J(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
        }
    }

    public final void d(Fragment fragment, boolean z10) {
        if (g1.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        f(fragment.mWho, z10);
    }

    public final void e(String str, boolean z10) {
        if (g1.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        f(str, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k1.class == obj.getClass()) {
            k1 k1Var = (k1) obj;
            if (this.f4373d.equals(k1Var.f4373d) && this.f4374e.equals(k1Var.f4374e) && this.f4375f.equals(k1Var.f4375f)) {
                return true;
            }
        }
        return false;
    }

    public final void f(String str, boolean z10) {
        HashMap map = this.f4374e;
        k1 k1Var = (k1) map.get(str);
        if (k1Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(k1Var.f4374e.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k1Var.e((String) it.next(), true);
                }
            }
            k1Var.b();
            map.remove(str);
        }
        HashMap map2 = this.f4375f;
        androidx.lifecycle.c1 c1Var = (androidx.lifecycle.c1) map2.get(str);
        if (c1Var != null) {
            c1Var.a();
            map2.remove(str);
        }
    }

    public final void g(Fragment fragment) {
        if (this.f4378i) {
            if (g1.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f4373d.remove(fragment.mWho) == null || !g1.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public final int hashCode() {
        return this.f4375f.hashCode() + ((this.f4374e.hashCode() + (this.f4373d.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f4373d.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f4374e.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f4375f.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
