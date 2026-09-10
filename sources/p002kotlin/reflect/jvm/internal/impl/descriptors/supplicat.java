package p002kotlin.reflect.jvm.internal.impl.descriptors;

import byname.dern;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class supplicat {
    public static final void attabal(kattegat kattegatVar, dern fqName, Collection<sealless> packageFragments) {
        Intrinsics.checkNotNullParameter(kattegatVar, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(packageFragments, "packageFragments");
        if (kattegatVar instanceof restrictive) {
            ((restrictive) kattegatVar).saneness(fqName, packageFragments);
        } else {
            packageFragments.addAll(kattegatVar.dern(fqName));
        }
    }

    public static final List<sealless> dern(kattegat kattegatVar, dern fqName) {
        Intrinsics.checkNotNullParameter(kattegatVar, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        attabal(kattegatVar, fqName, arrayList);
        return arrayList;
    }

    public static final boolean saneness(kattegat kattegatVar, dern fqName) {
        Intrinsics.checkNotNullParameter(kattegatVar, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return kattegatVar instanceof restrictive ? ((restrictive) kattegatVar).attabal(fqName) : dern(kattegatVar, fqName).isEmpty();
    }
}
