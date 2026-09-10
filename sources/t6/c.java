package t6;

import android.content.Context;
import android.net.ConnectivityManager;
import bc.s;
import com.google.android.gms.internal.ads.uf;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f50536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bumptech.glide.j f50537b;

    public c(Context context, com.bumptech.glide.j jVar) {
        this.f50536a = context.getApplicationContext();
        this.f50537b = jVar;
    }

    @Override // t6.f
    public final void f() {
        l lVarE = l.e(this.f50536a);
        com.bumptech.glide.j jVar = this.f50537b;
        synchronized (lVarE) {
            ((HashSet) lVarE.f50551d).remove(jVar);
            if (lVarE.f50549b && ((HashSet) lVarE.f50551d).isEmpty()) {
                s sVar = (s) lVarE.f50550c;
                ((ConnectivityManager) ((i9.i) sVar.f5582c).get()).unregisterNetworkCallback((uf) sVar.f5583d);
                lVarE.f50549b = false;
            }
        }
    }

    @Override // t6.f
    public final void onStart() {
        l lVarE = l.e(this.f50536a);
        com.bumptech.glide.j jVar = this.f50537b;
        synchronized (lVarE) {
            ((HashSet) lVarE.f50551d).add(jVar);
            lVarE.g();
        }
    }

    @Override // t6.f
    public final void onDestroy() {
    }
}
