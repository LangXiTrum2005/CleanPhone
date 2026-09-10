package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractLazyTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.JavaResolverComponents;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClassifierType;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaTypeParameterDescriptor extends AbstractLazyTypeParameterDescriptor {
    public final LazyJavaResolverContext l0;
    public final JavaTypeParameter m0;

    /* JADX WARN: Illegal instructions before constructor call */
    public LazyJavaTypeParameterDescriptor(LazyJavaResolverContext lazyJavaResolverContext, JavaTypeParameter javaTypeParameter, int i2, DeclarationDescriptorNonRoot declarationDescriptorNonRoot) {
        Intrinsics.f(javaTypeParameter, "javaTypeParameter");
        JavaResolverComponents javaResolverComponents = lazyJavaResolverContext.f43840a;
        super(javaResolverComponents.f43824a, declarationDescriptorNonRoot, new LazyJavaAnnotations(lazyJavaResolverContext, javaTypeParameter, false), javaTypeParameter.getName(), Variance.INVARIANT, false, i2, javaResolverComponents.m);
        this.l0 = lazyJavaResolverContext;
        this.m0 = javaTypeParameter;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List F0(List list) {
        LazyJavaResolverContext lazyJavaResolverContext = this.l0;
        return lazyJavaResolverContext.f43840a.r.e(this, list, lazyJavaResolverContext);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final void G0(KotlinType type) {
        Intrinsics.f(type, "type");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractTypeParameterDescriptor
    public final List H0() {
        Collection upperBounds = this.m0.getUpperBounds();
        boolean zIsEmpty = upperBounds.isEmpty();
        LazyJavaResolverContext lazyJavaResolverContext = this.l0;
        if (zIsEmpty) {
            SimpleType simpleTypeE = lazyJavaResolverContext.f43840a.o.e0.e();
            Intrinsics.e(simpleTypeE, "c.module.builtIns.anyType");
            return CollectionsKt.H(KotlinTypeFactory.b(simpleTypeE, lazyJavaResolverContext.f43840a.o.e0.n()));
        }
        Collection collection = upperBounds;
        ArrayList arrayList = new ArrayList(CollectionsKt.n(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(lazyJavaResolverContext.f43843e.d((JavaClassifierType) it.next(), JavaTypeAttributesKt.a(TypeUsage.f44554Y, false, this, 3)));
        }
        return arrayList;
    }
}
