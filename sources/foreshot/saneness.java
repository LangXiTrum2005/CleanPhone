package foreshot;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: ClassMapperLite.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Map<String, String> f26286dern;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final saneness f26285attabal = new saneness();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final String f26287saneness = CollectionsKt.preterite(adultoid.kowloon('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listKowloon = adultoid.kowloon("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iDern = dessertspoon.dern.dern(0, listKowloon.size() - 1, 2);
        if (iDern >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                String str = f26287saneness;
                sb.append(str);
                sb.append('/');
                sb.append((String) listKowloon.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listKowloon.get(i2));
                linkedHashMap.put(str + '/' + ((String) listKowloon.get(i)) + "Array", '[' + ((String) listKowloon.get(i2)));
                if (i == iDern) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        linkedHashMap.put(f26287saneness + "/Unit", "V");
        attabal(linkedHashMap, "Any", "java/lang/Object");
        attabal(linkedHashMap, "Nothing", "java/lang/Void");
        attabal(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : adultoid.kowloon("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            attabal(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : adultoid.kowloon("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            attabal(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            attabal(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        attabal(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        attabal(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        attabal(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        attabal(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            StringBuilder sb2 = new StringBuilder();
            String str4 = f26287saneness;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            attabal(linkedHashMap, "Function" + i3, sb2.toString());
            attabal(linkedHashMap, "reflect/KFunction" + i3, str4 + "/reflect/KFunction");
        }
        for (String str5 : adultoid.kowloon("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            attabal(linkedHashMap, str5 + ".Companion", f26287saneness + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f26286dern = linkedHashMap;
    }

    public static final void attabal(Map<String, String> map, String str, String str2) {
        map.put(f26287saneness + '/' + str, 'L' + str2 + ';');
    }

    public static final String saneness(String classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        String str = f26286dern.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + dovishness.merc(classId, '.', '$', false, 4, null) + ';';
    }
}
