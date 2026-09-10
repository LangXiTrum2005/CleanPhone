package p002kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.clubfoot;
import p002kotlin.reflect.jvm.internal.impl.descriptors.competently;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: StarProjectionImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class creditor {

    /* JADX INFO: compiled from: StarProjectionImpl.kt */
    public static final class attabal extends cultivated {

        /* JADX INFO: renamed from: wireman, reason: collision with root package name */
        public final /* synthetic */ List<permissivist> f31742wireman;

        /* JADX WARN: Multi-variable type inference failed */
        public attabal(List<? extends permissivist> list) {
            this.f31742wireman = list;
        }

        @Override // p002kotlin.reflect.jvm.internal.impl.types.cultivated
        public timberyard apical(permissivist key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!this.f31742wireman.contains(key)) {
                return null;
            }
            beachfront beachfrontVarWireman = key.wireman();
            Intrinsics.competently(beachfrontVarWireman, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return nosophobia.molybdenite((clubfoot) beachfrontVarWireman);
        }
    }

    public static final oilcan attabal(List<? extends permissivist> list, List<? extends oilcan> list2, p002kotlin.reflect.jvm.internal.impl.builtins.beachfront beachfrontVar) {
        oilcan oilcanVarArytenoidectomy = TypeSubstitutor.competently(new attabal(list)).arytenoidectomy((oilcan) CollectionsKt.lerp(list2), Variance.OUT_VARIANCE);
        if (oilcanVarArytenoidectomy == null) {
            oilcanVarArytenoidectomy = beachfrontVar.preprohormone();
        }
        Intrinsics.beachfront(oilcanVarArytenoidectomy);
        return oilcanVarArytenoidectomy;
    }

    public static final oilcan saneness(clubfoot clubfootVar) {
        Intrinsics.checkNotNullParameter(clubfootVar, "<this>");
        apical apicalVarSaneness = clubfootVar.saneness();
        Intrinsics.checkNotNullExpressionValue(apicalVarSaneness, "getContainingDeclaration(...)");
        if (apicalVarSaneness instanceof competently) {
            List<clubfoot> parameters = ((competently) apicalVarSaneness).impromptu().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List<clubfoot> list = parameters;
            ArrayList arrayList = new ArrayList(dovishness.gintrap(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                permissivist permissivistVarImpromptu = ((clubfoot) it.next()).impromptu();
                Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu, "getTypeConstructor(...)");
                arrayList.add(permissivistVarImpromptu);
            }
            List<oilcan> upperBounds = clubfootVar.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            return attabal(arrayList, upperBounds, DescriptorUtilsKt.cutely(clubfootVar));
        }
        if (!(apicalVarSaneness instanceof p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List<clubfoot> typeParameters = ((p002kotlin.reflect.jvm.internal.impl.descriptors.dovishness) apicalVarSaneness).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        List<clubfoot> list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(dovishness.gintrap(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            permissivist permissivistVarImpromptu2 = ((clubfoot) it2.next()).impromptu();
            Intrinsics.checkNotNullExpressionValue(permissivistVarImpromptu2, "getTypeConstructor(...)");
            arrayList2.add(permissivistVarImpromptu2);
        }
        List<oilcan> upperBounds2 = clubfootVar.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        return attabal(arrayList2, upperBounds2, DescriptorUtilsKt.cutely(clubfootVar));
    }
}
