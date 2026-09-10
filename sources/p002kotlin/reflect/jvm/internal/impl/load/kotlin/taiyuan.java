package p002kotlin.reflect.jvm.internal.impl.load.kotlin;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.kowloon;
import p002kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import p002kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;
import prescient.competently;

/* JADX INFO: compiled from: JavaFlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class taiyuan implements kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final taiyuan f30803attabal = new taiyuan();

    @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.kowloon
    public oilcan attabal(ProtoBuf$Type proto, String flexibleId, merc lowerBound, merc upperBound) {
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
        Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
        Intrinsics.checkNotNullParameter(upperBound, "upperBound");
        if (Intrinsics.wireman(flexibleId, "kotlin.jvm.PlatformType")) {
            return proto.hasExtension(JvmProtoBuf.f31027competently) ? new RawTypeImpl(lowerBound, upperBound) : KotlinTypeFactory.wireman(lowerBound, upperBound);
        }
        return competently.wireman(ErrorTypeKind.ERROR_FLEXIBLE_TYPE, flexibleId, lowerBound.toString(), upperBound.toString());
    }
}
