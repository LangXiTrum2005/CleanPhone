package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import lyreflower.marial;
import p002kotlin.NoWhenBranchMatchedException;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.cord;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import p002kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import p002kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import presbytery.apical;
import presbytery.beachfront;
import presbytery.competently;
import presbytery.cutely;
import presbytery.dern;
import presbytery.formularize;
import presbytery.impassible;
import presbytery.impromptu;
import presbytery.monoploid;
import presbytery.saneness;
import presbytery.taiyuan;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AbstractTypeChecker {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final AbstractTypeChecker f31648attabal = new AbstractTypeChecker();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static boolean f31649saneness;

    /* JADX INFO: compiled from: AbstractTypeChecker.kt */
    public /* synthetic */ class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f31650attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public static final /* synthetic */ int[] f31651saneness;

        static {
            int[] iArr = new int[TypeVariance.values().length];
            try {
                iArr[TypeVariance.INV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypeVariance.OUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypeVariance.IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f31650attabal = iArr;
            int[] iArr2 = new int[TypeCheckerState.LowerCapturedTypePolicy.values().length];
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_ONLY_LOWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.CHECK_SUBTYPE_AND_LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TypeCheckerState.LowerCapturedTypePolicy.SKIP_LOWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f31651saneness = iArr2;
        }
    }

    public static final boolean dern(impassible impassibleVar, impromptu impromptuVar) {
        apical apicalVarAttabal = impassibleVar.attabal(impromptuVar);
        if (!(apicalVarAttabal instanceof beachfront)) {
            return false;
        }
        Collection<competently> collectionPolder = impassibleVar.polder(apicalVarAttabal);
        if ((collectionPolder instanceof Collection) && collectionPolder.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionPolder.iterator();
        while (it.hasNext()) {
            impromptu impromptuVarBeachfront = impassibleVar.beachfront((competently) it.next());
            if (impromptuVarBeachfront != null && impassibleVar.igbo(impromptuVarBeachfront)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ boolean graveside(AbstractTypeChecker abstractTypeChecker, TypeCheckerState typeCheckerState, competently competentlyVar, competently competentlyVar2, boolean z, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        return abstractTypeChecker.molybdenite(typeCheckerState, competentlyVar, competentlyVar2, z);
    }

    public static final boolean marial(impassible impassibleVar, TypeCheckerState typeCheckerState, impromptu impromptuVar, impromptu impromptuVar2, boolean z) {
        TypeCheckerState typeCheckerState2;
        impromptu impromptuVar3;
        Collection<competently> collectionYemenite = impassibleVar.yemenite(impromptuVar);
        if ((collectionYemenite instanceof Collection) && collectionYemenite.isEmpty()) {
            return false;
        }
        for (competently competentlyVar : collectionYemenite) {
            if (Intrinsics.wireman(impassibleVar.nosophobia(competentlyVar), impassibleVar.attabal(impromptuVar2))) {
                return true;
            }
            if (z) {
                typeCheckerState2 = typeCheckerState;
                impromptuVar3 = impromptuVar2;
                if (graveside(f31648attabal, typeCheckerState2, impromptuVar3, competentlyVar, false, 8, null)) {
                    return true;
                }
            } else {
                typeCheckerState2 = typeCheckerState;
                impromptuVar3 = impromptuVar2;
            }
            typeCheckerState = typeCheckerState2;
            impromptuVar2 = impromptuVar3;
        }
        return false;
    }

    public static final boolean saneness(impassible impassibleVar, impromptu impromptuVar) {
        if (!(impromptuVar instanceof saneness)) {
            return false;
        }
        cutely cutelyVarPremeiotic = impassibleVar.premeiotic(impassibleVar.trm((saneness) impromptuVar));
        return !impassibleVar.preprohormone(cutelyVarPremeiotic) && impassibleVar.igbo(impassibleVar.julian(impassibleVar.wostteth(cutelyVarPremeiotic)));
    }

    public static final boolean wireman(impassible impassibleVar, impromptu impromptuVar) {
        return impassibleVar.igbo(impromptuVar) || saneness(impassibleVar, impromptuVar);
    }

    public final boolean adultoid(final TypeCheckerState typeCheckerState, impromptu impromptuVar, final impromptu impromptuVar2) {
        boolean z;
        competently competentlyVarWostteth;
        final impassible impassibleVarCutely = typeCheckerState.cutely();
        if (f31649saneness) {
            if (!impassibleVarCutely.saneness(impromptuVar) && !impassibleVarCutely.polloi(impassibleVarCutely.attabal(impromptuVar))) {
                typeCheckerState.formularize(impromptuVar);
            }
            if (!impassibleVarCutely.saneness(impromptuVar2)) {
                typeCheckerState.formularize(impromptuVar2);
            }
        }
        boolean z2 = false;
        if (!dern.f31751attabal.wireman(typeCheckerState, impromptuVar, impromptuVar2)) {
            return false;
        }
        AbstractTypeChecker abstractTypeChecker = f31648attabal;
        Boolean boolAttabal = abstractTypeChecker.attabal(typeCheckerState, impassibleVarCutely.creditor(impromptuVar), impassibleVarCutely.julian(impromptuVar2));
        if (boolAttabal != null) {
            boolean zBooleanValue = boolAttabal.booleanValue();
            TypeCheckerState.wireman(typeCheckerState, impromptuVar, impromptuVar2, false, 4, null);
            return zBooleanValue;
        }
        apical apicalVarAttabal = impassibleVarCutely.attabal(impromptuVar2);
        boolean z3 = true;
        if ((impassibleVarCutely.unconsolidated(impassibleVarCutely.attabal(impromptuVar), apicalVarAttabal) && impassibleVarCutely.supplicat(apicalVarAttabal) == 0) || impassibleVarCutely.timberyard(impassibleVarCutely.attabal(impromptuVar2))) {
            return true;
        }
        List<impromptu> listFormularize = abstractTypeChecker.formularize(typeCheckerState, impromptuVar, apicalVarAttabal);
        int i = 10;
        final ArrayList<impromptu> arrayList = new ArrayList(dovishness.gintrap(listFormularize, 10));
        for (impromptu impromptuVar3 : listFormularize) {
            impromptu impromptuVarBeachfront = impassibleVarCutely.beachfront(typeCheckerState.kowloon(impromptuVar3));
            if (impromptuVarBeachfront != null) {
                impromptuVar3 = impromptuVarBeachfront;
            }
            arrayList.add(impromptuVar3);
        }
        int size = arrayList.size();
        if (size == 0) {
            return f31648attabal.triweekly(typeCheckerState, impromptuVar);
        }
        if (size == 1) {
            return f31648attabal.monoploid(typeCheckerState, impassibleVarCutely.cuirassed((impromptu) CollectionsKt.lerp(arrayList)), impromptuVar2);
        }
        ArgumentList argumentList = new ArgumentList(impassibleVarCutely.supplicat(apicalVarAttabal));
        int iSupplicat = impassibleVarCutely.supplicat(apicalVarAttabal);
        int i2 = 0;
        boolean z4 = false;
        while (i2 < iSupplicat) {
            z4 = (z4 || impassibleVarCutely.sensatory(impassibleVarCutely.saran(apicalVarAttabal, i2)) != TypeVariance.OUT) ? z3 : z2;
            if (z4) {
                z = z3;
            } else {
                ArrayList arrayList2 = new ArrayList(dovishness.gintrap(arrayList, i));
                for (impromptu impromptuVar4 : arrayList) {
                    cutely cutelyVarOverspeculate = impassibleVarCutely.overspeculate(impromptuVar4, i2);
                    if (cutelyVarOverspeculate != null) {
                        boolean z5 = z3;
                        if (impassibleVarCutely.dovishness(cutelyVarOverspeculate) != TypeVariance.INV) {
                            cutelyVarOverspeculate = null;
                        }
                        if (cutelyVarOverspeculate != null && (competentlyVarWostteth = impassibleVarCutely.wostteth(cutelyVarOverspeculate)) != null) {
                            arrayList2.add(competentlyVarWostteth);
                            z3 = z5;
                        }
                    }
                    throw new IllegalStateException(("Incorrect type: " + impromptuVar4 + ", subType: " + impromptuVar + ", superType: " + impromptuVar2).toString());
                }
                z = z3;
                argumentList.add(impassibleVarCutely.outmarry(impassibleVarCutely.lerp(arrayList2)));
            }
            i2++;
            z3 = z;
            z2 = false;
            i = 10;
        }
        return (z4 || !f31648attabal.monoploid(typeCheckerState, argumentList, impromptuVar2)) ? typeCheckerState.monoploid(new Function1<TypeCheckerState.attabal, Unit>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p002kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TypeCheckerState.attabal attabalVar) {
                invoke2(attabalVar);
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TypeCheckerState.attabal runForkingPoint) {
                Intrinsics.checkNotNullParameter(runForkingPoint, "$this$runForkingPoint");
                for (final impromptu impromptuVar5 : arrayList) {
                    final TypeCheckerState typeCheckerState2 = typeCheckerState;
                    final impassible impassibleVar = impassibleVarCutely;
                    final impromptu impromptuVar6 = impromptuVar2;
                    runForkingPoint.attabal(new Function0<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker$isSubtypeOfForSingleClassifierType$1$4.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // p002kotlin.jvm.functions.Function0
                        public final Boolean invoke() {
                            return Boolean.valueOf(AbstractTypeChecker.f31648attabal.monoploid(typeCheckerState2, impassibleVar.cuirassed(impromptuVar5), impromptuVar6));
                        }
                    });
                }
            }
        }) : z3;
    }

    public final boolean apical(TypeCheckerState state, competently a, competently b) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        impassible impassibleVarCutely = state.cutely();
        if (a == b) {
            return true;
        }
        AbstractTypeChecker abstractTypeChecker = f31648attabal;
        if (abstractTypeChecker.kowloon(impassibleVarCutely, a) && abstractTypeChecker.kowloon(impassibleVarCutely, b)) {
            competently competentlyVarKowloon = state.kowloon(state.arytenoidectomy(a));
            competently competentlyVarKowloon2 = state.kowloon(state.arytenoidectomy(b));
            impromptu impromptuVarCreditor = impassibleVarCutely.creditor(competentlyVarKowloon);
            if (!impassibleVarCutely.unconsolidated(impassibleVarCutely.nosophobia(competentlyVarKowloon), impassibleVarCutely.nosophobia(competentlyVarKowloon2))) {
                return false;
            }
            if (impassibleVarCutely.rotuma(impromptuVarCreditor) == 0) {
                return impassibleVarCutely.sealless(competentlyVarKowloon) || impassibleVarCutely.sealless(competentlyVarKowloon2) || impassibleVarCutely.adultoid(impromptuVarCreditor) == impassibleVarCutely.adultoid(impassibleVarCutely.creditor(competentlyVarKowloon2));
            }
        }
        return graveside(abstractTypeChecker, state, a, b, false, 8, null) && graveside(abstractTypeChecker, state, b, a, false, 8, null);
    }

    public final boolean arytenoidectomy(impassible impassibleVar, impromptu impromptuVar, impromptu impromptuVar2) {
        impromptu impromptuVarSeminary;
        impromptu impromptuVarSeminary2;
        dern dernVarCutely = impassibleVar.cutely(impromptuVar);
        if (dernVarCutely == null || (impromptuVarSeminary = impassibleVar.seminary(dernVarCutely)) == null) {
            impromptuVarSeminary = impromptuVar;
        }
        dern dernVarCutely2 = impassibleVar.cutely(impromptuVar2);
        if (dernVarCutely2 == null || (impromptuVarSeminary2 = impassibleVar.seminary(dernVarCutely2)) == null) {
            impromptuVarSeminary2 = impromptuVar2;
        }
        if (impassibleVar.attabal(impromptuVarSeminary) != impassibleVar.attabal(impromptuVarSeminary2)) {
            return false;
        }
        if (impassibleVar.underbelly(impromptuVar) || !impassibleVar.underbelly(impromptuVar2)) {
            return !impassibleVar.adultoid(impromptuVar) || impassibleVar.adultoid(impromptuVar2);
        }
        return false;
    }

    public final Boolean attabal(TypeCheckerState typeCheckerState, impromptu impromptuVar, impromptu impromptuVar2) {
        impassible impassibleVarCutely = typeCheckerState.cutely();
        if (!impassibleVarCutely.igbo(impromptuVar) && !impassibleVarCutely.igbo(impromptuVar2)) {
            return null;
        }
        if (wireman(impassibleVarCutely, impromptuVar) && wireman(impassibleVarCutely, impromptuVar2)) {
            return Boolean.TRUE;
        }
        if (impassibleVarCutely.igbo(impromptuVar)) {
            if (marial(impassibleVarCutely, typeCheckerState, impromptuVar, impromptuVar2, false)) {
                return Boolean.TRUE;
            }
        } else if (impassibleVarCutely.igbo(impromptuVar2) && (dern(impassibleVarCutely, impromptuVar) || marial(impassibleVarCutely, typeCheckerState, impromptuVar2, impromptuVar, true))) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0128  */
    /* JADX WARN: Code duplicated, block: B:83:0x0134  */
    public final Boolean beachfront(TypeCheckerState typeCheckerState, impromptu impromptuVar, impromptu impromptuVar2) {
        impromptu impromptuVarSeminary;
        formularize formularizeVarImpassible;
        impassible impassibleVarCutely = typeCheckerState.cutely();
        boolean z = false;
        if (impassibleVarCutely.dent(impromptuVar) || impassibleVarCutely.dent(impromptuVar2)) {
            if (typeCheckerState.impassible()) {
                return Boolean.TRUE;
            }
            return (!impassibleVarCutely.adultoid(impromptuVar) || impassibleVarCutely.adultoid(impromptuVar2)) ? Boolean.valueOf(wireman.f31827attabal.saneness(impassibleVarCutely, impassibleVarCutely.marial(impromptuVar, false), impassibleVarCutely.marial(impromptuVar2, false))) : Boolean.FALSE;
        }
        if (impassibleVarCutely.hardpan(impromptuVar) && impassibleVarCutely.hardpan(impromptuVar2)) {
            return Boolean.valueOf(f31648attabal.arytenoidectomy(impassibleVarCutely, impromptuVar, impromptuVar2) || typeCheckerState.triweekly());
        }
        if (impassibleVarCutely.technofreak(impromptuVar) || impassibleVarCutely.technofreak(impromptuVar2)) {
            return Boolean.valueOf(typeCheckerState.triweekly());
        }
        dern dernVarCutely = impassibleVarCutely.cutely(impromptuVar2);
        if (dernVarCutely == null || (impromptuVarSeminary = impassibleVarCutely.seminary(dernVarCutely)) == null) {
            impromptuVarSeminary = impromptuVar2;
        }
        saneness sanenessVarDern = impassibleVarCutely.dern(impromptuVarSeminary);
        competently competentlyVarSplinterproof = sanenessVarDern != null ? impassibleVarCutely.splinterproof(sanenessVarDern) : null;
        if (sanenessVarDern != null && competentlyVarSplinterproof != null) {
            if (impassibleVarCutely.adultoid(impromptuVar2)) {
                competentlyVarSplinterproof = impassibleVarCutely.gusty(competentlyVarSplinterproof, true);
            } else if (impassibleVarCutely.underbelly(impromptuVar2)) {
                competentlyVarSplinterproof = impassibleVarCutely.kowloon(competentlyVarSplinterproof);
            }
            competently competentlyVar = competentlyVarSplinterproof;
            int i = attabal.f31651saneness[typeCheckerState.competently(impromptuVar, sanenessVarDern).ordinal()];
            if (i == 1) {
                return Boolean.valueOf(graveside(f31648attabal, typeCheckerState, impromptuVar, competentlyVar, false, 8, null));
            }
            if (i == 2 && graveside(f31648attabal, typeCheckerState, impromptuVar, competentlyVar, false, 8, null)) {
                return Boolean.TRUE;
            }
        }
        apical apicalVarAttabal = impassibleVarCutely.attabal(impromptuVar2);
        if (impassibleVarCutely.polloi(apicalVarAttabal)) {
            impassibleVarCutely.adultoid(impromptuVar2);
            Collection<competently> collectionPolder = impassibleVarCutely.polder(apicalVarAttabal);
            if ((collectionPolder instanceof Collection) && collectionPolder.isEmpty()) {
                z = true;
            } else {
                Iterator<T> it = collectionPolder.iterator();
                while (it.hasNext()) {
                    if (!graveside(f31648attabal, typeCheckerState, impromptuVar, (competently) it.next(), false, 8, null)) {
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
        apical apicalVarAttabal2 = impassibleVarCutely.attabal(impromptuVar);
        if (impromptuVar instanceof saneness) {
            formularizeVarImpassible = f31648attabal.impassible(typeCheckerState.cutely(), impromptuVar2, impromptuVar);
            if (formularizeVarImpassible != null && impassibleVarCutely.czestochowa(formularizeVarImpassible, impassibleVarCutely.attabal(impromptuVar2))) {
                return Boolean.TRUE;
            }
        } else if (impassibleVarCutely.polloi(apicalVarAttabal2)) {
            Collection<competently> collectionPolder2 = impassibleVarCutely.polder(apicalVarAttabal2);
            if ((collectionPolder2 instanceof Collection) && collectionPolder2.isEmpty()) {
                formularizeVarImpassible = f31648attabal.impassible(typeCheckerState.cutely(), impromptuVar2, impromptuVar);
                if (formularizeVarImpassible != null) {
                    return Boolean.TRUE;
                }
            } else {
                Iterator<T> it2 = collectionPolder2.iterator();
                while (it2.hasNext()) {
                    if (!(((competently) it2.next()) instanceof saneness)) {
                    }
                }
                formularizeVarImpassible = f31648attabal.impassible(typeCheckerState.cutely(), impromptuVar2, impromptuVar);
                if (formularizeVarImpassible != null) {
                    return Boolean.TRUE;
                }
            }
        }
        return null;
    }

    public final List<impromptu> competently(TypeCheckerState typeCheckerState, impromptu impromptuVar, apical apicalVar) {
        TypeCheckerState.saneness sanenessVarClubfoot;
        impromptu impromptuVar2 = impromptuVar;
        impassible impassibleVarCutely = typeCheckerState.cutely();
        List<impromptu> listMonoploid = impassibleVarCutely.monoploid(impromptuVar2, apicalVar);
        if (listMonoploid != null) {
            return listMonoploid;
        }
        if (!impassibleVarCutely.triweekly(apicalVar) && impassibleVarCutely.sayid(impromptuVar2)) {
            return adultoid.formularize();
        }
        if (impassibleVarCutely.treadless(apicalVar)) {
            if (!impassibleVarCutely.unconsolidated(impassibleVarCutely.attabal(impromptuVar2), apicalVar)) {
                return adultoid.formularize();
            }
            impromptu impromptuVarLightstruck = impassibleVarCutely.lightstruck(impromptuVar2, CaptureStatus.FOR_SUBTYPING);
            if (impromptuVarLightstruck != null) {
                impromptuVar2 = impromptuVarLightstruck;
            }
            return graveside.marial(impromptuVar2);
        }
        marial marialVar = new marial();
        typeCheckerState.apical();
        ArrayDeque<impromptu> arrayDequeImpromptu = typeCheckerState.impromptu();
        Intrinsics.beachfront(arrayDequeImpromptu);
        Set<impromptu> setTaiyuan = typeCheckerState.taiyuan();
        Intrinsics.beachfront(setTaiyuan);
        arrayDequeImpromptu.push(impromptuVar2);
        while (!arrayDequeImpromptu.isEmpty()) {
            if (setTaiyuan.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + impromptuVar2 + ". Supertypes = " + CollectionsKt.preterite(setTaiyuan, null, null, null, 0, null, null, 63, null)).toString());
            }
            impromptu impromptuVarPop = arrayDequeImpromptu.pop();
            Intrinsics.beachfront(impromptuVarPop);
            if (setTaiyuan.add(impromptuVarPop)) {
                impromptu impromptuVarLightstruck2 = impassibleVarCutely.lightstruck(impromptuVarPop, CaptureStatus.FOR_SUBTYPING);
                if (impromptuVarLightstruck2 == null) {
                    impromptuVarLightstruck2 = impromptuVarPop;
                }
                if (impassibleVarCutely.unconsolidated(impassibleVarCutely.attabal(impromptuVarLightstruck2), apicalVar)) {
                    marialVar.add(impromptuVarLightstruck2);
                    sanenessVarClubfoot = TypeCheckerState.saneness.dern.f31685attabal;
                } else {
                    sanenessVarClubfoot = impassibleVarCutely.rotuma(impromptuVarLightstruck2) == 0 ? TypeCheckerState.saneness.C0706saneness.f31686attabal : typeCheckerState.cutely().clubfoot(impromptuVarLightstruck2);
                }
                if (Intrinsics.wireman(sanenessVarClubfoot, TypeCheckerState.saneness.dern.f31685attabal)) {
                    sanenessVarClubfoot = null;
                }
                if (sanenessVarClubfoot != null) {
                    impassible impassibleVarCutely2 = typeCheckerState.cutely();
                    Iterator<competently> it = impassibleVarCutely2.polder(impassibleVarCutely2.attabal(impromptuVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeImpromptu.add(sanenessVarClubfoot.attabal(typeCheckerState, it.next()));
                    }
                }
            }
        }
        typeCheckerState.marial();
        return marialVar;
    }

    public final TypeVariance cutely(TypeVariance declared, TypeVariance useSite) {
        Intrinsics.checkNotNullParameter(declared, "declared");
        Intrinsics.checkNotNullParameter(useSite, "useSite");
        TypeVariance typeVariance = TypeVariance.INV;
        if (declared == typeVariance) {
            return useSite;
        }
        if (useSite == typeVariance || declared == useSite) {
            return declared;
        }
        return null;
    }

    public final boolean dovishness(impassible impassibleVar, competently competentlyVar, competently competentlyVar2, apical apicalVar) {
        formularize formularizeVarMerc;
        impromptu impromptuVarBeachfront = impassibleVar.beachfront(competentlyVar);
        if (impromptuVarBeachfront instanceof saneness) {
            saneness sanenessVar = (saneness) impromptuVarBeachfront;
            if (impassibleVar.coffeecake(sanenessVar) || !impassibleVar.preprohormone(impassibleVar.premeiotic(impassibleVar.trm(sanenessVar))) || impassibleVar.cultivated(sanenessVar) != CaptureStatus.FOR_SUBTYPING) {
                return false;
            }
            apical apicalVarNosophobia = impassibleVar.nosophobia(competentlyVar2);
            monoploid monoploidVar = apicalVarNosophobia instanceof monoploid ? (monoploid) apicalVarNosophobia : null;
            if (monoploidVar != null && (formularizeVarMerc = impassibleVar.merc(monoploidVar)) != null && impassibleVar.czestochowa(formularizeVarMerc, apicalVar)) {
                return true;
            }
        }
        return false;
    }

    public final List<impromptu> formularize(TypeCheckerState state, impromptu subType, apical superConstructor) {
        TypeCheckerState.saneness sanenessVar;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superConstructor, "superConstructor");
        impassible impassibleVarCutely = state.cutely();
        if (impassibleVarCutely.sayid(subType)) {
            return f31648attabal.impromptu(state, subType, superConstructor);
        }
        if (!impassibleVarCutely.triweekly(superConstructor) && !impassibleVarCutely.cord(superConstructor)) {
            return f31648attabal.competently(state, subType, superConstructor);
        }
        marial<impromptu> marialVar = new marial();
        state.apical();
        ArrayDeque<impromptu> arrayDequeImpromptu = state.impromptu();
        Intrinsics.beachfront(arrayDequeImpromptu);
        Set<impromptu> setTaiyuan = state.taiyuan();
        Intrinsics.beachfront(setTaiyuan);
        arrayDequeImpromptu.push(subType);
        while (!arrayDequeImpromptu.isEmpty()) {
            if (setTaiyuan.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + subType + ". Supertypes = " + CollectionsKt.preterite(setTaiyuan, null, null, null, 0, null, null, 63, null)).toString());
            }
            impromptu impromptuVarPop = arrayDequeImpromptu.pop();
            Intrinsics.beachfront(impromptuVarPop);
            if (setTaiyuan.add(impromptuVarPop)) {
                if (impassibleVarCutely.sayid(impromptuVarPop)) {
                    marialVar.add(impromptuVarPop);
                    sanenessVar = TypeCheckerState.saneness.dern.f31685attabal;
                } else {
                    sanenessVar = TypeCheckerState.saneness.C0706saneness.f31686attabal;
                }
                if (Intrinsics.wireman(sanenessVar, TypeCheckerState.saneness.dern.f31685attabal)) {
                    sanenessVar = null;
                }
                if (sanenessVar != null) {
                    impassible impassibleVarCutely2 = state.cutely();
                    Iterator<competently> it = impassibleVarCutely2.polder(impassibleVarCutely2.attabal(impromptuVarPop)).iterator();
                    while (it.hasNext()) {
                        arrayDequeImpromptu.add(sanenessVar.attabal(state, it.next()));
                    }
                }
            }
        }
        state.marial();
        ArrayList arrayList = new ArrayList();
        for (impromptu impromptuVar : marialVar) {
            AbstractTypeChecker abstractTypeChecker = f31648attabal;
            Intrinsics.beachfront(impromptuVar);
            cord.stratoscope(arrayList, abstractTypeChecker.impromptu(state, impromptuVar, superConstructor));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<impromptu> gintrap(TypeCheckerState typeCheckerState, List<? extends impromptu> list) {
        impassible impassibleVarCutely = typeCheckerState.cutely();
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                taiyuan taiyuanVarCuirassed = impassibleVarCutely.cuirassed((impromptu) obj);
                int iGraveside = impassibleVarCutely.graveside(taiyuanVarCuirassed);
                int i = 0;
                while (true) {
                    if (i >= iGraveside) {
                        arrayList.add(obj);
                        break;
                    }
                    if (impassibleVarCutely.stratoscope(impassibleVarCutely.wostteth(impassibleVarCutely.privatdozent(taiyuanVarCuirassed, i))) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    public final formularize impassible(impassible impassibleVar, competently competentlyVar, competently competentlyVar2) {
        competently competentlyVarWostteth;
        int iRotuma = impassibleVar.rotuma(competentlyVar);
        int i = 0;
        while (true) {
            if (i >= iRotuma) {
                return null;
            }
            cutely cutelyVarPeridotite = impassibleVar.peridotite(competentlyVar, i);
            cutely cutelyVar = impassibleVar.preprohormone(cutelyVarPeridotite) ? null : cutelyVarPeridotite;
            if (cutelyVar != null && (competentlyVarWostteth = impassibleVar.wostteth(cutelyVar)) != null) {
                boolean z = impassibleVar.formularize(impassibleVar.empress(impassibleVar.creditor(competentlyVarWostteth))) && impassibleVar.formularize(impassibleVar.empress(impassibleVar.creditor(competentlyVar2)));
                if (Intrinsics.wireman(competentlyVarWostteth, competentlyVar2) || (z && Intrinsics.wireman(impassibleVar.nosophobia(competentlyVarWostteth), impassibleVar.nosophobia(competentlyVar2)))) {
                    return impassibleVar.saran(impassibleVar.nosophobia(competentlyVar), i);
                }
                formularize formularizeVarImpassible = impassible(impassibleVar, competentlyVarWostteth, competentlyVar2);
                if (formularizeVarImpassible != null) {
                    return formularizeVarImpassible;
                }
            }
            i++;
        }
    }

    public final List<impromptu> impromptu(TypeCheckerState typeCheckerState, impromptu impromptuVar, apical apicalVar) {
        return gintrap(typeCheckerState, competently(typeCheckerState, impromptuVar, apicalVar));
    }

    public final boolean kowloon(impassible impassibleVar, competently competentlyVar) {
        return (!impassibleVar.hydrovane(impassibleVar.nosophobia(competentlyVar)) || impassibleVar.monroe(competentlyVar) || impassibleVar.underbelly(competentlyVar) || impassibleVar.impromptu(competentlyVar) || !Intrinsics.wireman(impassibleVar.attabal(impassibleVar.creditor(competentlyVar)), impassibleVar.attabal(impassibleVar.julian(competentlyVar)))) ? false : true;
    }

    public final boolean molybdenite(TypeCheckerState state, competently subType, competently superType, boolean z) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        if (subType == superType) {
            return true;
        }
        if (state.beachfront(subType, superType)) {
            return taiyuan(state, subType, superType, z);
        }
        return false;
    }

    public final boolean monoploid(TypeCheckerState typeCheckerState, taiyuan capturedSubArguments, impromptu superType) {
        boolean zApical;
        TypeCheckerState typeCheckerState2 = typeCheckerState;
        Intrinsics.checkNotNullParameter(typeCheckerState2, "<this>");
        Intrinsics.checkNotNullParameter(capturedSubArguments, "capturedSubArguments");
        Intrinsics.checkNotNullParameter(superType, "superType");
        impassible impassibleVarCutely = typeCheckerState2.cutely();
        apical apicalVarAttabal = impassibleVarCutely.attabal(superType);
        int iGraveside = impassibleVarCutely.graveside(capturedSubArguments);
        int iSupplicat = impassibleVarCutely.supplicat(apicalVarAttabal);
        if (iGraveside != iSupplicat || iGraveside != impassibleVarCutely.rotuma(superType)) {
            return false;
        }
        for (int i = 0; i < iSupplicat; i++) {
            cutely cutelyVarPeridotite = impassibleVarCutely.peridotite(superType, i);
            if (!impassibleVarCutely.preprohormone(cutelyVarPeridotite)) {
                competently competentlyVarWostteth = impassibleVarCutely.wostteth(cutelyVarPeridotite);
                cutely cutelyVarPrivatdozent = impassibleVarCutely.privatdozent(capturedSubArguments, i);
                impassibleVarCutely.dovishness(cutelyVarPrivatdozent);
                TypeVariance typeVariance = TypeVariance.INV;
                competently competentlyVarWostteth2 = impassibleVarCutely.wostteth(cutelyVarPrivatdozent);
                AbstractTypeChecker abstractTypeChecker = f31648attabal;
                TypeVariance typeVarianceCutely = abstractTypeChecker.cutely(impassibleVarCutely.sensatory(impassibleVarCutely.saran(apicalVarAttabal, i)), impassibleVarCutely.dovishness(cutelyVarPeridotite));
                if (typeVarianceCutely == null) {
                    return typeCheckerState2.impassible();
                }
                if (typeVarianceCutely != typeVariance || (!abstractTypeChecker.dovishness(impassibleVarCutely, competentlyVarWostteth2, competentlyVarWostteth, apicalVarAttabal) && !abstractTypeChecker.dovishness(impassibleVarCutely, competentlyVarWostteth, competentlyVarWostteth2, apicalVarAttabal))) {
                    if (typeCheckerState2.f31674competently > 100) {
                        throw new IllegalStateException(("Arguments depth is too high. Some related argument: " + competentlyVarWostteth2).toString());
                    }
                    typeCheckerState2.f31674competently++;
                    int i2 = attabal.f31650attabal[typeVarianceCutely.ordinal()];
                    if (i2 == 1) {
                        zApical = abstractTypeChecker.apical(typeCheckerState2, competentlyVarWostteth2, competentlyVarWostteth);
                    } else if (i2 == 2) {
                        typeCheckerState2 = typeCheckerState;
                        zApical = graveside(abstractTypeChecker, typeCheckerState2, competentlyVarWostteth2, competentlyVarWostteth, false, 8, null);
                    } else {
                        if (i2 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zApical = graveside(abstractTypeChecker, typeCheckerState2, competentlyVarWostteth, competentlyVarWostteth2, false, 8, null);
                        typeCheckerState2 = typeCheckerState;
                    }
                    typeCheckerState2.f31674competently--;
                    if (!zApical) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean polloi(TypeCheckerState state, competently subType, competently superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return graveside(this, state, subType, superType, false, 8, null);
    }

    public final boolean taiyuan(TypeCheckerState typeCheckerState, competently competentlyVar, competently competentlyVar2, boolean z) {
        impassible impassibleVarCutely = typeCheckerState.cutely();
        competently competentlyVarKowloon = typeCheckerState.kowloon(typeCheckerState.arytenoidectomy(competentlyVar));
        competently competentlyVarKowloon2 = typeCheckerState.kowloon(typeCheckerState.arytenoidectomy(competentlyVar2));
        AbstractTypeChecker abstractTypeChecker = f31648attabal;
        Boolean boolBeachfront = abstractTypeChecker.beachfront(typeCheckerState, impassibleVarCutely.creditor(competentlyVarKowloon), impassibleVarCutely.julian(competentlyVarKowloon2));
        if (boolBeachfront == null) {
            Boolean boolDern = typeCheckerState.dern(competentlyVarKowloon, competentlyVarKowloon2, z);
            return boolDern != null ? boolDern.booleanValue() : abstractTypeChecker.adultoid(typeCheckerState, impassibleVarCutely.creditor(competentlyVarKowloon), impassibleVarCutely.julian(competentlyVarKowloon2));
        }
        boolean zBooleanValue = boolBeachfront.booleanValue();
        typeCheckerState.dern(competentlyVarKowloon, competentlyVarKowloon2, z);
        return zBooleanValue;
    }

    public final boolean triweekly(TypeCheckerState typeCheckerState, impromptu impromptuVar) {
        impassible impassibleVarCutely = typeCheckerState.cutely();
        apical apicalVarAttabal = impassibleVarCutely.attabal(impromptuVar);
        if (impassibleVarCutely.triweekly(apicalVarAttabal)) {
            return impassibleVarCutely.kattegat(apicalVarAttabal);
        }
        if (impassibleVarCutely.kattegat(impassibleVarCutely.attabal(impromptuVar))) {
            return true;
        }
        typeCheckerState.apical();
        ArrayDeque<impromptu> arrayDequeImpromptu = typeCheckerState.impromptu();
        Intrinsics.beachfront(arrayDequeImpromptu);
        Set<impromptu> setTaiyuan = typeCheckerState.taiyuan();
        Intrinsics.beachfront(setTaiyuan);
        arrayDequeImpromptu.push(impromptuVar);
        while (!arrayDequeImpromptu.isEmpty()) {
            if (setTaiyuan.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + impromptuVar + ". Supertypes = " + CollectionsKt.preterite(setTaiyuan, null, null, null, 0, null, null, 63, null)).toString());
            }
            impromptu impromptuVarPop = arrayDequeImpromptu.pop();
            Intrinsics.beachfront(impromptuVarPop);
            if (setTaiyuan.add(impromptuVarPop)) {
                TypeCheckerState.saneness sanenessVar = impassibleVarCutely.sayid(impromptuVarPop) ? TypeCheckerState.saneness.dern.f31685attabal : TypeCheckerState.saneness.C0706saneness.f31686attabal;
                if (Intrinsics.wireman(sanenessVar, TypeCheckerState.saneness.dern.f31685attabal)) {
                    sanenessVar = null;
                }
                if (sanenessVar == null) {
                    continue;
                } else {
                    impassible impassibleVarCutely2 = typeCheckerState.cutely();
                    Iterator<competently> it = impassibleVarCutely2.polder(impassibleVarCutely2.attabal(impromptuVarPop)).iterator();
                    while (it.hasNext()) {
                        impromptu impromptuVarAttabal = sanenessVar.attabal(typeCheckerState, it.next());
                        if (impassibleVarCutely.kattegat(impassibleVarCutely.attabal(impromptuVarAttabal))) {
                            typeCheckerState.marial();
                            return true;
                        }
                        arrayDequeImpromptu.add(impromptuVarAttabal);
                    }
                }
            }
        }
        typeCheckerState.marial();
        return false;
    }
}
