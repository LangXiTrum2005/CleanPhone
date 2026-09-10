package p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import genesic.attabal;
import genesic.trm;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import p002kotlin.collections.adultoid;
import p002kotlin.collections.polloi;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ReflectJavaWildcardType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class cuirassed extends rotuma implements trm {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Collection<attabal> f30236dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final WildcardType f30237saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final boolean f30238wireman;

    public cuirassed(WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f30237saneness = reflectType;
        this.f30236dern = adultoid.formularize();
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.rotuma
    /* JADX INFO: renamed from: creditor, reason: merged with bridge method [inline-methods] */
    public WildcardType saran() {
        return this.f30237saneness;
    }

    @Override // genesic.wireman
    public Collection<attabal> getAnnotations() {
        return this.f30236dern;
    }

    @Override // genesic.trm
    public boolean merc() {
        Type[] upperBounds = saran().getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return !Intrinsics.wireman(polloi.starveling(upperBounds), Object.class);
    }

    @Override // genesic.trm
    /* JADX INFO: renamed from: privatdozent, reason: merged with bridge method [inline-methods] */
    public rotuma gintrap() {
        Type[] upperBounds = saran().getUpperBounds();
        Type[] lowerBounds = saran().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + saran());
        }
        if (lowerBounds.length == 1) {
            rotuma.attabal attabalVar = rotuma.f30257attabal;
            Intrinsics.beachfront(lowerBounds);
            Object objCzestochowa = polloi.czestochowa(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objCzestochowa, "single(...)");
            return attabalVar.attabal((Type) objCzestochowa);
        }
        if (upperBounds.length == 1) {
            Intrinsics.beachfront(upperBounds);
            Type type = (Type) polloi.czestochowa(upperBounds);
            if (!Intrinsics.wireman(type, Object.class)) {
                rotuma.attabal attabalVar2 = rotuma.f30257attabal;
                Intrinsics.beachfront(type);
                return attabalVar2.attabal(type);
            }
        }
        return null;
    }

    @Override // genesic.wireman
    public boolean stratoscope() {
        return this.f30238wireman;
    }
}
