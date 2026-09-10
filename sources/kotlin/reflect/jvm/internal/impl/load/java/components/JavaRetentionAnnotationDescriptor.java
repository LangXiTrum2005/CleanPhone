package kotlin.reflect.jvm.internal.impl.load.java.components;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaEnumValueAnnotationArgument;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaRetentionAnnotationDescriptor extends JavaAnnotationDescriptor {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f43815h;
    public final NotNullLazyValue g;

    static {
        ReflectionFactory reflectionFactory = Reflection.f43333a;
        f43815h = new KProperty[]{reflectionFactory.i(new PropertyReference1Impl(reflectionFactory.b(JavaRetentionAnnotationDescriptor.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaRetentionAnnotationDescriptor(JavaAnnotation annotation, LazyJavaResolverContext c2) {
        super(c2, annotation, StandardNames.FqNames.f43506w);
        Intrinsics.f(annotation, "annotation");
        Intrinsics.f(c2, "c");
        this.g = c2.f43840a.f43824a.a(new Function0<Map<Name, ? extends ConstantValue<?>>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.components.JavaRetentionAnnotationDescriptor$allValueArguments$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.Map] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KotlinRetention kotlinRetention;
                Object obj = JavaAnnotationTargetMapper.f43810a;
                JavaAnnotationArgument javaAnnotationArgument = this.X.d;
                JavaEnumValueAnnotationArgument javaEnumValueAnnotationArgument = javaAnnotationArgument instanceof JavaEnumValueAnnotationArgument ? (JavaEnumValueAnnotationArgument) javaAnnotationArgument : null;
                EnumValue enumValue = (javaEnumValueAnnotationArgument == null || (kotlinRetention = (KotlinRetention) JavaAnnotationTargetMapper.f43811b.get(javaEnumValueAnnotationArgument.e().b())) == null) ? null : new EnumValue(ClassId.j(StandardNames.FqNames.v), Name.g(kotlinRetention.name()));
                Map mapI = enumValue != null ? MapsKt.i(new Pair(JavaAnnotationMapper.f43809c, enumValue)) : null;
                return mapI == null ? EmptyMap.X : mapI;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.JavaAnnotationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map a() {
        return (Map) StorageKt.a(this.g, f43815h[0]);
    }
}
