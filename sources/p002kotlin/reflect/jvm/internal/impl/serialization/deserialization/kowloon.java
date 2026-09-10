package p002kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import p002kotlin.reflect.jvm.internal.impl.types.merc;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface kowloon {

    /* JADX INFO: compiled from: FlexibleTypeDeserializer.kt */
    public static final class attabal implements kowloon {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final attabal f31608attabal = new attabal();

        @Override // p002kotlin.reflect.jvm.internal.impl.serialization.deserialization.kowloon
        public oilcan attabal(ProtoBuf$Type proto, String flexibleId, merc lowerBound, merc upperBound) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(flexibleId, "flexibleId");
            Intrinsics.checkNotNullParameter(lowerBound, "lowerBound");
            Intrinsics.checkNotNullParameter(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    oilcan attabal(ProtoBuf$Type protoBuf$Type, String str, merc mercVar, merc mercVar2);
}
