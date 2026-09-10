package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.internal.Intrinsics;
import presbytery.apical;
import presbytery.competently;
import presbytery.impassible;
import presbytery.impromptu;
import presbytery.saneness;

/* JADX INFO: compiled from: AbstractTypeChecker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class dern {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final dern f31751attabal = new dern();

    public final boolean attabal(TypeCheckerState typeCheckerState, impromptu type, TypeCheckerState.saneness supertypesPolicy) {
        Intrinsics.checkNotNullParameter(typeCheckerState, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(supertypesPolicy, "supertypesPolicy");
        impassible impassibleVarCutely = typeCheckerState.cutely();
        if ((impassibleVarCutely.sayid(type) && !impassibleVarCutely.adultoid(type)) || impassibleVarCutely.underbelly(type)) {
            return true;
        }
        typeCheckerState.apical();
        ArrayDeque<impromptu> arrayDequeImpromptu = typeCheckerState.impromptu();
        Intrinsics.beachfront(arrayDequeImpromptu);
        Set<impromptu> setTaiyuan = typeCheckerState.taiyuan();
        Intrinsics.beachfront(setTaiyuan);
        arrayDequeImpromptu.push(type);
        while (!arrayDequeImpromptu.isEmpty()) {
            if (setTaiyuan.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + type + ". Supertypes = " + CollectionsKt.preterite(setTaiyuan, null, null, null, 0, null, null, 63, null)).toString());
            }
            impromptu impromptuVarPop = arrayDequeImpromptu.pop();
            Intrinsics.beachfront(impromptuVarPop);
            if (setTaiyuan.add(impromptuVarPop)) {
                TypeCheckerState.saneness sanenessVar = impassibleVarCutely.adultoid(impromptuVarPop) ? TypeCheckerState.saneness.dern.f31685attabal : supertypesPolicy;
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
                        if ((impassibleVarCutely.sayid(impromptuVarAttabal) && !impassibleVarCutely.adultoid(impromptuVarAttabal)) || impassibleVarCutely.underbelly(impromptuVarAttabal)) {
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

    public final boolean dern(TypeCheckerState typeCheckerState, impromptu impromptuVar, apical apicalVar) {
        impassible impassibleVarCutely = typeCheckerState.cutely();
        if (impassibleVarCutely.taiyuan(impromptuVar)) {
            return true;
        }
        if (impassibleVarCutely.adultoid(impromptuVar)) {
            return false;
        }
        if (typeCheckerState.triweekly() && impassibleVarCutely.technofreak(impromptuVar)) {
            return true;
        }
        return impassibleVarCutely.unconsolidated(impassibleVarCutely.attabal(impromptuVar), apicalVar);
    }

    public final boolean marial(TypeCheckerState typeCheckerState, impromptu impromptuVar, impromptu impromptuVar2) {
        impassible impassibleVarCutely = typeCheckerState.cutely();
        if (AbstractTypeChecker.f31649saneness) {
            if (!impassibleVarCutely.saneness(impromptuVar) && !impassibleVarCutely.polloi(impassibleVarCutely.attabal(impromptuVar))) {
                typeCheckerState.formularize(impromptuVar);
            }
            if (!impassibleVarCutely.saneness(impromptuVar2)) {
                typeCheckerState.formularize(impromptuVar2);
            }
        }
        if (impassibleVarCutely.adultoid(impromptuVar2) || impassibleVarCutely.underbelly(impromptuVar) || impassibleVarCutely.impromptu(impromptuVar)) {
            return true;
        }
        if ((impromptuVar instanceof saneness) && impassibleVarCutely.lotta((saneness) impromptuVar)) {
            return true;
        }
        dern dernVar = f31751attabal;
        if (dernVar.attabal(typeCheckerState, impromptuVar, TypeCheckerState.saneness.C0706saneness.f31686attabal)) {
            return true;
        }
        if (impassibleVarCutely.underbelly(impromptuVar2) || dernVar.attabal(typeCheckerState, impromptuVar2, TypeCheckerState.saneness.wireman.f31687attabal) || impassibleVarCutely.sayid(impromptuVar)) {
            return false;
        }
        return dernVar.saneness(typeCheckerState, impromptuVar, impassibleVarCutely.attabal(impromptuVar2));
    }

    public final boolean saneness(TypeCheckerState state, impromptu start, apical end) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        impassible impassibleVarCutely = state.cutely();
        if (f31751attabal.dern(state, start, end)) {
            return true;
        }
        state.apical();
        ArrayDeque<impromptu> arrayDequeImpromptu = state.impromptu();
        Intrinsics.beachfront(arrayDequeImpromptu);
        Set<impromptu> setTaiyuan = state.taiyuan();
        Intrinsics.beachfront(setTaiyuan);
        arrayDequeImpromptu.push(start);
        while (!arrayDequeImpromptu.isEmpty()) {
            if (setTaiyuan.size() > 1000) {
                throw new IllegalStateException(("Too many supertypes for type: " + start + ". Supertypes = " + CollectionsKt.preterite(setTaiyuan, null, null, null, 0, null, null, 63, null)).toString());
            }
            impromptu impromptuVarPop = arrayDequeImpromptu.pop();
            Intrinsics.beachfront(impromptuVarPop);
            if (setTaiyuan.add(impromptuVarPop)) {
                TypeCheckerState.saneness sanenessVar = impassibleVarCutely.adultoid(impromptuVarPop) ? TypeCheckerState.saneness.dern.f31685attabal : TypeCheckerState.saneness.C0706saneness.f31686attabal;
                if (Intrinsics.wireman(sanenessVar, TypeCheckerState.saneness.dern.f31685attabal)) {
                    sanenessVar = null;
                }
                if (sanenessVar == null) {
                    continue;
                } else {
                    impassible impassibleVarCutely2 = state.cutely();
                    Iterator<competently> it = impassibleVarCutely2.polder(impassibleVarCutely2.attabal(impromptuVarPop)).iterator();
                    while (it.hasNext()) {
                        impromptu impromptuVarAttabal = sanenessVar.attabal(state, it.next());
                        if (f31751attabal.dern(state, impromptuVarAttabal, end)) {
                            state.marial();
                            return true;
                        }
                        arrayDequeImpromptu.add(impromptuVarAttabal);
                    }
                }
            }
        }
        state.marial();
        return false;
    }

    public final boolean wireman(TypeCheckerState state, impromptu subType, impromptu superType) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(subType, "subType");
        Intrinsics.checkNotNullParameter(superType, "superType");
        return marial(state, subType, superType);
    }
}
