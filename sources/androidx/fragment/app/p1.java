package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4435a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f4436b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f4437c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k1 f4438d;

    public final void a(Fragment fragment) {
        if (this.f4435a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f4435a) {
            this.f4435a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(String str) {
        o1 o1Var = (o1) this.f4436b.get(str);
        if (o1Var != null) {
            return o1Var.f4414c;
        }
        return null;
    }

    public final Fragment c(String str) {
        Fragment fragmentFindFragmentByWho;
        for (o1 o1Var : this.f4436b.values()) {
            if (o1Var != null && (fragmentFindFragmentByWho = o1Var.f4414c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (o1 o1Var : this.f4436b.values()) {
            if (o1Var != null) {
                arrayList.add(o1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (o1 o1Var : this.f4436b.values()) {
            if (o1Var != null) {
                arrayList.add(o1Var.f4414c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f4435a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f4435a) {
            arrayList = new ArrayList(this.f4435a);
        }
        return arrayList;
    }

    public final void g(o1 o1Var) {
        Fragment fragment = o1Var.f4414c;
        String str = fragment.mWho;
        HashMap map = this.f4436b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, o1Var);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.f4438d.c(fragment);
            } else {
                this.f4438d.g(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (g1.J(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragment);
        }
    }

    public final void h(o1 o1Var) {
        Fragment fragment = o1Var.f4414c;
        if (fragment.mRetainInstance) {
            this.f4438d.g(fragment);
        }
        String str = fragment.mWho;
        HashMap map = this.f4436b;
        if (map.get(str) == o1Var && ((o1) map.put(fragment.mWho, null)) != null && g1.J(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragment);
        }
    }

    public final Bundle i(Bundle bundle, String str) {
        HashMap map = this.f4437c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
