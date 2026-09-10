package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorNonRoot;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaTypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameter;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNullable;

/* JADX INFO: loaded from: classes7.dex */
public final class LazyJavaTypeParameterResolver implements TypeParameterResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyJavaResolverContext f43844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeclarationDescriptorNonRoot f43845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43846c;
    public final LinkedHashMap d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MemoizedFunctionToNullable f43847e;

    public LazyJavaTypeParameterResolver(LazyJavaResolverContext c2, DeclarationDescriptorNonRoot declarationDescriptorNonRoot, JavaTypeParameterListOwner typeParameterOwner, int i2) {
        Intrinsics.f(c2, "c");
        Intrinsics.f(typeParameterOwner, "typeParameterOwner");
        this.f43844a = c2;
        this.f43845b = declarationDescriptorNonRoot;
        this.f43846c = i2;
        ArrayList typeParameters = typeParameterOwner.getTypeParameters();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = typeParameters.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i3));
            i3++;
        }
        this.d = linkedHashMap;
        this.f43847e = this.f43844a.f43840a.f43824a.h(new Function1<JavaTypeParameter, LazyJavaTypeParameterDescriptor>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaTypeParameterResolver$resolve$1
            {
                super(1);
            }

            /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                JavaTypeParameter typeParameter = (JavaTypeParameter) obj;
                Intrinsics.f(typeParameter, "typeParameter");
                LazyJavaTypeParameterResolver lazyJavaTypeParameterResolver = this.X;
                Integer num = (Integer) lazyJavaTypeParameterResolver.d.get(typeParameter);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                LazyJavaResolverContext lazyJavaResolverContext = lazyJavaTypeParameterResolver.f43844a;
                Intrinsics.f(lazyJavaResolverContext, "<this>");
                LazyJavaResolverContext lazyJavaResolverContext2 = new LazyJavaResolverContext(lazyJavaResolverContext.f43840a, lazyJavaTypeParameterResolver, lazyJavaResolverContext.f43842c);
                DeclarationDescriptorNonRoot declarationDescriptorNonRoot2 = lazyJavaTypeParameterResolver.f43845b;
                return new LazyJavaTypeParameterDescriptor(ContextKt.b(lazyJavaResolverContext2, declarationDescriptorNonRoot2.getAnnotations()), typeParameter, lazyJavaTypeParameterResolver.f43846c + iIntValue, declarationDescriptorNonRoot2);
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.TypeParameterResolver
    public final TypeParameterDescriptor a(JavaTypeParameter javaTypeParameter) {
        Intrinsics.f(javaTypeParameter, "javaTypeParameter");
        LazyJavaTypeParameterDescriptor lazyJavaTypeParameterDescriptor = (LazyJavaTypeParameterDescriptor) this.f43847e.invoke(javaTypeParameter);
        return lazyJavaTypeParameterDescriptor != null ? lazyJavaTypeParameterDescriptor : this.f43844a.f43841b.a(javaTypeParameter);
    }
}
