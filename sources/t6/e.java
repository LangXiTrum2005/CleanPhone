package t6;

import a7.p;
import androidx.annotation.NonNull;
import androidx.lifecycle.h0;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import androidx.lifecycle.x;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f50538a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f50539b;

    public e(o oVar) {
        this.f50539b = oVar;
        oVar.a(this);
    }

    @Override // t6.d
    public final void b(f fVar) {
        this.f50538a.remove(fVar);
    }

    @Override // t6.d
    public final void c(f fVar) {
        this.f50538a.add(fVar);
        n nVar = ((x) this.f50539b).f4609d;
        if (nVar == n.f4564a) {
            fVar.onDestroy();
        } else if (nVar.compareTo(n.f4567d) >= 0) {
            fVar.onStart();
        } else {
            fVar.f();
        }
    }

    @h0(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy(@NonNull v vVar) {
        Iterator it = p.e(this.f50538a).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onDestroy();
        }
        vVar.getLifecycle().b(this);
    }

    @h0(androidx.lifecycle.m.ON_START)
    public void onStart(@NonNull v vVar) {
        Iterator it = p.e(this.f50538a).iterator();
        while (it.hasNext()) {
            ((f) it.next()).onStart();
        }
    }

    @h0(androidx.lifecycle.m.ON_STOP)
    public void onStop(@NonNull v vVar) {
        Iterator it = p.e(this.f50538a).iterator();
        while (it.hasNext()) {
            ((f) it.next()).f();
        }
    }
}
