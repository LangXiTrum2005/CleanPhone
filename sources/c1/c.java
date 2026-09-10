package c1;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g1;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5831a = b.f5830a;

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                n.e(fragment.getParentFragmentManager(), "declaringFragment.parentFragmentManager");
            }
            fragment = fragment.getParentFragment();
        }
        return f5831a;
    }

    public static void b(h hVar) {
        if (g1.J(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(hVar.f5833a.getClass().getName()), hVar);
        }
    }

    public static final void c(Fragment fragment, String previousFragmentId) {
        n.f(fragment, "fragment");
        n.f(previousFragmentId, "previousFragmentId");
        b(new a(fragment, "Attempting to reuse fragment " + fragment + " with previous ID " + previousFragmentId));
        a(fragment).getClass();
    }
}
