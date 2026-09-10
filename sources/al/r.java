package al;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public enum r {
    f3675o(true),
    f3676p(true),
    f3677q(false),
    f3678r(true),
    f3679s(true),
    f3680t(true),
    f3681u(true),
    f3682v(true),
    f3683w(true),
    f3684x(true),
    f3685y(true),
    f3686z(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF13(false),
    A(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF15(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF2(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(false),
    B(false),
    C(false),
    D(false),
    E(false),
    F(false),
    G(false),
    H(false),
    I(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF313(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF324(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF335(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF346(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF357(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF368(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF379(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF390(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF401(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF412(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF423(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF435(true),
    /* JADX INFO: Fake field, exist only in values array */
    EF447(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF458(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF469(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF480(false),
    /* JADX INFO: Fake field, exist only in values array */
    EF491(false);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f3663b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f3664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f3665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List f3666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final List f3667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f3668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final List f3669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f3670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f3671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List f3672k;
    public static final List l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final List f3673m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final List f3674n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3687a;

    static {
        for (r rVar : values()) {
            f3663b.put(rVar.name(), rVar);
        }
        r[] rVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (r rVar2 : rVarArrValues) {
            if (rVar2.f3687a) {
                arrayList.add(rVar2);
            }
        }
        xj.n.R0(arrayList);
        xj.k.E0(values());
        r rVar3 = f3676p;
        r rVar4 = f3675o;
        f3664c = xj.o.Q(rVar3, rVar4);
        f3665d = xj.o.Q(I, rVar4);
        f3666e = xj.o.Q(B, rVar4);
        r rVar5 = E;
        r rVar6 = C;
        f3667f = xj.o.Q(rVar5, rVar6, rVar4);
        f3668g = xj.o.Q(D, rVar6, rVar4);
        f3669h = xj.o.Q(F, rVar4);
        f3670i = xj.o.Q(G, rVar4);
        r rVar7 = H;
        r rVar8 = f3678r;
        r rVar9 = f3679s;
        f3671j = xj.o.Q(rVar7, rVar8, rVar9);
        r rVar10 = f3685y;
        f3672k = j1.f.C(rVar10);
        r rVar11 = f3684x;
        l = j1.f.C(rVar11);
        f3673m = j1.f.C(f3683w);
        r rVar12 = A;
        f3674n = j1.f.C(rVar12);
        e eVar = e.CONSTRUCTOR_PARAMETER;
        r rVar13 = f3681u;
        b0.Q(new wj.f(eVar, rVar13), new wj.f(e.FIELD, rVar9), new wj.f(e.PROPERTY, rVar8), new wj.f(e.FILE, rVar12), new wj.f(e.PROPERTY_GETTER, rVar11), new wj.f(e.PROPERTY_SETTER, rVar10), new wj.f(e.RECEIVER, rVar13), new wj.f(e.SETTER_PARAMETER, rVar13), new wj.f(e.PROPERTY_DELEGATE_FIELD, rVar9));
    }

    r(boolean z10) {
        this.f3687a = z10;
    }
}
