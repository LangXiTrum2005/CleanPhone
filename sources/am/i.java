package am;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum i {
    f3713d(true),
    f3714e(true),
    f3715f(true),
    f3716g(false),
    f3717h(true),
    f3718i(true),
    f3719j(true),
    f3720k(true),
    l(true),
    f3721m(true),
    f3722n(true),
    f3723o(true),
    f3724p(true),
    f3725q(true);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f3711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f3712c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3727a;

    static {
        i[] iVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (i iVar : iVarArrValues) {
            if (iVar.f3727a) {
                arrayList.add(iVar);
            }
        }
        f3711b = xj.n.R0(arrayList);
        f3712c = xj.k.E0(values());
    }

    i(boolean z10) {
        this.f3727a = z10;
    }
}
