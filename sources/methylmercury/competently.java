package methylmercury;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p002kotlin.Pair;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.dovishness;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.cultivated;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: util.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class competently {
    public static final List<cultivated> attabal(Collection<? extends oilcan> newValueParameterTypes, Collection<? extends cultivated> oldValueParameters, p002kotlin.reflect.jvm.internal.impl.descriptors.attabal attabalVar) {
        Intrinsics.checkNotNullParameter(newValueParameterTypes, "newValueParameterTypes");
        Intrinsics.checkNotNullParameter(oldValueParameters, "oldValueParameters");
        p002kotlin.reflect.jvm.internal.impl.descriptors.attabal newOwner = attabalVar;
        Intrinsics.checkNotNullParameter(newOwner, "newOwner");
        newValueParameterTypes.size();
        oldValueParameters.size();
        List<Pair> listFastrack = CollectionsKt.fastrack(newValueParameterTypes, oldValueParameters);
        ArrayList arrayList = new ArrayList(dovishness.gintrap(listFastrack, 10));
        for (Pair pair : listFastrack) {
            oilcan oilcanVar = (oilcan) pair.component1();
            cultivated cultivatedVar = (cultivated) pair.component2();
            int index = cultivatedVar.getIndex();
            p002kotlin.reflect.jvm.internal.impl.descriptors.annotations.marial annotations = cultivatedVar.getAnnotations();
            byname.marial name = cultivatedVar.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            boolean zLightstruck = cultivatedVar.lightstruck();
            boolean zCzestochowa = cultivatedVar.czestochowa();
            boolean zSayid = cultivatedVar.sayid();
            oilcan oilcanVarApical = cultivatedVar.wostteth() != null ? DescriptorUtilsKt.arytenoidectomy(newOwner).apical().apical(oilcanVar) : null;
            walach walachVarCompetently = cultivatedVar.competently();
            Intrinsics.checkNotNullExpressionValue(walachVarCompetently, "getSource(...)");
            arrayList.add(new ValueParameterDescriptorImpl(newOwner, null, index, annotations, name, oilcanVar, zLightstruck, zCzestochowa, zSayid, oilcanVarApical, walachVarCompetently));
            newOwner = attabalVar;
        }
        return arrayList;
    }

    public static final LazyJavaStaticClassScope saneness(p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVar) {
        Intrinsics.checkNotNullParameter(wiremanVar, "<this>");
        p002kotlin.reflect.jvm.internal.impl.descriptors.wireman wiremanVarAdultoid = DescriptorUtilsKt.adultoid(wiremanVar);
        if (wiremanVarAdultoid == null) {
            return null;
        }
        MemberScope memberScopeLerp = wiremanVarAdultoid.lerp();
        LazyJavaStaticClassScope lazyJavaStaticClassScope = memberScopeLerp instanceof LazyJavaStaticClassScope ? (LazyJavaStaticClassScope) memberScopeLerp : null;
        return lazyJavaStaticClassScope == null ? saneness(wiremanVarAdultoid) : lazyJavaStaticClassScope;
    }
}
