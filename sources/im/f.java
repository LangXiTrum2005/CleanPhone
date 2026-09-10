package im;

import d5.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f43158c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f43161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f43162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f43163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f43165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f43166k;
    public static final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f43167m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f43168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f43169o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f43170p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final f f43171q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final ArrayList f43172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ArrayList f43173s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f43174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f43175b;

    static {
        e eVar;
        int i10 = f43159d;
        int i11 = i10 << 1;
        f43160e = i10;
        int i12 = i10 << 2;
        f43161f = i11;
        int i13 = i10 << 3;
        f43162g = i12;
        int i14 = i10 << 4;
        f43163h = i13;
        int i15 = i10 << 5;
        f43164i = i14;
        f43165j = i15;
        f43159d = i10 << 7;
        int i16 = (i10 << 6) - 1;
        f43166k = i16;
        int i17 = i10 | i11 | i12;
        l = i17;
        f43167m = new f(i16);
        f43168n = new f(i14 | i15);
        new f(i10);
        new f(i11);
        new f(i12);
        f43169o = new f(i17);
        new f(i13);
        f43170p = new f(i14);
        f43171q = new f(i15);
        new f(i11 | i14 | i15);
        Field[] fields = f.class.getFields();
        kotlin.jvm.internal.n.e(fields, "T::class.java.fields");
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            e eVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            Field field2 = (Field) it.next();
            Object obj = field2.get(null);
            f fVar = obj instanceof f ? (f) obj : null;
            if (fVar != null) {
                int i18 = fVar.f43175b;
                String name = field2.getName();
                kotlin.jvm.internal.n.e(name, "field.name");
                eVar2 = new e(i18, name);
            }
            if (eVar2 != null) {
                arrayList2.add(eVar2);
            }
        }
        f43172r = arrayList2;
        Field[] fields2 = f.class.getFields();
        kotlin.jvm.internal.n.e(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (kotlin.jvm.internal.n.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            kotlin.jvm.internal.n.d(obj3, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj3).intValue();
            if (iIntValue == ((-iIntValue) & iIntValue)) {
                String name2 = field4.getName();
                kotlin.jvm.internal.n.e(name2, "field.name");
                eVar = new e(iIntValue, name2);
            } else {
                eVar = null;
            }
            if (eVar != null) {
                arrayList5.add(eVar);
            }
        }
        f43173s = arrayList5;
    }

    public f(int i10, List excludes) {
        kotlin.jvm.internal.n.f(excludes, "excludes");
        this.f43174a = excludes;
        Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i10 &= ~((d) it.next()).a();
        }
        this.f43175b = i10;
    }

    public final boolean a(int i10) {
        return (this.f43175b & i10) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.n.d(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        f fVar = (f) obj;
        return kotlin.jvm.internal.n.a(this.f43174a, fVar.f43174a) && this.f43175b == fVar.f43175b;
    }

    public final int hashCode() {
        return (this.f43174a.hashCode() * 31) + this.f43175b;
    }

    public final String toString() throws IOException {
        Object next;
        Iterator it = f43172r.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((e) next).f43156a != this.f43175b);
        e eVar = (e) next;
        String strU0 = eVar != null ? eVar.f43157b : null;
        if (strU0 == null) {
            ArrayList arrayList = new ArrayList();
            for (e eVar2 : f43173s) {
                String str = a(eVar2.f43156a) ? eVar2.f43157b : null;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            strU0 = xj.n.u0(arrayList, " | ", null, null, null, 62);
        }
        StringBuilder sbK = u.k("DescriptorKindFilter(", strU0, ", ");
        sbK.append(this.f43174a);
        sbK.append(')');
        return sbK.toString();
    }

    public /* synthetic */ f(int i10) {
        this(i10, v.f53866a);
    }
}
