package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import genesis.attabal;
import genesis.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;

/* JADX INFO: compiled from: ClassData.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f31609attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final attabal f31610dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final ProtoBuf$Class f31611saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final walach f31612wireman;

    public marial(dern nameResolver, ProtoBuf$Class classProto, attabal metadataVersion, walach sourceElement) {
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(classProto, "classProto");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(sourceElement, "sourceElement");
        this.f31609attabal = nameResolver;
        this.f31611saneness = classProto;
        this.f31610dern = metadataVersion;
        this.f31612wireman = sourceElement;
    }

    public final dern attabal() {
        return this.f31609attabal;
    }

    public final attabal dern() {
        return this.f31610dern;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof marial)) {
            return false;
        }
        marial marialVar = (marial) obj;
        return Intrinsics.wireman(this.f31609attabal, marialVar.f31609attabal) && Intrinsics.wireman(this.f31611saneness, marialVar.f31611saneness) && Intrinsics.wireman(this.f31610dern, marialVar.f31610dern) && Intrinsics.wireman(this.f31612wireman, marialVar.f31612wireman);
    }

    public int hashCode() {
        return (((((this.f31609attabal.hashCode() * 31) + this.f31611saneness.hashCode()) * 31) + this.f31610dern.hashCode()) * 31) + this.f31612wireman.hashCode();
    }

    public final ProtoBuf$Class saneness() {
        return this.f31611saneness;
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f31609attabal + ", classProto=" + this.f31611saneness + ", metadataVersion=" + this.f31610dern + ", sourceElement=" + this.f31612wireman + ')';
    }

    public final walach wireman() {
        return this.f31612wireman;
    }
}
