package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationConfiguration;

/* JADX INFO: loaded from: classes7.dex */
public final class DeserializationHelpersKt {
    public static final JvmMetadataVersion a(DeserializationConfiguration.Default r1) {
        Intrinsics.f(r1, "<this>");
        return JvmMetadataVersion.g;
    }
}
