package p002kotlin.reflect.jvm.internal.impl.types;

import byname.dern;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.List;
import lyreflower.wireman;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.builtins.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.impromptu;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import p002kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;

/* JADX INFO: loaded from: classes5.dex */
public class TypeSubstitutor {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static final TypeSubstitutor f31696saneness = competently(itchy.f31777saneness);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final itchy f31697attabal;

    public static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    public static class attabal implements Function1<dern, Boolean> {
        private static /* synthetic */ void attabal(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // p002kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(dern dernVar) {
            if (dernVar == null) {
                attabal(0);
            }
            return Boolean.valueOf(!dernVar.equals(competently.attabal.f29766starveling));
        }
    }

    public static /* synthetic */ class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31699attabal;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f31699attabal = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31699attabal[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31699attabal[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TypeSubstitutor(itchy itchyVar) {
        if (itchyVar == null) {
            attabal(7);
        }
        this.f31697attabal = itchyVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    public static /* synthetic */ void attabal(int i) {
        String str;
        int i2;
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                default:
                    switch (i) {
                        default:
                            switch (i) {
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    i2 = 2;
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i2 = 2;
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    i2 = 2;
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            i2 = 2;
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i2 = 2;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case 38:
                objArr[0] = "typeParameterVariance";
                break;
            case 39:
                objArr[0] = "projectionKind";
                break;
        }
        if (i == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i == 8) {
            objArr[1] = "getSubstitution";
        } else if (i == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case 31:
            case 32:
            case 34:
            case 37:
            case 40:
            case 41:
            case 42:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case 38:
            case 39:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i != 1 && i != 2 && i != 8 && i != 34 && i != 37) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i) {
                                case 29:
                                case 30:
                                case 31:
                                case 32:
                                    break;
                                default:
                                    switch (i) {
                                        case 40:
                                        case 41:
                                        case 42:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    public static TypeSubstitutor beachfront(oilcan oilcanVar) {
        if (oilcanVar == null) {
            attabal(6);
        }
        return competently(cultivated.taiyuan(oilcanVar.setterwort(), oilcanVar.dhss()));
    }

    public static TypeSubstitutor competently(itchy itchyVar) {
        if (itchyVar == null) {
            attabal(0);
        }
        return new TypeSubstitutor(itchyVar);
    }

    public static Variance dern(Variance variance, timberyard timberyardVar) {
        if (variance == null) {
            attabal(35);
        }
        if (timberyardVar == null) {
            attabal(36);
        }
        if (!timberyardVar.saneness()) {
            return wireman(variance, timberyardVar.dern());
        }
        Variance variance2 = Variance.OUT_VARIANCE;
        if (variance2 == null) {
            attabal(37);
        }
        return variance2;
    }

    public static timberyard formularize(oilcan oilcanVar, timberyard timberyardVar, clubfoot clubfootVar, timberyard timberyardVar2) {
        if (oilcanVar == null) {
            attabal(26);
        }
        if (timberyardVar == null) {
            attabal(27);
        }
        if (timberyardVar2 == null) {
            attabal(28);
        }
        if (!oilcanVar.getAnnotations().restrictive(competently.attabal.f29766starveling)) {
            if (timberyardVar == null) {
                attabal(29);
            }
            return timberyardVar;
        }
        permissivist permissivistVar = timberyardVar.getType().setterwort();
        if (!(permissivistVar instanceof NewCapturedTypeConstructor)) {
            return timberyardVar;
        }
        timberyard timberyardVarDern = ((NewCapturedTypeConstructor) permissivistVar).dern();
        Variance varianceDern = timberyardVarDern.dern();
        VarianceConflictType varianceConflictTypeMarial = marial(timberyardVar2.dern(), varianceDern);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (varianceConflictTypeMarial == varianceConflictType) {
            return new treadless(timberyardVarDern.getType());
        }
        return (clubfootVar != null && marial(clubfootVar.cutely(), varianceDern) == varianceConflictType) ? new treadless(timberyardVarDern.getType()) : timberyardVar;
    }

    public static TypeSubstitutor impromptu(itchy itchyVar, itchy itchyVar2) {
        if (itchyVar == null) {
            attabal(3);
        }
        if (itchyVar2 == null) {
            attabal(4);
        }
        return competently(molybdenite.taiyuan(itchyVar, itchyVar2));
    }

    public static String kowloon(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (wireman.attabal(th)) {
                throw th;
            }
            return "[Exception while computing toString(): " + th + X3.j.e;
        }
    }

    public static VarianceConflictType marial(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        return (variance == Variance.OUT_VARIANCE && variance2 == variance3) ? VarianceConflictType.IN_IN_OUT_POSITION : VarianceConflictType.NO_CONFLICT;
    }

    public static void saneness(int i, timberyard timberyardVar, itchy itchyVar) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + kowloon(timberyardVar) + "; substitution: " + kowloon(itchyVar));
    }

    public static marial taiyuan(marial marialVar) {
        if (marialVar == null) {
            attabal(33);
        }
        return !marialVar.restrictive(competently.attabal.f29766starveling) ? marialVar : new impromptu(marialVar, new attabal());
    }

    public static Variance wireman(Variance variance, Variance variance2) {
        if (variance == null) {
            attabal(38);
        }
        if (variance2 == null) {
            attabal(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                attabal(40);
            }
            return variance2;
        }
        if (variance2 == variance3) {
            if (variance == null) {
                attabal(41);
            }
            return variance;
        }
        if (variance == variance2) {
            if (variance2 == null) {
                attabal(42);
            }
            return variance2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final timberyard adultoid(timberyard timberyardVar, clubfoot clubfootVar, int i) throws SubstitutionException {
        if (timberyardVar == null) {
            attabal(18);
        }
        saneness(i, timberyardVar, this.f31697attabal);
        if (!timberyardVar.saneness()) {
            oilcan type = timberyardVar.getType();
            if (type instanceof lotta) {
                lotta lottaVar = (lotta) type;
                empress origin = lottaVar.getOrigin();
                oilcan oilcanVarTimberyard = lottaVar.timberyard();
                timberyard timberyardVarAdultoid = adultoid(new treadless(timberyardVar.dern(), origin), clubfootVar, i + 1);
                return timberyardVarAdultoid.saneness() ? timberyardVarAdultoid : new treadless(timberyardVarAdultoid.dern(), sayid.wireman(timberyardVarAdultoid.getType().homozygous(), arytenoidectomy(oilcanVarTimberyard, timberyardVar.dern())));
            }
            if (!adultoid.attabal(type) && !(type.homozygous() instanceof restrictive)) {
                timberyard timberyardVarMarial = this.f31697attabal.marial(type);
                timberyard timberyardVarFormularize = timberyardVarMarial != null ? formularize(type, timberyardVarMarial, clubfootVar, timberyardVar) : null;
                Variance varianceDern = timberyardVar.dern();
                if (timberyardVarFormularize == null && stratoscope.saneness(type) && !dent.saneness(type)) {
                    preprohormone preprohormoneVarAttabal = stratoscope.attabal(type);
                    int i2 = i + 1;
                    timberyard timberyardVarAdultoid2 = adultoid(new treadless(varianceDern, preprohormoneVarAttabal.sakeen()), clubfootVar, i2);
                    timberyard timberyardVarAdultoid3 = adultoid(new treadless(varianceDern, preprohormoneVarAttabal.immediately()), clubfootVar, i2);
                    Variance varianceDern2 = timberyardVarAdultoid2.dern();
                    if (timberyardVarAdultoid2.getType() != preprohormoneVarAttabal.sakeen() || timberyardVarAdultoid3.getType() != preprohormoneVarAttabal.immediately()) {
                        return new treadless(varianceDern2, KotlinTypeFactory.wireman(coffeecake.attabal(timberyardVarAdultoid2.getType()), coffeecake.attabal(timberyardVarAdultoid3.getType())));
                    }
                } else if (!beachfront.czestochowa(type) && !yemenite.attabal(type)) {
                    if (timberyardVarFormularize != null) {
                        VarianceConflictType varianceConflictTypeMarial = marial(varianceDern, timberyardVarFormularize.dern());
                        if (!CapturedTypeConstructorKt.wireman(type)) {
                            int i3 = saneness.f31699attabal[varianceConflictTypeMarial.ordinal()];
                            if (i3 == 1) {
                                throw new SubstitutionException("Out-projection in in-position");
                            }
                            if (i3 == 2) {
                                return new treadless(Variance.OUT_VARIANCE, type.setterwort().apical().restrictive());
                            }
                        }
                        formularize formularizeVarAttabal = dent.attabal(type);
                        if (timberyardVarFormularize.saneness()) {
                            return timberyardVarFormularize;
                        }
                        oilcan oilcanVarItchy = formularizeVarAttabal != null ? formularizeVarAttabal.itchy(timberyardVarFormularize.getType()) : nosophobia.monoploid(timberyardVarFormularize.getType(), type.mastfed());
                        if (!type.getAnnotations().isEmpty()) {
                            oilcanVarItchy = TypeUtilsKt.rotuma(oilcanVarItchy, new CompositeAnnotations(oilcanVarItchy.getAnnotations(), taiyuan(this.f31697attabal.wireman(type.getAnnotations()))));
                        }
                        if (varianceConflictTypeMarial == VarianceConflictType.NO_CONFLICT) {
                            varianceDern = wireman(varianceDern, timberyardVarFormularize.dern());
                        }
                        return new treadless(varianceDern, oilcanVarItchy);
                    }
                    timberyardVar = polloi(timberyardVar, i);
                    if (timberyardVar == null) {
                        attabal(25);
                    }
                }
            }
        }
        return timberyardVar;
    }

    public boolean apical() {
        return this.f31697attabal.beachfront();
    }

    public oilcan arytenoidectomy(oilcan oilcanVar, Variance variance) {
        if (oilcanVar == null) {
            attabal(14);
        }
        if (variance == null) {
            attabal(15);
        }
        timberyard timberyardVarMonoploid = monoploid(new treadless(variance, cutely().competently(oilcanVar, variance)));
        if (timberyardVarMonoploid == null) {
            return null;
        }
        return timberyardVarMonoploid.getType();
    }

    public itchy cutely() {
        itchy itchyVar = this.f31697attabal;
        if (itchyVar == null) {
            attabal(8);
        }
        return itchyVar;
    }

    public timberyard graveside(timberyard timberyardVar) {
        if (timberyardVar == null) {
            attabal(17);
        }
        if (apical()) {
            return timberyardVar;
        }
        try {
            return adultoid(timberyardVar, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    public TypeSubstitutor impassible() {
        itchy itchyVar = this.f31697attabal;
        return ((itchyVar instanceof trm) && itchyVar.saneness()) ? new TypeSubstitutor(new trm(((trm) this.f31697attabal).cutely(), ((trm) this.f31697attabal).taiyuan(), false)) : this;
    }

    public final List<timberyard> molybdenite(List<clubfoot> list, List<timberyard> list2, int i) throws SubstitutionException {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            clubfoot clubfootVar = list.get(i2);
            timberyard timberyardVar = list2.get(i2);
            timberyard timberyardVarAdultoid = adultoid(timberyardVar, clubfootVar, i + 1);
            int i3 = saneness.f31699attabal[marial(clubfootVar.cutely(), timberyardVarAdultoid.dern()).ordinal()];
            if (i3 == 1 || i3 == 2) {
                timberyardVarAdultoid = nosophobia.molybdenite(clubfootVar);
            } else if (i3 == 3) {
                Variance varianceCutely = clubfootVar.cutely();
                Variance variance = Variance.INVARIANT;
                if (varianceCutely != variance && !timberyardVarAdultoid.saneness()) {
                    timberyardVarAdultoid = new treadless(variance, timberyardVarAdultoid.getType());
                }
            }
            if (timberyardVarAdultoid != timberyardVar) {
                z = true;
            }
            arrayList.add(timberyardVarAdultoid);
        }
        return !z ? list2 : arrayList;
    }

    public timberyard monoploid(timberyard timberyardVar) {
        if (timberyardVar == null) {
            attabal(16);
        }
        timberyard timberyardVarGraveside = graveside(timberyardVar);
        return (this.f31697attabal.attabal() || this.f31697attabal.saneness()) ? CapturedTypeApproximationKt.dern(timberyardVarGraveside, this.f31697attabal.saneness()) : timberyardVarGraveside;
    }

    public final timberyard polloi(timberyard timberyardVar, int i) throws SubstitutionException {
        oilcan type = timberyardVar.getType();
        Variance varianceDern = timberyardVar.dern();
        if (type.setterwort().wireman() instanceof clubfoot) {
            return timberyardVar;
        }
        merc mercVarSaneness = saran.saneness(type);
        oilcan oilcanVarArytenoidectomy = mercVarSaneness != null ? impassible().arytenoidectomy(mercVarSaneness, Variance.INVARIANT) : null;
        oilcan oilcanVarSaneness = coffeecake.saneness(type, molybdenite(type.setterwort().getParameters(), type.dhss(), i), this.f31697attabal.wireman(type.getAnnotations()));
        if ((oilcanVarSaneness instanceof merc) && (oilcanVarArytenoidectomy instanceof merc)) {
            oilcanVarSaneness = saran.cutely((merc) oilcanVarSaneness, (merc) oilcanVarArytenoidectomy);
        }
        return new treadless(varianceDern, oilcanVarSaneness);
    }

    public oilcan triweekly(oilcan oilcanVar, Variance variance) {
        if (oilcanVar == null) {
            attabal(9);
        }
        if (variance == null) {
            attabal(10);
        }
        if (apical()) {
            if (oilcanVar == null) {
                attabal(11);
            }
            return oilcanVar;
        }
        try {
            oilcan type = adultoid(new treadless(variance, oilcanVar), null, 0).getType();
            if (type == null) {
                attabal(12);
            }
            return type;
        } catch (SubstitutionException e) {
            prescient.marial marialVarWireman = prescient.competently.wireman(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (marialVarWireman == null) {
                attabal(13);
            }
            return marialVarWireman;
        }
    }
}
