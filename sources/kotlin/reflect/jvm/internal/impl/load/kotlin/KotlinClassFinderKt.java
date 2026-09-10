package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinClassFinderKt {
    public static final KotlinJvmBinaryClass a(KotlinClassFinder kotlinClassFinder, ClassId classId, JvmMetadataVersion jvmMetadataVersion) {
        Intrinsics.f(kotlinClassFinder, "<this>");
        Intrinsics.f(classId, "classId");
        Intrinsics.f(jvmMetadataVersion, "jvmMetadataVersion");
        KotlinClassFinder.Result.KotlinClass kotlinClassA = kotlinClassFinder.a(classId, jvmMetadataVersion);
        if (kotlinClassA != null) {
            return kotlinClassA.f44009a;
        }
        return null;
    }
}
