package xl;

import an.p;
import com.ironsource.X3;
import d5.u;
import go.k;
import java.util.LinkedHashMap;
import java.util.List;
import xj.n;
import xj.o;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f53895a = n.u0(o.Q('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f53896b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listQ = o.Q("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iJ = k.J(0, listQ.size() - 1, 2);
        if (iJ >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f53895a;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listQ.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listQ.get(i11));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(defpackage.e.q((String) listQ.get(i10), "Array", sb3), X3.j.f27834d + ((String) listQ.get(i11)));
                if (i10 == iJ) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f53895a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : o.Q("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : o.Q("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, defpackage.e.n("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            String strE = l1.d.e(i12, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f53895a;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i12);
            a(linkedHashMap, strE, sb4.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : o.Q("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, wi.d.h(str5, ".Companion"), u.h(new StringBuilder(), f53895a, "/jvm/internal/", str5, "CompanionObject"));
        }
        f53896b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f53895a + '/' + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        kotlin.jvm.internal.n.f(classId, "classId");
        String str = (String) f53896b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + p.m0(classId, '.', '$') + ';';
    }
}
