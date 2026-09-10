package p002kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import genesic.cutely;
import genesic.preprohormone;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p002kotlin.collections.dovishness;
import p002kotlin.collections.graveside;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.apical;
import p002kotlin.reflect.jvm.internal.impl.descriptors.impl.saneness;
import p002kotlin.reflect.jvm.internal.impl.descriptors.walach;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.wireman;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import p002kotlin.reflect.jvm.internal.impl.types.Variance;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: LazyJavaTypeParameterDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class marial extends saneness {

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public final preprohormone f30572preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public final wireman f30573rotuma;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public marial(wireman c, preprohormone javaTypeParameter, int i, apical containingDeclaration) {
        super(c.marial(), containingDeclaration, new LazyJavaAnnotations(c, javaTypeParameter, false, 4, null), javaTypeParameter.getName(), Variance.INVARIANT, false, i, walach.f30274attabal, c.attabal().dovishness());
        Intrinsics.checkNotNullParameter(c, "c");
        Intrinsics.checkNotNullParameter(javaTypeParameter, "javaTypeParameter");
        Intrinsics.checkNotNullParameter(containingDeclaration, "containingDeclaration");
        this.f30573rotuma = c;
        this.f30572preprohormone = javaTypeParameter;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    public void dhss(oilcan type) {
        Intrinsics.checkNotNullParameter(type, "type");
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    public List<oilcan> outmarry(List<? extends oilcan> bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return this.f30573rotuma.attabal().polloi().taiyuan(this, bounds, this.f30573rotuma);
    }

    public final List<oilcan> setterwort() {
        Collection<cutely> upperBounds = this.f30572preprohormone.getUpperBounds();
        if (upperBounds.isEmpty()) {
            merc mercVarTaiyuan = this.f30573rotuma.wireman().apical().taiyuan();
            Intrinsics.checkNotNullExpressionValue(mercVarTaiyuan, "getAnyType(...)");
            merc mercVarRestrictive = this.f30573rotuma.wireman().apical().restrictive();
            Intrinsics.checkNotNullExpressionValue(mercVarRestrictive, "getNullableAnyType(...)");
            return graveside.marial(KotlinTypeFactory.wireman(mercVarTaiyuan, mercVarRestrictive));
        }
        Collection<cutely> collection2 = upperBounds;
        ArrayList arrayList = new ArrayList(dovishness.gintrap(collection2, 10));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f30573rotuma.competently().kowloon((cutely) it.next(), p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.saneness.saneness(TypeUsage.COMMON, false, false, this, 3, null)));
        }
        return arrayList;
    }

    @Override // p002kotlin.reflect.jvm.internal.impl.descriptors.impl.wireman
    public List<oilcan> vesuvio() {
        return setterwort();
    }
}
