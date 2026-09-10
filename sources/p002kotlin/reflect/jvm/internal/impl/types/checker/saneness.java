package p002kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cuirassed;
import p002kotlin.reflect.jvm.internal.impl.descriptors.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.cultivated;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.graveside;
import p002kotlin.reflect.jvm.internal.impl.types.grimness;
import p002kotlin.reflect.jvm.internal.impl.types.kattegat;
import p002kotlin.reflect.jvm.internal.impl.types.lerp;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p002kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.permissivist;
import p002kotlin.reflect.jvm.internal.impl.types.preprohormone;
import p002kotlin.reflect.jvm.internal.impl.types.restrictive;
import p002kotlin.reflect.jvm.internal.impl.types.timberyard;
import p002kotlin.reflect.jvm.internal.impl.types.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.yemenite;
import presbytery.apical;
import presbytery.competently;
import presbytery.cutely;
import presbytery.dern;
import presbytery.formularize;
import presbytery.impromptu;
import presbytery.kowloon;
import presbytery.marial;
import presbytery.monoploid;
import presbytery.taiyuan;
import presbytery.wireman;

/* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface saneness extends lerp, kowloon {

    /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
    public static final class attabal {

        /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.types.checker.saneness$attabal$attabal, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ClassicTypeSystemContext.kt */
        public static final class C0707attabal extends TypeCheckerState.saneness.attabal {

            /* JADX INFO: renamed from: attabal, reason: collision with root package name */
            public final /* synthetic */ saneness f31737attabal;

            /* JADX INFO: renamed from: saneness, reason: collision with root package name */
            public final /* synthetic */ TypeSubstitutor f31738saneness;

            public C0707attabal(saneness sanenessVar, TypeSubstitutor typeSubstitutor) {
                this.f31737attabal = sanenessVar;
                this.f31738saneness = typeSubstitutor;
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.saneness
            public impromptu attabal(TypeCheckerState state, competently type) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(type, "type");
                saneness sanenessVar = this.f31737attabal;
                TypeSubstitutor typeSubstitutor = this.f31738saneness;
                Object objCreditor = sanenessVar.creditor(type);
                Intrinsics.competently(objCreditor, "null cannot be cast to non-null type org.jetbrains.kotlin.types.KotlinType");
                oilcan oilcanVarTriweekly = typeSubstitutor.triweekly((oilcan) objCreditor, Variance.INVARIANT);
                Intrinsics.checkNotNullExpressionValue(oilcanVarTriweekly, "safeSubstitute(...)");
                impromptu impromptuVarBeachfront = sanenessVar.beachfront(oilcanVarTriweekly);
                Intrinsics.beachfront(impromptuVarBeachfront);
                return impromptuVarBeachfront;
            }
        }

        public static competently adultoid(saneness sanenessVar, cutely receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof timberyard) {
                return ((timberyard) receiver).getType().homozygous();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static CaptureStatus apical(saneness sanenessVar, presbytery.saneness receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof impromptu) {
                return ((impromptu) receiver).immediately();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static formularize arytenoidectomy(saneness sanenessVar, apical receiver, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                clubfoot clubfootVar = ((permissivist) receiver).getParameters().get(i);
                Intrinsics.checkNotNullExpressionValue(clubfootVar, "get(...)");
                return clubfootVar;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean attabal(saneness sanenessVar, apical c1, apical c2) {
            Intrinsics.checkNotNullParameter(c1, "c1");
            Intrinsics.checkNotNullParameter(c2, "c2");
            if (!(c1 instanceof permissivist)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c1 + ", " + polloi.saneness(c1.getClass())).toString());
            }
            if (c2 instanceof permissivist) {
                return Intrinsics.wireman(c1, c2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c2 + ", " + polloi.saneness(c2.getClass())).toString());
        }

        public static wireman beachfront(saneness sanenessVar, marial receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof preprohormone) {
                if (receiver instanceof graveside) {
                    return (graveside) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean clubfoot(saneness sanenessVar, cutely receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof timberyard) {
                return ((timberyard) receiver).saneness();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static impromptu coffeecake(saneness sanenessVar, dern receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof triweekly) {
                return ((triweekly) receiver).prefect();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static presbytery.attabal coi(saneness sanenessVar, presbytery.saneness receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof impromptu) {
                return ((impromptu) receiver).setterwort();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static marial competently(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                empress empressVarHomozygous = ((oilcan) receiver).homozygous();
                if (empressVarHomozygous instanceof preprohormone) {
                    return (preprohormone) empressVarHomozygous;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static TypeVariance cord(saneness sanenessVar, cutely receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof timberyard) {
                Variance varianceDern = ((timberyard) receiver).dern();
                Intrinsics.checkNotNullExpressionValue(varianceDern, "getProjectionKind(...)");
                return presbytery.triweekly.attabal(varianceDern);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean creditor(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return beachfront.lightstruck((permissivist) receiver, kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29711dern);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static TypeVariance cuirassed(saneness sanenessVar, formularize receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof clubfoot) {
                Variance varianceCutely = ((clubfoot) receiver).cutely();
                Intrinsics.checkNotNullExpressionValue(varianceCutely, "getVariance(...)");
                return presbytery.triweekly.attabal(varianceCutely);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean cultivated(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return (receiver instanceof empress) && (((empress) receiver).setterwort() instanceof formularize);
        }

        public static impromptu cutely(saneness sanenessVar, impromptu type, CaptureStatus status) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(status, "status");
            if (type instanceof merc) {
                return taiyuan.saneness((merc) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + polloi.saneness(type.getClass())).toString());
        }

        public static apical czestochowa(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                return ((merc) receiver).setterwort();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean dent(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                return TypeUtilsKt.arytenoidectomy((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static taiyuan dern(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                return (taiyuan) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static formularize dovishness(saneness sanenessVar, monoploid receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof formularize) {
                return ((formularize) receiver).saneness();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static Collection<competently> empress(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                Collection<oilcan> collectionCutely = ((permissivist) receiver).cutely();
                Intrinsics.checkNotNullExpressionValue(collectionCutely, "getSupertypes(...)");
                return collectionCutely;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently formularize(saneness sanenessVar, impromptu lowerBound, impromptu upperBound) {
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            if (!(lowerBound instanceof merc)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + sanenessVar + ", " + polloi.saneness(sanenessVar.getClass())).toString());
            }
            if (upperBound instanceof merc) {
                return KotlinTypeFactory.wireman((merc) lowerBound, (merc) upperBound);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + sanenessVar + ", " + polloi.saneness(sanenessVar.getClass())).toString());
        }

        public static formularize gintrap(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                if (beachfrontVarWireman instanceof clubfoot) {
                    return (clubfoot) beachfrontVarWireman;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently graveside(saneness sanenessVar, formularize receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof clubfoot) {
                return TypeUtilsKt.cutely((clubfoot) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean grimness(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return receiver instanceof IntersectionTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean hydrovane(saneness sanenessVar, presbytery.saneness receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.attabal;
        }

        public static cutely impassible(saneness sanenessVar, competently receiver, int i) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return ((oilcan) receiver).dhss().get(i);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static impromptu impromptu(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                empress empressVarHomozygous = ((oilcan) receiver).homozygous();
                if (empressVarHomozygous instanceof merc) {
                    return (merc) empressVarHomozygous;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static TypeCheckerState itchy(saneness sanenessVar, boolean z, boolean z2) {
            return p002kotlin.reflect.jvm.internal.impl.types.checker.attabal.saneness(z, z2, sanenessVar, null, null, 24, null);
        }

        public static boolean kattegat(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return ((permissivist) receiver).wireman() instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static byname.wireman kowloon(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return DescriptorUtilsKt.impassible((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static int lerp(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return ((permissivist) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static cutely lotta(saneness sanenessVar, presbytery.attabal receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof NewCapturedTypeConstructor) {
                return ((NewCapturedTypeConstructor) receiver).dern();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static dern marial(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                if (receiver instanceof triweekly) {
                    return (triweekly) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean mathsort(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return receiver instanceof restrictive;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean merc(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return yemenite.attabal((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently milliradian(saneness sanenessVar, presbytery.saneness receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof impromptu) {
                return ((impromptu) receiver).tectonization();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static PrimitiveType molybdenite(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return beachfront.walach((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static List<formularize> monoploid(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                List<clubfoot> parameters = ((permissivist) receiver).getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
                return parameters;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static Collection<competently> nosophobia(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            apical apicalVarAttabal = sanenessVar.attabal(receiver);
            if (apicalVarAttabal instanceof IntegerLiteralTypeConstructor) {
                return ((IntegerLiteralTypeConstructor) apicalVarAttabal).formularize();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean oilcan(saneness sanenessVar, impromptu a, impromptu b) {
            Intrinsics.checkNotNullParameter(a, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            if (!(a instanceof merc)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a + ", " + polloi.saneness(a.getClass())).toString());
            }
            if (b instanceof merc) {
                return ((merc) a).dhss() == ((merc) b).dhss();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b + ", " + polloi.saneness(b.getClass())).toString());
        }

        public static boolean overspeculate(saneness sanenessVar, impromptu impromptuVar) {
            return (impromptuVar instanceof grimness) && sanenessVar.saneness(((grimness) impromptuVar).getOrigin());
        }

        public static boolean peridotite(saneness sanenessVar, presbytery.saneness receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof impromptu) {
                return ((impromptu) receiver).prefect();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean permissivist(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                return TypeUtilsKt.monoploid((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean polder(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman : null;
                return (wiremanVar != null ? wiremanVar.creditor() : null) instanceof gintrap;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static PrimitiveType polloi(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return beachfront.creditor((p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean premeiotic(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                return beachfrontVarWireman != null && beachfront.claque(beachfrontVarWireman);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static List<competently> preprohormone(saneness sanenessVar, formularize receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof clubfoot) {
                List<oilcan> upperBounds = ((clubfoot) receiver).getUpperBounds();
                Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
                return upperBounds;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static impromptu preterite(saneness sanenessVar, impromptu receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                return ((merc) receiver).lampshade(z);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean privatdozent(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return receiver instanceof kattegat;
        }

        public static boolean restrictive(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return ((permissivist) receiver).marial();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently rotuma(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return p002kotlin.reflect.jvm.internal.impl.resolve.beachfront.apical((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static int saneness(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return ((oilcan) receiver).dhss().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean saran(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                return ((merc) receiver).mastfed();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static TypeCheckerState.saneness sayid(saneness sanenessVar, impromptu type) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (type instanceof merc) {
                return new C0707attabal(sanenessVar, cultivated.f31745dern.attabal((oilcan) type).dern());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + polloi.saneness(type.getClass())).toString());
        }

        public static boolean sealless(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return beachfront.lightstruck((permissivist) receiver, kotlin.reflect.jvm.internal.impl.builtins.competently.attabal.f29758saneness);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean seminary(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                return receiver instanceof IntegerLiteralTypeConstructor;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static impromptu sensatory(saneness sanenessVar, marial receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof preprohormone) {
                return ((preprohormone) receiver).immediately();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean splinterproof(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                if (yemenite.attabal((oilcan) receiver)) {
                    return false;
                }
                merc mercVar = (merc) receiver;
                if (mercVar.setterwort().wireman() instanceof overspeculate) {
                    return false;
                }
                return mercVar.setterwort().wireman() != null || (receiver instanceof p002kotlin.reflect.jvm.internal.impl.resolve.calls.inference.attabal) || (receiver instanceof impromptu) || (receiver instanceof triweekly) || (mercVar.setterwort() instanceof IntegerLiteralTypeConstructor) || overspeculate(sanenessVar, receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean starveling(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return nosophobia.formularize((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean stratoscope(saneness sanenessVar, competently receiver, byname.dern fqName) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            if (receiver instanceof oilcan) {
                return ((oilcan) receiver).getAnnotations().restrictive(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean supplicat(saneness sanenessVar, apical receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof permissivist) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = ((permissivist) receiver).wireman();
                p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar = beachfrontVarWireman instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.wireman ? (p002kotlin.reflect.jvm.internal.impl.descriptors.wireman) beachfrontVarWireman : null;
                return (wiremanVar == null || !cuirassed.attabal(wiremanVar) || wiremanVar.getKind() == ClassKind.ENUM_ENTRY || wiremanVar.getKind() == ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static cutely taiyuan(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return TypeUtilsKt.attabal((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static impromptu timberyard(saneness sanenessVar, marial receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof preprohormone) {
                return ((preprohormone) receiver).sakeen();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently treadless(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof empress) {
                return dern.saneness((empress) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static List<cutely> triweekly(saneness sanenessVar, competently receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return ((oilcan) receiver).dhss();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static boolean trm(saneness sanenessVar, formularize receiver, apical apicalVar) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (!(receiver instanceof clubfoot)) {
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
            }
            if (apicalVar == null ? true : apicalVar instanceof permissivist) {
                return TypeUtilsKt.impassible((clubfoot) receiver, (permissivist) apicalVar, null, 4, null);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently underbelly(saneness sanenessVar, competently receiver, boolean z) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof impromptu) {
                return sanenessVar.marial((impromptu) receiver, z);
            }
            if (!(receiver instanceof marial)) {
                throw new IllegalStateException("sealed");
            }
            marial marialVar = (marial) receiver;
            return sanenessVar.oilcan(sanenessVar.marial(sanenessVar.wireman(marialVar), z), sanenessVar.marial(sanenessVar.competently(marialVar), z));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean walach(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof oilcan) {
                return beachfront.igbo((oilcan) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static presbytery.saneness wireman(saneness sanenessVar, impromptu receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof merc) {
                if (receiver instanceof grimness) {
                    return sanenessVar.dern(((grimness) receiver).getOrigin());
                }
                if (receiver instanceof impromptu) {
                    return (impromptu) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + polloi.saneness(receiver.getClass())).toString());
        }

        public static competently yemenite(saneness sanenessVar, List<? extends competently> types) {
            Intrinsics.checkNotNullParameter(types, "types");
            return wireman.attabal(types);
        }
    }

    @Override // presbytery.impassible
    apical attabal(impromptu impromptuVar);

    @Override // presbytery.impassible
    impromptu beachfront(competently competentlyVar);

    @Override // presbytery.impassible
    impromptu competently(marial marialVar);

    @Override // presbytery.impassible
    presbytery.saneness dern(impromptu impromptuVar);

    @Override // presbytery.impassible
    impromptu marial(impromptu impromptuVar, boolean z);

    competently oilcan(impromptu impromptuVar, impromptu impromptuVar2);

    @Override // presbytery.impassible
    boolean saneness(impromptu impromptuVar);

    @Override // presbytery.impassible
    impromptu wireman(marial marialVar);
}
