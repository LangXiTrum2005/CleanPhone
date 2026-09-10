package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinJvmBinarySourceElement implements DeserializedContainerSource {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KotlinJvmBinaryClass f44011b;

    public KotlinJvmBinarySourceElement(KotlinJvmBinaryClass kotlinJvmBinaryClass, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        this.f44011b = kotlinJvmBinaryClass;
    }

    public final String toString() {
        return "KotlinJvmBinarySourceElement: " + this.f44011b;
    }
}
