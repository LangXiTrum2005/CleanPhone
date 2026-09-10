package p002kotlin.reflect.jvm.internal.impl.load.java;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.saneness;
import p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;

/* JADX INFO: compiled from: FieldOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu implements ExternalOverridabilityCondition {
    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Contract attabal() {
        return ExternalOverridabilityCondition.Contract.BOTH;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    public ExternalOverridabilityCondition.Result saneness(attabal superDescriptor, attabal subDescriptor, wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        if (!(subDescriptor instanceof saran) || !(superDescriptor instanceof saran)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        saran saranVar = (saran) subDescriptor;
        saran saranVar2 = (saran) superDescriptor;
        if (!Intrinsics.wireman(saranVar.getName(), saranVar2.getName())) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        if (saneness.attabal(saranVar) && saneness.attabal(saranVar2)) {
            return ExternalOverridabilityCondition.Result.OVERRIDABLE;
        }
        return (saneness.attabal(saranVar) || saneness.attabal(saranVar2)) ? ExternalOverridabilityCondition.Result.INCOMPATIBLE : ExternalOverridabilityCondition.Result.UNKNOWN;
    }
}
