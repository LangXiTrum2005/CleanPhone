package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import byname.marial;
import genesis.dern;
import genesis.impromptu;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.kattegat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.supplicat;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* JADX INFO: compiled from: ClassDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ClassDeserializer {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final saneness f31421dern = new saneness(null);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Set<byname.saneness> f31422wireman = privatdozent.wireman(byname.saneness.impassible(competently.attabal.f29779wireman.formularize()));

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final impromptu f31423attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Function1<attabal, wireman> f31424saneness;

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final byname.saneness f31425attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final marial f31426saneness;

        public attabal(byname.saneness classId, marial marialVar) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            this.f31425attabal = classId;
            this.f31426saneness = marialVar;
        }

        public final marial attabal() {
            return this.f31426saneness;
        }

        public boolean equals(Object obj) {
            return (obj instanceof attabal) && Intrinsics.wireman(this.f31425attabal, ((attabal) obj).f31425attabal);
        }

        public int hashCode() {
            return this.f31425attabal.hashCode();
        }

        public final byname.saneness saneness() {
            return this.f31425attabal;
        }
    }

    /* JADX INFO: compiled from: ClassDeserializer.kt */
    public static final class saneness {
        public /* synthetic */ saneness(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<byname.saneness> attabal() {
            return ClassDeserializer.f31422wireman;
        }

        public saneness() {
        }
    }

    public ClassDeserializer(impromptu components) {
        Intrinsics.checkNotNullParameter(components, "components");
        this.f31423attabal = components;
        this.f31424saneness = components.adultoid().competently(new Function1<attabal, wireman>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDeserializer$classes$1
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final wireman invoke(ClassDeserializer.attabal key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return this.this$0.dern(key);
            }
        });
    }

    public static /* synthetic */ wireman marial(ClassDeserializer classDeserializer, byname.saneness sanenessVar, marial marialVar, int i, Object obj) {
        if ((i & 2) != 0) {
            marialVar = null;
        }
        return classDeserializer.wireman(sanenessVar, marialVar);
    }

    public final wireman dern(attabal attabalVar) {
        Object next;
        cutely cutelyVarAttabal;
        sealless seallessVar;
        marial marialVarCutely;
        byname.saneness sanenessVarSaneness = attabalVar.saneness();
        Iterator<discontentedness.saneness> it = this.f31423attabal.formularize().iterator();
        while (it.hasNext()) {
            wireman wiremanVarDern = it.next().dern(sanenessVarSaneness);
            if (wiremanVarDern != null) {
                return wiremanVarDern;
            }
        }
        if (f31422wireman.contains(sanenessVarSaneness)) {
            return null;
        }
        marial marialVarAttabal = attabalVar.attabal();
        if (marialVarAttabal == null && (marialVarAttabal = this.f31423attabal.marial().attabal(sanenessVarSaneness)) == null) {
            return null;
        }
        dern dernVarAttabal = marialVarAttabal.attabal();
        ProtoBuf$Class protoBuf$ClassSaneness = marialVarAttabal.saneness();
        genesis.attabal attabalVarDern = marialVarAttabal.dern();
        walach walachVarWireman = marialVarAttabal.wireman();
        byname.saneness sanenessVarCompetently = sanenessVarSaneness.competently();
        if (sanenessVarCompetently != null) {
            wireman wiremanVarMarial = marial(this, sanenessVarCompetently, null, 2, null);
            DeserializedClassDescriptor deserializedClassDescriptor = wiremanVarMarial instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) wiremanVarMarial : null;
            if (deserializedClassDescriptor == null) {
                return null;
            }
            marial marialVarCutely2 = sanenessVarSaneness.cutely();
            Intrinsics.checkNotNullExpressionValue(marialVarCutely2, "getShortClassName(...)");
            if (!deserializedClassDescriptor.cig(marialVarCutely2)) {
                return null;
            }
            cutelyVarAttabal = deserializedClassDescriptor.osteal();
        } else {
            kattegat kattegatVarMolybdenite = this.f31423attabal.molybdenite();
            byname.dern dernVarImpromptu = sanenessVarSaneness.impromptu();
            Intrinsics.checkNotNullExpressionValue(dernVarImpromptu, "getPackageFqName(...)");
            Iterator<T> it2 = supplicat.dern(kattegatVarMolybdenite, dernVarImpromptu).iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                seallessVar = (sealless) next;
                if (!(seallessVar instanceof formularize)) {
                    break;
                }
                marialVarCutely = sanenessVarSaneness.cutely();
                Intrinsics.checkNotNullExpressionValue(marialVarCutely, "getShortClassName(...)");
            } while (!((formularize) seallessVar).dhss(marialVarCutely));
            sealless seallessVar2 = (sealless) next;
            if (seallessVar2 == null) {
                return null;
            }
            impromptu impromptuVar = this.f31423attabal;
            ProtoBuf$TypeTable typeTable = protoBuf$ClassSaneness.getTypeTable();
            Intrinsics.checkNotNullExpressionValue(typeTable, "getTypeTable(...)");
            genesis.competently competentlyVar = new genesis.competently(typeTable);
            impromptu.attabal attabalVar2 = impromptu.f26670saneness;
            ProtoBuf$VersionRequirementTable versionRequirementTable = protoBuf$ClassSaneness.getVersionRequirementTable();
            Intrinsics.checkNotNullExpressionValue(versionRequirementTable, "getVersionRequirementTable(...)");
            cutelyVarAttabal = impromptuVar.attabal(seallessVar2, dernVarAttabal, competentlyVar, attabalVar2.attabal(versionRequirementTable), attabalVarDern, null);
            attabalVarDern = attabalVarDern;
        }
        return new DeserializedClassDescriptor(cutelyVarAttabal, protoBuf$ClassSaneness, dernVarAttabal, attabalVarDern, walachVarWireman);
    }

    public final wireman wireman(byname.saneness classId, marial marialVar) {
        Intrinsics.checkNotNullParameter(classId, "classId");
        return this.f31424saneness.invoke(new attabal(classId, marialVar));
    }
}
