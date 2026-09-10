package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: loaded from: classes7.dex */
public interface FlexibleTypeDeserializer {

    public static final class ThrowException implements FlexibleTypeDeserializer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThrowException f44409a = new ThrowException();

        @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.FlexibleTypeDeserializer
        public final KotlinType a(ProtoBuf.Type proto, String flexibleId, SimpleType lowerBound, SimpleType upperBound) {
            Intrinsics.f(proto, "proto");
            Intrinsics.f(flexibleId, "flexibleId");
            Intrinsics.f(lowerBound, "lowerBound");
            Intrinsics.f(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    KotlinType a(ProtoBuf.Type type, String str, SimpleType simpleType, SimpleType simpleType2);
}
