package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import lyreflower.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.beachfront;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.marial;

/* JADX INFO: compiled from: JavaClassDataFinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impromptu implements beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final kowloon f30790attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final DeserializedDescriptorResolver f30791saneness;

    public impromptu(kowloon kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f30790attabal = kotlinClassFinder;
        this.f30791saneness = deserializedDescriptorResolver;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.beachfront
    public marial attabal(saneness classId) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        monoploid monoploidVarAttabal = arytenoidectomy.attabal(this.f30790attabal, classId, dern.attabal(this.f30791saneness.wireman().competently()));
        if (monoploidVarAttabal == null) {
            return null;
        }
        Intrinsics.wireman(monoploidVarAttabal.competently(), classId);
        return this.f30791saneness.cutely(monoploidVarAttabal);
    }
}
