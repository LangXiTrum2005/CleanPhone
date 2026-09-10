package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import byname.saneness;
import com.ironsource.X3;
import foreshot.marial;
import genesis.dern;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.peridotite;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman;
import p002kotlin.text.StringsKt;

/* JADX INFO: compiled from: JvmPackagePartSource.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class apical implements wireman {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final DeserializedContainerAbiStability f30688beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final monoploid f30689competently;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final iaido.wireman f30690dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final String f30691impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final boolean f30692marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final iaido.wireman f30693saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final arytenoidectomy<marial> f30694wireman;

    public apical(iaido.wireman className, iaido.wireman wiremanVar, ProtoBuf$Package packageProto, dern nameResolver, arytenoidectomy<marial> arytenoidectomyVar, boolean z, DeserializedContainerAbiStability abiStability, monoploid monoploidVar) {
        String string;
        Intrinsics.checkNotNullParameter(className, "className");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        this.f30693saneness = className;
        this.f30690dern = wiremanVar;
        this.f30694wireman = arytenoidectomyVar;
        this.f30692marial = z;
        this.f30688beachfront = abiStability;
        this.f30689competently = monoploidVar;
        GeneratedMessageLite.marial<ProtoBuf$Package, Integer> packageModuleName = JvmProtoBuf.f31031impassible;
        Intrinsics.checkNotNullExpressionValue(packageModuleName, "packageModuleName");
        Integer num = (Integer) genesis.marial.attabal(packageProto, packageModuleName);
        this.f30691impromptu = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? X3.i.Z : string;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.wireman
    public String attabal() {
        return "Class '" + wireman().saneness().saneness() + '\'';
    }

    public iaido.wireman beachfront() {
        return this.f30690dern;
    }

    public final monoploid competently() {
        return this.f30689competently;
    }

    public final byname.marial impromptu() {
        String strBeachfront = marial().beachfront();
        Intrinsics.checkNotNullExpressionValue(strBeachfront, "getInternalName(...)");
        byname.marial marialVarCutely = byname.marial.cutely(StringsKt.microchemistry(strBeachfront, '/', null, 2, null));
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        return marialVarCutely;
    }

    public iaido.wireman marial() {
        return this.f30693saneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.walach
    public peridotite saneness() {
        peridotite NO_SOURCE_FILE = peridotite.f30200attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public String toString() {
        return apical.class.getSimpleName() + ": " + marial();
    }

    public final saneness wireman() {
        return new saneness(marial().competently(), impromptu());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public apical(monoploid kotlinClass, ProtoBuf$Package packageProto, dern nameResolver, arytenoidectomy<marial> arytenoidectomyVar, boolean z, DeserializedContainerAbiStability abiStability) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        Intrinsics.checkNotNullParameter(packageProto, "packageProto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(abiStability, "abiStability");
        iaido.wireman wiremanVarSaneness = iaido.wireman.saneness(kotlinClass.competently());
        Intrinsics.checkNotNullExpressionValue(wiremanVarSaneness, "byClassId(...)");
        String strMarial = kotlinClass.saneness().marial();
        iaido.wireman wiremanVarWireman = null;
        if (strMarial != null && strMarial.length() > 0) {
            wiremanVarWireman = iaido.wireman.wireman(strMarial);
        }
        this(wiremanVarSaneness, wiremanVarWireman, packageProto, nameResolver, arytenoidectomyVar, z, abiStability, kotlinClass);
    }
}
