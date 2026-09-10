package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import byname.dern;
import gibeonite.attabal;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaAnnotationOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu {
    /* JADX WARN: Code duplicated, block: B:11:0x002e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    public static final wireman attabal(Annotation[] annotationArr, dern fqName) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        for (Annotation annotation : annotationArr) {
            if (Intrinsics.wireman(ReflectClassUtilKt.attabal(attabal.saneness(attabal.attabal(annotation))).saneness(), fqName)) {
                if (annotation != null) {
                    return new wireman(annotation);
                }
                return null;
            }
        }
        annotation = null;
        if (annotation != null) {
            return new wireman(annotation);
        }
        return null;
    }

    public static final List<wireman> saneness(Annotation[] annotationArr) {
        Intrinsics.checkNotNullParameter(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        for (Annotation annotation : annotationArr) {
            arrayList.add(new wireman(annotation));
        }
        return arrayList;
    }
}
