package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import byname.saneness;
import genesic.beachfront;
import genesic.cuirassed;
import genesic.cutely;
import genesic.dovishness;
import genesic.preprohormone;
import genesic.rotuma;
import genesic.taiyuan;
import genesic.trm;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.IndexedValue;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.competently;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import p002kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import prescient.marial;

/* JADX INFO: compiled from: JavaTypeResolver.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class JavaTypeResolver {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final wireman f30577attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f30578dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f30579saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TypeParameterUpperBoundEraser f30580wireman;

    public JavaTypeResolver(wireman c, competently typeParameterResolver) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        this.f30577attabal = c;
        this.f30579saneness = typeParameterResolver;
        wireman wiremanVar = new wireman();
        this.f30578dern = wiremanVar;
        this.f30580wireman = new TypeParameterUpperBoundEraser(wiremanVar, null, 2, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ oilcan formularize(JavaTypeResolver javaTypeResolver, beachfront beachfrontVar, attabal attabalVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return javaTypeResolver.apical(beachfrontVar, attabalVar, z);
    }

    public static final marial triweekly(cutely cutelyVar) {
        return prescient.competently.wireman(ErrorTypeKind.UNRESOLVED_JAVA_CLASS, cutelyVar.trm());
    }

    public final oilcan apical(beachfront arrayType, attabal attr, boolean z) {
        Intrinsics.checkNotNullParameter(arrayType, "arrayType");
        Intrinsics.checkNotNullParameter(attr, "attr");
        rotuma rotumaVarTriweekly = arrayType.triweekly();
        dovishness dovishnessVar = rotumaVarTriweekly instanceof dovishness ? (dovishness) rotumaVarTriweekly : null;
        PrimitiveType type = dovishnessVar != null ? dovishnessVar.getType() : null;
        LazyJavaAnnotations lazyJavaAnnotations = new LazyJavaAnnotations(this.f30577attabal, arrayType, true);
        if (type != null) {
            merc mercVarPrivatdozent = this.f30577attabal.wireman().apical().privatdozent(type);
            Intrinsics.beachfront(mercVarPrivatdozent);
            oilcan oilcanVarRotuma = TypeUtilsKt.rotuma(mercVarPrivatdozent, new CompositeAnnotations(mercVarPrivatdozent.getAnnotations(), lazyJavaAnnotations));
            Intrinsics.competently(oilcanVarRotuma, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
            merc mercVar = (merc) oilcanVarRotuma;
            return attr.impromptu() ? mercVar : KotlinTypeFactory.wireman(mercVar, mercVar.lampshade(true));
        }
        oilcan oilcanVarKowloon = kowloon(rotumaVarTriweekly, saneness.saneness(TypeUsage.COMMON, attr.impromptu(), false, null, 6, null));
        if (attr.impromptu()) {
            merc mercVarImpassible = this.f30577attabal.wireman().apical().impassible(z ? Variance.OUT_VARIANCE : Variance.INVARIANT, oilcanVarKowloon, lazyJavaAnnotations);
            Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getArrayType(...)");
            return mercVarImpassible;
        }
        merc mercVarImpassible2 = this.f30577attabal.wireman().apical().impassible(Variance.INVARIANT, oilcanVarKowloon, lazyJavaAnnotations);
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible2, "getArrayType(...)");
        return KotlinTypeFactory.wireman(mercVarImpassible2, this.f30577attabal.wireman().apical().impassible(Variance.OUT_VARIANCE, oilcanVarKowloon, lazyJavaAnnotations).lampshade(true));
    }

    public final timberyard arytenoidectomy(rotuma rotumaVar, attabal attabalVar, clubfoot clubfootVar) {
        timberyard timberyardVarGraveside;
        if (!(rotumaVar instanceof trm)) {
            return new treadless(Variance.INVARIANT, kowloon(rotumaVar, attabalVar));
        }
        trm trmVar = (trm) rotumaVar;
        rotuma rotumaVarGintrap = trmVar.gintrap();
        Variance variance = trmVar.merc() ? Variance.OUT_VARIANCE : Variance.IN_VARIANCE;
        if (rotumaVarGintrap == null || impromptu(variance, clubfootVar)) {
            timberyardVarGraveside = nosophobia.graveside(clubfootVar, attabalVar);
        } else {
            dern dernVarAttabal = p002kotlin.reflect.jvm.internal.impl.load.java.rotuma.attabal(this.f30577attabal, trmVar);
            oilcan oilcanVarKowloon = kowloon(rotumaVarGintrap, saneness.saneness(TypeUsage.COMMON, false, false, null, 7, null));
            if (dernVarAttabal != null) {
                oilcanVarKowloon = TypeUtilsKt.rotuma(oilcanVarKowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial.f29950impromptu.attabal(CollectionsKt.achondroplasia(oilcanVarKowloon.getAnnotations(), dernVarAttabal)));
            }
            timberyardVarGraveside = TypeUtilsKt.beachfront(oilcanVarKowloon, variance, clubfootVar);
        }
        Intrinsics.beachfront(timberyardVarGraveside);
        return timberyardVarGraveside;
    }

    public final permissivist beachfront(cutely cutelyVar, attabal attabalVar) {
        permissivist permissivistVarImpromptu;
        taiyuan taiyuanVarDern = cutelyVar.dern();
        if (taiyuanVarDern == null) {
            return competently(cutelyVar);
        }
        if (!(taiyuanVarDern instanceof genesic.competently)) {
            if (taiyuanVarDern instanceof preprohormone) {
                clubfoot clubfootVarAttabal = this.f30579saneness.attabal((preprohormone) taiyuanVarDern);
                if (clubfootVarAttabal != null) {
                    return clubfootVarAttabal.impromptu();
                }
                return null;
            }
            throw new IllegalStateException("Unknown classifier kind: " + taiyuanVarDern);
        }
        genesic.competently competentlyVar = (genesic.competently) taiyuanVarDern;
        byname.dern dernVarMarial = competentlyVar.marial();
        if (dernVarMarial != null) {
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarCutely = cutely(cutelyVar, attabalVar, dernVarMarial);
            if (wiremanVarCutely == null) {
                wiremanVarCutely = this.f30577attabal.attabal().triweekly().attabal(competentlyVar);
            }
            return (wiremanVarCutely == null || (permissivistVarImpromptu = wiremanVarCutely.impromptu()) == null) ? competently(cutelyVar) : permissivistVarImpromptu;
        }
        throw new AssertionError("Class type should have a FQ name: " + taiyuanVarDern);
    }

    public final permissivist competently(cutely cutelyVar) {
        saneness sanenessVarImpassible = saneness.impassible(new byname.dern(cutelyVar.sealless()));
        Intrinsics.checkNotNullExpressionValue(sanenessVarImpassible, "topLevel(...)");
        permissivist permissivistVarImpromptu = this.f30577attabal.attabal().saneness().wireman().polloi().wireman(sanenessVarImpassible, graveside.marial(0)).impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        return permissivistVarImpromptu;
    }

    public final p002kotlin.reflect.jvm.internal.impl.descriptors.wireman cutely(cutely cutelyVar, attabal attabalVar, byname.dern dernVar) {
        if (attabalVar.impromptu() && Intrinsics.wireman(dernVar, dern.f30592attabal)) {
            return this.f30577attabal.attabal().arytenoidectomy().dern();
        }
        p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman wiremanVar = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman.f29882attabal;
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarBeachfront = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman.beachfront(wiremanVar, dernVar, this.f30577attabal.wireman().apical(), null, 4, null);
        if (wiremanVarBeachfront == null) {
            return null;
        }
        return (wiremanVar.wireman(wiremanVarBeachfront) && (attabalVar.competently() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || attabalVar.saneness() == TypeUsage.SUPERTYPE || saneness(cutelyVar, wiremanVarBeachfront))) ? wiremanVar.saneness(wiremanVarBeachfront) : wiremanVarBeachfront;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    public final List<timberyard> dern(cutely cutelyVar, attabal attabalVar, permissivist permissivistVar) {
        boolean z;
        if (!cutelyVar.molybdenite()) {
            if (cutelyVar.preprohormone().isEmpty()) {
                List<clubfoot> parameters = permissivistVar.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                z = parameters.isEmpty() ? false : true;
            }
        }
        List<clubfoot> parameters2 = permissivistVar.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        if (z) {
            return wireman(cutelyVar, parameters2, permissivistVar, attabalVar);
        }
        if (parameters2.size() != cutelyVar.preprohormone().size()) {
            List<clubfoot> list = parameters2;
            ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list, 10));
            for (clubfoot clubfootVar : list) {
                ErrorTypeKind errorTypeKind = ErrorTypeKind.MISSED_TYPE_ARGUMENT_FOR_TYPE_PARAMETER;
                String strDern = clubfootVar.getName().dern();
                Intrinsics.checkNotNullExpressionValue(strDern, "asString(...)");
                arrayList.add(new treadless(prescient.competently.wireman(errorTypeKind, strDern)));
            }
            return CollectionsKt.molet(arrayList);
        }
        Iterable<IndexedValue> iterableLicking = CollectionsKt.licking(cutelyVar.preprohormone());
        ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(iterableLicking, 10));
        for (IndexedValue indexedValue : iterableLicking) {
            int index = indexedValue.getIndex();
            rotuma rotumaVar = (rotuma) indexedValue.saneness();
            parameters2.size();
            clubfoot clubfootVar2 = parameters2.get(index);
            attabal attabalVarSaneness = saneness.saneness(TypeUsage.COMMON, false, false, null, 7, null);
            Intrinsics.beachfront(clubfootVar2);
            arrayList2.add(arytenoidectomy(rotumaVar, attabalVarSaneness, clubfootVar2));
        }
        return CollectionsKt.molet(arrayList2);
    }

    public final oilcan impassible(cutely cutelyVar, attabal attabalVar) {
        boolean z = (attabalVar.impromptu() || attabalVar.saneness() == TypeUsage.SUPERTYPE) ? false : true;
        boolean zMolybdenite = cutelyVar.molybdenite();
        if (!zMolybdenite && !z) {
            merc mercVarMarial = marial(cutelyVar, attabalVar, null);
            return mercVarMarial != null ? mercVarMarial : triweekly(cutelyVar);
        }
        merc mercVarMarial2 = marial(cutelyVar, attabalVar.formularize(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND), null);
        if (mercVarMarial2 == null) {
            return triweekly(cutelyVar);
        }
        merc mercVarMarial3 = marial(cutelyVar, attabalVar.formularize(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND), mercVarMarial2);
        if (mercVarMarial3 == null) {
            return triweekly(cutelyVar);
        }
        return zMolybdenite ? new RawTypeImpl(mercVarMarial2, mercVarMarial3) : KotlinTypeFactory.wireman(mercVarMarial2, mercVarMarial3);
    }

    public final boolean impromptu(Variance variance, clubfoot clubfootVar) {
        return (clubfootVar.cutely() == Variance.INVARIANT || variance == clubfootVar.cutely()) ? false : true;
    }

    public final oilcan kowloon(rotuma rotumaVar, attabal attr) {
        oilcan oilcanVarKowloon;
        Intrinsics.checkNotNullParameter(attr, "attr");
        if (rotumaVar instanceof dovishness) {
            PrimitiveType type = ((dovishness) rotumaVar).getType();
            merc mercVarHydrovane = type != null ? this.f30577attabal.wireman().apical().hydrovane(type) : this.f30577attabal.wireman().apical().permissivist();
            Intrinsics.beachfront(mercVarHydrovane);
            return mercVarHydrovane;
        }
        if (rotumaVar instanceof cutely) {
            return impassible((cutely) rotumaVar, attr);
        }
        if (rotumaVar instanceof beachfront) {
            return formularize(this, (beachfront) rotumaVar, attr, false, 4, null);
        }
        if (rotumaVar instanceof trm) {
            rotuma rotumaVarGintrap = ((trm) rotumaVar).gintrap();
            if (rotumaVarGintrap != null && (oilcanVarKowloon = kowloon(rotumaVarGintrap, attr)) != null) {
                return oilcanVarKowloon;
            }
            merc mercVarPreprohormone = this.f30577attabal.wireman().apical().preprohormone();
            Intrinsics.checkNotNullExpressionValue(mercVarPreprohormone, "getDefaultBound(...)");
            return mercVarPreprohormone;
        }
        if (rotumaVar == null) {
            merc mercVarPreprohormone2 = this.f30577attabal.wireman().apical().preprohormone();
            Intrinsics.checkNotNullExpressionValue(mercVarPreprohormone2, "getDefaultBound(...)");
            return mercVarPreprohormone2;
        }
        throw new UnsupportedOperationException("Unsupported type: " + rotumaVar);
    }

    public final merc marial(cutely cutelyVar, attabal attabalVar, merc mercVar) {
        cutely cutelyVar2;
        overspeculate overspeculateVarSaneness;
        if (mercVar == null || (overspeculateVarSaneness = mercVar.vesuvio()) == null) {
            cutelyVar2 = cutelyVar;
            overspeculateVarSaneness = p002kotlin.reflect.jvm.internal.impl.types.clubfoot.saneness(new LazyJavaAnnotations(this.f30577attabal, cutelyVar2, false, 4, null));
        } else {
            cutelyVar2 = cutelyVar;
        }
        overspeculate overspeculateVar = overspeculateVarSaneness;
        permissivist permissivistVarBeachfront = beachfront(cutelyVar2, attabalVar);
        if (permissivistVarBeachfront == null) {
            return null;
        }
        boolean zTaiyuan = taiyuan(attabalVar);
        return (Intrinsics.wireman(mercVar != null ? mercVar.setterwort() : null, permissivistVarBeachfront) && !cutelyVar2.molybdenite() && zTaiyuan) ? mercVar.lampshade(true) : KotlinTypeFactory.formularize(overspeculateVar, permissivistVarBeachfront, dern(cutelyVar2, attabalVar, permissivistVarBeachfront), zTaiyuan, null, 16, null);
    }

    public final boolean saneness(cutely cutelyVar, p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        Variance varianceCutely;
        if (!cuirassed.attabal((rotuma) CollectionsKt.picketboat(cutelyVar.preprohormone()))) {
            return false;
        }
        List<clubfoot> parameters = p002kotlin.reflect.jvm.internal.impl.builtins.jvm.wireman.f29882attabal.saneness(wiremanVar).impromptu().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        clubfoot clubfootVar = (clubfoot) CollectionsKt.picketboat(parameters);
        return (clubfootVar == null || (varianceCutely = clubfootVar.cutely()) == null || varianceCutely == Variance.OUT_VARIANCE) ? false : true;
    }

    public final boolean taiyuan(attabal attabalVar) {
        return (attabalVar.competently() == JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND || attabalVar.impromptu() || attabalVar.saneness() == TypeUsage.SUPERTYPE) ? false : true;
    }

    public final List<timberyard> wireman(cutely cutelyVar, List<? extends clubfoot> list, permissivist permissivistVar, attabal attabalVar) {
        final cutely cutelyVar2;
        final permissivist permissivistVar2;
        final attabal attabalVar2;
        timberyard timberyardVarAttabal;
        List<? extends clubfoot> list2 = list;
        ArrayList arrayList = new ArrayList(p002kotlin.collections.dovishness.gintrap(list2, 10));
        for (final clubfoot clubfootVar : list2) {
            if (TypeUtilsKt.formularize(clubfootVar, null, attabalVar.dern())) {
                timberyardVarAttabal = nosophobia.graveside(clubfootVar, attabalVar);
                cutelyVar2 = cutelyVar;
                permissivistVar2 = permissivistVar;
                attabalVar2 = attabalVar;
            } else {
                cutelyVar2 = cutelyVar;
                permissivistVar2 = permissivistVar;
                attabalVar2 = attabalVar;
                timberyardVarAttabal = this.f30578dern.attabal(clubfootVar, attabalVar2.cutely(cutelyVar2.molybdenite()), this.f30580wireman, new LazyWrappedType(this.f30577attabal.marial(), new Function0<oilcan>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver$computeRawTypeArguments$1$erasedUpperBound$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public final oilcan invoke() {
                        TypeParameterUpperBoundEraser typeParameterUpperBoundEraser = this.this$0.f30580wireman;
                        clubfoot clubfootVar2 = clubfootVar;
                        attabal attabalVar3 = attabalVar2;
                        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = permissivistVar2.wireman();
                        return typeParameterUpperBoundEraser.dern(clubfootVar2, attabalVar3.apical(beachfrontVarWireman != null ? beachfrontVarWireman.impassible() : null).cutely(cutelyVar2.molybdenite()));
                    }
                }));
            }
            arrayList.add(timberyardVarAttabal);
            attabalVar = attabalVar2;
            permissivistVar = permissivistVar2;
            cutelyVar = cutelyVar2;
        }
        return arrayList;
    }
}
