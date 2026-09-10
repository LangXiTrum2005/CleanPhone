package um;

import kotlin.jvm.internal.n;
import pm.n0;
import pm.o0;
import pm.q0;
import pm.r0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends o0 {
    @Override // pm.o0
    public final q0 g(n0 key) {
        n.f(key, "key");
        cm.b bVar = key instanceof cm.b ? (cm.b) key : null;
        if (bVar == null) {
            return null;
        }
        return bVar.a().c() ? new r0(3, bVar.a().b()) : bVar.a();
    }
}
