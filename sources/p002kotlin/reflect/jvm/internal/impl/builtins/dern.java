package p002kotlin.reflect.jvm.internal.impl.builtins;

import byname.saneness;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.marial;

/* JADX INFO: compiled from: CompanionObjectMappingUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {
    public static final boolean attabal(saneness sanenessVar, wireman classDescriptor) {
        Intrinsics.checkNotNullParameter(sanenessVar, "<this>");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!marial.rotuma(classDescriptor)) {
            return false;
        }
        Set<saneness> setSaneness = sanenessVar.saneness();
        saneness sanenessVarApical = DescriptorUtilsKt.apical(classDescriptor);
        return CollectionsKt.permissivist(setSaneness, sanenessVarApical != null ? sanenessVarApical.competently() : null);
    }
}
