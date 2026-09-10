package ea;

import com.google.android.gms.internal.measurement.r6;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends androidx.recyclerview.widget.o1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f1 f39344h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var) {
        super(20);
        this.f39344h = f1Var;
    }

    @Override // androidx.recyclerview.widget.o1
    public final Object c(Object obj) throws Throwable {
        String str = (String) obj;
        k9.c0.e(str);
        f1 f1Var = this.f39344h;
        f1Var.H0();
        k9.c0.e(str);
        m mVar = f1Var.f39807b.f39373c;
        e4.T(mVar);
        g9.k kVarO1 = mVar.O1(str);
        if (kVarO1 == null) {
            return null;
        }
        s0 s0Var = ((m1) f1Var.f3623a).f39587f;
        m1.h(s0Var);
        s0Var.f39760n.c(str, "Populate EES config from database on cache miss. appId");
        f1Var.O0(str, f1Var.P0(str, (byte[]) kVarO1.f41770b));
        d1 d1Var = f1Var.f39404k;
        d1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (((v1.j) d1Var.f4855g)) {
            Set<Map.Entry> setEntrySet = ((xf.e) d1Var.f4850b).f53792a.entrySet();
            kotlin.jvm.internal.n.e(setEntrySet, "map.entries");
            for (Map.Entry entry : setEntrySet) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return (r6) linkedHashMap.get(str);
    }
}
