package xn;

import com.google.android.gms.internal.measurement.f2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f53943c = new f(xj.n.R0(new ArrayList()), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f53944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.gms.internal.auth.i f53945b;

    public f(Set set, com.google.android.gms.internal.auth.i iVar) {
        this.f53944a = set;
        this.f53945b = iVar;
    }

    public final void a(String hostname, jk.a aVar) {
        kotlin.jvm.internal.n.f(hostname, "hostname");
        Iterator it = this.f53944a.iterator();
        if (it.hasNext()) {
            throw f2.j(it);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.n.a(fVar.f53944a, this.f53944a) && kotlin.jvm.internal.n.a(fVar.f53945b, this.f53945b);
    }

    public final int hashCode() {
        int iHashCode = (this.f53944a.hashCode() + 1517) * 41;
        com.google.android.gms.internal.auth.i iVar = this.f53945b;
        return iHashCode + (iVar != null ? iVar.hashCode() : 0);
    }
}
