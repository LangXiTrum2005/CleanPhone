package pm;

import com.ironsource.InterfaceC0435l1;
import com.ironsource.X3;
import java.io.IOException;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 extends a1 implements sm.d, sm.e {
    @Override // pm.a1
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public abstract c0 m0(j0 j0Var);

    public String toString() throws IOException {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = getAnnotations().iterator();
        while (it.hasNext()) {
            String[] strArr = {X3.j.f27834d, am.h.f3708e.x((al.c) it.next(), null), "] "};
            for (int i10 = 0; i10 < 3; i10++) {
                sb2.append(strArr[i10]);
            }
        }
        sb2.append(P());
        if (!t().isEmpty()) {
            xj.n.t0(t(), sb2, ", ", "<", ">", null, InterfaceC0435l1.d.b.f29113j);
        }
        if (Q()) {
            sb2.append("?");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // pm.a1
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public abstract c0 i0(boolean z10);
}
