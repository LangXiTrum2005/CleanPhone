package p002kotlin.reflect.jvm.internal.impl.types;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;

/* JADX INFO: compiled from: TypeAttributes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class clubfoot {
    public static final overspeculate attabal(overspeculate overspeculateVar, marial newAnnotations) {
        overspeculate overspeculateVarTriweekly;
        Intrinsics.checkNotNullParameter(overspeculateVar, "<this>");
        Intrinsics.checkNotNullParameter(newAnnotations, "newAnnotations");
        if (taiyuan.attabal(overspeculateVar) == newAnnotations) {
            return overspeculateVar;
        }
        impromptu impromptuVarSaneness = taiyuan.saneness(overspeculateVar);
        if (impromptuVarSaneness != null && (overspeculateVarTriweekly = overspeculateVar.triweekly(impromptuVarSaneness)) != null) {
            overspeculateVar = overspeculateVarTriweekly;
        }
        return (newAnnotations.iterator().hasNext() || !newAnnotations.isEmpty()) ? overspeculateVar.impassible(new impromptu(newAnnotations)) : overspeculateVar;
    }

    public static final overspeculate saneness(marial marialVar) {
        Intrinsics.checkNotNullParameter(marialVar, "<this>");
        return splinterproof.attabal.attabal(impassible.f31774attabal, marialVar, null, null, 6, null);
    }
}
