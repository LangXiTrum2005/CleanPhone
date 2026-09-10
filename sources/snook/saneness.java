package snook;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: ContextClassReceiver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class saneness extends attabal implements beachfront {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman f37700dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final byname.marial f37701wireman;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman classDescriptor, oilcan receiverType, byname.marial marialVar, competently competentlyVar) {
        super(receiverType, competentlyVar);
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(receiverType, "receiverType");
        this.f37700dern = classDescriptor;
        this.f37701wireman = marialVar;
    }

    @Override // snook.beachfront
    public byname.marial attabal() {
        return this.f37701wireman;
    }

    public String toString() {
        return getType() + ": Ctx { " + this.f37700dern + " }";
    }
}
