package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import byname.saneness;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.itchy;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.treadless;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import patroclinal.formularize;
import prescient.competently;

/* JADX INFO: compiled from: RawSubstitution.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class RawSubstitution extends itchy {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal f30581beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal f30582competently;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final attabal f30583marial = new attabal(null);

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final wireman f30584dern;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final TypeParameterUpperBoundEraser f30585wireman;

    /* JADX INFO: compiled from: RawSubstitution.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public attabal() {
        }
    }

    static {
        TypeUsage typeUsage = TypeUsage.COMMON;
        f30581beachfront = saneness.saneness(typeUsage, false, true, null, 5, null).formularize(JavaTypeFlexibility.FLEXIBLE_LOWER_BOUND);
        f30582competently = saneness.saneness(typeUsage, false, true, null, 5, null).formularize(JavaTypeFlexibility.FLEXIBLE_UPPER_BOUND);
    }

    public RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser) {
        wireman wiremanVar = new wireman();
        this.f30584dern = wiremanVar;
        this.f30585wireman = typeParameterUpperBoundEraser == null ? new TypeParameterUpperBoundEraser(wiremanVar, null, 2, null) : typeParameterUpperBoundEraser;
    }

    public static /* synthetic */ oilcan formularize(RawSubstitution rawSubstitution, oilcan oilcanVar, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVar, int i, Object obj) {
        if ((i & 2) != 0) {
            attabalVar = new p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal(TypeUsage.COMMON, null, false, false, null, null, 62, null);
        }
        return rawSubstitution.apical(oilcanVar, attabalVar);
    }

    public final oilcan apical(oilcan oilcanVar, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVar) {
        beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
        if (beachfrontVarWireman instanceof clubfoot) {
            return apical(this.f30585wireman.dern((clubfoot) beachfrontVarWireman, attabalVar.cutely(true)), attabalVar);
        }
        if (!(beachfrontVarWireman instanceof wireman)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + beachfrontVarWireman).toString());
        }
        beachfront beachfrontVarWireman2 = stratoscope.wireman(oilcanVar).setterwort().wireman();
        if (beachfrontVarWireman2 instanceof wireman) {
            Pair<merc, Boolean> pairCutely = cutely(stratoscope.dern(oilcanVar), (wireman) beachfrontVarWireman, f30581beachfront);
            merc mercVarComponent1 = pairCutely.component1();
            boolean zBooleanValue = pairCutely.component2().booleanValue();
            Pair<merc, Boolean> pairCutely2 = cutely(stratoscope.wireman(oilcanVar), (wireman) beachfrontVarWireman2, f30582competently);
            merc mercVarComponent2 = pairCutely2.component1();
            return (zBooleanValue || pairCutely2.component2().booleanValue()) ? new RawTypeImpl(mercVarComponent1, mercVarComponent2) : KotlinTypeFactory.wireman(mercVarComponent1, mercVarComponent2);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + beachfrontVarWireman2 + "\" while for lower it's \"" + beachfrontVarWireman + '\"').toString());
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    public boolean beachfront() {
        return false;
    }

    public final Pair<merc, Boolean> cutely(final merc mercVar, final wireman wiremanVar, final p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.attabal attabalVar) {
        if (mercVar.setterwort().getParameters().isEmpty()) {
            return formularize.attabal(mercVar, Boolean.FALSE);
        }
        if (p002kotlin.reflect.jvm.internal.impl.builtins.beachfront.timberyard(mercVar)) {
            timberyard timberyardVar = mercVar.dhss().get(0);
            Variance varianceDern = timberyardVar.dern();
            oilcan type = timberyardVar.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            return formularize.attabal(KotlinTypeFactory.formularize(mercVar.vesuvio(), mercVar.setterwort(), graveside.marial(new treadless(varianceDern, apical(type, attabalVar))), mercVar.mastfed(), null, 16, null), Boolean.FALSE);
        }
        if (yemenite.attabal(mercVar)) {
            return formularize.attabal(competently.wireman(ErrorTypeKind.ERROR_RAW_TYPE, mercVar.setterwort().toString()), Boolean.FALSE);
        }
        MemberScope memberScopeCoi = wiremanVar.coi(this);
        Intrinsics.checkNotNullExpressionValue(memberScopeCoi, "getMemberScope(...)");
        overspeculate overspeculateVarVesuvio = mercVar.vesuvio();
        permissivist permissivistVarImpromptu = wiremanVar.impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        List<clubfoot> parameters = wiremanVar.impromptu().getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        List<clubfoot> list = parameters;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        for (clubfoot clubfootVar : list) {
            wireman wiremanVar2 = this.f30584dern;
            Intrinsics.beachfront(clubfootVar);
            arrayList.add(p002kotlin.reflect.jvm.internal.impl.types.dovishness.saneness(wiremanVar2, clubfootVar, attabalVar, this.f30585wireman, null, 8, null));
        }
        return formularize.attabal(KotlinTypeFactory.triweekly(overspeculateVarVesuvio, permissivistVarImpromptu, arrayList, mercVar.mastfed(), memberScopeCoi, new Function1<p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront, merc>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution$eraseInflexibleBasedOnClassDescriptor$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final merc invoke(p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kotlinTypeRefiner) {
                saneness sanenessVarApical;
                wireman wiremanVarSaneness;
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                wireman wiremanVar3 = wiremanVar;
                if (wiremanVar3 == null) {
                    wiremanVar3 = null;
                }
                if (wiremanVar3 == null || (sanenessVarApical = DescriptorUtilsKt.apical(wiremanVar3)) == null || (wiremanVarSaneness = kotlinTypeRefiner.saneness(sanenessVarApical)) == null || Intrinsics.wireman(wiremanVarSaneness, wiremanVar)) {
                    return null;
                }
                return (merc) this.cutely(mercVar, wiremanVarSaneness, attabalVar).getFirst();
            }
        }), Boolean.TRUE);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.types.itchy
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public treadless marial(oilcan key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return new treadless(formularize(this, key, null, 2, null));
    }

    public /* synthetic */ RawSubstitution(TypeParameterUpperBoundEraser typeParameterUpperBoundEraser, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeParameterUpperBoundEraser);
    }
}
