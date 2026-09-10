package t6;

import a7.p;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f50552a = Collections.newSetFromMap(new WeakHashMap());

    @Override // t6.f
    public final void f() {
        Iterator it = p.e(this.f50552a).iterator();
        while (it.hasNext()) {
            ((x6.a) it.next()).f();
        }
    }

    @Override // t6.f
    public final void onDestroy() {
        Iterator it = p.e(this.f50552a).iterator();
        while (it.hasNext()) {
            ((x6.a) it.next()).onDestroy();
        }
    }

    @Override // t6.f
    public final void onStart() {
        Iterator it = p.e(this.f50552a).iterator();
        while (it.hasNext()) {
            ((x6.a) it.next()).onStart();
        }
    }
}
