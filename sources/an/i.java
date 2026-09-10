package an;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i extends go.k {
    public static String a0(String str) throws IOException {
        List listC;
        int length;
        Comparable comparable;
        String strSubstring;
        kotlin.jvm.internal.n.f(str, "<this>");
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                listC = arrayList;
            } else {
                listC = j1.f.C(next);
            }
        } else {
            listC = v.f53866a;
        }
        List list = listC;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!h.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (true) {
            length = 0;
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            int length2 = str2.length();
            while (true) {
                if (length >= length2) {
                    length = -1;
                    break;
                }
                if (!go.c.x(str2.charAt(length))) {
                    break;
                }
                length++;
            }
            if (length == -1) {
                length = str2.length();
            }
            arrayList3.add(Integer.valueOf(length));
        }
        Iterator it2 = arrayList3.iterator();
        if (it2.hasNext()) {
            comparable = (Comparable) it2.next();
            while (it2.hasNext()) {
                Comparable comparable2 = (Comparable) it2.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int iIntValue = num != null ? num.intValue() : 0;
        int length3 = str.length();
        listC.size();
        int iP = xj.o.P(listC);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : list) {
            int i10 = length + 1;
            if (length < 0) {
                xj.o.V();
                throw null;
            }
            String str3 = (String) obj2;
            if ((length == 0 || length == iP) && h.y0(str3)) {
                strSubstring = null;
            } else {
                kotlin.jvm.internal.n.f(str3, "<this>");
                if (iIntValue < 0) {
                    throw new IllegalArgumentException(defpackage.e.h(iIntValue, "Requested character count ", " is less than zero.").toString());
                }
                int length4 = str3.length();
                if (iIntValue <= length4) {
                    length4 = iIntValue;
                }
                strSubstring = str3.substring(length4);
                kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
            }
            if (strSubstring != null) {
                arrayList4.add(strSubstring);
            }
            length = i10;
        }
        StringBuilder sb2 = new StringBuilder(length3);
        xj.n.t0(arrayList4, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }

    public static String b0(String str) throws IOException {
        List listC;
        kotlin.jvm.internal.n.f(str, "<this>");
        if (h.y0("|")) {
            throw new IllegalArgumentException("marginPrefix must be non-blank string.");
        }
        d dVar = new d(str);
        if (dVar.hasNext()) {
            Object next = dVar.next();
            if (dVar.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (dVar.hasNext()) {
                    arrayList.add(dVar.next());
                }
                listC = arrayList;
            } else {
                listC = j1.f.C(next);
            }
        } else {
            listC = v.f53866a;
        }
        int length = str.length();
        listC.size();
        int iP = xj.o.P(listC);
        ArrayList arrayList2 = new ArrayList();
        int i10 = 0;
        for (Object obj : listC) {
            int i11 = i10 + 1;
            String strSubstring = null;
            if (i10 < 0) {
                xj.o.V();
                throw null;
            }
            String str2 = (String) obj;
            if ((i10 != 0 && i10 != iP) || !h.y0(str2)) {
                int length2 = str2.length();
                int i12 = 0;
                while (true) {
                    if (i12 >= length2) {
                        i12 = -1;
                        break;
                    }
                    if (!go.c.x(str2.charAt(i12))) {
                        break;
                    }
                    i12++;
                }
                if (i12 != -1 && p.o0(str2, i12, "|", false)) {
                    strSubstring = str2.substring("|".length() + i12);
                    kotlin.jvm.internal.n.e(strSubstring, "substring(...)");
                }
                if (strSubstring == null) {
                    strSubstring = str2;
                }
            }
            if (strSubstring != null) {
                arrayList2.add(strSubstring);
            }
            i10 = i11;
        }
        StringBuilder sb2 = new StringBuilder(length);
        xj.n.t0(arrayList2, sb2, "\n", null, null, null, 124);
        return sb2.toString();
    }
}
