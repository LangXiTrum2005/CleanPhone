package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import java.util.Map;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public final class BuiltInAnnotationDescriptor implements AnnotationDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KotlinBuiltIns f43615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FqName f43616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f43617c;
    public final Object d;

    public BuiltInAnnotationDescriptor(KotlinBuiltIns builtIns, FqName fqName, Map map) {
        Intrinsics.f(builtIns, "builtIns");
        Intrinsics.f(fqName, "fqName");
        this.f43615a = builtIns;
        this.f43616b = fqName;
        this.f43617c = map;
        this.d = LazyKt.a(LazyThreadSafetyMode.f43248Y, new Function0<SimpleType>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor$type$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                BuiltInAnnotationDescriptor builtInAnnotationDescriptor = this.X;
                return builtInAnnotationDescriptor.f43615a.i(builtInAnnotationDescriptor.f43616b).o();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final Map a() {
        return this.f43617c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final FqName c() {
        return this.f43616b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final SourceElement f() {
        return SourceElement.f43591a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor
    public final KotlinType getType() {
        Object x = this.d.getX();
        Intrinsics.e(x, "<get-type>(...)");
        return (KotlinType) x;
    }
}
