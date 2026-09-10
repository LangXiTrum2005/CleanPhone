package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializationContext {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DeserializationComponents f44401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NameResolver f44402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DeclarationDescriptor f44403c;
    public final TypeTable d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final VersionRequirementTable f44404e;
    public final BinaryVersion f;
    public final JvmPackagePartSource g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TypeDeserializer f44405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MemberDeserializer f44406i;

    /* JADX WARN: Code duplicated, block: B:8:0x0071  */
    public DeserializationContext(DeserializationComponents components, NameResolver nameResolver, DeclarationDescriptor containingDeclaration, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion, JvmPackagePartSource jvmPackagePartSource, TypeDeserializer typeDeserializer, List typeParameters) {
        String str;
        Intrinsics.f(components, "components");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(containingDeclaration, "containingDeclaration");
        Intrinsics.f(versionRequirementTable, "versionRequirementTable");
        Intrinsics.f(metadataVersion, "metadataVersion");
        Intrinsics.f(typeParameters, "typeParameters");
        this.f44401a = components;
        this.f44402b = nameResolver;
        this.f44403c = containingDeclaration;
        this.d = typeTable;
        this.f44404e = versionRequirementTable;
        this.f = metadataVersion;
        this.g = jvmPackagePartSource;
        String str2 = "Deserializer for \"" + containingDeclaration.getName() + AbstractJsonLexerKt.STRING;
        if (jvmPackagePartSource != null) {
            str = "Class '" + jvmPackagePartSource.b().b().b() + '\'';
            str = str == null ? "[container not found]" : str;
        }
        this.f44405h = new TypeDeserializer(this, typeDeserializer, typeParameters, str2, str);
        this.f44406i = new MemberDeserializer(this);
    }

    public final DeserializationContext a(DeclarationDescriptor declarationDescriptor, List typeParameterProtos, NameResolver nameResolver, TypeTable typeTable, VersionRequirementTable versionRequirementTable, BinaryVersion metadataVersion) {
        Intrinsics.f(typeParameterProtos, "typeParameterProtos");
        Intrinsics.f(nameResolver, "nameResolver");
        Intrinsics.f(versionRequirementTable, "versionRequirementTable");
        Intrinsics.f(metadataVersion, "metadataVersion");
        int i2 = metadataVersion.f44099b;
        if ((i2 != 1 || metadataVersion.f44100c < 4) && i2 <= 1) {
            versionRequirementTable = this.f44404e;
        }
        return new DeserializationContext(this.f44401a, nameResolver, declarationDescriptor, typeTable, versionRequirementTable, metadataVersion, this.g, this.f44405h, typeParameterProtos);
    }
}
