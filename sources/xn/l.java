package xn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Iterable, kk.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f53987a;

    public l(String[] strArr) {
        this.f53987a = strArr;
    }

    public final String b(String name) {
        kotlin.jvm.internal.n.f(name, "name");
        String[] strArr = this.f53987a;
        int length = strArr.length - 2;
        int iJ = go.k.J(length, 0, -2);
        if (iJ > length) {
            return null;
        }
        while (!name.equalsIgnoreCase(strArr[length])) {
            if (length == iJ) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l) {
            return Arrays.equals(this.f53987a, ((l) obj).f53987a);
        }
        return false;
    }

    public final String h(int i10) {
        return this.f53987a[i10 * 2];
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f53987a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        wj.f[] fVarArr = new wj.f[size];
        for (int i10 = 0; i10 < size; i10++) {
            fVarArr[i10] = new wj.f(h(i10), q(i10));
        }
        return kotlin.jvm.internal.m.a(fVarArr);
    }

    public final h2.d m() {
        h2.d dVar = new h2.d(4, false);
        xj.t.b0(dVar.f42079a, this.f53987a);
        return dVar;
    }

    public final Map p() {
        an.p.j0();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strH = h(i10);
            Locale US = Locale.US;
            kotlin.jvm.internal.n.e(US, "US");
            String lowerCase = strH.toLowerCase(US);
            kotlin.jvm.internal.n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            List arrayList = (List) treeMap.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList(2);
                treeMap.put(lowerCase, arrayList);
            }
            arrayList.add(q(i10));
        }
        return treeMap;
    }

    public final String q(int i10) {
        return this.f53987a[(i10 * 2) + 1];
    }

    public final int size() {
        return this.f53987a.length / 2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            String strH = h(i10);
            String strQ = q(i10);
            sb2.append(strH);
            sb2.append(": ");
            if (yn.a.p(strH)) {
                strQ = "██";
            }
            sb2.append(strQ);
            sb2.append("\n");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.n.e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
