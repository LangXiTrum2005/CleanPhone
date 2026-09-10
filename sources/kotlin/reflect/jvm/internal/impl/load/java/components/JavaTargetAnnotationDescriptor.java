package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaArrayAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaTargetAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f43816h;
    public final NotNullLazyValue g;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f43816h = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JavaTargetAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaTargetAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c2) {
        super(c2, annotation, StandardNames.FqNames.t);
        Intrinsics.f(annotation, "annotation");
        Intrinsics.f(c2, "c");
        this.g = c2.f43840a.f43824a.a(new Function0<Map<Name, ? extends ConstantValue<? extends Object>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaTargetAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ArrayValue arrayValueA;
                JavaAnnotationArgument javaAnnotationArgument = this.X.d;
                if (javaAnnotationArgument instanceof JavaArrayAnnotationArgument) {
                    Object obj = JavaAnnotationTargetMapper.f43810a;
                    arrayValueA = JavaAnnotationTargetMapper.a(((JavaArrayAnnotationArgument) javaAnnotationArgument).c());
                } else if (javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument) {
                    Object obj2 = JavaAnnotationTargetMapper.f43810a;
                    arrayValueA = JavaAnnotationTargetMapper.a(CollectionsKt.H(javaAnnotationArgument));
                } else {
                    arrayValueA = null;
                }
                Map mapI = arrayValueA != null ? MapsKt.i(new Pair(JavaAnnotationMapper.f43808b, arrayValueA)) : null;
                return mapI == null ? EmptyMap.X : mapI;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map a() {
        return (Map) StorageKt.a(this.g, f43816h[0]);
    }
}
