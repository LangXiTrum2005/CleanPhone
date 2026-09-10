package snook;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: ContextReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern extends attabal implements beachfront {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.attabal f37695dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byname.marial f37696wireman;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal declarationDescriptor, oilcan receiverType, byname.marial marialVar, competently competentlyVar) {
        super(receiverType, competentlyVar);
        Intrinsics.checkNotNullParameter(declarationDescriptor, "declarationDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f37695dern = declarationDescriptor;
        this.f37696wireman = marialVar;
    }

    @Override // snook.beachfront
    public byname.marial attabal() {
        return this.f37696wireman;
    }

    public String toString() {
        return "Cxt { " + wireman() + " }";
    }

    public p002kotlin.reflect.jvm.internal.impl.descriptors.attabal wireman() {
        return this.f37695dern;
    }
}
