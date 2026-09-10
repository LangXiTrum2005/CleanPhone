package p002kotlin.reflect.jvm.internal.impl.load.java.lazy;

import genesic.wireman;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: LazyJavaAnnotations.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {
    public static final marial attabal(wireman wiremanVar, wireman annotationsOwner) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        Intrinsics.checkNotNullParameter(annotationsOwner, "annotationsOwner");
        return new LazyJavaAnnotations(wiremanVar, annotationsOwner, false, 4, null);
    }
}
