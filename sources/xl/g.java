package xl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import wl.i;
import wl.j;
import xj.b0;
import xj.m;
import xj.n;
import xj.o;
import xj.p;
import xj.x;
import xj.y;
import xj.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements vl.f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f53905d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f53906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f53907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f53908c;

    static {
        String strU0 = n.u0(o.Q('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        List listQ = o.Q(wi.d.h(strU0, "/Any"), wi.d.h(strU0, "/Nothing"), wi.d.h(strU0, "/Unit"), wi.d.h(strU0, "/Throwable"), wi.d.h(strU0, "/Number"), wi.d.h(strU0, "/Byte"), wi.d.h(strU0, "/Double"), wi.d.h(strU0, "/Float"), wi.d.h(strU0, "/Int"), wi.d.h(strU0, "/Long"), wi.d.h(strU0, "/Short"), wi.d.h(strU0, "/Boolean"), wi.d.h(strU0, "/Char"), wi.d.h(strU0, "/CharSequence"), wi.d.h(strU0, "/String"), wi.d.h(strU0, "/Comparable"), wi.d.h(strU0, "/Enum"), wi.d.h(strU0, "/Array"), wi.d.h(strU0, "/ByteArray"), wi.d.h(strU0, "/DoubleArray"), wi.d.h(strU0, "/FloatArray"), wi.d.h(strU0, "/IntArray"), wi.d.h(strU0, "/LongArray"), wi.d.h(strU0, "/ShortArray"), wi.d.h(strU0, "/BooleanArray"), wi.d.h(strU0, "/CharArray"), wi.d.h(strU0, "/Cloneable"), wi.d.h(strU0, "/Annotation"), wi.d.h(strU0, "/collections/Iterable"), wi.d.h(strU0, "/collections/MutableIterable"), wi.d.h(strU0, "/collections/Collection"), wi.d.h(strU0, "/collections/MutableCollection"), wi.d.h(strU0, "/collections/List"), wi.d.h(strU0, "/collections/MutableList"), wi.d.h(strU0, "/collections/Set"), wi.d.h(strU0, "/collections/MutableSet"), wi.d.h(strU0, "/collections/Map"), wi.d.h(strU0, "/collections/MutableMap"), wi.d.h(strU0, "/collections/Map.Entry"), wi.d.h(strU0, "/collections/MutableMap.MutableEntry"), wi.d.h(strU0, "/collections/Iterator"), wi.d.h(strU0, "/collections/MutableIterator"), wi.d.h(strU0, "/collections/ListIterator"), wi.d.h(strU0, "/collections/MutableListIterator"));
        f53905d = listQ;
        m mVarT0 = n.T0(listQ);
        int iO = b0.O(p.W(mVarT0, 10));
        if (iO < 16) {
            iO = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iO);
        Iterator it = mVarT0.iterator();
        while (true) {
            z zVar = (z) it;
            if (!zVar.f53872b.hasNext()) {
                return;
            }
            y yVar = (y) zVar.next();
            linkedHashMap.put((String) yVar.f53870b, Integer.valueOf(yVar.f53869a));
        }
    }

    public g(j jVar, String[] strings) {
        kotlin.jvm.internal.n.f(strings, "strings");
        List list = jVar.f53462c;
        Set setR0 = list.isEmpty() ? x.f53868a : n.R0(list);
        List<i> list2 = jVar.f53461b;
        kotlin.jvm.internal.n.e(list2, "types.recordList");
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(list2.size());
        for (i iVar : list2) {
            int i10 = iVar.f53449c;
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(iVar);
            }
        }
        arrayList.trimToSize();
        this.f53906a = strings;
        this.f53907b = setR0;
        this.f53908c = arrayList;
    }

    @Override // vl.f
    public final boolean b(int i10) {
        return this.f53907b.contains(Integer.valueOf(i10));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    @Override // vl.f
    public final String getString(int i10) {
        String string;
        i iVar = (i) this.f53908c.get(i10);
        int i11 = iVar.f53448b;
        if ((i11 & 4) == 4) {
            Object obj = iVar.f53451e;
            if (obj instanceof String) {
                string = (String) obj;
            } else {
                zl.d dVar = (zl.d) obj;
                String strX = dVar.x();
                if (dVar.r()) {
                    iVar.f53451e = strX;
                }
                string = strX;
            }
        } else if ((i11 & 2) == 2) {
            List list = f53905d;
            int size = list.size();
            int i12 = iVar.f53450d;
            if (i12 < 0 || i12 >= size) {
                string = this.f53906a[i10];
            } else {
                string = (String) list.get(i12);
            }
        } else {
            string = this.f53906a[i10];
        }
        if (iVar.f53453g.size() >= 2) {
            List substringIndexList = iVar.f53453g;
            kotlin.jvm.internal.n.e(substringIndexList, "substringIndexList");
            Integer begin = (Integer) substringIndexList.get(0);
            Integer end = (Integer) substringIndexList.get(1);
            kotlin.jvm.internal.n.e(begin, "begin");
            if (begin.intValue() >= 0) {
                int iIntValue = begin.intValue();
                kotlin.jvm.internal.n.e(end, "end");
                if (iIntValue <= end.intValue() && end.intValue() <= string.length()) {
                    string = string.substring(begin.intValue(), end.intValue());
                    kotlin.jvm.internal.n.e(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        if (iVar.f53455i.size() >= 2) {
            List replaceCharList = iVar.f53455i;
            kotlin.jvm.internal.n.e(replaceCharList, "replaceCharList");
            Integer num = (Integer) replaceCharList.get(0);
            Integer num2 = (Integer) replaceCharList.get(1);
            kotlin.jvm.internal.n.e(string, "string");
            string = an.p.m0(string, (char) num.intValue(), (char) num2.intValue());
        }
        wl.h hVar = iVar.f53452f;
        if (hVar == null) {
            hVar = wl.h.NONE;
        }
        int iOrdinal = hVar.ordinal();
        if (iOrdinal == 1) {
            kotlin.jvm.internal.n.e(string, "string");
            string = an.p.m0(string, '$', '.');
        } else if (iOrdinal == 2) {
            if (string.length() >= 2) {
                string = string.substring(1, string.length() - 1);
                kotlin.jvm.internal.n.e(string, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            string = an.p.m0(string, '$', '.');
        }
        kotlin.jvm.internal.n.e(string, "string");
        return string;
    }

    @Override // vl.f
    public final String h(int i10) {
        return getString(i10);
    }
}
