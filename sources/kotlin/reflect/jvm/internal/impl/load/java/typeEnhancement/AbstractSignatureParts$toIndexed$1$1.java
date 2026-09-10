package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.types.FlexibleType;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;

/* JADX INFO: loaded from: classes7.dex */
final class AbstractSignatureParts$toIndexed$1$1 extends Lambda implements Function1<AbstractSignatureParts.TypeAndDefaultQualifiers, Iterable<? extends AbstractSignatureParts.TypeAndDefaultQualifiers>> {
    public final /* synthetic */ AbstractSignatureParts X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ TypeSystemContext f43917Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(AbstractSignatureParts abstractSignatureParts, TypeSystemContext typeSystemContext) {
        super(1);
        this.X = abstractSignatureParts;
        this.f43917Y = typeSystemContext;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:21:0x0074  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        TypeConstructor typeConstructorO;
        Iterator it;
        ArrayList arrayList;
        TypeArgumentMarker typeArgumentMarker;
        TypeParameterMarker typeParameterMarker;
        boolean zJ;
        JavaTypeQualifiersByElementType javaTypeQualifiersByElementType;
        AbstractSignatureParts.TypeAndDefaultQualifiers typeAndDefaultQualifiers;
        FlexibleType flexibleTypeV;
        AbstractSignatureParts.TypeAndDefaultQualifiers it2 = (AbstractSignatureParts.TypeAndDefaultQualifiers) obj;
        Intrinsics.f(it2, "it");
        AbstractSignatureParts abstractSignatureParts = this.X;
        boolean zH = abstractSignatureParts.h();
        TypeSystemContext typeSystemContext = this.f43917Y;
        KotlinTypeMarker kotlinTypeMarker = it2.f43912a;
        if (zH) {
            if (((kotlinTypeMarker == null || (flexibleTypeV = typeSystemContext.V(kotlinTypeMarker)) == null) ? null : typeSystemContext.Q(flexibleTypeV)) == null) {
                if (kotlinTypeMarker != null) {
                    List listF0 = typeSystemContext.f0(typeConstructorO);
                    List listP = typeSystemContext.p(kotlinTypeMarker);
                    it = listP.iterator();
                    arrayList = new ArrayList(Math.min(CollectionsKt.n(listF0, 10), CollectionsKt.n(listP, 10)));
                    for (Object obj2 : listF0) {
                        typeArgumentMarker = (TypeArgumentMarker) it.next();
                        typeParameterMarker = (TypeParameterMarker) obj2;
                        zJ = typeSystemContext.j(typeArgumentMarker);
                        javaTypeQualifiersByElementType = it2.f43913b;
                        if (zJ) {
                            typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(null, javaTypeQualifiersByElementType, typeParameterMarker);
                        } else {
                            UnwrappedType unwrappedTypeN0 = typeSystemContext.n0(typeArgumentMarker);
                            typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(unwrappedTypeN0, abstractSignatureParts.b().b(javaTypeQualifiersByElementType, abstractSignatureParts.c(unwrappedTypeN0)), typeParameterMarker);
                        }
                        arrayList.add(typeAndDefaultQualifiers);
                    }
                    return arrayList;
                }
            }
        } else if (kotlinTypeMarker != null && (typeConstructorO = typeSystemContext.O(kotlinTypeMarker)) != null) {
            List listF1 = typeSystemContext.f0(typeConstructorO);
            List listP2 = typeSystemContext.p(kotlinTypeMarker);
            it = listP2.iterator();
            arrayList = new ArrayList(Math.min(CollectionsKt.n(listF1, 10), CollectionsKt.n(listP2, 10)));
            while (r5.hasNext() && it.hasNext()) {
                typeArgumentMarker = (TypeArgumentMarker) it.next();
                typeParameterMarker = (TypeParameterMarker) obj2;
                zJ = typeSystemContext.j(typeArgumentMarker);
                javaTypeQualifiersByElementType = it2.f43913b;
                if (zJ) {
                    typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(null, javaTypeQualifiersByElementType, typeParameterMarker);
                } else {
                    UnwrappedType unwrappedTypeN1 = typeSystemContext.n0(typeArgumentMarker);
                    typeAndDefaultQualifiers = new AbstractSignatureParts.TypeAndDefaultQualifiers(unwrappedTypeN1, abstractSignatureParts.b().b(javaTypeQualifiersByElementType, abstractSignatureParts.c(unwrappedTypeN1)), typeParameterMarker);
                }
                arrayList.add(typeAndDefaultQualifiers);
            }
            return arrayList;
        }
        return null;
    }
}
