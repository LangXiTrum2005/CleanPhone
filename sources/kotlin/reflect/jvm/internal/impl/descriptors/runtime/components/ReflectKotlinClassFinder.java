package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectKotlinClassFinder implements KotlinClassFinder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f43675a;

    public ReflectKotlinClassFinder(ClassLoader classLoader) {
        this.f43675a = classLoader;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder
    public final KotlinClassFinder.Result.KotlinClass a(ClassId classId, JvmMetadataVersion jvmMetadataVersion) {
        ReflectKotlinClass reflectKotlinClassA;
        Intrinsics.f(classId, "classId");
        Intrinsics.f(jvmMetadataVersion, "jvmMetadataVersion");
        String strH = StringsKt.H(classId.h().b(), '.', '$');
        if (!classId.g().d()) {
            strH = classId.g() + '.' + strH;
        }
        Class clsA = ReflectJavaClassFinderKt.a(this.f43675a, strH);
        if (clsA == null || (reflectKotlinClassA = ReflectKotlinClass.Factory.a(clsA)) == null) {
            return null;
        }
        return new KotlinClassFinder.Result.KotlinClass(reflectKotlinClassA);
    }
}
