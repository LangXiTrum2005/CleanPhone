package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: SignatureBuildingComponents.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SignatureBuildingComponents {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final SignatureBuildingComponents f30687attabal = new SignatureBuildingComponents();

    public final String apical(String internalName, String jvmDescriptor) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }

    public final Set<String> beachfront(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return wireman(taiyuan(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String competently(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/function/" + name;
    }

    public final String cutely(String name, List<String> parameters, String ret) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(ret, "ret");
        return name + '(' + CollectionsKt.preterite(parameters, "", null, null, 0, null, new Function1<String, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents$jvmDescriptor$1
            @Override // p002kotlin.jvm.functions.Function1
            public final CharSequence invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return SignatureBuildingComponents.f30687attabal.dern(it);
            }
        }, 30, null) + ')' + dern(ret);
    }

    public final String dern(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return 'L' + str + ';';
    }

    public final String impromptu(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/lang/" + name;
    }

    public final Set<String> marial(String name, String... signatures) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        return wireman(impromptu(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    public final String[] saneness(String... signatures) {
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public final String taiyuan(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return "java/util/" + name;
    }

    public final Set<String> wireman(String internalName, String... signatures) {
        Intrinsics.checkNotNullParameter(internalName, "internalName");
        Intrinsics.checkNotNullParameter(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }
}
