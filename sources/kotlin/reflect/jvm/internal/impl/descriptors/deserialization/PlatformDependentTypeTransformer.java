package kotlin.reflect.jvm.internal.impl.descriptors.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public interface PlatformDependentTypeTransformer {

    public static final class None implements PlatformDependentTypeTransformer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f43625a = new None();

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentTypeTransformer
        public final SimpleType a(ClassId classId, SimpleType computedType) {
            Intrinsics.f(computedType, "computedType");
            return computedType;
        }
    }

    SimpleType a(ClassId classId, SimpleType simpleType);
}
