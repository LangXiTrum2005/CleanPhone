package p002kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kurbash.formularize;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.PropertyReference1Impl;
import p002kotlin.jvm.internal.polloi;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.molybdenite;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.starveling;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.resolve.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.saran;
import p002kotlin.reflect.jvm.internal.impl.types.stratoscope;
import snook.beachfront;
import snook.competently;
import yeast.taiyuan;

/* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeAliasConstructorDescriptorImpl extends kowloon implements sealless {

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name */
    public static final /* synthetic */ formularize<Object>[] f29984overspeculate = {polloi.cutely(new PropertyReference1Impl(polloi.saneness(TypeAliasConstructorDescriptorImpl.class), "withDispatchReceiver", "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"))};

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name */
    public static final attabal f29985splinterproof = new attabal(null);

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name */
    public final yeast.formularize f29986hydrovane;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name */
    public dern f29987mathsort;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name */
    public final taiyuan f29988peridotite;

    /* JADX INFO: renamed from: walach, reason: collision with root package name */
    public final overspeculate f29989walach;

    /* JADX INFO: compiled from: TypeAliasConstructorDescriptor.kt */
    public static final class attabal {
        public /* synthetic */ attabal(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeSubstitutor dern(overspeculate overspeculateVar) {
            if (overspeculateVar.arytenoidectomy() == null) {
                return null;
            }
            return TypeSubstitutor.beachfront(overspeculateVar.trm());
        }

        public final sealless saneness(yeast.formularize storageManager, overspeculate typeAliasDescriptor, dern constructor) {
            dern dernVarDern;
            List<starveling> listFormularize;
            Intrinsics.checkNotNullParameter(storageManager, "storageManager");
            Intrinsics.checkNotNullParameter(typeAliasDescriptor, "typeAliasDescriptor");
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            TypeSubstitutor typeSubstitutorDern = dern(typeAliasDescriptor);
            if (typeSubstitutorDern == null || (dernVarDern = constructor.dern(typeSubstitutorDern)) == null) {
                return null;
            }
            marial annotations = constructor.getAnnotations();
            CallableMemberDescriptor.Kind kind = constructor.getKind();
            Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
            walach walachVarCompetently = typeAliasDescriptor.competently();
            Intrinsics.checkNotNullExpressionValue(walachVarCompetently, "getSource(...)");
            TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = new TypeAliasConstructorDescriptorImpl(storageManager, typeAliasDescriptor, dernVarDern, null, annotations, kind, walachVarCompetently, null);
            List<cultivated> listAttendance = kowloon.attendance(typeAliasConstructorDescriptorImpl, constructor.beachfront(), typeSubstitutorDern);
            if (listAttendance == null) {
                return null;
            }
            merc mercVarDern = stratoscope.dern(dernVarDern.getReturnType().homozygous());
            merc mercVarImpassible = typeAliasDescriptor.impassible();
            Intrinsics.checkNotNullExpressionValue(mercVarImpassible, "getDefaultType(...)");
            merc mercVarCutely = saran.cutely(mercVarDern, mercVarImpassible);
            starveling starvelingVarKattegat = constructor.kattegat();
            starveling starvelingVarTaiyuan = starvelingVarKattegat != null ? wireman.taiyuan(typeAliasConstructorDescriptorImpl, typeSubstitutorDern.triweekly(starvelingVarKattegat.getType(), Variance.INVARIANT), marial.f29950impromptu.saneness()) : null;
            p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarArytenoidectomy = typeAliasDescriptor.arytenoidectomy();
            if (wiremanVarArytenoidectomy != null) {
                List<starveling> listGusty = constructor.gusty();
                Intrinsics.checkNotNullExpressionValue(listGusty, "getContextReceiverParameters(...)");
                List<starveling> list = listGusty;
                listFormularize = new ArrayList<>(dovishness.gintrap(list, 10));
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        adultoid.dovishness();
                    }
                    starveling starvelingVar = (starveling) obj;
                    oilcan oilcanVarTriweekly = typeSubstitutorDern.triweekly(starvelingVar.getType(), Variance.INVARIANT);
                    competently value = starvelingVar.getValue();
                    Intrinsics.competently(value, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver");
                    listFormularize.add(wireman.dern(wiremanVarArytenoidectomy, oilcanVarTriweekly, ((beachfront) value).attabal(), marial.f29950impromptu.saneness(), i));
                    i = i2;
                }
            } else {
                listFormularize = adultoid.formularize();
            }
            typeAliasConstructorDescriptorImpl.libyan(starvelingVarTaiyuan, null, listFormularize, typeAliasDescriptor.triweekly(), listAttendance, mercVarCutely, Modality.FINAL, typeAliasDescriptor.getVisibility());
            return typeAliasConstructorDescriptorImpl;
        }

        public attabal() {
        }
    }

    public /* synthetic */ TypeAliasConstructorDescriptorImpl(yeast.formularize formularizeVar, overspeculate overspeculateVar, dern dernVar, sealless seallessVar, marial marialVar, CallableMemberDescriptor.Kind kind, walach walachVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(formularizeVar, overspeculateVar, dernVar, seallessVar, marialVar, kind, walachVar);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cutely
    public boolean clubfoot() {
        return saran().clubfoot();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely, p002kotlin.reflect.jvm.internal.impl.descriptors.apical
    /* JADX INFO: renamed from: decarock, reason: merged with bridge method [inline-methods] */
    public overspeculate saneness() {
        return liable();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.cutely
    public p002kotlin.reflect.jvm.internal.impl.descriptors.wireman dent() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarDent = saran().dent();
        Intrinsics.checkNotNullExpressionValue(wiremanVarDent, "getConstructedClass(...)");
        return wiremanVarDent;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal
    public oilcan getReturnType() {
        oilcan returnType = super.getReturnType();
        Intrinsics.beachfront(returnType);
        return returnType;
    }

    public overspeculate liable() {
        return this.f29989walach;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon
    /* JADX INFO: renamed from: libya, reason: merged with bridge method [inline-methods] */
    public TypeAliasConstructorDescriptorImpl vesuvio(apical newOwner, p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVar, CallableMemberDescriptor.Kind kind, byname.marial marialVar, marial annotations, walach source) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(source, "source");
        CallableMemberDescriptor.Kind kind2 = CallableMemberDescriptor.Kind.DECLARATION;
        if (kind != kind2) {
            CallableMemberDescriptor.Kind kind3 = CallableMemberDescriptor.Kind.SYNTHESIZED;
        }
        return new TypeAliasConstructorDescriptorImpl(this.f29986hydrovane, liable(), saran(), this, annotations, kind2, source);
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.sealless
    public dern saran() {
        return this.f29987mathsort;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    /* JADX INFO: renamed from: stupefactive, reason: merged with bridge method [inline-methods] */
    public sealless merc(apical newOwner, Modality modality, molybdenite visibility, CallableMemberDescriptor.Kind kind, boolean z) {
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        Intrinsics.checkNotNullParameter(modality, "modality");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        Intrinsics.checkNotNullParameter(kind, "kind");
        p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVarBuild = monoploid().monoploid(newOwner).cutely(modality).impromptu(visibility).polloi(kind).triweekly(z).build();
        Intrinsics.competently(dovishnessVarBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (sealless) dovishnessVarBuild;
    }

    public final yeast.formularize supplicat() {
        return this.f29986hydrovane;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.impl.cutely
    /* JADX INFO: renamed from: tailoring, reason: merged with bridge method [inline-methods] */
    public sealless attabal() {
        p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVarAttabal = super.attabal();
        Intrinsics.competently(dovishnessVarAttabal, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor");
        return (sealless) dovishnessVarAttabal;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.kowloon, p002kotlin.reflect.jvm.internal.impl.descriptors.mathsort
    /* JADX INFO: renamed from: vir, reason: merged with bridge method [inline-methods] */
    public sealless dern(TypeSubstitutor substitutor) {
        Intrinsics.checkNotNullParameter(substitutor, "substitutor");
        p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness dovishnessVarDern = super.dern(substitutor);
        Intrinsics.competently(dovishnessVarDern, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = (TypeAliasConstructorDescriptorImpl) dovishnessVarDern;
        TypeSubstitutor typeSubstitutorBeachfront = TypeSubstitutor.beachfront(typeAliasConstructorDescriptorImpl.getReturnType());
        Intrinsics.checkNotNullExpressionValue(typeSubstitutorBeachfront, "create(...)");
        dern dernVarDern = saran().attabal().dern(typeSubstitutorBeachfront);
        if (dernVarDern == null) {
            return null;
        }
        typeAliasConstructorDescriptorImpl.f29987mathsort = dernVarDern;
        return typeAliasConstructorDescriptorImpl;
    }

    public TypeAliasConstructorDescriptorImpl(yeast.formularize formularizeVar, overspeculate overspeculateVar, final dern dernVar, sealless seallessVar, marial marialVar, CallableMemberDescriptor.Kind kind, walach walachVar) {
        super(overspeculateVar, seallessVar, marialVar, byname.competently.f15245taiyuan, kind, walachVar);
        this.f29986hydrovane = formularizeVar;
        this.f29989walach = overspeculateVar;
        immediately(liable().peridotite());
        this.f29988peridotite = formularizeVar.marial(new Function0<TypeAliasConstructorDescriptorImpl>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public final TypeAliasConstructorDescriptorImpl invoke() {
                yeast.formularize formularizeVarSupplicat = this.this$0.supplicat();
                overspeculate overspeculateVarLiable = this.this$0.liable();
                dern dernVar2 = dernVar;
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.this$0;
                marial annotations = dernVar2.getAnnotations();
                CallableMemberDescriptor.Kind kind2 = dernVar.getKind();
                Intrinsics.checkNotNullExpressionValue(kind2, "getKind(...)");
                walach walachVarCompetently = this.this$0.liable().competently();
                Intrinsics.checkNotNullExpressionValue(walachVarCompetently, "getSource(...)");
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(formularizeVarSupplicat, overspeculateVarLiable, dernVar2, typeAliasConstructorDescriptorImpl, annotations, kind2, walachVarCompetently, null);
                TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = this.this$0;
                dern dernVar3 = dernVar;
                TypeSubstitutor typeSubstitutorDern = TypeAliasConstructorDescriptorImpl.f29985splinterproof.dern(typeAliasConstructorDescriptorImpl3.liable());
                if (typeSubstitutorDern == null) {
                    return null;
                }
                starveling starvelingVarKattegat = dernVar3.kattegat();
                starveling starvelingVarDern = starvelingVarKattegat != null ? starvelingVarKattegat.dern(typeSubstitutorDern) : null;
                List<starveling> listGusty = dernVar3.gusty();
                Intrinsics.checkNotNullExpressionValue(listGusty, "getContextReceiverParameters(...)");
                List<starveling> list = listGusty;
                ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((starveling) it.next()).dern(typeSubstitutorDern));
                }
                typeAliasConstructorDescriptorImpl2.libyan(null, starvelingVarDern, arrayList, typeAliasConstructorDescriptorImpl3.liable().triweekly(), typeAliasConstructorDescriptorImpl3.beachfront(), typeAliasConstructorDescriptorImpl3.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl3.liable().getVisibility());
                return typeAliasConstructorDescriptorImpl2;
            }
        });
        this.f29987mathsort = dernVar;
    }
}
