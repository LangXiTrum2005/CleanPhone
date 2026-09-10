package androidx.lifecycle;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 implements j4.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4.e f4590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f4592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wj.j f4593d;

    public s0(j4.e savedStateRegistry, d1 d1Var) {
        kotlin.jvm.internal.n.f(savedStateRegistry, "savedStateRegistry");
        this.f4590a = savedStateRegistry;
        this.f4593d = r9.b.u(new al.l(d1Var, 2));
    }

    @Override // j4.d
    public final Bundle a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4592c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        for (Map.Entry entry : ((t0) this.f4593d.getValue()).f4594d.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((o0) entry.getValue()).f4577e.a();
            if (!kotlin.jvm.internal.n.a(bundleA, Bundle.EMPTY)) {
                bundle.putBundle(str, bundleA);
            }
        }
        this.f4591b = false;
        return bundle;
    }

    public final void b() {
        if (this.f4591b) {
            return;
        }
        Bundle bundleA = this.f4590a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f4592c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if (bundleA != null) {
            bundle.putAll(bundleA);
        }
        this.f4592c = bundle;
        this.f4591b = true;
    }
}
