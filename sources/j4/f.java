package j4;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.x;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f43707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f43708b = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f43709c;

    public f(g gVar) {
        this.f43707a = gVar;
    }

    public final void a() {
        g gVar = this.f43707a;
        o lifecycle = gVar.getLifecycle();
        if (((x) lifecycle).f4609d != n.f4565b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new b(gVar, 0));
        e eVar = this.f43708b;
        eVar.getClass();
        if (eVar.f43702b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new f.e(eVar, 2));
        eVar.f43702b = true;
        this.f43709c = true;
    }

    public final void b(Bundle bundle) {
        if (!this.f43709c) {
            a();
        }
        x xVar = (x) this.f43707a.getLifecycle();
        if (xVar.f4609d.compareTo(n.f4567d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + xVar.f4609d).toString());
        }
        e eVar = this.f43708b;
        if (!eVar.f43702b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (eVar.f43704d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        eVar.f43703c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        eVar.f43704d = true;
    }

    public final void c(Bundle bundle) {
        e eVar = this.f43708b;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f43703c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        r.f fVar = eVar.f43701a;
        fVar.getClass();
        r.d dVar = new r.d(fVar);
        fVar.f49216c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
