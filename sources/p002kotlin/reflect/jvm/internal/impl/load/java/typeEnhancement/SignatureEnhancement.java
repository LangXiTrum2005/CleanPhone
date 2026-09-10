package p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.builtins.jvm.dern;
import p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.attabal;
import p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.monoploid;
import p002kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaAnnotationDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.types.empress;
import p002kotlin.reflect.jvm.internal.impl.types.nosophobia;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import p002kotlin.reflect.jvm.internal.impl.types.restrictive;
import p002kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: signatureEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SignatureEnhancement {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final dern f30625attabal;

    public SignatureEnhancement(dern typeEnhancement) {
        Intrinsics.checkNotNullParameter(typeEnhancement, "typeEnhancement");
        this.f30625attabal = typeEnhancement;
    }

    public static /* synthetic */ oilcan marial(SignatureEnhancement signatureEnhancement, taiyuan taiyuanVar, oilcan oilcanVar, List list, apical apicalVar, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            apicalVar = null;
        }
        apical apicalVar2 = apicalVar;
        if ((i & 8) != 0) {
            z = false;
        }
        return signatureEnhancement.dern(taiyuanVar, oilcanVar, list, apicalVar2, z);
    }

    public static /* synthetic */ oilcan wireman(SignatureEnhancement signatureEnhancement, CallableMemberDescriptor callableMemberDescriptor, attabal attabalVar, boolean z, wireman wiremanVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, apical apicalVar, boolean z2, Function1 function1, int i, Object obj) {
        return signatureEnhancement.saneness(callableMemberDescriptor, attabalVar, z, wiremanVar, annotationQualifierApplicabilityType, apicalVar, (i & 32) != 0 ? false : z2, function1);
    }

    public final <D extends CallableMemberDescriptor> marial apical(D d, wireman wiremanVar) {
        beachfront beachfrontVarAttabal = monoploid.attabal(d);
        if (beachfrontVarAttabal == null) {
            return d.getAnnotations();
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptor = beachfrontVarAttabal instanceof LazyJavaClassDescriptor ? (LazyJavaClassDescriptor) beachfrontVarAttabal : null;
        List<genesic.attabal> listLampshade = lazyJavaClassDescriptor != null ? lazyJavaClassDescriptor.lampshade() : null;
        List<genesic.attabal> list = listLampshade;
        if (list == null || list.isEmpty()) {
            return d.getAnnotations();
        }
        List<genesic.attabal> list2 = listLampshade;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new LazyJavaAnnotationDescriptor(wiremanVar, (genesic.attabal) it.next(), true));
        }
        return marial.f29950impromptu.attabal(CollectionsKt.julian(d.getAnnotations(), arrayList));
    }

    public final boolean attabal(oilcan oilcanVar) {
        return nosophobia.dern(oilcanVar, new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$containsFunctionN$1
            @Override // p002kotlin.jvm.functions.Function1
            public final Boolean invoke(empress empressVar) {
                beachfront beachfrontVarWireman = empressVar.setterwort().wireman();
                if (beachfrontVarWireman == null) {
                    return Boolean.FALSE;
                }
                byname.marial name = beachfrontVarWireman.getName();
                dern dernVar = dern.f29852attabal;
                return Boolean.valueOf(Intrinsics.wireman(name, dernVar.impromptu().competently()) && Intrinsics.wireman(DescriptorUtilsKt.impromptu(beachfrontVarWireman), dernVar.impromptu()));
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c0  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01f8, code lost:
    
        if (r3 == null) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <D extends p002kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> D beachfront(D r18, p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman r19) {
        /*
            Method dump skipped, instruction units count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p002kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement.beachfront(kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor, kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman):kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends CallableMemberDescriptor> Collection<D> competently(wireman c, Collection<? extends D> platformSignatures) {
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(platformSignatures, "platformSignatures");
        Collection<? extends D> collection2 = platformSignatures;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(beachfront((CallableMemberDescriptor) it.next(), c));
        }
        return arrayList;
    }

    public final oilcan cutely(CallableMemberDescriptor callableMemberDescriptor, cultivated cultivatedVar, wireman wiremanVar, apical apicalVar, boolean z, Function1<? super CallableMemberDescriptor, ? extends oilcan> function1) {
        wireman wiremanVarImpromptu;
        return saneness(callableMemberDescriptor, cultivatedVar, false, (cultivatedVar == null || (wiremanVarImpromptu = ContextKt.impromptu(wiremanVar, cultivatedVar.getAnnotations())) == null) ? wiremanVar : wiremanVarImpromptu, AnnotationQualifierApplicabilityType.VALUE_PARAMETER, apicalVar, z, function1);
    }

    public final oilcan dern(taiyuan taiyuanVar, oilcan oilcanVar, List<? extends oilcan> list, apical apicalVar, boolean z) {
        return this.f30625attabal.attabal(oilcanVar, taiyuanVar.saneness(oilcanVar, list, apicalVar, z), taiyuanVar.adultoid());
    }

    public final oilcan impromptu(oilcan type, wireman context) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(context, "context");
        oilcan oilcanVarMarial = marial(this, new taiyuan(null, false, context, AnnotationQualifierApplicabilityType.TYPE_USE, true), type, adultoid.formularize(), null, false, 12, null);
        return oilcanVarMarial == null ? type : oilcanVarMarial;
    }

    public final oilcan saneness(CallableMemberDescriptor callableMemberDescriptor, attabal attabalVar, boolean z, wireman wiremanVar, AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType, apical apicalVar, boolean z2, Function1<? super CallableMemberDescriptor, ? extends oilcan> function1) {
        taiyuan taiyuanVar = new taiyuan(attabalVar, z, wiremanVar, annotationQualifierApplicabilityType, false, 16, null);
        oilcan oilcanVarInvoke = function1.invoke(callableMemberDescriptor);
        Collection<? extends CallableMemberDescriptor> collectionWireman = callableMemberDescriptor.wireman();
        Intrinsics.checkNotNullExpressionValue(collectionWireman, "getOverriddenDescriptors(...)");
        Collection<? extends CallableMemberDescriptor> collection2 = collectionWireman;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collection2, 10));
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection2) {
            Intrinsics.beachfront(callableMemberDescriptor2);
            arrayList.add(function1.invoke(callableMemberDescriptor2));
        }
        return dern(taiyuanVar, oilcanVarInvoke, arrayList, apicalVar, z2);
    }

    public final List<oilcan> taiyuan(clubfoot typeParameter, List<? extends oilcan> bounds, wireman context) {
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        Intrinsics.checkNotNullParameter(context, "context");
        List<? extends oilcan> list = bounds;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
        for (oilcan oilcanVarMarial : list) {
            if (!TypeUtilsKt.saneness(oilcanVarMarial, new Function1<empress, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement$enhanceTypeParameterBounds$1$1
                @Override // p002kotlin.jvm.functions.Function1
                public final Boolean invoke(empress it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it instanceof restrictive);
                }
            })) {
                oilcanVarMarial = marial(this, new taiyuan(typeParameter, false, context, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, false, 16, null), oilcanVarMarial, adultoid.formularize(), null, false, 12, null);
                if (oilcanVarMarial == null) {
                    oilcanVarMarial = oilcanVarMarial;
                }
            }
            arrayList.add(oilcanVarMarial);
        }
        return arrayList;
    }
}
