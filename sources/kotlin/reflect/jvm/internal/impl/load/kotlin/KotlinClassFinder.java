package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.KotlinMetadataFinder;

/* JADX INFO: loaded from: classes7.dex */
public interface KotlinClassFinder extends KotlinMetadataFinder {

    public static abstract class Result {

        public static final class ClassFileContent extends Result {
        }

        public static final class KotlinClass extends Result {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ReflectKotlinClass f44009a;

            public KotlinClass(ReflectKotlinClass reflectKotlinClass) {
                this.f44009a = reflectKotlinClass;
            }
        }
    }

    Result.KotlinClass a(ClassId classId, JvmMetadataVersion jvmMetadataVersion);
}
