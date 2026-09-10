package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impassible;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.constants.competently;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.saneness;
import patroclinal.taiyuan;

/* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class ValueParameterDescriptorImpl extends supplicat implements cultivated {

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final attabal f29990preprohormone = new attabal(null);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public final boolean f29991adultoid;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public final boolean f29992dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public final oilcan f29993gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public final boolean f29994graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public final int f29995molybdenite;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final cultivated f29996rotuma;

    /* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
    public static final class WithDestructuringDeclaration extends ValueParameterDescriptorImpl {

        /* JADX INFO: renamed from: cord, reason: collision with root package name */
        public final taiyuan f29997cord;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WithDestructuringDeclaration(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal containingDeclaration, cultivated cultivatedVar, int i, marial annotations, byname.marial name, oilcan outType, boolean z, boolean z2, boolean z3, oilcan oilcanVar, walach source, Function0<? extends List<? extends premeiotic>> destructuringVariables) {
            super(containingDeclaration, cultivatedVar, i, annotations, name, outType, z, z2, z3, oilcanVar, source);
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(destructuringVariables, "destructuringVariables");
            this.f29997cord = saneness.saneness(destructuringVariables);
        }

        public final List<premeiotic> attendance() {
            return (List) this.f29997cord.getValue();
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl, p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
        public cultivated empress(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal newOwner, byname.marial newName, int i) {
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            Intrinsics.checkNotNullParameter(newName, "newName");
            marial annotations = getAnnotations();
            Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
            oilcan type = getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            boolean zLightstruck = lightstruck();
            boolean zCzestochowa = czestochowa();
            boolean zSayid = sayid();
            oilcan oilcanVarWostteth = wostteth();
            walach NO_SOURCE = walach.f30274attabal;
            Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
            return new WithDestructuringDeclaration(newOwner, null, i, annotations, newName, type, zLightstruck, zCzestochowa, zSayid, oilcanVarWostteth, NO_SOURCE, new Function0<List<? extends premeiotic>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl$WithDestructuringDeclaration$copy$1
                {
                    super(0);
                }

                @Override // p002kotlin.jvm.functions.Function0
                public final List<? extends premeiotic> invoke() {
                    return this.this$0.attendance();
                }
            });
        }
    }

    /* JADX INFO: compiled from: ValueParameterDescriptorImpl.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ValueParameterDescriptorImpl attabal(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal containingDeclaration, cultivated cultivatedVar, int i, marial annotations, byname.marial name, oilcan outType, boolean z, boolean z2, boolean z3, oilcan oilcanVar, walach source, Function0<? extends List<? extends premeiotic>> function0) {
            Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(outType, "outType");
            Intrinsics.checkNotNullParameter(source, "source");
            return function0 == null ? new ValueParameterDescriptorImpl(containingDeclaration, cultivatedVar, i, annotations, name, outType, z, z2, z3, oilcanVar, source) : new WithDestructuringDeclaration(containingDeclaration, cultivatedVar, i, annotations, name, outType, z, z2, z3, oilcanVar, source, function0);
        }

        public attabal() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ValueParameterDescriptorImpl(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal containingDeclaration, cultivated cultivatedVar, int i, marial annotations, byname.marial name, oilcan outType, boolean z, boolean z2, boolean z3, oilcan oilcanVar, walach source) {
        super(containingDeclaration, annotations, name, outType, source);
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(outType, "outType");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f29995molybdenite = i;
        this.f29994graveside = z;
        this.f29991adultoid = z2;
        this.f29992dovishness = z3;
        this.f29993gintrap = oilcanVar;
        this.f29996rotuma = cultivatedVar == null ? this : cultivatedVar;
    }

    public static final ValueParameterDescriptorImpl vesuvio(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar, cultivated cultivatedVar, int i, marial marialVar, byname.marial marialVar2, oilcan oilcanVar, boolean z, boolean z2, boolean z3, oilcan oilcanVar2, walach walachVar, Function0<? extends List<? extends premeiotic>> function0) {
        return f29990preprohormone.attabal(attabalVar, cultivatedVar, i, marialVar, marialVar2, oilcanVar, z, z2, z3, oilcanVar2, walachVar, function0);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
    public boolean czestochowa() {
        return this.f29991adultoid;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public <R, D> R dovishness(impassible<R, D> visitor, D d) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.beachfront(this, d);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
    public cultivated empress(p002kotlin.reflect.jvm.internal.impl.descriptors.attabal newOwner, byname.marial newName, int i) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(newName, "newName");
        marial annotations = getAnnotations();
        Intrinsics.checkNotNullExpressionValue(annotations, "<get-annotations>(...)");
        oilcan type = getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        boolean zLightstruck = lightstruck();
        boolean zCzestochowa = czestochowa();
        boolean zSayid = sayid();
        oilcan oilcanVarWostteth = wostteth();
        walach NO_SOURCE = walach.f30274attabal;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return new ValueParameterDescriptorImpl(newOwner, null, i, annotations, newName, type, zLightstruck, zCzestochowa, zSayid, oilcanVarWostteth, NO_SOURCE);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
    public int getIndex() {
        return this.f29995molybdenite;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.cord
    public molybdenite getVisibility() {
        molybdenite LOCAL = polloi.f30204beachfront;
        Intrinsics.checkNotNullExpressionValue(LOCAL, "LOCAL");
        return LOCAL;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
    public boolean lightstruck() {
        if (!this.f29994graveside) {
            return false;
        }
        p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVarSaneness = saneness();
        Intrinsics.competently(attabalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
        return ((CallableMemberDescriptor) attabalVarSaneness).getKind().isReal();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic
    public /* bridge */ /* synthetic */ competently lotta() {
        return (competently) setterwort();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.supplicat, p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    /* JADX INFO: renamed from: mastfed, reason: merged with bridge method [inline-methods] */
    public cultivated dern(TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        if (substitutor.apical()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.premeiotic
    public boolean restrictive() {
        return false;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
    public boolean sayid() {
        return this.f29992dovishness;
    }

    public Void setterwort() {
        return null;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.supplicat, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public Collection<cultivated> wireman() {
        Collection<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> collectionWireman = saneness().wireman();
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
        Collection<? extends p002kotlin.reflect.jvm.internal.impl.descriptors.attabal> collection2 = collectionWireman;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(((p002kotlin.reflect.jvm.internal.impl.descriptors.attabal) it.next()).beachfront().get(getIndex()));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated
    public oilcan wostteth() {
        return this.f29993gintrap;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    public p002kotlin.reflect.jvm.internal.impl.descriptors.attabal saneness() {
        apical apicalVarSaneness = super.saneness();
        Intrinsics.competently(apicalVarSaneness, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (p002kotlin.reflect.jvm.internal.impl.descriptors.attabal) apicalVarSaneness;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.supplicat, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    public cultivated attabal() {
        cultivated cultivatedVar = this.f29996rotuma;
        return cultivatedVar == this ? this : cultivatedVar.attabal();
    }
}
