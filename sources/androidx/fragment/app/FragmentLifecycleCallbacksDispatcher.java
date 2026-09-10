package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
class FragmentLifecycleCallbacksDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f5111a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentManager f5112b;

    public static final class FragmentLifecycleCallbacksHolder {
    }

    public FragmentLifecycleCallbacksDispatcher(FragmentManager fragmentManager) {
        this.f5112b = fragmentManager;
    }

    public final void a(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.a(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void b(boolean z2) {
        FragmentManager fragmentManager = this.f5112b;
        FragmentActivity fragmentActivity = fragmentManager.f5129u.f5109Y;
        Fragment fragment = fragmentManager.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.b(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void c(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.c(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void d(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.d(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void e(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.e(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void f(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.f(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void g(boolean z2) {
        FragmentManager fragmentManager = this.f5112b;
        FragmentActivity fragmentActivity = fragmentManager.f5129u.f5109Y;
        Fragment fragment = fragmentManager.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.g(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void h(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.h(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void i(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.i(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void j(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.j(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void k(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.k(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void l(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.l(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z2) {
        Fragment fragment2 = this.f5112b.f5130w;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().m.m(fragment, view, bundle, true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }

    public final void n(boolean z2) {
        Fragment fragment = this.f5112b.f5130w;
        if (fragment != null) {
            fragment.getParentFragmentManager().m.n(true);
        }
        Iterator it = this.f5111a.iterator();
        if (it.hasNext()) {
            if (!z2) {
                throw null;
            }
            throw null;
        }
    }
}
