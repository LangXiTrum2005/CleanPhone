package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import foreshot.beachfront;
import foreshot.marial;
import foreshot.taiyuan;
import java.util.Collection;
import java.util.Set;
import lyreflower.dern;
import p002kotlin.Pair;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.creditor;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import p002kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.arytenoidectomy;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.impromptu;

/* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DeserializedDescriptorResolver {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public impromptu f30686attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final attabal f30684saneness = new attabal(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final Set<KotlinClassHeader.Kind> f30682dern = privatdozent.wireman(KotlinClassHeader.Kind.CLASS);

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final Set<KotlinClassHeader.Kind> f30685wireman = creditor.impromptu(KotlinClassHeader.Kind.FILE_FACADE, KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final marial f30683marial = new marial(1, 1, 2);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final marial f30680beachfront = new marial(1, 1, 11);

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final marial f30681competently = new marial(1, 1, 13);

    /* JADX INFO: compiled from: DeserializedDescriptorResolver.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final marial attabal() {
            return DeserializedDescriptorResolver.f30681competently;
        }

        public attabal() {
        }
    }

    public final String[] apical(monoploid monoploidVar, Set<? extends KotlinClassHeader.Kind> set) {
        KotlinClassHeader kotlinClassHeaderSaneness = monoploidVar.saneness();
        String[] strArrAttabal = kotlinClassHeaderSaneness.attabal();
        if (strArrAttabal == null) {
            strArrAttabal = kotlinClassHeaderSaneness.saneness();
        }
        if (strArrAttabal == null || !set.contains(kotlinClassHeaderSaneness.dern())) {
            return null;
        }
        return strArrAttabal;
    }

    public final marial beachfront() {
        return dern.attabal(wireman().competently());
    }

    public final boolean competently() {
        return wireman().competently().beachfront();
    }

    public final p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.marial cutely(monoploid kotlinClass) {
        String[] strArrCompetently;
        Pair<beachfront, ProtoBuf$Class> pairTaiyuan;
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] strArrApical = apical(kotlinClass, f30682dern);
        if (strArrApical == null || (strArrCompetently = kotlinClass.saneness().competently()) == null) {
            return null;
        }
        try {
            try {
                pairTaiyuan = taiyuan.taiyuan(strArrApical, strArrCompetently);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e);
            }
        } catch (Throwable th) {
            if (competently() || kotlinClass.saneness().wireman().impromptu(beachfront())) {
                throw th;
            }
            pairTaiyuan = null;
        }
        if (pairTaiyuan == null) {
            return null;
        }
        return new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.marial(pairTaiyuan.component1(), pairTaiyuan.component2(), kotlinClass.saneness().wireman(), new molybdenite(kotlinClass, marial(kotlinClass), taiyuan(kotlinClass), dern(kotlinClass)));
    }

    public final DeserializedContainerAbiStability dern(monoploid monoploidVar) {
        if (wireman().competently().marial()) {
            return DeserializedContainerAbiStability.STABLE;
        }
        if (monoploidVar.saneness().cutely()) {
            return DeserializedContainerAbiStability.FIR_UNSTABLE;
        }
        return monoploidVar.saneness().apical() ? DeserializedContainerAbiStability.IR_UNSTABLE : DeserializedContainerAbiStability.STABLE;
    }

    public final wireman formularize(monoploid kotlinClass) {
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.marial marialVarCutely = cutely(kotlinClass);
        if (marialVarCutely == null) {
            return null;
        }
        return wireman().beachfront().wireman(kotlinClass.competently(), marialVarCutely);
    }

    public final void impassible(beachfront components) {
        Intrinsics.checkNotNullParameter(components, "components");
        triweekly(components.attabal());
    }

    public final boolean impromptu(monoploid monoploidVar) {
        return !wireman().competently().saneness() && monoploidVar.saneness().taiyuan() && Intrinsics.wireman(monoploidVar.saneness().wireman(), f30680beachfront);
    }

    public final arytenoidectomy<marial> marial(monoploid monoploidVar) {
        if (competently() || monoploidVar.saneness().wireman().impromptu(beachfront())) {
            return null;
        }
        return new arytenoidectomy<>(monoploidVar.saneness().wireman(), marial.f26283taiyuan, beachfront(), beachfront().apical(monoploidVar.saneness().wireman().cutely()), monoploidVar.getLocation(), monoploidVar.competently());
    }

    public final MemberScope saneness(sealless descriptor, monoploid kotlinClass) {
        String[] strArrCompetently;
        Pair<beachfront, ProtoBuf$Package> pairImpassible;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(kotlinClass, "kotlinClass");
        String[] strArrApical = apical(kotlinClass, f30685wireman);
        if (strArrApical == null || (strArrCompetently = kotlinClass.saneness().competently()) == null) {
            return null;
        }
        try {
            try {
                pairImpassible = taiyuan.impassible(strArrApical, strArrCompetently);
            } catch (InvalidProtocolBufferException e) {
                throw new IllegalStateException("Could not read data from " + kotlinClass.getLocation(), e);
            }
        } catch (Throwable th) {
            if (competently() || kotlinClass.saneness().wireman().impromptu(beachfront())) {
                throw th;
            }
            pairImpassible = null;
        }
        if (pairImpassible == null) {
            return null;
        }
        beachfront beachfrontVarComponent1 = pairImpassible.component1();
        ProtoBuf$Package protoBuf$PackageComponent2 = pairImpassible.component2();
        apical apicalVar = new apical(kotlinClass, protoBuf$PackageComponent2, beachfrontVarComponent1, marial(kotlinClass), taiyuan(kotlinClass), dern(kotlinClass));
        return new p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.beachfront(descriptor, protoBuf$PackageComponent2, beachfrontVarComponent1, kotlinClass.saneness().wireman(), apicalVar, wireman(), "scope for " + apicalVar + " in " + descriptor, new Function0<Collection<? extends byname.marial>>() { // from class: kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$createKotlinPackagePartScope$2
            @Override // p002kotlin.jvm.functions.Function0
            public final Collection<? extends byname.marial> invoke() {
                return adultoid.formularize();
            }
        });
    }

    public final boolean taiyuan(monoploid monoploidVar) {
        return (wireman().competently().competently() && (monoploidVar.saneness().taiyuan() || Intrinsics.wireman(monoploidVar.saneness().wireman(), f30683marial))) || impromptu(monoploidVar);
    }

    public final void triweekly(impromptu impromptuVar) {
        Intrinsics.checkNotNullParameter(impromptuVar, "<set-?>");
        this.f30686attabal = impromptuVar;
    }

    public final impromptu wireman() {
        impromptu impromptuVar = this.f30686attabal;
        if (impromptuVar != null) {
            return impromptuVar;
        }
        Intrinsics.preprohormone("components");
        return null;
    }
}
