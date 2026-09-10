package kotlin.reflect.jvm.internal.impl.load.kotlin;

import androidx.media3.extractor.text.ttml.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class SignatureBuildingComponents {
    public static String[] a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static LinkedHashSet b(String internalName, String... signatures) {
        Intrinsics.f(internalName, "internalName");
        Intrinsics.f(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet c(String str, String... signatures) {
        Intrinsics.f(signatures, "signatures");
        return b("java/lang/".concat(str), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public static LinkedHashSet d(String str, String... strArr) {
        return b("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static String e(String str, String ret, ArrayList arrayList) {
        Intrinsics.f(ret, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(CollectionsKt.D(arrayList, "", null, null, SignatureBuildingComponents$jvmDescriptor$1.X, 30));
        sb.append(')');
        if (ret.length() > 1) {
            ret = a.i(';', "L", ret);
        }
        sb.append(ret);
        return sb.toString();
    }

    public static String f(String internalName, String jvmDescriptor) {
        Intrinsics.f(internalName, "internalName");
        Intrinsics.f(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}
