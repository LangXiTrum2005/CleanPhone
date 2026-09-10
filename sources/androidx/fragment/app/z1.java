package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements androidx.lifecycle.i, j4.g, androidx.lifecycle.d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f4517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.c1 f4518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f4519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.a1 f4520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.x f4521e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j4.f f4522f = null;

    public z1(Fragment fragment, androidx.lifecycle.c1 c1Var, n nVar) {
        this.f4517a = fragment;
        this.f4518b = c1Var;
        this.f4519c = nVar;
    }

    public final void a(androidx.lifecycle.m mVar) {
        this.f4521e.e(mVar);
    }

    public final void b() {
        if (this.f4521e == null) {
            this.f4521e = new androidx.lifecycle.x(this);
            j4.f fVar = new j4.f(this);
            this.f4522f = fVar;
            fVar.a();
            this.f4519c.run();
        }
    }

    @Override // androidx.lifecycle.i
    public final e1.b getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f4517a;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        e1.c cVar = new e1.c(0);
        LinkedHashMap linkedHashMap = cVar.f39019a;
        if (application != null) {
            linkedHashMap.put(androidx.lifecycle.y0.f4620a, application);
        }
        linkedHashMap.put(androidx.lifecycle.r0.f4586a, fragment);
        linkedHashMap.put(androidx.lifecycle.r0.f4587b, this);
        if (fragment.getArguments() != null) {
            linkedHashMap.put(androidx.lifecycle.r0.f4588c, fragment.getArguments());
        }
        return cVar;
    }

    @Override // androidx.lifecycle.i
    public final androidx.lifecycle.a1 getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f4517a;
        androidx.lifecycle.a1 defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f4520d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f4520d == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f4520d = new androidx.lifecycle.u0(application, fragment, fragment.getArguments());
        }
        return this.f4520d;
    }

    @Override // androidx.lifecycle.v
    public final androidx.lifecycle.o getLifecycle() {
        b();
        return this.f4521e;
    }

    @Override // j4.g
    public final j4.e getSavedStateRegistry() {
        b();
        return this.f4522f.f43708b;
    }

    @Override // androidx.lifecycle.d1
    public final androidx.lifecycle.c1 getViewModelStore() {
        b();
        return this.f4518b;
    }
}
