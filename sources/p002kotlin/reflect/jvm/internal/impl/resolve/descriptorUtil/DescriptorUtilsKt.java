package p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import byname.dern;
import byname.marial;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lyreflower.saneness;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import p002kotlin.reflect.jvm.internal.impl.builtins.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dent;
import p002kotlin.reflect.jvm.internal.impl.descriptors.gintrap;
import p002kotlin.reflect.jvm.internal.impl.descriptors.grimness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.saran;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.checker.triweekly;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.SequencesKt___SequencesKt;
import p002kotlin.sequences.arytenoidectomy;

/* JADX INFO: compiled from: DescriptorUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f31346attabal;

    /* JADX INFO: compiled from: DescriptorUtils.kt */
    public static final class attabal extends saneness.AbstractC0726saneness<CallableMemberDescriptor, CallableMemberDescriptor> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Ref$ObjectRef<CallableMemberDescriptor> f31347attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public final /* synthetic */ Function1<CallableMemberDescriptor, Boolean> f31348saneness;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(Ref$ObjectRef<CallableMemberDescriptor> ref$ObjectRef, Function1<? super CallableMemberDescriptor, Boolean> function1) {
            this.f31347attabal = ref$ObjectRef;
            this.f31348saneness = function1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // lyreflower.saneness.AbstractC0726saneness, lyreflower.saneness.wireman
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public void attabal(CallableMemberDescriptor current) {
            Intrinsics.checkNotNullParameter(current, "current");
            if (this.f31347attabal.element == null && this.f31348saneness.invoke(current).booleanValue()) {
                this.f31347attabal.element = current;
            }
        }

        @Override // lyreflower.saneness.wireman
        /* JADX INFO: renamed from: marial, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor result() {
            return this.f31347attabal.element;
        }

        @Override // lyreflower.saneness.wireman
        /* JADX INFO: renamed from: wireman, reason: merged with bridge method [inline-methods] */
        public boolean saneness(CallableMemberDescriptor current) {
            Intrinsics.checkNotNullParameter(current, "current");
            return this.f31347attabal.element == null;
        }
    }

    static {
        marial marialVarCutely = marial.cutely("value");
        Intrinsics.checkNotNullExpressionValue(marialVarCutely, "identifier(...)");
        f31346attabal = marialVarCutely;
    }

    public static final wireman adultoid(wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        for (oilcan oilcanVar : wiremanVar.impassible().setterwort().cutely()) {
            if (!beachfront.premeiotic(oilcanVar)) {
                p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = oilcanVar.setterwort().wireman();
                if (p002kotlin.reflect.jvm.internal.impl.resolve.marial.gintrap(beachfrontVarWireman)) {
                    Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (wireman) beachfrontVarWireman;
                }
            }
        }
        return null;
    }

    public static final byname.saneness apical(p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVar) {
        apical apicalVarSaneness;
        byname.saneness sanenessVarApical;
        if (beachfrontVar != null && (apicalVarSaneness = beachfrontVar.saneness()) != null) {
            if (apicalVarSaneness instanceof sealless) {
                return new byname.saneness(((sealless) apicalVarSaneness).marial(), beachfrontVar.getName());
            }
            if ((apicalVarSaneness instanceof competently) && (sanenessVarApical = apical((p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront) apicalVarSaneness)) != null) {
                return sanenessVarApical.wireman(beachfrontVar.getName());
            }
        }
        return null;
    }

    public static final trm arytenoidectomy(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        trm trmVarCompetently = p002kotlin.reflect.jvm.internal.impl.resolve.marial.competently(apicalVar);
        Intrinsics.checkNotNullExpressionValue(trmVarCompetently, "getContainingModule(...)");
        return trmVarCompetently;
    }

    public static /* synthetic */ CallableMemberDescriptor beachfront(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return marial(callableMemberDescriptor, z, function1);
    }

    public static final Iterable competently(boolean z, CallableMemberDescriptor callableMemberDescriptor) {
        if (z) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.attabal() : null;
        }
        Collection<? extends CallableMemberDescriptor> collectionWireman = callableMemberDescriptor != null ? callableMemberDescriptor.wireman() : null;
        return collectionWireman == null ? adultoid.formularize() : collectionWireman;
    }

    public static final beachfront cutely(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return arytenoidectomy(apicalVar).apical();
    }

    public static final boolean dern(cultivated cultivatedVar) {
        Intrinsics.checkNotNullParameter(cultivatedVar, "<this>");
        Boolean boolMarial = saneness.marial(graveside.marial(cultivatedVar), intermigration.attabal.f28937attabal, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(boolMarial, "ifAny(...)");
        return boolMarial.booleanValue();
    }

    public static final boolean dovishness(trm trmVar) {
        p002kotlin.reflect.jvm.internal.impl.types.checker.adultoid adultoidVar;
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        triweekly triweeklyVar = (triweekly) trmVar.hardpan(p002kotlin.reflect.jvm.internal.impl.types.checker.competently.attabal());
        return (triweeklyVar == null || (adultoidVar = (p002kotlin.reflect.jvm.internal.impl.types.checker.adultoid) triweeklyVar.attabal()) == null || !adultoidVar.attabal()) ? false : true;
    }

    public static final dern formularize(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        dern dernVarTriweekly = p002kotlin.reflect.jvm.internal.impl.resolve.marial.triweekly(apicalVar);
        Intrinsics.checkNotNullExpressionValue(dernVarTriweekly, "getFqNameSafe(...)");
        return dernVarTriweekly;
    }

    public static final wireman gintrap(trm trmVar, dern topLevelClassFqName, discontentedly.saneness location) {
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        Intrinsics.checkNotNullParameter(topLevelClassFqName, "topLevelClassFqName");
        Intrinsics.checkNotNullParameter(location, "location");
        topLevelClassFqName.wireman();
        dern dernVarMarial = topLevelClassFqName.marial();
        Intrinsics.checkNotNullExpressionValue(dernVarMarial, "parent(...)");
        MemberScope memberScopeFormularize = trmVar.hydrovane(dernVarMarial).formularize();
        marial marialVarCompetently = topLevelClassFqName.competently();
        Intrinsics.checkNotNullExpressionValue(marialVarCompetently, "shortName(...)");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarMarial = memberScopeFormularize.marial(marialVarCompetently, location);
        if (beachfrontVarMarial instanceof wireman) {
            return (wireman) beachfrontVarMarial;
        }
        return null;
    }

    public static final CallableMemberDescriptor graveside(CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof grimness)) {
            return callableMemberDescriptor;
        }
        saran saranVarStarveling = ((grimness) callableMemberDescriptor).starveling();
        Intrinsics.checkNotNullExpressionValue(saranVarStarveling, "getCorrespondingProperty(...)");
        return saranVarStarveling;
    }

    public static final byname.wireman impassible(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        byname.wireman wiremanVarImpassible = p002kotlin.reflect.jvm.internal.impl.resolve.marial.impassible(apicalVar);
        Intrinsics.checkNotNullExpressionValue(wiremanVarImpassible, "getFqName(...)");
        return wiremanVarImpassible;
    }

    public static final dern impromptu(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        byname.wireman wiremanVarImpassible = impassible(apicalVar);
        if (!wiremanVarImpassible.beachfront()) {
            wiremanVarImpassible = null;
        }
        if (wiremanVarImpassible != null) {
            return wiremanVarImpassible.formularize();
        }
        return null;
    }

    public static final p002kotlin.reflect.jvm.internal.impl.types.checker.beachfront kowloon(trm trmVar) {
        Intrinsics.checkNotNullParameter(trmVar, "<this>");
        triweekly triweeklyVar = (triweekly) trmVar.hardpan(p002kotlin.reflect.jvm.internal.impl.types.checker.competently.attabal());
        p002kotlin.reflect.jvm.internal.impl.types.checker.adultoid adultoidVar = triweeklyVar != null ? (p002kotlin.reflect.jvm.internal.impl.types.checker.adultoid) triweeklyVar.attabal() : null;
        return adultoidVar instanceof kotlin.reflect.jvm.internal.impl.types.checker.adultoid.attabal ? ((kotlin.reflect.jvm.internal.impl.types.checker.adultoid.attabal) adultoidVar).saneness() : kotlin.reflect.jvm.internal.impl.types.checker.beachfront.attabal.f31721attabal;
    }

    public static final CallableMemberDescriptor marial(CallableMemberDescriptor callableMemberDescriptor, boolean z, Function1<? super CallableMemberDescriptor, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return (CallableMemberDescriptor) saneness.saneness(graveside.marial(callableMemberDescriptor), new intermigration.saneness(z), new attabal(new Ref$ObjectRef(), predicate));
    }

    public static final Sequence<apical> molybdenite(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return arytenoidectomy.triweekly(apicalVar, new Function1<apical, apical>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$parentsWithSelf$1
            @Override // p002kotlin.jvm.functions.Function1
            public final apical invoke(apical it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.saneness();
            }
        });
    }

    public static final p002kotlin.reflect.jvm.internal.impl.descriptors.oilcan<merc> monoploid(wireman wiremanVar) {
        dent<merc> dentVarCreditor = wiremanVar != null ? wiremanVar.creditor() : null;
        if (dentVarCreditor instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.oilcan) {
            return (p002kotlin.reflect.jvm.internal.impl.descriptors.oilcan) dentVarCreditor;
        }
        return null;
    }

    public static final Sequence<apical> polloi(apical apicalVar) {
        Intrinsics.checkNotNullParameter(apicalVar, "<this>");
        return SequencesKt___SequencesKt.rotuma(molybdenite(apicalVar), 1);
    }

    public static final wireman taiyuan(p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.dern dernVar) {
        Intrinsics.checkNotNullParameter(dernVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront beachfrontVarWireman = dernVar.getType().setterwort().wireman();
        if (beachfrontVarWireman instanceof wireman) {
            return (wireman) beachfrontVarWireman;
        }
        return null;
    }

    public static final gintrap<merc> triweekly(wireman wiremanVar) {
        dent<merc> dentVarCreditor = wiremanVar != null ? wiremanVar.creditor() : null;
        if (dentVarCreditor instanceof gintrap) {
            return (gintrap) dentVarCreditor;
        }
        return null;
    }

    public static final Iterable wireman(cultivated cultivatedVar) {
        Collection<cultivated> collectionWireman = cultivatedVar.wireman();
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collectionWireman, 10));
        Iterator<T> it = collectionWireman.iterator();
        while (it.hasNext()) {
            arrayList.add(((cultivated) it.next()).attabal());
        }
        return arrayList;
    }
}
