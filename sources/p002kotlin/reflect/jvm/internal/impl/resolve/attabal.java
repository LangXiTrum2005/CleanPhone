package p002kotlin.reflect.jvm.internal.impl.resolve;

import byname.marial;
import frenchy.saneness;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.beachfront;
import p002kotlin.reflect.jvm.internal.impl.descriptors.overspeculate;
import p002kotlin.reflect.jvm.internal.impl.descriptors.sealless;
import p002kotlin.reflect.jvm.internal.impl.descriptors.wireman;
import p002kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import p002kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import p002kotlin.reflect.jvm.internal.impl.resolve.scopes.impromptu;

/* JADX INFO: compiled from: SealedClassInheritorsProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class attabal extends impassible {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f31303attabal = new attabal();

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.resolve.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class C0699attabal<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return saneness.wireman(DescriptorUtilsKt.formularize((wireman) t).saneness(), DescriptorUtilsKt.formularize((wireman) t2).saneness());
        }
    }

    public static final void saneness(wireman wiremanVar, LinkedHashSet<wireman> linkedHashSet, MemberScope memberScope, boolean z) {
        for (apical apicalVar : impromptu.attabal.attabal(memberScope, p002kotlin.reflect.jvm.internal.impl.resolve.scopes.wireman.f31399graveside, null, 2, null)) {
            if (apicalVar instanceof wireman) {
                wireman wiremanVarArytenoidectomy = (wireman) apicalVar;
                if (wiremanVarArytenoidectomy.coffeecake()) {
                    marial name = wiremanVarArytenoidectomy.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                    beachfront beachfrontVarMarial = memberScope.marial(name, NoLookupLocation.WHEN_GET_ALL_DESCRIPTORS);
                    wiremanVarArytenoidectomy = beachfrontVarMarial instanceof wireman ? (wireman) beachfrontVarMarial : beachfrontVarMarial instanceof overspeculate ? ((overspeculate) beachfrontVarMarial).arytenoidectomy() : null;
                }
                if (wiremanVarArytenoidectomy != null) {
                    if (marial.cord(wiremanVarArytenoidectomy, wiremanVar)) {
                        linkedHashSet.add(wiremanVarArytenoidectomy);
                    }
                    if (z) {
                        MemberScope memberScopePrivatdozent = wiremanVarArytenoidectomy.privatdozent();
                        Intrinsics.checkNotNullExpressionValue(memberScopePrivatdozent, "getUnsubstitutedInnerClassesScope(...)");
                        saneness(wiremanVar, linkedHashSet, memberScopePrivatdozent, z);
                    }
                }
            }
        }
    }

    public Collection<wireman> attabal(wireman sealedClass, boolean z) {
        apical next;
        apical apicalVarSaneness;
        Intrinsics.checkNotNullParameter(sealedClass, "sealedClass");
        if (sealedClass.kowloon() != Modality.SEALED) {
            return adultoid.formularize();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator<apical> it = DescriptorUtilsKt.polloi(sealedClass).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(next instanceof sealless));
            apicalVarSaneness = next;
        } else {
            apicalVarSaneness = sealedClass.saneness();
        }
        if (apicalVarSaneness instanceof sealless) {
            saneness(sealedClass, linkedHashSet, ((sealless) apicalVarSaneness).formularize(), z);
        }
        MemberScope memberScopePrivatdozent = sealedClass.privatdozent();
        Intrinsics.checkNotNullExpressionValue(memberScopePrivatdozent, "getUnsubstitutedInnerClassesScope(...)");
        saneness(sealedClass, linkedHashSet, memberScopePrivatdozent, true);
        return CollectionsKt.setterwort(linkedHashSet, new C0699attabal());
    }
}
