package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder;
import kotlin.reflect.jvm.internal.impl.utils.DeserializationHelpersKt;

/* JADX INFO: loaded from: classes7.dex */
public final class JavaClassDataFinder implements ClassDataFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReflectKotlinClassFinder f43995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DeserializedDescriptorResolver f43996b;

    public JavaClassDataFinder(ReflectKotlinClassFinder reflectKotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver) {
        this.f43995a = reflectKotlinClassFinder;
        this.f43996b = deserializedDescriptorResolver;
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassDataFinder
    public final ClassData a(ClassId classId) {
        Intrinsics.f(classId, "classId");
        DeserializedDescriptorResolver deserializedDescriptorResolver = this.f43996b;
        KotlinJvmBinaryClass kotlinJvmBinaryClassA = KotlinClassFinderKt.a(this.f43995a, classId, DeserializationHelpersKt.a(deserializedDescriptorResolver.c().f44393c));
        if (kotlinJvmBinaryClassA == null) {
            return null;
        }
        ReflectClassUtilKt.a(((ReflectKotlinClass) kotlinJvmBinaryClassA).f43673a).equals(classId);
        return deserializedDescriptorResolver.f(kotlinJvmBinaryClassA);
    }
}
