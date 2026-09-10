package jl;

import al.q;
import al.r;
import fl.s;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import wk.l;
import xj.b0;
import xj.p;
import xj.t;
import xj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f43974a = b0.Q(new wj.f("PACKAGE", EnumSet.noneOf(r.class)), new wj.f("TYPE", EnumSet.of(r.f3675o, r.A)), new wj.f("ANNOTATION_TYPE", EnumSet.of(r.f3676p)), new wj.f("TYPE_PARAMETER", EnumSet.of(r.f3677q)), new wj.f("FIELD", EnumSet.of(r.f3679s)), new wj.f("LOCAL_VARIABLE", EnumSet.of(r.f3680t)), new wj.f("PARAMETER", EnumSet.of(r.f3681u)), new wj.f("CONSTRUCTOR", EnumSet.of(r.f3682v)), new wj.f("METHOD", EnumSet.of(r.f3683w, r.f3684x, r.f3685y)), new wj.f("TYPE_USE", EnumSet.of(r.f3686z)));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f43975b = b0.Q(new wj.f("RUNTIME", q.f3659a), new wj.f("CLASS", q.f3660b), new wj.f("SOURCE", q.f3661c));

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public static dm.b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof s) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f43974a.get(yl.f.e(((s) it.next()).f41006b.name()).b());
            if (iterable == null) {
                iterable = x.f53868a;
            }
            t.a0(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(p.W(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new dm.i(yl.b.j(l.f53357u), yl.f.e(((r) it2.next()).name())));
        }
        return new dm.b(arrayList3, d.f43973e);
    }
}
