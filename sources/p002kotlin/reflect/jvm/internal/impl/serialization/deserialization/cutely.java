package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import genesis.attabal;
import genesis.competently;
import genesis.dern;
import genesis.impromptu;
import genesis.taiyuan;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman;
import yeast.formularize;

/* JADX INFO: compiled from: context.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f31460attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final attabal f31461beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final wireman f31462competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final apical f31463dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final TypeDeserializer f31464impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final impromptu f31465marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern f31466saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final MemberDeserializer f31467taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final competently f31468wireman;

    public cutely(impromptu components, dern nameResolver, apical containingDeclaration, competently typeTable, impromptu versionRequirementTable, attabal metadataVersion, wireman wiremanVar, TypeDeserializer typeDeserializer, List<ProtoBuf$TypeParameter> typeParameters) {
        String strAttabal;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(typeParameters, "typeParameters");
        this.f31460attabal = components;
        this.f31466saneness = nameResolver;
        this.f31463dern = containingDeclaration;
        this.f31468wireman = typeTable;
        this.f31465marial = versionRequirementTable;
        this.f31461beachfront = metadataVersion;
        this.f31462competently = wiremanVar;
        this.f31464impromptu = new TypeDeserializer(this, typeDeserializer, typeParameters, "Deserializer for \"" + containingDeclaration.getName() + '\"', (wiremanVar == null || (strAttabal = wiremanVar.attabal()) == null) ? "[container not found]" : strAttabal);
        this.f31467taiyuan = new MemberDeserializer(this);
    }

    public static /* synthetic */ cutely saneness(cutely cutelyVar, apical apicalVar, List list, dern dernVar, competently competentlyVar, impromptu impromptuVar, attabal attabalVar, int i, Object obj) {
        if ((i & 4) != 0) {
            dernVar = cutelyVar.f31466saneness;
        }
        dern dernVar2 = dernVar;
        if ((i & 8) != 0) {
            competentlyVar = cutelyVar.f31468wireman;
        }
        competently competentlyVar2 = competentlyVar;
        if ((i & 16) != 0) {
            impromptuVar = cutelyVar.f31465marial;
        }
        impromptu impromptuVar2 = impromptuVar;
        if ((i & 32) != 0) {
            attabalVar = cutelyVar.f31461beachfront;
        }
        return cutelyVar.attabal(apicalVar, list, dernVar2, competentlyVar2, impromptuVar2, attabalVar);
    }

    public final impromptu apical() {
        return this.f31465marial;
    }

    public final cutely attabal(apical descriptor, List<ProtoBuf$TypeParameter> typeParameterProtos, dern nameResolver, competently typeTable, impromptu versionRequirementTable, attabal metadataVersion) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(typeParameterProtos, "typeParameterProtos");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(versionRequirementTable, "versionRequirementTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        return new cutely(this.f31460attabal, nameResolver, descriptor, typeTable, taiyuan.saneness(metadataVersion) ? versionRequirementTable : this.f31465marial, metadataVersion, this.f31462competently, this.f31464impromptu, typeParameterProtos);
    }

    public final MemberDeserializer beachfront() {
        return this.f31467taiyuan;
    }

    public final dern competently() {
        return this.f31466saneness;
    }

    public final competently cutely() {
        return this.f31468wireman;
    }

    public final impromptu dern() {
        return this.f31460attabal;
    }

    public final formularize impromptu() {
        return this.f31460attabal.adultoid();
    }

    public final apical marial() {
        return this.f31463dern;
    }

    public final TypeDeserializer taiyuan() {
        return this.f31464impromptu;
    }

    public final wireman wireman() {
        return this.f31462competently;
    }
}
