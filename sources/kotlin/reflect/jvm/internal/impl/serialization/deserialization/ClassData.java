package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;

/* JADX INFO: loaded from: classes7.dex */
public final class ClassData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NameResolver f44382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Class f44383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BinaryVersion f44384c;
    public final SourceElement d;

    public ClassData(NameResolver nameResolver, ProtoBuf.Class classProto, BinaryVersion binaryVersion, SourceElement sourceElement) {
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(classProto, "classProto");
        Intrinsics.f(sourceElement, "sourceElement");
        this.f44382a = nameResolver;
        this.f44383b = classProto;
        this.f44384c = binaryVersion;
        this.d = sourceElement;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassData)) {
            return false;
        }
        ClassData classData = (ClassData) obj;
        return Intrinsics.a(this.f44382a, classData.f44382a) && Intrinsics.a(this.f44383b, classData.f44383b) && Intrinsics.a(this.f44384c, classData.f44384c) && Intrinsics.a(this.d, classData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f44384c.hashCode() + ((this.f44383b.hashCode() + (this.f44382a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ClassData(nameResolver=" + this.f44382a + ", classProto=" + this.f44383b + ", metadataVersion=" + this.f44384c + ", sourceElement=" + this.d + ')';
    }
}
