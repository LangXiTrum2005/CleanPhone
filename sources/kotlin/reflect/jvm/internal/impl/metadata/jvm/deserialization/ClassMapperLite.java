package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassMapperLite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44147a = CollectionsKt.D(CollectionsKt.I('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f44148b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listI = CollectionsKt.I("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iA = ProgressionUtilKt.a(0, listI.size() - 1, 2);
        if (iA >= 0) {
            int i2 = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f44147a;
                sb.append(str);
                sb.append(IOUtils.DIR_SEPARATOR_UNIX);
                sb.append((String) listI.get(i2));
                int i3 = i2 + 1;
                linkedHashMap.put(sb.toString(), listI.get(i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
                linkedHashMap.put(a.r(sb2, (String) listI.get(i2), "Array"), d9.i.d + ((String) listI.get(i3)));
                if (i2 == iA) {
                    break;
                } else {
                    i2 += 2;
                }
            }
        }
        linkedHashMap.put(f44147a + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : CollectionsKt.I("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : CollectionsKt.I("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, a.C("collections/", str3), "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i4 = 0; i4 < 23; i4++) {
            String strH = a.h(i4, "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f44147a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i4);
            a(linkedHashMap, strH, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i4, str4 + "/reflect/KFunction");
        }
        for (String str5 : CollectionsKt.I("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, a.m(str5, ".Companion"), androidx.media3.extractor.text.ttml.a.q(new StringBuilder(), f44147a, "/jvm/internal/", str5, "CompanionObject"));
        }
        f44148b = linkedHashMap;
    }

    public static final void a(LinkedHashMap linkedHashMap, String str, String str2) {
        linkedHashMap.put(f44147a + IOUtils.DIR_SEPARATOR_UNIX + str, "L" + str2 + ';');
    }

    public static final String b(String classId) {
        Intrinsics.f(classId, "classId");
        String str = (String) f44148b.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + StringsKt.H(classId, '.', '$') + ';';
    }
}
