package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.dern;
import byname.saneness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.supplicat;

/* JADX INFO: compiled from: DeserializedClassDataFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class apical implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kattegat f31446attabal;

    public apical(kattegat packageFragmentProvider) {
        Intrinsics.checkNotNullParameter(packageFragmentProvider, "packageFragmentProvider");
        this.f31446attabal = packageFragmentProvider;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.beachfront
    public marial attabal(saneness classId) {
        marial marialVarAttabal;
        Intrinsics.checkNotNullParameter(classId, "classId");
        kattegat kattegatVar = this.f31446attabal;
        dern dernVarImpromptu = classId.impromptu();
        Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
        for (sealless seallessVar : supplicat.dern(kattegatVar, dernVarImpromptu)) {
            if ((seallessVar instanceof formularize) && (marialVarAttabal = ((formularize) seallessVar).outmarry().attabal(classId)) != null) {
                return marialVarAttabal;
            }
        }
        return null;
    }
}
