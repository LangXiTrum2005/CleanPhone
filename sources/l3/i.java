package l3;

import go.k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.n;
import tl.p0;
import tl.q0;
import tl.w0;
import xj.o;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k3.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45019a;

    public i(w0 typeTable) {
        n.f(typeTable, "typeTable");
        List list = typeTable.f51523c;
        if ((typeTable.f51522b & 1) == 1) {
            int i10 = typeTable.f51524d;
            n.e(list, "typeTable.typeList");
            List list2 = list;
            ArrayList arrayList = new ArrayList(p.W(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    o.V();
                    throw null;
                }
                q0 q0VarE = (q0) obj;
                if (i11 >= i10) {
                    q0VarE.getClass();
                    p0 p0VarU = q0.u(q0VarE);
                    p0VarU.f51390d |= 2;
                    p0VarU.f51392f = true;
                    q0VarE = p0VarU.e();
                    if (!q0VarE.isInitialized()) {
                        throw new aa.b();
                    }
                }
                arrayList.add(q0VarE);
                i11 = i12;
            }
            list = arrayList;
        }
        n.e(list, "run {\n        val origin… else originalTypes\n    }");
        this.f45019a = list;
    }

    public q0 a(int i10) {
        return (q0) this.f45019a.get(i10);
    }

    @Override // k3.d
    public List getCues(long j10) {
        return j10 >= 0 ? this.f45019a : Collections.EMPTY_LIST;
    }

    @Override // k3.d
    public long getEventTime(int i10) {
        k.i(i10 == 0);
        return 0L;
    }

    @Override // k3.d
    public int getEventTimeCount() {
        return 1;
    }

    @Override // k3.d
    public int getNextEventTimeIndex(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    public i(List list) {
        this.f45019a = list;
    }
}
