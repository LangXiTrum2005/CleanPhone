package p002kotlin.reflect.jvm.internal.impl.load.java;

import genesic.trm;
import java.util.Iterator;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.treadless;
import p002kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class rotuma {
    public static final dern attabal(wireman c, trm wildcardType) {
        dern next;
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(wildcardType, "wildcardType");
        if (wildcardType.gintrap() == null) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported");
        }
        Iterator<dern> it = new LazyJavaAnnotations(c, wildcardType, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            dern dernVar = next;
            for (byname.dern dernVar2 : arytenoidectomy.beachfront()) {
                if (Intrinsics.wireman(dernVar.marial(), dernVar2)) {
                    return next;
                }
            }
        }
        next = null;
        return next;
    }

    public static final boolean dern(JavaTypeEnhancementState javaTypeEnhancementState) {
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.dern().invoke(arytenoidectomy.marial()) == ReportLevel.STRICT;
    }

    public static final boolean saneness(CallableMemberDescriptor memberDescriptor) {
        Intrinsics.checkNotNullParameter(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof dovishness) && Intrinsics.wireman(memberDescriptor.preterite(JavaMethodDescriptor.f30404mathsort), Boolean.TRUE);
    }

    public static final molybdenite wireman(treadless treadlessVar) {
        Intrinsics.checkNotNullParameter(treadlessVar, "<this>");
        molybdenite molybdeniteVarCompetently = impassible.competently(treadlessVar);
        Intrinsics.checkNotNullExpressionValue(molybdeniteVarCompetently, "toDescriptorVisibility(...)");
        return molybdeniteVarCompetently;
    }
}
