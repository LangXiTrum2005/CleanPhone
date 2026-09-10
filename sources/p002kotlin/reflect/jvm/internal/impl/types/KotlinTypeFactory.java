package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.List;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorScopeKind;
import prescient.competently;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KotlinTypeFactory {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final KotlinTypeFactory f31663attabal = new KotlinTypeFactory();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final Function1<beachfront, merc> f31664saneness = new Function1() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$EMPTY_REFINED_TYPE_FACTORY$1
        @Override // p002kotlin.jvm.functions.Function1
        public final Void invoke(beachfront beachfrontVar) {
            Intrinsics.checkNotNullParameter(beachfrontVar, "<anonymous parameter 0>");
            return null;
        }
    };

    /* JADX INFO: compiled from: KotlinTypeFactory.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final merc f31665attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final permissivist f31666saneness;

        public attabal(merc mercVar, permissivist permissivistVar) {
            this.f31665attabal = mercVar;
            this.f31666saneness = permissivistVar;
        }

        public final merc attabal() {
            return this.f31665attabal;
        }

        public final permissivist saneness() {
            return this.f31666saneness;
        }
    }

    public static /* synthetic */ merc apical(merc mercVar, overspeculate overspeculateVar, permissivist permissivistVar, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            overspeculateVar = mercVar.vesuvio();
        }
        if ((i & 4) != 0) {
            permissivistVar = mercVar.setterwort();
        }
        if ((i & 8) != 0) {
            list = mercVar.dhss();
        }
        if ((i & 16) != 0) {
            z = mercVar.mastfed();
        }
        return impromptu(mercVar, overspeculateVar, permissivistVar, list, z);
    }

    public static final merc competently(overspeculate attributes, wireman descriptor, List<? extends timberyard> arguments) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        permissivist permissivistVarImpromptu = descriptor.impromptu();
        Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
        return formularize(attributes, permissivistVarImpromptu, arguments, false, null, 16, null);
    }

    public static final merc cutely(final overspeculate attributes, final permissivist constructor, final List<? extends timberyard> arguments, final boolean z, beachfront beachfrontVar) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        if (!attributes.isEmpty() || !arguments.isEmpty() || z || constructor.wireman() == null) {
            return triweekly(attributes, constructor, arguments, z, f31663attabal.dern(constructor, arguments, beachfrontVar), new Function1<beachfront, merc>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleType$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // p002kotlin.jvm.functions.Function1
                public final merc invoke(beachfront refiner) {
                    Intrinsics.checkNotNullParameter(refiner, "refiner");
                    KotlinTypeFactory.attabal attabalVarBeachfront = KotlinTypeFactory.f31663attabal.beachfront(constructor, refiner, arguments);
                    if (attabalVarBeachfront == null) {
                        return null;
                    }
                    merc mercVarAttabal = attabalVarBeachfront.attabal();
                    if (mercVarAttabal != null) {
                        return mercVarAttabal;
                    }
                    overspeculate overspeculateVar = attributes;
                    permissivist permissivistVarSaneness = attabalVarBeachfront.saneness();
                    Intrinsics.beachfront(permissivistVarSaneness);
                    return KotlinTypeFactory.cutely(overspeculateVar, permissivistVarSaneness, arguments, z, refiner);
                }
            });
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = constructor.wireman();
        Intrinsics.beachfront(beachfrontVarWireman);
        merc mercVarImpassible = beachfrontVarWireman.impassible();
        Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
        return mercVarImpassible;
    }

    public static /* synthetic */ merc formularize(overspeculate overspeculateVar, permissivist permissivistVar, List list, boolean z, beachfront beachfrontVar, int i, Object obj) {
        if ((i & 16) != 0) {
            beachfrontVar = null;
        }
        return cutely(overspeculateVar, permissivistVar, list, z, beachfrontVar);
    }

    public static final merc impassible(final overspeculate attributes, final permissivist constructor, final List<? extends timberyard> arguments, final boolean z, final MemberScope memberScope) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        polder polderVar = new polder(constructor, arguments, z, memberScope, new Function1<beachfront, merc>() { // from class: kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory$simpleTypeWithNonTrivialMemberScope$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final merc invoke(beachfront kotlinTypeRefiner) {
                Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
                KotlinTypeFactory.attabal attabalVarBeachfront = KotlinTypeFactory.f31663attabal.beachfront(constructor, kotlinTypeRefiner, arguments);
                if (attabalVarBeachfront == null) {
                    return null;
                }
                merc mercVarAttabal = attabalVarBeachfront.attabal();
                if (mercVarAttabal != null) {
                    return mercVarAttabal;
                }
                overspeculate overspeculateVar = attributes;
                permissivist permissivistVarSaneness = attabalVarBeachfront.saneness();
                Intrinsics.beachfront(permissivistVarSaneness);
                return KotlinTypeFactory.impassible(overspeculateVar, permissivistVarSaneness, arguments, z, memberScope);
            }
        });
        return attributes.isEmpty() ? polderVar : new seminary(polderVar, attributes);
    }

    public static final merc impromptu(merc baseType, overspeculate annotations, permissivist constructor, List<? extends timberyard> arguments, boolean z) {
        Intrinsics.checkNotNullParameter(baseType, "baseType");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return formularize(annotations, constructor, arguments, z, null, 16, null);
    }

    public static final merc marial(overspeculate attributes, IntegerLiteralTypeConstructor constructor, boolean z) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        return impassible(attributes, constructor, adultoid.formularize(), z, competently.attabal(ErrorScopeKind.INTEGER_LITERAL_TYPE_SCOPE, true, "unknown integer literal type"));
    }

    public static final merc saneness(overspeculate overspeculateVar, List<? extends timberyard> arguments) {
        Intrinsics.checkNotNullParameter(overspeculateVar, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return new hydrovane(peridotite.attabal.f31799attabal, false).taiyuan(walach.f31822marial.attabal(null, overspeculateVar, arguments), overspeculate.f31797arytenoidectomy.taiyuan());
    }

    public static final merc taiyuan(overspeculate attributes, permissivist constructor, List<? extends timberyard> arguments, boolean z) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        return formularize(attributes, constructor, arguments, z, null, 16, null);
    }

    public static final merc triweekly(overspeculate attributes, permissivist constructor, List<? extends timberyard> arguments, boolean z, MemberScope memberScope, Function1<? super beachfront, ? extends merc> refinedTypeFactory) {
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(constructor, "constructor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(memberScope, "memberScope");
        Intrinsics.checkNotNullParameter(refinedTypeFactory, "refinedTypeFactory");
        polder polderVar = new polder(constructor, arguments, z, memberScope, refinedTypeFactory);
        return attributes.isEmpty() ? polderVar : new seminary(polderVar, attributes);
    }

    public static final empress wireman(merc lowerBound, merc upperBound) {
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        return Intrinsics.wireman(lowerBound, upperBound) ? lowerBound : new cord(lowerBound, upperBound);
    }

    public final attabal beachfront(permissivist permissivistVar, beachfront beachfrontVar, List<? extends timberyard> list) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarBeachfront;
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = permissivistVar.wireman();
        if (beachfrontVarWireman == null || (beachfrontVarBeachfront = beachfrontVar.beachfront(beachfrontVarWireman)) == null) {
            return null;
        }
        if (beachfrontVarBeachfront instanceof overspeculate) {
            return new attabal(saneness((overspeculate) beachfrontVarBeachfront, list), null);
        }
        permissivist permissivistVarAttabal = beachfrontVarBeachfront.impromptu().attabal(beachfrontVar);
        Intrinsics.checkNotNullExpressionValue(permissivistVarAttabal, "refine(...)");
        return new attabal(null, permissivistVarAttabal);
    }

    public final MemberScope dern(permissivist permissivistVar, List<? extends timberyard> list, beachfront beachfrontVar) {
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = permissivistVar.wireman();
        if (beachfrontVarWireman instanceof clubfoot) {
            return ((clubfoot) beachfrontVarWireman).impassible().formularize();
        }
        if (beachfrontVarWireman instanceof wireman) {
            if (beachfrontVar == null) {
                beachfrontVar = DescriptorUtilsKt.kowloon(DescriptorUtilsKt.arytenoidectomy(beachfrontVarWireman));
            }
            return list.isEmpty() ? molybdenite.saneness((wireman) beachfrontVarWireman, beachfrontVar) : molybdenite.attabal((wireman) beachfrontVarWireman, cultivated.f31745dern.saneness(permissivistVar, list), beachfrontVar);
        }
        if (beachfrontVarWireman instanceof overspeculate) {
            ErrorScopeKind errorScopeKind = ErrorScopeKind.SCOPE_FOR_ABBREVIATION_TYPE;
            String string = ((overspeculate) beachfrontVarWireman).getName().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return competently.attabal(errorScopeKind, true, string);
        }
        if (permissivistVar instanceof IntersectionTypeConstructor) {
            return ((IntersectionTypeConstructor) permissivistVar).beachfront();
        }
        throw new IllegalStateException("Unsupported classifier: " + beachfrontVarWireman + " for constructor: " + permissivistVar);
    }
}
