package rb;

import android.os.Bundle;
import ea.a2;
import ea.z1;
import java.util.HashSet;
import m0.s1;
import oa.u0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49527b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f49526a = i10;
        this.f49527b = obj;
    }

    @Override // ea.a2
    public final void a(long j10, Bundle bundle, String str, String str2) {
        int i10 = this.f49526a;
        Object obj = this.f49527b;
        switch (i10) {
            case 0:
                s1 s1Var = (s1) obj;
                if (((HashSet) s1Var.f45751b).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    u0 u0Var = a.f49520a;
                    String strG = z1.g(str2, z1.f39941f, z1.f39936a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((v6.c) s1Var.f45752c).p(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.f49520a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j10);
                    bundle3.putBundle("params", bundle);
                    ((v6.c) ((c) obj).f49529b).p(3, bundle3);
                    break;
                }
                break;
        }
    }
}
